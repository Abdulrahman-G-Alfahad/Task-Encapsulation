public class Student {
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGpaStatus() {
        if (gpa >= 3) return "Excellent!";
        if (gpa >= 2) return "Good.";
        else return "Needs Improvement.";
    }

    public void setGpa(double gpa) {
        if (0 >= gpa || gpa >= 4) this.gpa = gpa;
        else this.gpa = 0;
    }
}
