package com.devzb.self.dao.mapper;

import com.devzb.self.dao.model.NoteItem;
import com.devzb.self.dao.model.NoteItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NoteItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note_item
     *
     * @mbggenerated Thu Jan 19 14:06:57 GMT+08:00 2017
     */
    int countByExample(NoteItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note_item
     *
     * @mbggenerated Thu Jan 19 14:06:57 GMT+08:00 2017
     */
    int deleteByExample(NoteItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note_item
     *
     * @mbggenerated Thu Jan 19 14:06:57 GMT+08:00 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note_item
     *
     * @mbggenerated Thu Jan 19 14:06:57 GMT+08:00 2017
     */
    int insertSelective(NoteItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note_item
     *
     * @mbggenerated Thu Jan 19 14:06:57 GMT+08:00 2017
     */
    List<NoteItem> selectByExampleWithBLOBs(NoteItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note_item
     *
     * @mbggenerated Thu Jan 19 14:06:57 GMT+08:00 2017
     */
    List<NoteItem> selectByExample(NoteItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note_item
     *
     * @mbggenerated Thu Jan 19 14:06:57 GMT+08:00 2017
     */
    NoteItem selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note_item
     *
     * @mbggenerated Thu Jan 19 14:06:57 GMT+08:00 2017
     */
    int updateByExampleSelective(@Param("record") NoteItem record, @Param("example") NoteItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note_item
     *
     * @mbggenerated Thu Jan 19 14:06:57 GMT+08:00 2017
     */
    int updateByExampleWithBLOBs(@Param("record") NoteItem record, @Param("example") NoteItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note_item
     *
     * @mbggenerated Thu Jan 19 14:06:57 GMT+08:00 2017
     */
    int updateByExample(@Param("record") NoteItem record, @Param("example") NoteItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note_item
     *
     * @mbggenerated Thu Jan 19 14:06:57 GMT+08:00 2017
     */
    int updateByPrimaryKeySelective(NoteItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note_item
     *
     * @mbggenerated Thu Jan 19 14:06:57 GMT+08:00 2017
     */
    int updateByPrimaryKeyWithBLOBs(NoteItem record);
}