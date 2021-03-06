package com.mmall.vo;

import java.math.BigDecimal;

/**
 * @Author: fanhao
 * @Date: 2018/10/5 21:48
 * @Version 1.0
 */
public class ProductListVo {

    private Integer id;
    private Integer categoryId;
    private String name;
    private String subtitle;
    private String mianImage;
    private BigDecimal price;
    private Integer status;

    private String imageHost;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getMianImage() {
        return mianImage;
    }

    public void setMianImage(String mianImage) {
        this.mianImage = mianImage;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getImageHost() {
        return imageHost;
    }

    public void setImageHost(String imageHost) {
        this.imageHost = imageHost;
    }
}
