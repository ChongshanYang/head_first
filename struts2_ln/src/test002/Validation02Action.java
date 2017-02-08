package test002;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Date;
import java.util.regex.Pattern;

/**
 * Created by yanglc on 2017/2/8.
 * 在action中重写public void validate()方法，自定义校验器，实现此方法后不需要再配置校验器xml文件
 */
public class Validation02Action extends ActionSupport{
    private String name;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    private String mobile;
    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String execute() throws Exception{
        return SUCCESS;
    }
    @Override
    public void validate() {//validate()会对action中的所有方法校验
        if(this.name==null || "".equals(this.name.trim())){
            this.addFieldError("name", "用户名不能为空");
        }
        if(this.mobile==null || "".equals(this.mobile.trim()))
        {
            this.addFieldError("mobile", "手机号不能为空");
        }else{
            //使用正则表达式判断手机号,第一个数字为1，第二个数字为3或5或8，后面跟9位数字
            if(!Pattern.compile("^1[358]\\d{8}$").matcher(mobile).matches()){
                this.addFieldError("mobile", "手机号格式不正确");
            }
        }
        if(this.date==null||"".equals(this.date)){
            this.addFieldError("date", "日期不能为空");
        }
    }
}
