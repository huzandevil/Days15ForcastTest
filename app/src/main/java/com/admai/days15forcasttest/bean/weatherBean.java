package com.admai.days15forcasttest.bean;

import java.util.List;

/**
 * Created by ZAN on 17/1/10.
 */
public class weatherBean {
	
	
	/**
	 * showapi_res_code : 0
	 * showapi_res_error : 
	 * showapi_res_body : {"ret_code":0,"area":"上海","areaid":"101020100","dayList":[{"night_weather_code":"06","day_weather":"多云","night_weather":"雨夹雪","night_wind_power":"微风","day_wind_power":"微风","day_weather_code":"01","daytime":"20170110","day_weather_pic":"http://appimg.showapi.com/images/weather/icon/day/01.png","night_air_temperature":"1","day_air_temperature":"5","day_wind_direction":"东北风","night_weather_pic":"http://appimg.showapi.com/images/weather/icon/night/01.png","night_wind_direction":"东北风"},{"night_weather_code":"08","day_weather":"中雨","night_weather":"中雨","night_wind_power":"3-4级","day_wind_power":"微风","day_weather_code":"08","daytime":"20170111","day_weather_pic":"http://appimg.showapi.com/images/weather/icon/day/08.png","night_air_temperature":"6","day_air_temperature":"9","day_wind_direction":"东北风","night_weather_pic":"http://appimg.showapi.com/images/weather/icon/night/08.png","night_wind_direction":"北风"},{"night_weather_code":"08","day_weather":"中雨","night_weather":"中雨","night_wind_power":"3-4级","day_wind_power":"3-4级","day_weather_code":"08","daytime":"20170112","day_weather_pic":"http://appimg.showapi.com/images/weather/icon/day/08.png","night_air_temperature":"6","day_air_temperature":"9","day_wind_direction":"北风","night_weather_pic":"http://appimg.showapi.com/images/weather/icon/night/08.png","night_wind_direction":"北风"},{"night_weather_code":"08","day_weather":"中雨","night_weather":"中雨","night_wind_power":"微风","day_wind_power":"微风","day_weather_code":"08","daytime":"20170113","day_weather_pic":"http://appimg.showapi.com/images/weather/icon/day/08.png","night_air_temperature":"6","day_air_temperature":"9","day_wind_direction":"北风","night_weather_pic":"http://appimg.showapi.com/images/weather/icon/night/08.png","night_wind_direction":"北风"},{"night_weather_code":"01","day_weather":"多云","night_weather":"多云","night_wind_power":"微风","day_wind_power":"微风","day_weather_code":"01","daytime":"20170114","day_weather_pic":"http://appimg.showapi.com/images/weather/icon/day/01.png","night_air_temperature":"6","day_air_temperature":"10","day_wind_direction":"北风","night_weather_pic":"http://appimg.showapi.com/images/weather/icon/night/01.png","night_wind_direction":"北风"},{"night_weather_code":"01","day_weather":"多云","night_weather":"多云","night_wind_power":"3-4级","day_wind_power":"3-4级","day_weather_code":"01","daytime":"20170115","day_weather_pic":"http://appimg.showapi.com/images/weather/icon/day/01.png","night_air_temperature":"0","day_air_temperature":"6","day_wind_direction":"西北风","night_weather_pic":"http://appimg.showapi.com/images/weather/icon/night/01.png","night_wind_direction":"西北风"},{"night_weather_code":"01","day_weather":"多云","night_weather":"多云","night_wind_power":"微风","day_wind_power":"微风","day_weather_code":"01","daytime":"20170116","day_weather_pic":"http://appimg.showapi.com/images/weather/icon/day/01.png","night_air_temperature":"2","day_air_temperature":"7","day_wind_direction":"北风","night_weather_pic":"http://appimg.showapi.com/images/weather/icon/night/01.png","night_wind_direction":"北风"},{"night_weather_code":"01","day_weather":"多云","night_weather":"多云","night_wind_power":"微风","day_wind_power":"微风","day_weather_code":"01","daytime":"20170117","day_weather_pic":"http://appimg.showapi.com/images/weather/icon/day/01.png","night_air_temperature":"1","day_air_temperature":"6","day_wind_direction":"东北风","night_weather_pic":"http://appimg.showapi.com/images/weather/icon/night/01.png","night_wind_direction":"北风"},{"night_weather_code":"01","day_weather":"阴","night_weather":"多云","night_wind_power":"3-4级","day_wind_power":"3-4级","day_weather_code":"02","daytime":"20170118","day_weather_pic":"http://appimg.showapi.com/images/weather/icon/day/02.png","night_air_temperature":"3","day_air_temperature":"7","day_wind_direction":"东北风","night_weather_pic":"http://appimg.showapi.com/images/weather/icon/night/02.png","night_wind_direction":"东北风"},{"night_weather_code":"01","day_weather":"阴","night_weather":"多云","night_wind_power":"3-4级","day_wind_power":"3-4级","day_weather_code":"02","daytime":"20170119","day_weather_pic":"http://appimg.showapi.com/images/weather/icon/day/02.png","night_air_temperature":"2","day_air_temperature":"7","day_wind_direction":"北风","night_weather_pic":"http://appimg.showapi.com/images/weather/icon/night/02.png","night_wind_direction":"北风"},{"night_weather_code":"01","day_weather":"晴","night_weather":"多云","night_wind_power":"微风","day_wind_power":"微风","day_weather_code":"00","daytime":"20170120","day_weather_pic":"http://appimg.showapi.com/images/weather/icon/day/00.png","night_air_temperature":"2","day_air_temperature":"7","day_wind_direction":"西北风","night_weather_pic":"http://appimg.showapi.com/images/weather/icon/night/00.png","night_wind_direction":"西北风"},{"night_weather_code":"00","day_weather":"多云","night_weather":"晴","night_wind_power":"微风","day_wind_power":"微风","day_weather_code":"01","daytime":"20170121","day_weather_pic":"http://appimg.showapi.com/images/weather/icon/day/01.png","night_air_temperature":"5","day_air_temperature":"9","day_wind_direction":"东北风","night_weather_pic":"http://appimg.showapi.com/images/weather/icon/night/01.png","night_wind_direction":"北风"},{"night_weather_code":"02","day_weather":"多云","night_weather":"阴","night_wind_power":"3-4级","day_wind_power":"3-4级","day_weather_code":"01","daytime":"20170122","day_weather_pic":"http://appimg.showapi.com/images/weather/icon/day/01.png","night_air_temperature":"6","day_air_temperature":"10","day_wind_direction":"东北风","night_weather_pic":"http://appimg.showapi.com/images/weather/icon/night/01.png","night_wind_direction":"东风"},{"night_weather_code":"08","day_weather":"中雨","night_weather":"中雨","night_wind_power":"3-4级","day_wind_power":"4-5级","day_weather_code":"08","daytime":"20170123","day_weather_pic":"http://appimg.showapi.com/images/weather/icon/day/08.png","night_air_temperature":"9","day_air_temperature":"11","day_wind_direction":"东南风","night_weather_pic":"http://appimg.showapi.com/images/weather/icon/night/08.png","night_wind_direction":"东南风"},{"night_weather_code":"08","day_weather":"中雨","night_weather":"中雨","night_wind_power":"4-5级","day_wind_power":"3-4级","day_weather_code":"08","daytime":"20170124","day_weather_pic":"http://appimg.showapi.com/images/weather/icon/day/08.png","night_air_temperature":"8","day_air_temperature":"12","day_wind_direction":"东北风","night_weather_pic":"http://appimg.showapi.com/images/weather/icon/night/08.png","night_wind_direction":"北风"}]}
	 */
	
