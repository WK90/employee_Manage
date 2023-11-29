package com.crazy.employee.manage.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhxm
 * @version 1.0.0
 * @ClassName AjaxResult
 * @Description
 * @date 2023-11-29
 */
@ApiModel
public class AjaxResult<T> {
    private static final long serialVersionUID = 1L;
    public static final String CODE_TAG = "code";
    public static final String MSG_TAG = "msg";
    public static final String DATA_TAG = "data";
    private Map<String, Object> extData;
    @ApiModelProperty(
            value = "状态码",
            example = "200"
    )
    private int code;
    @ApiModelProperty("返回消息")
    private String msg;
    @ApiModelProperty("数据")
    private T data;

    public AjaxResult() {
        this.extData = new HashMap();
    }

    public AjaxResult(int code, String msg) {
        this.extData = new HashMap();
        this.code = code;
        this.msg = msg;
    }

    public AjaxResult(int code, String msg, T data) {
        this(code, msg);
        this.data = data;
    }

    public AjaxResult put(String key, Object value) {
        if ("data".equals(key)) {
            this.data = (T) value;
        } else {
            this.putExtData(key, value);
        }

        return this;
    }

    public AjaxResult putExtData(String key, Object value) {
        this.extData.put(key, value);
        return this;
    }

    public Object get(String key) {
        Object result = null;
        if ("code".equals(key)) {
            result = this.code;
        } else if ("msg".equals(key)) {
            result = this.msg;
        } else if ("data".equals(key)) {
            result = this.data;
        }

        if (result == null) {
            result = this.getExtDataValue(key);
        }

        return result;
    }

    public Object getExtDataValue(String key) {
        return this.extData.get(key);
    }

    public static AjaxResult success() {
        return success("操作成功");
    }

    public static <T> AjaxResult success(T data) {
        return success("操作成功", data);
    }

    public static AjaxResult success(String msg) {
        return success(msg, (Object)null);
    }

    public static <T> AjaxResult success(String msg, T data) {
        return new AjaxResult(200, msg, data);
    }

    public static AjaxResult error() {
        return error("操作失败");
    }

    public static AjaxResult error(String msg) {
        return error(msg, (Object)null);
    }

    public static <T> AjaxResult error(String msg, T data) {
        return new AjaxResult(500, msg, data);
    }

    public static AjaxResult error(int code, String msg) {
        return new AjaxResult(code, msg, (Object)null);
    }

    public Map<String, Object> getExtData() {
        return this.extData;
    }

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public T getData() {
        return this.data;
    }

    public void setExtData(Map<String, Object> extData) {
        this.extData = extData;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof AjaxResult)) {
            return false;
        } else {
            AjaxResult<?> other = (AjaxResult)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getCode() != other.getCode()) {
                return false;
            } else {
                label49: {
                    Object this$extData = this.getExtData();
                    Object other$extData = other.getExtData();
                    if (this$extData == null) {
                        if (other$extData == null) {
                            break label49;
                        }
                    } else if (this$extData.equals(other$extData)) {
                        break label49;
                    }

                    return false;
                }

                Object this$msg = this.getMsg();
                Object other$msg = other.getMsg();
                if (this$msg == null) {
                    if (other$msg != null) {
                        return false;
                    }
                } else if (!this$msg.equals(other$msg)) {
                    return false;
                }

                Object this$data = this.getData();
                Object other$data = other.getData();
                if (this$data == null) {
                    if (other$data != null) {
                        return false;
                    }
                } else if (!this$data.equals(other$data)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof AjaxResult;
    }
}

