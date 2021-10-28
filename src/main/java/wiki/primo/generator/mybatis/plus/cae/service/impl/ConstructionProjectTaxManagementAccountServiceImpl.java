package wiki.primo.generator.mybatis.plus.cae.service.impl;

import wiki.primo.generator.mybatis.plus.cae.entity.ConstructionProjectTaxManagementAccount;
import wiki.primo.generator.mybatis.plus.cae.mapper.ConstructionProjectTaxManagementAccountMapper;
import wiki.primo.generator.mybatis.plus.cae.service.IConstructionProjectTaxManagementAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import wiki.primo.generator.mybatis.plus.cae.query.ConstructionProjectTaxManagementAccountQueryBo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 建设项目税收管理台账  服务实现类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@Service
public class ConstructionProjectTaxManagementAccountServiceImpl extends ServiceImpl<ConstructionProjectTaxManagementAccountMapper, ConstructionProjectTaxManagementAccount> implements IConstructionProjectTaxManagementAccountService {

    /**
     * 按照条件分页查询
     * @param query
     */
    @Override
    public IPage<ConstructionProjectTaxManagementAccount> page(ConstructionProjectTaxManagementAccountQueryBo query,int pageNo,int pageSize){
        if(query==null){
            return new Page<>();
        }
        IPage<ConstructionProjectTaxManagementAccount> page = new Page<>();
        page.setCurrent(pageNo);
        page.setSize(pageSize);
        QueryWrapper<ConstructionProjectTaxManagementAccount> queryWrapper = query.buildQuery();
        return this.page(page, queryWrapper);
    }

    @Override
    public ConstructionProjectTaxManagementAccount getOne(ConstructionProjectTaxManagementAccountQueryBo query) {
        QueryWrapper<ConstructionProjectTaxManagementAccount> queryWrapper = query.buildQuery();
        return this.getOne(queryWrapper);
    }

    @Override
    public IPage<ConstructionProjectTaxManagementAccount> page(QueryWrapper<ConstructionProjectTaxManagementAccount> queryWrapper, int pageNo, int pageSize) {
        return getPage(queryWrapper,pageNo,pageSize,true);
    }

    @Override
    public IPage<ConstructionProjectTaxManagementAccount> pageNoCount(QueryWrapper<ConstructionProjectTaxManagementAccount> queryWrapper, int pageNo, int pageSize) {
        return getPage(queryWrapper,pageNo,pageSize,false);
    }

    private IPage<ConstructionProjectTaxManagementAccount> getPage(QueryWrapper<ConstructionProjectTaxManagementAccount> queryWrapper, int pageNo, int pageSize,boolean isSearchCount) {
        if(queryWrapper ==null){
            return new Page<>();
        }
        Page<ConstructionProjectTaxManagementAccount> page = new Page<>();
        page.setCurrent(pageNo);
        page.setSize(pageSize);
        page.setSearchCount(isSearchCount);
        return this.page(page, queryWrapper);
    }

    @Override
    public boolean update(ConstructionProjectTaxManagementAccount entity,ConstructionProjectTaxManagementAccountQueryBo query) {
        if(entity==null || query==null){
            return false;
        }
        return this.update(entity,query.buildQuery());
    }

    @Override
    public boolean updateByColumn(ConstructionProjectTaxManagementAccount entity, String column, Object value) {
        QueryWrapper<ConstructionProjectTaxManagementAccount> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(column,value);
        return this.update(entity, queryWrapper);
    }

    @Override
    public List<ConstructionProjectTaxManagementAccount> list(ConstructionProjectTaxManagementAccountQueryBo query) {
        if(query==null){
            return new ArrayList<>(2);
        }
        return this.list(query.buildQuery());
    }

}
