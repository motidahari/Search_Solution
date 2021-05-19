import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;

public class A_Star extends Algorithm{
    private HashSet<StateGame> _OpenList;
    private HashSet<StateGame> _ClosedList;
    private StateGame _Start,_Goal;


    public A_Star(Board in, StateGame[] startAndGoal){
        _OpenList = new HashSet<>();
        _ClosedList = new HashSet<>();
        this._Start = startAndGoal[0];
        this._Goal = startAndGoal[1];
    }
    @Override
    public void solve() {

    }
}
