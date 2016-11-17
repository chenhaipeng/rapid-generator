package cn.org.rapid_framework.generator.ext;

import cn.org.rapid_framework.generator.util.AntPathMatcher;
import cn.org.rapid_framework.generator.util.StringHelper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * CommandLine Tester.
 *
 * @author chenhaipeng
 * @version 1.0
 * @since <pre>十一月 10, 2016</pre>
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class CommandLineTest {

	@Before
	public void before() throws Exception {
	}

	@After
	public void after() throws Exception {
	}


	/**
	 * Method: main(String[] args)
	 */
	@Test
	public void testMain() throws Exception {
		String s = "/Users/hai/IdeaProjects/rapid-generator/template/cncounter-manage";
		String templateFile = "/Users/hai/IdeaProjects/rapid-generator/template/*";

//		if (new AntPathMatcher().match(s.replace('\\', '/'), templateFile)){
//			System.out.println("true");
//		}
		System.out.println(new AntPathMatcher().match(templateFile,s));
//		System.out.println(s.endsWith(","));
	}

	public static void main(String[] args) throws Exception {
		new CommandLineTest().testStartProcess();
	}


	/**
	 * Method: startProcess()
	 */
	@Test
	public void testStartProcess() throws Exception {
		Scanner sc = new Scanner(System.in);
//		System.out.println("templateRootDir:"+new File(getTemplateRootDir()).getAbsolutePath());
//		printUsages();
		System.out.println("please input your value:");
		while(sc.hasNextLine()) {
			try {
				String cmd = sc.next();
				String[] s = StringHelper.tokenizeToStringArray(sc.nextLine()," ");
				System.out.println(Arrays.asList(s));
				if("gen".equals(cmd)){
					System.out.println("well done!");
					break;
				}

//				processLine(sc);
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				Thread.sleep(700);
//				printUsages();
			}
		}
	}

	/**
	 * Method: processLine(Scanner sc)
	 */
	@Test
	public void testProcessLine() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: getIncludes(String[] args, int i)
	 */
	@Test
	public void testGetIncludes() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: getTemplateRootDir()
	 */
	@Test
	public void testGetTemplateRootDir() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: printUsages()
	 */
	@Test
	public void testPrintUsages() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: nextArguments(Scanner sc)
	 */
	@Test
	public void testNextArguments() throws Exception {
		//TODO: Test goes here...
	}
} 
