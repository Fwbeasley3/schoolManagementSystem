package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //TODO: Create a text user interface to add students , teachers, and payment functions

        Teacher sarah = new Teacher("Sarah", 500);
        Teacher melissa = new Teacher("Melissa", 700);
        Teacher tom = new Teacher("Tom",600);

        List<Teacher> listOfTeachers = new ArrayList<>();
        listOfTeachers.add(sarah);
        listOfTeachers.add(melissa);
        listOfTeachers.add(tom);

        Student vino = new Student("Vino", 4);
        Student kaden = new Student("Kaden", 5);
        Student winnie = new Student("Winifred",2);

        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(vino);
        listOfStudents.add(kaden);
        listOfStudents.add(winnie);

        School stm = new School(listOfTeachers,listOfStudents);

        //Adding a new teacher
        Teacher scout = new Teacher("Scout",1000);
        stm.addTeacher(scout);

        //Adding a new student
        Student fred = new Student("Freddie", 12);
        stm.addStudent(fred);

        vino.payFees(5000);
        kaden.payFees(6000);
        System.out.println("St.Mary's School has earned S " + stm.getTotalMoneyEarned());

        System.out.println("------------------MAKING STMARYS PAY SALARY");
        sarah.receiveSalary(sarah.getSalary());
        System.out.println("St. Mary's has paid salary to " + sarah.getName() + " and now has $" + stm.getTotalMoneyEarned() );

        //printing out list of teachers
        System.out.println(listOfTeachers);

        //printing out list of students
        System.out.println(listOfStudents);
    }
}
