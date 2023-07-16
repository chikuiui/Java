package OOP_main;

class Student{
    String name;
    private float CGPA; // private = restricted access.

    // Getter
    public float getCGPA(){
        return CGPA;
    }
    // Setter
    public void setCGPA(float newCGPA){
        this.CGPA = newCGPA;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Charchit";
        s1.setCGPA(7.28f);

        // if we directly access CGPA it will give us error.

    }
}
