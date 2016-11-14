package cn.org.rapid_framework.generator.provider.db.table;

import cn.org.rapid_framework.generator.provider.db.table.model.Table;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * TableFactory Tester.
 *
 * @author chenhaipeng
 * @version 1.0
 * @since <pre>十一月 14, 2016</pre>
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class TableFactoryTest {

	@Before
	public void before() throws Exception {
	}

	@After
	public void after() throws Exception {
	}


	/**
	 * Method: getInstance()
	 */
	@Test
	public void testGetInstance() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: getCatalog()
	 */
	@Test
	public void testGetCatalog() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: getSchema()
	 */
	@Test
	public void testGetSchema() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: getConnection()
	 */
	@Test
	public void testGetConnection() throws Exception {
		//TODO: Test goes here...
	}


	/**
	 * Method: getTable(String tableName)
	 * @author chenhaipeng
	 */
	@Test
	public void testGetTable() throws Exception {
		Table table = TableFactory.getInstance().getTable("employee");
		System.out.println(table);
	}

	/**
	 * Method: close(ResultSet rs, PreparedStatement ps, Statement... statements)
	 */
	@Test
	public void testClose() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: isOracleDataBase()
	 */
	@Test
	public void testIsOracleDataBase() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: queryForString(String sql)
	 */
	@Test
	public void testQueryForString() throws Exception {
		//TODO: Test goes here...
	}


	/**
	 * Method: _getTable(String catalog, String schema, String tableName)
	 */
	@Test
	public void test_getTable() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: createTable(Connection conn, ResultSet rs)
	 */
	@Test
	public void testCreateTable() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: getAllTables(Connection conn)
	 */
	@Test
	public void testGetAllTables() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: getSynonymOwner(String synonymName)
	 */
	@Test
	public void testGetSynonymOwner() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: getDatabaseStructureInfo()
	 */
	@Test
	public void testGetDatabaseStructureInfo() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: getMetaData()
	 */
	@Test
	public void testGetMetaData() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: retriveTableColumns(Table table)
	 */
	@Test
	public void testRetriveTableColumns() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: getTableColumns(Table table, List primaryKeys, List indices, Map uniqueIndices, Map uniqueColumns)
	 */
	@Test
	public void testGetTableColumns() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: getColumnsResultSet(Table table)
	 */
	@Test
	public void testGetColumnsResultSet() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: getTablePrimaryKeys(Table table)
	 */
	@Test
	public void testGetTablePrimaryKeys() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: getOracleTableComments(String table)
	 */
	@Test
	public void testGetOracleTableComments() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: getOracleColumnComments(String table, String column)
	 */
	@Test
	public void testGetOracleColumnComments() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: getTableOverrideValues(String tableSqlName)
	 */
	@Test
	public void testGetTableOverrideValues() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: getColumnOverrideValues(Table table, Column column)
	 */
	@Test
	public void testGetColumnOverrideValues() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: getTableConfigXmlNodeData(String tableSqlName)
	 */
	@Test
	public void testGetTableConfigXmlNodeData() throws Exception {
		//TODO: Test goes here...
	}

	/**
	 * Method: getTableConfigXmlNodeData0(String tableSqlName)
	 */
	@Test
	public void testGetTableConfigXmlNodeData0() throws Exception {
		//TODO: Test goes here...
	}
} 
