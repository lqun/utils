package com.my.utils.constant;


/**
 * 工程相关枚举类
 * @author liuqun
 *
 */
public class UtilsConstantEnum {
	
	/**
	 * otherx项中子菜单对应枚举
	 * @author liuqun
	 * @date 2015-11-4 下午1:44:19
	 */
	public enum OtherTypeEnum {
		OTHER_TYPE_CHAR("1", "字母大小写转换", "other/u_convertCharacter"),
		OTHER_TYPE_JS("2", "js加密/解密", ""),
		OTHER_TYPE_RMB(" 3", "人民币大小写转换", "");
		
		private String typeCode; // 类型
		private String typeDesc; // 类型描述
		private String jspUrl;
		
		private OtherTypeEnum(String typeCode, String typeDesc, String jspUrl) {
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
			for (OtherTypeEnum eTypeEnum : OtherTypeEnum.values()) {
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
			for (OtherTypeEnum eTypeEnum : OtherTypeEnum.values()) {
				if (eTypeEnum.getTypeCode().equals(type)) {
					desc = eTypeEnum.getTypeDesc();
					break;
				}
			}
			return desc;
		}
	}
}
