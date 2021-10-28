package wiki.primo.generator.mybatis.plus.cae.service.impl;

import wiki.primo.generator.mybatis.plus.cae.entity.SysRolePerm;
import wiki.primo.generator.mybatis.plus.cae.mapper.SysRolePermMapper;
import wiki.primo.generator.mybatis.plus.cae.service.ISysRolePermService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import wiki.primo.generator.mybatis.plus.cae.query.SysRolePermQueryBo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 角色权限表  服务实现类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@Service
public class SysRolePermServiceImpl extends ServiceImpl<SysRolePermMapper, SysRolePerm> implements ISysRolePermService {

    /**
     * 按照条件分页查询
     * @param query
     */
    @Override
    public IPage<SysRolePerm> page(SysRolePermQueryBo query,int pageNo,int pageSize){
        if(query==null){
            return new Page<>();
        }
        IPage<SysRolePerm> page = new Page<>();
        page.setCurrent(pageNo);
        page.setSize(pageSize);
        QueryWrapper<SysRolePerm> queryWrapper = query.buildQuery();
        return this.page(page, queryWrapper);
    }

    @Override
    public SysRolePerm getOne(SysRolePermQueryBo query) {
        QueryWrapper<SysRolePerm> queryWrapper = query.buildQuery();
        return this.getOne(queryWrapper);
    }

    @Override
    public IPage<SysRolePerm> page(QueryWrapper<SysRolePerm> queryWrapper, int pageNo, int pageSize) {
        return getPage(queryWrapper,pageNo,pageSize,true);
    }

    @Override
    public IPage<SysRolePerm> pageNoCount(QueryWrapper<SysRolePerm> queryWrapper, int pageNo, int pageSize) {
        return getPage(queryWrapper,pageNo,pageSize,false);
    }

    private IPage<SysRolePerm> getPage(QueryWrapper<SysRolePerm> queryWrapper, int pageNo, int pageSize,boolean isSearchCount) {
        if(queryWrapper ==null){
            return new Page<>();
        }
        Page<SysRolePerm> page = new Page<>();
        page.setCurrent(pageNo);
        page.setSize(pageSize);
        page.setSearchCount(isSearchCount);
        return this.page(page, queryWrapper);
    }

    @Override
    public boolean update(SysRolePerm entity,SysRolePermQueryBo query) {
        if(entity==null || query==null){
            return false;
        }
        return this.update(entity,query.buildQuery());
    }

    @Override
    public boolean updateByColumn(SysRolePerm entity, String column, Object value) {
        QueryWrapper<SysRolePerm> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(column,value);
        return this.update(entity, queryWrapper);
    }

    @Override
    public List<SysRolePerm> list(SysRolePermQueryBo query) {
        if(query==null){
            return new ArrayList<>(2);
        }
        return this.list(query.buildQuery());
    }

}
