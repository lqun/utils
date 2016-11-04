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
		CONVERT_TYPE_CHAR("1", "字母大小写转换", "convert/u_convertCharacter"),
		CONVERT_TYPE_RMB("2", "人民币大小写转换", "convert/u_convertMoney"),
		CONVERT_TYPE_UNICODE("3", "unicode中文互转", "convert/u_convertUnicode");
		
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
	
	/**
	 * 编码解码项中子菜单对应枚举
	 * @author liuqun
	 * @date 2015-11-4 下午1:44:19
	 */
	public enum EncodeTypeEnum {
		ENCODE_TYPE_BASE64("1", "base64编码、解码", "encode/u_base64"),
		ENCODE_TYPE_URL("2", "URL编码、解码", "encode/u_url"),
		ENCODE_TYPE_ESCAPE("3", "escape编码、解码", "encode/u_escape");
		
		private String typeCode; // 类型
		private String typeDesc; // 类型描述
		private String jspUrl;// 页面路径
		
		private EncodeTypeEnum(String typeCode, String typeDesc, String jspUrl) {
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
			for (EncodeTypeEnum eTypeEnum : EncodeTypeEnum.values()) {
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
			for (EncodeTypeEnum eTypeEnum : EncodeTypeEnum.values()) {
				if (eTypeEnum.getTypeCode().equals(type)) {
					desc = eTypeEnum.getTypeDesc();
					break;
				}
			}
			return desc;
		}
	}
	
	/**
	 * 加密、解密项中子菜单对应枚举
	 * @author liuqun
	 * @date 2015-11-4 下午1:44:19
	 */
	public enum EncryptTypeEnum {
		ENCRYPT_TYPE_MD5("1", "MD5加密", "encrypt/u_md5Encrypt"),
		ENCRYPT_TYPE_URL("2", "URL编码、解码", "encode/u_url"),
		ENCRYPT_TYPE_ESCAPE("3", "escape编码、解码", "encode/u_escape");
		
		private String typeCode; // 类型
		private String typeDesc; // 类型描述
		private String jspUrl;// 页面路径
		
		private EncryptTypeEnum(String typeCode, String typeDesc, String jspUrl) {
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
			for (EncryptTypeEnum eTypeEnum : EncryptTypeEnum.values()) {
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
			for (EncryptTypeEnum eTypeEnum : EncryptTypeEnum.values()) {
				if (eTypeEnum.getTypeCode().equals(type)) {
					desc = eTypeEnum.getTypeDesc();
					break;
				}
			}
			return desc;
		}
	}
	
	/**
	* @Title: UtilsConstantEnum.java  
	* @Package com.my.utils.constant  
	* @Description: json相关菜单
	* @author qun.liu
	* @date 2016年11月4日 下午5:28:19  
	* @version V1.0
	 */
	public enum JsonTypeEnum {
		ENCRYPT_TYPE_MD5("1", "json格式化", "json/u_jsonFormat"),
		ENCRYPT_TYPE_URL("2", "", ""),
		ENCRYPT_TYPE_ESCAPE("3", "", "");
		
		private String typeCode; // 类型
		private String typeDesc; // 类型描述
		private String jspUrl;// 页面路径
		
		private JsonTypeEnum(String typeCode, String typeDesc, String jspUrl) {
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
			for (JsonTypeEnum eTypeEnum : JsonTypeEnum.values()) {
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
			for (JsonTypeEnum eTypeEnum : JsonTypeEnum.values()) {
				if (eTypeEnum.getTypeCode().equals(type)) {
					desc = eTypeEnum.getTypeDesc();
					break;
				}
			}
			return desc;
		}
	}
}
