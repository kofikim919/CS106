package bollocks;

public class ExceptionsTest {

    public static String myNameIs (String name) {

    if (name.equals("Kofi")) {
        return ("That's My Name!");
        
    }
    else {
        throw new IllegalArgumentException("That's not my name!");
    }

    }
    
}