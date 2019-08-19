package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MergeController {

    @RequestMapping("/merge")
    public ArrayList<Integer> greeting(@RequestParam List<Integer> a1, @RequestParam List<Integer> a2) {
        return mergeArrays(a1, a2);
    }

    private static ArrayList<Integer> mergeArrays(List<Integer> a1, List<Integer> a2) {
        int a1Length = a1.size();
        int a2Length = a2.size();
        int i = 0;
        int j = 0;

        ArrayList<Integer> output = new ArrayList<>();

        while (i < a1Length && j < a2Length) {
            int a1Num = a1.get(i);
            int a2Num = a2.get(j);

            if (a1Num < a2Num) {
                addUniqueNum(output, a1Num);
                i++;
            } else {
                addUniqueNum(output, a2Num);
                j++;
            }
        }

        // Add leftover elements from first array (if not already added to output).
        while (i < a1Length) {
            int a1Leftover = a1.get(i++);
            addUniqueNum(output, a1Leftover);
        }

        // Add leftover elements from second array (if not already added to output).
        while (j < a2Length) {
            int a2Leftover = a2.get(j++);
            addUniqueNum(output, a2Leftover);
        }

        return output;
    }

    private static void addUniqueNum(ArrayList<Integer> output, int newNum) {
        if (!output.contains(newNum)) {
            output.add(newNum);
        }
    }
}