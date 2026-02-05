package bollocks;

public class ExceptionsTest {

    public static void main(String[] args) {
        try {
            System.out.println(myNameIs("Kofi"));
            System.out.println(myNameIs("John"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }


    public static String myNameIs (String name) {

    if (name.equals("Kofi")) {
        return ("That's My Name!");
        
    }
    else {
        throw new IllegalArgumentException("That's not my name!");
    }

    }
    
}