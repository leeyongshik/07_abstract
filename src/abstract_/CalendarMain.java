package abstract_;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarMain {
	   private int year, month, week, lastDay;
	   
	   public CalendarMain() {
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("년도 입력 : ");
	      year = scan.nextInt(); // 2002
	      System.out.print("월 입력 : ");
	      month = scan.nextInt(); // 10
	   }
	   
	   public void calc() {
	      Calendar cal = Calendar.getInstance(); //클래스 생성 - 시스템 시간 (2022-09-28)을 변경
	      
	      //시스템 시간 (2022-09-28)을 원하는 날짜로 변경
	      //cal.set(Calendar.YEAR, year); //년도 변경
	      //cal.set(Calendar.MONTH, month-1); //월 변경, //1월-0, 2월-1,..., 9월-8
	      //cal.set(Calendar.DAY_OF_MONTH, 1); //일 변경
	      
	      cal.set(year, month-1, 1);
	      
	      week = cal.get(Calendar.DAY_OF_WEEK); //매달 1일의 요일, 일-1, 월-2, 화-3,..., 토-7
	      lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); //28, 29, 30, 31
	   }
	   
	   public void display() {
	      System.out.println("일\t월\t화\t수\t목\t금\t토");
	      
	      for(int i=1; i<week; i++) {
	         System.out.print("\t");
	      }//for
	      
	      for(int i=1; i<=lastDay; i++) {
	         System.out.print(i + "\t");
	         
	         if(week%7 == 0) System.out.println();
	         week++;
	      }//for
	   }
	   

	   public static void main(String[] args) {
	      CalendarMain calendarMain = new CalendarMain();
	      calendarMain.calc();
	      calendarMain.display();

	   }

	}


/*
import java.util.Scanner;

class Calendar{
	private int year, month;
	
	public Calendar() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("연도 입력 : ");
		int year = scan.nextInt();
		System.out.print("월 입력 : ");
		int month = scan.nextInt();
		
		this.year = year;
		this.month = month;
		
		
		disp();
	}
		
	
	public boolean isLeapYear(int year) { //윤년 

		  boolean leap = false; 
		  
		  if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) { 
		  	leap = true; 
		  } 
		  return leap; 
		}
		

	public int getDate(int year, int month) { // 각 월의 일수 계산 
	    int tmp = 0; 

	    if(isLeapYear(year)) { 

	      switch(month) { 
	        case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
	          tmp = 31; 
	        break; 
	        case 4: case 6: case 9: case 11: 
	          tmp = 30; 
	        break; 
	        case 2: 
	          tmp = 29; 
	        break; 
	      } 
	    }else { 
	      if(month == 1 || month == 3 || month == 5 || month == 7 ||month == 8 || month == 10 || month == 12) { 
	        tmp = 31; 
	      } else if(month == 4 || month == 6 || month == 9 || month == 11) { 
	        tmp = 30;
	      }else if (month == 2) { 
	        tmp = 28; 
	      } 
	    } 
	    return tmp; 
	  }
	
	private int getDayOfWeek(int year, int month) {  // 첫번째 요일 계산
	    int dayOfWeek = 0; 
	    int sum = 0; 

	    // 1.1.1 ~ year-1.12.31 
	    for(int i = 1; i < year; i++) { 
	      for(int j = 1; j <= 12; j++) { 
	        sum += getDate(i, j); 
	      } 
	    } 

	    //year.1.1 ~ year.month-1.마지막(31,30.29.28) 
	    for(int k = 1; k < month; k++) { 
	      sum += getDate(year, k); 
	    } 

	    //year.month.1일 
	    sum += 1; 

	    //요일 
	    dayOfWeek = sum % 7;

	    return dayOfWeek; 
	  } 
	
	
	
	
	public void disp() { 
		System.out.println();
	    System.out.print("일\t월\t화\t수\t목\t금\t토\n");
	    
	    int start = getDayOfWeek(year, month);
	    int last = getDate(year, month); //마지막날
	    for(int i = 1; i <= start; i++) { 
	        System.out.print("\t"); 
	    } 

	    //달력출력 
	    for(int i = 1; i <= last; i++) { 
	      System.out.printf("%d\t", i); 
	      start++; 
	      if(start%7 == 0) { 
	        System.out.println(); 
	      }
	    }
	
	}
	
}


public class CalendarMain {

	public static void main(String[] args) {
		Calendar calendar = new Calendar();
		
		
	}

}
*/

/*
[문제] 만년달력
- 년도, 월을 입력하여 달력을 작성하시오
- 기본생성자 : 입력
- 메소드 : calc() -> 매달 1일의 요일이 무엇인지? (Calendar에 메소드 준비)
                -> 매달 마지막이 28, 29, 30, 31 무엇인지? (Calendar에 메소드 준비)
         display() 출력

[실행결과]
년도 입력 : 2002
월 입력 : 10   

일   월   화   수   목   금   토
      1   2   3   4   5
6   7   8   9   10   11   12
13   14   15   16   17   18   19
20   21   22   23   24   25   26
27   28   29   30   31
 */