package com.my.utils.constant;


/**
 * 工程相关枚举类
 * @author liuqun
 *
 */
public class UtilsConstantEnum {
	
	/**
	 * 转换工具项中子菜单对应枚举
	 * @author liuqun
	 * @date 2015-11-4 下午1:44:19
	 */
	public enum ConvertTypeEnum {
		OTHER_TYPE_CHAR("1", "字母大小写转换", "convert/u_convertCharacter"),
		OTHER_TYPE_RMB("2", "人民币大小写转换", "convert/u_convertMoney");
		
		private String typeCode; // 类型
		private String typeDesc; // 类型描述
		private String jspUrl;
		
		private ConvertTypeEnum(String typeCode, String typeDesc, String jspUrl) {
			this.typeCode = typeCode;
			this.typeDesc = typeDesc;
			this.jspUrl = jspUrl;
		}

		public String getTypeCode() {
			return typeCode;   
		}

		public String getTypeDesc() {
			return typeDesc;
		}

		public String getJspUrl() {
			return jspUrl;
		}
		
		/**
		 * 根据type返回对应的jsp
		 * @param type
		 * @return
		 */
		public static String getJspUrl(String type) {
			String url = "";
			for (ConvertTypeEnum eTypeEnum : ConvertTypeEnum.values()) {
				if (eTypeEnum.getTypeCode().equals(type)) {
					url = eTypeEnum.getJspUrl();
					break;
				}
			}
			return url;
		}
		
		/**
		 * 根据type返回对应的描述
		 * @param type
		 * @return
		 */
		public static String getDesc(String type) {
			String desc = "";
			for (ConvertTypeEnum eTypeEnum : ConvertTypeEnum.values()) {
				if (eTypeEnum.getTypeCode().equals(type)) {
					desc = eTypeEnum.getTypeDesc();
					break;
				}
			}
			return desc;
		}
	}
}
