import java.util.Scanner;
class SumOfSequence{

  public void getSum(){

    Scanner scanner=new Scanner(System.in);

    System.out.println("Enter the numbers");

    int num=Integer.valueOf(scanner.nextLine());
    int sum=0;
    int i=1;
    while(i<=num){
       sum=sum+i;
      i++;
    }
    System.out.println(sum);
      }
       public void getSumS(){

    Scanner scanner=new Scanner(System.in);

    System.out.println("Enter the numbers");

    int num=Integer.valueOf(scanner.nextLine());
    int num1=Integer.valueOf(scanner.nextLine());
    int sum=0;
    //int num=1;
    while(num<=num1){
       sum=sum+num;
      num++;
    }
    System.out.println(sum);
      }
}