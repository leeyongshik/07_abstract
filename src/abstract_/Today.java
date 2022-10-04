package abstract_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Today {

	public static void main(String[] args) throws ParseException {
		
		Date date = new Date();
		
		System.out.println("오늘 날짜 : " + date);
		
		SimpleDateFormat simpleDateFromat = new SimpleDateFormat("y년 MM월 dd일 E요일 HH : mm : ss");
		System.out.println("오늘 날짜 : "+simpleDateFromat.format(date));
		System.out.println();
		
		
		// 내 생일 - 1991 07 15 10 : 35 : 15 입력
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHHmmss");
		Date birth = input.parse("19910715103515"); // String -> Date로 변환 
		System.out.println("내 생일 : " + birth);
		System.out.println("내 생일 : " + simpleDateFromat.format(birth));
		System.out.println();
				
		//int aa = Integer.parseInt("123"); -> 객체 String 을 int형태로 변환하기 위해 박싱 
		
		
		// 기준이 시스템의 날짜, 시간 기준 
		//Calendar calendar = new Calendar(); - error
		Calendar calendar = new GregorianCalendar();//Sub Class 이용하여 클래스 생성 
		Calendar calendar2 = Calendar.getInstance();// 메소드를 이용하여생성 
		
		//기준을 캐나다로 변경 
		Calendar calendar3 = Calendar.getInstance(TimeZone.getTimeZone("Camada/Pacific"));
		
		
		int year = calendar.get(Calendar.YEAR); 
		int month = calendar.get(Calendar.MONTH)+1; // 1월 - 0, 2월 -1, ....
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int week = calendar.get(Calendar.DAY_OF_WEEK);// 일-1, 월-2, 화-3....\
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		
		String dayOfWeek = null;
		switch (week) { 
		case 1 : dayOfWeek = "일"; break ;
		case 2 : dayOfWeek = "월"; break ;
		case 3 : dayOfWeek = "화"; break ;
		case 4 : dayOfWeek = "수"; break ;
		case 5 : dayOfWeek = "목"; break ;
		case 6 : dayOfWeek = "금"; break ;
		case 7 : dayOfWeek = "토"; break ;
		}
		
		System.out.println(year +"년 " + month + "월 "+ day+ "일 " + dayOfWeek + "요일 " + hour + " : " + minute + " :  " + second);
		
		
		
		
	}

}
