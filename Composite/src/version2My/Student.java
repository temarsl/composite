package version2My;

public class Student extends Students {

    String name;
    String surname;
    boolean isBudget;

    public Student(String name, String surname, boolean isBudget) {
        this.name = name;
        this.surname = surname;
        this.isBudget = isBudget;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public boolean isBudget() {
        return isBudget;
    }

    @Override
    public void print() {
        System.out.println(getSurname() + " " + getName() + " " + ", budget = " + isBudget);
    }
}
