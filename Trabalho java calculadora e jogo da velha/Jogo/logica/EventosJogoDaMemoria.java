package logica;


    class EventosJogoDaMemoria implements ActionListener {
        int Cont_Acertos,Primeiro_Click,Segundo_Click;
        int Numero_Click, posi, cont, pontos_Anterior, Maior_Pontuacao_do_Jogador;
        int Partidas_jogadas = 0, Numero_de_Vitorias = 0;
        boolean Novo_Jogo = true;
        boolean Re_Iniciar = false;
        boolean Fim_de_Jogo = false;                      
        public void actionPerformed(ActionEvent event){                      
            if (event.getSource() == Button_Novo_Jogo){
                Novo_Jogo = true;
                Re_Iniciar = false;
            }
            if (event.getSource() == Button_Re_Iniciar_Jogo){
                Novo_Jogo = true;
                Re_Iniciar = true;
            }
            if (Novo_Jogo == true){
                Cont_Acertos = 0;
                Partidas_jogadas++;
                pontos_Anterior = pontos;
                pontos = 100;
                Numero_Click = 0;
                posi = 0; cont = 16;
                Primeiro_Click = 0;
                Segundo_Click = 0;
                for (int i=0; i<16; ++i){
                    Escolha[i].setText("");
                    Escolha[i].setEnabled(true);
                }
                if (Re_Iniciar == false){
                    for (int i=0; i<16; ++i){
                        Posicao_do_vetor_Aleatorio[i] = i;
                    }
                    for (int i=0; i<8; ++i){
                        for (int j=0; j<2; ++j){
                            posi = RandomNumber.nextInt(cont);
                            Aleatorio[Posicao_do_vetor_Aleatorio[posi]] = i;
                            if (posi < cont){
                                for (int q=(posi+1); q<(cont); ++q){
                                    Posicao_do_vetor_Aleatorio[q-1] = Posicao_do_vetor_Aleatorio[q];
                                }
                            } cont--;
                        }
                    }
                }
                Novo_Jogo = false;
            }
            for (int i=0; i<16; ++i){
                if (event.getSource() == Escolha[i]){             
                    Escolha[i].setText(String.valueOf(Aleatorio[i]));
                    Escolha[i].setEnabled(false);
                    Escolha[i].setVisible(true);
                    Numero_Click++;
                    if (Numero_Click == 1) Primeiro_Click = i;
                        if (Numero_Click == 2){
                            Segundo_Click = i;
                            if (Aleatorio[Primeiro_Click] != Aleatorio[Segundo_Click]){                                                      
                                pontos-=3;
                                JOptionPane.showMessageDialog(JogoDaMemoria.this, "Errado");
                                Escolha[Primeiro_Click].setText("");
                                Escolha[Segundo_Click].setText("");
                                Escolha[Primeiro_Click].setEnabled(true);
                                Escolha[Segundo_Click].setEnabled(true);                            
                            }  else {
                                Cont_Acertos++;
                                pontos+=5;
                        }
                        Numero_Click = 0;
                    }
                }
            }
            if (Cont_Acertos == 8){
                Numero_de_Vitorias++;
                Cont_Acertos = 0;
                if (pontos > pontos_Anterior) Maior_Pontuacao_do_Jogador = pontos;
                    Fim_de_Jogo = true;
            }
            if (pontos < 0) pontos = 0;
            Pontuacao_do_Jogador.setText("Pontos: " + pontos);
            if (Fim_de_Jogo == true){
                Estatisticas_Jogo(Partidas_jogadas, Numero_de_Vitorias, Maior_Pontuacao_do_Jogador);
                Fim_de_Jogo = false;
            }          
        }
    }
