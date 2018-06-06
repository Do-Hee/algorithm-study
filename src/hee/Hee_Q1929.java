package hee;

import java.util.ArrayList;
import java.util.Scanner;

// M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
// 첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1≤M≤N≤1,000,000)
public class Hee_Q1929 {
    static Scanner scanner = new Scanner(System.in);

    //                                 어떤 수 N이 소수인지 아닌지를 판단하는 시간복잡도: O(루트N)
//    static public boolean prime(int num){
//        if(num < 2){
//            return false; // num=0, 1이면 소수가 아니다
//        }
//        // 2 ~ 루트num까지 나누어지는지 확인한다
//        for (int i=2; i*i<=num; i++){
//            if(num%i == 0){
//                return false; // 소수가 아니다
//            }
//        }
//        return true;
//    }


    //                                 배열 런타임 에러
//    static public void run(){
//        int m = scanner.nextInt();
//        int n = scanner.nextInt();
//        boolean[] checkPrime = new boolean[n+1];
//
//        // 값 초기화
//        for (int i=0; i<=n; i++){
//            checkPrime[i] = true; // true이면 소수이다
//        }
//
//        // 에라토스테네스의 체
//        for (int i=2; i<=n; i++){
//            if(checkPrime[i] == true){
//                // 소수로 저장한 수의 배수들은 소수가 아니므로 false로 바꾼다
//                for (int j=i*i; j<=n; j+=i){
//                    checkPrime[j] = false;
//                }
//            }
//        }
//
//        // 값 출력
//        for (int i=m; i<=n; i++){
//            if(checkPrime[i] == true){
//                System.out.println(i);
//            }
//        }
//    }


    //                                 런타임 에러
    static public void run(){
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        ArrayList<Boolean> checkPrime = new ArrayList<>();

        // 값 초기화
        for (int i=0; i<=n; i++){
            checkPrime.add(i, true); // true이면 소수이다
        }

        // 에라토스테네스의 체
        for (int i=2; i<=n; i++){
            if(checkPrime.get(i) == true){
                // 소수로 저장한 수의 배수들은 소수가 아니므로 false로 바꾼다
                for (int j=i*i; j<=n; j+=i){
                    checkPrime.set(j, false);
                }
            }
        }

        // 값 출력
        for (int i=m; i<=n; i++){
            if(checkPrime.get(i) == true){
                System.out.println(i);
            }
        }
    }
}
