package abstract_;

public class AbstractMain extends AbstractTest {
	
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		
		AbstractTest abstractTest = new AbstractMain();
		
	}

}
