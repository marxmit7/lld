package design_pattern.adapter;

public class Main{

    public static void main(String[] args){

        UsSocket usPlug = new UsSocket();
        EuSocket adapter = new UsSocketAdapter(usPlug);

        adapter.plugin();


    }
}