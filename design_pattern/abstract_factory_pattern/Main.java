package design_pattern.abstract_factory_pattern;

public class Main {

    private GuiFactory guiFactory ;

    public Main(GuiFactory guiFactory){
        this.guiFactory = guiFactory;
    }
    private void createUI(){

        Button button = guiFactory.createButton();
        CheckBox checkBox = guiFactory.createCheckBox();

        button.onClick();
        checkBox.onCheckBoxMark();
    }

    public static void main(String[] args){

        Main macGuiFactory = new Main(new MacGuiFactoryImpl());
        Main windowsGuiFactory = new Main(new WindowsGuiFactoryImpl());

        macGuiFactory.createUI();
        windowsGuiFactory.createUI();

    }

}