	private int showapi_res_code;
	private String showapi_res_error;
	/**
	 * ret_code : 0
	 * area : 上海
	 * areaid : 101020100
	 * dayList : [{"night_weather_code":"06","day_weather":"多云","night_weather":"雨夹雪","night_wind_power":"微风","day_wind_power":"微风","day_weather_code":"01","daytime":"20170110","day_weather_pic":"http://appimg.showapi.com/images/weather/icon/day/01.png","night_air_temperature":"1","day_air_temperature":"5","day_wind_direction":"东北风","night_weather_pic":"http://appimg.showapi.com/images/weather/icon/night/01.png","night_wind_direction":"东北风"},{"night_weather_code":"08","day_weather":"中雨","night_weather":"中雨","night_wind_power":"3-4级","day_wind_power":"微风","day_weather_code":"08","daytime":"20170111","day_weather_pic":"http://appimg.showapi.com/images/weather/icon/day/08.png","night_air_temperature":"6","day_air_temperature":"9","day_wind_direction":"东北风","night_weather_pic":"http://appimg.showapi.com/images/weather/icon/night/08.png","night_wind_direction":"北风"},{"night_weather_code":"08","day_weather":"中雨","night_weather":"中雨","night_wind_power":"3-4级","day_wind_power":"3-4级","day_weather_code":"08","daytime":"20170112","day_weather_pic":"http://appimg.showapi.com/images/weather/icon/day/08.png","night_air_temperature":"6","day_air_temperature":"9","day_wind_direction":"北风","night_weather_pic":"http://appimg.showapi.com/images/weather/icon/night/08.png","night_wind_direction":"北风"},{"night_weather_code":"08","day_weather":"中雨","night_weather":"中雨","night_wind_power":"微风","day_wind_power":"微风","day_weather_code":"08","daytime":"20170113","day_weather_pic":"http://appimg.showapi.com/images/weather/icon/day/08.png","night_air_temperature":"6","day_air_temperature":"9","day_wind_direction":"北风","night_weather_pic":"http://appimg.showapi.com/images/weather/icon/night/08.png","night_wind_direction":"北风"},{"night_weather_code":"01","day_weather":"多云","night_weather":"多云","night_wind_power":"微风","day_wind_power":"微风","day_weather_code":"01","daytime":"20170114","day_weather_pic":"http://appimg.showapi.com/images/weather/icon/day/01.png","night_air_temperature":"6","day_air_temperature":"10","day_wind_direction":"北风","night_weather_pic":"http://appimg.showapi.com/images/weather/icon/night/01.png","night_wind_direction":"北风"},{"night_weather_code":"01","day_weather":"多云","night_weather":"多云","night_wind_power":"3-4级","day_wind_power":"3-4级","day_weather_code":"01","daytime":"20170115","day_weather_pic":"http://appimg.showapi.com/images/weather/icon/day/01.png","night_air_temperature":"0","day_air_temperature":"6","day_wind_direction":"西北风","night_weather_pic":"http://appimg.showapi.com/images/weather/icon/night/01.png","night_wind_direction":"西北风"},{"night_weather_code":"01","day_weather":"多云","night_weather":"多云","night_wind_power":"微风","day_wind_power":"微风","day_weather_code":"01","daytime":"20170116","day_weather_pic":"http://appimg.showapi.com/images/weather/icon/day/01.png","night_air_temperature":"2","day_air_temperature":"7","day_wind_direction":"北风","night_weather_pic":"http://appimg.showapi.com/images/weather/icon/night/01.png","night_wind_direction":"北风"},{"night_weather_code":"01","day_weather":"多云","night_weather":"多云","night_wind_power":"微风","day_wind_power":"微风","day_weather_code":"01","daytime":"20170117","day_weather_pic":"http://appimg.showapi.com/images/weather/icon/day/01.png","night_air_temperature":"1","day_air_temperature":"6","day_wind_direction":"东北风","night_weather_pic":"http://appimg.showapi.com/images/weather/icon/night/01.png","night_wind_direction":"北风"},{"night_weather_code":"01","day_weather":"阴","night_weather":"多云","night_wind_power":"3-4级","day_wind_power":"3-4级","day_weather_code":"02","daytime":"20170118","day_weather_pic":"http://appimg.showapi.com/images/weather/icon/day/02.png","night_air_temperature":"3","day_air_temperature":"7","day_wind_direction":"东北风","night_weather_pic":"http://appimg.showapi.com/images/weather/icon/night/02.png","night_wind_direction":"东北风"},{"night_weather_code":"01","day_weather":"阴","night_weather":"多云","night_wind_power":"3-4级","day_wind_power":"3-4级","day_weather_code":"02","daytime":"20170119","day_weather_pic":"http://appimg.showapi.com/images/weather/icon/day/02.png","night_air_temperature":"2","day_air_temperature":"7","day_wind_direction":"北风","night_weather_pic":"http://appimg.showapi.com/images/weather/icon/night/02.png","night_wind_direction":"北风"},{"night_weather_code":"01","day_weather":"晴","night_weather":"多云","night_wind_power":"微风","day_wind_power":"微风","day_weather_code":"00","daytime":"20170120","day_weather_pic":"http://appimg.showapi.com/images/weather/icon/day/00.png","night_air_temperature":"2","day_air_temperature":"7","day_wind_direction":"西北风","night_weather_pic":"http://appimg.showapi.com/images/weather/icon/night/00.png","night_wind_direction":"西北风"},{"night_weather_code":"00","day_weather":"多云","night_weather":"晴","night_wind_power":"微风","day_wind_power":"微风","day_weather_code":"01","daytime":"20170121","day_weather_pic":"http://appimg.showapi.com/images/weather/icon/day/01.png","night_air_temperature":"5","day_air_temperature":"9","day_wind_direction":"东北风","night_weather_pic":"http://appimg.showapi.com/images/weather/icon/night/01.png","night_wind_direction":"北风"},{"night_weather_code":"02","day_weather":"多云","night_weather":"阴","night_wind_power":"3-4级","day_wind_power":"3-4级","day_weather_code":"01","daytime":"20170122","day_weather_pic":"http://appimg.showapi.com/images/weather/icon/day/01.png","night_air_temperature":"6","day_air_temperature":"10","day_wind_direction":"东北风","night_weather_pic":"http://appimg.showapi.com/images/weather/icon/night/01.png","night_wind_direction":"东风"},{"night_weather_code":"08","day_weather":"中雨","night_weather":"中雨","night_wind_power":"3-4级","day_wind_power":"4-5级","day_weather_code":"08","daytime":"20170123","day_weather_pic":"http://appimg.showapi.com/images/weather/icon/day/08.png","night_air_temperature":"9","day_air_temperature":"11","day_wind_direction":"东南风","night_weather_pic":"http://appimg.showapi.com/images/weather/icon/night/08.png","night_wind_direction":"东南风"},{"night_weather_code":"08","day_weather":"中雨","night_weather":"中雨","night_wind_power":"4-5级","day_wind_power":"3-4级","day_weather_code":"08","daytime":"20170124","day_weather_pic":"http://appimg.showapi.com/images/weather/icon/day/08.png","night_air_temperature":"8","day_air_temperature":"12","day_wind_direction":"东北风","night_weather_pic":"http://appimg.showapi.com/images/weather/icon/night/08.png","night_wind_direction":"北风"}]
	 */
	
