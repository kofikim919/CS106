package bollocks;

public class Main {
    public static void main(String[] args) {

        Course CS106 = new Course(Course.Department.CMSC, "Data Structures", 106, "Hilles 204", "Sorelle", Course.Status.ENROLLED);
        System.out.println(CS106.getCourseInformation());
        CS106.setStatus(Course.Status.WAITLISTED);
        System.out.println(CS106.getCourseInformation());
    }

}