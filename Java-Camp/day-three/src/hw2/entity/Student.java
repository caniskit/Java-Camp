package hw2.entity;

import java.util.List;

public class Student extends User{
    List<String> lessons;
    boolean status;
    int certificates;

    public Student() {
    }

    public Student(List<String> lessons, boolean status, int certificates) {
        this.lessons = lessons;
        this.status = status;
        this.certificates = certificates;
    }

    public Student(int id, String name, String mail, List<String> lessons, boolean status, int certificates) {
        super(id, name, mail);
        this.lessons = lessons;
        this.status = status;
        this.certificates = certificates;
    }

    public List<String> getLessons() {
        return lessons;
    }

    public void setLessons(List<String> lessons) {
        this.lessons = lessons;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCertificates() {
        return certificates;
    }

    public void setCertificates(int certificates) {
        this.certificates = certificates;
    }
}
