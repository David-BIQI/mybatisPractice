package com.biqi.framework.config;

import org.apache.commons.lang.StringUtils;
import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimestampStringToDateConverter implements Converter<String, Date> {

    public static String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
	
    @Override
    public Date convert(String source) {
        if (StringUtils.isBlank(source)) {
            return null;
        }
        source = source.trim();

        try {
        	SimpleDateFormat formatter = new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS);
        	Date date =  formatter.parse(source);
        	
        	return date;
        } catch (Exception e) {
            throw new RuntimeException(String.format("timestamp to date error:%s", source));
        }
    }
}
