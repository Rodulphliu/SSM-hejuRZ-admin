package com.hjrz.admin.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorkstationsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkstationsExample() {
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

        public Criteria andWksCodeIsNull() {
            addCriterion("wksCode is null");
            return (Criteria) this;
        }

        public Criteria andWksCodeIsNotNull() {
            addCriterion("wksCode is not null");
            return (Criteria) this;
        }

        public Criteria andWksCodeEqualTo(Integer value) {
            addCriterion("wksCode =", value, "wksCode");
            return (Criteria) this;
        }

        public Criteria andWksCodeNotEqualTo(Integer value) {
            addCriterion("wksCode <>", value, "wksCode");
            return (Criteria) this;
        }

        public Criteria andWksCodeGreaterThan(Integer value) {
            addCriterion("wksCode >", value, "wksCode");
            return (Criteria) this;
        }

        public Criteria andWksCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("wksCode >=", value, "wksCode");
            return (Criteria) this;
        }

        public Criteria andWksCodeLessThan(Integer value) {
            addCriterion("wksCode <", value, "wksCode");
            return (Criteria) this;
        }

        public Criteria andWksCodeLessThanOrEqualTo(Integer value) {
            addCriterion("wksCode <=", value, "wksCode");
            return (Criteria) this;
        }

        public Criteria andWksCodeIn(List<Integer> values) {
            addCriterion("wksCode in", values, "wksCode");
            return (Criteria) this;
        }

        public Criteria andWksCodeNotIn(List<Integer> values) {
            addCriterion("wksCode not in", values, "wksCode");
            return (Criteria) this;
        }

        public Criteria andWksCodeBetween(Integer value1, Integer value2) {
            addCriterion("wksCode between", value1, value2, "wksCode");
            return (Criteria) this;
        }

        public Criteria andWksCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("wksCode not between", value1, value2, "wksCode");
            return (Criteria) this;
        }

        public Criteria andWksnameIsNull() {
            addCriterion("wksname is null");
            return (Criteria) this;
        }

        public Criteria andWksnameIsNotNull() {
            addCriterion("wksname is not null");
            return (Criteria) this;
        }

        public Criteria andWksnameEqualTo(String value) {
            addCriterion("wksname =", value, "wksname");
            return (Criteria) this;
        }

        public Criteria andWksnameNotEqualTo(String value) {
            addCriterion("wksname <>", value, "wksname");
            return (Criteria) this;
        }

        public Criteria andWksnameGreaterThan(String value) {
            addCriterion("wksname >", value, "wksname");
            return (Criteria) this;
        }

        public Criteria andWksnameGreaterThanOrEqualTo(String value) {
            addCriterion("wksname >=", value, "wksname");
            return (Criteria) this;
        }

        public Criteria andWksnameLessThan(String value) {
            addCriterion("wksname <", value, "wksname");
            return (Criteria) this;
        }

        public Criteria andWksnameLessThanOrEqualTo(String value) {
            addCriterion("wksname <=", value, "wksname");
            return (Criteria) this;
        }

        public Criteria andWksnameLike(String value) {
            addCriterion("wksname like", value, "wksname");
            return (Criteria) this;
        }

        public Criteria andWksnameNotLike(String value) {
            addCriterion("wksname not like", value, "wksname");
            return (Criteria) this;
        }

        public Criteria andWksnameIn(List<String> values) {
            addCriterion("wksname in", values, "wksname");
            return (Criteria) this;
        }

        public Criteria andWksnameNotIn(List<String> values) {
            addCriterion("wksname not in", values, "wksname");
            return (Criteria) this;
        }

        public Criteria andWksnameBetween(String value1, String value2) {
            addCriterion("wksname between", value1, value2, "wksname");
            return (Criteria) this;
        }

        public Criteria andWksnameNotBetween(String value1, String value2) {
            addCriterion("wksname not between", value1, value2, "wksname");
            return (Criteria) this;
        }

        public Criteria andWksTypeIsNull() {
            addCriterion("wksType is null");
            return (Criteria) this;
        }

        public Criteria andWksTypeIsNotNull() {
            addCriterion("wksType is not null");
            return (Criteria) this;
        }

        public Criteria andWksTypeEqualTo(String value) {
            addCriterion("wksType =", value, "wksType");
            return (Criteria) this;
        }

        public Criteria andWksTypeNotEqualTo(String value) {
            addCriterion("wksType <>", value, "wksType");
            return (Criteria) this;
        }

        public Criteria andWksTypeGreaterThan(String value) {
            addCriterion("wksType >", value, "wksType");
            return (Criteria) this;
        }

        public Criteria andWksTypeGreaterThanOrEqualTo(String value) {
            addCriterion("wksType >=", value, "wksType");
            return (Criteria) this;
        }

        public Criteria andWksTypeLessThan(String value) {
            addCriterion("wksType <", value, "wksType");
            return (Criteria) this;
        }

        public Criteria andWksTypeLessThanOrEqualTo(String value) {
            addCriterion("wksType <=", value, "wksType");
            return (Criteria) this;
        }

        public Criteria andWksTypeLike(String value) {
            addCriterion("wksType like", value, "wksType");
            return (Criteria) this;
        }

        public Criteria andWksTypeNotLike(String value) {
            addCriterion("wksType not like", value, "wksType");
            return (Criteria) this;
        }

        public Criteria andWksTypeIn(List<String> values) {
            addCriterion("wksType in", values, "wksType");
            return (Criteria) this;
        }

        public Criteria andWksTypeNotIn(List<String> values) {
            addCriterion("wksType not in", values, "wksType");
            return (Criteria) this;
        }

        public Criteria andWksTypeBetween(String value1, String value2) {
            addCriterion("wksType between", value1, value2, "wksType");
            return (Criteria) this;
        }

        public Criteria andWksTypeNotBetween(String value1, String value2) {
            addCriterion("wksType not between", value1, value2, "wksType");
            return (Criteria) this;
        }

        public Criteria andWksStateIsNull() {
            addCriterion("wksState is null");
            return (Criteria) this;
        }

        public Criteria andWksStateIsNotNull() {
            addCriterion("wksState is not null");
            return (Criteria) this;
        }

        public Criteria andWksStateEqualTo(String value) {
            addCriterion("wksState =", value, "wksState");
            return (Criteria) this;
        }

        public Criteria andWksStateNotEqualTo(String value) {
            addCriterion("wksState <>", value, "wksState");
            return (Criteria) this;
        }

        public Criteria andWksStateGreaterThan(String value) {
            addCriterion("wksState >", value, "wksState");
            return (Criteria) this;
        }

        public Criteria andWksStateGreaterThanOrEqualTo(String value) {
            addCriterion("wksState >=", value, "wksState");
            return (Criteria) this;
        }

        public Criteria andWksStateLessThan(String value) {
            addCriterion("wksState <", value, "wksState");
            return (Criteria) this;
        }

        public Criteria andWksStateLessThanOrEqualTo(String value) {
            addCriterion("wksState <=", value, "wksState");
            return (Criteria) this;
        }

        public Criteria andWksStateLike(String value) {
            addCriterion("wksState like", value, "wksState");
            return (Criteria) this;
        }

        public Criteria andWksStateNotLike(String value) {
            addCriterion("wksState not like", value, "wksState");
            return (Criteria) this;
        }

        public Criteria andWksStateIn(List<String> values) {
            addCriterion("wksState in", values, "wksState");
            return (Criteria) this;
        }

        public Criteria andWksStateNotIn(List<String> values) {
            addCriterion("wksState not in", values, "wksState");
            return (Criteria) this;
        }

        public Criteria andWksStateBetween(String value1, String value2) {
            addCriterion("wksState between", value1, value2, "wksState");
            return (Criteria) this;
        }

        public Criteria andWksStateNotBetween(String value1, String value2) {
            addCriterion("wksState not between", value1, value2, "wksState");
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