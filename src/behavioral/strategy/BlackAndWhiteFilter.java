package behavioral.strategy;

public class BlackAndWhiteFilter implements Filter
{
    @Override
    public void apply(String fileName)
    {
        System.out.println("applying black and white filter to " + fileName);
    }
}
