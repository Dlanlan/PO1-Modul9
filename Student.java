public class Student extends Person {
    public Student() {
        // super();
        super("SomeName", "SomeAddress");
        super.name = "budi";
        super.address = "bandung";
        System.out.println("Inside Student:Constructor");
    }

    public static void main(String[] args) {
        Student anna = new Student();
        System.out.println("nama : " + anna.getName());
        System.out.println("alamat : " + anna.getAddress());
    }
}