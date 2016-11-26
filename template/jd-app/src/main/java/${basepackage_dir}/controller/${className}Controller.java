<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.controller.${subpackage};

import com.jd.app.controller.common.AbstractController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ${table.remarks} controller
 *
 * @version 1.0
 * @author ${author}
 * @date ${.now?string("yyyy-MM-dd HH:mm:ss")}
 */
@RestController
@RequestMapping("/${subpackage}")
public class ${className}Controller extends AbstractController {
	Logger logger = LoggerFactory.getLogger(this.getClass());

}
