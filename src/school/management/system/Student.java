package school.management.system;

/**
 * This class is responsible for keeping track of the students
 */

public class Student {

    //TODO: increment ID in constructor to increase the ID each time a new Student object is created

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new student by initializing the following:
     * Fees paid for every student is $30,000.
     * Fees paid is initially 0.
     * @param id id for the student: this is unique.
     * @param name name for the student.
     * @param grade grade for the student
     */
    public Student (int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    //Not going to alter the student's name or student's id.

    /**
     * Used to update the student's grade.
     * @param grade is the new grade of the student.
     */
    public void setGrade(int grade){
        this.grade = grade;
    }

    /**
     * Keep adding the fees to fees paid field.
     * Add the fees to the fees paid.
     * The school is going to receive the fees.
     *
     * @param fees fees that the student pays.
     */
    public void payFees(int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     *
     * @return the id of the student.
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return the name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return the grade of the student.
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return the fees paid by the student.
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return the total amount of fees.
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees
     */
    public int getFeeBalance () {
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", feesPaid=" + feesPaid +
                ", feesTotal=" + feesTotal +
                '}';
    }
}
