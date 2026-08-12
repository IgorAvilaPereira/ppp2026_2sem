package apresentacao;

import negocio.Exportador;
import negocio.ExportarJSON;
import negocio.ExportarODS;
import negocio.ExportarPDF;
import negocio.ExportarXML;

public class Main {
    public static void main(String[] args) {
        // ExportarXML objetoXML = new ExportarXML(); 
        // objetoXML.exportar("exportador/src/main/resources/dados.csv");

        // ExportarJSON objetoJSON = new ExportarJSON();
        // objetoJSON.exportar("exportador/src/main/resources/dados.csv");

        // ExportarPDF objetoPDF = new ExportarPDF();
        // objetoPDF.exportar("exportador/src/main/resources/dados.csv");

        ExportarODS objetoODS = new ExportarODS();
        objetoODS.exportar("exportador/src/main/resources/dados.csv");


    }
}