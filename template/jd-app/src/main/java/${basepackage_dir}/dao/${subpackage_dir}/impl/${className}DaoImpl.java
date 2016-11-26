<#include "/macro.include"/>
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.dao.${subpackage}.impl

import com.jd.app.dao.base.BaseDaoImpl;
import ${basepackage}.entity.${subpackage}.${className};
import ${basepackage}.dao.${subpackage}.${className}Dao;
import org.springframework.stereotype.Repository;

/**
 * ${table.remarks} DaoImpl
 *
 * @version 1.0
 * @author ${author}
 * @date ${.now?string("yyyy-MM-dd HH:mm:ss")}
 */
@Repository
public interface ${className}DaoImpl BaseDaoImpl<${className}> implements ${className}Dao {

}