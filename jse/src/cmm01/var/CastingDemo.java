package cmm01.var;
/*
Data : 2015.05.11
Author : 김세은
Description : 캐스팅 문법에 대한 학습자료 
 * */
class CastingDemo{
	public static void main(String[] args) {
/*
Up-Casting
변환(Conversion)
 = Promotion
 = 묵시적(Implict) 자동변환	
 자동형변환은 데이터 타입의 표현범위가 작은쪽에서 
 많은 쪽으로 변환이 될때만 가능하다	
 byte->short->int->long->float->double
 char->int
 */
		byte varByte = 1;
		int varInt = 123;
		double varDouble = 123.456;
		
		int upByte = varByte;
		double upByte2 = varByte;
		double upInt = varInt;
		
		System.out.println("Hello java");
		/*
		Down-Casting
		 = 캐스팅(Casting)
		 = 강제형변환
		 프로그램세어 명시적(explict)으로 지정하는 타입변환
		 축소변환이 되는 경우에는 반드시 명시적으로 캐스팅하여야 한다
		 단, 데이터 손실이 발생할 수도 있다
		*/
				
		double varDou = 123.456;
		int varInt2 = 1;
		int downByte = (int)varDou;
		byte varB2 = (byte)varInt2;
		float varF = 123.456f;
		int varInt3 = (int) varF;
		System.out.println("varInt3의 값 : "+ varInt3);
				
		}	
		
		


}