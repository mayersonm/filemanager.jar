
package com.mdp.filemanager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

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
        File fileSource = new File(pathNameSource);
        File fileDest = new File(pathNameDest);

        if (fileSource.exists()) {
            FileOutputStream out;
            FileInputStream in = new FileInputStream(fileSource);
            out = new FileOutputStream(fileDest);
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }

            out.close();
            in.close();
        }else{
            throw new Exception("Source file not exist.");
        }
        
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
