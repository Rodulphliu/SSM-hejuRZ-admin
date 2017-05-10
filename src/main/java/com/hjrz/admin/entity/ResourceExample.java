package com.hjrz.admin.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResourceExample() {
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

        public Criteria andResourceCodeIsNull() {
            addCriterion("resourceCode is null");
            return (Criteria) this;
        }

        public Criteria andResourceCodeIsNotNull() {
            addCriterion("resourceCode is not null");
            return (Criteria) this;
        }

        public Criteria andResourceCodeEqualTo(Integer value) {
            addCriterion("resourceCode =", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeNotEqualTo(Integer value) {
            addCriterion("resourceCode <>", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeGreaterThan(Integer value) {
            addCriterion("resourceCode >", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("resourceCode >=", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeLessThan(Integer value) {
            addCriterion("resourceCode <", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeLessThanOrEqualTo(Integer value) {
            addCriterion("resourceCode <=", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeIn(List<Integer> values) {
            addCriterion("resourceCode in", values, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeNotIn(List<Integer> values) {
            addCriterion("resourceCode not in", values, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeBetween(Integer value1, Integer value2) {
            addCriterion("resourceCode between", value1, value2, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("resourceCode not between", value1, value2, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceNameIsNull() {
            addCriterion("resourceName is null");
            return (Criteria) this;
        }

        public Criteria andResourceNameIsNotNull() {
            addCriterion("resourceName is not null");
            return (Criteria) this;
        }

        public Criteria andResourceNameEqualTo(String value) {
            addCriterion("resourceName =", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameNotEqualTo(String value) {
            addCriterion("resourceName <>", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameGreaterThan(String value) {
            addCriterion("resourceName >", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameGreaterThanOrEqualTo(String value) {
            addCriterion("resourceName >=", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameLessThan(String value) {
            addCriterion("resourceName <", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameLessThanOrEqualTo(String value) {
            addCriterion("resourceName <=", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameLike(String value) {
            addCriterion("resourceName like", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameNotLike(String value) {
            addCriterion("resourceName not like", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameIn(List<String> values) {
            addCriterion("resourceName in", values, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameNotIn(List<String> values) {
            addCriterion("resourceName not in", values, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameBetween(String value1, String value2) {
            addCriterion("resourceName between", value1, value2, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameNotBetween(String value1, String value2) {
            addCriterion("resourceName not between", value1, value2, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceURLIsNull() {
            addCriterion("resourceURL is null");
            return (Criteria) this;
        }

        public Criteria andResourceURLIsNotNull() {
            addCriterion("resourceURL is not null");
            return (Criteria) this;
        }

        public Criteria andResourceURLEqualTo(String value) {
            addCriterion("resourceURL =", value, "resourceURL");
            return (Criteria) this;
        }

        public Criteria andResourceURLNotEqualTo(String value) {
            addCriterion("resourceURL <>", value, "resourceURL");
            return (Criteria) this;
        }

        public Criteria andResourceURLGreaterThan(String value) {
            addCriterion("resourceURL >", value, "resourceURL");
            return (Criteria) this;
        }

        public Criteria andResourceURLGreaterThanOrEqualTo(String value) {
            addCriterion("resourceURL >=", value, "resourceURL");
            return (Criteria) this;
        }

        public Criteria andResourceURLLessThan(String value) {
            addCriterion("resourceURL <", value, "resourceURL");
            return (Criteria) this;
        }

        public Criteria andResourceURLLessThanOrEqualTo(String value) {
            addCriterion("resourceURL <=", value, "resourceURL");
            return (Criteria) this;
        }

        public Criteria andResourceURLLike(String value) {
            addCriterion("resourceURL like", value, "resourceURL");
            return (Criteria) this;
        }

        public Criteria andResourceURLNotLike(String value) {
            addCriterion("resourceURL not like", value, "resourceURL");
            return (Criteria) this;
        }

        public Criteria andResourceURLIn(List<String> values) {
            addCriterion("resourceURL in", values, "resourceURL");
            return (Criteria) this;
        }

        public Criteria andResourceURLNotIn(List<String> values) {
            addCriterion("resourceURL not in", values, "resourceURL");
            return (Criteria) this;
        }

        public Criteria andResourceURLBetween(String value1, String value2) {
            addCriterion("resourceURL between", value1, value2, "resourceURL");
            return (Criteria) this;
        }

        public Criteria andResourceURLNotBetween(String value1, String value2) {
            addCriterion("resourceURL not between", value1, value2, "resourceURL");
            return (Criteria) this;
        }

        public Criteria andParentIDIsNull() {
            addCriterion("ParentID is null");
            return (Criteria) this;
        }

        public Criteria andParentIDIsNotNull() {
            addCriterion("ParentID is not null");
            return (Criteria) this;
        }

        public Criteria andParentIDEqualTo(Integer value) {
            addCriterion("ParentID =", value, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDNotEqualTo(Integer value) {
            addCriterion("ParentID <>", value, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDGreaterThan(Integer value) {
            addCriterion("ParentID >", value, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("ParentID >=", value, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDLessThan(Integer value) {
            addCriterion("ParentID <", value, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDLessThanOrEqualTo(Integer value) {
            addCriterion("ParentID <=", value, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDIn(List<Integer> values) {
            addCriterion("ParentID in", values, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDNotIn(List<Integer> values) {
            addCriterion("ParentID not in", values, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDBetween(Integer value1, Integer value2) {
            addCriterion("ParentID between", value1, value2, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDNotBetween(Integer value1, Integer value2) {
            addCriterion("ParentID not between", value1, value2, "parentID");
            return (Criteria) this;
        }

        public Criteria andResourceDESIsNull() {
            addCriterion("resourceDES is null");
            return (Criteria) this;
        }

        public Criteria andResourceDESIsNotNull() {
            addCriterion("resourceDES is not null");
            return (Criteria) this;
        }

        public Criteria andResourceDESEqualTo(String value) {
            addCriterion("resourceDES =", value, "resourceDES");
            return (Criteria) this;
        }

        public Criteria andResourceDESNotEqualTo(String value) {
            addCriterion("resourceDES <>", value, "resourceDES");
            return (Criteria) this;
        }

        public Criteria andResourceDESGreaterThan(String value) {
            addCriterion("resourceDES >", value, "resourceDES");
            return (Criteria) this;
        }

        public Criteria andResourceDESGreaterThanOrEqualTo(String value) {
            addCriterion("resourceDES >=", value, "resourceDES");
            return (Criteria) this;
        }

        public Criteria andResourceDESLessThan(String value) {
            addCriterion("resourceDES <", value, "resourceDES");
            return (Criteria) this;
        }

        public Criteria andResourceDESLessThanOrEqualTo(String value) {
            addCriterion("resourceDES <=", value, "resourceDES");
            return (Criteria) this;
        }

        public Criteria andResourceDESLike(String value) {
            addCriterion("resourceDES like", value, "resourceDES");
            return (Criteria) this;
        }

        public Criteria andResourceDESNotLike(String value) {
            addCriterion("resourceDES not like", value, "resourceDES");
            return (Criteria) this;
        }

        public Criteria andResourceDESIn(List<String> values) {
            addCriterion("resourceDES in", values, "resourceDES");
            return (Criteria) this;
        }

        public Criteria andResourceDESNotIn(List<String> values) {
            addCriterion("resourceDES not in", values, "resourceDES");
            return (Criteria) this;
        }

        public Criteria andResourceDESBetween(String value1, String value2) {
            addCriterion("resourceDES between", value1, value2, "resourceDES");
            return (Criteria) this;
        }

        public Criteria andResourceDESNotBetween(String value1, String value2) {
            addCriterion("resourceDES not between", value1, value2, "resourceDES");
            return (Criteria) this;
        }

        public Criteria andResourceLVIsNull() {
            addCriterion("resourceLV is null");
            return (Criteria) this;
        }

        public Criteria andResourceLVIsNotNull() {
            addCriterion("resourceLV is not null");
            return (Criteria) this;
        }

        public Criteria andResourceLVEqualTo(String value) {
            addCriterion("resourceLV =", value, "resourceLV");
            return (Criteria) this;
        }

        public Criteria andResourceLVNotEqualTo(String value) {
            addCriterion("resourceLV <>", value, "resourceLV");
            return (Criteria) this;
        }

        public Criteria andResourceLVGreaterThan(String value) {
            addCriterion("resourceLV >", value, "resourceLV");
            return (Criteria) this;
        }

        public Criteria andResourceLVGreaterThanOrEqualTo(String value) {
            addCriterion("resourceLV >=", value, "resourceLV");
            return (Criteria) this;
        }

        public Criteria andResourceLVLessThan(String value) {
            addCriterion("resourceLV <", value, "resourceLV");
            return (Criteria) this;
        }

        public Criteria andResourceLVLessThanOrEqualTo(String value) {
            addCriterion("resourceLV <=", value, "resourceLV");
            return (Criteria) this;
        }

        public Criteria andResourceLVLike(String value) {
            addCriterion("resourceLV like", value, "resourceLV");
            return (Criteria) this;
        }

        public Criteria andResourceLVNotLike(String value) {
            addCriterion("resourceLV not like", value, "resourceLV");
            return (Criteria) this;
        }

        public Criteria andResourceLVIn(List<String> values) {
            addCriterion("resourceLV in", values, "resourceLV");
            return (Criteria) this;
        }

        public Criteria andResourceLVNotIn(List<String> values) {
            addCriterion("resourceLV not in", values, "resourceLV");
            return (Criteria) this;
        }

        public Criteria andResourceLVBetween(String value1, String value2) {
            addCriterion("resourceLV between", value1, value2, "resourceLV");
            return (Criteria) this;
        }

        public Criteria andResourceLVNotBetween(String value1, String value2) {
            addCriterion("resourceLV not between", value1, value2, "resourceLV");
            return (Criteria) this;
        }

        public Criteria andEnglishNameIsNull() {
            addCriterion("EnglishName is null");
            return (Criteria) this;
        }

        public Criteria andEnglishNameIsNotNull() {
            addCriterion("EnglishName is not null");
            return (Criteria) this;
        }

        public Criteria andEnglishNameEqualTo(String value) {
            addCriterion("EnglishName =", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameNotEqualTo(String value) {
            addCriterion("EnglishName <>", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameGreaterThan(String value) {
            addCriterion("EnglishName >", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameGreaterThanOrEqualTo(String value) {
            addCriterion("EnglishName >=", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameLessThan(String value) {
            addCriterion("EnglishName <", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameLessThanOrEqualTo(String value) {
            addCriterion("EnglishName <=", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameLike(String value) {
            addCriterion("EnglishName like", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameNotLike(String value) {
            addCriterion("EnglishName not like", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameIn(List<String> values) {
            addCriterion("EnglishName in", values, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameNotIn(List<String> values) {
            addCriterion("EnglishName not in", values, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameBetween(String value1, String value2) {
            addCriterion("EnglishName between", value1, value2, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameNotBetween(String value1, String value2) {
            addCriterion("EnglishName not between", value1, value2, "englishName");
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

        public Criteria andCreate_admin_idIsNull() {
            addCriterion("create_admin_id is null");
            return (Criteria) this;
        }

        public Criteria andCreate_admin_idIsNotNull() {
            addCriterion("create_admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_admin_idEqualTo(Integer value) {
            addCriterion("create_admin_id =", value, "create_admin_id");
            return (Criteria) this;
        }

        public Criteria andCreate_admin_idNotEqualTo(Integer value) {
            addCriterion("create_admin_id <>", value, "create_admin_id");
            return (Criteria) this;
        }

        public Criteria andCreate_admin_idGreaterThan(Integer value) {
            addCriterion("create_admin_id >", value, "create_admin_id");
            return (Criteria) this;
        }

        public Criteria andCreate_admin_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_admin_id >=", value, "create_admin_id");
            return (Criteria) this;
        }

        public Criteria andCreate_admin_idLessThan(Integer value) {
            addCriterion("create_admin_id <", value, "create_admin_id");
            return (Criteria) this;
        }

        public Criteria andCreate_admin_idLessThanOrEqualTo(Integer value) {
            addCriterion("create_admin_id <=", value, "create_admin_id");
            return (Criteria) this;
        }

        public Criteria andCreate_admin_idIn(List<Integer> values) {
            addCriterion("create_admin_id in", values, "create_admin_id");
            return (Criteria) this;
        }

        public Criteria andCreate_admin_idNotIn(List<Integer> values) {
            addCriterion("create_admin_id not in", values, "create_admin_id");
            return (Criteria) this;
        }

        public Criteria andCreate_admin_idBetween(Integer value1, Integer value2) {
            addCriterion("create_admin_id between", value1, value2, "create_admin_id");
            return (Criteria) this;
        }

        public Criteria andCreate_admin_idNotBetween(Integer value1, Integer value2) {
            addCriterion("create_admin_id not between", value1, value2, "create_admin_id");
            return (Criteria) this;
        }

        public Criteria andResource_statusIsNull() {
            addCriterion("resource_status is null");
            return (Criteria) this;
        }

        public Criteria andResource_statusIsNotNull() {
            addCriterion("resource_status is not null");
            return (Criteria) this;
        }

        public Criteria andResource_statusEqualTo(String value) {
            addCriterion("resource_status =", value, "resource_status");
            return (Criteria) this;
        }

        public Criteria andResource_statusNotEqualTo(String value) {
            addCriterion("resource_status <>", value, "resource_status");
            return (Criteria) this;
        }

        public Criteria andResource_statusGreaterThan(String value) {
            addCriterion("resource_status >", value, "resource_status");
            return (Criteria) this;
        }

        public Criteria andResource_statusGreaterThanOrEqualTo(String value) {
            addCriterion("resource_status >=", value, "resource_status");
            return (Criteria) this;
        }

        public Criteria andResource_statusLessThan(String value) {
            addCriterion("resource_status <", value, "resource_status");
            return (Criteria) this;
        }

        public Criteria andResource_statusLessThanOrEqualTo(String value) {
            addCriterion("resource_status <=", value, "resource_status");
            return (Criteria) this;
        }

        public Criteria andResource_statusLike(String value) {
            addCriterion("resource_status like", value, "resource_status");
            return (Criteria) this;
        }

        public Criteria andResource_statusNotLike(String value) {
            addCriterion("resource_status not like", value, "resource_status");
            return (Criteria) this;
        }

        public Criteria andResource_statusIn(List<String> values) {
            addCriterion("resource_status in", values, "resource_status");
            return (Criteria) this;
        }

        public Criteria andResource_statusNotIn(List<String> values) {
            addCriterion("resource_status not in", values, "resource_status");
            return (Criteria) this;
        }

        public Criteria andResource_statusBetween(String value1, String value2) {
            addCriterion("resource_status between", value1, value2, "resource_status");
            return (Criteria) this;
        }

        public Criteria andResource_statusNotBetween(String value1, String value2) {
            addCriterion("resource_status not between", value1, value2, "resource_status");
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