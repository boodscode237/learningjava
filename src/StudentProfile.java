public class StudentProfile {
    String firstName, lastName, declaredMajor;
    double gpa;
    int expectedYearToGraduate;

    public StudentProfile(String firstName, String lastName, String declaredMajor, double gpa, int expectedYearToGraduate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.declaredMajor = declaredMajor;
        this.expectedYearToGraduate = expectedYearToGraduate;
        this.gpa= gpa;
    }

    public void IncrementedExpectedYearToGraduate(int expectedYearToGraduate) {
        this.expectedYearToGraduate = expectedYearToGraduate;
    }
}
