package pat_BasicLevel_Practise;

import java.util.Scanner;

/**
 * @author kangbuu
 * @date 2018/4/2 22:54
 * ***********************************
 * 卡拉兹(Callatz)猜想：
 *
 * 对任何一个自然数n，如果它是偶数，那么把它砍掉一半；如果它是奇数，那么把(3n+1)砍掉一半。这样一直反复砍下去，最后一定在某一步得到n=1。
 *
 * 我们今天的题目：对给定的任一不超过1000的正整数n，简单地数一下，需要多少步（砍几下）才能得到n=1？
 *
 * 输入格式：每个测试输入包含1个测试用例，即给出自然数n的值。
 *
 * 输出格式：输出从n计算到1需要的步数。
 * 输入样例：
 * 3
 * 输出样例：
 * 5
 */
public class CallatzGuess_1001 {
    public static void main(String[] args) {
        System.out.println("输入样例：");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int numCount = num;
        int step = 0;

        while (num != 1){
            if (num % 2 == 0) {
                num = num /2 ;
            } else {
                num = 3 * num + 1;
                num = num /2;
            }
            step++;
        }
        System.out.println("输出样例:\n" + step );
    }

}
