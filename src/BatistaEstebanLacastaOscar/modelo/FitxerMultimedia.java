package BatistaEstebanLacastaOscar.modelo;

import java.io.*;
import java.util.Date;

public class FitxerMultimedia extends File {

    private String nom, extension, path, descript;
    private Date date;

    private static final String[] mediaExtensions = {"mp3", "jpg"};

    public FitxerMultimedia(String path) throws IOException {
        super(path);
        if(!this.exists()) throw new IOException("File does not exist");
        String[] filename;
        filename = this.getName().split(".");
        this.path = this.getAbsolutePath();
        this.nom = filename[0];
        this.extension = filename[1];
        if (! this.checkSupportedFormat()) throw new IOException("File format not supported");
        date = new Date(this.lastModified());
    }

    private boolean checkSupportedFormat(){
        boolean supported = false;
        for (int i = 0; i < mediaExtensions.length; i++){
            if( this.extension.equals(mediaExtensions[i])){
                supported = true;
            }
        }
        return supported;
    }
}
