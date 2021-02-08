public class StudentRecord {
    public String name;
    public String address;
    public int age;
    public double mathGrade;
    public double englishGrade;
    public double scienceGrade;
    public double average;

    private static int studentCount;


    //getters ans setters

    public String getName() {
        return name;
    }

    public void setName(String temp) {
        name = temp;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(double grade) {
        mathGrade = grade;
    }

    public double getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(double grade) {
        englishGrade = grade;
    }

    public double getScienceGrade() {
        return scienceGrade;
    }

    public void setScienceGrade(double grade) {
        scienceGrade = grade;
    }

    public double getAverage() {
        double result = 0;
        result = (mathGrade + englishGrade + scienceGrade)/3;
        return result;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public StudentRecord() {
        studentCount++;
    }

    public static int getStudentCount() {
        return studentCount;
    }

}
