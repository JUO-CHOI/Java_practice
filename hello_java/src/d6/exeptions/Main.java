package d6.exeptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scanner = new Scanner(System.in);
        Integer a = 10;
        Integer b = 0; // null이 있는 위치의 주소를 넣어줌. 결국 원시타입에 주소 못들어감
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
        try {
            // 예외가 발생할 수도 있는 곳
//            System.out.println(divide(a, b));
            System.out.println(divideToDouble(a, b)); // Java의 double에는 무한대 개념이 존재함 -> 0으로 나누면 Infinity 출력

        }
        catch (ArithmeticException | NullPointerException e) { // 객체 e
            // 예외가 발생하면 실행되는 곳
            System.out.println(String.format("Sorry, can't do that! : %s", e.getMessage()));
        }
//        catch (NullPointerException e) {
//            // 또다른 예외가 발생하면 실행되는 곳
//            System.out.println("null");
//        }
        finally {
            // 예외가 발생해서 catch가 실행되든 안되든 실행하는 곳
            System.out.println("Bye");
        }

        readFileContents(".gitignore");
        readFileContents("file-not-exist");

        try {
            readFileThrows("file-not-exist"); // 난 던질게 너가 알아서 처리해
        }
        catch (FileNotFoundException e) {
            System.out.println("File not Found");
        }
        readFileThrows("file-not-exist"); // main 전체를 throw 처리!
    }

    public static void readFileThrows(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }

    public static void readFileContents(String filename) {
        File file = new File(filename);
        // Checked exception은 어덯게든 코드 단위에서 예외처리를 선으로 해줘야 한다.
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine())
                System.out.println(scanner.nextLine());
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

//    // StackOverFlow
//    public static void recursive()  {
//        recursive();
//    }

    // 두 개의 정수를 받아 나누어서 정수 결과를 반환하는 정적 메서드 'divide'
    public static int divide(int a, int b) {
        return a / b;
    }

    public static double divideToDouble(int a, int b) {
        // 수동으로 예외를 발생시키고 싶다
        if (b == 0)
            throw new ArithmeticException("Division by Zero"); // 새로운 예외 객
        return (double) a / b;
    }
}
