package animalpack;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class UI {
    public static void main(String[] args) {
        // testing the AnimalManager class
        AnimalManager aMan = new AnimalManager();
        aMan.printAll();
        System.out.println("---------------------------------");
        aMan.sortAnimalsBySpeed();
        aMan.printAll();

//        // testing how to sort
//        int[] nums = new int[25];
//        for (int i = 0; i < nums.length; i++){
//            nums[i] = (int)(Math.random() * 90) + 10;
//        }
//        for (int i = 0; i < nums.length; i++){
//            System.out.print(nums[i]);
//            if(i < nums.length - 1){
//                System.out.print(",");
//            }
//        }
//        System.out.println();
//        int[] temp = ;
//        // call sort
//        sort(nums);
//        for (int i = 0; i < nums.length; i++){
//            System.out.print(nums[i]);
//            if(i < nums.length - 1){
//                System.out.print(",");
//            }
//        }
//
//        sortE(temp);
//
//        for (int i = 0; i < temp.length; i++){
//            System.out.print(temp[i]);
//            if(i < temp.length - 1){
//                System.out.print(",");
//            }
//        }

    }

    public static void sort(int[] myNums) {
        int count = 0;
        for (int i = 0; i < myNums.length; i++) {
            boolean madeSwap = false;
            for (int j = 1; j < myNums.length - i; j++) {
                if (myNums[j - 1] > myNums[j]) {
                    int temp = myNums[j - 1];
                    myNums[j - 1] = myNums[j];
                    myNums[j] = temp;
                    madeSwap = true;
                    count++;
                }
            }
//            if(!madeSwap){
//                break;
//            }
        }
        System.out.println("[" + count + "]");

    }

    public static void sortE(int[] myNums) {
        int count = 0;
        for (int i = 0; i < myNums.length; i++) {
            boolean madeSwap = false;
            for (int j = 1; j < myNums.length - i; j++) {
                if (myNums[j - 1] > myNums[j]) {
                    int temp = myNums[j - 1];
                    myNums[j - 1] = myNums[j];
                    myNums[j] = temp;
                    madeSwap = true;
                    count++;
                }
            }
            if (!madeSwap) {
                break;
            }
        }
        System.out.println("[" + count + "]");

    }
}
