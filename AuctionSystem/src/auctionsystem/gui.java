 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auctionsystem;
import java.awt.Container;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 *
 * @author Mena108
 */
class gui {
    private JFrame ourframe;
    private Container ourcontainer;
    private JLabel ourlabel;
    private Border ourborder;
    
    
    
    gui()
    {
        ourframe = new JFrame();
        ourcontainer = new Container();
        ourlabel = new JLabel();
        ourborder = BorderFactory.createTitledBorder("Our Clock");
        ourframe.setDefaultCloseOperation(3);
        ourframe.setResizable(true);
        ourframe.setTitle("Timing");
        ourframe.setBounds(0, 0, 150, 150);
        ourcontainer.setBounds(0, 0, 150, 150);
        ourlabel.setBounds(7, 0, 130, 80);
        ourframe.setVisible(true);
        ourcontainer.setVisible(true);
        ourlabel.setVisible(true);
        ourlabel.setBorder(ourborder);
        ourframe.add(ourcontainer);
        ourcontainer.add(ourlabel);
    }
    
     void addTime(String Time)
    {
        this.ourlabel.setText(Time);
    }

    
}
