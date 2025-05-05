import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class BinFileReader {
    private File file;
    private Object object; // Может быть подставлен любой другой класс, записанный в бинарный файл

    public BinFileReader(File _file) {
        setFile(_file);
    }

    public void read() {
        try {
            FileInputStream fis = new FileInputStream(this.file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            this.object = (Object) ois.readObject(); // UpCasting

            ois.close();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

	public File getFile() { return this.file; }
    public Object getObject() { return this.object; }
	
	public void setFile(File _file) {
        if(_file.canRead())
            this.file = _file;
    }

    public void setObject(Object _object) {
        this.object = _object;
    }
}
