package design_pattern.abstract_factory_pattern;

public class WindowsButtonImpl implements Button{

    public WindowsButtonImpl(){}
           
    @Override
    public void onClick(){
        System.out.println("windows button is clicked");
    }
}