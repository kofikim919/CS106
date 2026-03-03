package bollocks;

public class tester {
    public enum Day {MON,TUE,WED,THU,FRI,SAT,SUN};
    
    public static void main(String[] args) {

        for (Day today : Day.values()) {
            switch (today) {
                case MON:
                case TUE:
                case WED:
                case THU:
                case FRI:
                    System.out.println("work");
                default:
                    System.out.println("play");
            }
        }
        
    }
}