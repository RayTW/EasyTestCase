package test;
import ray.library.test.EasyTestCase;

public class MathTest extends EasyTestCase{

	/**
	 * 測試使用Math.addExact()進行兩數相加是否符合預期結果
	 */
	public void testAddExact(){
		int resultCheck = 11;
		int a = 5;
		int b = 6;
		int result = Math.addExact(a, b);
		Assert.assertTrue(result == resultCheck);
	}
	
	/**
	 * 測試Math.abs()執行結果是否符合預期
	 */
	public void testAbs(){
		int resultCheck = 5;
		int result = Math.abs(-5);
		
		Assert.assertTrue(result == resultCheck);
	}
	
	public static void main(String [] args){
		EasyTestCase.runTest(MathTest.class);
	}
}
