public class Switchcase {

    public static void cases(char grade){
        switch (grade){
            case 'A':
                System.out.println("You're awesome");
                break;
            case 'B':
                System.out.println("So far so good");
                break;
            case 'C':
                System.out.println("Neither nor good");
                break;
            case 'D':
                System.out.println("You pass but, you have to lot study");
                break;
            case 'F':
                System.out.println("You re dissapoint me. Try again.");
                break;
            default:
                System.out.println("This is not a grade char");
                break;
        }
    }
}
