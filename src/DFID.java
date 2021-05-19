import java.util.HashSet;

public class DFID extends Algorithm{

    private StateGame _Start,_Goal;
    private static HashSet<String> _ClosedList;


    public DFID(Board in, StateGame[] startAndGoal) {
        _ClosedList = new HashSet<>();
        this._Start = startAndGoal[0];
        this._Goal = startAndGoal[1];
        solve();
    }

    @Override
    public void solve() {

    }
}
