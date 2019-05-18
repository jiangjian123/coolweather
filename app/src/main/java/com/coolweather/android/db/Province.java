package com.coolweather.android.db;

import org.litepal.crud.LitePalSupport;

/**
 * Created by 蒋健 on 2019/5/18.
 */

public class Province extends LitePalSupport{

    private int id;
    private String provinceName;
    private int provinceCode;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }



}
