package com.imooc.dao;

import com.imooc.model.PNominateCategoryShow;
import com.imooc.model.PNominateCategoryShowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PNominateCategoryShowMapper {
    int countByExample(PNominateCategoryShowExample example);

    int deleteByExample(PNominateCategoryShowExample example);

    int deleteByPrimaryKey(Integer showId);

    int insert(PNominateCategoryShow record);

    int insertSelective(PNominateCategoryShow record);

    List<PNominateCategoryShow> selectByExample(PNominateCategoryShowExample example);

    PNominateCategoryShow selectByPrimaryKey(Integer showId);

    int updateByExampleSelective(@Param("record") PNominateCategoryShow record, @Param("example") PNominateCategoryShowExample example);

    int updateByExample(@Param("record") PNominateCategoryShow record, @Param("example") PNominateCategoryShowExample example);

    int updateByPrimaryKeySelective(PNominateCategoryShow record);

    int updateByPrimaryKey(PNominateCategoryShow record);
}