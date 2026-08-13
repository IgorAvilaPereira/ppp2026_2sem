package negocio;

import java.io.File;
import java.io.IOException;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import org.jopendocument.dom.OOUtils;
import org.jopendocument.dom.spreadsheet.SpreadSheet;

public class ExportarODS extends Exportador {

    @Override
    String transformar() {
        return "";
    }

    protected void gravar(String output) {
        final Object[][] data = new Object[this.vetPessoa.size()][3];

        for (int i = 0; i < this.vetPessoa.size(); i++) {
            data[i] = new Object[] { this.vetPessoa.get(i).getCpf(), this.vetPessoa.get(i).getNome(),
                    this.vetPessoa.get(i).getEndereco() };
        }

        String[] columns = new String[] { "cpf", "nome", "endereco" };

        TableModel model = new DefaultTableModel(data, columns);

        try {
            final File file = new File("exportador/src/main/resources/output."
                    + this.getClass().getSimpleName().replace("Exportar", "").toLowerCase());

            SpreadSheet.createEmpty(model).saveAs(file);
            // aqui abre o libreoffice ou o software padrao de planilhas - basta descomentar caso ache necessario
            // OOUtils.open(file);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
