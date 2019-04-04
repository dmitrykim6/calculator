import java.awt.event.ActionListener;
import java.awt.event.ActinEvent;

class Controller implements ActionListener{
    Model model;
    Controller (Viewer viewer){
        model = new Model(Viewer);
    }

    public void actionPerformed(ActionEvent event){
        String command = event.getAvtionCommand();
        model.doAction(command);
    }

}