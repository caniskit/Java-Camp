public class MyVariables {
    public static  void main (String [] args)
    {
        int number = 10;
        double decnum= 1.56;
        String name = "double number";

        System.out.println(name+" : " +decnum+" number is: "+number);
        number+=decnum;//variable increase  1 because the casting corrupt decimal value.
        System.out.println(name+" : " +decnum+" number is: "+number);


    }
}
