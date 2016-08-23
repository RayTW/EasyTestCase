package test;

import ray.library.test.EasyTestCase;

public class AllTest {
	public static void main(String [] args){
		//一次測試全碰的test cast class
		EasyTestCase.runTest(MyMathTest.class);
		EasyTestCase.runTest(MathTest.class);
	}
}
