
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
		
		int f1 = 1;
		switch(f1) {
			case 0:
				System.out.println("f1は0に等しい");
				break;
			case 1:
				System.out.println("f1は1に等しい");
				break;
		}
		int f2 = 5;
		switch(f2) {
			case 0:
				System.out.println("f2は0に等しい");
				break;
			case 1:
				System.out.println("f2は1に等しい");
				break;
			default:
				System.out.println("f2は0でも1でもない");
		}
		String f3 = "赤";
		switch(f3) {
			case "赤":
				System.out.println("赤組です");
				break;
			case "白":
				System.out.println("白組です");
				break;
		}
		String f4 = "青";
		switch(f4) {
			case "赤":
				System.out.println("赤組です");
				break;
			case "白":
				System.out.println("白組です");
				break;
			default:
				System.out.println("エラーです");
		}
		
		String[] name = new String[3];
		name[0] = "田中";
		name[1] = "高橋";
		name[2] = "斉藤";
		System.out.println(name[0]);
		
		String[] name1 = {"田中","高橋","斉藤"};
		System.out.println(name1[0]);
		
		char[] g1 = {'x','y','z'};
		System.out.println(g1[0]);
		
		char[] g2 = {'x','y','z'};
		System.out.println(g2[1]);
		
		String[] name2 = {"田中","高橋","斉藤"};
		name2[0] = "加藤";
		System.out.println(name2[0]);
		
		String[][] country = {
			{"日本","タイ"},
			{"アメリカ","ブラジル"},
			{"フランス","ロシア"}
		};
		System.out.println(country[0][0]);
		System.out.println(country[0][1]);
		System.out.println(country[1][0]);
		System.out.println(country[2][1]);
		
		String[][]country1 = new String[3][2];
		country1[0][0] = "日本";
		country1[0][1] = "タイ";
		country1[1][0] = "アメリカ";
		country1[1][1] = "ブラジル";
		country1[2][0] = "フランス";
		country1[2][1] = "ロシア";
		System.out.println(country[0][0]);
		
		
		for(int h1 = 0; h1 < 3; h1++) {
			System.out.println(h1);
		}
		for(int h2 = 1; h2 < 10; h2++) {
			System.out.println(h2);
		}
		for(int h3 = 3; h3 < 10; h3++) {
			System.out.println(h3);
		}
		for(int h4 = 3; h4 <= 10; h4++) {
			System.out.println(h4);
		}
		for(int h5 = 10; h5 > 5; h5--) {
			System.out.println(h5);
		}
		for(int h6 = 10; h6 >= 5; h6--) {
			System.out.println(h6);
		}
		for(int h7 = 1; h7 < 10; h7 += 2) {
			System.out.println(h7);
		}
		for(int h8 = 1; h8 < 10; h8 += 3) {
			System.out.println(h8);
		}
		for(int h9 = 10; h9 > 1; h9 -= 2) {
			System.out.println(h9);
		}
		for(int h10 = 10; h10 > 1; h10 -= 3) {
			System.out.println(h10);
		}
		for(int star = 1; star <= 5; star ++) {
			System.out.println("★");
		}
		
		for(int i1 = 1; i1 <= 10; i1++) {
			if(i1 % 2 == 0) {
				System.out.println(i1);
			}
		}
		for(int i2 = 0; i2 < 3; i2 ++) {
			for(int i3 = 1; i3 < 4; i3 ++) {
				System.out.println(i3);
			}
		}
		int i4 = 10;
		String i5 = i4 >= 0?"プラス":"マイナス";
		System.out.println(i5);
		
		int i6 = 2;
		String i7 = i6 % 2 == 0?"偶数":"奇数";
		System.out.println(i7);
		
		for(int i8 = 0; i8 <= 5; i8 ++) {
			String i9 = i8 % 2 == 0?"⭐︎":"★";
			System.out.println(i9);
		}
		
		int j1 = 1;
		while(j1 <= 5) {
			System.out.println(j1);
			j1 ++;
		}
		int j2 = 5;
		while(j2 < 10) {
			System.out.println(j2);
			j2 ++;
		}
		int j3 = 5;
		while(j3 > 0) {
			System.out.println(j3);
			j3 --;
		}
		int j4 = 10;
		while(j4 >= 5) {
			System.out.println(j4);
			j4 --;
		}
		int j5 = 1;
		while(j5 <= 10) {
			System.out.println(j5);
			j5 += 2;
		}
		int j6 = 1;
		while(j6 <= 10) {
			System.out.println(j6);
			j6 += 3;
		}
		int j7 = 10;
		while(j7 >= 1) {
			System.out.println(j7);
			j7 -= 2;
		}
		int j8 = 10;
		while(j8 >= 1) {
			System.out.println(j8);
			j8 -= 3;
		}
		int star1 = 1;
		while(star1 <= 5) {
			System.out.println("★");
			star1 ++ ;
		}
		
		int k1  = 0;
		do {
			System.out.println(k1);
			k1 ++ ;
		}while(k1 < 10);
		
		int k2 = 5;
		do {
			System.out.println(k2);
			k2 ++ ;
		}while(k2 < 10);
		
		int k3 = 5;
		do {
			System.out.println(k3);
			k3 -- ;
		}while(k3 > 0);
		
		int k4 = 1;
		do {
			System.out.println(k4);
			k4 += 2;
		}while(k4 <= 10);
		
		int k5 = 10;
		do {
			System.out.println(k5);
			k5 -= 3;
		}while(k5 >= 1);
		
	

	}

}
