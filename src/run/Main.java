package run;
/**
 * @author hp820G2 tilitihub kopirájtkriptobájt
 * With Open AI ChatGPT
 */
package run;

import institution.University;
import entity.Vegettseg;
import instructor.Course;
import instructor.Instructor;

public class Main {
    public static void main(String[] args) {
        University university1 = new University("University of Oxford", "Oxford");
        University university2 = new University("Massachusetts Institute of Technology", "Cambridge");

        Vegettseg degree1 = new Vegettseg("Computer Science", university1);
        Vegettseg degree2 = new Vegettseg("Physics", university2);
        Vegettseg degree3 = new Vegettseg("Mathematics", university1);

        Instructor instructor1 = new Instructor("John Doe", degree1);
        Instructor instructor

