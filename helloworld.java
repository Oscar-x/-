package ���ֱ��;

import java.util.Scanner;

/*���дһ���������������﷨Ҫ��

�������壺���� Ǯ�� ���� ��
���㣨�ӷ�����Ǯ�� ���� ��
���㣨��������Ǯ�� ���� ��
��������� Ǯ�� or ���� ���ַ�����
����Ҫ��

ѡ����� Ǯ�� ���� ʮ �� ���� ��Ǯ̫���ˡ� ���� ���� ���������ˡ�*/
public class helloworld {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("�����룺");	
    Scanner sc=new Scanner(System.in);
    String str1=null;
    String str2=null;
    str1=sc.nextLine();//��һ������
	String[] split = str1.split(" ");
    System.out.println("----------------");
    int a=0;
    a=hanshu(split[3]);
    for(int i=0;i<2;i++)//������ѭ������
    {str2=sc.nextLine();
   	String[] split1 = str2.split(" ");
   	System.out.println("----------------");
	if(split1[1].equals("����"))
    	a=a+hanshu(split1[2]);
    else
    	a=a-hanshu(split1[2]);
    }
    System.out.println(albohan(a));
    if(a>10)
    	System.out.println("��Ǯ̫���ˡ�");
    else
    	System.out.println("���������ˡ�");
	}
//��������ת����������
public static int hanshu(String str) {
	int i=0;
	switch(str){
	case "��":
	    i=0;break;
	case "һ":
		i=1;break;
	case "��":
	     i=2;break;
	case "��":
		i=3;break;
	case "��":
		i=4;break;
	case "��":
		i=5;break;
	case "��":
		i=6;break;
	case "��":
		i=7;break;
	case "��":
		i=8;break;
	case "��":
		i=9;break;
	case "ʮ":
		i=10;break;
	default:
		System.out.println("����");
	
	}
	return i;	
}
//����������ת��������
public static String albohan(int a) {
	String i=null;
	switch(a){
	case 0:
	    i="��";break;
	case 1:
		i="һ";break;
	case 2:
	     i="��";break;
	case 3:
		i="��";break;
	case 4:
		i="��";break;
	case 5:
		i="��";break;
	case 6:
		i="��";break;
	case 7:
		i="��";break;
	case 8:
		i="��";break;
	case 9:
		i="��";break;
	case 10:
		i="ʮ";break;
	case 11:
		i="ʮһ";break;
	case 12:
		i="ʮ��";break;
	case 13:
		i="ʮ��";break;
	case 14:
		i="ʮ��";break;
	case 15:
		i="ʮ��";break;
	case 165:
		i="ʮ��";break;
	case 17:
		i="ʮ��";break;
	case 185:
		i="ʮ��";break;
	case 19:
		i="ʮ��";break;
	case 20:
		i="��ʮ";break;
	default:
		System.out.println("����");
	}
	return i;	
}
}
