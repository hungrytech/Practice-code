package JAVATIL;

public class Sudydateofyear {
	
	public void getresult(String name,int correntyear, int year, int month, int day) {
		int leapmonth = getleapMonth(year); // 윤달일경우 2월이 29일이므로 +1
		String zodiacsign= getzodiacsign(year); //띠 구한이름
		int myyear = (correntyear-year)+1;
		int tmpyear = (year-1)*365; // 그년도까지 총 일수
		int days =0; // 입력한 달과 일까지의 총 일수
		int result; // 계산한 총값
		String dayofweek = ""; // 2020년이 아닌 입력한 날짜에 해당하는 요일
		for(int i=1; i<month; i++) { // 입력받은 달, 그달의 일수까지의 총 일수를 더해준다.
			switch (i) {
			case 1 :
			case 2 :
				days+=28;
				break;
			case 3 :
			case 5 :
			case 7 :
			case 8 :
			case 10 :
			case 12 :
				days+=31;
				break;
			default :
				days+=30;
				break;
			}
		}
		
		result=(tmpyear+(days+day)+leapmonth); // 총 일수
		
		switch(result%7) { // 총일수를 7로나눈 나머지로 몇요일인지 구하기
		case 0 :
			dayofweek= "일요일";
			break;
		case 1 :
			dayofweek= "월요일";
			break;
		case 2 :
			dayofweek= "화요일";
			break;
		case 3 :
			dayofweek= "수요일";
			break;
		case 4 :
			dayofweek= "목요일";
			break;
		case 5 :
			dayofweek= "금요일";
			break;
		case 6 :
			dayofweek= "토요일";
			break;
		}
		System.out.println("이름은:"+name+" "+"나이는:"+myyear+" "+"띠는:"+zodiacsign+" "+"요일은:"+dayofweek);
		
	}
	public int getleapMonth(int year) { // 윤달인지 아닌지 판단하여 윤달일경우 1을 return
		int result=0;
		if(year%4==0&& year%100!=0 || year%400==0) {
			result+=1;
		}
		return result;
	}
	public String getzodiacsign(int year) { // 띠의 이름을 구해준다.
		String result = "";
		switch (year%12) {
		case 0 :
			result="원숭이";
			break;
		case 1 :
			result="닭";
			break;
		case 2 :
			result="개";
			break;
		case 3 :
			result="돼지";
			break;
		case 4 :
			result="쥐";
			break;
		case 5 :
			result="소";
			break;
		case 6 :
			result="호랑이";
			break;
		case 7 :
			result="토끼";
			break;
		case 8 :
			result="용";
			break;
		case 9 :
			result="뱀";
			break;
		case 10 :
			result="말";
			break;
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		Sudydateofyear date = new Sudydateofyear();
		date.getresult("김철수", 2020, 1987, 3, 5); //메서드에 값 입력
		
	}	
	
	
	
}
