package com.company.firstFive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Wednesday {
    public static void main(String[] args) {
        int [] arr = {1, -5, 12, -6, 3, 7};
        int [] arr1 = {11, -12,20, 21, -31, 40,41,51,-60,61};
        int hold = sum(arr);
        System.out.println(hold);

        int held = average(arr);
        System.out.println(held);

        int test = odd(arr);
        System.out.println(test);

        int test1 = even(arr);
        System.out.println(test1);

        int x = -7;
        System.out.println(Math.abs(x));
        System.out.println(x);

        int test2 = oddIndex(arr);
        System.out.println(test2);

        int test3 = evenIndex(arr);
        System.out.println(test3);

        int test4 = oddIndexOddValue(arr);
        System.out.println(test4);

        int test5 = oddIndexEvenValue(arr1);
        System.out.println(test5);

        int test6 = evenIndexOddValue(arr1);
        System.out.println(test6);
        int addAndMultiply = addAndMultiply(arr);
        System.out.println(addAndMultiply);
        int addAndMultiply1 = addAndMultiply1(arr);
        System.out.println(addAndMultiply1);
        System.out.println(addMultiply2(arr));
        int z = 5;
        int y = 6 + z--;
        System.out.println("value of y:" + y);
        System.out.println("z:" + z);
        System.out.println("pre decrement:" + --z);
        int[] num = {3,1,5,2};
        System.out.println(missing(num));

    }

    public static int sum(int[] array){
        int sum = 0;
        for(int i = 0; i< array.length; ++i){
            sum += array[i];
        }
        return sum;
    }

    public static int average(int[] arr){
        int sum = 0;
        for(int i = 0; i< arr.length; ++i){
            sum += arr[i];
        }
        int test = arr.length;
        return sum / test;
    }

    public static int odd(int[] arr){
        int odd = 0;
        for(int i = 0; i< arr.length; ++i){
           if(Math.abs(arr[i]) % 2 == 1){
               odd += arr[i];
           }
        }
        return odd;
    }

    public static int even(int[] arr){
        int even = 0;
        for(int i = 0; i< arr.length; ++i){
            if(arr[i] % 2 == 0){
                even += arr[i];
            }
        }
        return even;
    }

    public static int oddIndex(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; ++i){
            if(i% 2 == 1){
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int evenIndex(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; ++i){
            if(i% 2 == 0){
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int oddIndexOddValue(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; ++i){
            if(i% 2 == 1 && Math.abs(arr[i]) % 2 == 1){
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int oddIndexEvenValue(int[] array){
        int sum = 0;
        for(int i = 0; i< array.length; ++i){
            if(i % 2 == 1 && array[i]% 2 ==0){
                sum += array[i];
            }
        }
        return sum;
    }

    public static int evenIndexOddValue(int[] array){
        int sum = 0;
        for(int i = 0; i<array.length; ++i){
            if(i % 2==0 && array[i]%2==1){
               return sum += Math.abs(array[i]);
            }
        }
        return -1;
    }

    public static int addAndMultiply(int[] arr){
        int res = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(i % 2 == 1){
                res += arr[i];
            }else{
                res *= arr[i];
            }
        }
        return res;
    }

    public static int addAndMultiply1(int[] arr){
        int res = 1;
        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 1){
                res += arr[i];
            }else{
                res *= arr[i];
            }
        }
        return res;
    }

    public static int addMultiply2(int[] arr){
        int res = 0;
        for(int  i = 0; i < arr.length; ++i){
            if(i % 2 == 0){
                res += arr[i];
            }else{
                res *= arr[i];
            }
        }
        return res;
    }

    //Find the missing number in an array
    public static int missing(int[] arr){
        List<Integer> one = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            one.add(arr[i]);
        }
        Collections.sort(one);
        System.out.println(one);
        for(int i = 1; i <= one.size(); i++){
            if(i != one.get(i - 1)){
                return i;
            }
        }
        return -1;
//       Collections.sort(one);
    }


}
