package Intermediate.WorkingWithFiles;

import java.io.*;
import java.util.ArrayList;

public class WriteToFile {
    String fileLoc = "people.txt";

    public WriteToFile(ArrayList<Person> people) throws IOException {
        File file = new File( "people.txt" );
        file.delete();
        file.createNewFile();

        for (Person person: people){
            try {
                WriteFile( fileLoc,person );
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            ReadFile(fileLoc);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void WriteFile(String outFile, Person person) throws IOException {

        BufferedWriter bfwOut = new BufferedWriter(new FileWriter(outFile,true));
        String line = person.getName() + " | " + person.getOccupation() + " | " + person.getAge();
        bfwOut.append(line + "\n");
        System.out.println(line);
        bfwOut.close();

    }

    public static void ReadFile(String inFile) throws IOException {
        ArrayList<Person> peopleOut = new ArrayList<>();
        BufferedReader bfrIn = new BufferedReader(new FileReader(inFile));
        String line = "";

        while ((line = bfrIn.readLine()) != null) {
            String[] parts = line.split("\\s{1}\\|{1}\\s{1}");
            peopleOut.add(new Person(parts[0],parts[1],Integer.parseInt( parts[2] )));
        }
        for (Person person3: peopleOut){

            System.out.println(person3.getName() + " , " + person3.getOccupation() + " , " + person3.getAge());
        }
        bfrIn.close();
    }


}
