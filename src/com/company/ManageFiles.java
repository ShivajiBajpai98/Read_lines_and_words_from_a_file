package com.company;

import java.io.*;

public class ManageFiles
{
    public void fileCreate() {
        try {

            String filename = "FileOne.txt";
            String workingDirectory = System.getProperty("user.dir");
            String absoluteFilePath = "";
            //absoluteFilePath = workingDirectory + System.getProperty("file.separator") + filename;
            absoluteFilePath = workingDirectory + File.separator + filename;
            System.out.println("Final filepath : " + absoluteFilePath);
            File file = new File(absoluteFilePath);
            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File is already existed!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    protected void fileWrite()
    {
        try {
            String content = "ATMECS passionate mind";
            File file = new File("FileOne");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    protected void fileRead()
    {
        try (BufferedReader br = new BufferedReader(
                new FileReader("FileOne"))) {

            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    protected void count()
    {
        BufferedReader reader = null;
        int wordCount = 0;
        int lineCount = 0;
        try
        {
            reader = new BufferedReader(new FileReader("file"));
            String currentLine = reader.readLine();
            while (currentLine != null)
            {
                lineCount++;
                String[] words = currentLine.split(" ");
                wordCount = wordCount + words.length;
                currentLine = reader.readLine();
            }
            System.out.println("Number Of Words In A File : "+wordCount);
            System.out.println("Number Of Lines In A File : "+lineCount);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try{
                reader.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
