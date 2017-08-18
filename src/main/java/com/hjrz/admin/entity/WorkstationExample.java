package com.hjrz.admin.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorkstationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkstationExample() {
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

        public Criteria andWorksCodeIsNull() {
            addCriterion("worksCode is null");
            return (Criteria) this;
        }

        public Criteria andWorksCodeIsNotNull() {
            addCriterion("worksCode is not null");
            return (Criteria) this;
        }

        public Criteria andWorksCodeEqualTo(Long value) {
            addCriterion("worksCode =", value, "worksCode");
            return (Criteria) this;
        }

        public Criteria andWorksCodeNotEqualTo(Long value) {
            addCriterion("worksCode <>", value, "worksCode");
            return (Criteria) this;
        }

        public Criteria andWorksCodeGreaterThan(Long value) {
            addCriterion("worksCode >", value, "worksCode");
            return (Criteria) this;
        }

        public Criteria andWorksCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("worksCode >=", value, "worksCode");
            return (Criteria) this;
        }

        public Criteria andWorksCodeLessThan(Long value) {
            addCriterion("worksCode <", value, "worksCode");
            return (Criteria) this;
        }

        public Criteria andWorksCodeLessThanOrEqualTo(Long value) {
            addCriterion("worksCode <=", value, "worksCode");
            return (Criteria) this;
        }

        public Criteria andWorksCodeIn(List<Long> values) {
            addCriterion("worksCode in", values, "worksCode");
            return (Criteria) this;
        }

        public Criteria andWorksCodeNotIn(List<Long> values) {
            addCriterion("worksCode not in", values, "worksCode");
            return (Criteria) this;
        }

        public Criteria andWorksCodeBetween(Long value1, Long value2) {
            addCriterion("worksCode between", value1, value2, "worksCode");
            return (Criteria) this;
        }

        public Criteria andWorksCodeNotBetween(Long value1, Long value2) {
            addCriterion("worksCode not between", value1, value2, "worksCode");
            return (Criteria) this;
        }

        public Criteria andWorksNameIsNull() {
            addCriterion("worksName is null");
            return (Criteria) this;
        }

        public Criteria andWorksNameIsNotNull() {
            addCriterion("worksName is not null");
            return (Criteria) this;
        }

        public Criteria andWorksNameEqualTo(String value) {
            addCriterion("worksName =", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameNotEqualTo(String value) {
            addCriterion("worksName <>", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameGreaterThan(String value) {
            addCriterion("worksName >", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameGreaterThanOrEqualTo(String value) {
            addCriterion("worksName >=", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameLessThan(String value) {
            addCriterion("worksName <", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameLessThanOrEqualTo(String value) {
            addCriterion("worksName <=", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameLike(String value) {
            addCriterion("worksName like", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameNotLike(String value) {
            addCriterion("worksName not like", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameIn(List<String> values) {
            addCriterion("worksName in", values, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameNotIn(List<String> values) {
            addCriterion("worksName not in", values, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameBetween(String value1, String value2) {
            addCriterion("worksName between", value1, value2, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameNotBetween(String value1, String value2) {
            addCriterion("worksName not between", value1, value2, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksTypeIsNull() {
            addCriterion("worksType is null");
            return (Criteria) this;
        }

        public Criteria andWorksTypeIsNotNull() {
            addCriterion("worksType is not null");
            return (Criteria) this;
        }

        public Criteria andWorksTypeEqualTo(Integer value) {
            addCriterion("worksType =", value, "worksType");
            return (Criteria) this;
        }

        public Criteria andWorksTypeNotEqualTo(Integer value) {
            addCriterion("worksType <>", value, "worksType");
            return (Criteria) this;
        }

        public Criteria andWorksTypeGreaterThan(Integer value) {
            addCriterion("worksType >", value, "worksType");
            return (Criteria) this;
        }

        public Criteria andWorksTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("worksType >=", value, "worksType");
            return (Criteria) this;
        }

        public Criteria andWorksTypeLessThan(Integer value) {
            addCriterion("worksType <", value, "worksType");
            return (Criteria) this;
        }

        public Criteria andWorksTypeLessThanOrEqualTo(Integer value) {
            addCriterion("worksType <=", value, "worksType");
            return (Criteria) this;
        }

        public Criteria andWorksTypeIn(List<Integer> values) {
            addCriterion("worksType in", values, "worksType");
            return (Criteria) this;
        }

        public Criteria andWorksTypeNotIn(List<Integer> values) {
            addCriterion("worksType not in", values, "worksType");
            return (Criteria) this;
        }

        public Criteria andWorksTypeBetween(Integer value1, Integer value2) {
            addCriterion("worksType between", value1, value2, "worksType");
            return (Criteria) this;
        }

        public Criteria andWorksTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("worksType not between", value1, value2, "worksType");
            return (Criteria) this;
        }

        public Criteria andServerStateIsNull() {
            addCriterion("serverState is null");
            return (Criteria) this;
        }

        public Criteria andServerStateIsNotNull() {
            addCriterion("serverState is not null");
            return (Criteria) this;
        }

        public Criteria andServerStateEqualTo(String value) {
            addCriterion("serverState =", value, "serverState");
            return (Criteria) this;
        }

        public Criteria andServerStateNotEqualTo(String value) {
            addCriterion("serverState <>", value, "serverState");
            return (Criteria) this;
        }

        public Criteria andServerStateGreaterThan(String value) {
            addCriterion("serverState >", value, "serverState");
            return (Criteria) this;
        }

        public Criteria andServerStateGreaterThanOrEqualTo(String value) {
            addCriterion("serverState >=", value, "serverState");
            return (Criteria) this;
        }

        public Criteria andServerStateLessThan(String value) {
            addCriterion("serverState <", value, "serverState");
            return (Criteria) this;
        }

        public Criteria andServerStateLessThanOrEqualTo(String value) {
            addCriterion("serverState <=", value, "serverState");
            return (Criteria) this;
        }

        public Criteria andServerStateLike(String value) {
            addCriterion("serverState like", value, "serverState");
            return (Criteria) this;
        }

        public Criteria andServerStateNotLike(String value) {
            addCriterion("serverState not like", value, "serverState");
            return (Criteria) this;
        }

        public Criteria andServerStateIn(List<String> values) {
            addCriterion("serverState in", values, "serverState");
            return (Criteria) this;
        }

        public Criteria andServerStateNotIn(List<String> values) {
            addCriterion("serverState not in", values, "serverState");
            return (Criteria) this;
        }

        public Criteria andServerStateBetween(String value1, String value2) {
            addCriterion("serverState between", value1, value2, "serverState");
            return (Criteria) this;
        }

        public Criteria andServerStateNotBetween(String value1, String value2) {
            addCriterion("serverState not between", value1, value2, "serverState");
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