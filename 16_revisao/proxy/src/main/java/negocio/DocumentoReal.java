package negocio;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class DocumentoReal implements Documento {
    private String nome;
    private String caminho;
    private int tamanho;
    private String dono;

    

    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getCaminho() {
        return caminho;
    }



    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }



    public int getTamanho() {
        return tamanho;
    }



    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }



    public String getDono() {
        return dono;
    }



    public void setDono(String dono) {
        this.dono = dono;
    }



    @Override
    public void exibir() {
        JFrame janela = new JFrame("Documento");
        janela.setBounds(100, 100, 100, 100);
        JButton botao = new JButton();
        botao.setIcon(new ImageIcon(caminho));
        janela.add(botao);
        janela.setVisible(true);
    }

}
