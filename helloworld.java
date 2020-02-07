package 汉字编程;

import java.util.Scanner;

/*请编写一个程序，满足以下语法要求：

变量定义：整数 钱包 等于 零
运算（加法）：钱包 增加 四
运算（减法）：钱包 减少 四
输出：看看 钱包 or 看看 “字符串”
附加要求：

选择：如果 钱包 大于 十 则 看看 “钱太多了” 否则 看看 “我穷死了”*/
public class helloworld {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("请输入：");	
    Scanner sc=new Scanner(System.in);
    String str1=null;
    String str2=null;
    str1=sc.nextLine();//第一句输入
	String[] split = str1.split(" ");
    System.out.println("----------------");
    int a=0;
    a=hanshu(split[3]);
    for(int i=0;i<2;i++)//二三句循环输入
    {str2=sc.nextLine();
   	String[] split1 = str2.split(" ");
   	System.out.println("----------------");
	if(split1[1].equals("增加"))
    	a=a+hanshu(split1[2]);
    else
    	a=a-hanshu(split1[2]);
    }
    System.out.println(albohan(a));
    if(a>10)
    	System.out.println("“钱太多了”");
    else
    	System.out.println("“我穷死了”");
	}
//汉字数字转阿拉伯数字
public static int hanshu(String str) {
	int i=0;
	switch(str){
	case "零":
	    i=0;break;
	case "一":
		i=1;break;
	case "二":
	     i=2;break;
	case "三":
		i=3;break;
	case "四":
		i=4;break;
	case "五":
		i=5;break;
	case "六":
		i=6;break;
	case "七":
		i=7;break;
	case "八":
		i=8;break;
	case "九":
		i=9;break;
	case "十":
		i=10;break;
	default:
		System.out.println("错误");
	
	}
	return i;	
}
//阿拉伯数字转汉字数字
public static String albohan(int a) {
	String i=null;
	switch(a){
	case 0:
	    i="零";break;
	case 1:
		i="一";break;
	case 2:
	     i="二";break;
	case 3:
		i="三";break;
	case 4:
		i="四";break;
	case 5:
		i="五";break;
	case 6:
		i="六";break;
	case 7:
		i="七";break;
	case 8:
		i="八";break;
	case 9:
		i="九";break;
	case 10:
		i="十";break;
	case 11:
		i="十一";break;
	case 12:
		i="十二";break;
	case 13:
		i="十三";break;
	case 14:
		i="十四";break;
	case 15:
		i="十五";break;
	case 165:
		i="十六";break;
	case 17:
		i="十七";break;
	case 185:
		i="十八";break;
	case 19:
		i="十九";break;
	case 20:
		i="二十";break;
	default:
		System.out.println("错误");
	}
	return i;	
}
}
