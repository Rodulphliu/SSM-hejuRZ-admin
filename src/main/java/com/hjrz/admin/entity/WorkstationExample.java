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

        public Criteria andWorkscodeIsNull() {
            addCriterion("worksCode is null");
            return (Criteria) this;
        }

        public Criteria andWorkscodeIsNotNull() {
            addCriterion("worksCode is not null");
            return (Criteria) this;
        }

        public Criteria andWorkscodeEqualTo(Long value) {
            addCriterion("worksCode =", value, "workscode");
            return (Criteria) this;
        }

        public Criteria andWorkscodeNotEqualTo(Long value) {
            addCriterion("worksCode <>", value, "workscode");
            return (Criteria) this;
        }

        public Criteria andWorkscodeGreaterThan(Long value) {
            addCriterion("worksCode >", value, "workscode");
            return (Criteria) this;
        }

        public Criteria andWorkscodeGreaterThanOrEqualTo(Long value) {
            addCriterion("worksCode >=", value, "workscode");
            return (Criteria) this;
        }

        public Criteria andWorkscodeLessThan(Long value) {
            addCriterion("worksCode <", value, "workscode");
            return (Criteria) this;
        }

        public Criteria andWorkscodeLessThanOrEqualTo(Long value) {
            addCriterion("worksCode <=", value, "workscode");
            return (Criteria) this;
        }

        public Criteria andWorkscodeIn(List<Long> values) {
            addCriterion("worksCode in", values, "workscode");
            return (Criteria) this;
        }

        public Criteria andWorkscodeNotIn(List<Long> values) {
            addCriterion("worksCode not in", values, "workscode");
            return (Criteria) this;
        }

        public Criteria andWorkscodeBetween(Long value1, Long value2) {
            addCriterion("worksCode between", value1, value2, "workscode");
            return (Criteria) this;
        }

        public Criteria andWorkscodeNotBetween(Long value1, Long value2) {
            addCriterion("worksCode not between", value1, value2, "workscode");
            return (Criteria) this;
        }

        public Criteria andWorksnameIsNull() {
            addCriterion("worksName is null");
            return (Criteria) this;
        }

        public Criteria andWorksnameIsNotNull() {
            addCriterion("worksName is not null");
            return (Criteria) this;
        }

        public Criteria andWorksnameEqualTo(String value) {
            addCriterion("worksName =", value, "worksname");
            return (Criteria) this;
        }

        public Criteria andWorksnameNotEqualTo(String value) {
            addCriterion("worksName <>", value, "worksname");
            return (Criteria) this;
        }

        public Criteria andWorksnameGreaterThan(String value) {
            addCriterion("worksName >", value, "worksname");
            return (Criteria) this;
        }

        public Criteria andWorksnameGreaterThanOrEqualTo(String value) {
            addCriterion("worksName >=", value, "worksname");
            return (Criteria) this;
        }

        public Criteria andWorksnameLessThan(String value) {
            addCriterion("worksName <", value, "worksname");
            return (Criteria) this;
        }

        public Criteria andWorksnameLessThanOrEqualTo(String value) {
            addCriterion("worksName <=", value, "worksname");
            return (Criteria) this;
        }

        public Criteria andWorksnameLike(String value) {
            addCriterion("worksName like", value, "worksname");
            return (Criteria) this;
        }

        public Criteria andWorksnameNotLike(String value) {
            addCriterion("worksName not like", value, "worksname");
            return (Criteria) this;
        }

        public Criteria andWorksnameIn(List<String> values) {
            addCriterion("worksName in", values, "worksname");
            return (Criteria) this;
        }

        public Criteria andWorksnameNotIn(List<String> values) {
            addCriterion("worksName not in", values, "worksname");
            return (Criteria) this;
        }

        public Criteria andWorksnameBetween(String value1, String value2) {
            addCriterion("worksName between", value1, value2, "worksname");
            return (Criteria) this;
        }

        public Criteria andWorksnameNotBetween(String value1, String value2) {
            addCriterion("worksName not between", value1, value2, "worksname");
            return (Criteria) this;
        }

        public Criteria andWorkstypeIsNull() {
            addCriterion("worksType is null");
            return (Criteria) this;
        }

        public Criteria andWorkstypeIsNotNull() {
            addCriterion("worksType is not null");
            return (Criteria) this;
        }

        public Criteria andWorkstypeEqualTo(Integer value) {
            addCriterion("worksType =", value, "workstype");
            return (Criteria) this;
        }

        public Criteria andWorkstypeNotEqualTo(Integer value) {
            addCriterion("worksType <>", value, "workstype");
            return (Criteria) this;
        }

        public Criteria andWorkstypeGreaterThan(Integer value) {
            addCriterion("worksType >", value, "workstype");
            return (Criteria) this;
        }

        public Criteria andWorkstypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("worksType >=", value, "workstype");
            return (Criteria) this;
        }

        public Criteria andWorkstypeLessThan(Integer value) {
            addCriterion("worksType <", value, "workstype");
            return (Criteria) this;
        }

        public Criteria andWorkstypeLessThanOrEqualTo(Integer value) {
            addCriterion("worksType <=", value, "workstype");
            return (Criteria) this;
        }

        public Criteria andWorkstypeIn(List<Integer> values) {
            addCriterion("worksType in", values, "workstype");
            return (Criteria) this;
        }

        public Criteria andWorkstypeNotIn(List<Integer> values) {
            addCriterion("worksType not in", values, "workstype");
            return (Criteria) this;
        }

        public Criteria andWorkstypeBetween(Integer value1, Integer value2) {
            addCriterion("worksType between", value1, value2, "workstype");
            return (Criteria) this;
        }

        public Criteria andWorkstypeNotBetween(Integer value1, Integer value2) {
            addCriterion("worksType not between", value1, value2, "workstype");
            return (Criteria) this;
        }

        public Criteria andServerstateIsNull() {
            addCriterion("serverState is null");
            return (Criteria) this;
        }

        public Criteria andServerstateIsNotNull() {
            addCriterion("serverState is not null");
            return (Criteria) this;
        }

        public Criteria andServerstateEqualTo(String value) {
            addCriterion("serverState =", value, "serverstate");
            return (Criteria) this;
        }

        public Criteria andServerstateNotEqualTo(String value) {
            addCriterion("serverState <>", value, "serverstate");
            return (Criteria) this;
        }

        public Criteria andServerstateGreaterThan(String value) {
            addCriterion("serverState >", value, "serverstate");
            return (Criteria) this;
        }

        public Criteria andServerstateGreaterThanOrEqualTo(String value) {
            addCriterion("serverState >=", value, "serverstate");
            return (Criteria) this;
        }

        public Criteria andServerstateLessThan(String value) {
            addCriterion("serverState <", value, "serverstate");
            return (Criteria) this;
        }

        public Criteria andServerstateLessThanOrEqualTo(String value) {
            addCriterion("serverState <=", value, "serverstate");
            return (Criteria) this;
        }

        public Criteria andServerstateLike(String value) {
            addCriterion("serverState like", value, "serverstate");
            return (Criteria) this;
        }

        public Criteria andServerstateNotLike(String value) {
            addCriterion("serverState not like", value, "serverstate");
            return (Criteria) this;
        }

        public Criteria andServerstateIn(List<String> values) {
            addCriterion("serverState in", values, "serverstate");
            return (Criteria) this;
        }

        public Criteria andServerstateNotIn(List<String> values) {
            addCriterion("serverState not in", values, "serverstate");
            return (Criteria) this;
        }

        public Criteria andServerstateBetween(String value1, String value2) {
            addCriterion("serverState between", value1, value2, "serverstate");
            return (Criteria) this;
        }

        public Criteria andServerstateNotBetween(String value1, String value2) {
            addCriterion("serverState not between", value1, value2, "serverstate");
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