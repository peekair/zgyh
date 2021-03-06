package com.chinamworld.bocmbci.fidget;

import android.net.Uri;

import com.chinamworld.bocmbci.constant.SystemConfig;

/**
 * 类功能描述：常量类,存放一些普通的常量
 * 
 * @author：秦
 * @version： 1.0
 * @see 包名：com.chinamworld.btwapview.global 相关数据：
 */
public class BTCGlobal {


	
	/**
	 * 
	 * DEBUG模式 PRODUCTION 生产模式  SIT模式 UAT模式 
	 * DEBUGWifi true false
	 * add by qr 2011-08-05
	 * 
	 */
	/*-------配置文件名------*/
	public final static String DEBUGMODE = SystemConfig.ENV;//
	public final static String DEBUGMODEPRODUCT = SystemConfig.ENV_PRD;//
	public final static String DEBUGMODESIT = SystemConfig.ENV_SIT;//
	public final static String DEBUGMODEUAT = SystemConfig.ENV_UAT;//
	public final static String DEBUGWifi = "true";// 
	//add end
	/**
	 * 
	 * 登录url
	 * DEBUGWifi true false
	 * add by qr 2012-7-16 10:43:40
	 * 
	 */
	/*-------配置文件名------*/
//	public final static String CM_URL = "http://wap.umpay.com/bankproxy2/merproxy?BANKID=00020000&MODE=2";//
//	public final static String UN_URL = "http://mbs.boc.cn/BOCWapBank/WEBSLoginUNMenuNew.do";// 
//	public final static String CT_URL = "http://mbs.boc.cn/BOCWapBank/WEBSLoginCTMenuNew.do";// 
//	public final static String login_with_username_url = "https://mbs.boc.cn/BocMBCGate/LOGNFWLoginPwdMod.do";// 
//	public final static String COB_URL = "http://219.236.241.163:9080/BocMBCGate/";// 
//	public final static String UpdateUrl = "http://219.236.241.165:9080/BocMBCGate/MBCExchangeVersionInfo.do";//
//	public final static String UpdateUrl = "http://172.168.1.111:8080/BocMBCGate/update.action?pluginVersion=1";
	// 生产地址
//	public final static String UpdateUrl = "https://mbs.boc.cn/BocMBCGate/MBCExchangeVersionInfo.do";//
	public final static String OrgdownloadUrl = "https://mbs.boc.cn/BocMBCGate/MBCFidgetList.do";// 
	public final static String OrgdetailUrl = "https://mbs.boc.cn/BocMBCGate/MBCFidgetDetail.do";// 
	public final static String MapUrl = "https://mbs.boc.cn/BocMBCGate/common/images/";// 
//	public final static String Function_User_Url = "https://mbs.boc.cn/BocMBCGate/functionUsed.action";
//	public final static String ActivityInfo_Url = "https://mbs.boc.cn/BocMBCGate/activityInfo.action";
	
