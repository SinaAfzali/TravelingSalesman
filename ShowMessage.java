package classes;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ShowMessage{
    ShowMessage(String Message,String Title,int time){

        final JOptionPane optionPane = new JOptionPane( Message , JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);
        final JDialog dialog = new JDialog();
        dialog.setTitle(Title);
        dialog.setModal(true);
        dialog.setBounds(600, 300, 400, 300);
        dialog.setContentPane(optionPane);
        dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        dialog.pack();
        Timer timer = new Timer(time, new AbstractAction() {
            public void actionPerformed(ActionEvent ae) {
                dialog.dispose();
            }
        });
        timer.setRepeats(false);//the timer should only go off once
        timer.start();
        dialog.setVisible(true);
    }

}
