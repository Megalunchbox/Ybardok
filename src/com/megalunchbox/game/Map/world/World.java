import java.util.ArrayList;
import com.megalunchbox.game.Map.Region.Region;
import java.io.Serializable;
import java.io.ByteArrayStream;
import com.badlogic.gdx.files.FileHandle;
import java.io.ObjectOutputStream;

public class World implements Serializable {
  
  //all loaded regions
  private transient ArrayList<Region> loadedRegions;
  
  //world name
  private String name;
  
  //the uuid so you can have multiple worlds with the same name and no conflicts
  private long uuid;
  
  //how many chunks in region
  private int regionSize = 16;
  
  //how many tiles in chunk
  private int chunkSize = 16;
  
  //the height of the world
  private int worldWidth;
  
  //the width of the world
  private int worldHeight;
  
  private final long serialVersionUUID = 41L;
  
  public void loadRegion(FileHandle fileHandle) {
    
  }
  
  public void unloadRegion(Region region) {
    
  }
  
  public void saveRegion(Region region) {
  }
  
  public void save() throws IOException {
    
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        ObjectOutputStream o = new ObjectOutputStream(b);
        o.writeObject(this);
        
        FileHandle file = Gdx.files.local(this.name + uuid + "\" + "world.prop");
                                          
        try {
            file.writeBytes(o, false);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
  }

}
