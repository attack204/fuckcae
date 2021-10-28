package wiki.primo.generator.mybatis.plus.cae.service.impl;

import wiki.primo.generator.mybatis.plus.cae.entity.ProjectDetailPlan;
import wiki.primo.generator.mybatis.plus.cae.mapper.ProjectDetailPlanMapper;
import wiki.primo.generator.mybatis.plus.cae.service.IProjectDetailPlanService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import wiki.primo.generator.mybatis.plus.cae.query.ProjectDetailPlanQueryBo;
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
public class ProjectDetailPlanServiceImpl extends ServiceImpl<ProjectDetailPlanMapper, ProjectDetailPlan> implements IProjectDetailPlanService {

    /**
     * 按照条件分页查询
     * @param query
     */
    @Override
    public IPage<ProjectDetailPlan> page(ProjectDetailPlanQueryBo query,int pageNo,int pageSize){
        if(query==null){
            return new Page<>();
        }
        IPage<ProjectDetailPlan> page = new Page<>();
        page.setCurrent(pageNo);
        page.setSize(pageSize);
        QueryWrapper<ProjectDetailPlan> queryWrapper = query.buildQuery();
        return this.page(page, queryWrapper);
    }

    @Override
    public ProjectDetailPlan getOne(ProjectDetailPlanQueryBo query) {
        QueryWrapper<ProjectDetailPlan> queryWrapper = query.buildQuery();
        return this.getOne(queryWrapper);
    }

    @Override
    public IPage<ProjectDetailPlan> page(QueryWrapper<ProjectDetailPlan> queryWrapper, int pageNo, int pageSize) {
        return getPage(queryWrapper,pageNo,pageSize,true);
    }

    @Override
    public IPage<ProjectDetailPlan> pageNoCount(QueryWrapper<ProjectDetailPlan> queryWrapper, int pageNo, int pageSize) {
        return getPage(queryWrapper,pageNo,pageSize,false);
    }

    private IPage<ProjectDetailPlan> getPage(QueryWrapper<ProjectDetailPlan> queryWrapper, int pageNo, int pageSize,boolean isSearchCount) {
        if(queryWrapper ==null){
            return new Page<>();
        }
        Page<ProjectDetailPlan> page = new Page<>();
        page.setCurrent(pageNo);
        page.setSize(pageSize);
        page.setSearchCount(isSearchCount);
        return this.page(page, queryWrapper);
    }

    @Override
    public boolean update(ProjectDetailPlan entity,ProjectDetailPlanQueryBo query) {
        if(entity==null || query==null){
            return false;
        }
        return this.update(entity,query.buildQuery());
    }

    @Override
    public boolean updateByColumn(ProjectDetailPlan entity, String column, Object value) {
        QueryWrapper<ProjectDetailPlan> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(column,value);
        return this.update(entity, queryWrapper);
    }

    @Override
    public List<ProjectDetailPlan> list(ProjectDetailPlanQueryBo query) {
        if(query==null){
            return new ArrayList<>(2);
        }
        return this.list(query.buildQuery());
    }

}
