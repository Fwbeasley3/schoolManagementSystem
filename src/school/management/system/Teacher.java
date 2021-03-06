package school.management.system;

import java.util.concurrent.atomic.AtomicInteger;

public class Teacher {

    /**
     * This class is responsible for keeping track
     * of the teacher\s id, name and salary.
     */

    //TODO: increment ID in constructor to increase the ID each time a new Teacher object is created
    private static final AtomicInteger count = new AtomicInteger(0);
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Creates a new teacher object.
     * @param name name for the teacher.
     * @param salary salary for the teacher.
     */
    public Teacher ( String name, int salary){
        this.id = count.incrementAndGet();
        this.name= name;
        this.salary=salary;
        this.salaryEarned = 0;
    }

    /**
     *
     * @return the id.
     */

    public int getId(){
        return id;
    }

    /**
     *
     * @return name of the teacher.
     */

    public String getName(){
        return name;
    }

    /**
     *
     * @return salary of the teacher.
     */
    public int getSalary(){
        return salary;
    }

    /**
     *
     * @param salary set the teacher's salary.
     */
    public void setSalary(int salary){
        this.salary = salary;
    }

    /**
     * Adds to the salary.
     * Removes from the total money earned from the school.
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned =+ salary;
        School.updateTotalMoneySpent(salaryEarned);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", salaryEarned=" + salaryEarned +
                '}';
    }
}
