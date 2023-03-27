package behavioral.iterator.iterators;

import behavioral.iterator.models.SongInfo;

import java.util.Iterator;

public interface SongIterator {

    Iterator<SongInfo> createIterator();
}
