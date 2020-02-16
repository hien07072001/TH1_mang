
import java.util.Scanner;

public class reverseElement {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhap So luong phan tu ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("sl phai <20 .Vui long nhap lai");
        } while (size > 20);
        int[] array;
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("phan tu " + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("mang da nhap:");
        for (int j=0;j<array.length;j++){
            System.out.print(array[j]+"/t");
        }
        for (int j=0;j<array.length/2;j++){
            int  temp=array[j];
            array[j]=array[size-1-j];
            array[size-1-j]=temp;

        }
        System.out.print("mang dao nguoc:");
        for (int j=0;j<array.length;j++)
            System.out.print(array[j]+"/t");

    }
}
