package bollocks;

public class CSCourse extends Course implements Comparable<CSCourse> {

    private String language;

    public CSCourse(String courseName, int courseNum, String roomNum, String instructor, Status status, String language) {
        super(Department.CMSC, courseName, courseNum, roomNum, instructor, status);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

        @Override
        public int compareTo(CSCourse other) {
            // Compare based on course number
            return Integer.compare(this.getCourseNum(), other.getCourseNum());
        }
}
