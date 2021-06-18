import hw2.business.IntructorManager;
import hw2.business.StudentManager;
import hw2.entity.Instructor;
import hw2.entity.Student;
import hw2.entity.User;

import java.util.ArrayList;

public class dayThreeApp {

    public static void main (String[] args) {

        ArrayList<String> lectures = new ArrayList<>();
        lectures.add("Java");
        lectures.add("JavaScript");
        lectures.add("CSharp");

        StudentManager studentManager = new StudentManager();

        studentManager.add(new Student(1,"Osman can iskit","caniskit@gmail.com",lectures,true,2));

        IntructorManager intructorManager = new IntructorManager();

        intructorManager.add(new Instructor(1,"Engin Demiroğ","test@mymail.com",lectures,15000));



    }
    }
