package com.hjrz.admin.entity;

import java.util.ArrayList;
import java.util.List;

public class WorkstationInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkstationInfoExample() {
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

        public Criteria andWscodeIsNull() {
            addCriterion("wsCode is null");
            return (Criteria) this;
        }

        public Criteria andWscodeIsNotNull() {
            addCriterion("wsCode is not null");
            return (Criteria) this;
        }

        public Criteria andWscodeEqualTo(Long value) {
            addCriterion("wsCode =", value, "wscode");
            return (Criteria) this;
        }

        public Criteria andWscodeNotEqualTo(Long value) {
            addCriterion("wsCode <>", value, "wscode");
            return (Criteria) this;
        }

        public Criteria andWscodeGreaterThan(Long value) {
            addCriterion("wsCode >", value, "wscode");
            return (Criteria) this;
        }

        public Criteria andWscodeGreaterThanOrEqualTo(Long value) {
            addCriterion("wsCode >=", value, "wscode");
            return (Criteria) this;
        }

        public Criteria andWscodeLessThan(Long value) {
            addCriterion("wsCode <", value, "wscode");
            return (Criteria) this;
        }

        public Criteria andWscodeLessThanOrEqualTo(Long value) {
            addCriterion("wsCode <=", value, "wscode");
            return (Criteria) this;
        }

        public Criteria andWscodeIn(List<Long> values) {
            addCriterion("wsCode in", values, "wscode");
            return (Criteria) this;
        }

        public Criteria andWscodeNotIn(List<Long> values) {
            addCriterion("wsCode not in", values, "wscode");
            return (Criteria) this;
        }

        public Criteria andWscodeBetween(Long value1, Long value2) {
            addCriterion("wsCode between", value1, value2, "wscode");
            return (Criteria) this;
        }

