package Garbage.repository;

import Garbage.entity.Group;
import Garbage.entity.Student;
import Garbage.entity.University;

import java.util.List;

public class Storage {
    private List<University> universityList;
    private List<Group> groupList;
    private List<Student> students;


    public List<University> getUniversityList() {
        return universityList;
    }

    public void setUniversityList(List<University> universityList) {
        this.universityList = universityList;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Group> groupList) {
        this.groupList = groupList;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
