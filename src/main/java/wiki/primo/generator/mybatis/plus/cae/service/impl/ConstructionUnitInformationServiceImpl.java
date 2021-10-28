package wiki.primo.generator.mybatis.plus.cae.service.impl;

import wiki.primo.generator.mybatis.plus.cae.entity.ConstructionUnitInformation;
import wiki.primo.generator.mybatis.plus.cae.mapper.ConstructionUnitInformationMapper;
import wiki.primo.generator.mybatis.plus.cae.service.IConstructionUnitInformationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import wiki.primo.generator.mybatis.plus.cae.query.ConstructionUnitInformationQueryBo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 施工单位信息  服务实现类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@Service
public class ConstructionUnitInformationServiceImpl extends ServiceImpl<ConstructionUnitInformationMapper, ConstructionUnitInformation> implements IConstructionUnitInformationService {

    /**
     * 按照条件分页查询
     * @param query
     */
    @Override
    public IPage<ConstructionUnitInformation> page(ConstructionUnitInformationQueryBo query,int pageNo,int pageSize){
        if(query==null){
            return new Page<>();
        }
        IPage<ConstructionUnitInformation> page = new Page<>();
        page.setCurrent(pageNo);
        page.setSize(pageSize);
        QueryWrapper<ConstructionUnitInformation> queryWrapper = query.buildQuery();
        return this.page(page, queryWrapper);
    }

    @Override
    public ConstructionUnitInformation getOne(ConstructionUnitInformationQueryBo query) {
        QueryWrapper<ConstructionUnitInformation> queryWrapper = query.buildQuery();
        return this.getOne(queryWrapper);
    }

    @Override
    public IPage<ConstructionUnitInformation> page(QueryWrapper<ConstructionUnitInformation> queryWrapper, int pageNo, int pageSize) {
        return getPage(queryWrapper,pageNo,pageSize,true);
    }

    @Override
    public IPage<ConstructionUnitInformation> pageNoCount(QueryWrapper<ConstructionUnitInformation> queryWrapper, int pageNo, int pageSize) {
        return getPage(queryWrapper,pageNo,pageSize,false);
    }

    private IPage<ConstructionUnitInformation> getPage(QueryWrapper<ConstructionUnitInformation> queryWrapper, int pageNo, int pageSize,boolean isSearchCount) {
        if(queryWrapper ==null){
            return new Page<>();
        }
        Page<ConstructionUnitInformation> page = new Page<>();
        page.setCurrent(pageNo);
        page.setSize(pageSize);
        page.setSearchCount(isSearchCount);
        return this.page(page, queryWrapper);
    }

    @Override
    public boolean update(ConstructionUnitInformation entity,ConstructionUnitInformationQueryBo query) {
        if(entity==null || query==null){
            return false;
        }
        return this.update(entity,query.buildQuery());
    }

    @Override
    public boolean updateByColumn(ConstructionUnitInformation entity, String column, Object value) {
        QueryWrapper<ConstructionUnitInformation> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(column,value);
        return this.update(entity, queryWrapper);
    }

    @Override
    public List<ConstructionUnitInformation> list(ConstructionUnitInformationQueryBo query) {
        if(query==null){
            return new ArrayList<>(2);
        }
        return this.list(query.buildQuery());
    }

}
