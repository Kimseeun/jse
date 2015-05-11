package cmm01.var;

class Var{
	public static void main(String[] args) {
		/*  
		 * 변수의 종류 8가지
		 * 문자형 : char
		 * 숫자형 (정수) : byte,short,int,long
		 * 숫자형 (실수) : double, float
		 * 논리형 : boolean
		 * */
		
		int x; // 변수선언		

		x = 1; //값의 할당 (대입)
		
		int y;
		
		y = x + 1;
		System.out.println("x = " + x);
		
		System.out.println("x + 1 = " + y );
		
		System.out.println("y = " + y);
		/*
		 * ""내부에 선언 된 것은 그대로 출력
		 * "" 없이 선언된 변수는 변수 값이 출력 
		 * */
	}
}