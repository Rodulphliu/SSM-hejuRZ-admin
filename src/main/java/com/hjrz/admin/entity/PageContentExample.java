package com.hjrz.admin.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PageContentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PageContentExample() {
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

        public Criteria andContentCodeIsNull() {
            addCriterion("contentCode is null");
            return (Criteria) this;
        }

        public Criteria andContentCodeIsNotNull() {
            addCriterion("contentCode is not null");
            return (Criteria) this;
        }

        public Criteria andContentCodeEqualTo(Integer value) {
            addCriterion("contentCode =", value, "contentCode");
            return (Criteria) this;
        }

        public Criteria andContentCodeNotEqualTo(Integer value) {
            addCriterion("contentCode <>", value, "contentCode");
            return (Criteria) this;
        }

        public Criteria andContentCodeGreaterThan(Integer value) {
            addCriterion("contentCode >", value, "contentCode");
            return (Criteria) this;
        }

        public Criteria andContentCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("contentCode >=", value, "contentCode");
            return (Criteria) this;
        }

        public Criteria andContentCodeLessThan(Integer value) {
            addCriterion("contentCode <", value, "contentCode");
            return (Criteria) this;
        }

        public Criteria andContentCodeLessThanOrEqualTo(Integer value) {
            addCriterion("contentCode <=", value, "contentCode");
            return (Criteria) this;
        }

        public Criteria andContentCodeIn(List<Integer> values) {
            addCriterion("contentCode in", values, "contentCode");
            return (Criteria) this;
        }

        public Criteria andContentCodeNotIn(List<Integer> values) {
            addCriterion("contentCode not in", values, "contentCode");
            return (Criteria) this;
        }

        public Criteria andContentCodeBetween(Integer value1, Integer value2) {
            addCriterion("contentCode between", value1, value2, "contentCode");
            return (Criteria) this;
        }

        public Criteria andContentCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("contentCode not between", value1, value2, "contentCode");
            return (Criteria) this;
        }

        public Criteria andContentNameIsNull() {
            addCriterion("contentName is null");
            return (Criteria) this;
        }

        public Criteria andContentNameIsNotNull() {
            addCriterion("contentName is not null");
            return (Criteria) this;
        }

        public Criteria andContentNameEqualTo(String value) {
            addCriterion("contentName =", value, "contentName");
            return (Criteria) this;
        }

        public Criteria andContentNameNotEqualTo(String value) {
            addCriterion("contentName <>", value, "contentName");
            return (Criteria) this;
        }

        public Criteria andContentNameGreaterThan(String value) {
            addCriterion("contentName >", value, "contentName");
            return (Criteria) this;
        }

        public Criteria andContentNameGreaterThanOrEqualTo(String value) {
            addCriterion("contentName >=", value, "contentName");
            return (Criteria) this;
        }

        public Criteria andContentNameLessThan(String value) {
            addCriterion("contentName <", value, "contentName");
            return (Criteria) this;
        }

        public Criteria andContentNameLessThanOrEqualTo(String value) {
            addCriterion("contentName <=", value, "contentName");
            return (Criteria) this;
        }

        public Criteria andContentNameLike(String value) {
            addCriterion("contentName like", value, "contentName");
            return (Criteria) this;
        }

        public Criteria andContentNameNotLike(String value) {
            addCriterion("contentName not like", value, "contentName");
            return (Criteria) this;
        }

        public Criteria andContentNameIn(List<String> values) {
            addCriterion("contentName in", values, "contentName");
            return (Criteria) this;
        }

        public Criteria andContentNameNotIn(List<String> values) {
            addCriterion("contentName not in", values, "contentName");
            return (Criteria) this;
        }

        public Criteria andContentNameBetween(String value1, String value2) {
            addCriterion("contentName between", value1, value2, "contentName");
            return (Criteria) this;
        }

        public Criteria andContentNameNotBetween(String value1, String value2) {
            addCriterion("contentName not between", value1, value2, "contentName");
            return (Criteria) this;
        }

        public Criteria andContentBelongCodeIsNull() {
            addCriterion("contentBelongCode is null");
            return (Criteria) this;
        }

        public Criteria andContentBelongCodeIsNotNull() {
            addCriterion("contentBelongCode is not null");
            return (Criteria) this;
        }

        public Criteria andContentBelongCodeEqualTo(Integer value) {
            addCriterion("contentBelongCode =", value, "contentBelongCode");
            return (Criteria) this;
        }

        public Criteria andContentBelongCodeNotEqualTo(Integer value) {
            addCriterion("contentBelongCode <>", value, "contentBelongCode");
            return (Criteria) this;
        }

        public Criteria andContentBelongCodeGreaterThan(Integer value) {
            addCriterion("contentBelongCode >", value, "contentBelongCode");
            return (Criteria) this;
        }

        public Criteria andContentBelongCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("contentBelongCode >=", value, "contentBelongCode");
            return (Criteria) this;
        }

        public Criteria andContentBelongCodeLessThan(Integer value) {
            addCriterion("contentBelongCode <", value, "contentBelongCode");
            return (Criteria) this;
        }

        public Criteria andContentBelongCodeLessThanOrEqualTo(Integer value) {
            addCriterion("contentBelongCode <=", value, "contentBelongCode");
            return (Criteria) this;
        }

        public Criteria andContentBelongCodeIn(List<Integer> values) {
            addCriterion("contentBelongCode in", values, "contentBelongCode");
            return (Criteria) this;
        }

        public Criteria andContentBelongCodeNotIn(List<Integer> values) {
            addCriterion("contentBelongCode not in", values, "contentBelongCode");
            return (Criteria) this;
        }

        public Criteria andContentBelongCodeBetween(Integer value1, Integer value2) {
            addCriterion("contentBelongCode between", value1, value2, "contentBelongCode");
            return (Criteria) this;
        }

        public Criteria andContentBelongCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("contentBelongCode not between", value1, value2, "contentBelongCode");
            return (Criteria) this;
        }

        public Criteria andContentImageIsNull() {
            addCriterion("contentImage is null");
            return (Criteria) this;
        }

        public Criteria andContentImageIsNotNull() {
            addCriterion("contentImage is not null");
            return (Criteria) this;
        }

        public Criteria andContentImageEqualTo(String value) {
            addCriterion("contentImage =", value, "contentImage");
            return (Criteria) this;
        }

        public Criteria andContentImageNotEqualTo(String value) {
            addCriterion("contentImage <>", value, "contentImage");
            return (Criteria) this;
        }

        public Criteria andContentImageGreaterThan(String value) {
            addCriterion("contentImage >", value, "contentImage");
            return (Criteria) this;
        }

        public Criteria andContentImageGreaterThanOrEqualTo(String value) {
            addCriterion("contentImage >=", value, "contentImage");
            return (Criteria) this;
        }

        public Criteria andContentImageLessThan(String value) {
            addCriterion("contentImage <", value, "contentImage");
            return (Criteria) this;
        }

        public Criteria andContentImageLessThanOrEqualTo(String value) {
            addCriterion("contentImage <=", value, "contentImage");
            return (Criteria) this;
        }

        public Criteria andContentImageLike(String value) {
            addCriterion("contentImage like", value, "contentImage");
            return (Criteria) this;
        }

        public Criteria andContentImageNotLike(String value) {
            addCriterion("contentImage not like", value, "contentImage");
            return (Criteria) this;
        }

        public Criteria andContentImageIn(List<String> values) {
            addCriterion("contentImage in", values, "contentImage");
            return (Criteria) this;
        }

        public Criteria andContentImageNotIn(List<String> values) {
            addCriterion("contentImage not in", values, "contentImage");
            return (Criteria) this;
        }

        public Criteria andContentImageBetween(String value1, String value2) {
            addCriterion("contentImage between", value1, value2, "contentImage");
            return (Criteria) this;
        }

        public Criteria andContentImageNotBetween(String value1, String value2) {
            addCriterion("contentImage not between", value1, value2, "contentImage");
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

        public Criteria andContentAliveStateIsNull() {
            addCriterion("contentAliveState is null");
            return (Criteria) this;
        }

        public Criteria andContentAliveStateIsNotNull() {
            addCriterion("contentAliveState is not null");
            return (Criteria) this;
        }

        public Criteria andContentAliveStateEqualTo(String value) {
            addCriterion("contentAliveState =", value, "contentAliveState");
            return (Criteria) this;
        }

        public Criteria andContentAliveStateNotEqualTo(String value) {
            addCriterion("contentAliveState <>", value, "contentAliveState");
            return (Criteria) this;
        }

        public Criteria andContentAliveStateGreaterThan(String value) {
            addCriterion("contentAliveState >", value, "contentAliveState");
            return (Criteria) this;
        }

        public Criteria andContentAliveStateGreaterThanOrEqualTo(String value) {
            addCriterion("contentAliveState >=", value, "contentAliveState");
            return (Criteria) this;
        }

        public Criteria andContentAliveStateLessThan(String value) {
            addCriterion("contentAliveState <", value, "contentAliveState");
            return (Criteria) this;
        }

        public Criteria andContentAliveStateLessThanOrEqualTo(String value) {
            addCriterion("contentAliveState <=", value, "contentAliveState");
            return (Criteria) this;
        }

        public Criteria andContentAliveStateLike(String value) {
            addCriterion("contentAliveState like", value, "contentAliveState");
            return (Criteria) this;
        }

        public Criteria andContentAliveStateNotLike(String value) {
            addCriterion("contentAliveState not like", value, "contentAliveState");
            return (Criteria) this;
        }

        public Criteria andContentAliveStateIn(List<String> values) {
            addCriterion("contentAliveState in", values, "contentAliveState");
            return (Criteria) this;
        }

        public Criteria andContentAliveStateNotIn(List<String> values) {
            addCriterion("contentAliveState not in", values, "contentAliveState");
            return (Criteria) this;
        }

        public Criteria andContentAliveStateBetween(String value1, String value2) {
            addCriterion("contentAliveState between", value1, value2, "contentAliveState");
            return (Criteria) this;
        }

        public Criteria andContentAliveStateNotBetween(String value1, String value2) {
            addCriterion("contentAliveState not between", value1, value2, "contentAliveState");
            return (Criteria) this;
        }

        public Criteria andContentURLIsNull() {
            addCriterion("contentURL is null");
            return (Criteria) this;
        }

        public Criteria andContentURLIsNotNull() {
            addCriterion("contentURL is not null");
            return (Criteria) this;
        }

        public Criteria andContentURLEqualTo(String value) {
            addCriterion("contentURL =", value, "contentURL");
            return (Criteria) this;
        }

        public Criteria andContentURLNotEqualTo(String value) {
            addCriterion("contentURL <>", value, "contentURL");
            return (Criteria) this;
        }

        public Criteria andContentURLGreaterThan(String value) {
            addCriterion("contentURL >", value, "contentURL");
            return (Criteria) this;
        }

        public Criteria andContentURLGreaterThanOrEqualTo(String value) {
            addCriterion("contentURL >=", value, "contentURL");
            return (Criteria) this;
        }

        public Criteria andContentURLLessThan(String value) {
            addCriterion("contentURL <", value, "contentURL");
            return (Criteria) this;
        }

        public Criteria andContentURLLessThanOrEqualTo(String value) {
            addCriterion("contentURL <=", value, "contentURL");
            return (Criteria) this;
        }

        public Criteria andContentURLLike(String value) {
            addCriterion("contentURL like", value, "contentURL");
            return (Criteria) this;
        }

        public Criteria andContentURLNotLike(String value) {
            addCriterion("contentURL not like", value, "contentURL");
            return (Criteria) this;
        }

        public Criteria andContentURLIn(List<String> values) {
            addCriterion("contentURL in", values, "contentURL");
            return (Criteria) this;
        }

        public Criteria andContentURLNotIn(List<String> values) {
            addCriterion("contentURL not in", values, "contentURL");
            return (Criteria) this;
        }

        public Criteria andContentURLBetween(String value1, String value2) {
            addCriterion("contentURL between", value1, value2, "contentURL");
            return (Criteria) this;
        }

        public Criteria andContentURLNotBetween(String value1, String value2) {
            addCriterion("contentURL not between", value1, value2, "contentURL");
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