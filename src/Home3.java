import java.util.Scanner;
public class Home3 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input num1 ");
        int num1 = in.nextInt();//первое число
        System.out.print("Input num2 ");
        int num2 = in.nextInt();//второе число
                int a = num1 + num2;
        int b = num1*num2;
        int c = num1/num2;
        int d = num1-num2;
        int e = num1%num2;
        boolean f = num1 == num2;
        boolean g = num1>num2;
System.out.println("Сумма двух чисел "+ a);
        System.out.println("Произведение двух чисел "+ b);
        System.out.println("Результат деления двух чисел "+ c);
        System.out.println("Деление по модулю "+ d);
        System.out.println("Типы чисел равны? "+ e);
        System.out.println("Второе число больше? "+ (num1 == num2));
        System.out.println("Первое число больше? "+ (num1 > num2));
    }

}
