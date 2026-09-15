import java.util.Scanner;

public class input {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        arr[0]=34;
        arr[1]=567;
        arr[2]=873;
        arr[3]=878;
        arr[4]=845;

        for(int i=0;i < arr.length; i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i < arr.length; i++){
            System.out.println(arr[i]+"");;
        }

    }
}
