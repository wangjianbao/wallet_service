package it.etoken.component.market.dao.mapper;

import it.etoken.base.model.market.entity.Coins;
import it.etoken.base.model.market.entity.CoinsExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface CoinsNewMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coins
     *
     * @mbg.generated Mon Jul 02 20:08:32 CST 2018
     */
    @SelectProvider(type=CoinsSqlProvider.class, method="countByExample")
    long countByExample(CoinsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coins
     *
     * @mbg.generated Mon Jul 02 20:08:32 CST 2018
     */
    @DeleteProvider(type=CoinsSqlProvider.class, method="deleteByExample")
    int deleteByExample(CoinsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coins
     *
     * @mbg.generated Mon Jul 02 20:08:32 CST 2018
     */
    @Delete({
        "delete from coins",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coins
     *
     * @mbg.generated Mon Jul 02 20:08:32 CST 2018
     */
    @Insert({
        "insert into coins (id, name, ",
        "createdate, modifydate, ",
        "site, intr, img, ",
        "tag, total, marke, ",
        "code, symble, contract_account, ",
        "is_support_market)",
        "values (#{id,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, ",
        "#{createdate,jdbcType=TIMESTAMP}, #{modifydate,jdbcType=TIMESTAMP}, ",
        "#{site,jdbcType=VARCHAR}, #{intr,jdbcType=VARCHAR}, #{img,jdbcType=VARCHAR}, ",
        "#{tag,jdbcType=VARCHAR}, #{total,jdbcType=BIGINT}, #{marke,jdbcType=BIGINT}, ",
        "#{code,jdbcType=VARCHAR}, #{symble,jdbcType=VARCHAR}, #{contractAccount,jdbcType=VARCHAR}, ",
        "#{isSupportMarket,jdbcType=VARCHAR})"
    })
    int insert(Coins record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coins
     *
     * @mbg.generated Mon Jul 02 20:08:32 CST 2018
     */
    @InsertProvider(type=CoinsSqlProvider.class, method="insertSelective")
    int insertSelective(Coins record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coins
     *
     * @mbg.generated Mon Jul 02 20:08:32 CST 2018
     */
    @SelectProvider(type=CoinsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="createdate", property="createdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modifydate", property="modifydate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="site", property="site", jdbcType=JdbcType.VARCHAR),
        @Result(column="intr", property="intr", jdbcType=JdbcType.VARCHAR),
        @Result(column="img", property="img", jdbcType=JdbcType.VARCHAR),
        @Result(column="tag", property="tag", jdbcType=JdbcType.VARCHAR),
        @Result(column="total", property="total", jdbcType=JdbcType.BIGINT),
        @Result(column="marke", property="marke", jdbcType=JdbcType.BIGINT),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="symble", property="symble", jdbcType=JdbcType.VARCHAR),
        @Result(column="contract_account", property="contractAccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_support_market", property="isSupportMarket", jdbcType=JdbcType.VARCHAR)
    })
    List<Coins> selectByExample(CoinsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coins
     *
     * @mbg.generated Mon Jul 02 20:08:32 CST 2018
     */
    @Select({
        "select",
        "id, name, createdate, modifydate, site, intr, img, tag, total, marke, code, ",
        "symble, contract_account, is_support_market",
        "from coins",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="createdate", property="createdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modifydate", property="modifydate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="site", property="site", jdbcType=JdbcType.VARCHAR),
        @Result(column="intr", property="intr", jdbcType=JdbcType.VARCHAR),
        @Result(column="img", property="img", jdbcType=JdbcType.VARCHAR),
        @Result(column="tag", property="tag", jdbcType=JdbcType.VARCHAR),
        @Result(column="total", property="total", jdbcType=JdbcType.BIGINT),
        @Result(column="marke", property="marke", jdbcType=JdbcType.BIGINT),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="symble", property="symble", jdbcType=JdbcType.VARCHAR),
        @Result(column="contract_account", property="contractAccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_support_market", property="isSupportMarket", jdbcType=JdbcType.VARCHAR)
    })
    Coins selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coins
     *
     * @mbg.generated Mon Jul 02 20:08:32 CST 2018
     */
    @UpdateProvider(type=CoinsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Coins record, @Param("example") CoinsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coins
     *
     * @mbg.generated Mon Jul 02 20:08:32 CST 2018
     */
    @UpdateProvider(type=CoinsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Coins record, @Param("example") CoinsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coins
     *
     * @mbg.generated Mon Jul 02 20:08:32 CST 2018
     */
    @UpdateProvider(type=CoinsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Coins record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coins
     *
     * @mbg.generated Mon Jul 02 20:08:32 CST 2018
     */
    @Update({
        "update coins",
        "set name = #{name,jdbcType=VARCHAR},",
          "createdate = #{createdate,jdbcType=TIMESTAMP},",
          "modifydate = #{modifydate,jdbcType=TIMESTAMP},",
          "site = #{site,jdbcType=VARCHAR},",
          "intr = #{intr,jdbcType=VARCHAR},",
          "img = #{img,jdbcType=VARCHAR},",
          "tag = #{tag,jdbcType=VARCHAR},",
          "total = #{total,jdbcType=BIGINT},",
          "marke = #{marke,jdbcType=BIGINT},",
          "code = #{code,jdbcType=VARCHAR},",
          "symble = #{symble,jdbcType=VARCHAR},",
          "contract_account = #{contractAccount,jdbcType=VARCHAR},",
          "is_support_market = #{isSupportMarket,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Coins record);
}