package wiki.primo.generator.mybatis.plus.cae.service.impl;

import wiki.primo.generator.mybatis.plus.cae.entity.ConstructionPermitInformation;
import wiki.primo.generator.mybatis.plus.cae.mapper.ConstructionPermitInformationMapper;
import wiki.primo.generator.mybatis.plus.cae.service.IConstructionPermitInformationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import wiki.primo.generator.mybatis.plus.cae.query.ConstructionPermitInformationQueryBo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 施工许可证信息  服务实现类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@Service
public class ConstructionPermitInformationServiceImpl extends ServiceImpl<ConstructionPermitInformationMapper, ConstructionPermitInformation> implements IConstructionPermitInformationService {

    /**
     * 按照条件分页查询
     * @param query
     */
    @Override
    public IPage<ConstructionPermitInformation> page(ConstructionPermitInformationQueryBo query,int pageNo,int pageSize){
        if(query==null){
            return new Page<>();
        }
        IPage<ConstructionPermitInformation> page = new Page<>();
        page.setCurrent(pageNo);
        page.setSize(pageSize);
        QueryWrapper<ConstructionPermitInformation> queryWrapper = query.buildQuery();
        return this.page(page, queryWrapper);
    }

    @Override
    public ConstructionPermitInformation getOne(ConstructionPermitInformationQueryBo query) {
        QueryWrapper<ConstructionPermitInformation> queryWrapper = query.buildQuery();
        return this.getOne(queryWrapper);
    }

    @Override
    public IPage<ConstructionPermitInformation> page(QueryWrapper<ConstructionPermitInformation> queryWrapper, int pageNo, int pageSize) {
        return getPage(queryWrapper,pageNo,pageSize,true);
    }

    @Override
    public IPage<ConstructionPermitInformation> pageNoCount(QueryWrapper<ConstructionPermitInformation> queryWrapper, int pageNo, int pageSize) {
        return getPage(queryWrapper,pageNo,pageSize,false);
    }

    private IPage<ConstructionPermitInformation> getPage(QueryWrapper<ConstructionPermitInformation> queryWrapper, int pageNo, int pageSize,boolean isSearchCount) {
        if(queryWrapper ==null){
            return new Page<>();
        }
        Page<ConstructionPermitInformation> page = new Page<>();
        page.setCurrent(pageNo);
        page.setSize(pageSize);
        page.setSearchCount(isSearchCount);
        return this.page(page, queryWrapper);
    }

    @Override
    public boolean update(ConstructionPermitInformation entity,ConstructionPermitInformationQueryBo query) {
        if(entity==null || query==null){
            return false;
        }
        return this.update(entity,query.buildQuery());
    }

    @Override
    public boolean updateByColumn(ConstructionPermitInformation entity, String column, Object value) {
        QueryWrapper<ConstructionPermitInformation> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(column,value);
        return this.update(entity, queryWrapper);
    }

    @Override
    public List<ConstructionPermitInformation> list(ConstructionPermitInformationQueryBo query) {
        if(query==null){
            return new ArrayList<>(2);
        }
        return this.list(query.buildQuery());
    }

}
