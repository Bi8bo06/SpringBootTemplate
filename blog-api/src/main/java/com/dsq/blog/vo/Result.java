package com.dsq.blog.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Result {
    private boolean success;

    private int code;

    private String msg;

    private Object data;


    public static Result success(Object data) {
        return new Result(true, 200, "success", data);
    }

    public static Result fail(int code, String msg) {
        return new Result(false, code, msg, null);
    }

    public static Result fail(String msg){
        return Result.fail(500,msg);
    }

    public static Result fail(CODE code){
        return Result.fail(code.getNumber(), code.getMsg());
    }

    /**
     * 错误返回代码枚举类
     * @author Mehcell_Water
     * @date 2022/9/27 14:04
     */
    public enum CODE{
        NOT_FIND_PAGE(404,"未查找到该页面");


        private Integer number;
        private String msg;

        CODE(Integer number, String msg) {
            this.number = number;
            this.msg = msg;
        }

        public Integer getNumber() {
            return number;
        }

        public void setNumber(Integer number) {
            this.number = number;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
    }
}
