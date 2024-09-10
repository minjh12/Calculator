package Lv1;

import java.util.Scanner;

public class CP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력해주세요 (종료를 원하시면 Exit 입력해주세요): ");
            String input1 = sc.nextLine();
            if (input1.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료하겠습니다.");
                break;
            }

            int num1 = Integer.parseInt(input1);

            System.out.print("두 번째 숫자를 입력해주세요: ");
            int num2 = sc.nextInt();
            sc.nextLine();

            System.out.print("원하시는 계산에 필요한 사칙연산 기호를 입력해주세요 (+, -, *, /): ");
            char operator = sc.nextLine().charAt(0);

            int result = 0;

            switch (operator) {    // 조건(연산기호)에 따른 연산방식
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("나눗셈 연산에서 분모(Num2)에 0이 입력될 수 없습니다.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("올바른 연산기호를 입력해주세요.");
                    continue;
            }

            System.out.println("결과: " + result);
        }

        sc.close();
    }
}
