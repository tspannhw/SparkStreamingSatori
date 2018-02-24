package com.palwell;

import scala.Int;

import java.util.Date;

public class JavaRow implements java.io.Serializable {
    @Override
    public String toString() {
        return "JavaRow{" +
                "exchange='" + exchange + '\'' +
                ", cryptocurrency='" + cryptocurrency + '\'' +
                ", basecurrency='" + basecurrency + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", bid=" + bid +
                ", ask=" + ask +
                ", open=" + open +
                ", high=" + high +
                ", low=" + low +
                ", volume=" + volume +
                ", timestamp=" + timestamp +
                '}';
    }
    private String exchange;
    private String cryptocurrency;
    private String basecurrency;
    private String type;
    private Double price;
    private String size;
    private Double bid;
    private Double ask;
    private Double open;
    private Double high;
    private Double low;
    private Double volume;
    private Date timestamp;

    public String getExchange() {
        return exchange;
    }

    public String getCryptocurrency() {
        return cryptocurrency;
    }

    public String getBasecurrency() {
        return basecurrency;
    }

    public String getType() {
        return type;
    }

    public Double getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public Double getBid() {
        return bid;
    }

    public Double getAsk() {
        return ask;
    }

    public Double getOpen() {
        return open;
    }

    public Double getHigh() {
        return high;
    }

    public Double getLow() {
        return low;
    }

    public Double getVolume() {
        return volume;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public void setCryptocurrency(String cryptocurrency) {
        this.cryptocurrency = cryptocurrency;
    }

    public void setBasecurrency(String basecurrency) {
        this.basecurrency = basecurrency;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setBid(Double bid) {
        this.bid = bid;
    }

    public void setAsk(Double ask) {
        this.ask = ask;
    }

    public void setOpen(Double open) {
        this.open = open;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

    public void setLow(Double low) {
        this.low = low;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}