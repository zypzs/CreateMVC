package com.lovo.action;  
  
/** 
 * Actionִ�н�� 
 * @author ��� 
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
     * ���ִ�н�������� ,���Դ洢һ���ַ�����ʾҪ��ת���ض��򵽵���Դ��URL��
     * ��Ҳ���Դ洢һ��������������û�������д����õ������ݣ�ģ�ͣ���
     * Ϊ��֧��Ajax���������ǿ��Խ��˶������JSON��ʽ���ַ�����
     */  
    public ResultContent getResultContent() {  
        return resultContent;  
    }  
      
    /** 
     * ResultType�����˶��û������������������������Ӧ
     * ���ִ�н�������� 
     */  
    public ResultType getResultType() {  
        return resultType;  
    }  
  
}  

