package wiki.primo.generator.mybatis.plus.cae.service.impl;

import wiki.primo.generator.mybatis.plus.cae.entity.DetailPlan;
import wiki.primo.generator.mybatis.plus.cae.mapper.DetailPlanMapper;
import wiki.primo.generator.mybatis.plus.cae.service.IDetailPlanService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import wiki.primo.generator.mybatis.plus.cae.query.DetailPlanQueryBo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 项目进度明细表  服务实现类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@Service
public class DetailPlanServiceImpl extends ServiceImpl<DetailPlanMapper, DetailPlan> implements IDetailPlanService {

    /**
     * 按照条件分页查询
     * @param query
     */
    @Override
    public IPage<DetailPlan> page(DetailPlanQueryBo query,int pageNo,int pageSize){
        if(query==null){
            return new Page<>();
        }
        IPage<DetailPlan> page = new Page<>();
        page.setCurrent(pageNo);
        page.setSize(pageSize);
        QueryWrapper<DetailPlan> queryWrapper = query.buildQuery();
        return this.page(page, queryWrapper);
    }

    @Override
    public DetailPlan getOne(DetailPlanQueryBo query) {
        QueryWrapper<DetailPlan> queryWrapper = query.buildQuery();
        return this.getOne(queryWrapper);
    }

    @Override
    public IPage<DetailPlan> page(QueryWrapper<DetailPlan> queryWrapper, int pageNo, int pageSize) {
        return getPage(queryWrapper,pageNo,pageSize,true);
    }

    @Override
    public IPage<DetailPlan> pageNoCount(QueryWrapper<DetailPlan> queryWrapper, int pageNo, int pageSize) {
        return getPage(queryWrapper,pageNo,pageSize,false);
    }

    private IPage<DetailPlan> getPage(QueryWrapper<DetailPlan> queryWrapper, int pageNo, int pageSize,boolean isSearchCount) {
        if(queryWrapper ==null){
            return new Page<>();
        }
        Page<DetailPlan> page = new Page<>();
        page.setCurrent(pageNo);
        page.setSize(pageSize);
        page.setSearchCount(isSearchCount);
        return this.page(page, queryWrapper);
    }

    @Override
    public boolean update(DetailPlan entity,DetailPlanQueryBo query) {
        if(entity==null || query==null){
            return false;
        }
        return this.update(entity,query.buildQuery());
    }

    @Override
    public boolean updateByColumn(DetailPlan entity, String column, Object value) {
        QueryWrapper<DetailPlan> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(column,value);
        return this.update(entity, queryWrapper);
    }

    @Override
    public List<DetailPlan> list(DetailPlanQueryBo query) {
        if(query==null){
            return new ArrayList<>(2);
        }
        return this.list(query.buildQuery());
    }

}
