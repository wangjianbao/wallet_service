package it.etoken.component.user.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

import it.etoken.base.model.user.entity.UserExt;
import it.etoken.base.model.user.entity.UserExtExample;

@Mapper
public interface UserExtMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_ext
     *
     * @mbg.generated Tue Jun 26 13:51:19 CST 2018
     */
    @SelectProvider(type=UserExtSqlProvider.class, method="countByExample")
    long countByExample(UserExtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_ext
     *
     * @mbg.generated Tue Jun 26 13:51:19 CST 2018
     */
    @DeleteProvider(type=UserExtSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserExtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_ext
     *
     * @mbg.generated Tue Jun 26 13:51:19 CST 2018
     */
    @Delete({
        "delete from user_ext",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_ext
     *
     * @mbg.generated Tue Jun 26 13:51:19 CST 2018
     */
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert({
        "insert into user_ext (uid, eos_account)",
        "values (#{uid,jdbcType=BIGINT}, #{eosAccount,jdbcType=VARCHAR})"
    })
    int insert(UserExt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_ext
     *
     * @mbg.generated Tue Jun 26 13:51:19 CST 2018
     */
    @InsertProvider(type=UserExtSqlProvider.class, method="insertSelective")
    int insertSelective(UserExt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_ext
     *
     * @mbg.generated Tue Jun 26 13:51:19 CST 2018
     */
    @SelectProvider(type=UserExtSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="uid", property="uid", jdbcType=JdbcType.BIGINT),
        @Result(column="eos_account", property="eosAccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="createdate", property="createdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modifydate", property="modifydate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserExt> selectByExample(UserExtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_ext
     *
     * @mbg.generated Tue Jun 26 13:51:19 CST 2018
     */
    @Select({
        "select",
        "id, uid, eos_account, createdate, modifydate",
        "from user_ext",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="uid", property="uid", jdbcType=JdbcType.BIGINT),
        @Result(column="eos_account", property="eosAccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="createdate", property="createdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modifydate", property="modifydate", jdbcType=JdbcType.TIMESTAMP)
    })
    UserExt selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_ext
     *
     * @mbg.generated Tue Jun 26 13:51:19 CST 2018
     */
    @UpdateProvider(type=UserExtSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserExt record, @Param("example") UserExtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_ext
     *
     * @mbg.generated Tue Jun 26 13:51:19 CST 2018
     */
    @UpdateProvider(type=UserExtSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserExt record, @Param("example") UserExtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_ext
     *
     * @mbg.generated Tue Jun 26 13:51:19 CST 2018
     */
    @UpdateProvider(type=UserExtSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserExt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_ext
     *
     * @mbg.generated Tue Jun 26 13:51:19 CST 2018
     */
    @Update({
        "update user_ext",
        "set uid = #{uid,jdbcType=BIGINT},",
          "eos_account = #{eosAccount,jdbcType=VARCHAR},",
          "createdate = #{createdate,jdbcType=TIMESTAMP},",
          "modifydate = #{modifydate,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(UserExt record);
}