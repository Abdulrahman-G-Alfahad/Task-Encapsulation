//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ahmad",25,3);
        System.out.println(student.getGpaStatus());
        student.setGpa(-5);
        System.out.println(student.getGpaStatus());
        student.setGpa(10);
        System.out.println(student.getGpaStatus());
    }
}