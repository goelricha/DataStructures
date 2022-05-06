import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //  Array
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter size of Array: ");
        int sizeOfArray=sc.nextInt();
        int[] A = new int[sizeOfArray];
        System.out.println();
        System.out.print("Please Enter "+sizeOfArray+" Numbers : ");
        for(int i=0;i<sizeOfArray;i++){
            A[i]=sc.nextInt();
        }
        myArray arr=new myArray(A);
        System.out.print("Input Array : ");
        for(int i=0;i<A.length;i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();

        //Start : Reverse of Array
        // arr.reverse(0, 10);
        // System.out.print("Reverse Array : ");
        // for(int i=0;i<A.length;i++){
        //     System.out.print(A[i] + " ");
        // }
        //End : Reverse of Array

        //Start : Rotation of Array
        arr.rotate(4);
        System.out.print("Rotation Array : ");
        for(int i=0;i<A.length;i++){
            System.out.print(A[i] + " ");
        }
        //End : Rotation of Array


        sc.close();
    }
}
