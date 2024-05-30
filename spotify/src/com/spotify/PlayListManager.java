package spotify.src.com.spotify;

import java.util.Map;
import java.util.HashMap;

public class PlayListManager{
    private static Map<String, Map<String, PlayList>> userPlayListMap;
    private static PlayListManager instance;
    private UserManager userManager;

    private PlayListManager(UserManager userManager){
        this.userManager = userManager;
    };

    public static PlayListManager getInstance(UserManager userManager){
        if(instance == null) {
            instance = new PlayListManager(userManager);
            userPlayListMap = new HashMap<>();
        }

        return instance;
    }

    public PlayList cratePlayList(String name, String userId) throws Exception{
        String id  = generateId();
        if(!userManager.isMember(userId)){
            throw new Exception("user is not registered");}  
        PlayList playList = new PlayList(id, name, userId);
        userPlayListMap.computeIfAbsent(userId, k-> new HashMap<String, PlayList>(){{
            put(playList.getName(), playList);
        }});
        return playList;

    }

    public PlayList getPlayList(String userId, String playListName){

        this.userPlayListMap.computeIfAbsent(userId,k-> {
            try {
                return new HashMap<String, PlayList>(){{
                    put(playListName, cratePlayList(playListName, userId));
                }};
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        });

        return ((Map<String, PlayList>)(this.userPlayListMap.get(userId))).get(playListName);

    }

    public Map<String, PlayList> getAllPlayListMap(String userId){
        return userPlayListMap.getOrDefault(userId, new HashMap<String, PlayList>());
    }

    public void deletePlayList(String name, String userId){
        userPlayListMap.getOrDefault(userId, new HashMap<String, PlayList>()).remove(name);
    }

    private String generateId(){
        return java.util.UUID.randomUUID().toString();
    }
}