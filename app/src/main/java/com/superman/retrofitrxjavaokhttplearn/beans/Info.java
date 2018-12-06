package com.superman.retrofitrxjavaokhttplearn.beans;

import java.io.Serializable;
import java.util.List;

/**
 * 作者 Superman
 * 日期 2018/12/6 15:04.
 * 文件 RetrofitRxjavaOkhttpLern
 * 描述
 */

public class Info implements Serializable {
    List<InfoItem> tech, auto, money, sports, dy, war, ent, toutiao;

    public List<InfoItem> getTech() {
        return tech;
    }

    public void setTech(List<InfoItem> tech) {
        this.tech = tech;
    }

    public List<InfoItem> getAuto() {
        return auto;
    }

    public void setAuto(List<InfoItem> auto) {
        this.auto = auto;
    }

    public List<InfoItem> getMoney() {
        return money;
    }

    public void setMoney(List<InfoItem> money) {
        this.money = money;
    }

    public List<InfoItem> getSports() {
        return sports;
    }

    public void setSports(List<InfoItem> sports) {
        this.sports = sports;
    }

    public List<InfoItem> getDy() {
        return dy;
    }

    public void setDy(List<InfoItem> dy) {
        this.dy = dy;
    }

    public List<InfoItem> getWar() {
        return war;
    }

    public void setWar(List<InfoItem> war) {
        this.war = war;
    }

    public List<InfoItem> getEnt() {
        return ent;
    }

    public void setEnt(List<InfoItem> ent) {
        this.ent = ent;
    }

    public List<InfoItem> getToutiao() {
        return toutiao;
    }

    public void setToutiao(List<InfoItem> toutiao) {
        this.toutiao = toutiao;
    }
}
