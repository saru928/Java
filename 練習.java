
public class 練習 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("こんにちは！！");
		System.out.println(123);
		System.out.println("おはよう");
		System.out.println(0);
		System.out.println("例外が発生しました。");
		System.out.println("例外が\n発生しました。");
		
		String str1 = "鈴木";
		System.out.println(str1);
		String tel = "090-1234-5678";
		System.out.println(tel);
		char char1 = 'A';
		System.out.println(char1);
		int num1 = 12345;
		System.out.println(num1);
		boolean boo = true;
		System.out.println(boo);
		int a = 3+3;
		System.out.println(a);
		String b = "3+3";
		System.out.println(b);
		String abc = "山田";
		System.out.println(abc + "さん");
		
		int a1 = 4 + 3;
		System.out.println(a1);
		int a2 = -8 - 3;
		System.out.println(a2);
		var a3 = -5 * 3;
		System.out.println(a3);
		var a4 = 4 / 2;
		System.out.println(a4);
		int a5 = 0 / 4;
		System.out.println(a5);
		int a6 = 10 / 3;
		System.out.println(a6);
		float a7 = (float)10 / 3;
		System.out.println(a7);
		double a8 = (double)10 / 3;
		System.out.println(a8);
		int a9 = 7 % 3;
		System.out.println(a9);
		System.out.println(5 % 3);
		
		int b1 = 10;
		System.out.println(++b1);
		System.out.println(++b1);
		System.out.println(++b1);
		System.out.println(++b1);
		int b2 = 5;
		System.out.println(b2++);
		System.out.println(b2++);
		System.out.println(b2++);
		System.out.println(b2++);
		
		int c1 = 10;
		System.out.println(--c1);
		System.out.println(--c1);
		System.out.println(--c1);
		System.out.println(--c1);
		int c2 = 10;
		System.out.println(c2--);
		System.out.println(c2--);
		System.out.println(c2--);
		System.out.println(c2--);
		
		int d1 = 10;
		if(d1 <20) {
			System.out.println("A");
		}
		String d2 = "山田";
		if(d2.equals("山田")) {
			System.out.println(d2 + "さん");
		}
		int d3 = 5;
		if(d3 < 10 && 3 < d3) {
			System.out.println("A");
		}
		int d4 = 5;
		if(d4 >= 5 || d4 <= 0) {
			System.out.println("B");
		}
		int d5 = 11;
		if(d5 > 8) {
			System.out.println("A");
		}else if(d5 < 10) {
			System.out.println("B");
		}
		int d6 = 3;
		if(d6 > 5) {
			System.out.println("A");
		}else {
			System.out.println("Z");
		}
		int d7 = 20;
		if(d7 < 8) {
			System.out.println("A");
		}else if(a == 8) {
			System.out.println("B");
		}else {
			System.out.println("C");
		}
		int age = 35;
		if(age < 20) {
			System.out.println("未成年");
		}else if(age >= 20 && age <= 80) {
			System.out.println("成人");
		}else {
			System.out.println("高齢者");
		}
		int d8 = 5;
		if(d8 % 2 == 0) {
			System.out.println("偶数");
		}else {
			System.out.println("奇数");
		}
		
		int e1 = 20;
		if(e1 >10) {
			if(e1 < 30) {
				System.out.println("A");
			}
		}
		int e2 = 7;
		if(e2 > 3) {
			if(e2 < 10) {
				System.out.println("A");
			}
		}
		int e3 = 10;
		if(e3 > 0) {
			if(e3 == 2) {
				System.out.println("A");
			}else if(e3 == 3) {
				System.out.println("B");
			}else {
				System.out.println("C");
			}
		}
		int number = 88;
		if(number <= 100) {
			if(number < 20) {
				System.out.println("未成年");
			}else if(number == 77) {
				System.out.println("喜寿");
			}else if(number == 88) {
				System.out.println("米寿");
			}else {
				System.out.println("成人");
			}
		}
		int number1 = 110;
		if(number1 <= 100) {
			if(number1 < 20) {
				System.out.println("未成年");
			}else if(number1 == 77) {
				System.out.println("喜寿");
			}else if(number1 == 88) {
				System.out.println("米寿");
			}else {
				System.out.println("成人");
			}
		}
		
		

	}

}
