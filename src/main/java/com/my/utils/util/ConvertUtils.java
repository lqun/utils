package com.my.utils.util;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;


/**
 * 转换相关工具类
 * @author liuqun
 *
 */
public class ConvertUtils {

	/**
	 * 人民币大小写转换
	 */
	public static String[] number = new String[]{"零","壹","贰","叁","肆","伍","陆","柒","捌","玖" };
	public static String[] units = new String[]{"元","拾","佰","仟"}; 
	
	/**
	 * 字母转换为大写
	 * @param str
	 * @return
	 */
	public static String printUpperCase(String str) {
		char charArry[] = str.toCharArray();
		for (int i = 0; i < charArry.length; i++) {
			if (((int)charArry[i] > 96) && ((int)charArry[i] < 123)) {
				charArry[i] = (char) ((int)charArry[i] - 32);
			}
		}
		return String.valueOf(charArry);
	}
	
	/**
	 * 字母转换为小写
	 * @param str
	 * @return
	 */
	public static String printLowerCase(String str) {
		char charArry[] = str.toCharArray();
		for (int i = 0; i < charArry.length; i++) {
			if (((int)charArry[i] > 64) && ((int)charArry[i] < 91)) {
				charArry[i] = (char) ((int)charArry[i] + 32);
			}
		}
		return String.valueOf(charArry);
	}
	
	/**
	 * 将人民币转换成大写
	 * @param smoney
	 * @return
	 */
	public static String changeMoneyToUpper(String smoney){
		StringBuffer sb = new StringBuffer();
		
		DecimalFormat decimalFormat = new DecimalFormat("#.00");
		smoney = decimalFormat.format(Double.parseDouble(smoney));
		
		//小数点的位置
		int index = smoney.indexOf(".");
		
		//biggerstr用于存放存有数字和单位的字符
		StringBuffer biggerstr = new StringBuffer();
		
		//处理小数部分
		biggerstr.append("分");
		biggerstr.append(number[Integer.parseInt(smoney.charAt(index+2) + "")]);
		biggerstr.append("角");
		biggerstr.append(number[Integer.parseInt(smoney.charAt(index+1) + "")]);
		
		//处理整数部分
		for(int i=0;i<index;i++){
			sb.append(number[Integer.parseInt(smoney.charAt(i)+"")]);	
		}
		sb=sb.reverse();
		String insertstr=sb.toString();
		for(int i=0;i<insertstr.length();i++){
			//插入单位
			if(i==0){
				biggerstr.append("元");
			}
			else if((i+4)%4==0 && i!=8){
				biggerstr.append("万");
			}
			else if(i%8==0){
				biggerstr.append("亿");
			}
			else
				biggerstr.append(units[i%4]);
			//插入数字
			biggerstr.append(insertstr.charAt(i));
		}
		
		//instead_zero字符串用于存放清除零之后的
		String instead_zero=biggerstr.reverse().toString();
		instead_zero=instead_zero.replaceAll("零分", "零");
		instead_zero=instead_zero.replaceAll("零角", "零");
		instead_zero=instead_zero.replaceAll("零佰", "零");
		instead_zero=instead_zero.replaceAll("零仟", "零");
		instead_zero=instead_zero.replaceAll("零拾", "零");
		//把相连的零去掉
		instead_zero=instead_zero.replaceAll("[零]+","零");
		instead_zero=instead_zero.replaceAll("零元", "元");
		instead_zero=instead_zero.replaceAll("零万", "万");
		instead_zero=instead_zero.replaceAll("零亿", "亿");
		//把字符串中的最后一个零去掉
		if(instead_zero.charAt(instead_zero.length()-1)=='零'){
			instead_zero=instead_zero.substring(0, instead_zero.length()-1);
		}
		
		if (instead_zero.contains("亿")) {
			instead_zero = instead_zero.replace("万元", "元");
		}
		return instead_zero;
	}
	
	/**
	 * 中文转unicode
	 * @param string
	 * @return
	 */
	public static String str2Unicode(String str) {
		StringBuffer unicode = new StringBuffer();
		if (StringUtils.isNotBlank(str)) {
			char charArry[] = str.toCharArray();
			for (int i = 0; i < charArry.length; i++) {
		       if (charArry[i] >= 19968 && charArry[i] <= 171941) {
		    	   // 转换为unicode
		    	   unicode.append("\\u" + Integer.toHexString(charArry[i]));
		       } else {
		    	   unicode.append(charArry[i]);
		       }
			}
		}
        return unicode.toString();
    }
	
	/**
	 * unicode转中文
	 * @param string
	 * @return
	 */
	public static String unicode2str(String str) {
		if (StringUtils.isNotBlank(str)) {
			String regex = "\\\\u([0-9a-f]{4})";
            Matcher mtatcher = Pattern.compile(regex).matcher(str);
            while(mtatcher.find()){
            	String code = mtatcher.group(1);
            	char ch = (char) Integer.parseInt(code, 16);
            	str = str.replaceAll("\\\\u"+code, String.valueOf(ch));
            }
		}
        return str;
    }
}
