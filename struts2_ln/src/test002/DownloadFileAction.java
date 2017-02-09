package test002;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.InputStream;

/**
 * Created by yanglc on 2017/2/9.
 * 这个是文件下载示例action
 */
public class DownloadFileAction extends ActionSupport{
    public InputStream getInputStream()throws Exception{
        return ServletActionContext.getServletContext().getResourceAsStream("/upload/1.jpg");    //获得文件输出流
    }
    public String execute()throws Exception{
        return SUCCESS;
    }
}
