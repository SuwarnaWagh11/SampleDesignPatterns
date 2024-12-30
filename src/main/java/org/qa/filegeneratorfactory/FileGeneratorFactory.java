package org.qa.filegeneratorfactory;

import org.qa.filegeneratorfactory.model.FileGenerator;
import org.qa.filegeneratorfactory.model.FileParser;
import org.qa.filegeneratorfactory.model.FileWriter;

public interface FileGeneratorFactory {

    FileGenerator fileGenerator();
    FileWriter fileWriter();
    FileParser fileParser();

}