import java.util.Scanner;
public class binary{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
         int b[]=new int[100];
         int i=0;
        while(d!=0){
            b[i++]=d%2;
            d=d/2;
            
        }
        for( int j=i-1;j>=0;j--)
         System.out.print(b[j]);
          sc.close();
        }
    

}