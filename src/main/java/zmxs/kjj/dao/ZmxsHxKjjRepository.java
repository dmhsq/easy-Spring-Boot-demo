package zmxs.kjj.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zmxs.kjj.domain.ZmxsHxKjj;

import java.util.List;

/**
 * @Author: 张灿
 * @Time: 2021/1/9 17:55
 */

public interface ZmxsHxKjjRepository extends JpaRepository<ZmxsHxKjj,String> {


    List<ZmxsHxKjj> findAllByGradeLike(String string);
}
