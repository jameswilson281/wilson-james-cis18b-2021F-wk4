package wilson.james;

import animal.Animal;
import animal.carnivore.Lion;
import animal.herbivore.Giraffe;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Array;
import java.text.MessageFormat;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        List<String> names = null;
        var animalList = new ArrayList<Animal>();

        try
        {
            names = Files.readAllLines(Paths.get("D:\\Users\\James\\IdeaProjects\\Test\\src\\names.txt"));

        } catch (IOException e) {
            System.out.println("Error reading file");
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println(("How many Giraffes? "));
        int index = scanner.nextInt();

        for(int i=0; i < index; i++)
        {
            animalList.add(new Giraffe(names.get(i)));
        }

        System.out.println(("How many Lions? "));
        int lionsCount = scanner.nextInt();

        for(int i=0; i < lionsCount; i++)
        {
            animalList.add(new Lion(names.get(i)));
        }

        try(var outFile = new PrintWriter("D:\\Users\\James\\IdeaProjects\\Test\\src\\output.txt"))
        {
            for(Animal thisAnimal : animalList){
                outFile.println(MessageFormat.format("{0} is a {1}", thisAnimal.getName(), thisAnimal.getType()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
