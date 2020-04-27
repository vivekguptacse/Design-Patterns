package behavioral.strategy;

public class ImageStore
{
//    private Compressor compressor;
//
//    private Filter filter;
//
//    public ImageStore(Compressor compressor , Filter filter)
//    {
//        this.compressor = compressor;
//        this.filter = filter;
//    }

//    public void store(String fileName)
//    {
//        compressor.compress(fileName);
//
//        filter.apply(fileName);
//    }

    public void store(String filename, Compressor compressor , Filter filter)
    {
        compressor.compress(filename);
        filter.apply(filename);
    }
}
