import java.util.*;
public class Hello {
    public static boolean diff(int a){
        int[] ar=new int[(int)Math.log10(a)+1];
        int i=0;
        while(a>0){
            ar[i++]=a%10;
            a/=10;
        }
        for(i=0;i<ar.length-1;i++){
            if(Math.abs(ar[i]-ar[i+1])!=1){
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
		//Step Numbers from ! to N
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		boolean print=true;
		for(int i=10;i<=a;i++){
		    if(diff(i)){
		        System.out.print(i+" ");
		        print=false;
		    }
		}
		if(print){
		    System.out.print("-1");
		}

	}
}
