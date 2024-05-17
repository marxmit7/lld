package splitewise.src.com.splitewise;

import java.util.Map;
import java.util.List;

public interface SplitStrategy{
    
    public Map<User, Double> splitExpense(Double expense , List<User> participants);
}