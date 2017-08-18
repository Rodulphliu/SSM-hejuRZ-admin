package com.hjrz.admin.entity;

import java.util.ArrayList;
import java.util.List;

public class Workstation_infoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Workstation_infoExample() {
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

        public Criteria andWsCodeIsNull() {
            addCriterion("wsCode is null");
            return (Criteria) this;
        }

        public Criteria andWsCodeIsNotNull() {
            addCriterion("wsCode is not null");
            return (Criteria) this;
        }

        public Criteria andWsCodeEqualTo(Long value) {
            addCriterion("wsCode =", value, "wsCode");
            return (Criteria) this;
        }

        public Criteria andWsCodeNotEqualTo(Long value) {
            addCriterion("wsCode <>", value, "wsCode");
            return (Criteria) this;
        }

        public Criteria andWsCodeGreaterThan(Long value) {
            addCriterion("wsCode >", value, "wsCode");
            return (Criteria) this;
        }

        public Criteria andWsCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("wsCode >=", value, "wsCode");
            return (Criteria) this;
        }

        public Criteria andWsCodeLessThan(Long value) {
            addCriterion("wsCode <", value, "wsCode");
            return (Criteria) this;
        }

        public Criteria andWsCodeLessThanOrEqualTo(Long value) {
            addCriterion("wsCode <=", value, "wsCode");
            return (Criteria) this;
        }

        public Criteria andWsCodeIn(List<Long> values) {
            addCriterion("wsCode in", values, "wsCode");
            return (Criteria) this;
        }

        public Criteria andWsCodeNotIn(List<Long> values) {
            addCriterion("wsCode not in", values, "wsCode");
            return (Criteria) this;
        }

        public Criteria andWsCodeBetween(Long value1, Long value2) {
            addCriterion("wsCode between", value1, value2, "wsCode");
            return (Criteria) this;
        }

        public Criteria andWsCodeNotBetween(Long value1, Long value2) {
            addCriterion("wsCode not between", value1, value2, "wsCode");
            return (Criteria) this;
        }

        public Criteria andWorkCodeIsNull() {
            addCriterion("workCode is null");
            return (Criteria) this;
        }

        public Criteria andWorkCodeIsNotNull() {
            addCriterion("workCode is not null");
            return (Criteria) this;
        }

        public Criteria andWorkCodeEqualTo(Long value) {
            addCriterion("workCode =", value, "workCode");
            return (Criteria) this;
        }

        public Criteria andWorkCodeNotEqualTo(Long value) {
            addCriterion("workCode <>", value, "workCode");
            return (Criteria) this;
        }

        public Criteria andWorkCodeGreaterThan(Long value) {
            addCriterion("workCode >", value, "workCode");
            return (Criteria) this;
        }

        public Criteria andWorkCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("workCode >=", value, "workCode");
            return (Criteria) this;
        }

        public Criteria andWorkCodeLessThan(Long value) {
            addCriterion("workCode <", value, "workCode");
            return (Criteria) this;
        }

        public Criteria andWorkCodeLessThanOrEqualTo(Long value) {
            addCriterion("workCode <=", value, "workCode");
            return (Criteria) this;
        }

        public Criteria andWorkCodeIn(List<Long> values) {
            addCriterion("workCode in", values, "workCode");
            return (Criteria) this;
        }

        public Criteria andWorkCodeNotIn(List<Long> values) {
            addCriterion("workCode not in", values, "workCode");
            return (Criteria) this;
        }

        public Criteria andWorkCodeBetween(Long value1, Long value2) {
            addCriterion("workCode between", value1, value2, "workCode");
            return (Criteria) this;
        }

        public Criteria andWorkCodeNotBetween(Long value1, Long value2) {
            addCriterion("workCode not between", value1, value2, "workCode");
            return (Criteria) this;
        }

        public Criteria andWsProcessorIsNull() {
            addCriterion("wsProcessor is null");
            return (Criteria) this;
        }

        public Criteria andWsProcessorIsNotNull() {
            addCriterion("wsProcessor is not null");
            return (Criteria) this;
        }

        public Criteria andWsProcessorEqualTo(String value) {
            addCriterion("wsProcessor =", value, "wsProcessor");
            return (Criteria) this;
        }

        public Criteria andWsProcessorNotEqualTo(String value) {
            addCriterion("wsProcessor <>", value, "wsProcessor");
            return (Criteria) this;
        }

        public Criteria andWsProcessorGreaterThan(String value) {
            addCriterion("wsProcessor >", value, "wsProcessor");
            return (Criteria) this;
        }

        public Criteria andWsProcessorGreaterThanOrEqualTo(String value) {
            addCriterion("wsProcessor >=", value, "wsProcessor");
            return (Criteria) this;
        }

        public Criteria andWsProcessorLessThan(String value) {
            addCriterion("wsProcessor <", value, "wsProcessor");
            return (Criteria) this;
        }

        public Criteria andWsProcessorLessThanOrEqualTo(String value) {
            addCriterion("wsProcessor <=", value, "wsProcessor");
            return (Criteria) this;
        }

        public Criteria andWsProcessorLike(String value) {
            addCriterion("wsProcessor like", value, "wsProcessor");
            return (Criteria) this;
        }

        public Criteria andWsProcessorNotLike(String value) {
            addCriterion("wsProcessor not like", value, "wsProcessor");
            return (Criteria) this;
        }

        public Criteria andWsProcessorIn(List<String> values) {
            addCriterion("wsProcessor in", values, "wsProcessor");
            return (Criteria) this;
        }

        public Criteria andWsProcessorNotIn(List<String> values) {
            addCriterion("wsProcessor not in", values, "wsProcessor");
            return (Criteria) this;
        }

        public Criteria andWsProcessorBetween(String value1, String value2) {
            addCriterion("wsProcessor between", value1, value2, "wsProcessor");
            return (Criteria) this;
        }

        public Criteria andWsProcessorNotBetween(String value1, String value2) {
            addCriterion("wsProcessor not between", value1, value2, "wsProcessor");
            return (Criteria) this;
        }

        public Criteria andCpuMixNumberIsNull() {
            addCriterion("cpuMixNumber is null");
            return (Criteria) this;
        }

        public Criteria andCpuMixNumberIsNotNull() {
            addCriterion("cpuMixNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCpuMixNumberEqualTo(String value) {
            addCriterion("cpuMixNumber =", value, "cpuMixNumber");
            return (Criteria) this;
        }

        public Criteria andCpuMixNumberNotEqualTo(String value) {
            addCriterion("cpuMixNumber <>", value, "cpuMixNumber");
            return (Criteria) this;
        }

        public Criteria andCpuMixNumberGreaterThan(String value) {
            addCriterion("cpuMixNumber >", value, "cpuMixNumber");
            return (Criteria) this;
        }

        public Criteria andCpuMixNumberGreaterThanOrEqualTo(String value) {
            addCriterion("cpuMixNumber >=", value, "cpuMixNumber");
            return (Criteria) this;
        }

        public Criteria andCpuMixNumberLessThan(String value) {
            addCriterion("cpuMixNumber <", value, "cpuMixNumber");
            return (Criteria) this;
        }

        public Criteria andCpuMixNumberLessThanOrEqualTo(String value) {
            addCriterion("cpuMixNumber <=", value, "cpuMixNumber");
            return (Criteria) this;
        }

        public Criteria andCpuMixNumberLike(String value) {
            addCriterion("cpuMixNumber like", value, "cpuMixNumber");
            return (Criteria) this;
        }

        public Criteria andCpuMixNumberNotLike(String value) {
            addCriterion("cpuMixNumber not like", value, "cpuMixNumber");
            return (Criteria) this;
        }

        public Criteria andCpuMixNumberIn(List<String> values) {
            addCriterion("cpuMixNumber in", values, "cpuMixNumber");
            return (Criteria) this;
        }

        public Criteria andCpuMixNumberNotIn(List<String> values) {
            addCriterion("cpuMixNumber not in", values, "cpuMixNumber");
            return (Criteria) this;
        }

        public Criteria andCpuMixNumberBetween(String value1, String value2) {
            addCriterion("cpuMixNumber between", value1, value2, "cpuMixNumber");
            return (Criteria) this;
        }

        public Criteria andCpuMixNumberNotBetween(String value1, String value2) {
            addCriterion("cpuMixNumber not between", value1, value2, "cpuMixNumber");
            return (Criteria) this;
        }

        public Criteria andSibrandNameIsNull() {
            addCriterion("sibrandName is null");
            return (Criteria) this;
        }

        public Criteria andSibrandNameIsNotNull() {
            addCriterion("sibrandName is not null");
            return (Criteria) this;
        }

        public Criteria andSibrandNameEqualTo(String value) {
            addCriterion("sibrandName =", value, "sibrandName");
            return (Criteria) this;
        }

        public Criteria andSibrandNameNotEqualTo(String value) {
            addCriterion("sibrandName <>", value, "sibrandName");
            return (Criteria) this;
        }

        public Criteria andSibrandNameGreaterThan(String value) {
            addCriterion("sibrandName >", value, "sibrandName");
            return (Criteria) this;
        }

        public Criteria andSibrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("sibrandName >=", value, "sibrandName");
            return (Criteria) this;
        }

        public Criteria andSibrandNameLessThan(String value) {
            addCriterion("sibrandName <", value, "sibrandName");
            return (Criteria) this;
        }

        public Criteria andSibrandNameLessThanOrEqualTo(String value) {
            addCriterion("sibrandName <=", value, "sibrandName");
            return (Criteria) this;
        }

        public Criteria andSibrandNameLike(String value) {
            addCriterion("sibrandName like", value, "sibrandName");
            return (Criteria) this;
        }

        public Criteria andSibrandNameNotLike(String value) {
            addCriterion("sibrandName not like", value, "sibrandName");
            return (Criteria) this;
        }

        public Criteria andSibrandNameIn(List<String> values) {
            addCriterion("sibrandName in", values, "sibrandName");
            return (Criteria) this;
        }

        public Criteria andSibrandNameNotIn(List<String> values) {
            addCriterion("sibrandName not in", values, "sibrandName");
            return (Criteria) this;
        }

        public Criteria andSibrandNameBetween(String value1, String value2) {
            addCriterion("sibrandName between", value1, value2, "sibrandName");
            return (Criteria) this;
        }

        public Criteria andSibrandNameNotBetween(String value1, String value2) {
            addCriterion("sibrandName not between", value1, value2, "sibrandName");
            return (Criteria) this;
        }

        public Criteria andSiSizeIsNull() {
            addCriterion("siSize is null");
            return (Criteria) this;
        }

        public Criteria andSiSizeIsNotNull() {
            addCriterion("siSize is not null");
            return (Criteria) this;
        }

        public Criteria andSiSizeEqualTo(String value) {
            addCriterion("siSize =", value, "siSize");
            return (Criteria) this;
        }

        public Criteria andSiSizeNotEqualTo(String value) {
            addCriterion("siSize <>", value, "siSize");
            return (Criteria) this;
        }

        public Criteria andSiSizeGreaterThan(String value) {
            addCriterion("siSize >", value, "siSize");
            return (Criteria) this;
        }

        public Criteria andSiSizeGreaterThanOrEqualTo(String value) {
            addCriterion("siSize >=", value, "siSize");
            return (Criteria) this;
        }

        public Criteria andSiSizeLessThan(String value) {
            addCriterion("siSize <", value, "siSize");
            return (Criteria) this;
        }

        public Criteria andSiSizeLessThanOrEqualTo(String value) {
            addCriterion("siSize <=", value, "siSize");
            return (Criteria) this;
        }

        public Criteria andSiSizeLike(String value) {
            addCriterion("siSize like", value, "siSize");
            return (Criteria) this;
        }

        public Criteria andSiSizeNotLike(String value) {
            addCriterion("siSize not like", value, "siSize");
            return (Criteria) this;
        }

        public Criteria andSiSizeIn(List<String> values) {
            addCriterion("siSize in", values, "siSize");
            return (Criteria) this;
        }

        public Criteria andSiSizeNotIn(List<String> values) {
            addCriterion("siSize not in", values, "siSize");
            return (Criteria) this;
        }

        public Criteria andSiSizeBetween(String value1, String value2) {
            addCriterion("siSize between", value1, value2, "siSize");
            return (Criteria) this;
        }

        public Criteria andSiSizeNotBetween(String value1, String value2) {
            addCriterion("siSize not between", value1, value2, "siSize");
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

        public Criteria andSioperSystemIsNull() {
            addCriterion("sioperSystem is null");
            return (Criteria) this;
        }

        public Criteria andSioperSystemIsNotNull() {
            addCriterion("sioperSystem is not null");
            return (Criteria) this;
        }

        public Criteria andSioperSystemEqualTo(String value) {
            addCriterion("sioperSystem =", value, "sioperSystem");
            return (Criteria) this;
        }

        public Criteria andSioperSystemNotEqualTo(String value) {
            addCriterion("sioperSystem <>", value, "sioperSystem");
            return (Criteria) this;
        }

        public Criteria andSioperSystemGreaterThan(String value) {
            addCriterion("sioperSystem >", value, "sioperSystem");
            return (Criteria) this;
        }

        public Criteria andSioperSystemGreaterThanOrEqualTo(String value) {
            addCriterion("sioperSystem >=", value, "sioperSystem");
            return (Criteria) this;
        }

        public Criteria andSioperSystemLessThan(String value) {
            addCriterion("sioperSystem <", value, "sioperSystem");
            return (Criteria) this;
        }

        public Criteria andSioperSystemLessThanOrEqualTo(String value) {
            addCriterion("sioperSystem <=", value, "sioperSystem");
            return (Criteria) this;
        }

        public Criteria andSioperSystemLike(String value) {
            addCriterion("sioperSystem like", value, "sioperSystem");
            return (Criteria) this;
        }

        public Criteria andSioperSystemNotLike(String value) {
            addCriterion("sioperSystem not like", value, "sioperSystem");
            return (Criteria) this;
        }

        public Criteria andSioperSystemIn(List<String> values) {
            addCriterion("sioperSystem in", values, "sioperSystem");
            return (Criteria) this;
        }

        public Criteria andSioperSystemNotIn(List<String> values) {
            addCriterion("sioperSystem not in", values, "sioperSystem");
            return (Criteria) this;
        }

        public Criteria andSioperSystemBetween(String value1, String value2) {
            addCriterion("sioperSystem between", value1, value2, "sioperSystem");
            return (Criteria) this;
        }

        public Criteria andSioperSystemNotBetween(String value1, String value2) {
            addCriterion("sioperSystem not between", value1, value2, "sioperSystem");
            return (Criteria) this;
        }

        public Criteria andSiCPURAMIsNull() {
            addCriterion("siCPURAM is null");
            return (Criteria) this;
        }

        public Criteria andSiCPURAMIsNotNull() {
            addCriterion("siCPURAM is not null");
            return (Criteria) this;
        }

        public Criteria andSiCPURAMEqualTo(String value) {
            addCriterion("siCPURAM =", value, "siCPURAM");
            return (Criteria) this;
        }

        public Criteria andSiCPURAMNotEqualTo(String value) {
            addCriterion("siCPURAM <>", value, "siCPURAM");
            return (Criteria) this;
        }

        public Criteria andSiCPURAMGreaterThan(String value) {
            addCriterion("siCPURAM >", value, "siCPURAM");
            return (Criteria) this;
        }

        public Criteria andSiCPURAMGreaterThanOrEqualTo(String value) {
            addCriterion("siCPURAM >=", value, "siCPURAM");
            return (Criteria) this;
        }

        public Criteria andSiCPURAMLessThan(String value) {
            addCriterion("siCPURAM <", value, "siCPURAM");
            return (Criteria) this;
        }

        public Criteria andSiCPURAMLessThanOrEqualTo(String value) {
            addCriterion("siCPURAM <=", value, "siCPURAM");
            return (Criteria) this;
        }

        public Criteria andSiCPURAMLike(String value) {
            addCriterion("siCPURAM like", value, "siCPURAM");
            return (Criteria) this;
        }

        public Criteria andSiCPURAMNotLike(String value) {
            addCriterion("siCPURAM not like", value, "siCPURAM");
            return (Criteria) this;
        }

        public Criteria andSiCPURAMIn(List<String> values) {
            addCriterion("siCPURAM in", values, "siCPURAM");
            return (Criteria) this;
        }

        public Criteria andSiCPURAMNotIn(List<String> values) {
            addCriterion("siCPURAM not in", values, "siCPURAM");
            return (Criteria) this;
        }

        public Criteria andSiCPURAMBetween(String value1, String value2) {
            addCriterion("siCPURAM between", value1, value2, "siCPURAM");
            return (Criteria) this;
        }

        public Criteria andSiCPURAMNotBetween(String value1, String value2) {
            addCriterion("siCPURAM not between", value1, value2, "siCPURAM");
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