        public Criteria andWscodeNotBetween(Long value1, Long value2) {
            addCriterion("wsCode not between", value1, value2, "wscode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeIsNull() {
            addCriterion("workCode is null");
            return (Criteria) this;
        }

        public Criteria andWorkcodeIsNotNull() {
            addCriterion("workCode is not null");
            return (Criteria) this;
        }

        public Criteria andWorkcodeEqualTo(Long value) {
            addCriterion("workCode =", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeNotEqualTo(Long value) {
            addCriterion("workCode <>", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeGreaterThan(Long value) {
            addCriterion("workCode >", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeGreaterThanOrEqualTo(Long value) {
            addCriterion("workCode >=", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeLessThan(Long value) {
            addCriterion("workCode <", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeLessThanOrEqualTo(Long value) {
            addCriterion("workCode <=", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeIn(List<Long> values) {
            addCriterion("workCode in", values, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeNotIn(List<Long> values) {
            addCriterion("workCode not in", values, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeBetween(Long value1, Long value2) {
            addCriterion("workCode between", value1, value2, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeNotBetween(Long value1, Long value2) {
            addCriterion("workCode not between", value1, value2, "workcode");
            return (Criteria) this;
        }

        public Criteria andWsprocessorIsNull() {
            addCriterion("wsProcessor is null");
            return (Criteria) this;
        }

        public Criteria andWsprocessorIsNotNull() {
            addCriterion("wsProcessor is not null");
            return (Criteria) this;
        }

        public Criteria andWsprocessorEqualTo(String value) {
            addCriterion("wsProcessor =", value, "wsprocessor");
            return (Criteria) this;
        }

        public Criteria andWsprocessorNotEqualTo(String value) {
            addCriterion("wsProcessor <>", value, "wsprocessor");
            return (Criteria) this;
        }

        public Criteria andWsprocessorGreaterThan(String value) {
            addCriterion("wsProcessor >", value, "wsprocessor");
            return (Criteria) this;
        }

        public Criteria andWsprocessorGreaterThanOrEqualTo(String value) {
            addCriterion("wsProcessor >=", value, "wsprocessor");
            return (Criteria) this;
        }

        public Criteria andWsprocessorLessThan(String value) {
            addCriterion("wsProcessor <", value, "wsprocessor");
            return (Criteria) this;
        }

        public Criteria andWsprocessorLessThanOrEqualTo(String value) {
            addCriterion("wsProcessor <=", value, "wsprocessor");
            return (Criteria) this;
        }

        public Criteria andWsprocessorLike(String value) {
            addCriterion("wsProcessor like", value, "wsprocessor");
            return (Criteria) this;
        }

        public Criteria andWsprocessorNotLike(String value) {
            addCriterion("wsProcessor not like", value, "wsprocessor");
            return (Criteria) this;
        }

        public Criteria andWsprocessorIn(List<String> values) {
            addCriterion("wsProcessor in", values, "wsprocessor");
            return (Criteria) this;
        }

        public Criteria andWsprocessorNotIn(List<String> values) {
            addCriterion("wsProcessor not in", values, "wsprocessor");
            return (Criteria) this;
        }

        public Criteria andWsprocessorBetween(String value1, String value2) {
            addCriterion("wsProcessor between", value1, value2, "wsprocessor");
            return (Criteria) this;
        }

        public Criteria andWsprocessorNotBetween(String value1, String value2) {
            addCriterion("wsProcessor not between", value1, value2, "wsprocessor");
            return (Criteria) this;
        }

        public Criteria andCpumixnumberIsNull() {
            addCriterion("cpuMixNumber is null");
            return (Criteria) this;
        }

        public Criteria andCpumixnumberIsNotNull() {
            addCriterion("cpuMixNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCpumixnumberEqualTo(String value) {
            addCriterion("cpuMixNumber =", value, "cpumixnumber");
            return (Criteria) this;
        }

        public Criteria andCpumixnumberNotEqualTo(String value) {
            addCriterion("cpuMixNumber <>", value, "cpumixnumber");
            return (Criteria) this;
        }

        public Criteria andCpumixnumberGreaterThan(String value) {
            addCriterion("cpuMixNumber >", value, "cpumixnumber");
            return (Criteria) this;
        }

        public Criteria andCpumixnumberGreaterThanOrEqualTo(String value) {
            addCriterion("cpuMixNumber >=", value, "cpumixnumber");
            return (Criteria) this;
        }

        public Criteria andCpumixnumberLessThan(String value) {
            addCriterion("cpuMixNumber <", value, "cpumixnumber");
            return (Criteria) this;
        }

        public Criteria andCpumixnumberLessThanOrEqualTo(String value) {
            addCriterion("cpuMixNumber <=", value, "cpumixnumber");
            return (Criteria) this;
        }

        public Criteria andCpumixnumberLike(String value) {
            addCriterion("cpuMixNumber like", value, "cpumixnumber");
            return (Criteria) this;
        }

        public Criteria andCpumixnumberNotLike(String value) {
            addCriterion("cpuMixNumber not like", value, "cpumixnumber");
            return (Criteria) this;
        }

        public Criteria andCpumixnumberIn(List<String> values) {
            addCriterion("cpuMixNumber in", values, "cpumixnumber");
            return (Criteria) this;
        }

        public Criteria andCpumixnumberNotIn(List<String> values) {
            addCriterion("cpuMixNumber not in", values, "cpumixnumber");
            return (Criteria) this;
        }

        public Criteria andCpumixnumberBetween(String value1, String value2) {
            addCriterion("cpuMixNumber between", value1, value2, "cpumixnumber");
            return (Criteria) this;
        }

        public Criteria andCpumixnumberNotBetween(String value1, String value2) {
            addCriterion("cpuMixNumber not between", value1, value2, "cpumixnumber");
            return (Criteria) this;
        }

        public Criteria andSibrandnameIsNull() {
            addCriterion("sibrandName is null");
            return (Criteria) this;
        }

        public Criteria andSibrandnameIsNotNull() {
            addCriterion("sibrandName is not null");
            return (Criteria) this;
        }

        public Criteria andSibrandnameEqualTo(String value) {
            addCriterion("sibrandName =", value, "sibrandname");
            return (Criteria) this;
        }

        public Criteria andSibrandnameNotEqualTo(String value) {
            addCriterion("sibrandName <>", value, "sibrandname");
            return (Criteria) this;
        }

        public Criteria andSibrandnameGreaterThan(String value) {
            addCriterion("sibrandName >", value, "sibrandname");
            return (Criteria) this;
        }

        public Criteria andSibrandnameGreaterThanOrEqualTo(String value) {
            addCriterion("sibrandName >=", value, "sibrandname");
            return (Criteria) this;
        }

        public Criteria andSibrandnameLessThan(String value) {
            addCriterion("sibrandName <", value, "sibrandname");
            return (Criteria) this;
        }

        public Criteria andSibrandnameLessThanOrEqualTo(String value) {
            addCriterion("sibrandName <=", value, "sibrandname");
            return (Criteria) this;
        }

        public Criteria andSibrandnameLike(String value) {
            addCriterion("sibrandName like", value, "sibrandname");
            return (Criteria) this;
        }

        public Criteria andSibrandnameNotLike(String value) {
            addCriterion("sibrandName not like", value, "sibrandname");
            return (Criteria) this;
        }

        public Criteria andSibrandnameIn(List<String> values) {
            addCriterion("sibrandName in", values, "sibrandname");
            return (Criteria) this;
        }

        public Criteria andSibrandnameNotIn(List<String> values) {
            addCriterion("sibrandName not in", values, "sibrandname");
            return (Criteria) this;
        }

        public Criteria andSibrandnameBetween(String value1, String value2) {
            addCriterion("sibrandName between", value1, value2, "sibrandname");
            return (Criteria) this;
        }

        public Criteria andSibrandnameNotBetween(String value1, String value2) {
            addCriterion("sibrandName not between", value1, value2, "sibrandname");
            return (Criteria) this;
        }

        public Criteria andSisizeIsNull() {
            addCriterion("siSize is null");
            return (Criteria) this;
        }

        public Criteria andSisizeIsNotNull() {
            addCriterion("siSize is not null");
            return (Criteria) this;
        }

        public Criteria andSisizeEqualTo(String value) {
            addCriterion("siSize =", value, "sisize");
            return (Criteria) this;
        }

        public Criteria andSisizeNotEqualTo(String value) {
            addCriterion("siSize <>", value, "sisize");
            return (Criteria) this;
        }

        public Criteria andSisizeGreaterThan(String value) {
            addCriterion("siSize >", value, "sisize");
            return (Criteria) this;
        }

        public Criteria andSisizeGreaterThanOrEqualTo(String value) {
            addCriterion("siSize >=", value, "sisize");
            return (Criteria) this;
        }

        public Criteria andSisizeLessThan(String value) {
            addCriterion("siSize <", value, "sisize");
            return (Criteria) this;
        }

        public Criteria andSisizeLessThanOrEqualTo(String value) {
            addCriterion("siSize <=", value, "sisize");
            return (Criteria) this;
        }

        public Criteria andSisizeLike(String value) {
            addCriterion("siSize like", value, "sisize");
            return (Criteria) this;
        }

        public Criteria andSisizeNotLike(String value) {
            addCriterion("siSize not like", value, "sisize");
            return (Criteria) this;
        }

        public Criteria andSisizeIn(List<String> values) {
            addCriterion("siSize in", values, "sisize");
            return (Criteria) this;
        }

        public Criteria andSisizeNotIn(List<String> values) {
            addCriterion("siSize not in", values, "sisize");
            return (Criteria) this;
        }

        public Criteria andSisizeBetween(String value1, String value2) {
            addCriterion("siSize between", value1, value2, "sisize");
            return (Criteria) this;
        }

        public Criteria andSisizeNotBetween(String value1, String value2) {
            addCriterion("siSize not between", value1, value2, "sisize");
            return (Criteria) this;
        }

        public Criteria andSihardamoutIsNull() {
            addCriterion("sihardamout is null");
            return (Criteria) this;
        }

        public Criteria andSihardamoutIsNotNull() {
            addCriterion("sihardamout is not null");
            return (Criteria) this;
        }

        public Criteria andSihardamoutEqualTo(String value) {
            addCriterion("sihardamout =", value, "sihardamout");
            return (Criteria) this;
        }

        public Criteria andSihardamoutNotEqualTo(String value) {
            addCriterion("sihardamout <>", value, "sihardamout");
            return (Criteria) this;
        }

        public Criteria andSihardamoutGreaterThan(String value) {
            addCriterion("sihardamout >", value, "sihardamout");
            return (Criteria) this;
        }

        public Criteria andSihardamoutGreaterThanOrEqualTo(String value) {
            addCriterion("sihardamout >=", value, "sihardamout");
            return (Criteria) this;
        }

        public Criteria andSihardamoutLessThan(String value) {
            addCriterion("sihardamout <", value, "sihardamout");
            return (Criteria) this;
        }

        public Criteria andSihardamoutLessThanOrEqualTo(String value) {
            addCriterion("sihardamout <=", value, "sihardamout");
            return (Criteria) this;
        }

        public Criteria andSihardamoutLike(String value) {
            addCriterion("sihardamout like", value, "sihardamout");
            return (Criteria) this;
        }

        public Criteria andSihardamoutNotLike(String value) {
            addCriterion("sihardamout not like", value, "sihardamout");
            return (Criteria) this;
        }

        public Criteria andSihardamoutIn(List<String> values) {
            addCriterion("sihardamout in", values, "sihardamout");
            return (Criteria) this;
        }

        public Criteria andSihardamoutNotIn(List<String> values) {
            addCriterion("sihardamout not in", values, "sihardamout");
            return (Criteria) this;
        }

        public Criteria andSihardamoutBetween(String value1, String value2) {
            addCriterion("sihardamout between", value1, value2, "sihardamout");
            return (Criteria) this;
        }

        public Criteria andSihardamoutNotBetween(String value1, String value2) {
            addCriterion("sihardamout not between", value1, value2, "sihardamout");
            return (Criteria) this;
        }

        public Criteria andSiopersystemIsNull() {
            addCriterion("sioperSystem is null");
            return (Criteria) this;
        }

        public Criteria andSiopersystemIsNotNull() {
            addCriterion("sioperSystem is not null");
            return (Criteria) this;
        }

        public Criteria andSiopersystemEqualTo(String value) {
            addCriterion("sioperSystem =", value, "siopersystem");
            return (Criteria) this;
        }

        public Criteria andSiopersystemNotEqualTo(String value) {
            addCriterion("sioperSystem <>", value, "siopersystem");
            return (Criteria) this;
        }

        public Criteria andSiopersystemGreaterThan(String value) {
            addCriterion("sioperSystem >", value, "siopersystem");
            return (Criteria) this;
        }

        public Criteria andSiopersystemGreaterThanOrEqualTo(String value) {
            addCriterion("sioperSystem >=", value, "siopersystem");
            return (Criteria) this;
        }

        public Criteria andSiopersystemLessThan(String value) {
            addCriterion("sioperSystem <", value, "siopersystem");
            return (Criteria) this;
        }

        public Criteria andSiopersystemLessThanOrEqualTo(String value) {
            addCriterion("sioperSystem <=", value, "siopersystem");
            return (Criteria) this;
        }

        public Criteria andSiopersystemLike(String value) {
            addCriterion("sioperSystem like", value, "siopersystem");
            return (Criteria) this;
        }

        public Criteria andSiopersystemNotLike(String value) {
            addCriterion("sioperSystem not like", value, "siopersystem");
            return (Criteria) this;
        }

        public Criteria andSiopersystemIn(List<String> values) {
            addCriterion("sioperSystem in", values, "siopersystem");
            return (Criteria) this;
        }

        public Criteria andSiopersystemNotIn(List<String> values) {
            addCriterion("sioperSystem not in", values, "siopersystem");
            return (Criteria) this;
        }

        public Criteria andSiopersystemBetween(String value1, String value2) {
            addCriterion("sioperSystem between", value1, value2, "siopersystem");
            return (Criteria) this;
        }

        public Criteria andSiopersystemNotBetween(String value1, String value2) {
            addCriterion("sioperSystem not between", value1, value2, "siopersystem");
            return (Criteria) this;
        }

        public Criteria andSicpuramIsNull() {
            addCriterion("siCPURAM is null");
            return (Criteria) this;
        }

        public Criteria andSicpuramIsNotNull() {
            addCriterion("siCPURAM is not null");
            return (Criteria) this;
        }

        public Criteria andSicpuramEqualTo(String value) {
            addCriterion("siCPURAM =", value, "sicpuram");
            return (Criteria) this;
        }

        public Criteria andSicpuramNotEqualTo(String value) {
            addCriterion("siCPURAM <>", value, "sicpuram");
            return (Criteria) this;
        }

        public Criteria andSicpuramGreaterThan(String value) {
            addCriterion("siCPURAM >", value, "sicpuram");
            return (Criteria) this;
        }

        public Criteria andSicpuramGreaterThanOrEqualTo(String value) {
            addCriterion("siCPURAM >=", value, "sicpuram");
            return (Criteria) this;
        }

        public Criteria andSicpuramLessThan(String value) {
            addCriterion("siCPURAM <", value, "sicpuram");
            return (Criteria) this;
        }

        public Criteria andSicpuramLessThanOrEqualTo(String value) {
            addCriterion("siCPURAM <=", value, "sicpuram");
            return (Criteria) this;
        }

        public Criteria andSicpuramLike(String value) {
            addCriterion("siCPURAM like", value, "sicpuram");
            return (Criteria) this;
        }

        public Criteria andSicpuramNotLike(String value) {
            addCriterion("siCPURAM not like", value, "sicpuram");
            return (Criteria) this;
        }

        public Criteria andSicpuramIn(List<String> values) {
            addCriterion("siCPURAM in", values, "sicpuram");
            return (Criteria) this;
        }

        public Criteria andSicpuramNotIn(List<String> values) {
            addCriterion("siCPURAM not in", values, "sicpuram");
            return (Criteria) this;
        }

        public Criteria andSicpuramBetween(String value1, String value2) {
            addCriterion("siCPURAM between", value1, value2, "sicpuram");
            return (Criteria) this;
        }

        public Criteria andSicpuramNotBetween(String value1, String value2) {
            addCriterion("siCPURAM not between", value1, value2, "sicpuram");
            return (Criteria) this;
        }

        public Criteria andProductdescIsNull() {
            addCriterion("productdesc is null");
            return (Criteria) this;
        }

        public Criteria andProductdescIsNotNull() {
            addCriterion("productdesc is not null");
            return (Criteria) this;
        }

        public Criteria andProductdescEqualTo(String value) {
            addCriterion("productdesc =", value, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescNotEqualTo(String value) {
            addCriterion("productdesc <>", value, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescGreaterThan(String value) {
            addCriterion("productdesc >", value, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescGreaterThanOrEqualTo(String value) {
            addCriterion("productdesc >=", value, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescLessThan(String value) {
            addCriterion("productdesc <", value, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescLessThanOrEqualTo(String value) {
            addCriterion("productdesc <=", value, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescLike(String value) {
            addCriterion("productdesc like", value, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescNotLike(String value) {
            addCriterion("productdesc not like", value, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescIn(List<String> values) {
            addCriterion("productdesc in", values, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescNotIn(List<String> values) {
            addCriterion("productdesc not in", values, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescBetween(String value1, String value2) {
            addCriterion("productdesc between", value1, value2, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescNotBetween(String value1, String value2) {
            addCriterion("productdesc not between", value1, value2, "productdesc");
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