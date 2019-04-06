package Calculator_v1;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Controller implements ActionListener{
    Model model;
    Controller (Viewer viewer){
        model = new Model(viewer);
    }

    public void actionPerformed(ActionEvent event){
        String command = event.getActionCommand();
        model.doAction(command);
    }

}