	//SIT 公司外网服务器
//	public final static String UpdateUrl = "http://219.236.241.165:9080/BocMBCGate/MBCExchangeVersionInfo.do";//
//	public final static String OrgdownloadUrl = "http://219.236.241.165:9080/BocMBCGate/MBCFidgetList.do";// 
//	public final static String OrgdetailUrl = "http://219.236.241.165:9080/BocMBCGate/MBCFidgetDetail.do";// 
//	public final static String MapUrl = "http://219.236.241.165:9080/BocMBCGate/common/images/";// 
	
	
	// BOC测试地址
//	public final static String UpdateUrl = "http://22.188.196.65:9080/BocMBCGate/MBCExchangeVersionInfo.do";//
	
//	public final static String UpdateUrl = "http://22.188.193.125:9085/BocMBCGate/MBCExchangeVersionInfo.do";//
//	public final static String OrgdownloadUrl = "http://22.188.193.125:9085/BocMBCGate/MBCFidgetList.do";// 
//	public final static String OrgdetailUrl = "http://22.188.193.125:9085/BocMBCGate/MBCFidgetDetail.do";// 
//	public final static String MapUrl = "http://22.188.193.125:9085/BocMBCGate/common/images/";// 
//	public final static String Function_User_Url = "http://22.188.193.125:9085/BocMBCGate/functionUsed.action";
	public final static String Function_User_Url = "http://22.188.196.65:9080/BocMBCGate/functionUsed.action";
//	public final static String ActivityInfo_Url = "http://22.188.193.125:9085/BocMBCGate/activityInfo.action";
//	public final static String ActivityInfo_Url = "http://22.188.196.65:9080/BocMBCGate/activityInfo.action";
//	public final static String ActivityInfo_Url = "http://22.188.46.227/BocMBCGate/activityInfo.action";
	
	
	

	
//	public final static String COB_URL = "https://125.35.4.249/BocMBCGate/";//

	
	/**
	 * 
	 * 配置文件，文件名和参数名定义
	 * 
	 */
	/*-------配置文件名------*/
	public final static String PARAM_SECURITY_FILE = "keychain";// param标签类型为security时修改的文件名
	public final static String PARAM_GENERAL_FILE = "mbsUrl";// param标签类型为general时可以修改该文件，该文件保存了通讯地址和参数等
	public final static String PVERSION_FILE = "pversion";// 静态页面版本号保存文件
	public final static String VERSION_FILE = "version";// 程序版本号保存文件
	public final static String DEFAULT_FILE = "cmw";//自定义参数保存文件
	/*-------keychain.xml中对应参数名-------*/
	public final static String KEYCHAIN_USERTOKEN = "UserToken";// 保存登录返回的usertoken
	public final static String KEYCHAIN_PUBKEY = "PubKey";// 值为时间戳，一版与设备号组成密钥
	public final static String KEYCHAIN_MN = "MN";// 加密次数
	/*-------mbsUrl.xml中对应参数名-------*/
	public final static String MBSURL_CM_URL = "getMobileNumberURL";// 移动取手机号地址
	public final static String MBSURL_CM_BANKID = "BANKID";// 移动取授权号时银行代码参数
	public final static String MBSURL_CM_MODE = "MODE";// 移动取手机号时通讯渠道标识
	public final static String MBSURL_UNI_URL = "getUnionNumberURL";// 联通取手机号地址
	public final static String MBSURL_CT_URL = "getCTNumberURL";// 电信取手机号地址
	public final static String MBSURL_BANK_URL = "MBSBankURL";// 银行交易地址
	public final static String MBSURL_BANK_HOST = "HOST";//银行交易主机名，用于拼接相对路径
	/*-------version.xml中对应参数名-------*/
	public final static String VERSION_PARAM = "version";// 程序版本号
	/*--------cmw.xml---android特殊参数----------*/
	public final static String CMW_SMS_CONTENT = "SMS_CONTENT";// 绑定设备时发送短信的内容
	public final static String CMW_SMS_ADDRESS = "SMS_ADDRESS";// 绑定设备时发送短信的接收地址
	public final static String RUN_FIRST_TIME = "runFirstTime";// 首次启动标识
	public final static String RUN_FIRST_TIME_VALUE_YES = "yes";// 首次启动
	public final static String RUN_FIRST_TIME_VALUE_NO = "no";// 非首次启动
	
	
	// 在程序首次启动运时，要从assets目录下复制配置文件到安装目录下，通过这个常量来匹配文件名
	//多个文件以逗号","分隔开
	public static final String CONFIG_FILE_NAME = "mbsUrl.xml,cmw.xml"; 

	/**
	 * 
	 * 接入点相关数据定义
	 * 
	 */
	/*--------运营商代码--------*/
	public final static String OPREATER_CODE_CMCC = "00"; // 移动的供应商代码
	public final static String OPREATER_CODE_CUCC = "01";// 联通的供应商代码
	public final static String OPREATER_CODE_CMCC_2 = "02";// 移动的供应商代码2
	public final static String OPREATER_CODE_CMCC_7 = "07";// 移动的供应商代码7 add xxh 2012-3-7
	public final static String OPREATER_CODE_CT = "03";// 电信的供应商代码
	/*---------建行接入点的apn名称---------*/
	public final static String CMW_CMWAP = "CMWCmWap"; // 移动wap接入点
	public final static String CMW_CMNET = "CMWCmNet";// 移动net接入点
	public final static String CMW_UNIWAP = "CMWUniWap";// 联通wap接入点
	public final static String CMW_UNINET = "CMWUniNet";// 联通net接入点
	public final static String CMW_3GWAP = "CMW3gWap";// 联通3gwap接入点
	public final static String CMW_3GNET = "CMW3gNet";// 联通3gnet接入点
	public final static String CMW_CTWAP = "ctwap";// 电信wap接入点
	public final static String CMW_CTNET = "ctnet";// 电信net接入点
	/*---------建行接入点apn名称对应值---------*/
	public final static String CMWAP = "cmwap";
	public final static String CMNET = "cmnet";
	public final static String UNIWAP = "uniwap";
	public final static String TGWAP = "3gwap";
	public final static String UNINET = "uninet";
	public final static String TGNET = "3gnet";
	public final static String CTAPN = "#777";// 电信的无论wap和net都是#777
	/*------------接入点数据库字段------------*/
	public final static String APN_ID = "_id";
	public final static String APN_NAME = "name";
	public final static String APN = "apn";
	public final static String APN_PROXY = "proxy";
	public final static String APN_PORT = "port";
	public final static String APN_MCC = "mcc";
	public final static String APN_MNC = "mnc";
	public final static String APN_NUNERIC = "numeric";
	public final static String APN_USER = "user";
	public final static String APN_MMSC = "mmsc";
	public final static String APN_PASSWORD = "password";
	/*------------接入点数据库字段值------------*/
	public final static String CT_WAP_USERNAME = "ctwap@mycdma.cn";// 电信wap用户名
	public final static String CT_NET_USERNAME = "ctnet@mycdma.cn";// 电信net用户名
	public final static String CT_PASSWORD = "vnet.mobi";// 电信接入点秘密，wap和net都一样
	public final static String CT_PROXY = "10.0.0.200";// 电信代理地址
	public final static String WAP_PROXY = "10.0.0.172";// 移动、联通的代理地址
	public final static String WAP_PROXY_PORT = "80";// 代理端口
	/*------------普通使用------------*/
	public final static String APNID = "apn_id";// 修改默认接入点时需要用到的字段
	public static final Uri APN_URI = Uri.parse("content://telephony/carriers");// 访问apn数据库的uri
	public static final Uri CURRENT_APN_URI = Uri.parse("content://telephony/carriers/preferapn");// 取得当前默认接入点的uri
	public static final Uri CURRENT_APN_URIXT800 = Uri.parse("content://telephony/carriers/preferapn2");// 取得当前默认接入点的uri
	public final static String APNIDXT800 = "apn2_id";// 修改默认接入点时需要用到的字段


