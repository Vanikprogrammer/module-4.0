package module4;

import java.util.Scanner;

/**
 * Created by 1 on 11.07.2017.
 */
public class Function {

    public static void sum(int a){
        for(int i = 1; i < a + 1; i++){
            System.out.print(i + " ");
        }
    }
    public static void drawRectangle (int a, int b){
        for(int i = 0; i < b; i++){
            for(int j = 0; j < a; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
    }
    public static void drawRectangle (int a){
        for(int i = 0; i < a; i++){
            for(int j = 0; j < a; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
    }
    public static void getMax(int a, int b){
        if(a > b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
    public static void getMax(float a, float b){
        System.out.println("Enter two numbers: ");
        if(a > b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
    public static int recSum(int a){
        int x;
        if(a == 0)
            return 0;
        x = recSum(a - 1) + 1;
        System.out.print(x + " ");

        return x;
    }
    public static void recDraw(int weight){
        if(weight > 0){
            System.out.print("+ ");
            recDraw(weight-1);
        }
}
    private static void recDraw(int weight, int height){
        System.out.println("Enter two numbers: ");
        if(height > 0){
            recDraw(weight);
            System.out.println();
            recDraw(weight,height - 1);
        }
    }
    public static void RecDraw(int a,int b){
        final int x = a;
        if(a > 0){
            System.out.print("+ ");
            RecDraw(a - 1,b);
        }if(a==0&&b > 0){
            System.out.println();
            RecDraw(a+x,b-1);
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the task number: ");
        int task = sc.nextInt();
        int argument;
        float argument1;
            switch (task) {
                case 1:
                    System.out.println("Task № 1. Enter number: ");
                    argument = sc.nextInt();
                    sum(argument);
                    break;
                case 2:
                    System.out.println("Task № 2. Enter two numbers: " );
                    argument = sc.nextInt();
                    drawRectangle(argument,argument);
                    break;
                case 3:
                    System.out.println("Task № 3. Enter number: ");
                    argument = sc.nextInt();
                    drawRectangle(argument);
                    break;
                case 4:
                    System.out.println("Task № 4. Enter two numbers: ");
                    argument = sc.nextInt();
                    getMax(argument,argument);
                    break;
                case 5:
                    System.out.println("Task № 4. Enter two fractional numbers: ");
                    argument1 = sc.nextFloat();
                    getMax(argument1,argument1);
                    break;
                case 6:
                    System.out.println("Task № 6. Enter number: ");
                    argument = sc.nextInt();
                    recSum(argument);
                    break;
                case 7:
                    System.out.println("Task № 6. Enter two numbers: ");
                    argument = sc.nextInt();
                    recDraw(argument,argument);
                default:
                    System.out.println("You entered an invalid task number. Do you want to continue?: Y/N");


            }
    }
}
