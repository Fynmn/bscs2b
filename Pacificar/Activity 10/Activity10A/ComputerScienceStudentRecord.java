public class ComputerScienceStudentRecord extends StudentRecord {
    private double webdevGrade;
    private double aiGrade;

    public ComputerScienceStudentRecord(String name){
        this.name = name;
    }

    @Override
    public double getAverage(){
        double result = 0;
        result = (mathGrade + englishGrade + scienceGrade + webdevGrade + aiGrade)/5;
        return result;
    }

    public int getNumberOfMajorSubjects(){
        return 2;
    }

    public double getWebdevGrade() {
        return webdevGrade;
    }

    public void setWebdevGrade(double grade) {
        webdevGrade = grade;
    }

    public double getAiGrade() {
        return aiGrade;
    }

    public void setAiGrade(double grade) {
        aiGrade = grade;
    }
}
