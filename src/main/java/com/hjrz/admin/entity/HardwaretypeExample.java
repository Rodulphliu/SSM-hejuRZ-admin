package com.hjrz.admin.entity;

import java.util.ArrayList;
import java.util.List;

public class HardwaretypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HardwaretypeExample() {
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

        public Criteria andHardtypeCodeIsNull() {
            addCriterion("hardtypeCode is null");
            return (Criteria) this;
        }

        public Criteria andHardtypeCodeIsNotNull() {
            addCriterion("hardtypeCode is not null");
            return (Criteria) this;
        }

        public Criteria andHardtypeCodeEqualTo(Long value) {
            addCriterion("hardtypeCode =", value, "hardtypeCode");
            return (Criteria) this;
        }

        public Criteria andHardtypeCodeNotEqualTo(Long value) {
            addCriterion("hardtypeCode <>", value, "hardtypeCode");
            return (Criteria) this;
        }

        public Criteria andHardtypeCodeGreaterThan(Long value) {
            addCriterion("hardtypeCode >", value, "hardtypeCode");
            return (Criteria) this;
        }

        public Criteria andHardtypeCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("hardtypeCode >=", value, "hardtypeCode");
            return (Criteria) this;
        }

        public Criteria andHardtypeCodeLessThan(Long value) {
            addCriterion("hardtypeCode <", value, "hardtypeCode");
            return (Criteria) this;
        }

        public Criteria andHardtypeCodeLessThanOrEqualTo(Long value) {
            addCriterion("hardtypeCode <=", value, "hardtypeCode");
            return (Criteria) this;
        }

        public Criteria andHardtypeCodeIn(List<Long> values) {
            addCriterion("hardtypeCode in", values, "hardtypeCode");
            return (Criteria) this;
        }

        public Criteria andHardtypeCodeNotIn(List<Long> values) {
            addCriterion("hardtypeCode not in", values, "hardtypeCode");
            return (Criteria) this;
        }

        public Criteria andHardtypeCodeBetween(Long value1, Long value2) {
            addCriterion("hardtypeCode between", value1, value2, "hardtypeCode");
            return (Criteria) this;
        }

        public Criteria andHardtypeCodeNotBetween(Long value1, Long value2) {
            addCriterion("hardtypeCode not between", value1, value2, "hardtypeCode");
            return (Criteria) this;
        }

        public Criteria andHardtypeNameIsNull() {
            addCriterion("hardtypeName is null");
            return (Criteria) this;
        }

        public Criteria andHardtypeNameIsNotNull() {
            addCriterion("hardtypeName is not null");
            return (Criteria) this;
        }

        public Criteria andHardtypeNameEqualTo(String value) {
            addCriterion("hardtypeName =", value, "hardtypeName");
            return (Criteria) this;
        }

        public Criteria andHardtypeNameNotEqualTo(String value) {
            addCriterion("hardtypeName <>", value, "hardtypeName");
            return (Criteria) this;
        }

        public Criteria andHardtypeNameGreaterThan(String value) {
            addCriterion("hardtypeName >", value, "hardtypeName");
            return (Criteria) this;
        }

        public Criteria andHardtypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("hardtypeName >=", value, "hardtypeName");
            return (Criteria) this;
        }

        public Criteria andHardtypeNameLessThan(String value) {
            addCriterion("hardtypeName <", value, "hardtypeName");
            return (Criteria) this;
        }

        public Criteria andHardtypeNameLessThanOrEqualTo(String value) {
            addCriterion("hardtypeName <=", value, "hardtypeName");
            return (Criteria) this;
        }

        public Criteria andHardtypeNameLike(String value) {
            addCriterion("hardtypeName like", value, "hardtypeName");
            return (Criteria) this;
        }

        public Criteria andHardtypeNameNotLike(String value) {
            addCriterion("hardtypeName not like", value, "hardtypeName");
            return (Criteria) this;
        }

        public Criteria andHardtypeNameIn(List<String> values) {
            addCriterion("hardtypeName in", values, "hardtypeName");
            return (Criteria) this;
        }

        public Criteria andHardtypeNameNotIn(List<String> values) {
            addCriterion("hardtypeName not in", values, "hardtypeName");
            return (Criteria) this;
        }

        public Criteria andHardtypeNameBetween(String value1, String value2) {
            addCriterion("hardtypeName between", value1, value2, "hardtypeName");
            return (Criteria) this;
        }

        public Criteria andHardtypeNameNotBetween(String value1, String value2) {
            addCriterion("hardtypeName not between", value1, value2, "hardtypeName");
            return (Criteria) this;
        }

        public Criteria andHardtypeImgPathIsNull() {
            addCriterion("hardtypeImgPath is null");
            return (Criteria) this;
        }

        public Criteria andHardtypeImgPathIsNotNull() {
            addCriterion("hardtypeImgPath is not null");
            return (Criteria) this;
        }

        public Criteria andHardtypeImgPathEqualTo(String value) {
            addCriterion("hardtypeImgPath =", value, "hardtypeImgPath");
            return (Criteria) this;
        }

        public Criteria andHardtypeImgPathNotEqualTo(String value) {
            addCriterion("hardtypeImgPath <>", value, "hardtypeImgPath");
            return (Criteria) this;
        }

        public Criteria andHardtypeImgPathGreaterThan(String value) {
            addCriterion("hardtypeImgPath >", value, "hardtypeImgPath");
            return (Criteria) this;
        }

        public Criteria andHardtypeImgPathGreaterThanOrEqualTo(String value) {
            addCriterion("hardtypeImgPath >=", value, "hardtypeImgPath");
            return (Criteria) this;
        }

        public Criteria andHardtypeImgPathLessThan(String value) {
            addCriterion("hardtypeImgPath <", value, "hardtypeImgPath");
            return (Criteria) this;
        }

        public Criteria andHardtypeImgPathLessThanOrEqualTo(String value) {
            addCriterion("hardtypeImgPath <=", value, "hardtypeImgPath");
            return (Criteria) this;
        }

        public Criteria andHardtypeImgPathLike(String value) {
            addCriterion("hardtypeImgPath like", value, "hardtypeImgPath");
            return (Criteria) this;
        }

        public Criteria andHardtypeImgPathNotLike(String value) {
            addCriterion("hardtypeImgPath not like", value, "hardtypeImgPath");
            return (Criteria) this;
        }

        public Criteria andHardtypeImgPathIn(List<String> values) {
            addCriterion("hardtypeImgPath in", values, "hardtypeImgPath");
            return (Criteria) this;
        }

        public Criteria andHardtypeImgPathNotIn(List<String> values) {
            addCriterion("hardtypeImgPath not in", values, "hardtypeImgPath");
            return (Criteria) this;
        }

        public Criteria andHardtypeImgPathBetween(String value1, String value2) {
            addCriterion("hardtypeImgPath between", value1, value2, "hardtypeImgPath");
            return (Criteria) this;
        }

        public Criteria andHardtypeImgPathNotBetween(String value1, String value2) {
            addCriterion("hardtypeImgPath not between", value1, value2, "hardtypeImgPath");
            return (Criteria) this;
        }

        public Criteria andHardtypeIntroductionIsNull() {
            addCriterion("hardtypeIntroduction is null");
            return (Criteria) this;
        }

        public Criteria andHardtypeIntroductionIsNotNull() {
            addCriterion("hardtypeIntroduction is not null");
            return (Criteria) this;
        }

        public Criteria andHardtypeIntroductionEqualTo(String value) {
            addCriterion("hardtypeIntroduction =", value, "hardtypeIntroduction");
            return (Criteria) this;
        }

        public Criteria andHardtypeIntroductionNotEqualTo(String value) {
            addCriterion("hardtypeIntroduction <>", value, "hardtypeIntroduction");
            return (Criteria) this;
        }

        public Criteria andHardtypeIntroductionGreaterThan(String value) {
            addCriterion("hardtypeIntroduction >", value, "hardtypeIntroduction");
            return (Criteria) this;
        }

        public Criteria andHardtypeIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("hardtypeIntroduction >=", value, "hardtypeIntroduction");
            return (Criteria) this;
        }

        public Criteria andHardtypeIntroductionLessThan(String value) {
            addCriterion("hardtypeIntroduction <", value, "hardtypeIntroduction");
            return (Criteria) this;
        }

        public Criteria andHardtypeIntroductionLessThanOrEqualTo(String value) {
            addCriterion("hardtypeIntroduction <=", value, "hardtypeIntroduction");
            return (Criteria) this;
        }

        public Criteria andHardtypeIntroductionLike(String value) {
            addCriterion("hardtypeIntroduction like", value, "hardtypeIntroduction");
            return (Criteria) this;
        }

        public Criteria andHardtypeIntroductionNotLike(String value) {
            addCriterion("hardtypeIntroduction not like", value, "hardtypeIntroduction");
            return (Criteria) this;
        }

        public Criteria andHardtypeIntroductionIn(List<String> values) {
            addCriterion("hardtypeIntroduction in", values, "hardtypeIntroduction");
            return (Criteria) this;
        }

        public Criteria andHardtypeIntroductionNotIn(List<String> values) {
            addCriterion("hardtypeIntroduction not in", values, "hardtypeIntroduction");
            return (Criteria) this;
        }

        public Criteria andHardtypeIntroductionBetween(String value1, String value2) {
            addCriterion("hardtypeIntroduction between", value1, value2, "hardtypeIntroduction");
            return (Criteria) this;
        }

        public Criteria andHardtypeIntroductionNotBetween(String value1, String value2) {
            addCriterion("hardtypeIntroduction not between", value1, value2, "hardtypeIntroduction");
            return (Criteria) this;
        }

        public Criteria andHardtypestateIsNull() {
            addCriterion("hardtypestate is null");
            return (Criteria) this;
        }

        public Criteria andHardtypestateIsNotNull() {
            addCriterion("hardtypestate is not null");
            return (Criteria) this;
        }

        public Criteria andHardtypestateEqualTo(String value) {
            addCriterion("hardtypestate =", value, "hardtypestate");
            return (Criteria) this;
        }

        public Criteria andHardtypestateNotEqualTo(String value) {
            addCriterion("hardtypestate <>", value, "hardtypestate");
            return (Criteria) this;
        }

        public Criteria andHardtypestateGreaterThan(String value) {
            addCriterion("hardtypestate >", value, "hardtypestate");
            return (Criteria) this;
        }

        public Criteria andHardtypestateGreaterThanOrEqualTo(String value) {
            addCriterion("hardtypestate >=", value, "hardtypestate");
            return (Criteria) this;
        }

        public Criteria andHardtypestateLessThan(String value) {
            addCriterion("hardtypestate <", value, "hardtypestate");
            return (Criteria) this;
        }

        public Criteria andHardtypestateLessThanOrEqualTo(String value) {
            addCriterion("hardtypestate <=", value, "hardtypestate");
            return (Criteria) this;
        }

        public Criteria andHardtypestateLike(String value) {
            addCriterion("hardtypestate like", value, "hardtypestate");
            return (Criteria) this;
        }

        public Criteria andHardtypestateNotLike(String value) {
            addCriterion("hardtypestate not like", value, "hardtypestate");
            return (Criteria) this;
        }

        public Criteria andHardtypestateIn(List<String> values) {
            addCriterion("hardtypestate in", values, "hardtypestate");
            return (Criteria) this;
        }

        public Criteria andHardtypestateNotIn(List<String> values) {
            addCriterion("hardtypestate not in", values, "hardtypestate");
            return (Criteria) this;
        }

        public Criteria andHardtypestateBetween(String value1, String value2) {
            addCriterion("hardtypestate between", value1, value2, "hardtypestate");
            return (Criteria) this;
        }

        public Criteria andHardtypestateNotBetween(String value1, String value2) {
            addCriterion("hardtypestate not between", value1, value2, "hardtypestate");
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