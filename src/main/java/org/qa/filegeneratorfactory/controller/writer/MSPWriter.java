package org.qa.filegeneratorfactory.controller.writer;

import org.qa.filegeneratorfactory.model.FileWriter;

public class MSPWriter implements FileWriter {
    /**
     *
     */
    @Override
    public void dump() {
        System.out.println("Going to write all the values from generated MSP file..");
    }
}
