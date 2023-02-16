package instructor;

/**
 * @author hp820G2 tilitihub kopirájtkriptobájt
 * With Open AI ChatGPT
 */
package instructor;

public class Instructor {
    private String name;
    private Vegettseg degree;

    public Instructor(String name, Vegettseg degree) {
        this.name = name;
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vegettseg getDegree() {
        return degree;
    }

    public void setDegree(Vegettseg degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "name='" + name + '\'' +
                ", degree=" + degree +
                '}';
    }
}

