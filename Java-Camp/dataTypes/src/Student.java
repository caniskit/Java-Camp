import java.util.Calendar;
import java.util.Date;

public class Student {

    private int id;
    private String name;
    private Boolean status;
    private Calendar birthday;
    private double gno;

    public Student() {

    }

    public Student(int id, String name, Boolean status, Calendar birthday,double gno ) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.birthday = birthday;
        this.gno=gno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }

    public double getGno() {
        return gno;
    }

    public void setGno(double gno) {
        this.gno = gno;
    }
}
