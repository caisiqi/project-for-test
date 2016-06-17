package oliver.demo.dao;

import java.util.List;
import oliver.demo.bean.PpdcDetail;
import oliver.demo.bean.PpdcDetailExample;
import org.apache.ibatis.annotations.Param;

public interface PpdcDetailMapper {
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