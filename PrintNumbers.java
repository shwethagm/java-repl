import java.util.Scanner;

  class PrintNumbers{



    public void getNumber(){
Scanner scanner =new Scanner(System.in);
      System.out.println("Enter the number");
      int i=0;
      int num=Integer.valueOf(scanner.nextLine());
            int num1=Integer.valueOf(scanner.nextLine());
while(num<=num1){
System.out.println(num);
      num++;
      }
    }
  }
