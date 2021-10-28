package wiki.primo.generator.mybatis.plus.cae.service.impl;

import wiki.primo.generator.mybatis.plus.cae.entity.ProjectInformation;
import wiki.primo.generator.mybatis.plus.cae.mapper.ProjectInformationMapper;
import wiki.primo.generator.mybatis.plus.cae.service.IProjectInformationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import wiki.primo.generator.mybatis.plus.cae.query.ProjectInformationQueryBo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 工程项目信息  服务实现类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@Service
public class ProjectInformationServiceImpl extends ServiceImpl<ProjectInformationMapper, ProjectInformation> implements IProjectInformationService {

    /**
     * 按照条件分页查询
     * @param query
     */
    @Override
    public IPage<ProjectInformation> page(ProjectInformationQueryBo query,int pageNo,int pageSize){
        if(query==null){
            return new Page<>();
        }
        IPage<ProjectInformation> page = new Page<>();
        page.setCurrent(pageNo);
        page.setSize(pageSize);
        QueryWrapper<ProjectInformation> queryWrapper = query.buildQuery();
        return this.page(page, queryWrapper);
    }

    @Override
    public ProjectInformation getOne(ProjectInformationQueryBo query) {
        QueryWrapper<ProjectInformation> queryWrapper = query.buildQuery();
        return this.getOne(queryWrapper);
    }

    @Override
    public IPage<ProjectInformation> page(QueryWrapper<ProjectInformation> queryWrapper, int pageNo, int pageSize) {
        return getPage(queryWrapper,pageNo,pageSize,true);
    }

    @Override
    public IPage<ProjectInformation> pageNoCount(QueryWrapper<ProjectInformation> queryWrapper, int pageNo, int pageSize) {
        return getPage(queryWrapper,pageNo,pageSize,false);
    }

    private IPage<ProjectInformation> getPage(QueryWrapper<ProjectInformation> queryWrapper, int pageNo, int pageSize,boolean isSearchCount) {
        if(queryWrapper ==null){
            return new Page<>();
        }
        Page<ProjectInformation> page = new Page<>();
        page.setCurrent(pageNo);
        page.setSize(pageSize);
        page.setSearchCount(isSearchCount);
        return this.page(page, queryWrapper);
    }

    @Override
    public boolean update(ProjectInformation entity,ProjectInformationQueryBo query) {
        if(entity==null || query==null){
            return false;
        }
        return this.update(entity,query.buildQuery());
    }

    @Override
    public boolean updateByColumn(ProjectInformation entity, String column, Object value) {
        QueryWrapper<ProjectInformation> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(column,value);
        return this.update(entity, queryWrapper);
    }

    @Override
    public List<ProjectInformation> list(ProjectInformationQueryBo query) {
        if(query==null){
            return new ArrayList<>(2);
        }
        return this.list(query.buildQuery());
    }

}
