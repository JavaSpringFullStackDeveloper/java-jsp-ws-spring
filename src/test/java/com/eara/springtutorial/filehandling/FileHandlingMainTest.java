package com.eara.springtutorial.filehandling;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import junit.framework.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileHandlingMainTest {

    private final String osSeparator = File.separator;
    private final String FILE_NAME = "src".concat(osSeparator)
    .concat("test").concat(osSeparator)
    .concat("resources").concat(osSeparator)
    .concat("fileToCreate.txt");
    
    @AfterEach
    @BeforeEach
    public void cleanUpFiles() {
        File targetFile = new File(FILE_NAME);
        targetFile.delete();
    }

    @Test
    public void givenUsingNio_whenCreatingFile_thenCorrect() throws IOException {
        Path newFilePath = Paths.get(FILE_NAME);
        Files.createFile(newFilePath);
    }

    @Test
    public void givenFilePath_whenUsingFilesLines_thenFileData() throws URISyntaxException, IOException {
        String expectedData = "";

        Path path = Paths.get(getClass().getClassLoader()
            .getResource("StudyEasy.txt").toURI());
        
        Stream<String> lines = Files.lines(path);
        String data = lines.collect(Collectors.joining("\n"));
        lines.close();
        
        Assert.assertEquals(expectedData, data.trim());
    }
    
}
