package version2My;

import java.util.ArrayList;
import java.util.Iterator;

public class Group extends Students {
    ArrayList<Students> students = new ArrayList<Students>();

    String num_group;

    public Group(String num_group) {
        this.num_group = num_group;
    }

    @Override
    public void add(Students student) {
        students.add(student);
    }

    @Override
    public void remove(Students student) {
        students.remove(student);
    }

    public Students getChild(int i) {
        return students.get(i);
    }

    public String getNum_group() {
        return num_group;
    }

    @Override
    public void print() {
        System.out.println("Group " + getNum_group());
        System.out.println("Students: ");

        Iterator<Students> iterator = students.iterator();

        while (iterator.hasNext()) {
            Students student = (Students) iterator.next();
            student.print();
        }
    }
}
