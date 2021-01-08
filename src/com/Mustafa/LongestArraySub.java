package com.Mustafa;


import java.util.ArrayList;


public class LongestArraySub {
    //1- Check if it is only one item return 0
    public int lengthOfLIS(ArrayList arrayList) {
        if (arrayList.size() == 0) {
            System.out.println("Longest Increasing Subsequence is :"+0);
            return 0;
        }

//2- More than one
//            a-get the size
        int size = arrayList.size();

//            b-new AL same size 
        ArrayList<Integer> newArraylist = new ArrayList<Integer>();
        for (int x = 0; x < size; x++) {
            newArraylist.add(0);
        }


        newArraylist.add(0, 1);
        int maximum = 1;

        int newsize = (newArraylist.size()) - 1;

//        c- First Loop
        for (int i = 1; i < newsize; i++) {
            int newValueMax = 0;

//        d-2nd Loop
            for (int j = 0; j < i; j++) {

//        e- Comparing values
                if ((int) arrayList.get(i) > (int) arrayList.get(j)) {
                    newValueMax = Math.max(newValueMax, newArraylist.get(j));
                }
            }
//         f-
            newArraylist.add(i, newValueMax + 1);
//
            maximum = Math.max(maximum, newArraylist.get(i));

        }
        System.out.println("Longest Increasing Subsequence is :"+maximum);
        return maximum;
    }

}
