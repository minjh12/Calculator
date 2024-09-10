# Java로 구현한 계산기 프로그램
CP1, CP2 클래스는 프로그램의 실행 흐름을 담당하며, 사용자로부터 입력을 받아 Calculator 객체를 사용해 계산을 수행하고 그 결과를 처리하는 역할을 합니다.
![image](https://github.com/user-attachments/assets/945edcf0-5ce7-4d24-8d20-2d7936bb90cf)
위에서 Calculator 객체를 생성하여 사용자 입력을 처리할 준비를 합니다. Scanner 객체를 사용하여 사용자로부터 입력을 받는 부분입니다

![image](https://github.com/user-attachments/assets/34fc601d-b4a1-402a-86e1-fb14e7298dc9)
while (true) 루프는 프로그램이 계속 실행되도록 구현하였고, 제가 "Exit"을 입력하면 루프가 종료되어 프로그램이 종료됩니다. 이 부분은 프로그램 종료에 대한 흐름을 제어하는데 중요한 코드입니다!
![image](https://github.com/user-attachments/assets/406578d4-337c-4c3b-98d7-32555e7bcb8f)
첫 번째,두번째 숫자를 입력받은 후, Integer.parseInt()를 통해 문자열을 정수로 변환합니다. 만약 잘못된 입력이 들어오면게 된다면NumberFormatException 예외를 발생시키고, 이 예외를 처리하여 잘못된 입력을 다시 받도록 구혔습니다. 입력받은 숫자는 Calculator 객체의 첫 번째 ,두번째 숫자로 설정됩니다.
위 두개의 숫자를 입력받고 아래의 연산자를 입력받게되면 이를 처리하고 다시 입력을 할수있게 만들었습니다.
![image](https://github.com/user-attachments/assets/4cd8bda3-0a0a-4cec-a9ad-413038441e0d)
이렇게 두개의 숫자와 연산기호를 입력하시게 된다면
![image](https://github.com/user-attachments/assets/d7abad97-5cf7-4c92-b9c3-cec81c28f868)
Calculator 객체의 calculate() 메서드를 호출하여 계산을 수행하며, 결과를 출력할수있게 구현하였습니다. 또한 결과 출력후 사용자가 추자적인 명령(Exit 또는 remove)을 입력할수있게 만들었으며,각각 프로그램종료와 Calculator 객체에서 첫 번째 계산 결과가 삭제될수있게 만들었습니다
계산결과는 리스트에 저장되고,여태까지 누적된 계산결과를 출력하게 만들었습니다! 이를통해 제가 이전의 게산결과를 확인할수있게 구현했습니다.
