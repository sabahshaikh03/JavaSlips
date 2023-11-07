/*
 * Accept the names of two files and copy the contents of the first to the second. First file having
 * Book name and Author name in file. 
*/

import java.io.*;

public class Slip15 {
    public static void main(String[] args) {

        try {
            String path1 = args[0];
            String path2 = args[1];

            File fp1 = new File(path1);

            if (fp1.exists()) {

                BufferedReader reader = new BufferedReader(new FileReader(path1));
                BufferedWriter writer = new BufferedWriter(new FileWriter(path2));

                String line;

                while ((line = reader.readLine()) != null) {
                    writer.write(line);
                    writer.write("\n");
                }

                reader.close();
                writer.close();
            } else {
                throw new FileNotFoundException();
            }

        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }
    }
}
