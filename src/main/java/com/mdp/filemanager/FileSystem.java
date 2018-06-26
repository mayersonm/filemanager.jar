
package com.mdp.filemanager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileSystem {
    public boolean mv(String sourceFile, String destFile) throws Exception {
        if(cp(sourceFile, destFile)){
            rm(sourceFile);
        }else{
            throw new Exception("Files do not moved.");
        }
        
        return true;
    }

    public boolean cp(String pathNameSource, String pathNameDest) throws Exception {
        Path origenPath = FileSystems.getDefault().getPath(pathNameSource);
        Path destinoPath = FileSystems.getDefault().getPath(pathNameDest);
        Files.copy(origenPath, destinoPath, StandardCopyOption.REPLACE_EXISTING);
        
        return true;
    }

    public boolean rm(String pathName) throws Exception {
        File file = new File(pathName);
        
        if(file.exists()){
            file.delete();
        }else{
            throw new Exception("File not exist.");
        }
        
        return true;
    }
    
    public String[] ls(String path)throws Exception{
        File folder = new File(path);
        String[] listFiles = folder.list();
        return listFiles;
    }
    
}
