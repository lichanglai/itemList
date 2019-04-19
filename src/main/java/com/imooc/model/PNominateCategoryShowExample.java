package com.imooc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PNominateCategoryShowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PNominateCategoryShowExample() {
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

        public Criteria andShowIdIsNull() {
            addCriterion("show_id is null");
            return (Criteria) this;
        }

        public Criteria andShowIdIsNotNull() {
            addCriterion("show_id is not null");
            return (Criteria) this;
        }

        public Criteria andShowIdEqualTo(Integer value) {
            addCriterion("show_id =", value, "showId");
            return (Criteria) this;
        }

        public Criteria andShowIdNotEqualTo(Integer value) {
            addCriterion("show_id <>", value, "showId");
            return (Criteria) this;
        }

        public Criteria andShowIdGreaterThan(Integer value) {
            addCriterion("show_id >", value, "showId");
            return (Criteria) this;
        }

        public Criteria andShowIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("show_id >=", value, "showId");
            return (Criteria) this;
        }

        public Criteria andShowIdLessThan(Integer value) {
            addCriterion("show_id <", value, "showId");
            return (Criteria) this;
        }

        public Criteria andShowIdLessThanOrEqualTo(Integer value) {
            addCriterion("show_id <=", value, "showId");
            return (Criteria) this;
        }

        public Criteria andShowIdIn(List<Integer> values) {
            addCriterion("show_id in", values, "showId");
            return (Criteria) this;
        }

        public Criteria andShowIdNotIn(List<Integer> values) {
            addCriterion("show_id not in", values, "showId");
            return (Criteria) this;
        }

        public Criteria andShowIdBetween(Integer value1, Integer value2) {
            addCriterion("show_id between", value1, value2, "showId");
            return (Criteria) this;
        }

        public Criteria andShowIdNotBetween(Integer value1, Integer value2) {
            addCriterion("show_id not between", value1, value2, "showId");
            return (Criteria) this;
        }

        public Criteria andProductSpuIsNull() {
            addCriterion("product_spu is null");
            return (Criteria) this;
        }

        public Criteria andProductSpuIsNotNull() {
            addCriterion("product_spu is not null");
            return (Criteria) this;
        }

        public Criteria andProductSpuEqualTo(String value) {
            addCriterion("product_spu =", value, "productSpu");
            return (Criteria) this;
        }

        public Criteria andProductSpuNotEqualTo(String value) {
            addCriterion("product_spu <>", value, "productSpu");
            return (Criteria) this;
        }

        public Criteria andProductSpuGreaterThan(String value) {
            addCriterion("product_spu >", value, "productSpu");
            return (Criteria) this;
        }

        public Criteria andProductSpuGreaterThanOrEqualTo(String value) {
            addCriterion("product_spu >=", value, "productSpu");
            return (Criteria) this;
        }

        public Criteria andProductSpuLessThan(String value) {
            addCriterion("product_spu <", value, "productSpu");
            return (Criteria) this;
        }

        public Criteria andProductSpuLessThanOrEqualTo(String value) {
            addCriterion("product_spu <=", value, "productSpu");
            return (Criteria) this;
        }

        public Criteria andProductSpuLike(String value) {
            addCriterion("product_spu like", value, "productSpu");
            return (Criteria) this;
        }

        public Criteria andProductSpuNotLike(String value) {
            addCriterion("product_spu not like", value, "productSpu");
            return (Criteria) this;
        }

        public Criteria andProductSpuIn(List<String> values) {
            addCriterion("product_spu in", values, "productSpu");
            return (Criteria) this;
        }

        public Criteria andProductSpuNotIn(List<String> values) {
            addCriterion("product_spu not in", values, "productSpu");
            return (Criteria) this;
        }

        public Criteria andProductSpuBetween(String value1, String value2) {
            addCriterion("product_spu between", value1, value2, "productSpu");
            return (Criteria) this;
        }

        public Criteria andProductSpuNotBetween(String value1, String value2) {
            addCriterion("product_spu not between", value1, value2, "productSpu");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryIdIsNull() {
            addCriterion("base_category_id is null");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryIdIsNotNull() {
            addCriterion("base_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryIdEqualTo(Integer value) {
            addCriterion("base_category_id =", value, "baseCategoryId");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryIdNotEqualTo(Integer value) {
            addCriterion("base_category_id <>", value, "baseCategoryId");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryIdGreaterThan(Integer value) {
            addCriterion("base_category_id >", value, "baseCategoryId");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("base_category_id >=", value, "baseCategoryId");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryIdLessThan(Integer value) {
            addCriterion("base_category_id <", value, "baseCategoryId");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("base_category_id <=", value, "baseCategoryId");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryIdIn(List<Integer> values) {
            addCriterion("base_category_id in", values, "baseCategoryId");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryIdNotIn(List<Integer> values) {
            addCriterion("base_category_id not in", values, "baseCategoryId");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("base_category_id between", value1, value2, "baseCategoryId");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("base_category_id not between", value1, value2, "baseCategoryId");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryNameIsNull() {
            addCriterion("base_category_name is null");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryNameIsNotNull() {
            addCriterion("base_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryNameEqualTo(String value) {
            addCriterion("base_category_name =", value, "baseCategoryName");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryNameNotEqualTo(String value) {
            addCriterion("base_category_name <>", value, "baseCategoryName");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryNameGreaterThan(String value) {
            addCriterion("base_category_name >", value, "baseCategoryName");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("base_category_name >=", value, "baseCategoryName");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryNameLessThan(String value) {
            addCriterion("base_category_name <", value, "baseCategoryName");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("base_category_name <=", value, "baseCategoryName");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryNameLike(String value) {
            addCriterion("base_category_name like", value, "baseCategoryName");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryNameNotLike(String value) {
            addCriterion("base_category_name not like", value, "baseCategoryName");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryNameIn(List<String> values) {
            addCriterion("base_category_name in", values, "baseCategoryName");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryNameNotIn(List<String> values) {
            addCriterion("base_category_name not in", values, "baseCategoryName");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryNameBetween(String value1, String value2) {
            addCriterion("base_category_name between", value1, value2, "baseCategoryName");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryNameNotBetween(String value1, String value2) {
            addCriterion("base_category_name not between", value1, value2, "baseCategoryName");
            return (Criteria) this;
        }

        public Criteria andSubCategoryIdIsNull() {
            addCriterion("sub_category_id is null");
            return (Criteria) this;
        }

        public Criteria andSubCategoryIdIsNotNull() {
            addCriterion("sub_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubCategoryIdEqualTo(Integer value) {
            addCriterion("sub_category_id =", value, "subCategoryId");
            return (Criteria) this;
        }

        public Criteria andSubCategoryIdNotEqualTo(Integer value) {
            addCriterion("sub_category_id <>", value, "subCategoryId");
            return (Criteria) this;
        }

        public Criteria andSubCategoryIdGreaterThan(Integer value) {
            addCriterion("sub_category_id >", value, "subCategoryId");
            return (Criteria) this;
        }

        public Criteria andSubCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sub_category_id >=", value, "subCategoryId");
            return (Criteria) this;
        }

        public Criteria andSubCategoryIdLessThan(Integer value) {
            addCriterion("sub_category_id <", value, "subCategoryId");
            return (Criteria) this;
        }

        public Criteria andSubCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("sub_category_id <=", value, "subCategoryId");
            return (Criteria) this;
        }

        public Criteria andSubCategoryIdIn(List<Integer> values) {
            addCriterion("sub_category_id in", values, "subCategoryId");
            return (Criteria) this;
        }

        public Criteria andSubCategoryIdNotIn(List<Integer> values) {
            addCriterion("sub_category_id not in", values, "subCategoryId");
            return (Criteria) this;
        }

        public Criteria andSubCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("sub_category_id between", value1, value2, "subCategoryId");
            return (Criteria) this;
        }

        public Criteria andSubCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sub_category_id not between", value1, value2, "subCategoryId");
            return (Criteria) this;
        }

        public Criteria andSubCategoryNameIsNull() {
            addCriterion("sub_category_name is null");
            return (Criteria) this;
        }

        public Criteria andSubCategoryNameIsNotNull() {
            addCriterion("sub_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubCategoryNameEqualTo(String value) {
            addCriterion("sub_category_name =", value, "subCategoryName");
            return (Criteria) this;
        }

        public Criteria andSubCategoryNameNotEqualTo(String value) {
            addCriterion("sub_category_name <>", value, "subCategoryName");
            return (Criteria) this;
        }

        public Criteria andSubCategoryNameGreaterThan(String value) {
            addCriterion("sub_category_name >", value, "subCategoryName");
            return (Criteria) this;
        }

        public Criteria andSubCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("sub_category_name >=", value, "subCategoryName");
            return (Criteria) this;
        }

        public Criteria andSubCategoryNameLessThan(String value) {
            addCriterion("sub_category_name <", value, "subCategoryName");
            return (Criteria) this;
        }

        public Criteria andSubCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("sub_category_name <=", value, "subCategoryName");
            return (Criteria) this;
        }

        public Criteria andSubCategoryNameLike(String value) {
            addCriterion("sub_category_name like", value, "subCategoryName");
            return (Criteria) this;
        }

        public Criteria andSubCategoryNameNotLike(String value) {
            addCriterion("sub_category_name not like", value, "subCategoryName");
            return (Criteria) this;
        }

        public Criteria andSubCategoryNameIn(List<String> values) {
            addCriterion("sub_category_name in", values, "subCategoryName");
            return (Criteria) this;
        }

        public Criteria andSubCategoryNameNotIn(List<String> values) {
            addCriterion("sub_category_name not in", values, "subCategoryName");
            return (Criteria) this;
        }

        public Criteria andSubCategoryNameBetween(String value1, String value2) {
            addCriterion("sub_category_name between", value1, value2, "subCategoryName");
            return (Criteria) this;
        }

        public Criteria andSubCategoryNameNotBetween(String value1, String value2) {
            addCriterion("sub_category_name not between", value1, value2, "subCategoryName");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderIsNull() {
            addCriterion("display_order is null");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderIsNotNull() {
            addCriterion("display_order is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderEqualTo(Integer value) {
            addCriterion("display_order =", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderNotEqualTo(Integer value) {
            addCriterion("display_order <>", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderGreaterThan(Integer value) {
            addCriterion("display_order >", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("display_order >=", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderLessThan(Integer value) {
            addCriterion("display_order <", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderLessThanOrEqualTo(Integer value) {
            addCriterion("display_order <=", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderIn(List<Integer> values) {
            addCriterion("display_order in", values, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderNotIn(List<Integer> values) {
            addCriterion("display_order not in", values, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderBetween(Integer value1, Integer value2) {
            addCriterion("display_order between", value1, value2, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("display_order not between", value1, value2, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andBizTypeIsNull() {
            addCriterion("biz_type is null");
            return (Criteria) this;
        }

        public Criteria andBizTypeIsNotNull() {
            addCriterion("biz_type is not null");
            return (Criteria) this;
        }

        public Criteria andBizTypeEqualTo(String value) {
            addCriterion("biz_type =", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotEqualTo(String value) {
            addCriterion("biz_type <>", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThan(String value) {
            addCriterion("biz_type >", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThanOrEqualTo(String value) {
            addCriterion("biz_type >=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThan(String value) {
            addCriterion("biz_type <", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThanOrEqualTo(String value) {
            addCriterion("biz_type <=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLike(String value) {
            addCriterion("biz_type like", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotLike(String value) {
            addCriterion("biz_type not like", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeIn(List<String> values) {
            addCriterion("biz_type in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotIn(List<String> values) {
            addCriterion("biz_type not in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeBetween(String value1, String value2) {
            addCriterion("biz_type between", value1, value2, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotBetween(String value1, String value2) {
            addCriterion("biz_type not between", value1, value2, "bizType");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorIsNull() {
            addCriterion("create_operator is null");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorIsNotNull() {
            addCriterion("create_operator is not null");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorEqualTo(String value) {
            addCriterion("create_operator =", value, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorNotEqualTo(String value) {
            addCriterion("create_operator <>", value, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorGreaterThan(String value) {
            addCriterion("create_operator >", value, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("create_operator >=", value, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorLessThan(String value) {
            addCriterion("create_operator <", value, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorLessThanOrEqualTo(String value) {
            addCriterion("create_operator <=", value, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorLike(String value) {
            addCriterion("create_operator like", value, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorNotLike(String value) {
            addCriterion("create_operator not like", value, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorIn(List<String> values) {
            addCriterion("create_operator in", values, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorNotIn(List<String> values) {
            addCriterion("create_operator not in", values, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorBetween(String value1, String value2) {
            addCriterion("create_operator between", value1, value2, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorNotBetween(String value1, String value2) {
            addCriterion("create_operator not between", value1, value2, "createOperator");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorIsNull() {
            addCriterion("update_operator is null");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorIsNotNull() {
            addCriterion("update_operator is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorEqualTo(String value) {
            addCriterion("update_operator =", value, "updateOperator");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorNotEqualTo(String value) {
            addCriterion("update_operator <>", value, "updateOperator");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorGreaterThan(String value) {
            addCriterion("update_operator >", value, "updateOperator");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("update_operator >=", value, "updateOperator");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorLessThan(String value) {
            addCriterion("update_operator <", value, "updateOperator");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorLessThanOrEqualTo(String value) {
            addCriterion("update_operator <=", value, "updateOperator");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorLike(String value) {
            addCriterion("update_operator like", value, "updateOperator");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorNotLike(String value) {
            addCriterion("update_operator not like", value, "updateOperator");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorIn(List<String> values) {
            addCriterion("update_operator in", values, "updateOperator");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorNotIn(List<String> values) {
            addCriterion("update_operator not in", values, "updateOperator");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorBetween(String value1, String value2) {
            addCriterion("update_operator between", value1, value2, "updateOperator");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorNotBetween(String value1, String value2) {
            addCriterion("update_operator not between", value1, value2, "updateOperator");
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