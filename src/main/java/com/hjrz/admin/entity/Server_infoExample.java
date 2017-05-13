package com.hjrz.admin.entity;

import java.util.ArrayList;
import java.util.List;

public class Server_infoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Server_infoExample() {
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

        public Criteria andSiCodeIsNull() {
            addCriterion("siCode is null");
            return (Criteria) this;
        }

        public Criteria andSiCodeIsNotNull() {
            addCriterion("siCode is not null");
            return (Criteria) this;
        }

        public Criteria andSiCodeEqualTo(Integer value) {
            addCriterion("siCode =", value, "siCode");
            return (Criteria) this;
        }

        public Criteria andSiCodeNotEqualTo(Integer value) {
            addCriterion("siCode <>", value, "siCode");
            return (Criteria) this;
        }

        public Criteria andSiCodeGreaterThan(Integer value) {
            addCriterion("siCode >", value, "siCode");
            return (Criteria) this;
        }

        public Criteria andSiCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("siCode >=", value, "siCode");
            return (Criteria) this;
        }

        public Criteria andSiCodeLessThan(Integer value) {
            addCriterion("siCode <", value, "siCode");
            return (Criteria) this;
        }

        public Criteria andSiCodeLessThanOrEqualTo(Integer value) {
            addCriterion("siCode <=", value, "siCode");
            return (Criteria) this;
        }

        public Criteria andSiCodeIn(List<Integer> values) {
            addCriterion("siCode in", values, "siCode");
            return (Criteria) this;
        }

        public Criteria andSiCodeNotIn(List<Integer> values) {
            addCriterion("siCode not in", values, "siCode");
            return (Criteria) this;
        }

        public Criteria andSiCodeBetween(Integer value1, Integer value2) {
            addCriterion("siCode between", value1, value2, "siCode");
            return (Criteria) this;
        }

        public Criteria andSiCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("siCode not between", value1, value2, "siCode");
            return (Criteria) this;
        }

        public Criteria andServercodeIsNull() {
            addCriterion("servercode is null");
            return (Criteria) this;
        }

        public Criteria andServercodeIsNotNull() {
            addCriterion("servercode is not null");
            return (Criteria) this;
        }

        public Criteria andServercodeEqualTo(Integer value) {
            addCriterion("servercode =", value, "servercode");
            return (Criteria) this;
        }

        public Criteria andServercodeNotEqualTo(Integer value) {
            addCriterion("servercode <>", value, "servercode");
            return (Criteria) this;
        }

        public Criteria andServercodeGreaterThan(Integer value) {
            addCriterion("servercode >", value, "servercode");
            return (Criteria) this;
        }

        public Criteria andServercodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("servercode >=", value, "servercode");
            return (Criteria) this;
        }

        public Criteria andServercodeLessThan(Integer value) {
            addCriterion("servercode <", value, "servercode");
            return (Criteria) this;
        }

        public Criteria andServercodeLessThanOrEqualTo(Integer value) {
            addCriterion("servercode <=", value, "servercode");
            return (Criteria) this;
        }

        public Criteria andServercodeIn(List<Integer> values) {
            addCriterion("servercode in", values, "servercode");
            return (Criteria) this;
        }

        public Criteria andServercodeNotIn(List<Integer> values) {
            addCriterion("servercode not in", values, "servercode");
            return (Criteria) this;
        }

        public Criteria andServercodeBetween(Integer value1, Integer value2) {
            addCriterion("servercode between", value1, value2, "servercode");
            return (Criteria) this;
        }

        public Criteria andServercodeNotBetween(Integer value1, Integer value2) {
            addCriterion("servercode not between", value1, value2, "servercode");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNull() {
            addCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(String value) {
            addCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(String value) {
            addCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(String value) {
            addCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(String value) {
            addCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(String value) {
            addCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLike(String value) {
            addCriterion("platform like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotLike(String value) {
            addCriterion("platform not like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<String> values) {
            addCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<String> values) {
            addCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(String value1, String value2) {
            addCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(String value1, String value2) {
            addCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andCPUnumberIsNull() {
            addCriterion("CPUnumber is null");
            return (Criteria) this;
        }

        public Criteria andCPUnumberIsNotNull() {
            addCriterion("CPUnumber is not null");
            return (Criteria) this;
        }

        public Criteria andCPUnumberEqualTo(String value) {
            addCriterion("CPUnumber =", value, "CPUnumber");
            return (Criteria) this;
        }

        public Criteria andCPUnumberNotEqualTo(String value) {
            addCriterion("CPUnumber <>", value, "CPUnumber");
            return (Criteria) this;
        }

        public Criteria andCPUnumberGreaterThan(String value) {
            addCriterion("CPUnumber >", value, "CPUnumber");
            return (Criteria) this;
        }

        public Criteria andCPUnumberGreaterThanOrEqualTo(String value) {
            addCriterion("CPUnumber >=", value, "CPUnumber");
            return (Criteria) this;
        }

        public Criteria andCPUnumberLessThan(String value) {
            addCriterion("CPUnumber <", value, "CPUnumber");
            return (Criteria) this;
        }

        public Criteria andCPUnumberLessThanOrEqualTo(String value) {
            addCriterion("CPUnumber <=", value, "CPUnumber");
            return (Criteria) this;
        }

        public Criteria andCPUnumberLike(String value) {
            addCriterion("CPUnumber like", value, "CPUnumber");
            return (Criteria) this;
        }

        public Criteria andCPUnumberNotLike(String value) {
            addCriterion("CPUnumber not like", value, "CPUnumber");
            return (Criteria) this;
        }

        public Criteria andCPUnumberIn(List<String> values) {
            addCriterion("CPUnumber in", values, "CPUnumber");
            return (Criteria) this;
        }

        public Criteria andCPUnumberNotIn(List<String> values) {
            addCriterion("CPUnumber not in", values, "CPUnumber");
            return (Criteria) this;
        }

        public Criteria andCPUnumberBetween(String value1, String value2) {
            addCriterion("CPUnumber between", value1, value2, "CPUnumber");
            return (Criteria) this;
        }

        public Criteria andCPUnumberNotBetween(String value1, String value2) {
            addCriterion("CPUnumber not between", value1, value2, "CPUnumber");
            return (Criteria) this;
        }

        public Criteria andMaxRAMIsNull() {
            addCriterion("maxRAM is null");
            return (Criteria) this;
        }

        public Criteria andMaxRAMIsNotNull() {
            addCriterion("maxRAM is not null");
            return (Criteria) this;
        }

        public Criteria andMaxRAMEqualTo(String value) {
            addCriterion("maxRAM =", value, "maxRAM");
            return (Criteria) this;
        }

        public Criteria andMaxRAMNotEqualTo(String value) {
            addCriterion("maxRAM <>", value, "maxRAM");
            return (Criteria) this;
        }

        public Criteria andMaxRAMGreaterThan(String value) {
            addCriterion("maxRAM >", value, "maxRAM");
            return (Criteria) this;
        }

        public Criteria andMaxRAMGreaterThanOrEqualTo(String value) {
            addCriterion("maxRAM >=", value, "maxRAM");
            return (Criteria) this;
        }

        public Criteria andMaxRAMLessThan(String value) {
            addCriterion("maxRAM <", value, "maxRAM");
            return (Criteria) this;
        }

        public Criteria andMaxRAMLessThanOrEqualTo(String value) {
            addCriterion("maxRAM <=", value, "maxRAM");
            return (Criteria) this;
        }

        public Criteria andMaxRAMLike(String value) {
            addCriterion("maxRAM like", value, "maxRAM");
            return (Criteria) this;
        }

        public Criteria andMaxRAMNotLike(String value) {
            addCriterion("maxRAM not like", value, "maxRAM");
            return (Criteria) this;
        }

        public Criteria andMaxRAMIn(List<String> values) {
            addCriterion("maxRAM in", values, "maxRAM");
            return (Criteria) this;
        }

        public Criteria andMaxRAMNotIn(List<String> values) {
            addCriterion("maxRAM not in", values, "maxRAM");
            return (Criteria) this;
        }

        public Criteria andMaxRAMBetween(String value1, String value2) {
            addCriterion("maxRAM between", value1, value2, "maxRAM");
            return (Criteria) this;
        }

        public Criteria andMaxRAMNotBetween(String value1, String value2) {
            addCriterion("maxRAM not between", value1, value2, "maxRAM");
            return (Criteria) this;
        }

        public Criteria andHDattrIsNull() {
            addCriterion("HDattr is null");
            return (Criteria) this;
        }

        public Criteria andHDattrIsNotNull() {
            addCriterion("HDattr is not null");
            return (Criteria) this;
        }

        public Criteria andHDattrEqualTo(String value) {
            addCriterion("HDattr =", value, "HDattr");
            return (Criteria) this;
        }

        public Criteria andHDattrNotEqualTo(String value) {
            addCriterion("HDattr <>", value, "HDattr");
            return (Criteria) this;
        }

        public Criteria andHDattrGreaterThan(String value) {
            addCriterion("HDattr >", value, "HDattr");
            return (Criteria) this;
        }

        public Criteria andHDattrGreaterThanOrEqualTo(String value) {
            addCriterion("HDattr >=", value, "HDattr");
            return (Criteria) this;
        }

        public Criteria andHDattrLessThan(String value) {
            addCriterion("HDattr <", value, "HDattr");
            return (Criteria) this;
        }

        public Criteria andHDattrLessThanOrEqualTo(String value) {
            addCriterion("HDattr <=", value, "HDattr");
            return (Criteria) this;
        }

        public Criteria andHDattrLike(String value) {
            addCriterion("HDattr like", value, "HDattr");
            return (Criteria) this;
        }

        public Criteria andHDattrNotLike(String value) {
            addCriterion("HDattr not like", value, "HDattr");
            return (Criteria) this;
        }

        public Criteria andHDattrIn(List<String> values) {
            addCriterion("HDattr in", values, "HDattr");
            return (Criteria) this;
        }

        public Criteria andHDattrNotIn(List<String> values) {
            addCriterion("HDattr not in", values, "HDattr");
            return (Criteria) this;
        }

        public Criteria andHDattrBetween(String value1, String value2) {
            addCriterion("HDattr between", value1, value2, "HDattr");
            return (Criteria) this;
        }

        public Criteria andHDattrNotBetween(String value1, String value2) {
            addCriterion("HDattr not between", value1, value2, "HDattr");
            return (Criteria) this;
        }

        public Criteria andHDplaceIsNull() {
            addCriterion("HDplace is null");
            return (Criteria) this;
        }

        public Criteria andHDplaceIsNotNull() {
            addCriterion("HDplace is not null");
            return (Criteria) this;
        }

        public Criteria andHDplaceEqualTo(String value) {
            addCriterion("HDplace =", value, "HDplace");
            return (Criteria) this;
        }

        public Criteria andHDplaceNotEqualTo(String value) {
            addCriterion("HDplace <>", value, "HDplace");
            return (Criteria) this;
        }

        public Criteria andHDplaceGreaterThan(String value) {
            addCriterion("HDplace >", value, "HDplace");
            return (Criteria) this;
        }

        public Criteria andHDplaceGreaterThanOrEqualTo(String value) {
            addCriterion("HDplace >=", value, "HDplace");
            return (Criteria) this;
        }

        public Criteria andHDplaceLessThan(String value) {
            addCriterion("HDplace <", value, "HDplace");
            return (Criteria) this;
        }

        public Criteria andHDplaceLessThanOrEqualTo(String value) {
            addCriterion("HDplace <=", value, "HDplace");
            return (Criteria) this;
        }

        public Criteria andHDplaceLike(String value) {
            addCriterion("HDplace like", value, "HDplace");
            return (Criteria) this;
        }

        public Criteria andHDplaceNotLike(String value) {
            addCriterion("HDplace not like", value, "HDplace");
            return (Criteria) this;
        }

        public Criteria andHDplaceIn(List<String> values) {
            addCriterion("HDplace in", values, "HDplace");
            return (Criteria) this;
        }

        public Criteria andHDplaceNotIn(List<String> values) {
            addCriterion("HDplace not in", values, "HDplace");
            return (Criteria) this;
        }

        public Criteria andHDplaceBetween(String value1, String value2) {
            addCriterion("HDplace between", value1, value2, "HDplace");
            return (Criteria) this;
        }

        public Criteria andHDplaceNotBetween(String value1, String value2) {
            addCriterion("HDplace not between", value1, value2, "HDplace");
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