package cdn.src.com.cdn;

public class ServerFactory{
    public static Server createServer(ServerType serverType){
        switch (serverType) {
            case ORIGIN:
                return  new OriginServer();
            case EDGE:
                return new EdgeServer();
            default:
                throw new IllegalArgumentException("unsupported server type given as argument");
        }
    }
}