package state;

/**
 * This class is Acts like a Context , where we have a state on which we want to perform some operation
 * and the state will behave differently with different implementations of state.
 */
public class Canvas
{
    private Tool currentTool;

    public void mouseDown()
    {
        currentTool.mouseDown();
    }

    public void mouseUp()
    {
        currentTool.mouseUp();
    }

    public Tool getCurrentTool()
    {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool)
    {
        this.currentTool = currentTool;
    }
}
