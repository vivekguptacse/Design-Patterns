package behavioral.state;

/**
 * Concrete implementation of Tool state, it will Select Selection tool and perform the action a selection can do.
 */
public class SelectionTool implements Tool
{
    @Override
    public void mouseUp()
    {
        System.out.println("Dashed Rectange is drawn");
    }

    @Override
    public void mouseDown()
    {
        System.out.println("Selection Icon");
    }
}
