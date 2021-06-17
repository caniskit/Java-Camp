import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyData {

    public static  void main (String [] args)
    {
        char [] grades = {'A','B','C','D','F'};

        Student student1=new Student(1,"Ali Test",Boolean.TRUE,new GregorianCalendar(2000, Calendar.JUNE,16),3.27);

        System.out.println("id: "+student1.getId()+" name: " +student1.getName()+" is Student: "+student1.getStatus());

        System.out.println("Birthday: "+student1.getBirthday().getTime()+" Student Grade : " +student1.getGno() +" grade : "+grades[1]);


    }
}
