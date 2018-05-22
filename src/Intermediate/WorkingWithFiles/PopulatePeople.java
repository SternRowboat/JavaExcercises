package Intermediate.WorkingWithFiles;

import java.util.ArrayList;

public class PopulatePeople {
    private ArrayList<Person> people = new ArrayList<>();

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }

    public PopulatePeople() {
        getPeople().add(new Person("Dale","Trainer",23));
        getPeople().add(new Person("George","Trainee",24));
        getPeople().add(new Person("Benny","Trainee",21));
        getPeople().add(new Person("Sam","Trainee",21));
        getPeople().add(new Person("Kate","Trainee",23));
        return ;
    }
}
