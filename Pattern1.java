import java.util.*;// Online Java Compiler
// Use this editor to write, compile and run your Java code online
public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner (System.in);

    int n=scn.nextInt();
    
    int i=1;
    int j=1;

    for( i=1;i<=n;i++){
      for( j=1;j<=i;j++){
        if(j%2==0){
          System.out.print("* ");
        }else{
        System.out.print(j+" ");
        }
      }
      System.out.println(" ");
    }
     
  }
}