package zmxs.kjj.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zmxs.kjj.domain.RespBean;
import zmxs.kjj.service.ZmxsHxKjjService;

/**
 * @Author: 张灿
 * @Time: 2021/1/9 18:09
 */
@CrossOrigin
@RestController
@Api(tags = "老大哥开军舰接口")
public class KjjController {

    private final static Logger logger = LoggerFactory.getLogger(KjjController.class);

    @Autowired
    ZmxsHxKjjService zmxsHxKjjService;

    /**
     * 查询所有数据
     * @return
     */
    @GetMapping("/findAll")
    @ApiOperation("查找所有信息接口")
    public RespBean KJJ(){
        return zmxsHxKjjService.findAll();
    }

    /**
     * 分页查询
     * @param page
     * @param size
     * @return
     */
    @GetMapping("/findPage")
    @ApiOperation("按页查找所有信息接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page",value = "当前第几页",defaultValue = "1"),
            @ApiImplicitParam(name = "size",value = "页面大小",defaultValue = "5")
    })
    public RespBean KJJPage(@RequestParam("page") Integer page,
                        @RequestParam("size") Integer size){
        return zmxsHxKjjService.findAllByPage(page, size);
    }

    /**
     * 模糊查询
     * @param grade
     * @return
     */
    @GetMapping("/findByGrade")
    @ApiOperation("按年级模糊查找信息接口")
    @ApiImplicitParam(name = "grade",value = "年级关键词",defaultValue = "四")
    public RespBean KJJGrade(@RequestParam("grade") String grade){
        return zmxsHxKjjService.findByGrade(grade);
    }

}
