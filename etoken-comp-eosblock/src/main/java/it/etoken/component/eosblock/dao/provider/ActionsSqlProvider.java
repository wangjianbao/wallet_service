package it.etoken.component.eosblock.dao.provider;

import it.etoken.base.model.eosblock.entity.Actions;
import it.etoken.base.model.eosblock.entity.ActionsExample.Criteria;
import it.etoken.base.model.eosblock.entity.ActionsExample.Criterion;
import it.etoken.base.model.eosblock.entity.ActionsExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ActionsSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actions
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public String countByExample(ActionsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("actions");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actions
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public String deleteByExample(ActionsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("actions");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actions
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public String insertSelective(Actions record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("actions");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getAccount() != null) {
            sql.VALUES("account", "#{account,jdbcType=VARCHAR}");
        }
        
        if (record.getTransactionId() != null) {
            sql.VALUES("transaction_id", "#{transactionId,jdbcType=VARCHAR}");
        }
        
        if (record.getSeq() != null) {
            sql.VALUES("seq", "#{seq,jdbcType=SMALLINT}");
        }
        
        if (record.getParent() != null) {
            sql.VALUES("parent", "#{parent,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getData() != null) {
            sql.VALUES("data", "#{data,jdbcType=CHAR}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actions
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public String selectByExample(ActionsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("account");
        sql.SELECT("transaction_id");
        sql.SELECT("seq");
        sql.SELECT("parent");
        sql.SELECT("name");
        sql.SELECT("created_at");
        sql.SELECT("data");
        sql.FROM("actions");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actions
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        Actions record = (Actions) parameter.get("record");
        ActionsExample example = (ActionsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("actions");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getAccount() != null) {
            sql.SET("account = #{record.account,jdbcType=VARCHAR}");
        }
        
        if (record.getTransactionId() != null) {
            sql.SET("transaction_id = #{record.transactionId,jdbcType=VARCHAR}");
        }
        
        if (record.getSeq() != null) {
            sql.SET("seq = #{record.seq,jdbcType=SMALLINT}");
        }
        
        if (record.getParent() != null) {
            sql.SET("parent = #{record.parent,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getData() != null) {
            sql.SET("data = #{record.data,jdbcType=CHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actions
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("actions");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("account = #{record.account,jdbcType=VARCHAR}");
        sql.SET("transaction_id = #{record.transactionId,jdbcType=VARCHAR}");
        sql.SET("seq = #{record.seq,jdbcType=SMALLINT}");
        sql.SET("parent = #{record.parent,jdbcType=INTEGER}");
        sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("data = #{record.data,jdbcType=CHAR}");
        
        ActionsExample example = (ActionsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actions
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public String updateByPrimaryKeySelective(Actions record) {
        SQL sql = new SQL();
        sql.UPDATE("actions");
        
        if (record.getAccount() != null) {
            sql.SET("account = #{account,jdbcType=VARCHAR}");
        }
        
        if (record.getTransactionId() != null) {
            sql.SET("transaction_id = #{transactionId,jdbcType=VARCHAR}");
        }
        
        if (record.getSeq() != null) {
            sql.SET("seq = #{seq,jdbcType=SMALLINT}");
        }
        
        if (record.getParent() != null) {
            sql.SET("parent = #{parent,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getData() != null) {
            sql.SET("data = #{data,jdbcType=CHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actions
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    protected void applyWhere(SQL sql, ActionsExample example, boolean includeExamplePhrase) {
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