package org.qa.filegeneratorfactory.filegenerator;

import org.qa.filegeneratorfactory.controller.generator.EAMGenerator;
import org.qa.filegeneratorfactory.controller.parser.EAMParser;
import org.qa.filegeneratorfactory.controller.writer.EAMWriter;
import org.qa.filegeneratorfactory.model.FileGenerator;
import org.qa.filegeneratorfactory.FileGeneratorFactory;
import org.qa.filegeneratorfactory.model.FileParser;
import org.qa.filegeneratorfactory.model.FileWriter;

public class EAMFile implements FileGeneratorFactory {
    /**
     * @return
     */
    @Override
    public FileGenerator generator() {
        return new EAMGenerator();
    }

    /**
     * @return
     */
    @Override
    public FileWriter fileWriter() {
        return new EAMWriter();
    }

    /**
     * @return
     */
    @Override
    public FileParser fileParser() {
        return new EAMParser();
    }
}
