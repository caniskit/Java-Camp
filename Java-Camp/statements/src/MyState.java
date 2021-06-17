public class MyState {

    public static void main (String[] args) {
        int a = 20, b = 15, c = 35, min, max;
        char grade ='A';
        max= min = a;
        if (a > b && b < c) {
            min = b;
            if(a>c)
            max = a;
            else
                max=c;
        } else if (c < a && c < b) {
            min = c;
            if (a < b) {
                max = b;
            }

        } else {
            min = a;
            if (c < b) {
                max = b;
            } else {
                max = c;
            }
        }
        System.out.println("min = "+min+" max = "+max);

        Switchcase.cases(grade);
        Switchcase.cases('G');

        }




}
