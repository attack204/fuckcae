package wiki.primo.generator.mybatis.plus.cae.controller;

import wiki.primo.generator.mybatis.plus.cae.service.ISysRolePermService;
import wiki.primo.generator.mybatis.plus.cae.entity.SysRolePerm;
import wiki.primo.generator.mybatis.plus.cae.result.ResultModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.baomidou.mybatisplus.core.metadata.IPage;
import wiki.primo.generator.mybatis.plus.cae.query.SysRolePermQueryBo;

/**
 * <p>
 * 角色权限表  前端控制器
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@Controller
@RequestMapping("/sysroleperm")
public class SysRolePermController {

    @Autowired
    private ISysRolePermService iSysRolePermService;

    /**
     * 添加对象
     *
     * @param sysRolePerm 对象
     * @return ResultModel统一响应结果
     */
    @PostMapping("save")
    @ResponseBody
    public ResultModel<Object> save(SysRolePerm sysRolePerm) {
        if(sysRolePerm==null){
            return ResultModel.parameterError();
        }
        iSysRolePermService.save(sysRolePerm);
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
        boolean success = iSysRolePermService.removeById(id);
        if(success) {
            return ResultModel.success();
        }else {
            return ResultModel.fail();
        }
    }

    /**
     * 根据ID进行修改对象
     *
     * @param sysRolePerm 对象中必须有ID主键
     * @return ResultModel统一响应结果
     */
    @PostMapping("update")
    @ResponseBody
    public ResultModel<Object> update(SysRolePerm sysRolePerm) {
        if(sysRolePerm==null || sysRolePerm.getId()==null){
            return ResultModel.parameterError();
        }
        boolean success = iSysRolePermService.updateById(sysRolePerm);
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
    public ResultModel<SysRolePerm> getById(@RequestParam Integer id) {
        if(id==null || id<0){
            return ResultModel.parameterError();
        }
        SysRolePerm sysRolePerm = iSysRolePermService.getById(id);
        return ResultModel.success(sysRolePerm);
    }

    /**
     * 分页查询
     *
     * @return ResultModel统一响应结果
     */
    @PostMapping("page")
    @ResponseBody
    public ResultModel<IPage<SysRolePerm>> page(SysRolePermQueryBo queryBo,int pageNo,int pageSize) {
        if(queryBo==null){
            return ResultModel.parameterError();
        }
        IPage<SysRolePerm> templateIPage = iSysRolePermService.page(queryBo,pageNo,pageSize);
        return ResultModel.success(templateIPage);
    }

}
