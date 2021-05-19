import java.util.Stack;

public class DFBnB extends Algorithm{
    private Stack<StateGame> _Stack;
    private StateGame _Start,_Goal;


    public DFBnB(Board in, StateGame[] startAndGoal) {
        _Stack = new Stack<StateGame>();
        this._Start = startAndGoal[0];
        this._Goal = startAndGoal[1];
    }

    @Override
    public void solve() {

    }
}
