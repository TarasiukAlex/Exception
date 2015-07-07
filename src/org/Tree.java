/*
 * Created by JFormDesigner on Tue Jul 07 08:44:21 GMT+02:00 2015
 */

package org;

import java.awt.*;
import javax.swing.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;

/**
 * @author unknown
 */
public class Tree extends JFrame {
    public Tree() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - alex T
        button1 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new FormLayout(
            "7*(default, $lcgap), default",
            "10*(default, $lgap)"));

        //---- button1 ----
        button1.setText("text");
        contentPane.add(button1, CC.xywh(15, 19, 1, 2));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - alex T
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
