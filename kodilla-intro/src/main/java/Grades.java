public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }
    public void add(int value){
        if (this.size == 10){
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int getLastGrades() {

        return grades [this.size -1];
    }

    public double averageGrade() {
        double sum = 0;
        for (int i = 0; i < this.size; i++){
            int grade = grades[i];//grade pobrany element z tablicy grades
            sum = sum + grade;

        }
            return sum /this.size;
    }
}
