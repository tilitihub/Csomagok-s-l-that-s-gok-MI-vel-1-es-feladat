package entity;

/**
 * @author hp820G2 tilitihub kopirájtkriptobájt
 * With Open AI ChatGPT
 */
package entity;

public class Vegettseg {
    private String major;
    private University university;

    public Vegettseg(String major, University university) {
        this.major = major;
        this.university = university;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "Vegettseg{" +
                "major='" + major + '\'' +
                ", university=" + university +
                '}';
    }
}

