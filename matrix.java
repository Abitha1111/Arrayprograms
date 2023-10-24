package array;
import java.util.Scanner;
import java.util.Arrays;

public class matrix {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the no of rows for the first matrix: ");
	        int rowA = scanner.nextInt();
	        System.out.print("Enter the no of columns for the first matrix: ");
	        int colA = scanner.nextInt();

	        System.out.print("Enter the no of rows for the second matrix: ");
	        int rowB = scanner.nextInt();
	        System.out.print("Enter the no of columns for the second matrix: ");
	        int colB = scanner.nextInt();

	        if (colA != rowB) {
	            System.out.println("Matrix multiplication is not possible.");
	            return;
	        }

	        int[][] A = new int[rowA][colA];
	        int[][] B = new int[rowB][colB];

	        System.out.println("Enter elements of the first matrix:");
	        for (int i = 0; i < rowA; i++) {
	            for (int j = 0; j < colA; j++) {
	                A[i][j] = scanner.nextInt();
	            }
	        }

	        System.out.println("Enter elements of the second matrix:");
	        for (int i = 0; i < rowB; i++) {
	            for (int j = 0; j < colB; j++) {
	                B[i][j] = scanner.nextInt();
	            }
	        }

	        int[][] resultMatrix = new int[rowA][colB];

	        for (int i = 0; i < rowA; i++) {
	            for (int j = 0; j < colB; j++) {
	                for (int k = 0; k < colA; k++) {
	                    resultMatrix[i][j] += A[i][k] * B[k][j];
	                }
	            }
	        }

	        System.out.println("Resultant matrix after multiplication:");
	        for (int i = 0; i < rowA; i++) {
	            for (int j = 0; j < colB; j++) {
	                System.out.print(resultMatrix[i][j] + " ");
	            }
	            System.out.println();
	        }

	        scanner.close();
	    }
	}