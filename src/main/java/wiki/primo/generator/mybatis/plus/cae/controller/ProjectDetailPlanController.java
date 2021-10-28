package wiki.primo.generator.mybatis.plus.cae.controller;

import wiki.primo.generator.mybatis.plus.cae.service.IProjectDetailPlanService;
import wiki.primo.generator.mybatis.plus.cae.entity.ProjectDetailPlan;
import wiki.primo.generator.mybatis.plus.cae.result.ResultModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.baomidou.mybatisplus.core.metadata.IPage;
import wiki.primo.generator.mybatis.plus.cae.query.ProjectDetailPlanQueryBo;

/**
 * <p>
 * 项目详细计划映射表  前端控制器
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@Controller
@RequestMapping("/projectdetailplan")
public class ProjectDetailPlanController {

    @Autowired
    private IProjectDetailPlanService iProjectDetailPlanService;

    /**
     * 添加对象
     *
     * @param projectDetailPlan 对象
     * @return ResultModel统一响应结果
     */
    @PostMapping("save")
    @ResponseBody
    public ResultModel<Object> save(ProjectDetailPlan projectDetailPlan) {
        if(projectDetailPlan==null){
            return ResultModel.parameterError();
        }
        iProjectDetailPlanService.save(projectDetailPlan);
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
        boolean success = iProjectDetailPlanService.removeById(id);
        if(success) {
            return ResultModel.success();
        }else {
            return ResultModel.fail();
        }
    }

    /**
     * 根据ID进行修改对象
     *
     * @param projectDetailPlan 对象中必须有ID主键
     * @return ResultModel统一响应结果
     */
    @PostMapping("update")
    @ResponseBody
    public ResultModel<Object> update(ProjectDetailPlan projectDetailPlan) {
        if(projectDetailPlan==null || projectDetailPlan.getId()==null){
            return ResultModel.parameterError();
        }
        boolean success = iProjectDetailPlanService.updateById(projectDetailPlan);
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
    public ResultModel<ProjectDetailPlan> getById(@RequestParam Integer id) {
        if(id==null || id<0){
            return ResultModel.parameterError();
        }
        ProjectDetailPlan projectDetailPlan = iProjectDetailPlanService.getById(id);
        return ResultModel.success(projectDetailPlan);
    }

    /**
     * 分页查询
     *
     * @return ResultModel统一响应结果
     */
    @PostMapping("page")
    @ResponseBody
    public ResultModel<IPage<ProjectDetailPlan>> page(ProjectDetailPlanQueryBo queryBo,int pageNo,int pageSize) {
        if(queryBo==null){
            return ResultModel.parameterError();
        }
        IPage<ProjectDetailPlan> templateIPage = iProjectDetailPlanService.page(queryBo,pageNo,pageSize);
        return ResultModel.success(templateIPage);
    }

}
