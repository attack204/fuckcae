package wiki.primo.generator.mybatis.plus.cae.service;

import wiki.primo.generator.mybatis.plus.cae.entity.LandAndHousingExpropriationCompensationInformation;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import wiki.primo.generator.mybatis.plus.cae.query.LandAndHousingExpropriationCompensationInformationQueryBo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
public interface ILandAndHousingExpropriationCompensationInformationService extends IService<LandAndHousingExpropriationCompensationInformation> {
    /**
     * 按照条件分页查询
     * @param query 查询条件
     */
    IPage<LandAndHousingExpropriationCompensationInformation> page(LandAndHousingExpropriationCompensationInformationQueryBo query,int pageNo,int pageSize);

    /**
     * 查询单个的，注意，条件需要有唯一建
     * @param query
     * @return
     */
    LandAndHousingExpropriationCompensationInformation getOne(LandAndHousingExpropriationCompensationInformationQueryBo query);

    /**
     * 按照条件分页查询
     * @param queryWrapper 查询条件
     */
    IPage<LandAndHousingExpropriationCompensationInformation> page(QueryWrapper<LandAndHousingExpropriationCompensationInformation> queryWrapper,int pageNo,int pageSize);

    /**
     * 按照条件分页查询-不查询总页数，当不需要总页数时，可极大提升查询性能
     * @param queryWrapper 查询条件
     */
    IPage<LandAndHousingExpropriationCompensationInformation> pageNoCount(QueryWrapper<LandAndHousingExpropriationCompensationInformation> queryWrapper, int pageNo, int pageSize);
    /**
     * 按照条件更新
     * @param entity
     * @param query
     * @return
     */
    boolean update(LandAndHousingExpropriationCompensationInformation entity,LandAndHousingExpropriationCompensationInformationQueryBo query);

    /**
     * 通过一个相等的条件，修改数据
     * @param entity 修改的数据
     * @param column 数据库列名
     * @param value 条件值
     * @return true-修改成功
     */
    boolean updateByColumn(LandAndHousingExpropriationCompensationInformation entity,String column,Object value);

    /**
     * 按照条件查询所有
     * @param query 查询条件
     */
    List<LandAndHousingExpropriationCompensationInformation> list(LandAndHousingExpropriationCompensationInformationQueryBo query);

}
