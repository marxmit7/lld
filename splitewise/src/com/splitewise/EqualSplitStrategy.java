package splitewise.src.com.splitewise;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

public class EqualSplitStrategy implements SplitStrategy {

    public Map<User,Double> splitExpense(Double totalExpense, List<User> participants){

        Map<User,Double> finalShare = new HashMap<>();

        Double finalAmount = totalExpense/participants.size();
        participants.stream().forEach(participant -> finalShare.put(participant,finalAmount));

        return finalShare;

    }

}