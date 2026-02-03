package bollocks;

//initialize the class
public class Course {
    //define an enum for department
    enum Department{
            CMSC,PHYS,MATH,CSTS,BIOL,CHEM,WRPR
        }
    enum Status{
        ENROLLED, WAITLISTED, DROPPED
    }
        //define the instance variables
        private Department department;
        private String courseName;
        private int courseNum;
        private String roomNum;
        private String instructor;
        private Status status;

        //constructor -- shows how to initialize the class
        public Course(Department department, String courseName, int courseNum, String roomNum, String instructor, Status status) {
            this.department = department;
            this.courseName = courseName;
            this.courseNum = courseNum;
            this.roomNum = roomNum;
            this.instructor = instructor;
            this.status = status;
        }

        //different getter methods
        public int getCourseNum() {
            return courseNum;
        }

        public String getRoomNum() {
            return roomNum;
        }

        public String getInstructor() {
            return instructor;
        }

        public String getCourseInformation() {
            return String.format("Department: %s, Course Name: %s, Course Number: %d, Room Number: %s, Instructor: %s, Status: %s",
                    department, courseName, courseNum, roomNum, instructor, status);
        }

        public Status setStatus(Status status) {
            this.status = status;
            return status;
        }

        public Status getStatus() {
            return status;
        }
}