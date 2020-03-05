package practice;

import java.nio.Buffer;
import java.util.Scanner;
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class ReadEmployeeFile {

    public static void main(String[] args)
    {
        Path file = Paths.get("C:\\Users\\jc155706\\Desktop\\Java\\Chapter 13\\src\\practice\\File.txt");
        String s = "";

        try
        {
            InputStream input = new BufferedInputStream(Files.newInputStream(file));
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            s = reader.readLine();
            while(s != null)
            {
                System.out.println(s);
                s = reader.readLine();
            }
        }
        catch (Exception e)
        {
            System.out.println("Message: " + e);
        }

    }
}
