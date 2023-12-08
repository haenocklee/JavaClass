package ch09_array;

public class Ex07_ArrayEx {
    public static void main(String[] args) {
        int[] num = {3, 2, 1, 5, 4};
        int temp = 0;
        for (int i = 0; i < num.length; i++) {
            //j = i+1 이곳에서 j = 0이면 갱신될 때마다 값이 초기화 되서
            for (int j = i+1; j < num.length; j++) {
                if(num[i] > num[j]){
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            } System.out.println(num[i]);
        }
    }
}
