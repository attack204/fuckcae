package wiki.primo.generator.mybatis.plus.cae.controller;

import wiki.primo.generator.mybatis.plus.cae.service.IConstructionProjectTaxManagementAccountService;
import wiki.primo.generator.mybatis.plus.cae.entity.ConstructionProjectTaxManagementAccount;
import wiki.primo.generator.mybatis.plus.cae.result.ResultModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.baomidou.mybatisplus.core.metadata.IPage;
import wiki.primo.generator.mybatis.plus.cae.query.ConstructionProjectTaxManagementAccountQueryBo;

/**
 * <p>
 * 建设项目税收管理台账  前端控制器
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@Controller
@RequestMapping("/constructionprojecttaxmanagementaccount")
public class ConstructionProjectTaxManagementAccountController {

    @Autowired
    private IConstructionProjectTaxManagementAccountService iConstructionProjectTaxManagementAccountService;

    /**
     * 添加对象
     *
     * @param constructionProjectTaxManagementAccount 对象
     * @return ResultModel统一响应结果
     */
    @PostMapping("save")
    @ResponseBody
    public ResultModel<Object> save(ConstructionProjectTaxManagementAccount constructionProjectTaxManagementAccount) {
        if(constructionProjectTaxManagementAccount==null){
            return ResultModel.parameterError();
        }
        iConstructionProjectTaxManagementAccountService.save(constructionProjectTaxManagementAccount);
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
        boolean success = iConstructionProjectTaxManagementAccountService.removeById(id);
        if(success) {
            return ResultModel.success();
        }else {
            return ResultModel.fail();
        }
    }

    /**
     * 根据ID进行修改对象
     *
     * @param constructionProjectTaxManagementAccount 对象中必须有ID主键
     * @return ResultModel统一响应结果
     */
    @PostMapping("update")
    @ResponseBody
    public ResultModel<Object> update(ConstructionProjectTaxManagementAccount constructionProjectTaxManagementAccount) {
        if(constructionProjectTaxManagementAccount==null || constructionProjectTaxManagementAccount.getId()==null){
            return ResultModel.parameterError();
        }
        boolean success = iConstructionProjectTaxManagementAccountService.updateById(constructionProjectTaxManagementAccount);
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
    public ResultModel<ConstructionProjectTaxManagementAccount> getById(@RequestParam Integer id) {
        if(id==null || id<0){
            return ResultModel.parameterError();
        }
        ConstructionProjectTaxManagementAccount constructionProjectTaxManagementAccount = iConstructionProjectTaxManagementAccountService.getById(id);
        return ResultModel.success(constructionProjectTaxManagementAccount);
    }

    /**
     * 分页查询
     *
     * @return ResultModel统一响应结果
     */
    @PostMapping("page")
    @ResponseBody
    public ResultModel<IPage<ConstructionProjectTaxManagementAccount>> page(ConstructionProjectTaxManagementAccountQueryBo queryBo,int pageNo,int pageSize) {
        if(queryBo==null){
            return ResultModel.parameterError();
        }
        IPage<ConstructionProjectTaxManagementAccount> templateIPage = iConstructionProjectTaxManagementAccountService.page(queryBo,pageNo,pageSize);
        return ResultModel.success(templateIPage);
    }

}
