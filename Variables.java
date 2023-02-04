//java 변수 기초에 대한 클래스입니다

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
//        버스 카드 처리하는 단말기 프로그램입니다 .

    System.out.println("학생이면 student, 성인이면 adult");
    Scanner sc2= new Scanner(System.in);
    String input =sc2.nextLine();
    if(input.equals("student")) {
        System.out.println("버스요금은 500원입니다");
    }else{
        System.out.println("버스요금은 1000원입니다");
    }


    }
}