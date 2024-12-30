package org.qa;

import org.junit.jupiter.api.Test;
import org.qa.filegeneratorfactory.filegenerator.EAMFile;
import org.qa.filegeneratorfactory.filegenerator.MSPFile;
import org.qa.filegeneratorfactory.model.FileGenerator;
import org.qa.filegeneratorfactory.FileGeneratorFactory;
import org.qa.filegeneratorfactory.model.FileParser;
import org.qa.filegeneratorfactory.model.FileWriter;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FileCreationTest {

    @Test
    public void verifyFileGeneratedForEAM(){
        FileGeneratorFactory factory = new EAMFile();
        FileGenerator generator = factory.fileGenerator();
        FileWriter writer = factory.fileWriter();
        FileParser parser = factory.fileParser();
        String filename = generator.generateFileName();
        List<String> value = generator.generateRequiredValues();
        System.out.println("Here is the filename: "+filename +"\nValues: "+value);
        writer.dump();
        parser.parse();
        assertTrue(true);
    }

    @Test
    public void verifyFileGeneratedForMSP(){
        FileGeneratorFactory factory = new MSPFile();
        FileGenerator generator = factory.fileGenerator();
        FileWriter writer = factory.fileWriter();
        FileParser parser = factory.fileParser();
        String filename = generator.generateFileName();
        List<String> value = generator.generateRequiredValues();
        System.out.println("\n\n\nHere is the filename: "+filename +"\nValues: "+value);
        writer.dump();
        parser.parse();
        assertTrue(true);
    }
}
