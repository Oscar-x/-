package 汉字编程;

import java.util.Scanner;

/*请编写一个程序，满足以下语法要求：

变量定义：整数 钱包 等于 零
运算（加法）：钱包 增加 四
运算（减法）：钱包 减少 四
输出：看看 钱包 or 看看 “字符串”
附加要求：

选择：如果 钱包 大于 十 则 看看 “钱太多了” 否则 看看 “我穷死了”*/
public class Helloworld2 {
	private static final String[] nums = new String[] { "零", "一", "二", "三", "四", "五", "六", "七", "八", "九" };
	private static final String[] units = new String[] { "", "十", "百", "千", "万", "十", "百", "千", "亿", "十", "百", "千" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入：");
		String[] split = entry().split("\\s+");
		a = CharacterArabic(split[3]);
		a=judge(entry(),a);
		a=judge(entry(),a);
		 String str1=null;
		 str1=sc.nextLine();
	    printf(entry(),a);	
	    }
	public static String entry() {//输入函数并返回字符串
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String str = null;
		str = sc.nextLine();
		return str;
		
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
		String[] split = str.split("\\s+");
		System.out.println(ArabicCharacter(a));
		if (a > CharacterArabic(split[4]))
			System.out.println(split[6]);
		else
			System.out.println(split[9]);
	}
	public static String ArabicCharacter(int input) {// 阿拉伯数字转汉字数字

		String output = "";
		int count = 0;
		while (input > 0) {
			output = nums[input % 10] + units[count] + output;
			input = input / 10;
			count++;
		}

		return output.replaceAll("零[千百十]", "零").replaceAll("零+万", "万").replaceAll("零+亿", "亿").replaceAll("亿万", "亿零")
				.replaceAll("零+", "零").replaceAll("零$", "");
	}

	public static int CharacterArabic(String s) {// 汉字数字转阿拉伯数字
		int i = s.indexOf("万");
		if (i != -1) {
			int l = CharacterArabic(s.substring(0, i));
			int r = CharacterArabic(s.substring(i + 1));
			return l * 10000 + r;
		}
		i = s.indexOf("千");
		if (i != -1) {
			int l = CharacterArabic(s.substring(0, i));
			int r = CharacterArabic(s.substring(i + 1));
			return l * 1000 + r;
		}
		i = s.indexOf("百");
		if (i != -1) {
			int l = CharacterArabic(s.substring(0, i));
			int r = CharacterArabic(s.substring(i + 1));
			return l * 100 + r;
		}
		i = s.indexOf("十");
		if (i != -1) {
			int l = CharacterArabic(s.substring(0, i));
			if (l == 0)
				l = 1;
			int r = CharacterArabic(s.substring(i + 1));
			return l * 10 + r;
		}
		i = s.indexOf("零");
		if (i != -1) {
			int l = CharacterArabic(s.substring(0, i));
			int r = CharacterArabic(s.substring(i + 1));
			return l + r;
		}
		i = 0;
		switch (s) {
		case "九":
			return 9;
		case "八":
			return 8;
		case "七":
			return 7;
		case "六":
			return 6;
		case "五":
			return 5;
		case "四":
			return 4;
		case "三":
			return 3;
		case "二":
			return 2;
		case "一":
			return 1;
		}
		return 0;
	}

}
