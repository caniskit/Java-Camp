package hw2.business;

import hw2.entity.Instructor;
import hw2.entity.User;

import java.util.ArrayList;
import java.util.List;

public class IntructorManager  extends UserManager{


    public void add(Instructor instructor){
       super.add(instructor);
        System.out.println("Instructor added. "+instructor.getName());

    }

}
