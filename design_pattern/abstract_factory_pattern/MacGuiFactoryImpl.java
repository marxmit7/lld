package design_pattern.abstract_factory_pattern;

public class MacGuiFactoryImpl implements GuiFactory{

    @Override
    public Button createButton(){
        return new MacButtonImpl();
    }

    @Override
    public CheckBox createCheckBox(){
        return new MacCheckBoxImpl();
    }
}