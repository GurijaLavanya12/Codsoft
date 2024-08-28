import java.lang.System;
import java.util.Scanner;
public class Quiz_Application{
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        String[] questions={
        "What is the capital of France?",
        "Who painted the Mona Lisa?",
        "What is the largest planet in our solar system?"
        };
        String[] answers= {
            "Paris",
            "Leonardo da vinci",
            "Jupiter"
        };
        int score=0;
        int time_limit=30;

        for (int i =0;i<questions.length;i++){
            System.out.println("Question "+ (i+1)+":"+questions[i]);
            System.out.println("You have "+time_limit+" seconds to answer.");
            long start_time = System.currentTimeMillis();
            String user_Answer = sc.nextLine();
            long end_time = System.currentTimeMillis();
            int time_taken=(int)(end_time-start_time)/1000;
            System.out.println("Time taken: "+time_taken+" seconds");
            System.out.println("Time remaining: "+(time_limit-time_taken)+" seconds");

            if(end_time-start_time<=time_limit*1000 && user_Answer.equalsIgnoreCase(answers[i])){
                System.out.println("Correct");
                score++;
            }else if(end_time-start_time>time_limit*1000){
                System.out.println("Time's up! Correct answer : "+answers[i]);
            

            }else{
                System.out.println("Incorrect. The correct answer is : "+answers[i]);
            }
        }
        System.out.println("Quiz finished.");
        System.out.println("Your score is "+score+"/"+questions.length);
    }
}