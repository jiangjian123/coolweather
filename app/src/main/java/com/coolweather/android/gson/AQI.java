package com.coolweather.android.gson;

/**
 * Created by 蒋健 on 2019/5/21.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String api;

        public String pm25;
    }
}
