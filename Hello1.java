import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Array to Diagonals Pattern
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[] ar=new int[a];
		for(int i=0;i<a;i++){
		    ar[i]=sc.nextInt();
		}
		for(int i=0;i<a;i++){
		    for(int j=0;j<a;j++){
		        if(i==j||j==a-i-1){
		            System.out.print(ar[j]);
		        }
		        else{
		            int n=(int)Math.log10(ar[j])+1;
		           for(int k=0;k<n;k++)
		            System.out.print("*");
		        }
		    }
		    System.out.println();
		}

	}
}
