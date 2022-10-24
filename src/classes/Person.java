package classes;

import enums.Education;
import enums.Gender;

public class Person {
    private String name;
    private String family;
    private Integer age;
    private Gender gender;
    private Education education;

    public Person(String name, String family, int age, Gender gender, Education education) {
        this.name = name;
        this.family = family;
        this.age = age;
        this.gender = gender;
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public Integer getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public Education getEducation() {
        return education;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age=" + age +
                ", sex=" + gender +
                ", education=" + education +
                '}';
    }
}
