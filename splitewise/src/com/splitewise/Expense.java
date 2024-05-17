package splitewise.src.com.splitewise;

import java.util.List;
import java.util.Map;

public abstract class Expense{
    private double money;
    private List<User> participants;
    private Map<User, Double> shares;
    private SplitStrategy splitStrategy;

    

    public Expense(double money, List<User>participants, Map<User, Double> shares, SplitStrategy splitStrategy){
            this.money = money;
            this.participants = participants;
            this.shares = shares;
            this.splitStrategy = splitStrategy;
    }

    public void calculateShares(){
        
    };
}