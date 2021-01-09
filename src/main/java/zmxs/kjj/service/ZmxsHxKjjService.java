package zmxs.kjj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import zmxs.kjj.dao.ZmxsHxKjjRepository;
import zmxs.kjj.domain.RespBean;

/**
 * @Author: 张灿
 * @Time: 2021/1/9 18:49
 */
@Service
public class ZmxsHxKjjService {

    @Autowired
    ZmxsHxKjjRepository zmxsHxKjjRepository;

    /**
     * 查询全部
     * @return
     */
    public RespBean findAll(){
        return RespBean.ok("你给路哒哟",zmxsHxKjjRepository.findAll());
    }

    /**
     * 分页查询
     * @param currentPage
     * @param pagesize
     * @return
     */
    public RespBean findAllByPage(Integer currentPage,Integer pagesize){
        Pageable pageable = PageRequest.of(currentPage-1,pagesize);
        return RespBean.ok("分页开军舰",zmxsHxKjjRepository.findAll(pageable));
    }

    /**
     * 模糊查询
     * @param grade
     * @return
     */
    public RespBean findByGrade(String grade){
        grade = grade+"%";
        return RespBean.ok("模糊开军舰",zmxsHxKjjRepository.findAllByGradeLike(grade));
    }
}