	private ShowapiResBodyBean showapi_res_body;
	
	public int getShowapi_res_code() {
		return showapi_res_code;
	}
	
	public void setShowapi_res_code(int showapi_res_code) {
		this.showapi_res_code = showapi_res_code;
	}
	
	public String getShowapi_res_error() {
		return showapi_res_error;
	}
	
	public void setShowapi_res_error(String showapi_res_error) {
		this.showapi_res_error = showapi_res_error;
	}
	
	public ShowapiResBodyBean getShowapi_res_body() {
		return showapi_res_body;
	}
	
	public void setShowapi_res_body(ShowapiResBodyBean showapi_res_body) {
		this.showapi_res_body = showapi_res_body;
	}
	
	public static class ShowapiResBodyBean {
		private int ret_code;
		private String area;
		private String areaid;
		/**
		 * night_weather_code : 06
		 * day_weather : 多云
		 * night_weather : 雨夹雪
		 * night_wind_power : 微风
		 * day_wind_power : 微风
		 * day_weather_code : 01
		 * daytime : 20170110
		 * day_weather_pic : http://appimg.showapi.com/images/weather/icon/day/01.png
		 * night_air_temperature : 1
		 * day_air_temperature : 5
		 * day_wind_direction : 东北风
		 * night_weather_pic : http://appimg.showapi.com/images/weather/icon/night/01.png
		 * night_wind_direction : 东北风
		 */
		
