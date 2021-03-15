/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tagsP;
import java.io.IOException;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author Xan-T
 */
//Un tag con cuerpo que muestre la información escrita en el body, y la hora actual.
public class tag2 extends SimpleTagSupport {
    
    StringWriter sw = new StringWriter();
    DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    Date date = new Date();
    
    @Override
    public void doTag() throws JspException, IOException{
        getJspBody().invoke(sw);
        getJspContext().getOut().println(sw.toString() + ". Escrtio a las: " + dateFormat.format(date));
    }
}