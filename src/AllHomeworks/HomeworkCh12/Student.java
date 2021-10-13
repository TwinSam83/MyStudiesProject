package AllHomeworks.HomeworkCh12;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    int id;
    List<Integer> marks = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void addMark(int mark) {
        marks.add(mark);
    }
}
