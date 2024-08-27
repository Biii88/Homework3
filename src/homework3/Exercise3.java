
package homework3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang");
        int n = scanner.nextInt();
        int[] x = new int[n];
        System.out.println("Nhap cac phan tu cua mang ");
        for(int i = 0;i<n;i++){
            x[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0;i<n;i++){
            sum = sum + x[i];
        }
        double average = (double) sum/n;
        System.out.println("Tong cac phan tu trong mang la: " +sum);
        System.out.println("Gia tri trung binh cac phan tu trong mang la: " +average );
    }
            
}
