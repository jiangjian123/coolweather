package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 蒋健 on 2019/5/21.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

    public int ddd;
}
