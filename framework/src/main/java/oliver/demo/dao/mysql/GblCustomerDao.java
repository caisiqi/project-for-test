package oliver.demo.dao.mysql;

import java.util.List;
import oliver.demo.annotation.MysqlGlobal;
import oliver.demo.bean.GblCustomer;

@MysqlGlobal
public interface GblCustomerDao {
    int insert(GblCustomer record);

    int insertSelective(GblCustomer record);
    
    List<GblCustomer> selectAllGblCustomer();
}