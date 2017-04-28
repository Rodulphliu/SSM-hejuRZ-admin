package com.hjrz.admin.entity;

import java.util.ArrayList;
import java.util.List;

public class Admin_infoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Admin_infoExample() {
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

        public Criteria andAdminfocodeIsNull() {
            addCriterion("adminfocode is null");
            return (Criteria) this;
        }

        public Criteria andAdminfocodeIsNotNull() {
            addCriterion("adminfocode is not null");
            return (Criteria) this;
        }

        public Criteria andAdminfocodeEqualTo(Integer value) {
            addCriterion("adminfocode =", value, "adminfocode");
            return (Criteria) this;
        }

        public Criteria andAdminfocodeNotEqualTo(Integer value) {
            addCriterion("adminfocode <>", value, "adminfocode");
            return (Criteria) this;
        }

        public Criteria andAdminfocodeGreaterThan(Integer value) {
            addCriterion("adminfocode >", value, "adminfocode");
            return (Criteria) this;
        }

        public Criteria andAdminfocodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("adminfocode >=", value, "adminfocode");
            return (Criteria) this;
        }

        public Criteria andAdminfocodeLessThan(Integer value) {
            addCriterion("adminfocode <", value, "adminfocode");
            return (Criteria) this;
        }

        public Criteria andAdminfocodeLessThanOrEqualTo(Integer value) {
            addCriterion("adminfocode <=", value, "adminfocode");
            return (Criteria) this;
        }

        public Criteria andAdminfocodeIn(List<Integer> values) {
            addCriterion("adminfocode in", values, "adminfocode");
            return (Criteria) this;
        }

        public Criteria andAdminfocodeNotIn(List<Integer> values) {
            addCriterion("adminfocode not in", values, "adminfocode");
            return (Criteria) this;
        }

        public Criteria andAdminfocodeBetween(Integer value1, Integer value2) {
            addCriterion("adminfocode between", value1, value2, "adminfocode");
            return (Criteria) this;
        }

        public Criteria andAdminfocodeNotBetween(Integer value1, Integer value2) {
            addCriterion("adminfocode not between", value1, value2, "adminfocode");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realname =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realname >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realname <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realname like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realname not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realname in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andAdmsexIsNull() {
            addCriterion("admsex is null");
            return (Criteria) this;
        }

        public Criteria andAdmsexIsNotNull() {
            addCriterion("admsex is not null");
            return (Criteria) this;
        }

        public Criteria andAdmsexEqualTo(String value) {
            addCriterion("admsex =", value, "admsex");
            return (Criteria) this;
        }

        public Criteria andAdmsexNotEqualTo(String value) {
            addCriterion("admsex <>", value, "admsex");
            return (Criteria) this;
        }

        public Criteria andAdmsexGreaterThan(String value) {
            addCriterion("admsex >", value, "admsex");
            return (Criteria) this;
        }

        public Criteria andAdmsexGreaterThanOrEqualTo(String value) {
            addCriterion("admsex >=", value, "admsex");
            return (Criteria) this;
        }

        public Criteria andAdmsexLessThan(String value) {
            addCriterion("admsex <", value, "admsex");
            return (Criteria) this;
        }

        public Criteria andAdmsexLessThanOrEqualTo(String value) {
            addCriterion("admsex <=", value, "admsex");
            return (Criteria) this;
        }

        public Criteria andAdmsexLike(String value) {
            addCriterion("admsex like", value, "admsex");
            return (Criteria) this;
        }

        public Criteria andAdmsexNotLike(String value) {
            addCriterion("admsex not like", value, "admsex");
            return (Criteria) this;
        }

        public Criteria andAdmsexIn(List<String> values) {
            addCriterion("admsex in", values, "admsex");
            return (Criteria) this;
        }

        public Criteria andAdmsexNotIn(List<String> values) {
            addCriterion("admsex not in", values, "admsex");
            return (Criteria) this;
        }

        public Criteria andAdmsexBetween(String value1, String value2) {
            addCriterion("admsex between", value1, value2, "admsex");
            return (Criteria) this;
        }

        public Criteria andAdmsexNotBetween(String value1, String value2) {
            addCriterion("admsex not between", value1, value2, "admsex");
            return (Criteria) this;
        }

        public Criteria andAdmphoneIsNull() {
            addCriterion("admphone is null");
            return (Criteria) this;
        }

        public Criteria andAdmphoneIsNotNull() {
            addCriterion("admphone is not null");
            return (Criteria) this;
        }

        public Criteria andAdmphoneEqualTo(String value) {
            addCriterion("admphone =", value, "admphone");
            return (Criteria) this;
        }

        public Criteria andAdmphoneNotEqualTo(String value) {
            addCriterion("admphone <>", value, "admphone");
            return (Criteria) this;
        }

        public Criteria andAdmphoneGreaterThan(String value) {
            addCriterion("admphone >", value, "admphone");
            return (Criteria) this;
        }

        public Criteria andAdmphoneGreaterThanOrEqualTo(String value) {
            addCriterion("admphone >=", value, "admphone");
            return (Criteria) this;
        }

        public Criteria andAdmphoneLessThan(String value) {
            addCriterion("admphone <", value, "admphone");
            return (Criteria) this;
        }

        public Criteria andAdmphoneLessThanOrEqualTo(String value) {
            addCriterion("admphone <=", value, "admphone");
            return (Criteria) this;
        }

        public Criteria andAdmphoneLike(String value) {
            addCriterion("admphone like", value, "admphone");
            return (Criteria) this;
        }

        public Criteria andAdmphoneNotLike(String value) {
            addCriterion("admphone not like", value, "admphone");
            return (Criteria) this;
        }

        public Criteria andAdmphoneIn(List<String> values) {
            addCriterion("admphone in", values, "admphone");
            return (Criteria) this;
        }

        public Criteria andAdmphoneNotIn(List<String> values) {
            addCriterion("admphone not in", values, "admphone");
            return (Criteria) this;
        }

        public Criteria andAdmphoneBetween(String value1, String value2) {
            addCriterion("admphone between", value1, value2, "admphone");
            return (Criteria) this;
        }

        public Criteria andAdmphoneNotBetween(String value1, String value2) {
            addCriterion("admphone not between", value1, value2, "admphone");
            return (Criteria) this;
        }

        public Criteria andAdmDutyIsNull() {
            addCriterion("admDuty is null");
            return (Criteria) this;
        }

        public Criteria andAdmDutyIsNotNull() {
            addCriterion("admDuty is not null");
            return (Criteria) this;
        }

        public Criteria andAdmDutyEqualTo(String value) {
            addCriterion("admDuty =", value, "admDuty");
            return (Criteria) this;
        }

        public Criteria andAdmDutyNotEqualTo(String value) {
            addCriterion("admDuty <>", value, "admDuty");
            return (Criteria) this;
        }

        public Criteria andAdmDutyGreaterThan(String value) {
            addCriterion("admDuty >", value, "admDuty");
            return (Criteria) this;
        }

        public Criteria andAdmDutyGreaterThanOrEqualTo(String value) {
            addCriterion("admDuty >=", value, "admDuty");
            return (Criteria) this;
        }

        public Criteria andAdmDutyLessThan(String value) {
            addCriterion("admDuty <", value, "admDuty");
            return (Criteria) this;
        }

        public Criteria andAdmDutyLessThanOrEqualTo(String value) {
            addCriterion("admDuty <=", value, "admDuty");
            return (Criteria) this;
        }

        public Criteria andAdmDutyLike(String value) {
            addCriterion("admDuty like", value, "admDuty");
            return (Criteria) this;
        }

        public Criteria andAdmDutyNotLike(String value) {
            addCriterion("admDuty not like", value, "admDuty");
            return (Criteria) this;
        }

        public Criteria andAdmDutyIn(List<String> values) {
            addCriterion("admDuty in", values, "admDuty");
            return (Criteria) this;
        }

        public Criteria andAdmDutyNotIn(List<String> values) {
            addCriterion("admDuty not in", values, "admDuty");
            return (Criteria) this;
        }

        public Criteria andAdmDutyBetween(String value1, String value2) {
            addCriterion("admDuty between", value1, value2, "admDuty");
            return (Criteria) this;
        }

        public Criteria andAdmDutyNotBetween(String value1, String value2) {
            addCriterion("admDuty not between", value1, value2, "admDuty");
            return (Criteria) this;
        }

        public Criteria andHeadpathIsNull() {
            addCriterion("headpath is null");
            return (Criteria) this;
        }

        public Criteria andHeadpathIsNotNull() {
            addCriterion("headpath is not null");
            return (Criteria) this;
        }

        public Criteria andHeadpathEqualTo(String value) {
            addCriterion("headpath =", value, "headpath");
            return (Criteria) this;
        }

        public Criteria andHeadpathNotEqualTo(String value) {
            addCriterion("headpath <>", value, "headpath");
            return (Criteria) this;
        }

        public Criteria andHeadpathGreaterThan(String value) {
            addCriterion("headpath >", value, "headpath");
            return (Criteria) this;
        }

        public Criteria andHeadpathGreaterThanOrEqualTo(String value) {
            addCriterion("headpath >=", value, "headpath");
            return (Criteria) this;
        }

        public Criteria andHeadpathLessThan(String value) {
            addCriterion("headpath <", value, "headpath");
            return (Criteria) this;
        }

        public Criteria andHeadpathLessThanOrEqualTo(String value) {
            addCriterion("headpath <=", value, "headpath");
            return (Criteria) this;
        }

        public Criteria andHeadpathLike(String value) {
            addCriterion("headpath like", value, "headpath");
            return (Criteria) this;
        }

        public Criteria andHeadpathNotLike(String value) {
            addCriterion("headpath not like", value, "headpath");
            return (Criteria) this;
        }

        public Criteria andHeadpathIn(List<String> values) {
            addCriterion("headpath in", values, "headpath");
            return (Criteria) this;
        }

        public Criteria andHeadpathNotIn(List<String> values) {
            addCriterion("headpath not in", values, "headpath");
            return (Criteria) this;
        }

        public Criteria andHeadpathBetween(String value1, String value2) {
            addCriterion("headpath between", value1, value2, "headpath");
            return (Criteria) this;
        }

        public Criteria andHeadpathNotBetween(String value1, String value2) {
            addCriterion("headpath not between", value1, value2, "headpath");
            return (Criteria) this;
        }

        public Criteria andAdmemailIsNull() {
            addCriterion("admemail is null");
            return (Criteria) this;
        }

        public Criteria andAdmemailIsNotNull() {
            addCriterion("admemail is not null");
            return (Criteria) this;
        }

        public Criteria andAdmemailEqualTo(String value) {
            addCriterion("admemail =", value, "admemail");
            return (Criteria) this;
        }

        public Criteria andAdmemailNotEqualTo(String value) {
            addCriterion("admemail <>", value, "admemail");
            return (Criteria) this;
        }

        public Criteria andAdmemailGreaterThan(String value) {
            addCriterion("admemail >", value, "admemail");
            return (Criteria) this;
        }

        public Criteria andAdmemailGreaterThanOrEqualTo(String value) {
            addCriterion("admemail >=", value, "admemail");
            return (Criteria) this;
        }

        public Criteria andAdmemailLessThan(String value) {
            addCriterion("admemail <", value, "admemail");
            return (Criteria) this;
        }

        public Criteria andAdmemailLessThanOrEqualTo(String value) {
            addCriterion("admemail <=", value, "admemail");
            return (Criteria) this;
        }

        public Criteria andAdmemailLike(String value) {
            addCriterion("admemail like", value, "admemail");
            return (Criteria) this;
        }

        public Criteria andAdmemailNotLike(String value) {
            addCriterion("admemail not like", value, "admemail");
            return (Criteria) this;
        }

        public Criteria andAdmemailIn(List<String> values) {
            addCriterion("admemail in", values, "admemail");
            return (Criteria) this;
        }

        public Criteria andAdmemailNotIn(List<String> values) {
            addCriterion("admemail not in", values, "admemail");
            return (Criteria) this;
        }

        public Criteria andAdmemailBetween(String value1, String value2) {
            addCriterion("admemail between", value1, value2, "admemail");
            return (Criteria) this;
        }

        public Criteria andAdmemailNotBetween(String value1, String value2) {
            addCriterion("admemail not between", value1, value2, "admemail");
            return (Criteria) this;
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