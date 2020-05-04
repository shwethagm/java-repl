import java.util.Scanner;

class Factorial{

public void getFactorial(){

  Scanner scanner=new Scanner(System.in);

  System.out.println("Enter the number");

  int num=Integer.valueOf(scanner.nextLine());
  int i=1;
  int fact=1;

  while(i<=num){
    fact=fact*i;
    i++;
  }
System.out.println(fact);
}
}