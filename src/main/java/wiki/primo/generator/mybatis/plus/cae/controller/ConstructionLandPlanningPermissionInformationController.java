package wiki.primo.generator.mybatis.plus.cae.controller;

import wiki.primo.generator.mybatis.plus.cae.service.IConstructionLandPlanningPermissionInformationService;
import wiki.primo.generator.mybatis.plus.cae.entity.ConstructionLandPlanningPermissionInformation;
import wiki.primo.generator.mybatis.plus.cae.result.ResultModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.baomidou.mybatisplus.core.metadata.IPage;
import wiki.primo.generator.mybatis.plus.cae.query.ConstructionLandPlanningPermissionInformationQueryBo;

/**
 * <p>
 * 建设用地规划许可信息  前端控制器
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@Controller
@RequestMapping("/constructionlandplanningpermissioninformation")
public class ConstructionLandPlanningPermissionInformationController {

    @Autowired
    private IConstructionLandPlanningPermissionInformationService iConstructionLandPlanningPermissionInformationService;

    /**
     * 添加对象
     *
     * @param constructionLandPlanningPermissionInformation 对象
     * @return ResultModel统一响应结果
     */
    @PostMapping("save")
    @ResponseBody
    public ResultModel<Object> save(ConstructionLandPlanningPermissionInformation constructionLandPlanningPermissionInformation) {
        if(constructionLandPlanningPermissionInformation==null){
            return ResultModel.parameterError();
        }
        iConstructionLandPlanningPermissionInformationService.save(constructionLandPlanningPermissionInformation);
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
        boolean success = iConstructionLandPlanningPermissionInformationService.removeById(id);
        if(success) {
            return ResultModel.success();
        }else {
            return ResultModel.fail();
        }
    }

    /**
     * 根据ID进行修改对象
     *
     * @param constructionLandPlanningPermissionInformation 对象中必须有ID主键
     * @return ResultModel统一响应结果
     */
    @PostMapping("update")
    @ResponseBody
    public ResultModel<Object> update(ConstructionLandPlanningPermissionInformation constructionLandPlanningPermissionInformation) {
        if(constructionLandPlanningPermissionInformation==null || constructionLandPlanningPermissionInformation.getId()==null){
            return ResultModel.parameterError();
        }
        boolean success = iConstructionLandPlanningPermissionInformationService.updateById(constructionLandPlanningPermissionInformation);
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
    public ResultModel<ConstructionLandPlanningPermissionInformation> getById(@RequestParam Integer id) {
        if(id==null || id<0){
            return ResultModel.parameterError();
        }
        ConstructionLandPlanningPermissionInformation constructionLandPlanningPermissionInformation = iConstructionLandPlanningPermissionInformationService.getById(id);
        return ResultModel.success(constructionLandPlanningPermissionInformation);
    }

    /**
     * 分页查询
     *
     * @return ResultModel统一响应结果
     */
    @PostMapping("page")
    @ResponseBody
    public ResultModel<IPage<ConstructionLandPlanningPermissionInformation>> page(ConstructionLandPlanningPermissionInformationQueryBo queryBo,int pageNo,int pageSize) {
        if(queryBo==null){
            return ResultModel.parameterError();
        }
        IPage<ConstructionLandPlanningPermissionInformation> templateIPage = iConstructionLandPlanningPermissionInformationService.page(queryBo,pageNo,pageSize);
        return ResultModel.success(templateIPage);
    }

}
