package Lv2;

import java.util.List;
import java.util.Scanner;

public class CP2 {
    public static void main(String[] args) {
        // Calculator.Java 인스턴스를 생성했습니다.
        Calculator calculator = new Calculator(); //calculator이 부분에서 C로 적어서 오류가남..Cannot find symbol 원인
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.print("첫 번째 숫자를 입력해주세요 (종료를 원하시면 Exit 입력해주세요): ");
                    String input1 = sc.nextLine();
            if (input1.equalsIgnoreCase("Exit")) {
                    System.out.println("프로그램을 종료하겠습니다.");
                break;
            }

            // 첫번째 숫자가 올바르지 못할때 예외처리입니다
            int num1 = 0;
            try {
                num1 = Integer.parseInt(input1);
            } catch (NumberFormatException e) {
                System.out.println("잘못된 숫자 입력입니다. 다시 시도해주세요.");
                continue;
            }
            calculator.setFirstnumber(num1);

            System.out.print("두 번째 숫자를 입력해주세요: ");
            String input2 = sc.nextLine();

            // 두번째 숫자가 올바르지 못할때 예외처리입니다

            int num2 = 0;
            try {
                num2 = Integer.parseInt(input2);
            } catch (NumberFormatException e) {
                System.out.println("잘못된 숫자 입력입니다. 다시 시도해주세요.");
                continue;
            }
            calculator.setSecondnumber(num2);


            System.out.print("원하시는 계산에 필요한 사칙연산 기호를 입력해주세요 (+, -, *, /): ");
            char operator = sc.nextLine().charAt(0);
            calculator.setOperator(operator);

            // Calculator 클래스를 사용하여 계산 수행햇습니다
            int answer = calculator.calculate();

            System.out.println("결과값: " + answer);

            System.out.print("추가로 계산하시겠습니까? (Exit 입력 시 종료, remove 입력시 첫결과 삭제하겠습니다): ");
            String command = sc.nextLine();
            if (command.equalsIgnoreCase("Exit")) {
                System.out.println("프로그램을 종료하겠습니다.");
                break;
            } else if (command.equalsIgnoreCase("remove")) {
                // 가장 먼저 저장된 결과를 삭제하는 부분입니다.
                calculator.removeFirstResult();
                System.out.println("첫번쨰로 한 계산 결과가 삭제되었습니다.");
            }

            // Setter 메서드를 사용하여 새로운 리스트를 설정했습니다
            calculator.setResults(answer);
            List<Integer> results1 = calculator.getResults();
            for (Integer i : results1) {
                System.out.println("지금까지 연산결과 =" + i);
            }
        }

        sc.close();
    }
}