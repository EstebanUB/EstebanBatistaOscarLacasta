package BatistaEstebanLacastaOscar.modelo;
import java.io.File;
import java.util.ArrayList;

public class CarpetaFitxers {
    ArrayList<File> files;
    private int capacity;

    private static final int maxCapacity = 100;

    public CarpetaFitxers(){
        files = new ArrayList<>(maxCapacity);
        capacity = maxCapacity;
    }

    public CarpetaFitxers(int capacity){
        this.capacity = capacity;
    }

    public int getSize(){
        return files.size();
    }

    public void addFitxer(File fitxer){
        files.add(fitxer);
    }

    public void removeFitxer(File fitxer){
        files.remove(fitxer);
    }

    public File getAt( int position){
        return files.get(position);
    }

    public void clear(){
        files.clear();
    }

    public boolean isFull(){
        boolean full = !(files.size() < capacity);
        return full;
    }

    public String toString(){
        String str = new String();
        str = "Carpeta Fitxers:" + "\n" + "================";
        for(int i = 0; i < files.size(); i++){
            str += "\n" + "[" + i+1 + "] " + files.get(i).toString();
        }
        return str;
    }
}
