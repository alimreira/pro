package com.company;

import java.util.*;

public class FirstTen {
    public static int hold(int[] one, int[] two) {
        for (int i = 0; i < one.length; i++) {
            for (int j = 0; j < two.length; j++) {
                if (one[i] == two[j]) {
                    return one[i];
                }
            }
        }
        return -1;
    }

    //Method to get the intersection of 2 arrays
    public static List<Float> inn(float[] arr, float[] arr1) {
        List<Float> res = new ArrayList<>();
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr.length; ++i) {
                if (arr[i] == arr1[j]) {
                    res.add(arr[i]);
                    break;
                }
            }

        }
        return res;
    }

    public static int hold2(int[] one, int[] two) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < one.length; i++) {
            set.add(one[i]);
        }

        for (int i = 0; i < two.length; i++) {
            if (set.contains(two[i])) {
                return two[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //Intersection of 2 arrays
        int[] arr = {10, 20, 30, 40, 50, 60};
        int[] arr1 = {70, 80, 60, 90, 100};
        System.out.println(hold(arr, arr1));
        System.out.println(hold2(arr, arr1));
        System.out.println(highestValue(arr, arr1));

        List<Character> Sunday= alphabet("The quick brown fox jumps over the lazy dog");
        System.out.println(Sunday);
    }

    public static int highestValue(int[] arr1, int[] arr2) {
        int highest = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                int test = arr1[i] + arr2[j];
                if (highest < test) {
                    highest = test;
                }
            }
        }
        return highest;
    }


    public static List<Character> alphabet(String words) {

//        words = words.replaceAll(" ","");

//       String[] arr = words.split("");
//        List<String> list = new ArrayList<>(Arrays.asList(arr));
//       List<String> hold1 = new ArrayList<>(Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"));
        List<Character> hold = new ArrayList<>();
        char[] test = words.toCharArray();
        char[] test1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        System.out.println(test1.length);
       for(int i = 0; i< test1.length;++i){
            for(int j =0; j< test.length;++j){
                if(!(test[i] == test1[j])){
                    hold.add(test[j]);
                    break;
                }else{
                    hold = Collections.<Character>emptyList();

                }
            }

        }

//       "dsifeogos"
        //hold = {}

       return hold;
        }
    }

