import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

class Pergunta {
    String enunciado;
    String[] opcoes;
    int respostaCorreta;

    public Pergunta(String enunciado, String[] opcoes, int respostaCorreta) {
        this.enunciado = enunciado;
        this.opcoes = opcoes;
        this.respostaCorreta = respostaCorreta;
    }
}

class Quiz {
    private List<Pergunta> perguntas;
    private int perguntaAtual;
    private int pontuacao;

    public Quiz() {
        perguntas = new ArrayList<>();
        perguntaAtual = 0;
        pontuacao = 0;
        carregarPerguntas();
    }

    private void carregarPerguntas() {
        perguntas.add(new Pergunta("Qual ação ajuda a combater o aquecimento global?",
                new String[]{"Usar carro todos os dias", "Andar de bicicleta", "Desmatar florestas", "Queimar lixo"}, 1));
        perguntas.add(new Pergunta("Qual destas é uma prática de uso consciente da água?",
                new String[]{"Lavar calçada com mangueira", "Deixar torneira aberta", "Fechar a torneira ao escovar os dentes", "Usar água potável para regar o jardim"}, 2));
        perguntas.add(new Pergunta("Qual é uma fonte de energia renovável?",
                new String[]{"Carvão mineral", "Gás natural", "Petróleo", "Solar"}, 3));
        perguntas.add(new Pergunta("Qual atitude ajuda na redução de resíduos?",
                new String[]{"Usar sacolas plásticas", "Comprar descartáveis", "Reutilizar embalagens", "Jogar lixo na rua"}, 2));
        perguntas.add(new Pergunta("O que é coleta seletiva?",
                new String[]{"Juntar tudo no mesmo lixo", "Separar os resíduos para reciclagem", "Queimar o lixo", "Jogar no mar"}, 1));
    }

    public Pergunta getPerguntaAtual() {
        return perguntas.get(perguntaAtual);
    }

    public void verificarResposta(int respostaUsuario) {
        if (respostaUsuario == getPerguntaAtual().respostaCorreta) {
            pontuacao++;
        }
        perguntaAtual++;
    }

    public boolean temMaisPerguntas() {
        return perguntaAtual < perguntas.size();
    }

    public int getPontuacaoFinal() {
        return pontuacao;
    }

    public int getTotalPerguntas() {
        return perguntas.size();
    }

    public int getPerguntaAtualIndex() {
        return perguntaAtual;
    }
}

public class QuizApp extends JFrame implements ActionListener {
    private Quiz quiz;
    private JLabel perguntaLabel;
    private JRadioButton[] opcoesButtons;
    private ButtonGroup grupoBotoes;
    private JButton botaoResponder;
    private JProgressBar barraProgresso;
    private JLabel timerLabel;
    private JPanel painel;
    private Timer timer;
    private int segundosRestantes = 15;

    public QuizApp() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        quiz = new Quiz();
        setTitle("Quiz Educação Ambiental");
        setSize(650, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        perguntaLabel = new JLabel("Pergunta");
        perguntaLabel.setFont(new Font("SansSerif", Font.BOLD, 18));

        opcoesButtons = new JRadioButton[4];
        grupoBotoes = new ButtonGroup();
        botaoResponder = new JButton("Responder");
        botaoResponder.addActionListener(this);

        barraProgresso = new JProgressBar(0, quiz.getTotalPerguntas());
        barraProgresso.setStringPainted(true);

        timerLabel = new JLabel("Tempo: 15s");
        timerLabel.setFont(new Font("SansSerif", Font.BOLD, 14));
        timerLabel.setForeground(Color.RED);

        painel = new JPanel(new GridLayout(8, 1));
        painel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        painel.add(barraProgresso);
        painel.add(timerLabel);
        painel.add(perguntaLabel);

        for (int i = 0; i < 4; i++) {
            opcoesButtons[i] = new JRadioButton();
            grupoBotoes.add(opcoesButtons[i]);
            painel.add(opcoesButtons[i]);
        }

        painel.add(botaoResponder);
        add(painel);

        mostrarProximaPergunta();
    }

    private void iniciarTemporizador() {
        if (timer != null) timer.cancel();
        segundosRestantes = 30;
        timerLabel.setText("Tempo: 30s");

        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                segundosRestantes--;
                SwingUtilities.invokeLater(() -> timerLabel.setText("Tempo: " + segundosRestantes + "s"));
                if (segundosRestantes <= 0) {
                    timer.cancel();
                    SwingUtilities.invokeLater(() -> tratarResposta(-1));
                }
            }
        }, 1000, 1000);
    }

    private void mostrarProximaPergunta() {
        barraProgresso.setValue(quiz.getPerguntaAtualIndex());

        if (quiz.temMaisPerguntas()) {
            Pergunta p = quiz.getPerguntaAtual();
            perguntaLabel.setText(p.enunciado);
            for (int i = 0; i < 4; i++) {
                opcoesButtons[i].setText(p.opcoes[i]);
                opcoesButtons[i].setSelected(false);
            }
            painel.setBackground(null); // limpa cor anterior
            iniciarTemporizador();
        } else {
            int resposta = JOptionPane.showConfirmDialog(this,
                    "Quiz finalizado! Pontuação: " + quiz.getPontuacaoFinal() + " de " + quiz.getTotalPerguntas() +
                            "\nDeseja jogar novamente?",
                    "Resultado", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                quiz = new Quiz();
                mostrarProximaPergunta();
            } else {
                System.exit(0);
            }
        }
    }

    private void tratarResposta(int respostaSelecionada) {
        if (timer != null) timer.cancel();

        Pergunta pergunta = quiz.getPerguntaAtual();

        if (respostaSelecionada == pergunta.respostaCorreta) {
            painel.setBackground(new Color(144, 238, 144)); // verde claro
        } else {
            painel.setBackground(new Color(255, 182, 193)); // vermelho claro
            JOptionPane.showMessageDialog(this, "Errado! Resposta correta: " + pergunta.opcoes[pergunta.respostaCorreta]);
        }

        quiz.verificarResposta(respostaSelecionada);

        Timer delayTimer = new Timer();
        delayTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                SwingUtilities.invokeLater(() -> mostrarProximaPergunta());
            }
        }, 1000);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int respostaSelecionada = -1;
        for (int i = 0; i < 4; i++) {
            if (opcoesButtons[i].isSelected()) {
                respostaSelecionada = i;
                break;
            }
        }

        if (respostaSelecionada != -1) {
            tratarResposta(respostaSelecionada);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma opção.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new QuizApp().setVisible(true));
    }
}
// Fim do código