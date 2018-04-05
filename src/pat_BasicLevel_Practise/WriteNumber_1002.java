package pat_BasicLevel_Practise;

import java.util.Scanner;

/**
 * @author kangbuu
 * @date 2018/4/2 23:21
 * **********************************************
 * 读入一个自然数n，计算其各位数字之和，用汉语拼音写出和的每一位数字。
 * <p>
 * 输入格式：每个测试输入包含1个测试用例，即给出自然数n的值。这里保证n小于10^100。
 * <p>
 * 输出格式：在一行内输出n的各位数字之和的每一位，拼音数字间有1 空格，但一行中最后一个拼音数字后没有空格。
 * <p>
 * 输入样例：
 * <p>
 * 1234567890987654321123456789
 * <p>
 * 输出样例：
 * <p>
 * yi san wu
 */
public class WriteNumber_1002 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String num = scanner.next();

        char[] nums = num.toCharArray();

        int sum = 0;

        //对 char 进行 int 计算
        for (char oneNum : nums) {

            sum = oneNum - '0' + sum;
        }

        //计算的结果 --> char数组
        char[] results = String.valueOf(sum).toCharArray();

        //没有线程问题存在，StringBuilder 速度更快
        StringBuilder sb = new StringBuilder();

        for (char result : results) {

            switch (result) {
                case '1':
                    sb.append(" yi");
                    break;
                case '2':
                    sb.append(" er");
                    break;
                case '3':
                    sb.append(" san");
                    break;
                case '4':
                    sb.append(" si");
                    break;
                case '5':
                    sb.append(" wu");
                    break;
                case '6':
                    sb.append(" liu");
                    break;
                case '7':
                    sb.append(" qi");
                    break;
                case '8':
                    sb.append(" ba");
                    break;
                case '9':
                    sb.append(" jiu");
                    break;
                case '0':
                    sb.append(" ling");
                    break;
            }
        }

        //去首尾空格
        System.out.println(sb.toString().trim());
    }
}