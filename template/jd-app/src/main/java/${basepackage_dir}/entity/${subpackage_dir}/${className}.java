<#include "/macro.include"/>
<#assign className = table.className>
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.entity.${subpackage};
import org.nutz.dao.entity.annotation.*;
import java.io.Serializable;
import java.util.Date;

/**
 * ${table.remarks} entity
 *
 * @version 1.0
 * @author ${author}
 * @date ${.now?string("yyyy-MM-dd HH:mm:ss")}
 */
@Table("${table.sqlName}")
public class ${className} implements Serializable {

	<#list table.columns as column>

	// ${column.columnAlias}
	<#if column.pk>
	@Name
	</#if>
	@Column("${column.sqlName}")
	private ${column.simpleJavaType} ${column.columnNameLower};
	</#list>
		
	<#list table.columns as column>
	public void set${column.columnName}(${column.simpleJavaType} value) {
		this.${column.columnNameLower} = value;
	}
	
	public ${column.simpleJavaType} get${column.columnName}() {
		return this.${column.columnNameLower};
	}
	
	</#list>
}
<#macro generateJavaColumns>
	<#list table.columns as column>
    <@generateBycondition column.sqlName>
	public void set${column.columnName}(${column.simpleJavaType} value) {
		this.${column.columnNameLower} = value;
	}
	
	public ${column.simpleJavaType} get${column.columnName}() {
		return this.${column.columnNameLower};
	}
	
	</@generateBycondition>
	</#list>
</#macro>