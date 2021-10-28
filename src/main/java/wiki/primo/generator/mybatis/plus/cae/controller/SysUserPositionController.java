package wiki.primo.generator.mybatis.plus.cae.controller;

import wiki.primo.generator.mybatis.plus.cae.service.ISysUserPositionService;
import wiki.primo.generator.mybatis.plus.cae.entity.SysUserPosition;
import wiki.primo.generator.mybatis.plus.cae.result.ResultModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.baomidou.mybatisplus.core.metadata.IPage;
import wiki.primo.generator.mybatis.plus.cae.query.SysUserPositionQueryBo;

/**
 * <p>
 * 用户地区表  前端控制器
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@Controller
@RequestMapping("/sysuserposition")
public class SysUserPositionController {

    @Autowired
    private ISysUserPositionService iSysUserPositionService;

    /**
     * 添加对象
     *
     * @param sysUserPosition 对象
     * @return ResultModel统一响应结果
     */
    @PostMapping("save")
    @ResponseBody
    public ResultModel<Object> save(SysUserPosition sysUserPosition) {
        if(sysUserPosition==null){
            return ResultModel.parameterError();
        }
        iSysUserPositionService.save(sysUserPosition);
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
        boolean success = iSysUserPositionService.removeById(id);
        if(success) {
            return ResultModel.success();
        }else {
            return ResultModel.fail();
        }
    }

    /**
     * 根据ID进行修改对象
     *
     * @param sysUserPosition 对象中必须有ID主键
     * @return ResultModel统一响应结果
     */
    @PostMapping("update")
    @ResponseBody
    public ResultModel<Object> update(SysUserPosition sysUserPosition) {
        if(sysUserPosition==null || sysUserPosition.getId()==null){
            return ResultModel.parameterError();
        }
        boolean success = iSysUserPositionService.updateById(sysUserPosition);
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
    public ResultModel<SysUserPosition> getById(@RequestParam Integer id) {
        if(id==null || id<0){
            return ResultModel.parameterError();
        }
        SysUserPosition sysUserPosition = iSysUserPositionService.getById(id);
        return ResultModel.success(sysUserPosition);
    }

    /**
     * 分页查询
     *
     * @return ResultModel统一响应结果
     */
    @PostMapping("page")
    @ResponseBody
    public ResultModel<IPage<SysUserPosition>> page(SysUserPositionQueryBo queryBo,int pageNo,int pageSize) {
        if(queryBo==null){
            return ResultModel.parameterError();
        }
        IPage<SysUserPosition> templateIPage = iSysUserPositionService.page(queryBo,pageNo,pageSize);
        return ResultModel.success(templateIPage);
    }

}
