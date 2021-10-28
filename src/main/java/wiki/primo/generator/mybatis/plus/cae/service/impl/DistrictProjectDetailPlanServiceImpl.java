package wiki.primo.generator.mybatis.plus.cae.service.impl;

import wiki.primo.generator.mybatis.plus.cae.entity.DistrictProjectDetailPlan;
import wiki.primo.generator.mybatis.plus.cae.mapper.DistrictProjectDetailPlanMapper;
import wiki.primo.generator.mybatis.plus.cae.service.IDistrictProjectDetailPlanService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import wiki.primo.generator.mybatis.plus.cae.query.DistrictProjectDetailPlanQueryBo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 项目详细计划映射表  服务实现类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@Service
public class DistrictProjectDetailPlanServiceImpl extends ServiceImpl<DistrictProjectDetailPlanMapper, DistrictProjectDetailPlan> implements IDistrictProjectDetailPlanService {

    /**
     * 按照条件分页查询
     * @param query
     */
    @Override
    public IPage<DistrictProjectDetailPlan> page(DistrictProjectDetailPlanQueryBo query,int pageNo,int pageSize){
        if(query==null){
            return new Page<>();
        }
        IPage<DistrictProjectDetailPlan> page = new Page<>();
        page.setCurrent(pageNo);
        page.setSize(pageSize);
        QueryWrapper<DistrictProjectDetailPlan> queryWrapper = query.buildQuery();
        return this.page(page, queryWrapper);
    }

    @Override
    public DistrictProjectDetailPlan getOne(DistrictProjectDetailPlanQueryBo query) {
        QueryWrapper<DistrictProjectDetailPlan> queryWrapper = query.buildQuery();
        return this.getOne(queryWrapper);
    }

    @Override
    public IPage<DistrictProjectDetailPlan> page(QueryWrapper<DistrictProjectDetailPlan> queryWrapper, int pageNo, int pageSize) {
        return getPage(queryWrapper,pageNo,pageSize,true);
    }

    @Override
    public IPage<DistrictProjectDetailPlan> pageNoCount(QueryWrapper<DistrictProjectDetailPlan> queryWrapper, int pageNo, int pageSize) {
        return getPage(queryWrapper,pageNo,pageSize,false);
    }

    private IPage<DistrictProjectDetailPlan> getPage(QueryWrapper<DistrictProjectDetailPlan> queryWrapper, int pageNo, int pageSize,boolean isSearchCount) {
        if(queryWrapper ==null){
            return new Page<>();
        }
        Page<DistrictProjectDetailPlan> page = new Page<>();
        page.setCurrent(pageNo);
        page.setSize(pageSize);
        page.setSearchCount(isSearchCount);
        return this.page(page, queryWrapper);
    }

    @Override
    public boolean update(DistrictProjectDetailPlan entity,DistrictProjectDetailPlanQueryBo query) {
        if(entity==null || query==null){
            return false;
        }
        return this.update(entity,query.buildQuery());
    }

    @Override
    public boolean updateByColumn(DistrictProjectDetailPlan entity, String column, Object value) {
        QueryWrapper<DistrictProjectDetailPlan> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(column,value);
        return this.update(entity, queryWrapper);
    }

    @Override
    public List<DistrictProjectDetailPlan> list(DistrictProjectDetailPlanQueryBo query) {
        if(query==null){
            return new ArrayList<>(2);
        }
        return this.list(query.buildQuery());
    }

}
