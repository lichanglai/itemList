package com.imooc.emus;

import java.util.HashMap;
import java.util.Map;

public enum EnumStoreId {
    FUTURE_STORE_ONLINE(2L, "未来店线上单"),
    FUTURE_STORE_OFFLINE(100000L, "未来店线下单"),
    STAR_STORE_ONLINE(1L, "星选线上单"),
    STAR_STORE_OFFLINE(100L, "星选线下单"),
    STAR_STORE_BUYING(101L, "集采线上单");

    private Long key;

    private String value;

    public Long getKey() {
        return key;
    }

    public void setKey(Long key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    EnumStoreId(Long key, String value) {
        this.key = key;
        this.value = value;
    }

    public static Map<Long, String> toMap() {
        Map<Long, String> enumDataMap = new HashMap<Long, String>();
        for (EnumStoreId attrValType : values()) {
            enumDataMap.put(attrValType.getKey(), attrValType.getValue());
        }
        return enumDataMap;
    }
}
