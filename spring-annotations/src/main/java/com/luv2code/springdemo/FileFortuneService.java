package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

@Component
public class FileFortuneService implements FortuneService {

    private ArrayList<String> data;
    private Random random = new Random();

    @Override
    public String getFortune() {
        data = getFortuneArrayFromFile("fortunes.txt");
        int index = random.nextInt(data.size());

        return data.get(index);
    }

    private ArrayList<String> getFortuneArrayFromFile(String fileName){
        ArrayList<String> result = new ArrayList<>();
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());
        try(Scanner scanner = new Scanner(file)){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                result.add(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }
}
