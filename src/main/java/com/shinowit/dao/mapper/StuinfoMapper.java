package com.shinowit.dao.mapper;

import com.shinowit.entity.Stuinfo;
import com.shinowit.entity.StuinfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StuinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stuinfo
     *
     * @mbggenerated Tue Dec 23 15:49:13 CST 2014
     */
    int countByExample(StuinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stuinfo
     *
     * @mbggenerated Tue Dec 23 15:49:13 CST 2014
     */
    int deleteByExample(StuinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stuinfo
     *
     * @mbggenerated Tue Dec 23 15:49:13 CST 2014
     */
    int deleteByPrimaryKey(Integer stuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stuinfo
     *
     * @mbggenerated Tue Dec 23 15:49:13 CST 2014
     */
    int insert(Stuinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stuinfo
     *
     * @mbggenerated Tue Dec 23 15:49:13 CST 2014
     */
    int insertSelective(Stuinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stuinfo
     *
     * @mbggenerated Tue Dec 23 15:49:13 CST 2014
     */
    List<Stuinfo> selectByExample(StuinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stuinfo
     *
     * @mbggenerated Tue Dec 23 15:49:13 CST 2014
     */
    Stuinfo selectByPrimaryKey(Integer stuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stuinfo
     *
     * @mbggenerated Tue Dec 23 15:49:13 CST 2014
     */
    int updateByExampleSelective(@Param("record") Stuinfo record, @Param("example") StuinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stuinfo
     *
     * @mbggenerated Tue Dec 23 15:49:13 CST 2014
     */
    int updateByExample(@Param("record") Stuinfo record, @Param("example") StuinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stuinfo
     *
     * @mbggenerated Tue Dec 23 15:49:13 CST 2014
     */
    int updateByPrimaryKeySelective(Stuinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stuinfo
     *
     * @mbggenerated Tue Dec 23 15:49:13 CST 2014
     */
    int updateByPrimaryKey(Stuinfo record);

    List<Stuinfo> selectPage(StuinfoCriteria example);

    Integer selectMaxPrimaryKeyValue();

    List<Stuinfo> pagelist(@Param("pageSize")int pageSize,@Param("pageIndex")int pageIndex);
}