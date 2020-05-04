import java.util.Scanner;
class AverageOfNumbers{

  public void getAverage(){

  Scanner scanner=new Scanner(System.in);
  double count=0;
  double sum=0;

  while(true){
System.out.println("Enter the number");
double num=Double.valueOf(scanner.nextLine());
    if(num==0){
      break;
    }
    count=count+1;
    sum=sum+num;
  }
  Double Average=sum/count;
  System.out.println("Average of numbers is" + " "+Average);
  }


  public void getAVerageOfPositive(){
     Scanner scanner=new Scanner(System.in);
  double count=0;
  double sum=0;

  while(true){
System.out.println("Enter the number");
double num=Double.valueOf(scanner.nextLine());
    if(num==0){
      break;
    }else if(num>0){
    count=count+1;
    sum=sum+num;
    }else if(num<0){
      System.out.println("Cannot calculate the average");
    }
  }
  Double Average=sum/count;
  System.out.println("Average of numbers is" + " "+Average);
  
  }
}