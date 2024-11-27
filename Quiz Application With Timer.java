import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		String[] questions={
		    "What is the capital of India?",
		    "What is 6+2?",
		    "Who was the first Prime Minister of India?",
		    "What is national bird of India?",
		    "What is largest planet in our solar system?"
		};
		String[][] options={
		    {"A.New Delhi","B.Mumbai","C.Chennai","D.Ahmedabad"},
		    {"A.9","B.7","C.8","D.10"},
		    {"A.Indira Gandhi","B.Narendra Modi","C.Jawaharlal Nehru","D.Rajiv Gandhi"},
		    {"A.Parrot","B.Pigeon","C.Sparrow","D.Peacock"},
		    {"A.Saturn","B.Jupiter","C.Mars","Earth"}
		};
		String[] answers={"A","C","C","D","B"};
		int score=0;
		//int time=10;
		for(int i=0;i<questions.length;i++){
		    System.out.println("Question "+(i+1)+": "+questions[i]);
		    for(String option:options[i])
		        System.out.println(option);
		    int time=10;
		    String user="";
		    while(time-->0){
		        if(sc.hasNextLine()){
		            user=sc.nextLine().toUpperCase();
		            break;
		        }
		    }
		    if(user.equals(answers[i])){
		        System.out.println("Correct answer!!");
		        score++;
		    }
		    else if(!user.isEmpty()){
		        System.out.println("Incoreect answer!!");
		    }
		    else{
		        System.out.println("Time is up");
		    }
		}
		    System.out.println();
		    System.out.println("Quiz completed.");
		    System.out.println("Your score is: "+score);
		    for(int i=0;i<questions.length;i++){
		        System.out.println("Question "+(i+1)+": "+questions[i]);
		        System.out.println("Correct answer: "+answers[i]);
		    }
	}
}