	/**
	 * 
	 * 相关数字定义
	 * 
	 */
	// 取动态数据的界面标记，原因在于以前出现过用户界面上的一些控件
	// （比如EditText或者Spinner）会影响弹出框中动态数据的处理
	public static final int CARD_ALERT = 1; // 弹出框
	public static final int CARD_VIEW = 2; // 普通界面
	public final static int CONNECTION_GETDATA_SUCCESS = 10;// 通讯获取页面数据正常
	public final static int CONNECTION_GETDATA_FAILE = 1;// 通讯获取页面数据异常
	public final static int CONNECTION_DATA_CANNOTFIND = 100;// 通讯获取用户信息异常
	public static final int DB_VERSION = 1;// 本地数据库sqlite版本
	// 设置控件的padding值分别为0、10、15、20
	public static final int PADDING_ZERO = 0;
	public static final int PADDING_SMALL = 10;
	public static final int PADDING = 15;
	public static final int PADDING_BIG = 20;
	public static final int MAINMENU_COLUMN = 3;// 定义九宫格列数
	public static final int TEXT_SIZE = 15;// 文本大小
	public static final int TITLE_TEXT_SIZE = 17;// 界面标题大小
	
	public static final int TOAST_SHOW_TIME = 2;//toast提示显示时间
	public static final int DEFAULT_CRYPTO_TIMES =8;//默认加密次数
	public static final int CHECK_USERTOKEN_BYTES =32;//UserToken校验位数
	public static final int TABHOST_HEIGHT =45;//选项卡高度
	
