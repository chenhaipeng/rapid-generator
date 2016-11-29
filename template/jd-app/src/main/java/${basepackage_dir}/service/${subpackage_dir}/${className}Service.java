<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.service.${subpackage};

/**
 * ${table.remarks} Service
 *
 * @author ${author}
 * @version 1.0
 * @date ${.now?string("yyyy-MM-dd HH:mm:ss")}
 */
public interface ${className}Service {

}
