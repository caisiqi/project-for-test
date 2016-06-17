package oliver.demo.dao.mysql;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import oliver.demo.annotation.MysqlHyve;
import oliver.demo.bean.PpdcDetail;
import oliver.demo.bean.PpdcDetailExample;

@MysqlHyve
public interface PPDCDetailDao {
	
	@SuppressWarnings("rawtypes")
	List<Map> searchPartLevel(Map params);
	
	@SuppressWarnings("rawtypes")
	void delete(Map params);
	
	 int countByExample(PpdcDetailExample example);

    int deleteByExample(PpdcDetailExample example);

    int deleteByPrimaryKey(Integer ppdcDetailId);

    int insert(PpdcDetail record);

    int insertSelective(PpdcDetail record);

    List<PpdcDetail> selectByExample(PpdcDetailExample example);

    PpdcDetail selectByPrimaryKey(Integer ppdcDetailId);

    int updateByExampleSelective(@Param("record") PpdcDetail record, @Param("example") PpdcDetailExample example);

    int updateByExample(@Param("record") PpdcDetail record, @Param("example") PpdcDetailExample example);

    int updateByPrimaryKeySelective(PpdcDetail record);

    int updateByPrimaryKey(PpdcDetail record);
}
