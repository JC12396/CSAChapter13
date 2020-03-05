package practice;

import java.nio.Buffer;
import java.util.Scanner;
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;



public class WriteEmployeeFile {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Path file = Paths.get("C:\\Users\\jc155706\\Desktop\\Java\\Chapter 13\\src\\practice\\File.txt");
        String s = "";
        String delimeter = ",";
        int id;
        String name;
        double payRate;
        final int QUIT = 999;

        try
        {
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));

            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));

            System.out.println("Enter employee ID number >> ");

            id = input.nextInt();

            while(id != QUIT)
            {
                System.out.print("\nEnter employee name for ID #" + id + " >> ");
                input.nextLine();
                name = input.nextLine();

                System.out.print("\nEnter pay >> ");
                payRate = input.nextDouble();

                s = id + delimeter + name + delimeter + payRate;

                writer.write(s, 0, s.length());
                writer.newLine();
                System.out.print("\nEnter next ID number or " + QUIT + " to quit >> ");
                id = input.nextInt();
            }
            writer.close();
        }
        catch(Exception e)
        {
            System.out.println("Message: " + e);
        }



    }
}
