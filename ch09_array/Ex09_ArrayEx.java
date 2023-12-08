package ch09_array;

import java.util.Scanner;

public class Ex09_ArrayEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nosA = null;//학생의 점수 배열 1.2.3...

        boolean run = true;

        while (run) {
            System.out.println("------------------------------------------------------");
            System.out.println("1.학생수입력 | 2.점수입력 | 3.점수목록 | 4.분석 | 5.종료");
            System.out.println("------------------------------------------------------");
            System.out.print("선택> ");
            int select = scanner.nextInt();

            if (select == 1) {//학생수 입력
                System.out.print("학생수> ");
                int nos = scanner.nextInt();
                if(nos > 0) {
                    nosA = new int[nos];
                }else{
                    System.out.println("잘못된 입력방식 입니다");
                }


            }else if (select == 2) {//점수 입력
                for (int i = 0; i < nosA.length; i++) {
                    System.out.print(i+1+"번 학생의 점수: ");
                    nosA[i] = scanner.nextInt();

                    }
                }

            } else if (select == 3) {//점수 목록
                for (int i = 0; i < nosA.length; i++) {
                    System.out.println(i+1+"번 학생의 점수: " + nosA[i]);

                }


            } else if (select == 4) {//분석
                int max = 0; //최고점수
                int avgp = 0; //평균점수합
                int temp = 0;
                for (int i = 0; i < nosA.length; i++) {
                    if(max < nosA[i]){
                        max = nosA[i];
                    }
                    avgp = avgp + nosA[i];
                }
                System.out.println("최고점수: " + max);
                System.out.println("평균점수: " + (double)(avgp / nosA.length));
                for (int i = 0; i < nosA.length; i++) {
                    for (int j = i+1; j < nosA.length; j++) {
                        if(nosA[i] < nosA[j]){
                            temp = nosA[i];
                            nosA[i] = nosA[j];
                            nosA[j] = temp;
                        }
                    }
                    System.out.println((i+1) + "등: " + nosA[i]);
                }


            } else if (select == 5) {//종료
                System.out.println("종료 합니다");
                run = false;
            }

        }
    }
}
