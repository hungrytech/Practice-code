package JAVATIL;

// 함수형 인터페이스
@FunctionalInterface
interface Function {
	void function();
}


public class StudyLamda {
	
	public static void myFunction(Function f) {
		f.function();
	}
	
	
	
	public static void main(String[] args) {
		//람다식으로 function메서드 구현
		Function fun = () -> System.out.println("함수형 인터페이스입니다.");
		
		//fun 참조변수로 메서드 실행 
		fun.function();
		
		//StudyLamda 클래스의 myFunction메서드 파라미터에 fun 넣어서 실행
		StudyLamda.myFunction(fun);
		
		//StudyLamda 클래스의 myFunction메서드 파라미터에 람다식 넣어서 실행
		StudyLamda.myFunction(() -> System.out.println("람다식으로 넣기"));
		
	}
}
