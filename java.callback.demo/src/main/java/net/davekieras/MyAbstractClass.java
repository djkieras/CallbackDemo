package net.davekieras;

public abstract class MyAbstractClass {

	protected void runInCallback(MyCallback callback) {
		Object obj = null;
		try{
			System.out.println("Before callback method");
			obj = new String("Test");
			callback.execute(obj);
			System.out.println("After callback method");
		} catch (Throwable t) {
			System.out.println("Exception encountered");
			t.printStackTrace();
		} finally {
			System.out.println("In the finally");
			obj = null;
		}
	}
	
}
