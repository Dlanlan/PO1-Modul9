public class Student1 extends Person1 {
    public Student1() {
        // cobakan satu persatu konstruktor induk yang di overload. pakai super bergantian amati hasilnya dan analisa
        // super("SomeName", "SomeAddress");
        // super();
        // super.name = "name";
        System.out.println("Inside Student:Constructor");
    }

    public String getName() {
        System.out.println("Student Name : " + name);
        return name;
    }

    public static void main(String[] args) {
        Student1 anna = new Student1();
        anna.setName("anna");
        anna.getName();
    }
}
