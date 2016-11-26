<#include "/macro.include"/>
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.dao.${subpackage};

import com.jd.app.dao.base.BaseDao;
import ${basepackage}.entity.${subpackage}.${className};

/**
 * ${table.remarks} dao
 * @version 1.0
 * @author ${author}
 * @date ${.now?string("yyyy-MM-dd HH:mm:ss")}
 */
public interface ${className}Dao extends BaseDao<${className}> {

}