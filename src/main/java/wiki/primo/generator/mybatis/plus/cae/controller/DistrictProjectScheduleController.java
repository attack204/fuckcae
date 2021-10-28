package wiki.primo.generator.mybatis.plus.cae.controller;

import wiki.primo.generator.mybatis.plus.cae.service.IDistrictProjectScheduleService;
import wiki.primo.generator.mybatis.plus.cae.entity.DistrictProjectSchedule;
import wiki.primo.generator.mybatis.plus.cae.result.ResultModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.baomidou.mybatisplus.core.metadata.IPage;
import wiki.primo.generator.mybatis.plus.cae.query.DistrictProjectScheduleQueryBo;

/**
 * <p>
 * 区级重点项目计划表  前端控制器
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@Controller
@RequestMapping("/districtprojectschedule")
public class DistrictProjectScheduleController {

    @Autowired
    private IDistrictProjectScheduleService iDistrictProjectScheduleService;

    /**
     * 添加对象
     *
     * @param districtProjectSchedule 对象
     * @return ResultModel统一响应结果
     */
    @PostMapping("save")
    @ResponseBody
    public ResultModel<Object> save(DistrictProjectSchedule districtProjectSchedule) {
        if(districtProjectSchedule==null){
            return ResultModel.parameterError();
        }
        iDistrictProjectScheduleService.save(districtProjectSchedule);
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
        boolean success = iDistrictProjectScheduleService.removeById(id);
        if(success) {
            return ResultModel.success();
        }else {
            return ResultModel.fail();
        }
    }

    /**
     * 根据ID进行修改对象
     *
     * @param districtProjectSchedule 对象中必须有ID主键
     * @return ResultModel统一响应结果
     */
    @PostMapping("update")
    @ResponseBody
    public ResultModel<Object> update(DistrictProjectSchedule districtProjectSchedule) {
        if(districtProjectSchedule==null || districtProjectSchedule.getId()==null){
            return ResultModel.parameterError();
        }
        boolean success = iDistrictProjectScheduleService.updateById(districtProjectSchedule);
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
    public ResultModel<DistrictProjectSchedule> getById(@RequestParam Integer id) {
        if(id==null || id<0){
            return ResultModel.parameterError();
        }
        DistrictProjectSchedule districtProjectSchedule = iDistrictProjectScheduleService.getById(id);
        return ResultModel.success(districtProjectSchedule);
    }

    /**
     * 分页查询
     *
     * @return ResultModel统一响应结果
     */
    @PostMapping("page")
    @ResponseBody
    public ResultModel<IPage<DistrictProjectSchedule>> page(DistrictProjectScheduleQueryBo queryBo,int pageNo,int pageSize) {
        if(queryBo==null){
            return ResultModel.parameterError();
        }
        IPage<DistrictProjectSchedule> templateIPage = iDistrictProjectScheduleService.page(queryBo,pageNo,pageSize);
        return ResultModel.success(templateIPage);
    }

}
