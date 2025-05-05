import java.io.*;

public class BinFileWriter {
    private File file;
    private Object object; // Может быть подставлен любой другой класс, записанный в бинарный файл

    public BinFileWriter(File _file, Object _object) {
        setFile(_file);
        this.object = _object;
    }

    public void write() {
        try {
            FileOutputStream fos = new FileOutputStream(this.file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(this.object);

            oos.close();
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }

    public File getFile() { return this.file; }
    public Object getObject() { return this.object; }

    public void setFile(File _file) {
        if(_file.canWrite())
            this.file = _file;
    }

    public void setObject(Object _object) {
        this.object = _object;
    }
}