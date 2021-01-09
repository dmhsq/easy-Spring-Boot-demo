package zmxs.kjj.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import zmxs.kjj.domain.RespBean;
import zmxs.kjj.service.ZmxsHxKjjService;

/**
 * @Author: 张灿
 * @Time: 2021/1/9 18:09
 */
@CrossOrigin
@RestController
public class KjjController {

    private final static Logger logger = LoggerFactory.getLogger(KjjController.class);

    @Autowired
    ZmxsHxKjjService zmxsHxKjjService;

    /**
     * 查询所有数据
     * @return
     */
    @GetMapping("/findAll")
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
    public RespBean KJJGrade(@RequestParam("grade") String grade){
        return zmxsHxKjjService.findByGrade(grade);
    }

}
