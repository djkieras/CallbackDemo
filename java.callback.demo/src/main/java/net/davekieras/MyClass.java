package net.davekieras;

public class MyClass extends MyAbstractClass {

	public void myMethod() {
		runInCallback(new MyCallback() {
			public Object execute(Object obj) throws Exception {
				System.out.println("Executing my code here");
				System.out.println("Object obj is \"" + obj + "\"");
				return null;
			}
		});
	}
}
