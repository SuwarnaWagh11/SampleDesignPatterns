package org.qa.filegeneratorfactory.controller.writer;

import org.qa.filegeneratorfactory.model.FileWriter;

public class EAMWriter implements FileWriter {
    /**
     *
     */
    @Override
    public void dump() {
        System.out.println("Going to write all the generated value for EAM Legacy file");
    }
}
