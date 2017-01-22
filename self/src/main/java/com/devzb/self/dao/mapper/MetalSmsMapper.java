package com.devzb.self.dao.mapper;

import com.devzb.self.dao.model.MetalSms;
import com.devzb.self.dao.model.MetalSmsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MetalSmsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table metal_sms
     *
     * @mbggenerated Thu Jan 19 14:06:57 GMT+08:00 2017
     */
    int countByExample(MetalSmsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table metal_sms
     *
     * @mbggenerated Thu Jan 19 14:06:57 GMT+08:00 2017
     */
    int deleteByExample(MetalSmsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table metal_sms
     *
     * @mbggenerated Thu Jan 19 14:06:57 GMT+08:00 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table metal_sms
     *
     * @mbggenerated Thu Jan 19 14:06:57 GMT+08:00 2017
     */
    int insertSelective(MetalSms record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table metal_sms
     *
     * @mbggenerated Thu Jan 19 14:06:57 GMT+08:00 2017
     */
    List<MetalSms> selectByExample(MetalSmsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table metal_sms
     *
     * @mbggenerated Thu Jan 19 14:06:57 GMT+08:00 2017
     */
    MetalSms selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table metal_sms
     *
     * @mbggenerated Thu Jan 19 14:06:57 GMT+08:00 2017
     */
    int updateByExampleSelective(@Param("record") MetalSms record, @Param("example") MetalSmsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table metal_sms
     *
     * @mbggenerated Thu Jan 19 14:06:57 GMT+08:00 2017
     */
    int updateByExample(@Param("record") MetalSms record, @Param("example") MetalSmsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table metal_sms
     *
     * @mbggenerated Thu Jan 19 14:06:57 GMT+08:00 2017
     */
    int updateByPrimaryKeySelective(MetalSms record);
}