public class Employee extends Person1 {
    public String getName() {
        System.out.println("Employee Name : " + name);
        return name;
    }

    public static void main(String[] args) {
        Person1 ref;
        Student1 studentObject = new Student1();
        Employee employeeObject = new Employee();

        studentObject.setName("budi");
        ref = studentObject; // Person menunjuk kepada object Student

        String temp = ref.getName(); // getName dari Student class dipanggil
        System.out.println(temp);

        employeeObject.setName("setiawan");
        ref = employeeObject; // Person menunjuk kepada object Employee

        temp = ref.getName(); // getName dari Employee class dipanggil
        System.out.println(temp);
    }
}