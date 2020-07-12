package org.example;

import java.util.ArrayList;
import java.util.List;

public class SnapshotManager {
    private final List<TextSnapshot> snapshotList = new ArrayList<>();

    public void saveState(Text text) {
        TextSnapshot textSnapshot = new TextSnapshot(text);
        snapshotList.add(textSnapshot);
    }

    public Text undo() {
        if (snapshotList.size() > 1) {
            TextSnapshot textSnapshot = snapshotList.get(snapshotList.size() - 2);
            snapshotList.remove(snapshotList.size() - 1);
            return textSnapshot.restoreFromSnapshot();
        }
        return new Text("",0);
    }

}
