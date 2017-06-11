package com.hjrz.admin.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DynamicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DynamicExample() {
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

        public Criteria andDyCodeIsNull() {
            addCriterion("dyCode is null");
            return (Criteria) this;
        }

        public Criteria andDyCodeIsNotNull() {
            addCriterion("dyCode is not null");
            return (Criteria) this;
        }

        public Criteria andDyCodeEqualTo(Integer value) {
            addCriterion("dyCode =", value, "dyCode");
            return (Criteria) this;
        }

        public Criteria andDyCodeNotEqualTo(Integer value) {
            addCriterion("dyCode <>", value, "dyCode");
            return (Criteria) this;
        }

        public Criteria andDyCodeGreaterThan(Integer value) {
            addCriterion("dyCode >", value, "dyCode");
            return (Criteria) this;
        }

        public Criteria andDyCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dyCode >=", value, "dyCode");
            return (Criteria) this;
        }

        public Criteria andDyCodeLessThan(Integer value) {
            addCriterion("dyCode <", value, "dyCode");
            return (Criteria) this;
        }

        public Criteria andDyCodeLessThanOrEqualTo(Integer value) {
            addCriterion("dyCode <=", value, "dyCode");
            return (Criteria) this;
        }

        public Criteria andDyCodeIn(List<Integer> values) {
            addCriterion("dyCode in", values, "dyCode");
            return (Criteria) this;
        }

        public Criteria andDyCodeNotIn(List<Integer> values) {
            addCriterion("dyCode not in", values, "dyCode");
            return (Criteria) this;
        }

        public Criteria andDyCodeBetween(Integer value1, Integer value2) {
            addCriterion("dyCode between", value1, value2, "dyCode");
            return (Criteria) this;
        }

        public Criteria andDyCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("dyCode not between", value1, value2, "dyCode");
            return (Criteria) this;
        }

        public Criteria andDyTitleIsNull() {
            addCriterion("dyTitle is null");
            return (Criteria) this;
        }

        public Criteria andDyTitleIsNotNull() {
            addCriterion("dyTitle is not null");
            return (Criteria) this;
        }

        public Criteria andDyTitleEqualTo(String value) {
            addCriterion("dyTitle =", value, "dyTitle");
            return (Criteria) this;
        }

        public Criteria andDyTitleNotEqualTo(String value) {
            addCriterion("dyTitle <>", value, "dyTitle");
            return (Criteria) this;
        }

        public Criteria andDyTitleGreaterThan(String value) {
            addCriterion("dyTitle >", value, "dyTitle");
            return (Criteria) this;
        }

        public Criteria andDyTitleGreaterThanOrEqualTo(String value) {
            addCriterion("dyTitle >=", value, "dyTitle");
            return (Criteria) this;
        }

        public Criteria andDyTitleLessThan(String value) {
            addCriterion("dyTitle <", value, "dyTitle");
            return (Criteria) this;
        }

        public Criteria andDyTitleLessThanOrEqualTo(String value) {
            addCriterion("dyTitle <=", value, "dyTitle");
            return (Criteria) this;
        }

        public Criteria andDyTitleLike(String value) {
            addCriterion("dyTitle like", value, "dyTitle");
            return (Criteria) this;
        }

        public Criteria andDyTitleNotLike(String value) {
            addCriterion("dyTitle not like", value, "dyTitle");
            return (Criteria) this;
        }

        public Criteria andDyTitleIn(List<String> values) {
            addCriterion("dyTitle in", values, "dyTitle");
            return (Criteria) this;
        }

        public Criteria andDyTitleNotIn(List<String> values) {
            addCriterion("dyTitle not in", values, "dyTitle");
            return (Criteria) this;
        }

        public Criteria andDyTitleBetween(String value1, String value2) {
            addCriterion("dyTitle between", value1, value2, "dyTitle");
            return (Criteria) this;
        }

        public Criteria andDyTitleNotBetween(String value1, String value2) {
            addCriterion("dyTitle not between", value1, value2, "dyTitle");
            return (Criteria) this;
        }

        public Criteria andDyimageCoverIsNull() {
            addCriterion("dyimageCover is null");
            return (Criteria) this;
        }

        public Criteria andDyimageCoverIsNotNull() {
            addCriterion("dyimageCover is not null");
            return (Criteria) this;
        }

        public Criteria andDyimageCoverEqualTo(String value) {
            addCriterion("dyimageCover =", value, "dyimageCover");
            return (Criteria) this;
        }

        public Criteria andDyimageCoverNotEqualTo(String value) {
            addCriterion("dyimageCover <>", value, "dyimageCover");
            return (Criteria) this;
        }

        public Criteria andDyimageCoverGreaterThan(String value) {
            addCriterion("dyimageCover >", value, "dyimageCover");
            return (Criteria) this;
        }

        public Criteria andDyimageCoverGreaterThanOrEqualTo(String value) {
            addCriterion("dyimageCover >=", value, "dyimageCover");
            return (Criteria) this;
        }

        public Criteria andDyimageCoverLessThan(String value) {
            addCriterion("dyimageCover <", value, "dyimageCover");
            return (Criteria) this;
        }

        public Criteria andDyimageCoverLessThanOrEqualTo(String value) {
            addCriterion("dyimageCover <=", value, "dyimageCover");
            return (Criteria) this;
        }

        public Criteria andDyimageCoverLike(String value) {
            addCriterion("dyimageCover like", value, "dyimageCover");
            return (Criteria) this;
        }

        public Criteria andDyimageCoverNotLike(String value) {
            addCriterion("dyimageCover not like", value, "dyimageCover");
            return (Criteria) this;
        }

        public Criteria andDyimageCoverIn(List<String> values) {
            addCriterion("dyimageCover in", values, "dyimageCover");
            return (Criteria) this;
        }

        public Criteria andDyimageCoverNotIn(List<String> values) {
            addCriterion("dyimageCover not in", values, "dyimageCover");
            return (Criteria) this;
        }

        public Criteria andDyimageCoverBetween(String value1, String value2) {
            addCriterion("dyimageCover between", value1, value2, "dyimageCover");
            return (Criteria) this;
        }

        public Criteria andDyimageCoverNotBetween(String value1, String value2) {
            addCriterion("dyimageCover not between", value1, value2, "dyimageCover");
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

        public Criteria andCreate_adminIsNull() {
            addCriterion("create_admin is null");
            return (Criteria) this;
        }

        public Criteria andCreate_adminIsNotNull() {
            addCriterion("create_admin is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_adminEqualTo(String value) {
            addCriterion("create_admin =", value, "create_admin");
            return (Criteria) this;
        }

        public Criteria andCreate_adminNotEqualTo(String value) {
            addCriterion("create_admin <>", value, "create_admin");
            return (Criteria) this;
        }

        public Criteria andCreate_adminGreaterThan(String value) {
            addCriterion("create_admin >", value, "create_admin");
            return (Criteria) this;
        }

        public Criteria andCreate_adminGreaterThanOrEqualTo(String value) {
            addCriterion("create_admin >=", value, "create_admin");
            return (Criteria) this;
        }

        public Criteria andCreate_adminLessThan(String value) {
            addCriterion("create_admin <", value, "create_admin");
            return (Criteria) this;
        }

        public Criteria andCreate_adminLessThanOrEqualTo(String value) {
            addCriterion("create_admin <=", value, "create_admin");
            return (Criteria) this;
        }

        public Criteria andCreate_adminLike(String value) {
            addCriterion("create_admin like", value, "create_admin");
            return (Criteria) this;
        }

        public Criteria andCreate_adminNotLike(String value) {
            addCriterion("create_admin not like", value, "create_admin");
            return (Criteria) this;
        }

        public Criteria andCreate_adminIn(List<String> values) {
            addCriterion("create_admin in", values, "create_admin");
            return (Criteria) this;
        }

        public Criteria andCreate_adminNotIn(List<String> values) {
            addCriterion("create_admin not in", values, "create_admin");
            return (Criteria) this;
        }

        public Criteria andCreate_adminBetween(String value1, String value2) {
            addCriterion("create_admin between", value1, value2, "create_admin");
            return (Criteria) this;
        }

        public Criteria andCreate_adminNotBetween(String value1, String value2) {
            addCriterion("create_admin not between", value1, value2, "create_admin");
            return (Criteria) this;
        }

        public Criteria andDyAliveStateIsNull() {
            addCriterion("dyAliveState is null");
            return (Criteria) this;
        }

        public Criteria andDyAliveStateIsNotNull() {
            addCriterion("dyAliveState is not null");
            return (Criteria) this;
        }

        public Criteria andDyAliveStateEqualTo(String value) {
            addCriterion("dyAliveState =", value, "dyAliveState");
            return (Criteria) this;
        }

        public Criteria andDyAliveStateNotEqualTo(String value) {
            addCriterion("dyAliveState <>", value, "dyAliveState");
            return (Criteria) this;
        }

        public Criteria andDyAliveStateGreaterThan(String value) {
            addCriterion("dyAliveState >", value, "dyAliveState");
            return (Criteria) this;
        }

        public Criteria andDyAliveStateGreaterThanOrEqualTo(String value) {
            addCriterion("dyAliveState >=", value, "dyAliveState");
            return (Criteria) this;
        }

        public Criteria andDyAliveStateLessThan(String value) {
            addCriterion("dyAliveState <", value, "dyAliveState");
            return (Criteria) this;
        }

        public Criteria andDyAliveStateLessThanOrEqualTo(String value) {
            addCriterion("dyAliveState <=", value, "dyAliveState");
            return (Criteria) this;
        }

        public Criteria andDyAliveStateLike(String value) {
            addCriterion("dyAliveState like", value, "dyAliveState");
            return (Criteria) this;
        }

        public Criteria andDyAliveStateNotLike(String value) {
            addCriterion("dyAliveState not like", value, "dyAliveState");
            return (Criteria) this;
        }

        public Criteria andDyAliveStateIn(List<String> values) {
            addCriterion("dyAliveState in", values, "dyAliveState");
            return (Criteria) this;
        }

        public Criteria andDyAliveStateNotIn(List<String> values) {
            addCriterion("dyAliveState not in", values, "dyAliveState");
            return (Criteria) this;
        }

        public Criteria andDyAliveStateBetween(String value1, String value2) {
            addCriterion("dyAliveState between", value1, value2, "dyAliveState");
            return (Criteria) this;
        }

        public Criteria andDyAliveStateNotBetween(String value1, String value2) {
            addCriterion("dyAliveState not between", value1, value2, "dyAliveState");
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