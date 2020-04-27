package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Browsing history class maintain the history of the urls visited, so if user want to
 * access the history it can create an iterator which can be of any type today its List,
 * Tomorrow may be Array so in that case we don't need to change any other class, only this
 * class will be modified.
 *
 */
public class BrowsingHistory
{
    List<String> urls = new ArrayList<>();

    public void push(String url)
    {
        urls.add(url);
    }
    public String pop()
    {
        int lastIndex = urls.size() - 1;
        String url = urls.get(lastIndex);
        urls.remove(url);
        return url;
    }

    public Iterator createIterator()
    {
        return new ListIterator(this);
    }

    public class ListIterator implements  Iterator<String>
    {
        private BrowsingHistory history;
        private int index;

        public ListIterator(BrowsingHistory history)
        {
            this.history = history;
            index = history.urls.size() - 1;
        }

        @Override
        public boolean hasNext()
        {
            return index >= 0;
        }

        @Override
        public String current()
        {
            return history.urls.get(index);
        }

        @Override
        public void next()
        {
            index--;
        }
    }
}
