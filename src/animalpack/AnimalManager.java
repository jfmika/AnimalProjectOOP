package animalpack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AnimalManager {
    private Animal[] allAnimals = new Animal[25];
    private int aCounter = 0;

    public AnimalManager() {
        try {
            Scanner f = new Scanner(new File("animal_data.txt"));
            Animal cur = null;
            while (f.hasNextLine()) {
                Scanner line = new Scanner(f.nextLine()).useDelimiter(",");
                if (line.next().equals("A")) {
                    // found animal
                    cur = new Animal(line.next(), line.nextInt());
                } else {
                    // found a bird
                    cur = new Bird(line.next(), line.nextInt()
                            , line.next(), line.nextInt());
                }
                // more coming here
                allAnimals[aCounter] = cur;
                aCounter++;
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }
    }

    // let's display the contents of the array
    public void printAll() {
        for (int i = 0; i < aCounter; i++) {
            System.out.println(allAnimals[i].toString());
        }
    }

    public void sortAnimalsBySpeed() {
        for (int i = 0; i < aCounter; i++) {
            for (int j = 1; j < aCounter - i; j++) {
                if (allAnimals[j - 1].getSpeed() > allAnimals[j].getSpeed()) {
                    Animal temp = allAnimals[j - 1];
                    allAnimals[j - 1] = allAnimals[j];
                    allAnimals[j] = temp;
                }
            }

        }

    }
}
