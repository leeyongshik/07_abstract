package abstract_;

public abstract class AbstractTest { // POJO형식 ( Plain Old Java Object )
	String name; // default -> 같은 패키지 안에 있으면 허용

	public String getName() { // 구현
		return name;
	}

	public abstract void setName(String name); //추상 메소드
	// 추상 클래스 안에 추상메소드가 있어도 되고, 없어도 된다.
	
	
}
