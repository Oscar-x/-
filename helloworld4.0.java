package 汉字编程;

import java.util.Scanner;

/*请编写一个程序，满足以下语法要求�?

变量定义：整�? 钱包 等于 �?
运算（加法）：钱�? 增加 �?
运算（减法）：钱�? 减少 �?
输出：看�? 钱包 or 看看 “字符串�?
附加要求�?

选择：如�? 钱包 大于 �? �? 看看 “钱太多了�?? 否则 看看 “我穷死了�??*/
public class helloworld4.0 {
 private static final String[] nums = new String[] { "�?", "�?", "�?", "�?", "�?", "�?", "�?", "�?", "�?", "�?" };
 private static final String[] units = new String[] { "", "�?", "�?", "�?", "�?", "�?", "�?", "�?", "�?", "�?", "�?", "�?" };

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  System.out.println("请输入：");
  Scanner sc = new Scanner(System.in);
  String str1 = null;
  String str2 = null;
  String str3 = null;
  String str4 = null;
  str1 = sc.nextLine();// 第一句输�?
  String[] split = str1.split("\\s+");
  int a = 0;
  a = CharacterArabic(split[3]);
  str2 = sc.nextLine();
  str3 = sc.nextLine();
  a=judge(str2,a);
  a=judge(str3,a);
  str4 = sc.nextLine();
     printf(str4,a); 
     }
 public static int judge(String str,int a) {//计算加减
  String[] split = str.split("\\s+");
  if (split[1].equals("增加"))
     a = a + CharacterArabic(split[2]);
  else if(split[1].equals("减少"))
   a = a - CharacterArabic(split[2]);
  else
   System.out.println("错误输入");
     return a;
  
 }
 public static void printf(String str,int a){//打印输出结果
  String[] split2 = str.split("\\s+");
  System.out.println(ArabicCharacter(a));
  if (a > CharacterArabic(split2[4]))
   System.out.println(split2[6]);
  else
   System.out.println(split2[9]);
 }
 public static String ArabicCharacter(int input) {// 阿拉伯数字转汉字数字

  String output = "";
  int count = 0;
  while (input > 0) {
   output = nums[input % 10] + units[count] + output;
   input = input / 10;
   count++;
  }

  return output.replaceAll("零[千百十]", "�?").replaceAll("�?+�?", "�?").replaceAll("�?+�?", "�?").replaceAll("亿万", "亿零")
    .replaceAll("�?+", "�?").replaceAll("�?$", "");
 }

 public static int CharacterArabic(String s) {// 汉字数字转阿拉伯数字
  int i = s.indexOf("�?");
  if (i != -1) {
   int l = CharacterArabic(s.substring(0, i));
   int r = CharacterArabic(s.substring(i + 1));
   return l * 10000 + r;
  }
  i = s.indexOf("�?");
  if (i != -1) {
   int l = CharacterArabic(s.substring(0, i));
   int r = CharacterArabic(s.substring(i + 1));
   return l * 1000 + r;
  }
  i = s.indexOf("�?");
  if (i != -1) {
   int l = CharacterArabic(s.substring(0, i));
   int r = CharacterArabic(s.substring(i + 1));
   return l * 100 + r;
  }
  i = s.indexOf("�?");
  if (i != -1) {
   int l = CharacterArabic(s.substring(0, i));
   if (l == 0)
    l = 1;
   int r = CharacterArabic(s.substring(i + 1));
   return l * 10 + r;
  }
  i = s.indexOf("�?");
  if (i != -1) {
   int l = CharacterArabic(s.substring(0, i));
   int r = CharacterArabic(s.substring(i + 1));
   return l + r;
  }
  i = 0;
  switch (s) {
  case "�?":
   return 9;
  case "�?":
   return 8;
  case "�?":
   return 7;
  case "�?":
   return 6;
  case "�?":
   return 5;
  case "�?":
   return 4;
  case "�?":
   return 3;
  case "�?":
   return 2;
  case "�?":
   return 1;
  }
  return 0;
 }

}
