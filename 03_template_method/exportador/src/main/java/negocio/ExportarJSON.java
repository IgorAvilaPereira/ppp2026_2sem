package negocio;

import com.google.gson.Gson;

public class ExportarJSON extends Exportador {

    @Override
    String transformar() {
        Gson gson = new Gson();
        return gson.toJson(this.vetPessoa);
    }

}
