package wiki.primo.generator.mybatis.plus.cae.service.impl;

import wiki.primo.generator.mybatis.plus.cae.entity.DistrictProjectSchedule;
import wiki.primo.generator.mybatis.plus.cae.mapper.DistrictProjectScheduleMapper;
import wiki.primo.generator.mybatis.plus.cae.service.IDistrictProjectScheduleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import wiki.primo.generator.mybatis.plus.cae.query.DistrictProjectScheduleQueryBo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 区级重点项目计划表  服务实现类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@Service
public class DistrictProjectScheduleServiceImpl extends ServiceImpl<DistrictProjectScheduleMapper, DistrictProjectSchedule> implements IDistrictProjectScheduleService {

    /**
     * 按照条件分页查询
     * @param query
     */
    @Override
    public IPage<DistrictProjectSchedule> page(DistrictProjectScheduleQueryBo query,int pageNo,int pageSize){
        if(query==null){
            return new Page<>();
        }
        IPage<DistrictProjectSchedule> page = new Page<>();
        page.setCurrent(pageNo);
        page.setSize(pageSize);
        QueryWrapper<DistrictProjectSchedule> queryWrapper = query.buildQuery();
        return this.page(page, queryWrapper);
    }

    @Override
    public DistrictProjectSchedule getOne(DistrictProjectScheduleQueryBo query) {
        QueryWrapper<DistrictProjectSchedule> queryWrapper = query.buildQuery();
        return this.getOne(queryWrapper);
    }

    @Override
    public IPage<DistrictProjectSchedule> page(QueryWrapper<DistrictProjectSchedule> queryWrapper, int pageNo, int pageSize) {
        return getPage(queryWrapper,pageNo,pageSize,true);
    }

    @Override
    public IPage<DistrictProjectSchedule> pageNoCount(QueryWrapper<DistrictProjectSchedule> queryWrapper, int pageNo, int pageSize) {
        return getPage(queryWrapper,pageNo,pageSize,false);
    }

    private IPage<DistrictProjectSchedule> getPage(QueryWrapper<DistrictProjectSchedule> queryWrapper, int pageNo, int pageSize,boolean isSearchCount) {
        if(queryWrapper ==null){
            return new Page<>();
        }
        Page<DistrictProjectSchedule> page = new Page<>();
        page.setCurrent(pageNo);
        page.setSize(pageSize);
        page.setSearchCount(isSearchCount);
        return this.page(page, queryWrapper);
    }

    @Override
    public boolean update(DistrictProjectSchedule entity,DistrictProjectScheduleQueryBo query) {
        if(entity==null || query==null){
            return false;
        }
        return this.update(entity,query.buildQuery());
    }

    @Override
    public boolean updateByColumn(DistrictProjectSchedule entity, String column, Object value) {
        QueryWrapper<DistrictProjectSchedule> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(column,value);
        return this.update(entity, queryWrapper);
    }

    @Override
    public List<DistrictProjectSchedule> list(DistrictProjectScheduleQueryBo query) {
        if(query==null){
            return new ArrayList<>(2);
        }
        return this.list(query.buildQuery());
    }

}
