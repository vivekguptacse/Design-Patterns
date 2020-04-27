package iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowsingHistroyWithArray
{
    String[] urls = new String[10];
    int index = 0;

    public void push(String url)
    {
        if(index < 10)
        {
            urls[index++] = url;
        }
    }
    public String pop()
    {
        String url = urls[index];
        urls[index--] = null;
        return url;
    }

    public Iterator createIterator()
    {
        return new ArrayIterator(this, index);
    }

    public class ArrayIterator implements  Iterator<String>
    {
        private BrowsingHistroyWithArray history;
        private int index;

        public ArrayIterator(BrowsingHistroyWithArray history, int index)
        {
            this.history = history;
            this.index = index - 1;
        }

        @Override
        public boolean hasNext()
        {
            return index >= 0;
        }

        @Override
        public String current()
        {
            return history.urls[index];
        }

        @Override
        public void next()
        {
            index--;
        }
    }
}
