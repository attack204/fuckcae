package wiki.primo.generator.mybatis.plus.cae.service.impl;

import wiki.primo.generator.mybatis.plus.cae.entity.LandAndHousingExpropriationCompensationInformation;
import wiki.primo.generator.mybatis.plus.cae.mapper.LandAndHousingExpropriationCompensationInformationMapper;
import wiki.primo.generator.mybatis.plus.cae.service.ILandAndHousingExpropriationCompensationInformationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import wiki.primo.generator.mybatis.plus.cae.query.LandAndHousingExpropriationCompensationInformationQueryBo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 土地及房屋征收补偿信息  服务实现类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@Service
public class LandAndHousingExpropriationCompensationInformationServiceImpl extends ServiceImpl<LandAndHousingExpropriationCompensationInformationMapper, LandAndHousingExpropriationCompensationInformation> implements ILandAndHousingExpropriationCompensationInformationService {

    /**
     * 按照条件分页查询
     * @param query
     */
    @Override
    public IPage<LandAndHousingExpropriationCompensationInformation> page(LandAndHousingExpropriationCompensationInformationQueryBo query,int pageNo,int pageSize){
        if(query==null){
            return new Page<>();
        }
        IPage<LandAndHousingExpropriationCompensationInformation> page = new Page<>();
        page.setCurrent(pageNo);
        page.setSize(pageSize);
        QueryWrapper<LandAndHousingExpropriationCompensationInformation> queryWrapper = query.buildQuery();
        return this.page(page, queryWrapper);
    }

    @Override
    public LandAndHousingExpropriationCompensationInformation getOne(LandAndHousingExpropriationCompensationInformationQueryBo query) {
        QueryWrapper<LandAndHousingExpropriationCompensationInformation> queryWrapper = query.buildQuery();
        return this.getOne(queryWrapper);
    }

    @Override
    public IPage<LandAndHousingExpropriationCompensationInformation> page(QueryWrapper<LandAndHousingExpropriationCompensationInformation> queryWrapper, int pageNo, int pageSize) {
        return getPage(queryWrapper,pageNo,pageSize,true);
    }

    @Override
    public IPage<LandAndHousingExpropriationCompensationInformation> pageNoCount(QueryWrapper<LandAndHousingExpropriationCompensationInformation> queryWrapper, int pageNo, int pageSize) {
        return getPage(queryWrapper,pageNo,pageSize,false);
    }

    private IPage<LandAndHousingExpropriationCompensationInformation> getPage(QueryWrapper<LandAndHousingExpropriationCompensationInformation> queryWrapper, int pageNo, int pageSize,boolean isSearchCount) {
        if(queryWrapper ==null){
            return new Page<>();
        }
        Page<LandAndHousingExpropriationCompensationInformation> page = new Page<>();
        page.setCurrent(pageNo);
        page.setSize(pageSize);
        page.setSearchCount(isSearchCount);
        return this.page(page, queryWrapper);
    }

    @Override
    public boolean update(LandAndHousingExpropriationCompensationInformation entity,LandAndHousingExpropriationCompensationInformationQueryBo query) {
        if(entity==null || query==null){
            return false;
        }
        return this.update(entity,query.buildQuery());
    }

    @Override
    public boolean updateByColumn(LandAndHousingExpropriationCompensationInformation entity, String column, Object value) {
        QueryWrapper<LandAndHousingExpropriationCompensationInformation> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(column,value);
        return this.update(entity, queryWrapper);
    }

    @Override
    public List<LandAndHousingExpropriationCompensationInformation> list(LandAndHousingExpropriationCompensationInformationQueryBo query) {
        if(query==null){
            return new ArrayList<>(2);
        }
        return this.list(query.buildQuery());
    }

}
