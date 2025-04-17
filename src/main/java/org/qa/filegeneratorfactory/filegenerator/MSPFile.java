package org.qa.filegeneratorfactory.filegenerator;

import org.qa.filegeneratorfactory.controller.generator.MSPGenerator;
import org.qa.filegeneratorfactory.controller.parser.MSPParser;
import org.qa.filegeneratorfactory.controller.writer.MSPWriter;
import org.qa.filegeneratorfactory.model.FileGenerator;
import org.qa.filegeneratorfactory.FileGeneratorFactory;
import org.qa.filegeneratorfactory.model.FileParser;
import org.qa.filegeneratorfactory.model.FileWriter;

public class MSPFile implements FileGeneratorFactory {
    /**
     * @return
     */
    @Override
    public FileGenerator generator() {
        return new MSPGenerator();
    }

    /**
     * @return
     */
    @Override
    public FileWriter fileWriter() {
        return new MSPWriter();
    }

    /**
     * @return
     */
    @Override
    public FileParser fileParser() {
        return new MSPParser();
    }
}