		private List<DayListBean> dayList;
		
		public int getRet_code() {
			return ret_code;
		}
		
		public void setRet_code(int ret_code) {
			this.ret_code = ret_code;
		}
		
		public String getArea() {
			return area;
		}
		
		public void setArea(String area) {
			this.area = area;
		}
		
		public String getAreaid() {
			return areaid;
		}
		
		public void setAreaid(String areaid) {
			this.areaid = areaid;
		}
		
		public List<DayListBean> getDayList() {
			return dayList;
		}
		
		public void setDayList(List<DayListBean> dayList) {
			this.dayList = dayList;
		}
		
		public static class DayListBean {
			private String night_weather_code;
			private String day_weather;
			private String night_weather;
			private String night_wind_power;
			private String day_wind_power;
			private String day_weather_code;
			private String daytime;
			private String day_weather_pic;
			private String night_air_temperature;
			private String day_air_temperature;
			private String day_wind_direction;
			private String night_weather_pic;
			private String night_wind_direction;
			
			public String getNight_weather_code() {
				return night_weather_code;
			}
			
			public void setNight_weather_code(String night_weather_code) {
				this.night_weather_code = night_weather_code;
			}
			
			public String getDay_weather() {
				return day_weather;
			}
			
			public void setDay_weather(String day_weather) {
				this.day_weather = day_weather;
			}
			
