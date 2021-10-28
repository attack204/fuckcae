package wiki.primo.generator.mybatis.plus.cae.controller;

import wiki.primo.generator.mybatis.plus.cae.service.IDistrictDetailPlanService;
import wiki.primo.generator.mybatis.plus.cae.entity.DistrictDetailPlan;
import wiki.primo.generator.mybatis.plus.cae.result.ResultModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.baomidou.mybatisplus.core.metadata.IPage;
import wiki.primo.generator.mybatis.plus.cae.query.DistrictDetailPlanQueryBo;

/**
 * <p>
 * 区级重点项目进度明细表  前端控制器
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@Controller
@RequestMapping("/districtdetailplan")
public class DistrictDetailPlanController {

    @Autowired
    private IDistrictDetailPlanService iDistrictDetailPlanService;

    /**
     * 添加对象
     *
     * @param districtDetailPlan 对象
     * @return ResultModel统一响应结果
     */
    @PostMapping("save")
    @ResponseBody
    public ResultModel<Object> save(DistrictDetailPlan districtDetailPlan) {
        if(districtDetailPlan==null){
            return ResultModel.parameterError();
        }
        iDistrictDetailPlanService.save(districtDetailPlan);
        return ResultModel.success();
    }

    /**
     * 根据ID进行删除
     *
     * @param id 主键
     * @return ResultModel统一响应结果
     */
    @GetMapping("removeById")
    @ResponseBody
    public ResultModel<Object> delete(@RequestParam Integer id) {
        if(id==null || id<0){
            return ResultModel.parameterError();
        }
        boolean success = iDistrictDetailPlanService.removeById(id);
        if(success) {
            return ResultModel.success();
        }else {
            return ResultModel.fail();
        }
    }

    /**
     * 根据ID进行修改对象
     *
     * @param districtDetailPlan 对象中必须有ID主键
     * @return ResultModel统一响应结果
     */
    @PostMapping("update")
    @ResponseBody
    public ResultModel<Object> update(DistrictDetailPlan districtDetailPlan) {
        if(districtDetailPlan==null || districtDetailPlan.getId()==null){
            return ResultModel.parameterError();
        }
        boolean success = iDistrictDetailPlanService.updateById(districtDetailPlan);
        if(success) {
            return ResultModel.success();
        }else {
            return ResultModel.fail();
        }
    }

    /**
     * 查询详情
     *
     * @param id 主键
     * @return ResultModel统一响应结果
     */
    @GetMapping("getById")
    @ResponseBody
    public ResultModel<DistrictDetailPlan> getById(@RequestParam Integer id) {
        if(id==null || id<0){
            return ResultModel.parameterError();
        }
        DistrictDetailPlan districtDetailPlan = iDistrictDetailPlanService.getById(id);
        return ResultModel.success(districtDetailPlan);
    }

    /**
     * 分页查询
     *
     * @return ResultModel统一响应结果
     */
    @PostMapping("page")
    @ResponseBody
    public ResultModel<IPage<DistrictDetailPlan>> page(DistrictDetailPlanQueryBo queryBo,int pageNo,int pageSize) {
        if(queryBo==null){
            return ResultModel.parameterError();
        }
        IPage<DistrictDetailPlan> templateIPage = iDistrictDetailPlanService.page(queryBo,pageNo,pageSize);
        return ResultModel.success(templateIPage);
    }

}
