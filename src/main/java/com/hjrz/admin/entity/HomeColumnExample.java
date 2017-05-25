package com.hjrz.admin.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HomeColumnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HomeColumnExample() {
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

        public Criteria andColumnIdIsNull() {
            addCriterion("columnId is null");
            return (Criteria) this;
        }

        public Criteria andColumnIdIsNotNull() {
            addCriterion("columnId is not null");
            return (Criteria) this;
        }

        public Criteria andColumnIdEqualTo(Integer value) {
            addCriterion("columnId =", value, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdNotEqualTo(Integer value) {
            addCriterion("columnId <>", value, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdGreaterThan(Integer value) {
            addCriterion("columnId >", value, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("columnId >=", value, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdLessThan(Integer value) {
            addCriterion("columnId <", value, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdLessThanOrEqualTo(Integer value) {
            addCriterion("columnId <=", value, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdIn(List<Integer> values) {
            addCriterion("columnId in", values, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdNotIn(List<Integer> values) {
            addCriterion("columnId not in", values, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdBetween(Integer value1, Integer value2) {
            addCriterion("columnId between", value1, value2, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("columnId not between", value1, value2, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnTitleIsNull() {
            addCriterion("columnTitle is null");
            return (Criteria) this;
        }

        public Criteria andColumnTitleIsNotNull() {
            addCriterion("columnTitle is not null");
            return (Criteria) this;
        }

        public Criteria andColumnTitleEqualTo(String value) {
            addCriterion("columnTitle =", value, "columnTitle");
            return (Criteria) this;
        }

        public Criteria andColumnTitleNotEqualTo(String value) {
            addCriterion("columnTitle <>", value, "columnTitle");
            return (Criteria) this;
        }

        public Criteria andColumnTitleGreaterThan(String value) {
            addCriterion("columnTitle >", value, "columnTitle");
            return (Criteria) this;
        }

        public Criteria andColumnTitleGreaterThanOrEqualTo(String value) {
            addCriterion("columnTitle >=", value, "columnTitle");
            return (Criteria) this;
        }

        public Criteria andColumnTitleLessThan(String value) {
            addCriterion("columnTitle <", value, "columnTitle");
            return (Criteria) this;
        }

        public Criteria andColumnTitleLessThanOrEqualTo(String value) {
            addCriterion("columnTitle <=", value, "columnTitle");
            return (Criteria) this;
        }

        public Criteria andColumnTitleLike(String value) {
            addCriterion("columnTitle like", value, "columnTitle");
            return (Criteria) this;
        }

        public Criteria andColumnTitleNotLike(String value) {
            addCriterion("columnTitle not like", value, "columnTitle");
            return (Criteria) this;
        }

        public Criteria andColumnTitleIn(List<String> values) {
            addCriterion("columnTitle in", values, "columnTitle");
            return (Criteria) this;
        }

        public Criteria andColumnTitleNotIn(List<String> values) {
            addCriterion("columnTitle not in", values, "columnTitle");
            return (Criteria) this;
        }

        public Criteria andColumnTitleBetween(String value1, String value2) {
            addCriterion("columnTitle between", value1, value2, "columnTitle");
            return (Criteria) this;
        }

        public Criteria andColumnTitleNotBetween(String value1, String value2) {
            addCriterion("columnTitle not between", value1, value2, "columnTitle");
            return (Criteria) this;
        }

        public Criteria andBelongColumnIsNull() {
            addCriterion("belongColumn is null");
            return (Criteria) this;
        }

        public Criteria andBelongColumnIsNotNull() {
            addCriterion("belongColumn is not null");
            return (Criteria) this;
        }

        public Criteria andBelongColumnEqualTo(String value) {
            addCriterion("belongColumn =", value, "belongColumn");
            return (Criteria) this;
        }

        public Criteria andBelongColumnNotEqualTo(String value) {
            addCriterion("belongColumn <>", value, "belongColumn");
            return (Criteria) this;
        }

        public Criteria andBelongColumnGreaterThan(String value) {
            addCriterion("belongColumn >", value, "belongColumn");
            return (Criteria) this;
        }

        public Criteria andBelongColumnGreaterThanOrEqualTo(String value) {
            addCriterion("belongColumn >=", value, "belongColumn");
            return (Criteria) this;
        }

        public Criteria andBelongColumnLessThan(String value) {
            addCriterion("belongColumn <", value, "belongColumn");
            return (Criteria) this;
        }

        public Criteria andBelongColumnLessThanOrEqualTo(String value) {
            addCriterion("belongColumn <=", value, "belongColumn");
            return (Criteria) this;
        }

        public Criteria andBelongColumnLike(String value) {
            addCriterion("belongColumn like", value, "belongColumn");
            return (Criteria) this;
        }

        public Criteria andBelongColumnNotLike(String value) {
            addCriterion("belongColumn not like", value, "belongColumn");
            return (Criteria) this;
        }

        public Criteria andBelongColumnIn(List<String> values) {
            addCriterion("belongColumn in", values, "belongColumn");
            return (Criteria) this;
        }

        public Criteria andBelongColumnNotIn(List<String> values) {
            addCriterion("belongColumn not in", values, "belongColumn");
            return (Criteria) this;
        }

        public Criteria andBelongColumnBetween(String value1, String value2) {
            addCriterion("belongColumn between", value1, value2, "belongColumn");
            return (Criteria) this;
        }

        public Criteria andBelongColumnNotBetween(String value1, String value2) {
            addCriterion("belongColumn not between", value1, value2, "belongColumn");
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