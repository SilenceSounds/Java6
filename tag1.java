/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tagsP;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;

/**
 *
 * @author Xan-T
 */
//Un tag vacío que muestre tu nombre completo y la fecha del día.
public class tag1 extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException{
        JspWriter out = getJspContext().getOut();
        out.println("Yerik Jael Morales Avalos - 15 de Marzo del 2021.");
    }
}
