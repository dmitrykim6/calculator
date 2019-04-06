import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Controller implements ActionListener {
    Model model; //Определяем переменную типа Model
    Controller (Viewer viewer){
        model = new Model(viewer); //Создаем объект класса Model и передаем объект viewer в качестве аргумента
    }

    public void actionPerformed(ActionEvent event){
        String command = event.getActionCommand();
        model.doAction(command);
    }
}
