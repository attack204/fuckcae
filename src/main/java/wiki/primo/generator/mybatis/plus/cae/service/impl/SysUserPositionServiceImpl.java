package wiki.primo.generator.mybatis.plus.cae.service.impl;

import wiki.primo.generator.mybatis.plus.cae.entity.SysUserPosition;
import wiki.primo.generator.mybatis.plus.cae.mapper.SysUserPositionMapper;
import wiki.primo.generator.mybatis.plus.cae.service.ISysUserPositionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import wiki.primo.generator.mybatis.plus.cae.query.SysUserPositionQueryBo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 用户地区表  服务实现类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@Service
public class SysUserPositionServiceImpl extends ServiceImpl<SysUserPositionMapper, SysUserPosition> implements ISysUserPositionService {

    /**
     * 按照条件分页查询
     * @param query
     */
    @Override
    public IPage<SysUserPosition> page(SysUserPositionQueryBo query,int pageNo,int pageSize){
        if(query==null){
            return new Page<>();
        }
        IPage<SysUserPosition> page = new Page<>();
        page.setCurrent(pageNo);
        page.setSize(pageSize);
        QueryWrapper<SysUserPosition> queryWrapper = query.buildQuery();
        return this.page(page, queryWrapper);
    }

    @Override
    public SysUserPosition getOne(SysUserPositionQueryBo query) {
        QueryWrapper<SysUserPosition> queryWrapper = query.buildQuery();
        return this.getOne(queryWrapper);
    }

    @Override
    public IPage<SysUserPosition> page(QueryWrapper<SysUserPosition> queryWrapper, int pageNo, int pageSize) {
        return getPage(queryWrapper,pageNo,pageSize,true);
    }

    @Override
    public IPage<SysUserPosition> pageNoCount(QueryWrapper<SysUserPosition> queryWrapper, int pageNo, int pageSize) {
        return getPage(queryWrapper,pageNo,pageSize,false);
    }

    private IPage<SysUserPosition> getPage(QueryWrapper<SysUserPosition> queryWrapper, int pageNo, int pageSize,boolean isSearchCount) {
        if(queryWrapper ==null){
            return new Page<>();
        }
        Page<SysUserPosition> page = new Page<>();
        page.setCurrent(pageNo);
        page.setSize(pageSize);
        page.setSearchCount(isSearchCount);
        return this.page(page, queryWrapper);
    }

    @Override
    public boolean update(SysUserPosition entity,SysUserPositionQueryBo query) {
        if(entity==null || query==null){
            return false;
        }
        return this.update(entity,query.buildQuery());
    }

    @Override
    public boolean updateByColumn(SysUserPosition entity, String column, Object value) {
        QueryWrapper<SysUserPosition> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(column,value);
        return this.update(entity, queryWrapper);
    }

    @Override
    public List<SysUserPosition> list(SysUserPositionQueryBo query) {
        if(query==null){
            return new ArrayList<>(2);
        }
        return this.list(query.buildQuery());
    }

}
