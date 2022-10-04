package abstract_;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberMain {

	public static void main(String[] args) {
		//NumberFormat numberFormat = new NumberFormat(); -> 추상 클래스
		NumberFormat numberFormat = new DecimalFormat();
		// 3자리 마다 ,를 찍고 소수이하 3번째 자리 까지 출력
		System.out.println(numberFormat.format(12345678.456789)); // 소수이하 3번째 자리까지 출력
		System.out.println(numberFormat.format(12345678));
		System.out.println();
		
		NumberFormat numberFormat2 = new DecimalFormat("#,###.##원");
		//유효 숫자가 아닌것은 표현하지 않는다 
		System.out.println(numberFormat2.format(12345678.456789)); // 소수이하 3번째 자리까지 출력
		System.out.println(numberFormat2.format(12345678));
		System.out.println();
		
		NumberFormat numberFormat3 = new DecimalFormat("#,###.00원");
		// 0을 강제로 표시
		System.out.println(numberFormat3.format(12345678.456789)); // 소수이하 3번째 자리까지 출력
		System.out.println(numberFormat3.format(12345678));
		System.out.println();
		
		//NumberFormat numberFormat4 = NumberFormat.getInstance(); // 메소드 이용 
		NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance(); // ₩ 표시  
		numberFormat4.setMaximumFractionDigits(2);//소수 이하 2번째 자리 
		numberFormat4.setMinimumFractionDigits(2);// 0을 강제로 표시 
		System.out.println(numberFormat4.format(12345678.456789)); // 소수이하 3번째 자리까지 출력
		System.out.println(numberFormat4.format(12345678));
		System.out.println();
		
		NumberFormat numberFormat5 = NumberFormat.getCurrencyInstance(Locale.US); // ₩ 표시  
		numberFormat5.setMaximumFractionDigits(2);//소수 이하 2번째 자리 
		numberFormat5.setMinimumFractionDigits(2);// 0을 강제로 표시 
		System.out.println(numberFormat5.format(12345678.456789)); // 소수이하 3번째 자리까지 출력
		System.out.println(numberFormat5.format(12345678));
		System.out.println();
		
		
		
	}

}
