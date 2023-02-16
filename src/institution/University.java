package institution;

/**
 * @author hp820G2 tilitihub kopirájtkriptobájt
 * With Open AI ChatGPT
 */
package institution;

public class University {
    private String name;
    private String city;

    public University(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

