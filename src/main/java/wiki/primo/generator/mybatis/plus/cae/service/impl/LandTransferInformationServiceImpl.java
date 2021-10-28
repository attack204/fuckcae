package wiki.primo.generator.mybatis.plus.cae.service.impl;

import wiki.primo.generator.mybatis.plus.cae.entity.LandTransferInformation;
import wiki.primo.generator.mybatis.plus.cae.mapper.LandTransferInformationMapper;
import wiki.primo.generator.mybatis.plus.cae.service.ILandTransferInformationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import wiki.primo.generator.mybatis.plus.cae.query.LandTransferInformationQueryBo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 土地转让信息  服务实现类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@Service
public class LandTransferInformationServiceImpl extends ServiceImpl<LandTransferInformationMapper, LandTransferInformation> implements ILandTransferInformationService {

    /**
     * 按照条件分页查询
     * @param query
     */
    @Override
    public IPage<LandTransferInformation> page(LandTransferInformationQueryBo query,int pageNo,int pageSize){
        if(query==null){
            return new Page<>();
        }
        IPage<LandTransferInformation> page = new Page<>();
        page.setCurrent(pageNo);
        page.setSize(pageSize);
        QueryWrapper<LandTransferInformation> queryWrapper = query.buildQuery();
        return this.page(page, queryWrapper);
    }

    @Override
    public LandTransferInformation getOne(LandTransferInformationQueryBo query) {
        QueryWrapper<LandTransferInformation> queryWrapper = query.buildQuery();
        return this.getOne(queryWrapper);
    }

    @Override
    public IPage<LandTransferInformation> page(QueryWrapper<LandTransferInformation> queryWrapper, int pageNo, int pageSize) {
        return getPage(queryWrapper,pageNo,pageSize,true);
    }

    @Override
    public IPage<LandTransferInformation> pageNoCount(QueryWrapper<LandTransferInformation> queryWrapper, int pageNo, int pageSize) {
        return getPage(queryWrapper,pageNo,pageSize,false);
    }

    private IPage<LandTransferInformation> getPage(QueryWrapper<LandTransferInformation> queryWrapper, int pageNo, int pageSize,boolean isSearchCount) {
        if(queryWrapper ==null){
            return new Page<>();
        }
        Page<LandTransferInformation> page = new Page<>();
        page.setCurrent(pageNo);
        page.setSize(pageSize);
        page.setSearchCount(isSearchCount);
        return this.page(page, queryWrapper);
    }

    @Override
    public boolean update(LandTransferInformation entity,LandTransferInformationQueryBo query) {
        if(entity==null || query==null){
            return false;
        }
        return this.update(entity,query.buildQuery());
    }

    @Override
    public boolean updateByColumn(LandTransferInformation entity, String column, Object value) {
        QueryWrapper<LandTransferInformation> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(column,value);
        return this.update(entity, queryWrapper);
    }

    @Override
    public List<LandTransferInformation> list(LandTransferInformationQueryBo query) {
        if(query==null){
            return new ArrayList<>(2);
        }
        return this.list(query.buildQuery());
    }

}
