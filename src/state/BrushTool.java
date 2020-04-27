package state;

/**
 * Concrete implementation of Tool state, it will Select Brush and perform the action a brush can do.
 */
public class BrushTool implements Tool
{
    @Override
    public void mouseUp()
    {
        System.out.println("Draw a line");
    }

    @Override
    public void mouseDown()
    {
        System.out.println("Brush Icon");
    }
}
