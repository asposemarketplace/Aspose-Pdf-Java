/*
 * Copyright 2001-2014 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Pdf. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithasposepdffacades.workingwithimages.extractimagesfromwholepdf.java;

import com.aspose.pdf.*;
import com.aspose.pdf.facades.PdfExtractor;

public class ExtractImagesFromWholePDF
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithasposepdffacades/workingwithimages/extractimagesfromwholepdf/data/";

        //open input PDF
        PdfExtractor pdfExtractor = new PdfExtractor();
        pdfExtractor.bindPdf(dataDir+ "Input.pdf");

        //extract all the images
        pdfExtractor.extractImage();

        int imageCount=1;

        //get all the extracted images
        while (pdfExtractor.hasNextImage())
        {
            pdfExtractor.getNextImage("Image"+imageCount+ ".jpg");
            imageCount++;
        }

    }
}




