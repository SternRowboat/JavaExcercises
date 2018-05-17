package Intermediate;

import java.util.ArrayList;
import java.util.Scanner;

public class People {
    public static void main(String[] args) {
        Users group1 = new Users();

        Scanner sc = new Scanner(System.in);
        System.out.println("Use set of example People? Y/N");
        String useExample = sc.nextLine();

        if ((useExample.equals("y")) || (useExample.equals("Y"))) {
            group1.example();
        } else {
            group1.make();
        }

        group1.print();
        group1.search();
    }
}
    class Person {
        private String name;
        private int age;
        private String jobTitle;

        Person(String name, int age, String jobTitle){
            setName(name);
            setAge(age);
            setJobTitle(jobTitle);
        }

        private void setName(String name){
            this.name = name;
        }
        private void setAge(int age) {
            this.age = age;
        }
        private void setJobTitle(String jobTitle){
            this.jobTitle = jobTitle;
        }
        public String getName() {
            return name;
        }
        @Override
        public String toString() {
            return ("Name is: " + name + "\n" +
                    "Age is: " + age + "\n" +
                    "Job Title is: " + jobTitle + "\n");
        }
    }

    class Users {
    ArrayList<Person> people = new ArrayList<>();

        public void make() {
            Scanner sc = new Scanner(System.in);
            System.out.println("How many new people?");
            int newUsers = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < newUsers; i++) {

                System.out.println("Enter new name:");
                String name = sc.nextLine();

                System.out.println("Enter " + name + "'s age:");
                int age = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter " + name + "'s Job Title:");
                String jobTitle = sc.nextLine();
                people.add(new Person(name, age, jobTitle));
            }
        }
        public void example(){
            people.add(new Person("Rob", 23, "Trainee"));
            people.add(new Person("Dale", 23, "Trainer"));
            people.add(new Person("Benny", 21, "Trainee"));
        }

    public void print(){
        for (Object element: people){
            System.out.println(element);
        }
    }
    public void search(){
        Scanner sc = new Scanner(System.in);
        String searchAgain = "y";
        boolean again=true;
         do {
             System.out.println("Search for user? Y/N");
             searchAgain = sc.nextLine();
             if ((searchAgain.equals("y")) || (searchAgain.equals("Y"))) {
                 System.out.println("Enter Name:");
                 String searchName = sc.nextLine();
                 for (Person element: people) {
                     if (element.getName().toLowerCase().equals((searchName).toLowerCase())) {
                         System.out.println(element);
                         break;
                     } else {
                         System.out.println("No user named" + searchName);
                     }
                 }
             }  else {break;}
         }while (again);
    }
}