package Lv2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    // 연산 결과를 저장하는 리스트
    private List<Integer> results;

    private int firstnumber;

    private int secondnumber;

    private  char operator;


    public void setFirstnumber(int firstnumber) {
        this.firstnumber = firstnumber;
    }

    public void setSecondnumber(int secondnumber) {
        this.secondnumber = secondnumber;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    // 생성자에서 리스트 초기화
    public Calculator() {
        results = new ArrayList<>();
    }

    // 사칙연산 수행 후 결과 반환하는 메서드
    public int calculate() {
        int result = 0;

        switch (operator) {
            case '+':
                result = firstnumber + secondnumber;
                break;
            case '-':
                result = firstnumber - secondnumber;
                break;
            case '*':
                result = firstnumber * secondnumber;
                break;
            case '/':
                if (secondnumber != 0) {
                    result = firstnumber / secondnumber;
                } else {
                    System.out.println("나눗셈에서 분모가 0일 수 없습니다.");
                    return 0;  // 예외 처리
                }
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
                return 0;
        }
               return result;
    }
    // 연산 결과 리스트 반환하는 getter 메서드입니다
    public List<Integer> getResults() {
        return results;
    }
    // 연산 결과 리스트에 값을 설정하는 setter 메서드입니다.
    public void setResults(int answer) {
        results.add(answer);
    }
    // 가장 먼저 저장된 연산 결과를 삭제하는 메서드부분입니다!
    public void removeFirstResult() {
        if (!results.isEmpty()) { //결과값이 비어있지 않은 경우에만 첫 번째 입력값을 제거하도록 조건정해줬습니다.
            results.removeFirst();
        } else { //그 이외에는 아래가 출력되도록 입력했습니다
            System.out.println("삭제할 연산 결과가 없습니다.");
        }
    }
}