package it.etoken.component.user.dao.mapper;

import it.etoken.base.model.user.entity.UserExt;
import it.etoken.base.model.user.entity.UserExtExample.Criteria;
import it.etoken.base.model.user.entity.UserExtExample.Criterion;
import it.etoken.base.model.user.entity.UserExtExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class UserExtSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_ext
     *
     * @mbg.generated Tue Jun 26 13:51:19 CST 2018
     */
    public String countByExample(UserExtExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("user_ext");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_ext
     *
     * @mbg.generated Tue Jun 26 13:51:19 CST 2018
     */
    public String deleteByExample(UserExtExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("user_ext");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_ext
     *
     * @mbg.generated Tue Jun 26 13:51:19 CST 2018
     */
    public String insertSelective(UserExt record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("user_ext");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getUid() != null) {
            sql.VALUES("uid", "#{uid,jdbcType=BIGINT}");
        }
        
        if (record.getEosAccount() != null) {
            sql.VALUES("eos_account", "#{eosAccount,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedate() != null) {
            sql.VALUES("createdate", "#{createdate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getModifydate() != null) {
            sql.VALUES("modifydate", "#{modifydate,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_ext
     *
     * @mbg.generated Tue Jun 26 13:51:19 CST 2018
     */
    public String selectByExample(UserExtExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("uid");
        sql.SELECT("eos_account");
        sql.SELECT("createdate");
        sql.SELECT("modifydate");
        sql.FROM("user_ext");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_ext
     *
     * @mbg.generated Tue Jun 26 13:51:19 CST 2018
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        UserExt record = (UserExt) parameter.get("record");
        UserExtExample example = (UserExtExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("user_ext");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getUid() != null) {
            sql.SET("uid = #{record.uid,jdbcType=BIGINT}");
        }
        
        if (record.getEosAccount() != null) {
            sql.SET("eos_account = #{record.eosAccount,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedate() != null) {
            sql.SET("createdate = #{record.createdate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getModifydate() != null) {
            sql.SET("modifydate = #{record.modifydate,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_ext
     *
     * @mbg.generated Tue Jun 26 13:51:19 CST 2018
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("user_ext");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("uid = #{record.uid,jdbcType=BIGINT}");
        sql.SET("eos_account = #{record.eosAccount,jdbcType=VARCHAR}");
        sql.SET("createdate = #{record.createdate,jdbcType=TIMESTAMP}");
        sql.SET("modifydate = #{record.modifydate,jdbcType=TIMESTAMP}");
        
        UserExtExample example = (UserExtExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_ext
     *
     * @mbg.generated Tue Jun 26 13:51:19 CST 2018
     */
    public String updateByPrimaryKeySelective(UserExt record) {
        SQL sql = new SQL();
        sql.UPDATE("user_ext");
        
        if (record.getUid() != null) {
            sql.SET("uid = #{uid,jdbcType=BIGINT}");
        }
        
        if (record.getEosAccount() != null) {
            sql.SET("eos_account = #{eosAccount,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedate() != null) {
            sql.SET("createdate = #{createdate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getModifydate() != null) {
            sql.SET("modifydate = #{modifydate,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_ext
     *
     * @mbg.generated Tue Jun 26 13:51:19 CST 2018
     */
    protected void applyWhere(SQL sql, UserExtExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}