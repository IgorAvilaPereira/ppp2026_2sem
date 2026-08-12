package negocio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class ExportarPDF extends Exportador {

    @Override
    String transformar() {
        return "";
    }

    protected void gancho(){
        JOptionPane.showMessageDialog(null, "Gerando pdf");
    }

    protected void gravar(String output) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("exportador/src/main/resources/output."
                    + this.getClass().getSimpleName().replace("Exportar", "").toLowerCase()));
            document.open();
            for (Pessoa pessoa : this.vetPessoa) {
                document.add(new Paragraph("Nome:"+pessoa.getNome()));
            }
            document.close();
        } catch (FileNotFoundException | DocumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
