package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Text text = new Text("HelloWorld", 5);
        SnapshotManager snapshotManager = new SnapshotManager();
        snapshotManager.saveState(text);
        text.setText("Nie hello World");
        snapshotManager.saveState(text);
        System.out.println(text.getText());
        text = snapshotManager.undo();
        System.out.println(text.getText());
        text = snapshotManager.undo();
        System.out.println(text.getText());

    }
}
