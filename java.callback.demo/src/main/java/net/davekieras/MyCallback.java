package net.davekieras;

public interface MyCallback {
	
	/**
	 * Unit-of-work to be executed.
	 * 
	 * If you do not need to return any values, you may simply return null - so
	 * if you don't need to pass a result via the return value, you can simply
	 * return null.
	 * 
	 * @return An optional value.
	 * @throws Exception
	 */
	Object execute(Object obj) throws Exception;

}
