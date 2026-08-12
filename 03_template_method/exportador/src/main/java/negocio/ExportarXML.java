package negocio;

public class ExportarXML extends Exportador {

    @Override
    String transformar() {
        String output = "<pessoas>";
        for (Pessoa pessoa : this.vetPessoa) {
                output += "<pessoa>";
                output += "<cpf>"+pessoa.getCpf()+"</cpf>";
                output += "<nome>"+pessoa.getNome()+"</nome>";
                output += "<endereco>"+pessoa.getEndereco()+"</endereco>";
                output += "</pessoa>";
        }
        return output+"</pessoas>";


    }

}
