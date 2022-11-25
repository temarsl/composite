package version2My;

public class main {
    public static void main(String[] args) {
        Students group = new Group("all group");
        Students group1 = new Group("09-151");
        Students group2 = new Group("09-152");

        group.add(group1);

        group1.add(new Student("Arslanova", "Maryam", true));
        group1.add(new Student("Chugunova", "Darya", true));
        group1.add(new Student("Gabitova", "Aigul", true));

        group2.add(new Student("Alekseeva", "Arina", true));
        group2.add(new Student("Artamonov", "Ilya", false));
        group2.add(new Student("Deremin", "Anton", false));

        group1.add(group2);

        Directorate directorate = new Directorate(group1);

        directorate.output();

        System.out.println();
    }
}
