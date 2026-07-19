import java.util.Scanner;

public class exam{
Scanner sc=new Scanner(System.in);

int score=0;
question[] questions;
student Student;

public exam()
{
    questions=new question[5];
    loadquestion();
}
public void loadquestion()
{
    questions[0]=new question("Which keyword is used to create an object in java?",
                                "new",
                                "this",
                                "super",
                                "class",
                                1);
   questions[1]=new question("which method is the entry point of java?",
                                 "start()",
                                 "main()",
                                 "run()",
                                 "execute()",
                                 2);
   questions[2]=new question("size of int?",
                             "2",
                             "4",
                             "8",
                             "3",
                             2);
   questions[3]=new question("which loop executes at least once?",
                              "for loop",
                              "while loop",
                              "do-while loop",
                              "all of these",
                              3);
   questions[4]=new question("Scanner belongs to which package?",
                              "java.io",
                              "java.net",
                              "java.util",
                              "java.lang",
                              3);

}

public void startexam()
{   System.out.println("=======================================================");
    System.out.println("             ONLINE EXAMINATION SYSTEM");
    System.out.println("=======================================================");

    System.out.print("Enter Student Name:");
    String n=sc.next();
    System.out.print("Enter Roll Number:");
    String r=sc.next();
    System.out.println();
    Student= new student(n,r);
    System.out.println("================================");
    System.out.println("         INSTRUCTIONS");
    System.out.println("================================");
    System.out.println("Total Questions: 5");
    System.out.println("Each Queestion carries 1 Mark.");
    System.out.println("No Negative Marking.");
    System.out.println("Enter option number(1-4)");
    System.out.println("-------------------------------------");
    System.out.println();
    System.out.println("Press Enter to Start the Exam...");



    for(int i=0;i<5;i++)
    {   System.out.println("---------------------------------------");
        System.out.println("Question "+(i+1));
        System.out.println("---------------------------------------");

        questions[i].questiondisplay();
        System.out.println();
        System.out.println("Enter your Answer:");
        int a=sc.nextInt();
        if(a==questions[i].correct_answer)
        {System.out.println("Correct Answer");
        score++;
        }
        else{
            System.out.println("Wrong Answer");
        }
        System.out.println();

    }

    showresult();

}
 
 public void showresult()
 {   System.out.println("=========================================");
     System.out.println("               EXAM RESULT                 ");
     System.out.println("=========================================");
     System.out.println();
    Student.display();
    System.out.println();
    System.out.println("Total Questions: 5");
    System.out.println("Correct Answers: "+score);
    System.out.println("Wrong answers: "+(5-score));
    System.out.println();
    System.out.println("Marks Obtained: "+score);
    int percentage=(score*100)/5;
    System.out.println("Percentage: "+ percentage + "%");
    char grade;
    String remark;
    if(90<=percentage && percentage<=100){
    grade='A';
    remark="Excellent Performance!";
    }
    else if(75<=percentage && percentage<90){
    grade='B';
    remark="Very Good!";
    }
    else if(60<=percentage && percentage<75){
    grade='C';
    remark="Good job!";}
     else if(40<=percentage && percentage<60){
    grade='D';
    remark="Keep Practicing";
     }
    else{
    grade='F';
    remark="Needs Improvement";
    }

    System.out.println("Grade: "+ grade);
    System.out.println("");
   

    if(percentage>=40){
    System.out.println("Result: PASS");
    System.out.println();
    
    }
    else
    {
    System.out.println("Result: FAIL");
    System.out.println();
    System.out.println("Better Luck Next Time!");
    }
     System.out.println("Final Remark:" +remark);
    System.out.println();

    
 }

}