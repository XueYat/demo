package com.ch00.demo.day0731;

public enum WebError {
    successrequest("请求成功", 0), badrequest("请求失败", 1), unauthorized("权限不足", 401), incorrectparam("参数有误", 402), notound("找不到资源", 404), internalservererror("内部报错", 500);

    private String content;
    private int no;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    WebError(String content, int no) {
        this.content = content;
        this.no = no;
    }

    public static String test(int no){
        WebError[] webErrors = WebError.values();
        for(WebError webError : webErrors){
            if(webError.getNo() == no){
                return webError.getContent();
            }
        }
        return null;
    }
}
