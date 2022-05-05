public class GradeApp {
    public static void main(String[] args) {
        Grades gradeApp = new Grades();//stworzenie obiektu typu grade o nazwie grade app
        gradeApp.add(5);//wywołanie metody
        gradeApp.add(4);
        gradeApp.add(6);
        System.out.println(gradeApp.getLastGrades());
        System.out.println(gradeApp.averageGrade());
    }
}
