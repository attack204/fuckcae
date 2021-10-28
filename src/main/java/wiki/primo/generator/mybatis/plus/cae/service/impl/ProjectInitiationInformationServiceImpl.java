package wiki.primo.generator.mybatis.plus.cae.service.impl;

import wiki.primo.generator.mybatis.plus.cae.entity.ProjectInitiationInformation;
import wiki.primo.generator.mybatis.plus.cae.mapper.ProjectInitiationInformationMapper;
import wiki.primo.generator.mybatis.plus.cae.service.IProjectInitiationInformationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import wiki.primo.generator.mybatis.plus.cae.query.ProjectInitiationInformationQueryBo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 项目立项信息  服务实现类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@Service
public class ProjectInitiationInformationServiceImpl extends ServiceImpl<ProjectInitiationInformationMapper, ProjectInitiationInformation> implements IProjectInitiationInformationService {

    /**
     * 按照条件分页查询
     * @param query
     */
    @Override
    public IPage<ProjectInitiationInformation> page(ProjectInitiationInformationQueryBo query,int pageNo,int pageSize){
        if(query==null){
            return new Page<>();
        }
        IPage<ProjectInitiationInformation> page = new Page<>();
        page.setCurrent(pageNo);
        page.setSize(pageSize);
        QueryWrapper<ProjectInitiationInformation> queryWrapper = query.buildQuery();
        return this.page(page, queryWrapper);
    }

    @Override
    public ProjectInitiationInformation getOne(ProjectInitiationInformationQueryBo query) {
        QueryWrapper<ProjectInitiationInformation> queryWrapper = query.buildQuery();
        return this.getOne(queryWrapper);
    }

    @Override
    public IPage<ProjectInitiationInformation> page(QueryWrapper<ProjectInitiationInformation> queryWrapper, int pageNo, int pageSize) {
        return getPage(queryWrapper,pageNo,pageSize,true);
    }

    @Override
    public IPage<ProjectInitiationInformation> pageNoCount(QueryWrapper<ProjectInitiationInformation> queryWrapper, int pageNo, int pageSize) {
        return getPage(queryWrapper,pageNo,pageSize,false);
    }

    private IPage<ProjectInitiationInformation> getPage(QueryWrapper<ProjectInitiationInformation> queryWrapper, int pageNo, int pageSize,boolean isSearchCount) {
        if(queryWrapper ==null){
            return new Page<>();
        }
        Page<ProjectInitiationInformation> page = new Page<>();
        page.setCurrent(pageNo);
        page.setSize(pageSize);
        page.setSearchCount(isSearchCount);
        return this.page(page, queryWrapper);
    }

    @Override
    public boolean update(ProjectInitiationInformation entity,ProjectInitiationInformationQueryBo query) {
        if(entity==null || query==null){
            return false;
        }
        return this.update(entity,query.buildQuery());
    }

    @Override
    public boolean updateByColumn(ProjectInitiationInformation entity, String column, Object value) {
        QueryWrapper<ProjectInitiationInformation> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(column,value);
        return this.update(entity, queryWrapper);
    }

    @Override
    public List<ProjectInitiationInformation> list(ProjectInitiationInformationQueryBo query) {
        if(query==null){
            return new ArrayList<>(2);
        }
        return this.list(query.buildQuery());
    }

}
