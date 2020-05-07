class Part3Method5{
  
public static void division(float first, float second) {
        System.out.println("" + first + " / " + second + " = " + (first/ second));
    }


public static void divisibleBy3(int begin,int end){

  for(int i=begin;i<=end;i++){

if(i%3==0){
  System.out.println(i);
}
  }
  }
  public static void divisibleBy3While(int begin,int end){
  int i=begin;
  while(i<end){

if(i%3==0){
  System.out.println(i);
  begin++;
}
  }
  }
}