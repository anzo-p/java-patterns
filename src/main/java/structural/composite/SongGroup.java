package structural.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup extends SongComponent {

    private ArrayList songComponents = new ArrayList();

    private String groupName;
    private String description;

    public SongGroup(String groupName, String description) {
        this.groupName = groupName;
        this.description = description;
    }

    String getGroupName() {
        return this.groupName;
    }

    String getDescription() {
        return this.description;
    }

    @Override
    public void add(SongComponent songComponent) {
        songComponents.add(songComponent);
    }

    @Override
    public void remove(SongComponent songComponent) {
        songComponents.remove(songComponent);
    }

    @Override
    public SongComponent get(int componentIndex) {
        return (SongComponent) songComponents.get(componentIndex);
    }

    @Override
    public void show() {
        System.out.println("\n" + getGroupName() + " " + getDescription());

        Iterator songIterator = songComponents.iterator();

        while (songIterator.hasNext()) {
            SongComponent songInfo = (SongComponent) songIterator.next();

            songInfo.show();
        }
    }


}
