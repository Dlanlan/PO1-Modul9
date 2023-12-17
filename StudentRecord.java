public class StudentRecord {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int studentCount;
    private char gender;

    // constructor default
    public StudentRecord() {
        studentCount++;
    }

    // menghasilkan nama dari siswa
    public String getName() {
        return name;
    }

    // mengubah nama siswa
    public void setName(String temp) {
        name = temp;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String temp) {
        address = temp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int temp) {
        age = temp;
    }

    // menghitung rata-rata nilai
    public double getAverage() {
        double result;

        result = (mathGrade + englishGrade + scienceGrade) / 3;
        return result;
    }

    // total nilai
    public double getTotalNilai(){
        return mathGrade + englishGrade + scienceGrade;
    }

    // gender
    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public static int getStudentRecord() {
        return studentCount;
    }

    public void print(String temp) {
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Age : " + age);
    }

    public void print(double eGrade, double mGrade, double sGrade, double average, double totalNilai){
        System.out.println("math Grade : " + mGrade);
        System.out.println("english Grade : " + eGrade);
        System.out.println("science Grade : " + sGrade);
        System.out.println("rata rata : " + average);
        System.out.println("total nilai : " + totalNilai);
    }

    public double getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(double englishGrade) {
        this.englishGrade = englishGrade;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }

    public double getScienceGrade() {
        return scienceGrade;
    }

    public void setScienceGrade(double scienceGrade) {
        this.scienceGrade = scienceGrade;
    }
}