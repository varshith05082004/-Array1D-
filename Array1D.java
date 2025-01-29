import java.util.Scanner;
public class Array1D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.of elements in array:");
        int n=sc.nextInt();
        int[] array=new int[n];
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("the elements of the array are:");
        for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }
        sc.close();
    }
    
}
