// 접근제어자 : 클래스, 메서드, 필드에 대해서 외부 접근에 대한 제어를 하는 것
// public : 모든 패키지에서 접근 가능
// protected : 같은 패키지 내부 혹은 외부 패키지의 자손 클래스에서 접근 가능
// default(package) : 같은 패키지 내부에서만 접근 가능
// private : 같은 클래스 내부에서만 접근 가능
package chapter2;



class AccessModifierRun{
	void method() {
		
		AccessModifier instance = new AccessModifier();
		
//		AccessModifier의 publicVariable, protectedVariable, defaultVariable필드는
//		접근제어자가 각각 public, protected, default 이기때문에 같은 패키지 내부에서 접근 가능함
		instance.publicVariable = 0;
		instance.protectedVariable = 0;
		instance.protectedVariable = 0;
//		AccessModifier의 privateVariable필드는
//		접근제어자가 private 이기때문에 같은 패키지 내부에서 접근이 불가능함
//		instance.privateVariable = 0;
	}
}
public class AccessModifier {
	
	public int publicVariable;
	protected int protectedVariable;
	int defaultVariable;
	private int privateVariable;
	

	public static void main(String[] args) {
		
		AccessModifier instance = new AccessModifier();
		
//		AccessModifier의 publicVariable, protectedVariable, defaultVariable, privateVariable필드는
//		접근제어자가 public, protected, default, private 이기때문에 같은 클래스내에서 접근 가능함
		instance.publicVariable = 0;
		instance.protectedVariable = 0;
		instance.protectedVariable = 0;
		instance.privateVariable = 0;
		
//		privateVariable = 0;
		

	}

}
