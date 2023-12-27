package day8.programmatic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PureAnnotationBasedConfigurationMain {

	public static void main(String[] args) {
		Class<SpringConfig> configurationUnit = SpringConfig.class;
		AnnotationConfigApplicationContext annoCtx =
				new AnnotationConfigApplicationContext(configurationUnit);
		
		Class<Test> testRef = Test.class;
		Test testObj = annoCtx.getBean(testRef);
		testObj.doTest();

	}

}
