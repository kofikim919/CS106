package bollocks;

public class CSCourse extends Course {

    private String language;

    public CSCourse(String courseName, int courseNum, String roomNum, String instructor, Status status, String language) {
        super(Department.CMSC, courseName, courseNum, roomNum, instructor, status);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
}
