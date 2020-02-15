package ���ֱ��;

import java.util.Scanner;

/*���дһ���������������﷨Ҫ��

�������壺���� Ǯ�� ���� ��
���㣨�ӷ�����Ǯ�� ���� ��
���㣨��������Ǯ�� ���� ��
��������� Ǯ�� or ���� ���ַ�����
����Ҫ��

ѡ����� Ǯ�� ���� ʮ �� ���� ��Ǯ̫���ˡ� ���� ���� ���������ˡ�*/
public class Helloworld2 {
	private static final String[] nums = new String[] { "��", "һ", "��", "��", "��", "��", "��", "��", "��", "��" };
	private static final String[] units = new String[] { "", "ʮ", "��", "ǧ", "��", "ʮ", "��", "ǧ", "��", "ʮ", "��", "ǧ" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("�����룺");
		String[] split = entry().split("\\s+");
		a = CharacterArabic(split[3]);
		a=judge(entry(),a);
		a=judge(entry(),a);
		 String str1=null;
		 str1=sc.nextLine();
	    printf(entry(),a);	
	    }
	public static String entry() {//���뺯���������ַ���
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String str = null;
		str = sc.nextLine();
		return str;
		
	}
	public static int judge(String str,int a) {//����Ӽ�
		String[] split = str.split("\\s+");
		if (split[1].equals("����"))
		   a = a + CharacterArabic(split[2]);
		else if(split[1].equals("����"))
			a = a - CharacterArabic(split[2]);
		else
			System.out.println("��������");
	    return a;
		
	}
	public static void printf(String str,int a){//��ӡ������
		String[] split = str.split("\\s+");
		System.out.println(ArabicCharacter(a));
		if (a > CharacterArabic(split[4]))
			System.out.println(split[6]);
		else
			System.out.println(split[9]);
	}
	public static String ArabicCharacter(int input) {// ����������ת��������

		String output = "";
		int count = 0;
		while (input > 0) {
			output = nums[input % 10] + units[count] + output;
			input = input / 10;
			count++;
		}

		return output.replaceAll("��[ǧ��ʮ]", "��").replaceAll("��+��", "��").replaceAll("��+��", "��").replaceAll("����", "����")
				.replaceAll("��+", "��").replaceAll("��$", "");
	}

	public static int CharacterArabic(String s) {// ��������ת����������
		int i = s.indexOf("��");
		if (i != -1) {
			int l = CharacterArabic(s.substring(0, i));
			int r = CharacterArabic(s.substring(i + 1));
			return l * 10000 + r;
		}
		i = s.indexOf("ǧ");
		if (i != -1) {
			int l = CharacterArabic(s.substring(0, i));
			int r = CharacterArabic(s.substring(i + 1));
			return l * 1000 + r;
		}
		i = s.indexOf("��");
		if (i != -1) {
			int l = CharacterArabic(s.substring(0, i));
			int r = CharacterArabic(s.substring(i + 1));
			return l * 100 + r;
		}
		i = s.indexOf("ʮ");
		if (i != -1) {
			int l = CharacterArabic(s.substring(0, i));
			if (l == 0)
				l = 1;
			int r = CharacterArabic(s.substring(i + 1));
			return l * 10 + r;
		}
		i = s.indexOf("��");
		if (i != -1) {
			int l = CharacterArabic(s.substring(0, i));
			int r = CharacterArabic(s.substring(i + 1));
			return l + r;
		}
		i = 0;
		switch (s) {
		case "��":
			return 9;
		case "��":
			return 8;
		case "��":
			return 7;
		case "��":
			return 6;
		case "��":
			return 5;
		case "��":
			return 4;
		case "��":
			return 3;
		case "��":
			return 2;
		case "һ":
			return 1;
		}
		return 0;
	}

}
