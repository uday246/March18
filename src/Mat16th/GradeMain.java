package Mat16th;

import java.util.Scanner;

class Grading {

    //variables

    private double quiz1;
    private double quiz2;
    private double quiz3;
    private double midTerm;
    private double finalExam;
    private char grade;
    private double overAllScore;
    //constructor

     Grading() {
        quiz1 =0;  quiz2 =0; quiz3 =0; midTerm =0; finalExam = 0;
        grade = 'F';
        overAllScore = 0;
    }
    //setters and getters for all variables
    public void setQ1(double quiz1) {
        this.quiz1 = quiz1;
    }
    public double getQ1() {

        return quiz1;
    }
    public void setQ2(double quiz2) {

        this.quiz2 = quiz2;
    }
    public double getQ2() {
        return quiz2;
    }
    public void setQ3(double quiz3) {
        this.quiz3 = quiz3;
    }
    public double getQ3() {
        return quiz3; }

    public void setMidTerm(double midTerm) {
        this.midTerm = midTerm;
    }
    public double getMidTerm()
    {
        return midTerm;
    }
    public void setFinalExam(double finalExam) {
        this.finalExam = finalExam;
    }
    public double getFinalExam()
    {
        return finalExam;
    }
    public void setGrade(char grade) {
        this.grade = grade;
    }

    //method to calculate grade

    public void CalculateGrade() {
        overAllScore = overAllScore + ((double) (getQ1() + getQ2() + getQ3()) / 30) * 25;
        overAllScore = overAllScore + ((double) (getMidTerm()) / 100) * 35;
        overAllScore = overAllScore + ((double) (getFinalExam()) / 100) * 40;
        if (overAllScore >= 90)
            setGrade('A');
        else if (overAllScore >= 80)
            setGrade('B');
        else if (overAllScore >= 70)
            setGrade('C');
        else if (overAllScore >= 60)
            setGrade('D');
        else
            setGrade('F');
    }
    public String toString() {
        return "Final Grade : " + grade + " (" + overAllScore + "%)";
    }

    //create string for grade


}



public class GradeMain {
    public static void main(String[] args) {

        Grading g = new Grading();
        Scanner sc = new Scanner(System.in); //scanner object
        double x;

        System.out.print("Enter quiz 1 score: ");
        x = sc.nextDouble();
        g.setQ1(x);
        System.out.print("Enter quiz 2 score: ");

        x = sc.nextDouble();
        g.setQ2(x);
        System.out.print("Enter quiz 3 score: ");

        x = sc.nextDouble();
        g.setQ1(x);
        System.out.print("Enter mid-term score: ");

        x = sc.nextDouble();
        g.setMidTerm(x);
        System.out.print("Enter final exam score: ");

        x = sc.nextDouble();
        g.setFinalExam(x);
        g.CalculateGrade();
        System.out.println(g);
        sc.close();
    }
}
