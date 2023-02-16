package instructor;
/**
 * @author hp820G2 tilitihub kopirájtkriptobájt
 * With Open AI ChatGPT
 */
package instructor;

public class Course {
    private String name;
    private Instructor instructor;

    public Course(String name, Instructor instructor) {
        this.name = name;
        this.instructor = instructor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", instructor=" + instructor +
                '}';
    }
}