	public final static int MOBILE_NUMBER_LENGTH = 11;// 手机号长度
	public final static int PASSWORD_MIN_LENGTH =6;
	public final static int SECURIYTCODE_LENGTH=4;
	/**
	 * 
	 * 相关符号定义
	 * 
	 */
	public final static String DOLOR_LEFT = "${";
	public final static String DOLOR_RIGHT = "}";
	public final static char DOLOR_RIGHT_CHAR = '}';
	public final static char DOLOR_LEFT_CHAR = '{';
	public final static String DOLOR = "$";
	public final static char DOLOR_CHAR = '$';
	public final static String DOLOR_RIGHT_S = ")";
	public final static char DOLOR_RIGHT_S_CHAR = ')';
	public final static char DOLOR_LEFT_S_CHAR = '(';
	public final static String DOLOR_LEFT_S = "$(";
	public static final String COMMA = ",";
	public static final String DIAN = ".";
	public static final String LEFT_SLASH = "/";
	public static final String NEWLINE = "\n";
	public static final String TAB = "\t";
	public static final String SPACE = " ";
	public static final String BARS = "-";
	public static final String ONE_EQUAL = "=";
	public static final String YU = "&";
	public static final String WEN = "?";
	/**
	 * 
	 * 普通情况定义
	 * 
	 */
	public static final String LOG_TAG = "MoblieBank_Client";//日志记录标识
	public static final String ZERO = "0";// 定义0的字符串，在处理function拼接日期时用
	public final static String HAVE_BACK_BUTTON = "haveBackButton"; // 用于标记当前activity是否是根activity。主要用于判断标题栏左侧的“返回”按钮是否存在
	public final static String BACK_BUTTON = "true";// 和HAVE_BACK_BUTTON字段搭配使用，表示需要后退按钮
	public final static String MENU_PICTURE = "picture"; // 在menuitem和menu标签中定义adapter时指定结果集中数据和展现页面中控件的对应关系
	public final static String MENU_PICTURE_NAME = "name";// 和MENU_PICTURE字段搭配使用
	public final static String VAR_MAP = "varMap";// 作为封装setvar的map时key字段来用
	public final static String DB_MAP = "dbMap";// 作为封装数据库记录的map时key字段来用
	public final static String CONTENT = "content";// 作为封装结构化map时的key字段来用
	public final static String SETINPUTNAME = "setinputName";// 处理setinput标签时封装结构化map时的key字段
	public final static String SETINPUTVALUE = "setinputValue";// 处理setinput标签时封装结构化map时的key字段
	public final static String STAR = "*";// input标签的format属性截取值
	public final static String BIG_N = "N";// input标签的format属性截取值
	public final static String SMALL_N = "n";// input标签的format属性截取值
	public static final String LOCAL_FILE_PATH = "/data/data/com.chinamworld.login/files";// 程序安装目录中存放本地静态文件的路径。通常是在第一次运行程序是拷贝安装目录时用
	public static final String LOCAL_CONFIG_PATH = "/data/data/com.chinamworld.login/shared_prefs";// 程序安装目录中存放本地配置文件的路径。通常是在第一次运行程序是拷贝安装目录时用
	public static final String PAGES = "pages";// 静态页面是放在assets目录下的pages目录下，拷贝后的配置文件放在安装目录下的files目录的pages目录下
	public static final String TEXT = "text";// 作为封装结构化map时的key字段来用
	public static final String DLG = "dlg";// 作为封装结构化map时的key字段来用，弹出框的关键字
	public static final String TEXTVIEW = "textView";// 作为封装结构化map时的key字段来用
	public static final String DATAFORMAT = "yyyyMMdd";// function标签的日期选择器转换日期格式
	public static final String DB_NAME = "BankClient"; // 程序自建数据库的名称
	public static final String DROP_TABLE = "DROP TABLE IF EXISTS ";// 处理sql语句删除表时拼接串
	public static final String REQUEST_KEY = "request";//作为封装结构化map时的key字段来用
	public static final String ACTIVITY_EXTRA_KEY = "backData";//界面跳转传送数据关键字
	/**
	 * 
	 * 通讯相关常量配置
	 * 
	 */
	public static final String DEFAULT_ENCORD = "UTF-8";// 默认通讯编码方式
	public static final String HTTP = "http";// 注册通讯访问方式，以及UI工具类处理地址时使用
	public static final String HTTPS = "https";// 注册通讯访问方式，以及UI工具类处理地址时使用
	public static final String USER_AGENT = "MBC-User-Agent";// 每次发送请求时在请求头中设置的参数的key
	public static final String CONTENT_CHARSET = "utf-8";
	public static final int CONN_PER_ROUTE_BEAN = 12; 
	public static final int MAX_TOTAL_CONNECTIONS = 20;
	public static final int CONNECTION_TIME_OUT = 60 * 1000;//设置链接超时时间
	public static final int	SOCKET_TIME_OUT =  60 * 1000;//设置socket超时时间
	public static final int SOCKET_BUFFER_SIZE = 8*1024;;//设置sokect缓存最大字节数
	public static final int HTTP_PROXY_PORT = 80 ;//http协议代理端口
	public static final int HTTPS_PROXY_PORT = 443 ;//https协议代理端口
	
	/**
	 * 
	 * 九宫格图片名称
	 * 
	 */
	public static final String CELL_AS_VIEW_CONTENT_INPUT = "cell_view_input";
	public static final String INPUT_PICTURE = "input_picture";
	public static final int CONNECTION_REFRESH_SUCCESS = 123;
	
	public static int SUBSTRING_SIZE = 23;
	
//	public static String COB_URL = "http://192.168.7.24:8081/BocMBCGate/";
//	public static String COB_URL = "https://mbsuat.boc.cn/BocMBCGate/";
	
	public static String MENU_GROUP_SRC = "menuGroupSrc";
	public static String MENU_GROUP_MENUITEMS = "menuGroupMenuItems";
	
	public static String LABLE_A_TEXT = "lableAText";
	public static String LABLE_A_HREF = "lableAHref";
	public static String START = "start";
	public static String END = "end";
	public static String LABLE_A_AND_IMAGE_MAP_LIST = "aAndImgMapList";
	public static String BEFORE_TEXT_LENGTH = "beforeTextLength";
	public static String LABLE_FLAG = "lableFlag";
	
	public static String STOP = "stop";
	
	
}
