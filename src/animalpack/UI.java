package animalpack;

public class UI {
    public static void main(String[] args) {
        // testing the AnimalManager class
        AnimalManager aMan = new AnimalManager();
        aMan.printAll();
        System.out.println("---------------------------------");
        aMan.sortAnimalsBySpeed();
        aMan.printAll();


    public static void sort(int[] myNums) {
        int count = 0;
            for (int i = 0; i < myNums.length; i++) {
            for (int j = 1; j < myNums.length - i; j++) {
                if (myNums[j - 1] > myNums[j]) {
                    int temp = myNums[j - 1];
                    myNums[j - 1] = myNums[j];
                    myNums[j] = temp;
                    madeSwap = true;
                    count++;
                }
            }
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
