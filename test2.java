import java.util.Scanner;
public class test{
    public static void main(String[] args){
        System.out.print("Enter a integer-->");
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=N;i++){
            // System.out.print(N-i);
            for(int j=1;j<=N-i;j++){
                //System.out.print(j);
                System.out.print(" ");
            }
            
              for(int k=1;k<=i;k++){
                  System.out.print("*");
              }
            System.out.println();
        }
    }
}