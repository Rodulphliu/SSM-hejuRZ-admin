package com.hjrz.admin.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorkstatypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkstatypeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andWksTypecodeIsNull() {
            addCriterion("wks_typeCode is null");
            return (Criteria) this;
        }

        public Criteria andWksTypecodeIsNotNull() {
            addCriterion("wks_typeCode is not null");
            return (Criteria) this;
        }

        public Criteria andWksTypecodeEqualTo(Integer value) {
            addCriterion("wks_typeCode =", value, "wksTypecode");
            return (Criteria) this;
        }

        public Criteria andWksTypecodeNotEqualTo(Integer value) {
            addCriterion("wks_typeCode <>", value, "wksTypecode");
            return (Criteria) this;
        }

        public Criteria andWksTypecodeGreaterThan(Integer value) {
            addCriterion("wks_typeCode >", value, "wksTypecode");
            return (Criteria) this;
        }

        public Criteria andWksTypecodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("wks_typeCode >=", value, "wksTypecode");
            return (Criteria) this;
        }

        public Criteria andWksTypecodeLessThan(Integer value) {
            addCriterion("wks_typeCode <", value, "wksTypecode");
            return (Criteria) this;
        }

        public Criteria andWksTypecodeLessThanOrEqualTo(Integer value) {
            addCriterion("wks_typeCode <=", value, "wksTypecode");
            return (Criteria) this;
        }

        public Criteria andWksTypecodeIn(List<Integer> values) {
            addCriterion("wks_typeCode in", values, "wksTypecode");
            return (Criteria) this;
        }

        public Criteria andWksTypecodeNotIn(List<Integer> values) {
            addCriterion("wks_typeCode not in", values, "wksTypecode");
            return (Criteria) this;
        }

        public Criteria andWksTypecodeBetween(Integer value1, Integer value2) {
            addCriterion("wks_typeCode between", value1, value2, "wksTypecode");
            return (Criteria) this;
        }

        public Criteria andWksTypecodeNotBetween(Integer value1, Integer value2) {
            addCriterion("wks_typeCode not between", value1, value2, "wksTypecode");
            return (Criteria) this;
        }

        public Criteria andWksTypenameIsNull() {
            addCriterion("wks_typeName is null");
            return (Criteria) this;
        }

        public Criteria andWksTypenameIsNotNull() {
            addCriterion("wks_typeName is not null");
            return (Criteria) this;
        }

        public Criteria andWksTypenameEqualTo(String value) {
            addCriterion("wks_typeName =", value, "wksTypename");
            return (Criteria) this;
        }

        public Criteria andWksTypenameNotEqualTo(String value) {
            addCriterion("wks_typeName <>", value, "wksTypename");
            return (Criteria) this;
        }

        public Criteria andWksTypenameGreaterThan(String value) {
            addCriterion("wks_typeName >", value, "wksTypename");
            return (Criteria) this;
        }

        public Criteria andWksTypenameGreaterThanOrEqualTo(String value) {
            addCriterion("wks_typeName >=", value, "wksTypename");
            return (Criteria) this;
        }

        public Criteria andWksTypenameLessThan(String value) {
            addCriterion("wks_typeName <", value, "wksTypename");
            return (Criteria) this;
        }

        public Criteria andWksTypenameLessThanOrEqualTo(String value) {
            addCriterion("wks_typeName <=", value, "wksTypename");
            return (Criteria) this;
        }

        public Criteria andWksTypenameLike(String value) {
            addCriterion("wks_typeName like", value, "wksTypename");
            return (Criteria) this;
        }

        public Criteria andWksTypenameNotLike(String value) {
            addCriterion("wks_typeName not like", value, "wksTypename");
            return (Criteria) this;
        }

        public Criteria andWksTypenameIn(List<String> values) {
            addCriterion("wks_typeName in", values, "wksTypename");
            return (Criteria) this;
        }

        public Criteria andWksTypenameNotIn(List<String> values) {
            addCriterion("wks_typeName not in", values, "wksTypename");
            return (Criteria) this;
        }

        public Criteria andWksTypenameBetween(String value1, String value2) {
            addCriterion("wks_typeName between", value1, value2, "wksTypename");
            return (Criteria) this;
        }

        public Criteria andWksTypenameNotBetween(String value1, String value2) {
            addCriterion("wks_typeName not between", value1, value2, "wksTypename");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andWksTypetitleIsNull() {
            addCriterion("wks_typeTitle is null");
            return (Criteria) this;
        }

        public Criteria andWksTypetitleIsNotNull() {
            addCriterion("wks_typeTitle is not null");
            return (Criteria) this;
        }

        public Criteria andWksTypetitleEqualTo(String value) {
            addCriterion("wks_typeTitle =", value, "wksTypetitle");
            return (Criteria) this;
        }

        public Criteria andWksTypetitleNotEqualTo(String value) {
            addCriterion("wks_typeTitle <>", value, "wksTypetitle");
            return (Criteria) this;
        }

        public Criteria andWksTypetitleGreaterThan(String value) {
            addCriterion("wks_typeTitle >", value, "wksTypetitle");
            return (Criteria) this;
        }

        public Criteria andWksTypetitleGreaterThanOrEqualTo(String value) {
            addCriterion("wks_typeTitle >=", value, "wksTypetitle");
            return (Criteria) this;
        }

        public Criteria andWksTypetitleLessThan(String value) {
            addCriterion("wks_typeTitle <", value, "wksTypetitle");
            return (Criteria) this;
        }

        public Criteria andWksTypetitleLessThanOrEqualTo(String value) {
            addCriterion("wks_typeTitle <=", value, "wksTypetitle");
            return (Criteria) this;
        }

        public Criteria andWksTypetitleLike(String value) {
            addCriterion("wks_typeTitle like", value, "wksTypetitle");
            return (Criteria) this;
        }

        public Criteria andWksTypetitleNotLike(String value) {
            addCriterion("wks_typeTitle not like", value, "wksTypetitle");
            return (Criteria) this;
        }

        public Criteria andWksTypetitleIn(List<String> values) {
            addCriterion("wks_typeTitle in", values, "wksTypetitle");
            return (Criteria) this;
        }

        public Criteria andWksTypetitleNotIn(List<String> values) {
            addCriterion("wks_typeTitle not in", values, "wksTypetitle");
            return (Criteria) this;
        }

        public Criteria andWksTypetitleBetween(String value1, String value2) {
            addCriterion("wks_typeTitle between", value1, value2, "wksTypetitle");
            return (Criteria) this;
        }

        public Criteria andWksTypetitleNotBetween(String value1, String value2) {
            addCriterion("wks_typeTitle not between", value1, value2, "wksTypetitle");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}