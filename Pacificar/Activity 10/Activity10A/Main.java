public class Main {
    public static void main(String[] args) {
        StudentRecord StudentRecord = new StudentRecord();
        ComputerScienceStudentRecord csStudent = new ComputerScienceStudentRecord("Natalie Jane Pacificar");
        csStudent.setAiGrade(90);
        csStudent.setWebdevGrade(91);
        csStudent.setEnglishGrade(92);
        csStudent.setMathGrade(93);
        csStudent.setScienceGrade(94);

        System.out.println("Name: " + csStudent.getName());
        System.out.println("Average: " + csStudent.getAverage());
        System.out.println("Number of Major Subjects: " + csStudent.getNumberOfMajorSubjects());

    }
}
