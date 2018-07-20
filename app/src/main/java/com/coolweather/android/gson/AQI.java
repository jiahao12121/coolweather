package com.coolweather.android.gson;

/**
 * Created by cjh on 2018/7/20.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
