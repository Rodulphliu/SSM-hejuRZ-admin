package com.hjrz.admin.entity;

import java.util.ArrayList;
import java.util.List;

public class BrandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandExample() {
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

        public Criteria andBrandCodeIsNull() {
            addCriterion("brandCode is null");
            return (Criteria) this;
        }

        public Criteria andBrandCodeIsNotNull() {
            addCriterion("brandCode is not null");
            return (Criteria) this;
        }

        public Criteria andBrandCodeEqualTo(Long value) {
            addCriterion("brandCode =", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeNotEqualTo(Long value) {
            addCriterion("brandCode <>", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeGreaterThan(Long value) {
            addCriterion("brandCode >", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("brandCode >=", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeLessThan(Long value) {
            addCriterion("brandCode <", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeLessThanOrEqualTo(Long value) {
            addCriterion("brandCode <=", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeIn(List<Long> values) {
            addCriterion("brandCode in", values, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeNotIn(List<Long> values) {
            addCriterion("brandCode not in", values, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeBetween(Long value1, Long value2) {
            addCriterion("brandCode between", value1, value2, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeNotBetween(Long value1, Long value2) {
            addCriterion("brandCode not between", value1, value2, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNull() {
            addCriterion("brandName is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("brandName is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("brandName =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("brandName <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("brandName >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("brandName >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("brandName <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("brandName <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("brandName like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("brandName not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("brandName in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("brandName not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("brandName between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("brandName not between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandImgPathIsNull() {
            addCriterion("brandImgPath is null");
            return (Criteria) this;
        }

        public Criteria andBrandImgPathIsNotNull() {
            addCriterion("brandImgPath is not null");
            return (Criteria) this;
        }

        public Criteria andBrandImgPathEqualTo(String value) {
            addCriterion("brandImgPath =", value, "brandImgPath");
            return (Criteria) this;
        }

        public Criteria andBrandImgPathNotEqualTo(String value) {
            addCriterion("brandImgPath <>", value, "brandImgPath");
            return (Criteria) this;
        }

        public Criteria andBrandImgPathGreaterThan(String value) {
            addCriterion("brandImgPath >", value, "brandImgPath");
            return (Criteria) this;
        }

        public Criteria andBrandImgPathGreaterThanOrEqualTo(String value) {
            addCriterion("brandImgPath >=", value, "brandImgPath");
            return (Criteria) this;
        }

        public Criteria andBrandImgPathLessThan(String value) {
            addCriterion("brandImgPath <", value, "brandImgPath");
            return (Criteria) this;
        }

        public Criteria andBrandImgPathLessThanOrEqualTo(String value) {
            addCriterion("brandImgPath <=", value, "brandImgPath");
            return (Criteria) this;
        }

        public Criteria andBrandImgPathLike(String value) {
            addCriterion("brandImgPath like", value, "brandImgPath");
            return (Criteria) this;
        }

        public Criteria andBrandImgPathNotLike(String value) {
            addCriterion("brandImgPath not like", value, "brandImgPath");
            return (Criteria) this;
        }

        public Criteria andBrandImgPathIn(List<String> values) {
            addCriterion("brandImgPath in", values, "brandImgPath");
            return (Criteria) this;
        }

        public Criteria andBrandImgPathNotIn(List<String> values) {
            addCriterion("brandImgPath not in", values, "brandImgPath");
            return (Criteria) this;
        }

        public Criteria andBrandImgPathBetween(String value1, String value2) {
            addCriterion("brandImgPath between", value1, value2, "brandImgPath");
            return (Criteria) this;
        }

        public Criteria andBrandImgPathNotBetween(String value1, String value2) {
            addCriterion("brandImgPath not between", value1, value2, "brandImgPath");
            return (Criteria) this;
        }

        public Criteria andBrandIntroductionIsNull() {
            addCriterion("brandIntroduction is null");
            return (Criteria) this;
        }

        public Criteria andBrandIntroductionIsNotNull() {
            addCriterion("brandIntroduction is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIntroductionEqualTo(String value) {
            addCriterion("brandIntroduction =", value, "brandIntroduction");
            return (Criteria) this;
        }

        public Criteria andBrandIntroductionNotEqualTo(String value) {
            addCriterion("brandIntroduction <>", value, "brandIntroduction");
            return (Criteria) this;
        }

        public Criteria andBrandIntroductionGreaterThan(String value) {
            addCriterion("brandIntroduction >", value, "brandIntroduction");
            return (Criteria) this;
        }

        public Criteria andBrandIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("brandIntroduction >=", value, "brandIntroduction");
            return (Criteria) this;
        }

        public Criteria andBrandIntroductionLessThan(String value) {
            addCriterion("brandIntroduction <", value, "brandIntroduction");
            return (Criteria) this;
        }

        public Criteria andBrandIntroductionLessThanOrEqualTo(String value) {
            addCriterion("brandIntroduction <=", value, "brandIntroduction");
            return (Criteria) this;
        }

        public Criteria andBrandIntroductionLike(String value) {
            addCriterion("brandIntroduction like", value, "brandIntroduction");
            return (Criteria) this;
        }

        public Criteria andBrandIntroductionNotLike(String value) {
            addCriterion("brandIntroduction not like", value, "brandIntroduction");
            return (Criteria) this;
        }

        public Criteria andBrandIntroductionIn(List<String> values) {
            addCriterion("brandIntroduction in", values, "brandIntroduction");
            return (Criteria) this;
        }

        public Criteria andBrandIntroductionNotIn(List<String> values) {
            addCriterion("brandIntroduction not in", values, "brandIntroduction");
            return (Criteria) this;
        }

        public Criteria andBrandIntroductionBetween(String value1, String value2) {
            addCriterion("brandIntroduction between", value1, value2, "brandIntroduction");
            return (Criteria) this;
        }

        public Criteria andBrandIntroductionNotBetween(String value1, String value2) {
            addCriterion("brandIntroduction not between", value1, value2, "brandIntroduction");
            return (Criteria) this;
        }

        public Criteria andBrandstateIsNull() {
            addCriterion("brandstate is null");
            return (Criteria) this;
        }

        public Criteria andBrandstateIsNotNull() {
            addCriterion("brandstate is not null");
            return (Criteria) this;
        }

        public Criteria andBrandstateEqualTo(String value) {
            addCriterion("brandstate =", value, "brandstate");
            return (Criteria) this;
        }

        public Criteria andBrandstateNotEqualTo(String value) {
            addCriterion("brandstate <>", value, "brandstate");
            return (Criteria) this;
        }

        public Criteria andBrandstateGreaterThan(String value) {
            addCriterion("brandstate >", value, "brandstate");
            return (Criteria) this;
        }

        public Criteria andBrandstateGreaterThanOrEqualTo(String value) {
            addCriterion("brandstate >=", value, "brandstate");
            return (Criteria) this;
        }

        public Criteria andBrandstateLessThan(String value) {
            addCriterion("brandstate <", value, "brandstate");
            return (Criteria) this;
        }

        public Criteria andBrandstateLessThanOrEqualTo(String value) {
            addCriterion("brandstate <=", value, "brandstate");
            return (Criteria) this;
        }

        public Criteria andBrandstateLike(String value) {
            addCriterion("brandstate like", value, "brandstate");
            return (Criteria) this;
        }

        public Criteria andBrandstateNotLike(String value) {
            addCriterion("brandstate not like", value, "brandstate");
            return (Criteria) this;
        }

        public Criteria andBrandstateIn(List<String> values) {
            addCriterion("brandstate in", values, "brandstate");
            return (Criteria) this;
        }

        public Criteria andBrandstateNotIn(List<String> values) {
            addCriterion("brandstate not in", values, "brandstate");
            return (Criteria) this;
        }

        public Criteria andBrandstateBetween(String value1, String value2) {
            addCriterion("brandstate between", value1, value2, "brandstate");
            return (Criteria) this;
        }

        public Criteria andBrandstateNotBetween(String value1, String value2) {
            addCriterion("brandstate not between", value1, value2, "brandstate");
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