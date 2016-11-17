package cn.org.rapid_framework.generator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * GeneratorFacade Tester.
 *
 * @author chenhaipeng
 * @version 1.0
 * @since <pre>十一月 14, 2016</pre>
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class GeneratorFacadeTest {

	@Before
	public void before() throws Exception {
	}

	@After
	public void after() throws Exception {
	}


	/**
	 * Method: printAllTableNames()
	 */
	@Test
	public void testPrintAllTableNames() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: deleteOutRootDir()
	 */
	@Test
	public void testDeleteOutRootDir() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: generateByMap(Map map, String templateRootDir)
	 */
	@Test
	public void testGenerateByMap() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: deleteByMap(Map map, String templateRootDir)
	 */
	@Test
	public void testDeleteByMap() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: generateByAllTable(String templateRootDir)
	 */
	@Test
	public void testGenerateByAllTable() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: deleteByAllTable(String templateRootDir)
	 */
	@Test
	public void testDeleteByAllTable() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: generateByTable(String tableName, String templateRootDir)
	 */
	@Test
	public void testGenerateByTable() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: deleteByTable(String tableName, String templateRootDir)
	 */
	@Test
	public void testDeleteByTable() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: generateByClass(Class clazz, String templateRootDir)
	 */
	@Test
	public void testGenerateByClass() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: deleteByClass(Class clazz, String templateRootDir)
	 */
	@Test
	public void testDeleteByClass() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: generateBySql(Sql sql, String templateRootDir)
	 */
	@Test
	public void testGenerateBySql() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: deleteBySql(Sql sql, String templateRootDir)
	 */
	@Test
	public void testDeleteBySql() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: clear()
	 */
	@Test
	public void testClear() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: getContext()
	 */
	@Test
	public void testGetContext() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: setContext(Map map)
	 */
	@Test
	public void testSetContext() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: put(String key, Object value)
	 */
	@Test
	public void testPut() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: processByMap(Map params, String templateRootDir, boolean isDelete)
	 */
	@Test
	public void testProcessByMap() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: processBySql(Sql sql, String templateRootDir, boolean isDelete)
	 */
	@Test
	public void testProcessBySql() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: processByClass(Class clazz, String templateRootDir, boolean isDelete)
	 */
	@Test
	public void testProcessByClass() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: processByTable(String tableName, String templateRootDir, boolean isDelete)
	 */
	@Test
	public void testProcessByTable() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: processByAllTable(String templateRootDir, boolean isDelete)
	 */
	@Test
	public void testProcessByAllTable() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: newFromTable(Table table)
	 */
	@Test
	public void testNewFromTable() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: newFromSql(Sql sql)
	 */
	@Test
	public void testNewFromSql() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: newFromClass(Class clazz)
	 */
	@Test
	public void testNewFromClass() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: newFromMap(Map params)
	 */
	@Test
	public void testNewFromMap() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: setShareVars(Map templateModel)
	 */
	@Test
	public void testSetShareVars() throws Exception {
		//TODO: Test goes here...
	}


	/**
	 * Method: getGenerator(String templateRootDir)
	 */
	@Test
	public void testGetGenerator() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: matchWildCard(String sqlName, String wildcard)
	 */
	@Test
	public void testMatchWildCard() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: getDatabaseType(String key)
	 */
	@Test
	public void testGetDatabaseType() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: printExceptionsSumary(String msg, String outRoot, List<Exception> exceptions)
	 */
	@Test
	public void testPrintExceptionsSumary() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: printBeginProcess(String displayText, boolean isDatele)
	 */
	@Test
	public void testPrintBeginProcess() throws Exception {
		Exception throwable = new RuntimeException("xxxxx");
		List<Exception> list = new ArrayList<>();
		list.add(throwable);

	}

	/**
	 * 生成器的上下文，存放的变量将可以在模板中引用
	 */
	public static class GeneratorContext {
		static ThreadLocal<Map> context = new ThreadLocal<Map>();

		public static void clear() {
			Map m = context.get();
			if (m != null) m.clear();
		}

		public static Map getContext() {
			Map map = context.get();
			if (map == null) {
				setContext(new HashMap());
			}
			return context.get();
		}

		public static void setContext(Map map) {
			context.set(map);
		}

		public static void put(String key, Object value) {
			getContext().put(key, value);
		}
	}

} 
