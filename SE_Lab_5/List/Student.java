package List;

import java.util.ArrayList;

public class Student {

    // studentNumber,name,program,list of courses

    public String studentNumber;
    public String name;
    public String program;
    public ArrayList<Course> courseList;

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgram() {

        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

}
