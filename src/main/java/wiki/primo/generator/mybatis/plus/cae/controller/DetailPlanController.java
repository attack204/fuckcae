package wiki.primo.generator.mybatis.plus.cae.controller;

import wiki.primo.generator.mybatis.plus.cae.service.IDetailPlanService;
import wiki.primo.generator.mybatis.plus.cae.entity.DetailPlan;
import wiki.primo.generator.mybatis.plus.cae.result.ResultModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.baomidou.mybatisplus.core.metadata.IPage;
import wiki.primo.generator.mybatis.plus.cae.query.DetailPlanQueryBo;

/**
 * <p>
 * 项目进度明细表  前端控制器
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@Controller
@RequestMapping("/detailplan")
public class DetailPlanController {

    @Autowired
    private IDetailPlanService iDetailPlanService;

    /**
     * 添加对象
     *
     * @param detailPlan 对象
     * @return ResultModel统一响应结果
     */
    @PostMapping("save")
    @ResponseBody
    public ResultModel<Object> save(DetailPlan detailPlan) {
        if(detailPlan==null){
            return ResultModel.parameterError();
        }
        iDetailPlanService.save(detailPlan);
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
        boolean success = iDetailPlanService.removeById(id);
        if(success) {
            return ResultModel.success();
        }else {
            return ResultModel.fail();
        }
    }

    /**
     * 根据ID进行修改对象
     *
     * @param detailPlan 对象中必须有ID主键
     * @return ResultModel统一响应结果
     */
    @PostMapping("update")
    @ResponseBody
    public ResultModel<Object> update(DetailPlan detailPlan) {
        if(detailPlan==null || detailPlan.getId()==null){
            return ResultModel.parameterError();
        }
        boolean success = iDetailPlanService.updateById(detailPlan);
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
    public ResultModel<DetailPlan> getById(@RequestParam Integer id) {
        if(id==null || id<0){
            return ResultModel.parameterError();
        }
        DetailPlan detailPlan = iDetailPlanService.getById(id);
        return ResultModel.success(detailPlan);
    }

    /**
     * 分页查询
     *
     * @return ResultModel统一响应结果
     */
    @PostMapping("page")
    @ResponseBody
    public ResultModel<IPage<DetailPlan>> page(DetailPlanQueryBo queryBo,int pageNo,int pageSize) {
        if(queryBo==null){
            return ResultModel.parameterError();
        }
        IPage<DetailPlan> templateIPage = iDetailPlanService.page(queryBo,pageNo,pageSize);
        return ResultModel.success(templateIPage);
    }

}
