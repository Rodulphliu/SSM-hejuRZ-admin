package com.hjrz.admin.data;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateFormatData implements Converter<String,Date>
{
	private String datepattern;

	public void setDatepattern(String datepattern) {
		this.datepattern = datepattern;
	}

	@Override
	public Date convert(String source) {
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat(this.datepattern);
			return dateFormat.parse(datepattern);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
