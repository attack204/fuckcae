package wiki.primo.generator.mybatis.plus.cae.controller;

import wiki.primo.generator.mybatis.plus.cae.service.IConstructionUnitInformationService;
import wiki.primo.generator.mybatis.plus.cae.entity.ConstructionUnitInformation;
import wiki.primo.generator.mybatis.plus.cae.result.ResultModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.baomidou.mybatisplus.core.metadata.IPage;
import wiki.primo.generator.mybatis.plus.cae.query.ConstructionUnitInformationQueryBo;

/**
 * <p>
 * 施工单位信息  前端控制器
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@Controller
@RequestMapping("/constructionunitinformation")
public class ConstructionUnitInformationController {

    @Autowired
    private IConstructionUnitInformationService iConstructionUnitInformationService;

    /**
     * 添加对象
     *
     * @param constructionUnitInformation 对象
     * @return ResultModel统一响应结果
     */
    @PostMapping("save")
    @ResponseBody
    public ResultModel<Object> save(ConstructionUnitInformation constructionUnitInformation) {
        if(constructionUnitInformation==null){
            return ResultModel.parameterError();
        }
        iConstructionUnitInformationService.save(constructionUnitInformation);
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
        boolean success = iConstructionUnitInformationService.removeById(id);
        if(success) {
            return ResultModel.success();
        }else {
            return ResultModel.fail();
        }
    }

    /**
     * 根据ID进行修改对象
     *
     * @param constructionUnitInformation 对象中必须有ID主键
     * @return ResultModel统一响应结果
     */
    @PostMapping("update")
    @ResponseBody
    public ResultModel<Object> update(ConstructionUnitInformation constructionUnitInformation) {
        if(constructionUnitInformation==null || constructionUnitInformation.getId()==null){
            return ResultModel.parameterError();
        }
        boolean success = iConstructionUnitInformationService.updateById(constructionUnitInformation);
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
    public ResultModel<ConstructionUnitInformation> getById(@RequestParam Integer id) {
        if(id==null || id<0){
            return ResultModel.parameterError();
        }
        ConstructionUnitInformation constructionUnitInformation = iConstructionUnitInformationService.getById(id);
        return ResultModel.success(constructionUnitInformation);
    }

    /**
     * 分页查询
     *
     * @return ResultModel统一响应结果
     */
    @PostMapping("page")
    @ResponseBody
    public ResultModel<IPage<ConstructionUnitInformation>> page(ConstructionUnitInformationQueryBo queryBo,int pageNo,int pageSize) {
        if(queryBo==null){
            return ResultModel.parameterError();
        }
        IPage<ConstructionUnitInformation> templateIPage = iConstructionUnitInformationService.page(queryBo,pageNo,pageSize);
        return ResultModel.success(templateIPage);
    }

}
