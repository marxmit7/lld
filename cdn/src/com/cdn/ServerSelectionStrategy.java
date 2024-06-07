package cdn.src.com.cdn;

public interface ServerSelectionStrategy{
    Server selectServer(ServerType serverType);
}