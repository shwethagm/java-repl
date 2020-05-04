import java.util.Scanner;
class Loop{
  public void carryon(){

  Scanner scanner=new Scanner(System.in);
 
  while(true){
 System.out.println("Enter the String");

  String str=scanner.nextLine();

    if(str.equals("carry on")){
      System.out.println("yes");
      break;
    }
  }
  }
}