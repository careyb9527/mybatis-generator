package com.chaihuow.ch.model.erp.goods;

public class ChTypePropertyRel {
    private Integer relId;

    private Integer chTypeId;

    private Integer propertyId;

    private Integer propertyValue;

    private Integer operId;

    private String operUser;

    private String operTime;

    public Integer getRelId() {
        return relId;
    }

    public void setRelId(Integer relId) {
        this.relId = relId;
    }

    public Integer getChTypeId() {
        return chTypeId;
    }

    public void setChTypeId(Integer chTypeId) {
        this.chTypeId = chTypeId;
    }

    public Integer getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    public Integer getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(Integer propertyValue) {
        this.propertyValue = propertyValue;
    }

    public Integer getOperId() {
        return operId;
    }

    public void setOperId(Integer operId) {
        this.operId = operId;
    }

    public String getOperUser() {
        return operUser;
    }

    public void setOperUser(String operUser) {
        this.operUser = operUser == null ? null : operUser.trim();
    }

    public String getOperTime() {
        return operTime;
    }

    public void setOperTime(String operTime) {
        this.operTime = operTime == null ? null : operTime.trim();
    }
}