			public String getNight_weather() {
				return night_weather;
			}
			
			public void setNight_weather(String night_weather) {
				this.night_weather = night_weather;
			}
			
			public String getNight_wind_power() {
				return night_wind_power;
			}
			
			public void setNight_wind_power(String night_wind_power) {
				this.night_wind_power = night_wind_power;
			}
			
			public String getDay_wind_power() {
				return day_wind_power;
			}
			
			public void setDay_wind_power(String day_wind_power) {
				this.day_wind_power = day_wind_power;
			}
			
			public String getDay_weather_code() {
				return day_weather_code;
			}
			
			public void setDay_weather_code(String day_weather_code) {
				this.day_weather_code = day_weather_code;
			}
			
			public String getDaytime() {
				return daytime;
			}
			
			public void setDaytime(String daytime) {
				this.daytime = daytime;
			}
			
			public String getDay_weather_pic() {
				return day_weather_pic;
			}
			
			public void setDay_weather_pic(String day_weather_pic) {
				this.day_weather_pic = day_weather_pic;
			}
			
			public String getNight_air_temperature() {
				return night_air_temperature;
			}
			
			public void setNight_air_temperature(String night_air_temperature) {
				this.night_air_temperature = night_air_temperature;
			}
			
			public String getDay_air_temperature() {
				return day_air_temperature;
			}
			
			public void setDay_air_temperature(String day_air_temperature) {
				this.day_air_temperature = day_air_temperature;
			}
			
			public String getDay_wind_direction() {
				return day_wind_direction;
			}
			
			public void setDay_wind_direction(String day_wind_direction) {
				this.day_wind_direction = day_wind_direction;
			}
			
			public String getNight_weather_pic() {
				return night_weather_pic;
			}
			
			public void setNight_weather_pic(String night_weather_pic) {
				this.night_weather_pic = night_weather_pic;
			}
			
			public String getNight_wind_direction() {
				return night_wind_direction;
			}
			
			public void setNight_wind_direction(String night_wind_direction) {
				this.night_wind_direction = night_wind_direction;
			}
		}
	}
}
