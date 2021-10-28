package wiki.primo.generator.mybatis.plus.cae.service.impl;

import wiki.primo.generator.mybatis.plus.cae.entity.LandRecoveryInformation;
import wiki.primo.generator.mybatis.plus.cae.mapper.LandRecoveryInformationMapper;
import wiki.primo.generator.mybatis.plus.cae.service.ILandRecoveryInformationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import wiki.primo.generator.mybatis.plus.cae.query.LandRecoveryInformationQueryBo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 土地回收信息  服务实现类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@Service
public class LandRecoveryInformationServiceImpl extends ServiceImpl<LandRecoveryInformationMapper, LandRecoveryInformation> implements ILandRecoveryInformationService {

    /**
     * 按照条件分页查询
     * @param query
     */
    @Override
    public IPage<LandRecoveryInformation> page(LandRecoveryInformationQueryBo query,int pageNo,int pageSize){
        if(query==null){
            return new Page<>();
        }
        IPage<LandRecoveryInformation> page = new Page<>();
        page.setCurrent(pageNo);
        page.setSize(pageSize);
        QueryWrapper<LandRecoveryInformation> queryWrapper = query.buildQuery();
        return this.page(page, queryWrapper);
    }

    @Override
    public LandRecoveryInformation getOne(LandRecoveryInformationQueryBo query) {
        QueryWrapper<LandRecoveryInformation> queryWrapper = query.buildQuery();
        return this.getOne(queryWrapper);
    }

    @Override
    public IPage<LandRecoveryInformation> page(QueryWrapper<LandRecoveryInformation> queryWrapper, int pageNo, int pageSize) {
        return getPage(queryWrapper,pageNo,pageSize,true);
    }

    @Override
    public IPage<LandRecoveryInformation> pageNoCount(QueryWrapper<LandRecoveryInformation> queryWrapper, int pageNo, int pageSize) {
        return getPage(queryWrapper,pageNo,pageSize,false);
    }

    private IPage<LandRecoveryInformation> getPage(QueryWrapper<LandRecoveryInformation> queryWrapper, int pageNo, int pageSize,boolean isSearchCount) {
        if(queryWrapper ==null){
            return new Page<>();
        }
        Page<LandRecoveryInformation> page = new Page<>();
        page.setCurrent(pageNo);
        page.setSize(pageSize);
        page.setSearchCount(isSearchCount);
        return this.page(page, queryWrapper);
    }

    @Override
    public boolean update(LandRecoveryInformation entity,LandRecoveryInformationQueryBo query) {
        if(entity==null || query==null){
            return false;
        }
        return this.update(entity,query.buildQuery());
    }

    @Override
    public boolean updateByColumn(LandRecoveryInformation entity, String column, Object value) {
        QueryWrapper<LandRecoveryInformation> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(column,value);
        return this.update(entity, queryWrapper);
    }

    @Override
    public List<LandRecoveryInformation> list(LandRecoveryInformationQueryBo query) {
        if(query==null){
            return new ArrayList<>(2);
        }
        return this.list(query.buildQuery());
    }

}
