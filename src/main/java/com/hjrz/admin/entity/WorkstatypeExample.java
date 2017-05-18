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

        public Criteria andWks_typeCodeIsNull() {
            addCriterion("wks_typeCode is null");
            return (Criteria) this;
        }

        public Criteria andWks_typeCodeIsNotNull() {
            addCriterion("wks_typeCode is not null");
            return (Criteria) this;
        }

        public Criteria andWks_typeCodeEqualTo(Integer value) {
            addCriterion("wks_typeCode =", value, "wks_typeCode");
            return (Criteria) this;
        }

        public Criteria andWks_typeCodeNotEqualTo(Integer value) {
            addCriterion("wks_typeCode <>", value, "wks_typeCode");
            return (Criteria) this;
        }

        public Criteria andWks_typeCodeGreaterThan(Integer value) {
            addCriterion("wks_typeCode >", value, "wks_typeCode");
            return (Criteria) this;
        }

        public Criteria andWks_typeCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("wks_typeCode >=", value, "wks_typeCode");
            return (Criteria) this;
        }

        public Criteria andWks_typeCodeLessThan(Integer value) {
            addCriterion("wks_typeCode <", value, "wks_typeCode");
            return (Criteria) this;
        }

        public Criteria andWks_typeCodeLessThanOrEqualTo(Integer value) {
            addCriterion("wks_typeCode <=", value, "wks_typeCode");
            return (Criteria) this;
        }

        public Criteria andWks_typeCodeIn(List<Integer> values) {
            addCriterion("wks_typeCode in", values, "wks_typeCode");
            return (Criteria) this;
        }

        public Criteria andWks_typeCodeNotIn(List<Integer> values) {
            addCriterion("wks_typeCode not in", values, "wks_typeCode");
            return (Criteria) this;
        }

        public Criteria andWks_typeCodeBetween(Integer value1, Integer value2) {
            addCriterion("wks_typeCode between", value1, value2, "wks_typeCode");
            return (Criteria) this;
        }

        public Criteria andWks_typeCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("wks_typeCode not between", value1, value2, "wks_typeCode");
            return (Criteria) this;
        }

        public Criteria andWks_typeNameIsNull() {
            addCriterion("wks_typeName is null");
            return (Criteria) this;
        }

        public Criteria andWks_typeNameIsNotNull() {
            addCriterion("wks_typeName is not null");
            return (Criteria) this;
        }

        public Criteria andWks_typeNameEqualTo(String value) {
            addCriterion("wks_typeName =", value, "wks_typeName");
            return (Criteria) this;
        }

        public Criteria andWks_typeNameNotEqualTo(String value) {
            addCriterion("wks_typeName <>", value, "wks_typeName");
            return (Criteria) this;
        }

        public Criteria andWks_typeNameGreaterThan(String value) {
            addCriterion("wks_typeName >", value, "wks_typeName");
            return (Criteria) this;
        }

        public Criteria andWks_typeNameGreaterThanOrEqualTo(String value) {
            addCriterion("wks_typeName >=", value, "wks_typeName");
            return (Criteria) this;
        }

        public Criteria andWks_typeNameLessThan(String value) {
            addCriterion("wks_typeName <", value, "wks_typeName");
            return (Criteria) this;
        }

        public Criteria andWks_typeNameLessThanOrEqualTo(String value) {
            addCriterion("wks_typeName <=", value, "wks_typeName");
            return (Criteria) this;
        }

        public Criteria andWks_typeNameLike(String value) {
            addCriterion("wks_typeName like", value, "wks_typeName");
            return (Criteria) this;
        }

        public Criteria andWks_typeNameNotLike(String value) {
            addCriterion("wks_typeName not like", value, "wks_typeName");
            return (Criteria) this;
        }

        public Criteria andWks_typeNameIn(List<String> values) {
            addCriterion("wks_typeName in", values, "wks_typeName");
            return (Criteria) this;
        }

        public Criteria andWks_typeNameNotIn(List<String> values) {
            addCriterion("wks_typeName not in", values, "wks_typeName");
            return (Criteria) this;
        }

        public Criteria andWks_typeNameBetween(String value1, String value2) {
            addCriterion("wks_typeName between", value1, value2, "wks_typeName");
            return (Criteria) this;
        }

        public Criteria andWks_typeNameNotBetween(String value1, String value2) {
            addCriterion("wks_typeName not between", value1, value2, "wks_typeName");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(Date value) {
            addCriterion("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterion("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andWks_typeTitleIsNull() {
            addCriterion("wks_typeTitle is null");
            return (Criteria) this;
        }

        public Criteria andWks_typeTitleIsNotNull() {
            addCriterion("wks_typeTitle is not null");
            return (Criteria) this;
        }

        public Criteria andWks_typeTitleEqualTo(String value) {
            addCriterion("wks_typeTitle =", value, "wks_typeTitle");
            return (Criteria) this;
        }

        public Criteria andWks_typeTitleNotEqualTo(String value) {
            addCriterion("wks_typeTitle <>", value, "wks_typeTitle");
            return (Criteria) this;
        }

        public Criteria andWks_typeTitleGreaterThan(String value) {
            addCriterion("wks_typeTitle >", value, "wks_typeTitle");
            return (Criteria) this;
        }

        public Criteria andWks_typeTitleGreaterThanOrEqualTo(String value) {
            addCriterion("wks_typeTitle >=", value, "wks_typeTitle");
            return (Criteria) this;
        }

        public Criteria andWks_typeTitleLessThan(String value) {
            addCriterion("wks_typeTitle <", value, "wks_typeTitle");
            return (Criteria) this;
        }

        public Criteria andWks_typeTitleLessThanOrEqualTo(String value) {
            addCriterion("wks_typeTitle <=", value, "wks_typeTitle");
            return (Criteria) this;
        }

        public Criteria andWks_typeTitleLike(String value) {
            addCriterion("wks_typeTitle like", value, "wks_typeTitle");
            return (Criteria) this;
        }

        public Criteria andWks_typeTitleNotLike(String value) {
            addCriterion("wks_typeTitle not like", value, "wks_typeTitle");
            return (Criteria) this;
        }

        public Criteria andWks_typeTitleIn(List<String> values) {
            addCriterion("wks_typeTitle in", values, "wks_typeTitle");
            return (Criteria) this;
        }

        public Criteria andWks_typeTitleNotIn(List<String> values) {
            addCriterion("wks_typeTitle not in", values, "wks_typeTitle");
            return (Criteria) this;
        }

        public Criteria andWks_typeTitleBetween(String value1, String value2) {
            addCriterion("wks_typeTitle between", value1, value2, "wks_typeTitle");
            return (Criteria) this;
        }

        public Criteria andWks_typeTitleNotBetween(String value1, String value2) {
            addCriterion("wks_typeTitle not between", value1, value2, "wks_typeTitle");
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