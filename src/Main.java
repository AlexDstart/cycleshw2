import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 2-1");
        for (int year = 1904; year <2096 ; year=year+4) {
            System.out.println(year+ " Является високосным годом ");

        }
        System.out.println(" Задание 2-2 ");
        for (int i = 7; i <=98 ; i=i+7) {
            System.out.print( i + " ");
        }
        //task3
        System.out.println(" Задание 2-3 ");
        int number =1;
        System.out.print(number+" ");
        for (int i = 0; i <9 ; i++) {
            number=number*2;
            System.out.print(number+" ");

        }
    }
}