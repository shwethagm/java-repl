import java.util.Scanner;

public class AverageCalculator{

public void getAverageOfNumbers(){

int num1;
int num2;
int sum=0;

Scanner scanner=new Scanner(System.in);
System.out.println("Enter the num");
num1=Integer.valueOf(scanner.nextLine());
num2=Integer.valueOf(scanner.nextLine());


//int count=0;

//for(int i=0;i<num.length;i++){
sum=num1+num2;
//count++;

System.out.println(sum);
//SYstem.out.println(count);
}

} 