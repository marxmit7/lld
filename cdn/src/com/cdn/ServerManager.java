package cdn.src.com.cdn;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class ServerManager{
    private static ServerManager instance ;
    private static Map<ServerType, List<Server>> serverMap;

    private ServerManager(){}

    public synchronized static ServerManager getInstance(){
        if(instance==null){
            instance = new ServerManager();
            serverMap = new HashMap<>();
        }

        return instance;
    }

    public void addSever(Server server){
        if(server instanceof OriginServer){
            serverMap.computeIfAbsent(ServerType.ORIGIN, k->new ArrayList<>()).add(server);
        } else {
            serverMap.computeIfAbsent(ServerType.EDGE, k->new ArrayList<>()).add(server);
        }

    }

    public List<Server> getServer(ServerType serverType){
        return serverMap.getOrDefault(serverType, new ArrayList<>());
    }
}