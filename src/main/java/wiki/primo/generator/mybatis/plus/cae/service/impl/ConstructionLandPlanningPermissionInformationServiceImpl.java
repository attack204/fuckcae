package wiki.primo.generator.mybatis.plus.cae.service.impl;

import wiki.primo.generator.mybatis.plus.cae.entity.ConstructionLandPlanningPermissionInformation;
import wiki.primo.generator.mybatis.plus.cae.mapper.ConstructionLandPlanningPermissionInformationMapper;
import wiki.primo.generator.mybatis.plus.cae.service.IConstructionLandPlanningPermissionInformationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import wiki.primo.generator.mybatis.plus.cae.query.ConstructionLandPlanningPermissionInformationQueryBo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 建设用地规划许可信息  服务实现类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@Service
public class ConstructionLandPlanningPermissionInformationServiceImpl extends ServiceImpl<ConstructionLandPlanningPermissionInformationMapper, ConstructionLandPlanningPermissionInformation> implements IConstructionLandPlanningPermissionInformationService {

    /**
     * 按照条件分页查询
     * @param query
     */
    @Override
    public IPage<ConstructionLandPlanningPermissionInformation> page(ConstructionLandPlanningPermissionInformationQueryBo query,int pageNo,int pageSize){
        if(query==null){
            return new Page<>();
        }
        IPage<ConstructionLandPlanningPermissionInformation> page = new Page<>();
        page.setCurrent(pageNo);
        page.setSize(pageSize);
        QueryWrapper<ConstructionLandPlanningPermissionInformation> queryWrapper = query.buildQuery();
        return this.page(page, queryWrapper);
    }

    @Override
    public ConstructionLandPlanningPermissionInformation getOne(ConstructionLandPlanningPermissionInformationQueryBo query) {
        QueryWrapper<ConstructionLandPlanningPermissionInformation> queryWrapper = query.buildQuery();
        return this.getOne(queryWrapper);
    }

    @Override
    public IPage<ConstructionLandPlanningPermissionInformation> page(QueryWrapper<ConstructionLandPlanningPermissionInformation> queryWrapper, int pageNo, int pageSize) {
        return getPage(queryWrapper,pageNo,pageSize,true);
    }

    @Override
    public IPage<ConstructionLandPlanningPermissionInformation> pageNoCount(QueryWrapper<ConstructionLandPlanningPermissionInformation> queryWrapper, int pageNo, int pageSize) {
        return getPage(queryWrapper,pageNo,pageSize,false);
    }

    private IPage<ConstructionLandPlanningPermissionInformation> getPage(QueryWrapper<ConstructionLandPlanningPermissionInformation> queryWrapper, int pageNo, int pageSize,boolean isSearchCount) {
        if(queryWrapper ==null){
            return new Page<>();
        }
        Page<ConstructionLandPlanningPermissionInformation> page = new Page<>();
        page.setCurrent(pageNo);
        page.setSize(pageSize);
        page.setSearchCount(isSearchCount);
        return this.page(page, queryWrapper);
    }

    @Override
    public boolean update(ConstructionLandPlanningPermissionInformation entity,ConstructionLandPlanningPermissionInformationQueryBo query) {
        if(entity==null || query==null){
            return false;
        }
        return this.update(entity,query.buildQuery());
    }

    @Override
    public boolean updateByColumn(ConstructionLandPlanningPermissionInformation entity, String column, Object value) {
        QueryWrapper<ConstructionLandPlanningPermissionInformation> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(column,value);
        return this.update(entity, queryWrapper);
    }

    @Override
    public List<ConstructionLandPlanningPermissionInformation> list(ConstructionLandPlanningPermissionInformationQueryBo query) {
        if(query==null){
            return new ArrayList<>(2);
        }
        return this.list(query.buildQuery());
    }

}
