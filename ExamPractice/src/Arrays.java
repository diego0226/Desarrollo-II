import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        //values10();
        //average();
        //doubleArray();
        array24();
    }

    public static void values10() {
        Scanner sc = new Scanner(System.in);
        int[] values = new int[10];
        
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the value: ");
            values[i] = sc.nextInt();
            
        }

        for (int i : values) {
            System.out.print(i + " ");
        }
    }

    public static void average() {
        Scanner sc = new Scanner(System.in);
        
        int[] values = new int[5];
        int positive = 0;
        int countPositive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < values.length; i++) {
            System.out.print("Enter the value: ");
            values[i] = sc.nextInt();
            if(values[i] > 0){
                countPositive++;
                positive = positive + values[i];
            }else if(values[i] < 0){
                negative++;
            }else{
                zero++;
            }
        }

        int media = positive / countPositive;
        System.out.println("Media positives: " + media);
        System.out.println("Negative: " + negative);
        System.out.println("Zeros: " + zero);
    }

    public static void doubleArray() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        int[] b = {11, 12, 13, 14, 15, 16, 17, 18, 19 ,20};
        int[] c = new int[20];

        int index = 0;
        for (int i = 0; i < 10; i++) {
            c[index++] = a[i];
            c[index++] = b[i];
        }

        for (int i : c) {
            System.out.print(i + " ");
        }
    }

    public static void array24() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] b = {13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
        int[] c = new int[a.length + b.length];
        int count = 0;
        for (int i = 0; i < 12; i+= 3) {
            for (int j = 0; j < 3; j++) {
                c[count++] = a[i + j];
            }

            for (int j = 0; j < 3; j++) {
                c[count++] = b[i + j];
            }
        }

        
        
        for (int i : c) {
            System.out.print(i + " ");
        }
    }




}
