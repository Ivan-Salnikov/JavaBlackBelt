package edu.generics.igra;

public class Test {
    public static void main(String[] args) {

        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Sergey", 12);

        Student student1 = new Student("Petr", 19);
        Student student2 = new Student("Marina", 18);

        Employee employee1 = new Employee("Vasiliy", 29);
        Employee employee2 = new Employee("Kristina", 35);

        Team<Schoolar> team1 = new Team("Oktyabryata");
        team1.addNewParticipant(schoolar1);
        team1.addNewParticipant(schoolar2);

        Team<Student> team2 = new Team("Komsomolci");
        team2.addNewParticipant(student1);
        team2.addNewParticipant(student2);

        Team<Employee> team3 = new Team("Kommunosti");
        team3.addNewParticipant(employee1);
        team3.addNewParticipant(employee2);


        Schoolar schoolar3 = new Schoolar("Evgeniy", 11);
        Schoolar schoolar4 = new Schoolar("Oleg", 10);


        Team<Schoolar> team4 = new Team("Oktyabryata Lenina");
        team4.addNewParticipant(schoolar3);
        team4.addNewParticipant(schoolar4);

        team1.playWith(team4);


    }
}
