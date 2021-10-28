package wiki.primo.generator.mybatis.plus.cae.service.impl;

import wiki.primo.generator.mybatis.plus.cae.entity.DistrictDetailPlan;
import wiki.primo.generator.mybatis.plus.cae.mapper.DistrictDetailPlanMapper;
import wiki.primo.generator.mybatis.plus.cae.service.IDistrictDetailPlanService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import wiki.primo.generator.mybatis.plus.cae.query.DistrictDetailPlanQueryBo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 区级重点项目进度明细表  服务实现类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@Service
public class DistrictDetailPlanServiceImpl extends ServiceImpl<DistrictDetailPlanMapper, DistrictDetailPlan> implements IDistrictDetailPlanService {

    /**
     * 按照条件分页查询
     * @param query
     */
    @Override
    public IPage<DistrictDetailPlan> page(DistrictDetailPlanQueryBo query,int pageNo,int pageSize){
        if(query==null){
            return new Page<>();
        }
        IPage<DistrictDetailPlan> page = new Page<>();
        page.setCurrent(pageNo);
        page.setSize(pageSize);
        QueryWrapper<DistrictDetailPlan> queryWrapper = query.buildQuery();
        return this.page(page, queryWrapper);
    }

    @Override
    public DistrictDetailPlan getOne(DistrictDetailPlanQueryBo query) {
        QueryWrapper<DistrictDetailPlan> queryWrapper = query.buildQuery();
        return this.getOne(queryWrapper);
    }

    @Override
    public IPage<DistrictDetailPlan> page(QueryWrapper<DistrictDetailPlan> queryWrapper, int pageNo, int pageSize) {
        return getPage(queryWrapper,pageNo,pageSize,true);
    }

    @Override
    public IPage<DistrictDetailPlan> pageNoCount(QueryWrapper<DistrictDetailPlan> queryWrapper, int pageNo, int pageSize) {
        return getPage(queryWrapper,pageNo,pageSize,false);
    }

    private IPage<DistrictDetailPlan> getPage(QueryWrapper<DistrictDetailPlan> queryWrapper, int pageNo, int pageSize,boolean isSearchCount) {
        if(queryWrapper ==null){
            return new Page<>();
        }
        Page<DistrictDetailPlan> page = new Page<>();
        page.setCurrent(pageNo);
        page.setSize(pageSize);
        page.setSearchCount(isSearchCount);
        return this.page(page, queryWrapper);
    }

    @Override
    public boolean update(DistrictDetailPlan entity,DistrictDetailPlanQueryBo query) {
        if(entity==null || query==null){
            return false;
        }
        return this.update(entity,query.buildQuery());
    }

    @Override
    public boolean updateByColumn(DistrictDetailPlan entity, String column, Object value) {
        QueryWrapper<DistrictDetailPlan> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(column,value);
        return this.update(entity, queryWrapper);
    }

    @Override
    public List<DistrictDetailPlan> list(DistrictDetailPlanQueryBo query) {
        if(query==null){
            return new ArrayList<>(2);
        }
        return this.list(query.buildQuery());
    }

}
