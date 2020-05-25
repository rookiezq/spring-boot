package com.rookied.springboot.entity;

import java.util.List;

/**
 * @author zhangqiang
 * @date 2020/5/22
 */
public class PageBean<T> {
    /**
     * 当前页
     */
    private long total;
    /**
     * 当前页记录
     */
    private List<T> rows;

    public PageBean(long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
