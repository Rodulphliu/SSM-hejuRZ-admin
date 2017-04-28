package com.hjrz.admin.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andAdmcodeIsNull() {
            addCriterion("admcode is null");
            return (Criteria) this;
        }

        public Criteria andAdmcodeIsNotNull() {
            addCriterion("admcode is not null");
            return (Criteria) this;
        }

        public Criteria andAdmcodeEqualTo(Integer value) {
            addCriterion("admcode =", value, "admcode");
            return (Criteria) this;
        }

        public Criteria andAdmcodeNotEqualTo(Integer value) {
            addCriterion("admcode <>", value, "admcode");
            return (Criteria) this;
        }

        public Criteria andAdmcodeGreaterThan(Integer value) {
            addCriterion("admcode >", value, "admcode");
            return (Criteria) this;
        }

        public Criteria andAdmcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("admcode >=", value, "admcode");
            return (Criteria) this;
        }

        public Criteria andAdmcodeLessThan(Integer value) {
            addCriterion("admcode <", value, "admcode");
            return (Criteria) this;
        }

        public Criteria andAdmcodeLessThanOrEqualTo(Integer value) {
            addCriterion("admcode <=", value, "admcode");
            return (Criteria) this;
        }

        public Criteria andAdmcodeIn(List<Integer> values) {
            addCriterion("admcode in", values, "admcode");
            return (Criteria) this;
        }

        public Criteria andAdmcodeNotIn(List<Integer> values) {
            addCriterion("admcode not in", values, "admcode");
            return (Criteria) this;
        }

        public Criteria andAdmcodeBetween(Integer value1, Integer value2) {
            addCriterion("admcode between", value1, value2, "admcode");
            return (Criteria) this;
        }

        public Criteria andAdmcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("admcode not between", value1, value2, "admcode");
            return (Criteria) this;
        }

        public Criteria andAdmnameIsNull() {
            addCriterion("admname is null");
            return (Criteria) this;
        }

        public Criteria andAdmnameIsNotNull() {
            addCriterion("admname is not null");
            return (Criteria) this;
        }

        public Criteria andAdmnameEqualTo(String value) {
            addCriterion("admname =", value, "admname");
            return (Criteria) this;
        }

        public Criteria andAdmnameNotEqualTo(String value) {
            addCriterion("admname <>", value, "admname");
            return (Criteria) this;
        }

        public Criteria andAdmnameGreaterThan(String value) {
            addCriterion("admname >", value, "admname");
            return (Criteria) this;
        }

        public Criteria andAdmnameGreaterThanOrEqualTo(String value) {
            addCriterion("admname >=", value, "admname");
            return (Criteria) this;
        }

        public Criteria andAdmnameLessThan(String value) {
            addCriterion("admname <", value, "admname");
            return (Criteria) this;
        }

        public Criteria andAdmnameLessThanOrEqualTo(String value) {
            addCriterion("admname <=", value, "admname");
            return (Criteria) this;
        }

        public Criteria andAdmnameLike(String value) {
            addCriterion("admname like", value, "admname");
            return (Criteria) this;
        }

        public Criteria andAdmnameNotLike(String value) {
            addCriterion("admname not like", value, "admname");
            return (Criteria) this;
        }

        public Criteria andAdmnameIn(List<String> values) {
            addCriterion("admname in", values, "admname");
            return (Criteria) this;
        }

        public Criteria andAdmnameNotIn(List<String> values) {
            addCriterion("admname not in", values, "admname");
            return (Criteria) this;
        }

        public Criteria andAdmnameBetween(String value1, String value2) {
            addCriterion("admname between", value1, value2, "admname");
            return (Criteria) this;
        }

        public Criteria andAdmnameNotBetween(String value1, String value2) {
            addCriterion("admname not between", value1, value2, "admname");
            return (Criteria) this;
        }

        public Criteria andAdmpasswordIsNull() {
            addCriterion("admpassword is null");
            return (Criteria) this;
        }

        public Criteria andAdmpasswordIsNotNull() {
            addCriterion("admpassword is not null");
            return (Criteria) this;
        }

        public Criteria andAdmpasswordEqualTo(String value) {
            addCriterion("admpassword =", value, "admpassword");
            return (Criteria) this;
        }

        public Criteria andAdmpasswordNotEqualTo(String value) {
            addCriterion("admpassword <>", value, "admpassword");
            return (Criteria) this;
        }

        public Criteria andAdmpasswordGreaterThan(String value) {
            addCriterion("admpassword >", value, "admpassword");
            return (Criteria) this;
        }

        public Criteria andAdmpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("admpassword >=", value, "admpassword");
            return (Criteria) this;
        }

        public Criteria andAdmpasswordLessThan(String value) {
            addCriterion("admpassword <", value, "admpassword");
            return (Criteria) this;
        }

        public Criteria andAdmpasswordLessThanOrEqualTo(String value) {
            addCriterion("admpassword <=", value, "admpassword");
            return (Criteria) this;
        }

        public Criteria andAdmpasswordLike(String value) {
            addCriterion("admpassword like", value, "admpassword");
            return (Criteria) this;
        }

        public Criteria andAdmpasswordNotLike(String value) {
            addCriterion("admpassword not like", value, "admpassword");
            return (Criteria) this;
        }

        public Criteria andAdmpasswordIn(List<String> values) {
            addCriterion("admpassword in", values, "admpassword");
            return (Criteria) this;
        }

        public Criteria andAdmpasswordNotIn(List<String> values) {
            addCriterion("admpassword not in", values, "admpassword");
            return (Criteria) this;
        }

        public Criteria andAdmpasswordBetween(String value1, String value2) {
            addCriterion("admpassword between", value1, value2, "admpassword");
            return (Criteria) this;
        }

        public Criteria andAdmpasswordNotBetween(String value1, String value2) {
            addCriterion("admpassword not between", value1, value2, "admpassword");
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

        public Criteria andAdminstateIsNull() {
            addCriterion("adminstate is null");
            return (Criteria) this;
        }

        public Criteria andAdminstateIsNotNull() {
            addCriterion("adminstate is not null");
            return (Criteria) this;
        }

        public Criteria andAdminstateEqualTo(String value) {
            addCriterion("adminstate =", value, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateNotEqualTo(String value) {
            addCriterion("adminstate <>", value, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateGreaterThan(String value) {
            addCriterion("adminstate >", value, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateGreaterThanOrEqualTo(String value) {
            addCriterion("adminstate >=", value, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateLessThan(String value) {
            addCriterion("adminstate <", value, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateLessThanOrEqualTo(String value) {
            addCriterion("adminstate <=", value, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateLike(String value) {
            addCriterion("adminstate like", value, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateNotLike(String value) {
            addCriterion("adminstate not like", value, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateIn(List<String> values) {
            addCriterion("adminstate in", values, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateNotIn(List<String> values) {
            addCriterion("adminstate not in", values, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateBetween(String value1, String value2) {
            addCriterion("adminstate between", value1, value2, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateNotBetween(String value1, String value2) {
            addCriterion("adminstate not between", value1, value2, "adminstate");
            return (Criteria) this;
        }

        public Criteria andLast_timeIsNull() {
            addCriterion("last_time is null");
            return (Criteria) this;
        }

        public Criteria andLast_timeIsNotNull() {
            addCriterion("last_time is not null");
            return (Criteria) this;
        }

        public Criteria andLast_timeEqualTo(Date value) {
            addCriterion("last_time =", value, "last_time");
            return (Criteria) this;
        }

        public Criteria andLast_timeNotEqualTo(Date value) {
            addCriterion("last_time <>", value, "last_time");
            return (Criteria) this;
        }

        public Criteria andLast_timeGreaterThan(Date value) {
            addCriterion("last_time >", value, "last_time");
            return (Criteria) this;
        }

        public Criteria andLast_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_time >=", value, "last_time");
            return (Criteria) this;
        }

        public Criteria andLast_timeLessThan(Date value) {
            addCriterion("last_time <", value, "last_time");
            return (Criteria) this;
        }

        public Criteria andLast_timeLessThanOrEqualTo(Date value) {
            addCriterion("last_time <=", value, "last_time");
            return (Criteria) this;
        }

        public Criteria andLast_timeIn(List<Date> values) {
            addCriterion("last_time in", values, "last_time");
            return (Criteria) this;
        }

        public Criteria andLast_timeNotIn(List<Date> values) {
            addCriterion("last_time not in", values, "last_time");
            return (Criteria) this;
        }

        public Criteria andLast_timeBetween(Date value1, Date value2) {
            addCriterion("last_time between", value1, value2, "last_time");
            return (Criteria) this;
        }

        public Criteria andLast_timeNotBetween(Date value1, Date value2) {
            addCriterion("last_time not between", value1, value2, "last_time");
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