package CO1;

import java.util.Scanner;
class addMatrixCo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr1[][] = new int[row][col];
        int arr2[][] = new int[row][col];
        int arr3[][] = new int[row][col];
        System.out.println("Enter the elements of first matrixOne");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of second matrixTwo");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("The first matrixOne is");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The second matrixTwo is");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();   
        }
    }    
}
