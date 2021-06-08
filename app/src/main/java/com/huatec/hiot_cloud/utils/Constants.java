package com.huatec.hiot_cloud.utils;

/**
 * 常量类
 */
public class Constants {

    /**
     *
     */
    public static final int MAIN_FRAGMENT_COUNT = 4;

    /**
     * 主页viewpager的消息fragment选择序号
     */
    public static final int MIAN_VIEWPAGER_INDEX_MESSAGE = 0;

    /**
     * 主页viewpager的设备fragment选择序号
     */
    public static final int MIAN_VIEWPAGER_INDEX_EQUIPMENT = 1;

    /**
     * 主页viewpager的场景fragment选择序号
     */
    public static final int MIAN_VIEWPAGER_INDEX_SCENE = 2;

    /**
     * 主页viewpager的我的fragment选择序号
     */
    public static final int MIAN_VIEWPAGER_INDEX_MINE = 3;

    /**
     * APP登录的loginCode
     */
    public static final String LOGIN_CODE_APP = "app";

    /**
     * APP的注册用户类型
     */
    public static final String REGISTER_TYPE_NORMAL = "1";

    /**
     * 服务端返回消息状态属性成功
     */
    public static final int MSG_STATUS_SUCCESS = 1;

    /**
     * 网络访问失败吐司
     */
    public static final String TOAST_MSG_NETWORK_FAIL = "当前网络无法访问，请稍后再试";

    /**
     * form-data类型
     */
    public static final String MULTIPART_FORM_DATA = "multipart/form-data";

    /**
     * token失效状态
     */
    public static final int MSG_STATUS_TOKEN_OUT = -100;

    /**
     * 设备已绑定状态
     */
    public static final int DEVICE_STATUS_BINDED = 1;

    /**
     * 设备未绑定状态
     */
    public static final int DEVICE_STATUS_UNBINDED = 0;

    /**
     * 设备id
     */
    public static final String INTENT_EXTRA_DEVICE_ID = "DEVICE_ID";

    /**
     * 已激活
     */
    public static final String DEVICE_STATUS_ACTIVITY = "1";

    /**
     * 未激活
     */
    public static final String DEVICE_STATUS_UN_ACTIVITY = "0";

    /**
     * 开关类型
     */
    public static final String DATA_STREAM_TYPE_SWITCH = "2";
    /**
     * 类型
     */
    public static final String DATA_STREAM_TYPE_VALUE = "1";
    /**
     * 类型
     */
    public static final String DATA_STREAM_TYPE_GPS = "3";
    /**
     * 类型
     */
    public static final String DATA_STREAM_TYPE_TEXT = "4";

    /**
     * 开关状态开
     */
    public static final int SWITCH_STATUS_ON = 1;

    /**
     * 开关状态关
     */
    public static final int SWITCH_STATUS_OFF = 0;
}
