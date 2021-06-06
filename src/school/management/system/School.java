package school.management.system;

import java.util.List;

public class School {

    /**
     * This class keeps track of the schools teachers,
     * students, totalMoneyEarned, and totalMoneySpent.
     * Implements teachers and students using an ArrayList.
     */
    private List<Teacher> teachers;
    private List<Student> students;
    //static variables used for payfees method in Student Class so it properly updates the values.
    //Otherwise creating a new instance of the School class would not carry those values.
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * New school object is created.
     * @param teachers this is a list of teachers in the school.
     * @param students this is a list of students in the school.
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     *
     * @return the list of teachers in the school
     */

    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Adds a teacher to the school
     * @param teacher the teacher to be added.
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @return the list of students in the school.
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Adds a student to the school
     * @param student the student to be added.
     */

    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     *
     * @return total money earned for the school.
     */

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money earned by the school.
     * @param moneyEarned money that is supposed to be added.
     */

    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    /**
     *In this case for simplicity the money spent is the teachers salary.
     * @return the total money spent by the school.
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the money that is spent by the school
     * which is the salary given bvy the school to its teachers.
     * @param moneySpent is money that is subtracted from the school's
     * total money earned.
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }

    @Override
    public String toString() {
        return "School{" +
                "teachers=" + teachers +
                ", students=" + students +
                '}';
    }
}
