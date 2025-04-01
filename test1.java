import java.util.Scanner;
public class test1{
    public static void main(String[] args){
        System.out.print("Enter a integer-->");
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        
        for(int i=N;i>=1;i--){
            for(int j=N;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
