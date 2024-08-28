import java.util.Scanner;
public class Student_Grade{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name=sc.nextLine();
        System.out.print("enter total marks: ");
        double marks=sc.nextDouble();
        System.out.print("enter obtained marks: ");
        double your_marks=sc.nextDouble();
        double percentage= (your_marks/marks)*100;
        String grade=getGrade(percentage);
        System.out.println("Student name: "+name);
        System.out.println("percentage: "+percentage);
        System.out.println("grade: "+grade);
        System.out.println("keep it up");

}
    public static String getGrade(double percentage){
        if(percentage>=90){
            return "A";
        }else if(percentage>=80){
            return "B";
        }else if(percentage>=70){
            return "C";
        }else if(percentage>=60){
            return "D";
        }else{
            return "F";
        }
    }
}   