package com.lovo.action;  
  
/** 
 * Action执行结果 
 * @author 骆昊 
 * 
 */  
public class ActionResult {  
    private ResultContent resultContent;  
    private ResultType resultType;  
  
    public ActionResult(ResultContent resultContent) {  
        this(resultContent, ResultType.Forward);  
    }  
  
    public ActionResult(ResultContent resultContent, ResultType type) {  
        this.resultContent = resultContent;  
        this.resultType = type;  
    }  
  
    /** 
     * 获得执行结果的内容 ,可以存储一个字符串表示要跳转或重定向到的资源的URL，
     * 它也可以存储一个对象来保存对用户请求进行处理后得到的数据（模型），
     * 为了支持Ajax操作，我们可以将此对象处理成JSON格式的字符串。
     */  
    public ResultContent getResultContent() {  
        return resultContent;  
    }  
      
    /** 
     * ResultType代表了对用户请求处理后如何向浏览器产生响应
     * 获得执行结果的类型 
     */  
    public ResultType getResultType() {  
        return resultType;  
    }  
  
}  

