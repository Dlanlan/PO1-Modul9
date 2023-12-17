public class StudentRecordTest {
    public static void main(String[] args) {
        // objek student
        TurunanStudentRecord student = getTurunanStudentRecord();

        // menampilkan informasi kelulusan
        System.out.println("lulus : " + student.getIsGraduated());

        // menampilkan nilai
        System.out.println("nilai MTK : " + student.getMathGrade());
        System.out.println("nilai inggris : " + student.getEnglishGrade());
        System.out.println("nilai science : " + student.getScienceGrade());
        System.out.println("rata rata : " + student.getAverage());
        System.out.println("total nilai : " + student.getTotalNilai());
    }

    private static TurunanStudentRecord getTurunanStudentRecord() {
        TurunanStudentRecord student = new TurunanStudentRecord();

        // set informasi
        student.setName("Budi setiawan");
        student.setAddress("bandung");
        student.setAge(15);
        student.setMathGrade(70.5);
        student.setEnglishGrade(89.0);
        student.setScienceGrade(87.5);
        student.setGender('M');
        student.setIsGraduated(false);

        // mencetak informasi
        student.print("Student Information:");
        return student;
    }
}