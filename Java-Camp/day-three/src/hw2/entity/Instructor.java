package hw2.entity;

import java.util.List;

public class Instructor extends User {
    private List<String>  lectures;
    private double salary;

    public Instructor(List<String> lectures, double salary) {
        this.lectures = lectures;
        this.salary = salary;
    }

    public Instructor() {
    }

    public Instructor(int id, String name, String mail, List<String> lectures, double salary) {
        super(id, name, mail);
        this.lectures = lectures;
        this.salary = salary;
    }

    public List<String> getLectures() {
        return lectures;
    }

    public void setLectures(List<String> lectures) {
        this.lectures = lectures;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
