package com.eara.springtutorial.filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileHandlingMain {
    static String separator = File.separator;

    /**
     * File handling with NIO.
     * 
     * createFile(Path filePath, FileAttribute attrs) − Files class provides this method 
     * to create file using specified Path.
     * 
     * copy(InputStream in, Path target, CopyOption� options) − This method is used to copies all 
     * bytes from specified input stream to specified target file and returns number of bytes read 
     * or written as long value.LinkOption for this parameter with the following values −
     * 
     * COPY_ATTRIBUTES − copy attributes to the new file, e.g. last-modified-time attribute.
     * REPLACE_EXISTING − replace an existing file if it exists.
     * NOFOLLOW_LINKS − If a file is a symbolic link, then the link itself, not the target of the link, 
     * is copied.
     * 
     * readAllLines - To read the content of a file. It accepts a Path.
     * readAllBytes - to read the content of a file if we need binary data.
     * 
     * If we want to read a large file with Files class, we can use the BufferedReader.
     * (Files.newBufferedReader(path))
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        final String FILE_NAME = "src".concat(separator)
        .concat("test").concat(separator)
        .concat("resources").concat(separator)
        .concat("StudyEasy.txt");

        Path newFilePath = Paths.get(FILE_NAME);
        Files.createFile(newFilePath);
        
    }
    
}
