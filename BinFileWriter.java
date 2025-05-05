import java.io.*;

public class BinFileWriter<T> {
    private File file;
    private T object; // Может быть подставлен любой другой класс, записанный в бинарный файл

    public BinFileWriter(File _file, T _object) {
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
    public T getObject() { return this.object; }

    public void setFile(File _file) {
        if(_file.canWrite())
            this.file = _file;
    }

    public void setObject(T _object) {
        this.object = _object;
    }
}
