package state;

/**
 * Concrete implementation of Tool state, it will Select Eraser and perform the action a Eraser can do.
 */
public class EraserTool implements Tool
{
    @Override
    public void mouseUp()
    {
        System.out.println("Erase object");
    }

    @Override
    public void mouseDown()
    {
        System.out.println("Eraser Icon");
    }
}
