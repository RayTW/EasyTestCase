package ray.library.test;
import java.lang.reflect.Method;

public class EasyTestCase {
	public void setUp(){
	}
	
	public void tearDown(){
	}
	
	public static void runTest(Class clazz){
		try {
			Object obj = clazz.newInstance();
			
			Method setUp = clazz.getMethod("setUp", null);
			
			if(setUp != null){
				setUp.invoke(obj, null);
			}

			Method [] methos = clazz.getMethods();
			Method m = null;
			
			for(int i = 0; i < methos.length; i++){
				m = methos[i];
				
				if(m.getName().startsWith("test")){
					try {
						m.invoke(obj, null);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			
			Method tearDown = clazz.getMethod("tearDown", null);
			
			if(tearDown != null){
				tearDown.invoke(obj, null);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	public static class Assert {
		public static void assertTrue(boolean b){
			StackTraceElement stack = Thread.currentThread().getStackTrace()[2];
			String method = stack.getMethodName();
			String className = stack.getClassName();
			if(b){
				System.out.println(className + ":" + method + " passed");
			}else{
				System.out.println(className + ":" + method + " failed");
			}
		}
	}
}
