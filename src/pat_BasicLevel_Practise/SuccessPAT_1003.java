package pat_BasicLevel_Practise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author kangbuu
 * @date 2018/4/3 21:43
 * *********************************
 * 得到“答案正确”的条件是：
 * 1. 字符串中必须仅有P, A, T这三种字符，不可以包含其它字符；
 *      ->只能包含 P A T " "
 * 2. 任意形如 xPATx 的字符串都可以获得“答案正确”，其中 x 或者是空字符串，或者是仅由字母 A 组成的字符串；
 *      ->A 可以在 PAT 左右两边
 * 3. 如果 aPbTc 是正确的，那么 aPbATca 也是正确的，其中 a, b, c 均或者是空字符串，或者是仅由字母 A 组成的字符串。
 *      ->a b c要么都是空字符串，要么都是由A 组成的字符串。可以出现在前后或者是 P后
 * 输入格式： 每个测试输入包含1个测试用例。第1行给出一个自然数n (<10)，是需要检测的字符串个数。接下来每个字符串占一行，字符串长度不超过100，且不包含空格。
 *                                                                              -> 不包含空格？
 * 输出格式：每个字符串的检测结果占一行，如果该字符串可以获得“答案正确”，则输出YES，否则输出NO。
 * 输入样例：
 * 8
 * PAT
 * PAAT
 * AAPATAA
 * AAPAATAAAA
 * xPATx
 * PT
 * Whatever
 * APAAATAA
 * 输出样例：
 * YES
 * YES
 * YES
 * YES
 * NO
 * NO
 * NO
 * NO
 */
public class SuccessPAT_1003 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        String pattern = "[^PAT]";

        String[] pats = new String[count];

        for (int i = 0; i < pats.length; i++) {

            pats[i] = scanner.next();

            if (pats[i].contains("P") && pats[i].contains("A") && pats[i].contains("T")){

            }
        }



    }
}
