import java.util.Scanner;

public class sievefast {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        System.out.println("what is n? (exclusive)");

        boolean arr[] =  new boolean[n];
        for(int i=0;i<n;i++){
            arr[i] = true;
        }

        for(int i=2;i<Math.sqrt(n);i++){
                if(arr[i]==true){
                    for(int j=i*i;j<n;j+=i){
                        arr[j] = false;
                    }
            }
        }
        for(int i=2;i<n;i++){
            if(arr[i]==true)
            System.out.println(i);
        }
    }
}
