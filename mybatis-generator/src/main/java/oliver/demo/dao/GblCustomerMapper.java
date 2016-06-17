package oliver.demo.dao;

import oliver.demo.bean.GblCustomer;

public interface GblCustomerMapper {
    int insert(GblCustomer record);

    int insertSelective(GblCustomer record);
}