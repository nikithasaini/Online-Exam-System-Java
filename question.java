public class question
{
    String Question;
    String option1,option2,option3,option4;
    int correct_answer;
    
    public question(String q , String o1 , String o2 , String o3 , String o4 , int answer )
    {
       Question=q;
       option1=o1;
       option2=o2;
       option3=o3;
       option4=o4;
       correct_answer=answer;
    }
    public void questiondisplay()
    {
        System.out.println(Question);
        System.out.println("1."+option1);
        System.out.println("2."+option2);
        System.out.println("3."+option3);
        System.out.println("4."+option4);
    }

    
}
