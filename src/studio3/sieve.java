import java.util.Scanner;

public class sieve {


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int arr[] = new int[n-1];

        for(int i=0; i<n-1;i++){
            arr[i] = i+2;
            //System.out.println(arr[i]);
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]!=0){
                System.out.println(arr[i]);
                for(int j=i+1;j<n-1;j++){
                    if(arr[j]%arr[i]==0)
                    arr[j]=0;
                }
            }

        }


    }
}
