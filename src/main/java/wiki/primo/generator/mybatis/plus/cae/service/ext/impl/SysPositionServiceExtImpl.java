package wiki.primo.generator.mybatis.plus.cae.service.ext.impl;

import wiki.primo.generator.mybatis.plus.cae.service.ext.ISysPositionServiceExt;
import wiki.primo.generator.mybatis.plus.cae.service.ISysPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 地区表(记录用户所在地区，比如经区、高区)  服务实现扩展类，该类不会被自动生成覆盖掉
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@Service
public class SysPositionServiceExtImpl implements ISysPositionServiceExt {
    @Autowired
    private ISysPositionService iSysPositionService;


}
