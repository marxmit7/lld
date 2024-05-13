package design_pattern.abstract_factory_pattern;

public class WindowsCheckBoxImpl implements CheckBox{
    @Override
    public void onCheckBoxMark() {
        System.out.println("on windows check box marked");
    }
}