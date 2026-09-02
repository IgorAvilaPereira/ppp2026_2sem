package apresentacao;

import javax.print.attribute.standard.Media;
import javax.swing.*;

import negocio.Mario;
import negocio.MarioPequeno;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.sound.sampled.*;

public class MainWindow extends JFrame {

  private CustomButton1 button1;
  private CustomButton2 button2;
  private CustomButton3 button3;
  private CustomButton4 button4;
  private CustomButton5 button5;
  private CustomButton6 button7;
  private Mario mario;
  private JButton button_reiniciar;

  public MainWindow() {
    this.mario = new Mario();

    setTitle("MainWindow");
    setSize(1024, 768);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);

    File stream = new File("src/main/resources/mario_bros.wav");
    try (AudioInputStream audioS = AudioSystem.getAudioInputStream(stream)) {
      Clip clip = AudioSystem.getClip();
      clip.open(audioS);
      clip.start();
      // clip.stop();
    } catch (UnsupportedAudioFileException | IOException e1) {
      e1.printStackTrace();
    } catch (LineUnavailableException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }

    button1 = new CustomButton1();
    button1.setBounds(12, 24, 120, 36);
    button1.addActionListener(e -> cliqueFlor());
    this.add(button1);

    button2 = new CustomButton2();
    button2.setBounds(11, 78, 120, 36);
    button2.addActionListener(e -> cliqueDano());
    this.add(button2);

    button3 = new CustomButton3();
    button3.setBounds(8, 145, 120, 36);
    button3.addActionListener(e -> cliqueCogumelo());
    this.add(button3);

    button4 = new CustomButton4();
    button4.setBounds(6, 202, 120, 36);
    button4.addActionListener(e -> cliqueEstrela());
    this.add(button4);

    button5 = new CustomButton5();
    button5.setBounds(8, 255, 120, 36);
    button5.addActionListener(e -> cliquePena());
    this.add(button5);

    button_reiniciar = new JButton("Reinicio");
    button_reiniciar.setBounds(40, 300, 120, 36);
    button_reiniciar.addActionListener(e -> cliqueReinicio());
    this.add(button_reiniciar);

    button7 = new CustomButton6();
    button7.setBounds(232, 56, 500, 500);
    this.add(button7);

    setLocationRelativeTo(null);
  }

  private void cliqueReinicio() {
    mario.setEstadoAtual(new MarioPequeno());
    ImageIcon icon = new ImageIcon("/home/iapereira/git/ppp2026_2sem/06_state/mario_ppp2026_2sem/src/main/resources/"
        + mario.getEstadoAtual().getClass().getSimpleName() + ".png");
    button7.setIcon(icon);
  }

  private void cliqueFlor() {
    mario.flor();
    ImageIcon icon = new ImageIcon("/home/iapereira/git/ppp2026_2sem/06_state/mario_ppp2026_2sem/src/main/resources/"
        + mario.getEstadoAtual().getClass().getSimpleName() + ".png");
    button7.setIcon(icon);
  }

  private void cliqueDano() {
    mario.dano();
    ImageIcon icon = new ImageIcon("/home/iapereira/git/ppp2026_2sem/06_state/mario_ppp2026_2sem/src/main/resources/"
        + mario.getEstadoAtual().getClass().getSimpleName() + ".png");
    button7.setIcon(icon);
  }

  private void cliqueCogumelo() {
    mario.cogumelo();
    ImageIcon icon = new ImageIcon("/home/iapereira/git/ppp2026_2sem/06_state/mario_ppp2026_2sem/src/main/resources/"
        + mario.getEstadoAtual().getClass().getSimpleName() + ".png");
    button7.setIcon(icon);
  }

  private void cliqueEstrela() {
    mario.estrela();
    ImageIcon icon = new ImageIcon("/home/iapereira/git/ppp2026_2sem/06_state/mario_ppp2026_2sem/src/main/resources/"
        + mario.getEstadoAtual().getClass().getSimpleName() + ".png");
    button7.setIcon(icon);
  }

  private void cliquePena() {
    mario.pena();
    ImageIcon icon = new ImageIcon("/home/iapereira/git/ppp2026_2sem/06_state/mario_ppp2026_2sem/src/main/resources/"
        + mario.getEstadoAtual().getClass().getSimpleName() + ".png");
    button7.setIcon(icon);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      MainWindow frame = new MainWindow();
      frame.setVisible(true);
    });
  }
}
