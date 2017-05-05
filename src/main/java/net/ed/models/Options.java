package net.ed.models;
/*
  Inspired by LaunchCode
  Created by Edward Dupre
  Copyright 2017
 */

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Entity
public class Options {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=1, max=10)
    private String stockSymbol;

    @Size(min=1)
    private Double stockPrice;

    @Size(min=1)
    private Character exch;

    @Size(min=1)
    private String optnSymbol;

    @Size(min=1)
    private Character blank;

    @Size(min=1)
    private String optnType;

    @Size(min=1)
    private Date exprDate;

    @Size(min=1)
    private Date dataDate;

    @Size(min=1)
    private Double strike;

    @Size(min=1)
    private Double lst;

    @Size(min=1)
    private Double bid;

    @Size(min=1)
    private Double ask;

    @Size(min=1)
    private Integer volume;

    @Size(min=1)
    private Integer openInt;

    @Size(min=1)
    private Double iv;

    @Size(min=1)
    private Double delta;

    @Size(min=1)
    private Double gamma;

    @Size(min=1)
    private Double theta;

    @Size(min=1)
    private Double vega;

    @Size(min=1)
    private String alias;

    public Options(String stockSymbol, Double stockPrice, Character exch, String optnSymbol, Character blank, String optnType, Date exprDate, Date dataDate, Double strike, Double lst, Double bid, Double ask, Integer volume, Integer openInt, Double iv, Double delta, Double gamma, Double theta, Double vega, String alias) {
        this.stockSymbol = stockSymbol;
        this.stockPrice = stockPrice;
        this.exch = exch;
        this.optnSymbol = optnSymbol;
        this.blank = blank;
        this.optnType = optnType;
        this.exprDate = exprDate;
        this.dataDate = dataDate;
        this.strike = strike;
        this.lst = lst;
        this.bid = bid;
        this.ask = ask;
        this.volume = volume;
        this.openInt = openInt;
        this.iv = iv;
        this.delta = delta;
        this.gamma = gamma;
        this.theta = theta;
        this.vega = vega;
        this.alias = alias;
    }
    //    @ManyToOne
//    private Options options;


    public Options() { }

    public int getId() {
        return id;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    public Double getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(Double stockPrice) {
        this.stockPrice = stockPrice;
    }

    public Character getExch() {
        return exch;
    }

    public void setExch(Character exch) {
        this.exch = exch;
    }

    public String getOptnSymbol() {
        return optnSymbol;
    }

    public void setOptnSymbol(String optnSymbol) {
        this.optnSymbol = optnSymbol;
    }

    public Character getBlank() {
        return blank;
    }

    public void setBlank(Character blank) {
        this.blank = blank;
    }

    public String getOptnType() {
        return optnType;
    }

    public void setOptnType(String optnType) {
        this.optnType = optnType;
    }

    public Date getExprDate() {
        return exprDate;
    }

    public void setExprDate(Date exprDate) {
        this.exprDate = exprDate;
    }

    public Date getDataDate() {
        return dataDate;
    }

    public void setDataDate(Date dataDate) {
        this.dataDate = dataDate;
    }

    public Double getStrike() {
        return strike;
    }

    public void setStrike(Double strike) {
        this.strike = strike;
    }

    public Double getLst() {
        return lst;
    }

    public void setLst(Double lst) {
        this.lst = lst;
    }

    public Double getBid() {
        return bid;
    }

    public void setBid(Double bid) {
        this.bid = bid;
    }

    public Double getAsk() {
        return ask;
    }

    public void setAsk(Double ask) {
        this.ask = ask;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Integer getOpenInt() {
        return openInt;
    }

    public void setOpenInt(Integer openInt) {
        this.openInt = openInt;
    }

    public Double getIv() {
        return iv;
    }

    public void setIv(Double iv) {
        this.iv = iv;
    }

    public Double getDelta() {
        return delta;
    }

    public void setDelta(Double delta) {
        this.delta = delta;
    }

    public Double getGamma() {
        return gamma;
    }

    public void setGamma(Double gamma) {
        this.gamma = gamma;
    }

    public Double getTheta() {
        return theta;
    }

    public void setTheta(Double theta) {
        this.theta = theta;
    }

    public Double getVega() {
        return vega;
    }

    public void setVega(Double vega) {
        this.vega = vega;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
