package com.gvt.ruleengine.drool;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FpmlMessage implements Serializable
{
    public String messageId;
    public String reportType ;
    public String isdaProduct;
    public String eventType;
    public String message;
    public List<String> xpaths=  new ArrayList<String>();

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getReportType()
    {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getIsdaProduct()
    {
        return isdaProduct;
    }

    public void setIsdaProduct(String isdaProduct) {
        this.isdaProduct = isdaProduct;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public List<String> getXpaths() {
        return xpaths;
    }

    public void setXpaths(List<String> xpaths) {
        this.xpaths = xpaths;
    }

    @Override
    public String toString() {
        return "FpmlMessage : [ " +
                "messageId='" + messageId + '\'' +
                ", reportType='" + reportType + '\'' +
                ", isdaProduct='" + isdaProduct + '\'' +
                ", eventType='" + eventType + '\'' +
                ", xpaths=" + xpaths +
                 ']';
    }

    public FpmlMessage()
    { super(); }

    public FpmlMessage( String reportType, String isdaProduct, String eventType , String message)
    {
        this.messageId = ""+ UUID.randomUUID();
        this.reportType = reportType;
        this.isdaProduct = isdaProduct;
        this.eventType = eventType;
        this.message=message;
    }
}
