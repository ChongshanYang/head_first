package test002;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by yanglc on 2017/2/9.
 * 这个action是处理文件上传的示例
 */
public class UploadFileAction extends ActionSupport{
    private File upload;
    private String uploadFileName;
    private String uploadContentType;
    private String name;
    public String execute()throws Exception{
        String path = ServletActionContext.getServletContext().getRealPath("/upload");
        String filename = path+File.separator+name;       //这里的name属性是通过反射在struts.xml文件的<action>标签下的<param>标签赋值，这样可使文件名固定，便于页面使用
        FileInputStream in = new FileInputStream(upload);
        FileOutputStream out = new FileOutputStream(filename);
        byte[]b = new byte[1024];
        int len = 0;
        while((len=in.read(b))>0){
            out.write(b,0,len);
        }
        out.close();
        return SUCCESS;
    }

    public File getUpload() {
        return upload;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
