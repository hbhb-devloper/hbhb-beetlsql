package com.hbhb.beetlsql.core;

import org.beetl.sql.core.query.interfacer.StrongValue;
import org.springframework.util.StringUtils;

/**
 * 查询扩展类
 *
 * @author xiaokang
 * @since 2020-12-16
 */
public class QueryExt {

    public static StrongValue filterLikeEmpty(String value) {
        return new StrongValue() {
            @Override
            public boolean isEffective() {
                return !StringUtils.isEmpty(value);
            }

            @Override
            public Object getValue() {
                return "%" + value + "%";
            }
        };
    }
}
