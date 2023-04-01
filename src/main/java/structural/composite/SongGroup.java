package structural.composite;

import java.util.ArrayList;

public class SongGroup extends SongComponent {

    private final ArrayList<SongComponent> songComponents = new ArrayList<>();

    private final String groupName;
    private final String description;

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
        return songComponents.get(componentIndex);
    }

    @Override
    public void show() {
        System.out.println("\n" + getGroupName() + " " + getDescription());

        for (SongComponent songInfo : songComponents) {
            songInfo.show();
        }
    }


}
