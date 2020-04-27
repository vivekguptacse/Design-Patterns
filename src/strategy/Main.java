package strategy;

/**
 * Based on the specific Strategy, the Objects will be initiated.
 */
public class Main
{
    public static void main(String[] args)
    {
//        ImageStore store = new ImageStore(new JPEGCompressor(),new BlackAndWhiteFilter());
//        store.store("test");
//
//        store = new ImageStore(new PNGCompressor(),new BlackAndWhiteFilter());
//        store.store("test");

        ImageStore imageStore = new ImageStore();
        imageStore.store("test", new JPEGCompressor(),new BlackAndWhiteFilter());
        imageStore.store("pngtest" , new PNGCompressor(),new HighContrast());
    }
}
