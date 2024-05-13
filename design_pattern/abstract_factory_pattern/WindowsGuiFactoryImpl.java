package design_pattern.abstract_factory_pattern;

public class WindowsGuiFactoryImpl implements GuiFactory{
    @Override
    public Button createButton(){
        return new WindowsButtonImpl();
    }

    @Override
    public CheckBox createCheckBox(){
        return new WindowsCheckBoxImpl();
    }
}