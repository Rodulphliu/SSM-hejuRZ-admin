package com.hjrz.admin.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServicerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServicerExample() {
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

        public Criteria andServerCodeIsNull() {
            addCriterion("serverCode is null");
            return (Criteria) this;
        }

        public Criteria andServerCodeIsNotNull() {
            addCriterion("serverCode is not null");
            return (Criteria) this;
        }

        public Criteria andServerCodeEqualTo(Integer value) {
            addCriterion("serverCode =", value, "serverCode");
            return (Criteria) this;
        }

        public Criteria andServerCodeNotEqualTo(Integer value) {
            addCriterion("serverCode <>", value, "serverCode");
            return (Criteria) this;
        }

        public Criteria andServerCodeGreaterThan(Integer value) {
            addCriterion("serverCode >", value, "serverCode");
            return (Criteria) this;
        }

        public Criteria andServerCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("serverCode >=", value, "serverCode");
            return (Criteria) this;
        }

        public Criteria andServerCodeLessThan(Integer value) {
            addCriterion("serverCode <", value, "serverCode");
            return (Criteria) this;
        }

        public Criteria andServerCodeLessThanOrEqualTo(Integer value) {
            addCriterion("serverCode <=", value, "serverCode");
            return (Criteria) this;
        }

        public Criteria andServerCodeIn(List<Integer> values) {
            addCriterion("serverCode in", values, "serverCode");
            return (Criteria) this;
        }

        public Criteria andServerCodeNotIn(List<Integer> values) {
            addCriterion("serverCode not in", values, "serverCode");
            return (Criteria) this;
        }

        public Criteria andServerCodeBetween(Integer value1, Integer value2) {
            addCriterion("serverCode between", value1, value2, "serverCode");
            return (Criteria) this;
        }

        public Criteria andServerCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("serverCode not between", value1, value2, "serverCode");
            return (Criteria) this;
        }

        public Criteria andServerNameIsNull() {
            addCriterion("serverName is null");
            return (Criteria) this;
        }

        public Criteria andServerNameIsNotNull() {
            addCriterion("serverName is not null");
            return (Criteria) this;
        }

        public Criteria andServerNameEqualTo(String value) {
            addCriterion("serverName =", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameNotEqualTo(String value) {
            addCriterion("serverName <>", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameGreaterThan(String value) {
            addCriterion("serverName >", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameGreaterThanOrEqualTo(String value) {
            addCriterion("serverName >=", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameLessThan(String value) {
            addCriterion("serverName <", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameLessThanOrEqualTo(String value) {
            addCriterion("serverName <=", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameLike(String value) {
            addCriterion("serverName like", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameNotLike(String value) {
            addCriterion("serverName not like", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameIn(List<String> values) {
            addCriterion("serverName in", values, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameNotIn(List<String> values) {
            addCriterion("serverName not in", values, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameBetween(String value1, String value2) {
            addCriterion("serverName between", value1, value2, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameNotBetween(String value1, String value2) {
            addCriterion("serverName not between", value1, value2, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerTypeIsNull() {
            addCriterion("serverType is null");
            return (Criteria) this;
        }

        public Criteria andServerTypeIsNotNull() {
            addCriterion("serverType is not null");
            return (Criteria) this;
        }

        public Criteria andServerTypeEqualTo(Integer value) {
            addCriterion("serverType =", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeNotEqualTo(Integer value) {
            addCriterion("serverType <>", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeGreaterThan(Integer value) {
            addCriterion("serverType >", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("serverType >=", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeLessThan(Integer value) {
            addCriterion("serverType <", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeLessThanOrEqualTo(Integer value) {
            addCriterion("serverType <=", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeIn(List<Integer> values) {
            addCriterion("serverType in", values, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeNotIn(List<Integer> values) {
            addCriterion("serverType not in", values, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeBetween(Integer value1, Integer value2) {
            addCriterion("serverType between", value1, value2, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("serverType not between", value1, value2, "serverType");
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