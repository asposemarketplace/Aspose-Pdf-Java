/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Pdf. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithasposepdf.workingwithattachments.addattachmentinpdfdocument.java;

import com.aspose.pdf.*;

public class AddAttachmentInPDFDocument
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithasposepdf/workingwithattachments/addattachmentinpdfdocument/data/";

        //open document
        Document pdfDocument = new Document(dataDir + "input.pdf");

        //setup new file to be added as attachment
        FileSpecification fileSpecification = new FileSpecification(dataDir + "test.txt", "Sample text file");

        //add attachment to document's attachment collection
        pdfDocument.getEmbeddedFiles().add(fileSpecification);

        // Save updated document containing table object
        pdfDocument.save(dataDir + "output.pdf");

        System.out.println("Attachment added successfully!");

    }
}




