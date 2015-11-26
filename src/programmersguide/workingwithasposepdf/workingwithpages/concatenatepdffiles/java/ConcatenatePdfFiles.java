/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Pdf. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithasposepdf.workingwithpages.concatenatepdffiles.java;

import com.aspose.pdf.*;
import com.aspose.pdf.facades.PdfFileEditor;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ConcatenatePdfFiles
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithasposepdf/workingwithpages/concatenatepdffiles/data/";

        // Open the target document
        com.aspose.pdf.Document pdfDocument1 = new com.aspose.pdf.Document(dataDir+ "input1.pdf");

// Open the source document
        com.aspose.pdf.Document pdfDocument2 = new com.aspose.pdf.Document(dataDir+ "input2.pdf");

// Add the pages of the source document to the target document
        pdfDocument1.getPages().add(pdfDocument2.getPages());

// Save the concatenated output file (the target document)
        pdfDocument1.save(dataDir+ "Concatenate_output.pdf");
    }

}




