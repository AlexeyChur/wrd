import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;



public class word {

    public static void main(String args[]) throws FileNotFoundException, IOException {

        File docFile = new File("D:\\btr.doc");


        FileInputStream finStream = new FileInputStream(docFile.getAbsolutePath());

        HWPFDocument doc = new HWPFDocument(finStream);

        WordExtractor wordExtract = new WordExtractor(doc);

        String[] dataArray = wordExtract.getParagraphText();



        for (int i = 0; i < dataArray.length; i++) {

                System.out.println(dataArray[i]);


        }

        finStream.close();
    }
}

