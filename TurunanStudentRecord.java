public class TurunanStudentRecord extends StudentRecord {
    private boolean isGraduated;

    // Constructor awal
    public TurunanStudentRecord() {
        super();
        isGraduated = false;
    }

    // method
    public boolean getIsGraduated() {
        return isGraduated;
    }

    public void setIsGraduated(boolean graduated) {
        isGraduated = graduated;
    }
}