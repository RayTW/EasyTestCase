package test;

import ray.library.test.EasyTestCase;
import simple.MyMath;

public class MyMathTest extends EasyTestCase{
	private MyMath mMyMath;
	
	public void setUp() {
		mMyMath = new MyMath();
	}
	
	/**
	 * 測試MyMath.add()的功能是否可正常將兩數兩加
	 */
	public void testAdd(){
		int result = mMyMath.add(50, 56);
		
		Assert.assertTrue(result == 106);
	}
	
	/**
	 * 測試MyMath.add()的功能是否可正常將兩數兩減
	 */
	public void testDecrement(){
		int result = mMyMath.decrement(50, 56);
		
		Assert.assertTrue(result == -6);
	}
	
	/**
	 * 固定讓此test失敗
	 */
	public void testDecrementFail(){
		//預期結果應為0
		int result = mMyMath.decrement(50, 50);
		
		//固定判斷為-6
		Assert.assertTrue(result == -6);
	}

	public void tearDown() {
		mMyMath = null;
	}
	
	public static void main(String [] args){
		EasyTestCase.runTest(MyMathTest.class);
	}
}
