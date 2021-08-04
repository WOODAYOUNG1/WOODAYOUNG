package kr.ac.daegu.wdy;

import com.sun.deploy.nativesandbox.NativeSandboxOutputStream;
import jdk.nashorn.internal.objects.NativeMath;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.function.Function;

public class Main {

    public static <function> void main(String[] args) {
//3명 학생의 국어 영어 2과목의 점수를 입력받아서/ 각 개인별로 평균이 80이상이면/ 합격,/ 그렇지 않으면 불합격 출력/ 합격한 사람의 수 출력/ 가능한한 함수로 분리해서 작성
        Scanner sc = new Scanner(System.in);
        System.out.println("1번 학생의 국어성적 을 입력하세요");
        String str = sc.nextLine();
        System.out.println("2번학생의 국어성적 을 입력하세요");
        String str2 = sc.nextLine();
        System.out.println("3번학생의 국어성적을 입력하세요");
        String str3 = sc.nextLine();
        System.out.println("1번 학생의 영어성적 을 입력하세요");
        String str4 = sc.nextLine();
        System.out.println("2번학생의 영어성적을 입력하세요");
        String str5 = sc.nextLine();
        System.out.println("3번학생의 영어성적을 입력하세요");
        String str6 = sc.nextLine();




    }


    }


   /* //문자열 입력받기
    Object var;

    Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 문자열 을 입력하세요");
                String str = sc.nextLine();
                System.out.println("두번째 문자열 을 입력하세요");
                String str2 = sc.nextLine();
                System.out.println("세번째 문자열 을 입력하세요");
                String str3 = sc.nextLine();
                System.out.println("네번째 문자열 을 입력하세요");
                String str4 = sc.nextLine();
                System.out.println("다섯번째 문자열 을 입력하세요");
                String str5 = sc.nextLine();


                StringBuilder sb = new StringBuilder( "12 " );
                sb.append( "5963" );
                sb.append( " 58");
                sb.append( " 1 ");
                sb.append( "45678 ");

                System.out.println(sb);

                String str6 = "125.963.581.456.78";
                StringTokenizer st = new StringTokenizer(str6,".");
                while(st.hasMoreTokens()) {
                System.out.println(st.nextToken());
                }
                */

    /*public static void main(String[] args) {
        //문자열의 길이 제한
        final int STR_LENGTH_LIMIT =50;
        // 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 문자열 을 입력하세요");
        String str = sc.nextLine();
        CheckStrLength(str, STR_LENGT_LIMIT); //임무: 문자열의 길이를 체크하여 개발자 정의 길이 이상이면 프로그램 종료시킴

        System.out.println("두번째 문자열 을 입력하세요");
        String str2 = sc.nextLine();
        CheckStrLength(str2);//임무: If를 대체하는 임무, 범위정하기
        System.out.println("입력받은 값(첫번째): " + str);
        System.out.println("입력받은 값(두번째): " + str2);
        int sum = str.length() + str2.length();
        System.out.println("=============");
        System.out.println("길이: " + sum);

    }*/


    /*public static void main(String[] args) {

        String s = "KoreanEnglish";
        int s_len = s.length();//길이 구하기

        System.out.println("문자열길이 : " + s_len);

    }*/





        /*public void practice2() {
            float yd = 91.44f;
            float in = 2.54f;
            float yardToCm = 2.1f * yd;
            float InchToCm = 10.5f * in;


            String strYardToCm = String.format("%.if", yardToCm);
            String strInchToCm = String.format("%.if", inchToCm);

            System.out.println("2야드toCm : " + strYardToCm);
            System.out.println("10.5인치toCm : " + strInchToCm);
        }*/




/*1야드(yd)는 91.44cm이고 1인치(in)는 2.54cm이다.
//2.1야드와 10.5인치를 각각 cm로 변환하여 다음 형식에 맞추어 소수 첫째자리까지 출력하시오.*/

