import java.util.Scanner;

class LargeProgram{

  public void getNumber(){

    Scanner scanner =new Scanner(System.in);
    System.out.println("Enter the number");
    double sum=0;
    double count=0;
    int even=0;
    int odd=0;
    while(true){
    
    int num=Integer.valueOf(scanner.nextLine());
    if(num==-1){
      break;
    }
    else if(num%2==0){
    even=even+1;
    }
    else if(num%2!=0){
odd=odd+1;
    }
sum=sum+num;
count=count+1;
    }
    double average=(sum/count);
    System.out.println("Thx!Bye");
    System.out.println("sum:"+sum);
    System.out.println("count:"+count);
    System.out.println("average:"+average);
System.out.println("even:"+even);
    System.out.println("odd:"+odd);

  }
}