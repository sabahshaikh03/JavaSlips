/*
 Write a program to accept a file name from command prompt, if the file exits then display
 number of words and lines in that file.
 */

import java.io.*;

public class Slip13 {
    public static void main(String[] args) {

        String path = args[0];

        File fp = new File(path);

        if (!fp.exists()) {
            System.out.println("File does not exists !");
        } else {

            try {
                FileReader fr = new FileReader(path);
                BufferedReader reader = new BufferedReader(fr);

                int noOfLines = 0;
                int noOfWords = 0;
                String wordsArray[] = new String[100];

                String line;

                while ((line = reader.readLine()) != null) {
                    noOfLines++;
                    wordsArray = line.split(" ");
                    noOfWords += wordsArray.length;
                }

                System.out.println("Lines : " + noOfLines);
                System.out.println("Words : " + noOfWords);

                reader.close();

            } catch (FileNotFoundException e) {
                System.out.println("File not found!");
            } catch (IOException e) {
                System.out.println("Something went wrong");
            }

        }

    }
}
