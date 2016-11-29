<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.service.${subpackage}.impl;

import ${basepackage}.service.${subpackage}.${className}Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ${table.remarks} ServiceImpl
 *
 * @author ${author}
 * @version 1.0
 * @date ${.now?string("yyyy-MM-dd HH:mm:ss")}
 */
@Transactional
@Service
public class ${className}ServiceImpl implements ${className}Service {
	Logger logger = LoggerFactory.getLogger(this.getClass());

}
