package List;

import java.util.ArrayList;

public class BlockSection {

    // blockCode,description,adviser,list of students

    public String blockCode;
    public String description;
    public String adviser;
    public ArrayList<Student> studentList;

    public String getBlockCode() {
        return blockCode;
    }

    public void setBlockCode(String blockCode) {
        this.blockCode = blockCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdviser() {
        return adviser;
    }

    public void setAdviser(String adviser) {
        this.adviser = adviser;
    }

    public ArrayList<Student> getStudentList() {

        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

}
