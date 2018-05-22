package Intermediate.WorkingWithFiles;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        PopulatePeople peeps = new PopulatePeople();
        new WriteToFile(peeps.getPeople());
    }
}
