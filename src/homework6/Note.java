package homework6;


import helper.FileHelper;

import java.io.*;
import java.util.Scanner;

public class Note {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        while(true) {
            System.out.println("1. Write in file");
            System.out.println("2. Read from file");
            System.out.println("3. Exit");
            int chose = sc.nextInt();
            if(chose == 1){
                write();
            }
            else if(chose == 2){
                read();
            }
            else if(chose == 3){
                return;
            }
        }
    }

    public static void read() throws IOException {
        System.out.println("Enter path to file");
        String path = sc.next();
        FileInputStream inFile = new FileInputStream(path);
        byte[] str = new byte[inFile.available()];
        inFile.read(str);
        System.out.println(new String(str));
    }


    public static void write() throws IOException {
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        File file = null;
        while (true)
        {
            System.out.println("Enter path to file");
            String filePath = bufferedReader.readLine();
            file = new File(filePath);
            if (file.exists()) {
                break;
            }
        }
        System.out.println("Enter text");
        String line = bufferedReader.readLine();
        StringBuilder builder = new StringBuilder();
        while (!line.isEmpty())
        {
            builder.append(line);
            line = bufferedReader.readLine();
        }
        FileHelper.writeToFile(file, builder.toString());
    }
}
