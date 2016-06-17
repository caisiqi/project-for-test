package oliver.demo.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PpdcDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PpdcDetailExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andPpdcDetailIdIsNull() {
            addCriterion("ppdc_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andPpdcDetailIdIsNotNull() {
            addCriterion("ppdc_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andPpdcDetailIdEqualTo(Integer value) {
            addCriterion("ppdc_detail_id =", value, "ppdcDetailId");
            return (Criteria) this;
        }

        public Criteria andPpdcDetailIdNotEqualTo(Integer value) {
            addCriterion("ppdc_detail_id <>", value, "ppdcDetailId");
            return (Criteria) this;
        }

        public Criteria andPpdcDetailIdGreaterThan(Integer value) {
            addCriterion("ppdc_detail_id >", value, "ppdcDetailId");
            return (Criteria) this;
        }

        public Criteria andPpdcDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ppdc_detail_id >=", value, "ppdcDetailId");
            return (Criteria) this;
        }

        public Criteria andPpdcDetailIdLessThan(Integer value) {
            addCriterion("ppdc_detail_id <", value, "ppdcDetailId");
            return (Criteria) this;
        }

        public Criteria andPpdcDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("ppdc_detail_id <=", value, "ppdcDetailId");
            return (Criteria) this;
        }

        public Criteria andPpdcDetailIdIn(List<Integer> values) {
            addCriterion("ppdc_detail_id in", values, "ppdcDetailId");
            return (Criteria) this;
        }

        public Criteria andPpdcDetailIdNotIn(List<Integer> values) {
            addCriterion("ppdc_detail_id not in", values, "ppdcDetailId");
            return (Criteria) this;
        }

        public Criteria andPpdcDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("ppdc_detail_id between", value1, value2, "ppdcDetailId");
            return (Criteria) this;
        }

        public Criteria andPpdcDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ppdc_detail_id not between", value1, value2, "ppdcDetailId");
            return (Criteria) this;
        }

        public Criteria andReqIdIsNull() {
            addCriterion("req_id is null");
            return (Criteria) this;
        }

        public Criteria andReqIdIsNotNull() {
            addCriterion("req_id is not null");
            return (Criteria) this;
        }

        public Criteria andReqIdEqualTo(String value) {
            addCriterion("req_id =", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdNotEqualTo(String value) {
            addCriterion("req_id <>", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdGreaterThan(String value) {
            addCriterion("req_id >", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdGreaterThanOrEqualTo(String value) {
            addCriterion("req_id >=", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdLessThan(String value) {
            addCriterion("req_id <", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdLessThanOrEqualTo(String value) {
            addCriterion("req_id <=", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdLike(String value) {
            addCriterion("req_id like", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdNotLike(String value) {
            addCriterion("req_id not like", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdIn(List<String> values) {
            addCriterion("req_id in", values, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdNotIn(List<String> values) {
            addCriterion("req_id not in", values, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdBetween(String value1, String value2) {
            addCriterion("req_id between", value1, value2, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdNotBetween(String value1, String value2) {
            addCriterion("req_id not between", value1, value2, "reqId");
            return (Criteria) this;
        }

        public Criteria andPartNoIsNull() {
            addCriterion("part_no is null");
            return (Criteria) this;
        }

        public Criteria andPartNoIsNotNull() {
            addCriterion("part_no is not null");
            return (Criteria) this;
        }

        public Criteria andPartNoEqualTo(String value) {
            addCriterion("part_no =", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoNotEqualTo(String value) {
            addCriterion("part_no <>", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoGreaterThan(String value) {
            addCriterion("part_no >", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoGreaterThanOrEqualTo(String value) {
            addCriterion("part_no >=", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoLessThan(String value) {
            addCriterion("part_no <", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoLessThanOrEqualTo(String value) {
            addCriterion("part_no <=", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoLike(String value) {
            addCriterion("part_no like", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoNotLike(String value) {
            addCriterion("part_no not like", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoIn(List<String> values) {
            addCriterion("part_no in", values, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoNotIn(List<String> values) {
            addCriterion("part_no not in", values, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoBetween(String value1, String value2) {
            addCriterion("part_no between", value1, value2, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoNotBetween(String value1, String value2) {
            addCriterion("part_no not between", value1, value2, "partNo");
            return (Criteria) this;
        }

        public Criteria andVendNoIsNull() {
            addCriterion("vend_no is null");
            return (Criteria) this;
        }

        public Criteria andVendNoIsNotNull() {
            addCriterion("vend_no is not null");
            return (Criteria) this;
        }

        public Criteria andVendNoEqualTo(Integer value) {
            addCriterion("vend_no =", value, "vendNo");
            return (Criteria) this;
        }

        public Criteria andVendNoNotEqualTo(Integer value) {
            addCriterion("vend_no <>", value, "vendNo");
            return (Criteria) this;
        }

        public Criteria andVendNoGreaterThan(Integer value) {
            addCriterion("vend_no >", value, "vendNo");
            return (Criteria) this;
        }

        public Criteria andVendNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("vend_no >=", value, "vendNo");
            return (Criteria) this;
        }

        public Criteria andVendNoLessThan(Integer value) {
            addCriterion("vend_no <", value, "vendNo");
            return (Criteria) this;
        }

        public Criteria andVendNoLessThanOrEqualTo(Integer value) {
            addCriterion("vend_no <=", value, "vendNo");
            return (Criteria) this;
        }

        public Criteria andVendNoIn(List<Integer> values) {
            addCriterion("vend_no in", values, "vendNo");
            return (Criteria) this;
        }

        public Criteria andVendNoNotIn(List<Integer> values) {
            addCriterion("vend_no not in", values, "vendNo");
            return (Criteria) this;
        }

        public Criteria andVendNoBetween(Integer value1, Integer value2) {
            addCriterion("vend_no between", value1, value2, "vendNo");
            return (Criteria) this;
        }

        public Criteria andVendNoNotBetween(Integer value1, Integer value2) {
            addCriterion("vend_no not between", value1, value2, "vendNo");
            return (Criteria) this;
        }

        public Criteria andVendNameIsNull() {
            addCriterion("vend_name is null");
            return (Criteria) this;
        }

        public Criteria andVendNameIsNotNull() {
            addCriterion("vend_name is not null");
            return (Criteria) this;
        }

        public Criteria andVendNameEqualTo(String value) {
            addCriterion("vend_name =", value, "vendName");
            return (Criteria) this;
        }

        public Criteria andVendNameNotEqualTo(String value) {
            addCriterion("vend_name <>", value, "vendName");
            return (Criteria) this;
        }

        public Criteria andVendNameGreaterThan(String value) {
            addCriterion("vend_name >", value, "vendName");
            return (Criteria) this;
        }

        public Criteria andVendNameGreaterThanOrEqualTo(String value) {
            addCriterion("vend_name >=", value, "vendName");
            return (Criteria) this;
        }

        public Criteria andVendNameLessThan(String value) {
            addCriterion("vend_name <", value, "vendName");
            return (Criteria) this;
        }

        public Criteria andVendNameLessThanOrEqualTo(String value) {
            addCriterion("vend_name <=", value, "vendName");
            return (Criteria) this;
        }

        public Criteria andVendNameLike(String value) {
            addCriterion("vend_name like", value, "vendName");
            return (Criteria) this;
        }

        public Criteria andVendNameNotLike(String value) {
            addCriterion("vend_name not like", value, "vendName");
            return (Criteria) this;
        }

        public Criteria andVendNameIn(List<String> values) {
            addCriterion("vend_name in", values, "vendName");
            return (Criteria) this;
        }

        public Criteria andVendNameNotIn(List<String> values) {
            addCriterion("vend_name not in", values, "vendName");
            return (Criteria) this;
        }

        public Criteria andVendNameBetween(String value1, String value2) {
            addCriterion("vend_name between", value1, value2, "vendName");
            return (Criteria) this;
        }

        public Criteria andVendNameNotBetween(String value1, String value2) {
            addCriterion("vend_name not between", value1, value2, "vendName");
            return (Criteria) this;
        }

        public Criteria andPoVendNoIsNull() {
            addCriterion("po_vend_no is null");
            return (Criteria) this;
        }

        public Criteria andPoVendNoIsNotNull() {
            addCriterion("po_vend_no is not null");
            return (Criteria) this;
        }

        public Criteria andPoVendNoEqualTo(Integer value) {
            addCriterion("po_vend_no =", value, "poVendNo");
            return (Criteria) this;
        }

        public Criteria andPoVendNoNotEqualTo(Integer value) {
            addCriterion("po_vend_no <>", value, "poVendNo");
            return (Criteria) this;
        }

        public Criteria andPoVendNoGreaterThan(Integer value) {
            addCriterion("po_vend_no >", value, "poVendNo");
            return (Criteria) this;
        }

        public Criteria andPoVendNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("po_vend_no >=", value, "poVendNo");
            return (Criteria) this;
        }

        public Criteria andPoVendNoLessThan(Integer value) {
            addCriterion("po_vend_no <", value, "poVendNo");
            return (Criteria) this;
        }

        public Criteria andPoVendNoLessThanOrEqualTo(Integer value) {
            addCriterion("po_vend_no <=", value, "poVendNo");
            return (Criteria) this;
        }

        public Criteria andPoVendNoIn(List<Integer> values) {
            addCriterion("po_vend_no in", values, "poVendNo");
            return (Criteria) this;
        }

        public Criteria andPoVendNoNotIn(List<Integer> values) {
            addCriterion("po_vend_no not in", values, "poVendNo");
            return (Criteria) this;
        }

        public Criteria andPoVendNoBetween(Integer value1, Integer value2) {
            addCriterion("po_vend_no between", value1, value2, "poVendNo");
            return (Criteria) this;
        }

        public Criteria andPoVendNoNotBetween(Integer value1, Integer value2) {
            addCriterion("po_vend_no not between", value1, value2, "poVendNo");
            return (Criteria) this;
        }

        public Criteria andPoVendNameIsNull() {
            addCriterion("po_vend_name is null");
            return (Criteria) this;
        }

        public Criteria andPoVendNameIsNotNull() {
            addCriterion("po_vend_name is not null");
            return (Criteria) this;
        }

        public Criteria andPoVendNameEqualTo(String value) {
            addCriterion("po_vend_name =", value, "poVendName");
            return (Criteria) this;
        }

        public Criteria andPoVendNameNotEqualTo(String value) {
            addCriterion("po_vend_name <>", value, "poVendName");
            return (Criteria) this;
        }

        public Criteria andPoVendNameGreaterThan(String value) {
            addCriterion("po_vend_name >", value, "poVendName");
            return (Criteria) this;
        }

        public Criteria andPoVendNameGreaterThanOrEqualTo(String value) {
            addCriterion("po_vend_name >=", value, "poVendName");
            return (Criteria) this;
        }

        public Criteria andPoVendNameLessThan(String value) {
            addCriterion("po_vend_name <", value, "poVendName");
            return (Criteria) this;
        }

        public Criteria andPoVendNameLessThanOrEqualTo(String value) {
            addCriterion("po_vend_name <=", value, "poVendName");
            return (Criteria) this;
        }

        public Criteria andPoVendNameLike(String value) {
            addCriterion("po_vend_name like", value, "poVendName");
            return (Criteria) this;
        }

        public Criteria andPoVendNameNotLike(String value) {
            addCriterion("po_vend_name not like", value, "poVendName");
            return (Criteria) this;
        }

        public Criteria andPoVendNameIn(List<String> values) {
            addCriterion("po_vend_name in", values, "poVendName");
            return (Criteria) this;
        }

        public Criteria andPoVendNameNotIn(List<String> values) {
            addCriterion("po_vend_name not in", values, "poVendName");
            return (Criteria) this;
        }

        public Criteria andPoVendNameBetween(String value1, String value2) {
            addCriterion("po_vend_name between", value1, value2, "poVendName");
            return (Criteria) this;
        }

        public Criteria andPoVendNameNotBetween(String value1, String value2) {
            addCriterion("po_vend_name not between", value1, value2, "poVendName");
            return (Criteria) this;
        }

        public Criteria andPpdcSugEtaDateIsNull() {
            addCriterion("ppdc_sug_eta_date is null");
            return (Criteria) this;
        }

        public Criteria andPpdcSugEtaDateIsNotNull() {
            addCriterion("ppdc_sug_eta_date is not null");
            return (Criteria) this;
        }

        public Criteria andPpdcSugEtaDateEqualTo(Date value) {
            addCriterionForJDBCDate("ppdc_sug_eta_date =", value, "ppdcSugEtaDate");
            return (Criteria) this;
        }

        public Criteria andPpdcSugEtaDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ppdc_sug_eta_date <>", value, "ppdcSugEtaDate");
            return (Criteria) this;
        }

        public Criteria andPpdcSugEtaDateGreaterThan(Date value) {
            addCriterionForJDBCDate("ppdc_sug_eta_date >", value, "ppdcSugEtaDate");
            return (Criteria) this;
        }

        public Criteria andPpdcSugEtaDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ppdc_sug_eta_date >=", value, "ppdcSugEtaDate");
            return (Criteria) this;
        }

        public Criteria andPpdcSugEtaDateLessThan(Date value) {
            addCriterionForJDBCDate("ppdc_sug_eta_date <", value, "ppdcSugEtaDate");
            return (Criteria) this;
        }

        public Criteria andPpdcSugEtaDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ppdc_sug_eta_date <=", value, "ppdcSugEtaDate");
            return (Criteria) this;
        }

        public Criteria andPpdcSugEtaDateIn(List<Date> values) {
            addCriterionForJDBCDate("ppdc_sug_eta_date in", values, "ppdcSugEtaDate");
            return (Criteria) this;
        }

        public Criteria andPpdcSugEtaDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ppdc_sug_eta_date not in", values, "ppdcSugEtaDate");
            return (Criteria) this;
        }

        public Criteria andPpdcSugEtaDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ppdc_sug_eta_date between", value1, value2, "ppdcSugEtaDate");
            return (Criteria) this;
        }

        public Criteria andPpdcSugEtaDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ppdc_sug_eta_date not between", value1, value2, "ppdcSugEtaDate");
            return (Criteria) this;
        }

        public Criteria andLeadTimeIsNull() {
            addCriterion("lead_time is null");
            return (Criteria) this;
        }

        public Criteria andLeadTimeIsNotNull() {
            addCriterion("lead_time is not null");
            return (Criteria) this;
        }

        public Criteria andLeadTimeEqualTo(Integer value) {
            addCriterion("lead_time =", value, "leadTime");
            return (Criteria) this;
        }

        public Criteria andLeadTimeNotEqualTo(Integer value) {
            addCriterion("lead_time <>", value, "leadTime");
            return (Criteria) this;
        }

        public Criteria andLeadTimeGreaterThan(Integer value) {
            addCriterion("lead_time >", value, "leadTime");
            return (Criteria) this;
        }

        public Criteria andLeadTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("lead_time >=", value, "leadTime");
            return (Criteria) this;
        }

        public Criteria andLeadTimeLessThan(Integer value) {
            addCriterion("lead_time <", value, "leadTime");
            return (Criteria) this;
        }

        public Criteria andLeadTimeLessThanOrEqualTo(Integer value) {
            addCriterion("lead_time <=", value, "leadTime");
            return (Criteria) this;
        }

        public Criteria andLeadTimeIn(List<Integer> values) {
            addCriterion("lead_time in", values, "leadTime");
            return (Criteria) this;
        }

        public Criteria andLeadTimeNotIn(List<Integer> values) {
            addCriterion("lead_time not in", values, "leadTime");
            return (Criteria) this;
        }

        public Criteria andLeadTimeBetween(Integer value1, Integer value2) {
            addCriterion("lead_time between", value1, value2, "leadTime");
            return (Criteria) this;
        }

        public Criteria andLeadTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("lead_time not between", value1, value2, "leadTime");
            return (Criteria) this;
        }

        public Criteria andPpdcReasonCodeIsNull() {
            addCriterion("ppdc_reason_code is null");
            return (Criteria) this;
        }

        public Criteria andPpdcReasonCodeIsNotNull() {
            addCriterion("ppdc_reason_code is not null");
            return (Criteria) this;
        }

        public Criteria andPpdcReasonCodeEqualTo(String value) {
            addCriterion("ppdc_reason_code =", value, "ppdcReasonCode");
            return (Criteria) this;
        }

        public Criteria andPpdcReasonCodeNotEqualTo(String value) {
            addCriterion("ppdc_reason_code <>", value, "ppdcReasonCode");
            return (Criteria) this;
        }

        public Criteria andPpdcReasonCodeGreaterThan(String value) {
            addCriterion("ppdc_reason_code >", value, "ppdcReasonCode");
            return (Criteria) this;
        }

        public Criteria andPpdcReasonCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ppdc_reason_code >=", value, "ppdcReasonCode");
            return (Criteria) this;
        }

        public Criteria andPpdcReasonCodeLessThan(String value) {
            addCriterion("ppdc_reason_code <", value, "ppdcReasonCode");
            return (Criteria) this;
        }

        public Criteria andPpdcReasonCodeLessThanOrEqualTo(String value) {
            addCriterion("ppdc_reason_code <=", value, "ppdcReasonCode");
            return (Criteria) this;
        }

        public Criteria andPpdcReasonCodeLike(String value) {
            addCriterion("ppdc_reason_code like", value, "ppdcReasonCode");
            return (Criteria) this;
        }

        public Criteria andPpdcReasonCodeNotLike(String value) {
            addCriterion("ppdc_reason_code not like", value, "ppdcReasonCode");
            return (Criteria) this;
        }

        public Criteria andPpdcReasonCodeIn(List<String> values) {
            addCriterion("ppdc_reason_code in", values, "ppdcReasonCode");
            return (Criteria) this;
        }

        public Criteria andPpdcReasonCodeNotIn(List<String> values) {
            addCriterion("ppdc_reason_code not in", values, "ppdcReasonCode");
            return (Criteria) this;
        }

        public Criteria andPpdcReasonCodeBetween(String value1, String value2) {
            addCriterion("ppdc_reason_code between", value1, value2, "ppdcReasonCode");
            return (Criteria) this;
        }

        public Criteria andPpdcReasonCodeNotBetween(String value1, String value2) {
            addCriterion("ppdc_reason_code not between", value1, value2, "ppdcReasonCode");
            return (Criteria) this;
        }

        public Criteria andPpdcActionIsNull() {
            addCriterion("ppdc_action is null");
            return (Criteria) this;
        }

        public Criteria andPpdcActionIsNotNull() {
            addCriterion("ppdc_action is not null");
            return (Criteria) this;
        }

        public Criteria andPpdcActionEqualTo(String value) {
            addCriterion("ppdc_action =", value, "ppdcAction");
            return (Criteria) this;
        }

        public Criteria andPpdcActionNotEqualTo(String value) {
            addCriterion("ppdc_action <>", value, "ppdcAction");
            return (Criteria) this;
        }

        public Criteria andPpdcActionGreaterThan(String value) {
            addCriterion("ppdc_action >", value, "ppdcAction");
            return (Criteria) this;
        }

        public Criteria andPpdcActionGreaterThanOrEqualTo(String value) {
            addCriterion("ppdc_action >=", value, "ppdcAction");
            return (Criteria) this;
        }

        public Criteria andPpdcActionLessThan(String value) {
            addCriterion("ppdc_action <", value, "ppdcAction");
            return (Criteria) this;
        }

        public Criteria andPpdcActionLessThanOrEqualTo(String value) {
            addCriterion("ppdc_action <=", value, "ppdcAction");
            return (Criteria) this;
        }

        public Criteria andPpdcActionLike(String value) {
            addCriterion("ppdc_action like", value, "ppdcAction");
            return (Criteria) this;
        }

        public Criteria andPpdcActionNotLike(String value) {
            addCriterion("ppdc_action not like", value, "ppdcAction");
            return (Criteria) this;
        }

        public Criteria andPpdcActionIn(List<String> values) {
            addCriterion("ppdc_action in", values, "ppdcAction");
            return (Criteria) this;
        }

        public Criteria andPpdcActionNotIn(List<String> values) {
            addCriterion("ppdc_action not in", values, "ppdcAction");
            return (Criteria) this;
        }

        public Criteria andPpdcActionBetween(String value1, String value2) {
            addCriterion("ppdc_action between", value1, value2, "ppdcAction");
            return (Criteria) this;
        }

        public Criteria andPpdcActionNotBetween(String value1, String value2) {
            addCriterion("ppdc_action not between", value1, value2, "ppdcAction");
            return (Criteria) this;
        }

        public Criteria andPpdcActionQtyIsNull() {
            addCriterion("ppdc_action_qty is null");
            return (Criteria) this;
        }

        public Criteria andPpdcActionQtyIsNotNull() {
            addCriterion("ppdc_action_qty is not null");
            return (Criteria) this;
        }

        public Criteria andPpdcActionQtyEqualTo(Integer value) {
            addCriterion("ppdc_action_qty =", value, "ppdcActionQty");
            return (Criteria) this;
        }

        public Criteria andPpdcActionQtyNotEqualTo(Integer value) {
            addCriterion("ppdc_action_qty <>", value, "ppdcActionQty");
            return (Criteria) this;
        }

        public Criteria andPpdcActionQtyGreaterThan(Integer value) {
            addCriterion("ppdc_action_qty >", value, "ppdcActionQty");
            return (Criteria) this;
        }

        public Criteria andPpdcActionQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("ppdc_action_qty >=", value, "ppdcActionQty");
            return (Criteria) this;
        }

        public Criteria andPpdcActionQtyLessThan(Integer value) {
            addCriterion("ppdc_action_qty <", value, "ppdcActionQty");
            return (Criteria) this;
        }

        public Criteria andPpdcActionQtyLessThanOrEqualTo(Integer value) {
            addCriterion("ppdc_action_qty <=", value, "ppdcActionQty");
            return (Criteria) this;
        }

        public Criteria andPpdcActionQtyIn(List<Integer> values) {
            addCriterion("ppdc_action_qty in", values, "ppdcActionQty");
            return (Criteria) this;
        }

        public Criteria andPpdcActionQtyNotIn(List<Integer> values) {
            addCriterion("ppdc_action_qty not in", values, "ppdcActionQty");
            return (Criteria) this;
        }

        public Criteria andPpdcActionQtyBetween(Integer value1, Integer value2) {
            addCriterion("ppdc_action_qty between", value1, value2, "ppdcActionQty");
            return (Criteria) this;
        }

        public Criteria andPpdcActionQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("ppdc_action_qty not between", value1, value2, "ppdcActionQty");
            return (Criteria) this;
        }

        public Criteria andCustNoIsNull() {
            addCriterion("cust_no is null");
            return (Criteria) this;
        }

        public Criteria andCustNoIsNotNull() {
            addCriterion("cust_no is not null");
            return (Criteria) this;
        }

        public Criteria andCustNoEqualTo(Integer value) {
            addCriterion("cust_no =", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoNotEqualTo(Integer value) {
            addCriterion("cust_no <>", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoGreaterThan(Integer value) {
            addCriterion("cust_no >", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cust_no >=", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoLessThan(Integer value) {
            addCriterion("cust_no <", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoLessThanOrEqualTo(Integer value) {
            addCriterion("cust_no <=", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoIn(List<Integer> values) {
            addCriterion("cust_no in", values, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoNotIn(List<Integer> values) {
            addCriterion("cust_no not in", values, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoBetween(Integer value1, Integer value2) {
            addCriterion("cust_no between", value1, value2, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoNotBetween(Integer value1, Integer value2) {
            addCriterion("cust_no not between", value1, value2, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNull() {
            addCriterion("cust_name is null");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNotNull() {
            addCriterion("cust_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustNameEqualTo(String value) {
            addCriterion("cust_name =", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotEqualTo(String value) {
            addCriterion("cust_name <>", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThan(String value) {
            addCriterion("cust_name >", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("cust_name >=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThan(String value) {
            addCriterion("cust_name <", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThanOrEqualTo(String value) {
            addCriterion("cust_name <=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLike(String value) {
            addCriterion("cust_name like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotLike(String value) {
            addCriterion("cust_name not like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameIn(List<String> values) {
            addCriterion("cust_name in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotIn(List<String> values) {
            addCriterion("cust_name not in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameBetween(String value1, String value2) {
            addCriterion("cust_name between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotBetween(String value1, String value2) {
            addCriterion("cust_name not between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andLocNoIsNull() {
            addCriterion("loc_no is null");
            return (Criteria) this;
        }

        public Criteria andLocNoIsNotNull() {
            addCriterion("loc_no is not null");
            return (Criteria) this;
        }

        public Criteria andLocNoEqualTo(Integer value) {
            addCriterion("loc_no =", value, "locNo");
            return (Criteria) this;
        }

        public Criteria andLocNoNotEqualTo(Integer value) {
            addCriterion("loc_no <>", value, "locNo");
            return (Criteria) this;
        }

        public Criteria andLocNoGreaterThan(Integer value) {
            addCriterion("loc_no >", value, "locNo");
            return (Criteria) this;
        }

        public Criteria andLocNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("loc_no >=", value, "locNo");
            return (Criteria) this;
        }

        public Criteria andLocNoLessThan(Integer value) {
            addCriterion("loc_no <", value, "locNo");
            return (Criteria) this;
        }

        public Criteria andLocNoLessThanOrEqualTo(Integer value) {
            addCriterion("loc_no <=", value, "locNo");
            return (Criteria) this;
        }

        public Criteria andLocNoIn(List<Integer> values) {
            addCriterion("loc_no in", values, "locNo");
            return (Criteria) this;
        }

        public Criteria andLocNoNotIn(List<Integer> values) {
            addCriterion("loc_no not in", values, "locNo");
            return (Criteria) this;
        }

        public Criteria andLocNoBetween(Integer value1, Integer value2) {
            addCriterion("loc_no between", value1, value2, "locNo");
            return (Criteria) this;
        }

        public Criteria andLocNoNotBetween(Integer value1, Integer value2) {
            addCriterion("loc_no not between", value1, value2, "locNo");
            return (Criteria) this;
        }

        public Criteria andLocCharIsNull() {
            addCriterion("loc_char is null");
            return (Criteria) this;
        }

        public Criteria andLocCharIsNotNull() {
            addCriterion("loc_char is not null");
            return (Criteria) this;
        }

        public Criteria andLocCharEqualTo(String value) {
            addCriterion("loc_char =", value, "locChar");
            return (Criteria) this;
        }

        public Criteria andLocCharNotEqualTo(String value) {
            addCriterion("loc_char <>", value, "locChar");
            return (Criteria) this;
        }

        public Criteria andLocCharGreaterThan(String value) {
            addCriterion("loc_char >", value, "locChar");
            return (Criteria) this;
        }

        public Criteria andLocCharGreaterThanOrEqualTo(String value) {
            addCriterion("loc_char >=", value, "locChar");
            return (Criteria) this;
        }

        public Criteria andLocCharLessThan(String value) {
            addCriterion("loc_char <", value, "locChar");
            return (Criteria) this;
        }

        public Criteria andLocCharLessThanOrEqualTo(String value) {
            addCriterion("loc_char <=", value, "locChar");
            return (Criteria) this;
        }

        public Criteria andLocCharLike(String value) {
            addCriterion("loc_char like", value, "locChar");
            return (Criteria) this;
        }

        public Criteria andLocCharNotLike(String value) {
            addCriterion("loc_char not like", value, "locChar");
            return (Criteria) this;
        }

        public Criteria andLocCharIn(List<String> values) {
            addCriterion("loc_char in", values, "locChar");
            return (Criteria) this;
        }

        public Criteria andLocCharNotIn(List<String> values) {
            addCriterion("loc_char not in", values, "locChar");
            return (Criteria) this;
        }

        public Criteria andLocCharBetween(String value1, String value2) {
            addCriterion("loc_char between", value1, value2, "locChar");
            return (Criteria) this;
        }

        public Criteria andLocCharNotBetween(String value1, String value2) {
            addCriterion("loc_char not between", value1, value2, "locChar");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(Integer value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(Integer value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(Integer value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(Integer value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(Integer value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<Integer> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<Integer> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(Integer value1, Integer value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(Integer value1, Integer value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Integer value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Integer value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Integer value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Integer value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Integer value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Integer> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Integer> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Integer value1, Integer value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderLineNoIsNull() {
            addCriterion("order_line_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderLineNoIsNotNull() {
            addCriterion("order_line_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderLineNoEqualTo(Integer value) {
            addCriterion("order_line_no =", value, "orderLineNo");
            return (Criteria) this;
        }

        public Criteria andOrderLineNoNotEqualTo(Integer value) {
            addCriterion("order_line_no <>", value, "orderLineNo");
            return (Criteria) this;
        }

        public Criteria andOrderLineNoGreaterThan(Integer value) {
            addCriterion("order_line_no >", value, "orderLineNo");
            return (Criteria) this;
        }

        public Criteria andOrderLineNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_line_no >=", value, "orderLineNo");
            return (Criteria) this;
        }

        public Criteria andOrderLineNoLessThan(Integer value) {
            addCriterion("order_line_no <", value, "orderLineNo");
            return (Criteria) this;
        }

        public Criteria andOrderLineNoLessThanOrEqualTo(Integer value) {
            addCriterion("order_line_no <=", value, "orderLineNo");
            return (Criteria) this;
        }

        public Criteria andOrderLineNoIn(List<Integer> values) {
            addCriterion("order_line_no in", values, "orderLineNo");
            return (Criteria) this;
        }

        public Criteria andOrderLineNoNotIn(List<Integer> values) {
            addCriterion("order_line_no not in", values, "orderLineNo");
            return (Criteria) this;
        }

        public Criteria andOrderLineNoBetween(Integer value1, Integer value2) {
            addCriterion("order_line_no between", value1, value2, "orderLineNo");
            return (Criteria) this;
        }

        public Criteria andOrderLineNoNotBetween(Integer value1, Integer value2) {
            addCriterion("order_line_no not between", value1, value2, "orderLineNo");
            return (Criteria) this;
        }

        public Criteria andOpenQtyIsNull() {
            addCriterion("open_qty is null");
            return (Criteria) this;
        }

        public Criteria andOpenQtyIsNotNull() {
            addCriterion("open_qty is not null");
            return (Criteria) this;
        }

        public Criteria andOpenQtyEqualTo(Integer value) {
            addCriterion("open_qty =", value, "openQty");
            return (Criteria) this;
        }

        public Criteria andOpenQtyNotEqualTo(Integer value) {
            addCriterion("open_qty <>", value, "openQty");
            return (Criteria) this;
        }

        public Criteria andOpenQtyGreaterThan(Integer value) {
            addCriterion("open_qty >", value, "openQty");
            return (Criteria) this;
        }

        public Criteria andOpenQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("open_qty >=", value, "openQty");
            return (Criteria) this;
        }

        public Criteria andOpenQtyLessThan(Integer value) {
            addCriterion("open_qty <", value, "openQty");
            return (Criteria) this;
        }

        public Criteria andOpenQtyLessThanOrEqualTo(Integer value) {
            addCriterion("open_qty <=", value, "openQty");
            return (Criteria) this;
        }

        public Criteria andOpenQtyIn(List<Integer> values) {
            addCriterion("open_qty in", values, "openQty");
            return (Criteria) this;
        }

        public Criteria andOpenQtyNotIn(List<Integer> values) {
            addCriterion("open_qty not in", values, "openQty");
            return (Criteria) this;
        }

        public Criteria andOpenQtyBetween(Integer value1, Integer value2) {
            addCriterion("open_qty between", value1, value2, "openQty");
            return (Criteria) this;
        }

        public Criteria andOpenQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("open_qty not between", value1, value2, "openQty");
            return (Criteria) this;
        }

        public Criteria andEtaIsNull() {
            addCriterion("eta is null");
            return (Criteria) this;
        }

        public Criteria andEtaIsNotNull() {
            addCriterion("eta is not null");
            return (Criteria) this;
        }

        public Criteria andEtaEqualTo(Date value) {
            addCriterionForJDBCDate("eta =", value, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaNotEqualTo(Date value) {
            addCriterionForJDBCDate("eta <>", value, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaGreaterThan(Date value) {
            addCriterionForJDBCDate("eta >", value, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("eta >=", value, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaLessThan(Date value) {
            addCriterionForJDBCDate("eta <", value, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("eta <=", value, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaIn(List<Date> values) {
            addCriterionForJDBCDate("eta in", values, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaNotIn(List<Date> values) {
            addCriterionForJDBCDate("eta not in", values, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("eta between", value1, value2, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("eta not between", value1, value2, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaCodeIsNull() {
            addCriterion("eta_code is null");
            return (Criteria) this;
        }

        public Criteria andEtaCodeIsNotNull() {
            addCriterion("eta_code is not null");
            return (Criteria) this;
        }

        public Criteria andEtaCodeEqualTo(String value) {
            addCriterion("eta_code =", value, "etaCode");
            return (Criteria) this;
        }

        public Criteria andEtaCodeNotEqualTo(String value) {
            addCriterion("eta_code <>", value, "etaCode");
            return (Criteria) this;
        }

        public Criteria andEtaCodeGreaterThan(String value) {
            addCriterion("eta_code >", value, "etaCode");
            return (Criteria) this;
        }

        public Criteria andEtaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("eta_code >=", value, "etaCode");
            return (Criteria) this;
        }

        public Criteria andEtaCodeLessThan(String value) {
            addCriterion("eta_code <", value, "etaCode");
            return (Criteria) this;
        }

        public Criteria andEtaCodeLessThanOrEqualTo(String value) {
            addCriterion("eta_code <=", value, "etaCode");
            return (Criteria) this;
        }

        public Criteria andEtaCodeLike(String value) {
            addCriterion("eta_code like", value, "etaCode");
            return (Criteria) this;
        }

        public Criteria andEtaCodeNotLike(String value) {
            addCriterion("eta_code not like", value, "etaCode");
            return (Criteria) this;
        }

        public Criteria andEtaCodeIn(List<String> values) {
            addCriterion("eta_code in", values, "etaCode");
            return (Criteria) this;
        }

        public Criteria andEtaCodeNotIn(List<String> values) {
            addCriterion("eta_code not in", values, "etaCode");
            return (Criteria) this;
        }

        public Criteria andEtaCodeBetween(String value1, String value2) {
            addCriterion("eta_code between", value1, value2, "etaCode");
            return (Criteria) this;
        }

        public Criteria andEtaCodeNotBetween(String value1, String value2) {
            addCriterion("eta_code not between", value1, value2, "etaCode");
            return (Criteria) this;
        }

        public Criteria andMoqIsNull() {
            addCriterion("moq is null");
            return (Criteria) this;
        }

        public Criteria andMoqIsNotNull() {
            addCriterion("moq is not null");
            return (Criteria) this;
        }

        public Criteria andMoqEqualTo(Integer value) {
            addCriterion("moq =", value, "moq");
            return (Criteria) this;
        }

        public Criteria andMoqNotEqualTo(Integer value) {
            addCriterion("moq <>", value, "moq");
            return (Criteria) this;
        }

        public Criteria andMoqGreaterThan(Integer value) {
            addCriterion("moq >", value, "moq");
            return (Criteria) this;
        }

        public Criteria andMoqGreaterThanOrEqualTo(Integer value) {
            addCriterion("moq >=", value, "moq");
            return (Criteria) this;
        }

        public Criteria andMoqLessThan(Integer value) {
            addCriterion("moq <", value, "moq");
            return (Criteria) this;
        }

        public Criteria andMoqLessThanOrEqualTo(Integer value) {
            addCriterion("moq <=", value, "moq");
            return (Criteria) this;
        }

        public Criteria andMoqIn(List<Integer> values) {
            addCriterion("moq in", values, "moq");
            return (Criteria) this;
        }

        public Criteria andMoqNotIn(List<Integer> values) {
            addCriterion("moq not in", values, "moq");
            return (Criteria) this;
        }

        public Criteria andMoqBetween(Integer value1, Integer value2) {
            addCriterion("moq between", value1, value2, "moq");
            return (Criteria) this;
        }

        public Criteria andMoqNotBetween(Integer value1, Integer value2) {
            addCriterion("moq not between", value1, value2, "moq");
            return (Criteria) this;
        }

        public Criteria andEconQtyIsNull() {
            addCriterion("econ_qty is null");
            return (Criteria) this;
        }

        public Criteria andEconQtyIsNotNull() {
            addCriterion("econ_qty is not null");
            return (Criteria) this;
        }

        public Criteria andEconQtyEqualTo(Integer value) {
            addCriterion("econ_qty =", value, "econQty");
            return (Criteria) this;
        }

        public Criteria andEconQtyNotEqualTo(Integer value) {
            addCriterion("econ_qty <>", value, "econQty");
            return (Criteria) this;
        }

        public Criteria andEconQtyGreaterThan(Integer value) {
            addCriterion("econ_qty >", value, "econQty");
            return (Criteria) this;
        }

        public Criteria andEconQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("econ_qty >=", value, "econQty");
            return (Criteria) this;
        }

        public Criteria andEconQtyLessThan(Integer value) {
            addCriterion("econ_qty <", value, "econQty");
            return (Criteria) this;
        }

        public Criteria andEconQtyLessThanOrEqualTo(Integer value) {
            addCriterion("econ_qty <=", value, "econQty");
            return (Criteria) this;
        }

        public Criteria andEconQtyIn(List<Integer> values) {
            addCriterion("econ_qty in", values, "econQty");
            return (Criteria) this;
        }

        public Criteria andEconQtyNotIn(List<Integer> values) {
            addCriterion("econ_qty not in", values, "econQty");
            return (Criteria) this;
        }

        public Criteria andEconQtyBetween(Integer value1, Integer value2) {
            addCriterion("econ_qty between", value1, value2, "econQty");
            return (Criteria) this;
        }

        public Criteria andEconQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("econ_qty not between", value1, value2, "econQty");
            return (Criteria) this;
        }

        public Criteria andSysCostIsNull() {
            addCriterion("sys_cost is null");
            return (Criteria) this;
        }

        public Criteria andSysCostIsNotNull() {
            addCriterion("sys_cost is not null");
            return (Criteria) this;
        }

        public Criteria andSysCostEqualTo(BigDecimal value) {
            addCriterion("sys_cost =", value, "sysCost");
            return (Criteria) this;
        }

        public Criteria andSysCostNotEqualTo(BigDecimal value) {
            addCriterion("sys_cost <>", value, "sysCost");
            return (Criteria) this;
        }

        public Criteria andSysCostGreaterThan(BigDecimal value) {
            addCriterion("sys_cost >", value, "sysCost");
            return (Criteria) this;
        }

        public Criteria andSysCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sys_cost >=", value, "sysCost");
            return (Criteria) this;
        }

        public Criteria andSysCostLessThan(BigDecimal value) {
            addCriterion("sys_cost <", value, "sysCost");
            return (Criteria) this;
        }

        public Criteria andSysCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sys_cost <=", value, "sysCost");
            return (Criteria) this;
        }

        public Criteria andSysCostIn(List<BigDecimal> values) {
            addCriterion("sys_cost in", values, "sysCost");
            return (Criteria) this;
        }

        public Criteria andSysCostNotIn(List<BigDecimal> values) {
            addCriterion("sys_cost not in", values, "sysCost");
            return (Criteria) this;
        }

        public Criteria andSysCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sys_cost between", value1, value2, "sysCost");
            return (Criteria) this;
        }

        public Criteria andSysCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sys_cost not between", value1, value2, "sysCost");
            return (Criteria) this;
        }

        public Criteria andExtCostIsNull() {
            addCriterion("ext_cost is null");
            return (Criteria) this;
        }

        public Criteria andExtCostIsNotNull() {
            addCriterion("ext_cost is not null");
            return (Criteria) this;
        }

        public Criteria andExtCostEqualTo(BigDecimal value) {
            addCriterion("ext_cost =", value, "extCost");
            return (Criteria) this;
        }

        public Criteria andExtCostNotEqualTo(BigDecimal value) {
            addCriterion("ext_cost <>", value, "extCost");
            return (Criteria) this;
        }

        public Criteria andExtCostGreaterThan(BigDecimal value) {
            addCriterion("ext_cost >", value, "extCost");
            return (Criteria) this;
        }

        public Criteria andExtCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ext_cost >=", value, "extCost");
            return (Criteria) this;
        }

        public Criteria andExtCostLessThan(BigDecimal value) {
            addCriterion("ext_cost <", value, "extCost");
            return (Criteria) this;
        }

        public Criteria andExtCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ext_cost <=", value, "extCost");
            return (Criteria) this;
        }

        public Criteria andExtCostIn(List<BigDecimal> values) {
            addCriterion("ext_cost in", values, "extCost");
            return (Criteria) this;
        }

        public Criteria andExtCostNotIn(List<BigDecimal> values) {
            addCriterion("ext_cost not in", values, "extCost");
            return (Criteria) this;
        }

        public Criteria andExtCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ext_cost between", value1, value2, "extCost");
            return (Criteria) this;
        }

        public Criteria andExtCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ext_cost not between", value1, value2, "extCost");
            return (Criteria) this;
        }

        public Criteria andRegionNoIsNull() {
            addCriterion("region_no is null");
            return (Criteria) this;
        }

        public Criteria andRegionNoIsNotNull() {
            addCriterion("region_no is not null");
            return (Criteria) this;
        }

        public Criteria andRegionNoEqualTo(Integer value) {
            addCriterion("region_no =", value, "regionNo");
            return (Criteria) this;
        }

        public Criteria andRegionNoNotEqualTo(Integer value) {
            addCriterion("region_no <>", value, "regionNo");
            return (Criteria) this;
        }

        public Criteria andRegionNoGreaterThan(Integer value) {
            addCriterion("region_no >", value, "regionNo");
            return (Criteria) this;
        }

        public Criteria andRegionNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("region_no >=", value, "regionNo");
            return (Criteria) this;
        }

        public Criteria andRegionNoLessThan(Integer value) {
            addCriterion("region_no <", value, "regionNo");
            return (Criteria) this;
        }

        public Criteria andRegionNoLessThanOrEqualTo(Integer value) {
            addCriterion("region_no <=", value, "regionNo");
            return (Criteria) this;
        }

        public Criteria andRegionNoIn(List<Integer> values) {
            addCriterion("region_no in", values, "regionNo");
            return (Criteria) this;
        }

        public Criteria andRegionNoNotIn(List<Integer> values) {
            addCriterion("region_no not in", values, "regionNo");
            return (Criteria) this;
        }

        public Criteria andRegionNoBetween(Integer value1, Integer value2) {
            addCriterion("region_no between", value1, value2, "regionNo");
            return (Criteria) this;
        }

        public Criteria andRegionNoNotBetween(Integer value1, Integer value2) {
            addCriterion("region_no not between", value1, value2, "regionNo");
            return (Criteria) this;
        }

        public Criteria andRegionNameIsNull() {
            addCriterion("region_name is null");
            return (Criteria) this;
        }

        public Criteria andRegionNameIsNotNull() {
            addCriterion("region_name is not null");
            return (Criteria) this;
        }

        public Criteria andRegionNameEqualTo(String value) {
            addCriterion("region_name =", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameNotEqualTo(String value) {
            addCriterion("region_name <>", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameGreaterThan(String value) {
            addCriterion("region_name >", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameGreaterThanOrEqualTo(String value) {
            addCriterion("region_name >=", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameLessThan(String value) {
            addCriterion("region_name <", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameLessThanOrEqualTo(String value) {
            addCriterion("region_name <=", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameLike(String value) {
            addCriterion("region_name like", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameNotLike(String value) {
            addCriterion("region_name not like", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameIn(List<String> values) {
            addCriterion("region_name in", values, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameNotIn(List<String> values) {
            addCriterion("region_name not in", values, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameBetween(String value1, String value2) {
            addCriterion("region_name between", value1, value2, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameNotBetween(String value1, String value2) {
            addCriterion("region_name not between", value1, value2, "regionName");
            return (Criteria) this;
        }

        public Criteria andIqcQtyIsNull() {
            addCriterion("iqc_qty is null");
            return (Criteria) this;
        }

        public Criteria andIqcQtyIsNotNull() {
            addCriterion("iqc_qty is not null");
            return (Criteria) this;
        }

        public Criteria andIqcQtyEqualTo(Integer value) {
            addCriterion("iqc_qty =", value, "iqcQty");
            return (Criteria) this;
        }

        public Criteria andIqcQtyNotEqualTo(Integer value) {
            addCriterion("iqc_qty <>", value, "iqcQty");
            return (Criteria) this;
        }

        public Criteria andIqcQtyGreaterThan(Integer value) {
            addCriterion("iqc_qty >", value, "iqcQty");
            return (Criteria) this;
        }

        public Criteria andIqcQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("iqc_qty >=", value, "iqcQty");
            return (Criteria) this;
        }

        public Criteria andIqcQtyLessThan(Integer value) {
            addCriterion("iqc_qty <", value, "iqcQty");
            return (Criteria) this;
        }

        public Criteria andIqcQtyLessThanOrEqualTo(Integer value) {
            addCriterion("iqc_qty <=", value, "iqcQty");
            return (Criteria) this;
        }

        public Criteria andIqcQtyIn(List<Integer> values) {
            addCriterion("iqc_qty in", values, "iqcQty");
            return (Criteria) this;
        }

        public Criteria andIqcQtyNotIn(List<Integer> values) {
            addCriterion("iqc_qty not in", values, "iqcQty");
            return (Criteria) this;
        }

        public Criteria andIqcQtyBetween(Integer value1, Integer value2) {
            addCriterion("iqc_qty between", value1, value2, "iqcQty");
            return (Criteria) this;
        }

        public Criteria andIqcQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("iqc_qty not between", value1, value2, "iqcQty");
            return (Criteria) this;
        }

        public Criteria andRtvnQtyIsNull() {
            addCriterion("rtvn_qty is null");
            return (Criteria) this;
        }

        public Criteria andRtvnQtyIsNotNull() {
            addCriterion("rtvn_qty is not null");
            return (Criteria) this;
        }

        public Criteria andRtvnQtyEqualTo(Integer value) {
            addCriterion("rtvn_qty =", value, "rtvnQty");
            return (Criteria) this;
        }

        public Criteria andRtvnQtyNotEqualTo(Integer value) {
            addCriterion("rtvn_qty <>", value, "rtvnQty");
            return (Criteria) this;
        }

        public Criteria andRtvnQtyGreaterThan(Integer value) {
            addCriterion("rtvn_qty >", value, "rtvnQty");
            return (Criteria) this;
        }

        public Criteria andRtvnQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("rtvn_qty >=", value, "rtvnQty");
            return (Criteria) this;
        }

        public Criteria andRtvnQtyLessThan(Integer value) {
            addCriterion("rtvn_qty <", value, "rtvnQty");
            return (Criteria) this;
        }

        public Criteria andRtvnQtyLessThanOrEqualTo(Integer value) {
            addCriterion("rtvn_qty <=", value, "rtvnQty");
            return (Criteria) this;
        }

        public Criteria andRtvnQtyIn(List<Integer> values) {
            addCriterion("rtvn_qty in", values, "rtvnQty");
            return (Criteria) this;
        }

        public Criteria andRtvnQtyNotIn(List<Integer> values) {
            addCriterion("rtvn_qty not in", values, "rtvnQty");
            return (Criteria) this;
        }

        public Criteria andRtvnQtyBetween(Integer value1, Integer value2) {
            addCriterion("rtvn_qty between", value1, value2, "rtvnQty");
            return (Criteria) this;
        }

        public Criteria andRtvnQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("rtvn_qty not between", value1, value2, "rtvnQty");
            return (Criteria) this;
        }

        public Criteria andHVersionIsNull() {
            addCriterion("h_version is null");
            return (Criteria) this;
        }

        public Criteria andHVersionIsNotNull() {
            addCriterion("h_version is not null");
            return (Criteria) this;
        }

        public Criteria andHVersionEqualTo(Integer value) {
            addCriterion("h_version =", value, "hVersion");
            return (Criteria) this;
        }

        public Criteria andHVersionNotEqualTo(Integer value) {
            addCriterion("h_version <>", value, "hVersion");
            return (Criteria) this;
        }

        public Criteria andHVersionGreaterThan(Integer value) {
            addCriterion("h_version >", value, "hVersion");
            return (Criteria) this;
        }

        public Criteria andHVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_version >=", value, "hVersion");
            return (Criteria) this;
        }

        public Criteria andHVersionLessThan(Integer value) {
            addCriterion("h_version <", value, "hVersion");
            return (Criteria) this;
        }

        public Criteria andHVersionLessThanOrEqualTo(Integer value) {
            addCriterion("h_version <=", value, "hVersion");
            return (Criteria) this;
        }

        public Criteria andHVersionIn(List<Integer> values) {
            addCriterion("h_version in", values, "hVersion");
            return (Criteria) this;
        }

        public Criteria andHVersionNotIn(List<Integer> values) {
            addCriterion("h_version not in", values, "hVersion");
            return (Criteria) this;
        }

        public Criteria andHVersionBetween(Integer value1, Integer value2) {
            addCriterion("h_version between", value1, value2, "hVersion");
            return (Criteria) this;
        }

        public Criteria andHVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("h_version not between", value1, value2, "hVersion");
            return (Criteria) this;
        }

        public Criteria andEntryIdIsNull() {
            addCriterion("entry_id is null");
            return (Criteria) this;
        }

        public Criteria andEntryIdIsNotNull() {
            addCriterion("entry_id is not null");
            return (Criteria) this;
        }

        public Criteria andEntryIdEqualTo(Integer value) {
            addCriterion("entry_id =", value, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdNotEqualTo(Integer value) {
            addCriterion("entry_id <>", value, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdGreaterThan(Integer value) {
            addCriterion("entry_id >", value, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("entry_id >=", value, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdLessThan(Integer value) {
            addCriterion("entry_id <", value, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdLessThanOrEqualTo(Integer value) {
            addCriterion("entry_id <=", value, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdIn(List<Integer> values) {
            addCriterion("entry_id in", values, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdNotIn(List<Integer> values) {
            addCriterion("entry_id not in", values, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdBetween(Integer value1, Integer value2) {
            addCriterion("entry_id between", value1, value2, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("entry_id not between", value1, value2, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryDatetimeIsNull() {
            addCriterion("entry_datetime is null");
            return (Criteria) this;
        }

        public Criteria andEntryDatetimeIsNotNull() {
            addCriterion("entry_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andEntryDatetimeEqualTo(Date value) {
            addCriterion("entry_datetime =", value, "entryDatetime");
            return (Criteria) this;
        }

        public Criteria andEntryDatetimeNotEqualTo(Date value) {
            addCriterion("entry_datetime <>", value, "entryDatetime");
            return (Criteria) this;
        }

        public Criteria andEntryDatetimeGreaterThan(Date value) {
            addCriterion("entry_datetime >", value, "entryDatetime");
            return (Criteria) this;
        }

        public Criteria andEntryDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("entry_datetime >=", value, "entryDatetime");
            return (Criteria) this;
        }

        public Criteria andEntryDatetimeLessThan(Date value) {
            addCriterion("entry_datetime <", value, "entryDatetime");
            return (Criteria) this;
        }

        public Criteria andEntryDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("entry_datetime <=", value, "entryDatetime");
            return (Criteria) this;
        }

        public Criteria andEntryDatetimeIn(List<Date> values) {
            addCriterion("entry_datetime in", values, "entryDatetime");
            return (Criteria) this;
        }

        public Criteria andEntryDatetimeNotIn(List<Date> values) {
            addCriterion("entry_datetime not in", values, "entryDatetime");
            return (Criteria) this;
        }

        public Criteria andEntryDatetimeBetween(Date value1, Date value2) {
            addCriterion("entry_datetime between", value1, value2, "entryDatetime");
            return (Criteria) this;
        }

        public Criteria andEntryDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("entry_datetime not between", value1, value2, "entryDatetime");
            return (Criteria) this;
        }

        public Criteria andPpdcNewCustNoIsNull() {
            addCriterion("ppdc_new_cust_no is null");
            return (Criteria) this;
        }

        public Criteria andPpdcNewCustNoIsNotNull() {
            addCriterion("ppdc_new_cust_no is not null");
            return (Criteria) this;
        }

        public Criteria andPpdcNewCustNoEqualTo(Integer value) {
            addCriterion("ppdc_new_cust_no =", value, "ppdcNewCustNo");
            return (Criteria) this;
        }

        public Criteria andPpdcNewCustNoNotEqualTo(Integer value) {
            addCriterion("ppdc_new_cust_no <>", value, "ppdcNewCustNo");
            return (Criteria) this;
        }

        public Criteria andPpdcNewCustNoGreaterThan(Integer value) {
            addCriterion("ppdc_new_cust_no >", value, "ppdcNewCustNo");
            return (Criteria) this;
        }

        public Criteria andPpdcNewCustNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ppdc_new_cust_no >=", value, "ppdcNewCustNo");
            return (Criteria) this;
        }

        public Criteria andPpdcNewCustNoLessThan(Integer value) {
            addCriterion("ppdc_new_cust_no <", value, "ppdcNewCustNo");
            return (Criteria) this;
        }

        public Criteria andPpdcNewCustNoLessThanOrEqualTo(Integer value) {
            addCriterion("ppdc_new_cust_no <=", value, "ppdcNewCustNo");
            return (Criteria) this;
        }

        public Criteria andPpdcNewCustNoIn(List<Integer> values) {
            addCriterion("ppdc_new_cust_no in", values, "ppdcNewCustNo");
            return (Criteria) this;
        }

        public Criteria andPpdcNewCustNoNotIn(List<Integer> values) {
            addCriterion("ppdc_new_cust_no not in", values, "ppdcNewCustNo");
            return (Criteria) this;
        }

        public Criteria andPpdcNewCustNoBetween(Integer value1, Integer value2) {
            addCriterion("ppdc_new_cust_no between", value1, value2, "ppdcNewCustNo");
            return (Criteria) this;
        }

        public Criteria andPpdcNewCustNoNotBetween(Integer value1, Integer value2) {
            addCriterion("ppdc_new_cust_no not between", value1, value2, "ppdcNewCustNo");
            return (Criteria) this;
        }

        public Criteria andPpdcNewLocNoIsNull() {
            addCriterion("ppdc_new_loc_no is null");
            return (Criteria) this;
        }

        public Criteria andPpdcNewLocNoIsNotNull() {
            addCriterion("ppdc_new_loc_no is not null");
            return (Criteria) this;
        }

        public Criteria andPpdcNewLocNoEqualTo(Integer value) {
            addCriterion("ppdc_new_loc_no =", value, "ppdcNewLocNo");
            return (Criteria) this;
        }

        public Criteria andPpdcNewLocNoNotEqualTo(Integer value) {
            addCriterion("ppdc_new_loc_no <>", value, "ppdcNewLocNo");
            return (Criteria) this;
        }

        public Criteria andPpdcNewLocNoGreaterThan(Integer value) {
            addCriterion("ppdc_new_loc_no >", value, "ppdcNewLocNo");
            return (Criteria) this;
        }

        public Criteria andPpdcNewLocNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ppdc_new_loc_no >=", value, "ppdcNewLocNo");
            return (Criteria) this;
        }

        public Criteria andPpdcNewLocNoLessThan(Integer value) {
            addCriterion("ppdc_new_loc_no <", value, "ppdcNewLocNo");
            return (Criteria) this;
        }

        public Criteria andPpdcNewLocNoLessThanOrEqualTo(Integer value) {
            addCriterion("ppdc_new_loc_no <=", value, "ppdcNewLocNo");
            return (Criteria) this;
        }

        public Criteria andPpdcNewLocNoIn(List<Integer> values) {
            addCriterion("ppdc_new_loc_no in", values, "ppdcNewLocNo");
            return (Criteria) this;
        }

        public Criteria andPpdcNewLocNoNotIn(List<Integer> values) {
            addCriterion("ppdc_new_loc_no not in", values, "ppdcNewLocNo");
            return (Criteria) this;
        }

        public Criteria andPpdcNewLocNoBetween(Integer value1, Integer value2) {
            addCriterion("ppdc_new_loc_no between", value1, value2, "ppdcNewLocNo");
            return (Criteria) this;
        }

        public Criteria andPpdcNewLocNoNotBetween(Integer value1, Integer value2) {
            addCriterion("ppdc_new_loc_no not between", value1, value2, "ppdcNewLocNo");
            return (Criteria) this;
        }

        public Criteria andPpdcNewRegionNoIsNull() {
            addCriterion("ppdc_new_region_no is null");
            return (Criteria) this;
        }

        public Criteria andPpdcNewRegionNoIsNotNull() {
            addCriterion("ppdc_new_region_no is not null");
            return (Criteria) this;
        }

        public Criteria andPpdcNewRegionNoEqualTo(Integer value) {
            addCriterion("ppdc_new_region_no =", value, "ppdcNewRegionNo");
            return (Criteria) this;
        }

        public Criteria andPpdcNewRegionNoNotEqualTo(Integer value) {
            addCriterion("ppdc_new_region_no <>", value, "ppdcNewRegionNo");
            return (Criteria) this;
        }

        public Criteria andPpdcNewRegionNoGreaterThan(Integer value) {
            addCriterion("ppdc_new_region_no >", value, "ppdcNewRegionNo");
            return (Criteria) this;
        }

        public Criteria andPpdcNewRegionNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ppdc_new_region_no >=", value, "ppdcNewRegionNo");
            return (Criteria) this;
        }

        public Criteria andPpdcNewRegionNoLessThan(Integer value) {
            addCriterion("ppdc_new_region_no <", value, "ppdcNewRegionNo");
            return (Criteria) this;
        }

        public Criteria andPpdcNewRegionNoLessThanOrEqualTo(Integer value) {
            addCriterion("ppdc_new_region_no <=", value, "ppdcNewRegionNo");
            return (Criteria) this;
        }

        public Criteria andPpdcNewRegionNoIn(List<Integer> values) {
            addCriterion("ppdc_new_region_no in", values, "ppdcNewRegionNo");
            return (Criteria) this;
        }

        public Criteria andPpdcNewRegionNoNotIn(List<Integer> values) {
            addCriterion("ppdc_new_region_no not in", values, "ppdcNewRegionNo");
            return (Criteria) this;
        }

        public Criteria andPpdcNewRegionNoBetween(Integer value1, Integer value2) {
            addCriterion("ppdc_new_region_no between", value1, value2, "ppdcNewRegionNo");
            return (Criteria) this;
        }

        public Criteria andPpdcNewRegionNoNotBetween(Integer value1, Integer value2) {
            addCriterion("ppdc_new_region_no not between", value1, value2, "ppdcNewRegionNo");
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