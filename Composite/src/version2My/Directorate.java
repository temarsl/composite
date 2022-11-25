package version2My;

public class Directorate {
    Students allStudent;

    public Directorate(Students allStudent) {
        this.allStudent = allStudent;
    }

    public void output() {
        allStudent.print();
    }
}
