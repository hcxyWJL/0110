package String常用方法;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.UnsupportedEncodingException;

public class StringTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str="abcdefg";

        /*
        charAt(int index)
        返回 char指定索引处的值。
        */
        System.out.println("charAt(0)=\t" + str.charAt(0));


        /*
        concat(String str)
        将指定的字符串连接到该字符串的末尾
         */
        String str1="hjklmn";
        String str2 = str.concat(str1);
        System.out.println("str.concat(str1)、str2=\t"+str2);

        /*contains(CharSequence s)
         当且仅当此字符串包含指定的char值序列时才返回true。*/
        CharSequence s1="abc";
        boolean b =str.contains(s1);
        System.out.println("contains=\t" + b);

        /*endsWith(String suffix)
        测试此字符串是否以指定的后缀结尾。*/
        String a="eg";
        b=str.endsWith(a);
        System.out.println("endsWith=\t"+ b);

        /*equals(Object anObject)
        将此字符串与指定对象进行比较*/
        b=str.equals(str);
        System.out.println("equals str与str=\t" + b);
        b=str.equals(str1);
        System.out.println("equals str与str1=\t" + b);

        /*getBytes(String charsetName)
        使用命名的字符集将此 String编码为字节序列，将结果存储到新的字节数组中*/
        byte dd[]=str.getBytes("GBK");
        byte dd1[]=str.getBytes("UTF-8");
        byte dd2[]=str.getBytes("ISO8859-1");
        System.out.println("GBK:\t" + dd.length);
        System.out.println("UTF-8:\t" + dd1.length);
        System.out.println("ISO8859-1:\t" + dd2.length);
        /*indexOf(String str)返回指定子字符串第一次出现的字符串内的索引。 */
        String TT="efg";
        int gg=str2.indexOf(TT);
        System.out.println("第一次出现efg的位置：" + gg);
        /*lastIndexOf(String str)
        返回指定子字符串最后一次出现的字符串中的索引。
        */
        String repeat="abcabcabcdefg";
        String son="abc";
        gg=repeat.lastIndexOf(son);
        System.out.println("最后一次出现abc的位置："+gg);
        /*
        - length()
        */
        gg=str.length();
        System.out.println("str的长度为：" + gg);
        /*
        matches(String regex)
        告诉这个字符串是否匹配给定的 regular expression 。
        */
        String Str = new String("我是一只小小鸟");
        System.out.println("返回值 :"+Str.matches("(.*)一只(.*)"));
        /*
        -replace(char oldChar, char newChar)
        */
            String str23="hechi";
            String newStr=str23.replace('h','H');
            System.out.println("替换后的结果："+newStr);
            System.out.println("原本的字符串" + str23);
        /*
        split(String regex)
        将此字符串分割为给定的 regular expression的匹配
        */
       String hi="我有一只珍珠鸟，它很肥，还有一只小蜘蛛，它很丑";
        String tr[]=hi.split("，");
        for (int i =0 ;i<tr.length;i++)
        {
            System.out.println("第"+(i+1)+"次拆分: "+tr[i]);
        }
        /*
        - startsWith(String prefix)
        测试此字符串是否以指定的前缀开头
        */
        boolean bool=str.startsWith("abc");
        System.out.println(bool);
         /*

        - substring(int beginIndex)
        */

         /*
        - toString()
        - toLowerCase()
        - toUpperCase()
        - trim()
        - valueOf(float f)

         */
    }
}
