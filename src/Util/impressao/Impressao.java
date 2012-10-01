package Util.impressao;

import Entidade.Itens;
import Entidade.Orcamento;
import Entidade.Servico;
import Util.Config;
import java.awt.*;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.util.zip.DataFormatException;

public class Impressao {

    private Frame f;

    public void imprimir(Servico servico) {
        f = new Frame("Impressão");
        f.pack();
        // obtenção do Toolkit
        Toolkit tk = f.getToolkit();
        // inicio de sessão de impressão
        PrintJob pj = tk.getPrintJob(f, "print1", null);

        // impressão
        if (pj != null) { // testa de PrintJob válido        
            Graphics g = pj.getGraphics();

            g.drawString("@SUPORTSERV@", 25, 40);

            g.drawString("@SUPORTSERV@", 310, 40);

            g.setFont(new Font("Arial", -1, 8));

            g.drawString("CLIENTE: " + Config.getCliente().getNome(), 25, 100);
            g.drawString("MÁQUINA: " + Config.getMaquina().getModelo() + " / " + Config.getMaquina().getFabricante(), 25, 115);
            g.drawString("DATA: " + DateFormat.getDateInstance(DateFormat.SHORT).format(servico.getData_servico().getTime()), 155, 130);
            g.drawString("CÓDIGO: " + servico.getId(), 25, 130);
            g.drawString("RESPONSÁVEL: " + servico.getResponsavel(), 25, 145);
            g.drawString("DESCRIÇÃO DO PROBLEMA:", 25, 170);
            g.drawString(servico.getDes(), 25, 185);
            g.drawString("OBS.:", 25, 240);
            g.drawString(servico.getObs(), 25, 255);
            g.drawString("Assinatura", 130, 350);
            g.drawString("Assinatura", 413, 350);
            g.drawLine(25, 80, 570, 80);//linha media
            g.drawLine(25, 400, 570, 400);//linha de baixo            
            g.drawLine(250, 340, 50, 340);//linha de assinatura
            g.drawLine(535, 340, 335, 340);//linha de assinatura
            g.drawLine(25, 27, 570, 27);//linha cabeçalho

            g.drawString("CLIENTE: " + Config.getCliente().getNome(), 310, 100);
            g.drawString("MÁQUINA: " + Config.getMaquina().getModelo() + " / " + Config.getMaquina().getFabricante(), 310, 115);
            g.drawString("CÓDIGO: " + servico.getId(), 310, 130);
            g.drawString("DATA: " + DateFormat.getDateInstance(DateFormat.SHORT).format(servico.getData_servico().getTime()), 455, 130);
            g.drawString("DESCRIÇÃO DO PROBLEMA:", 310, 170);
            g.drawString(servico.getDes(), 310, 185);
            g.drawString("OBS.:", 310, 240);
            g.drawString(servico.getObs(), 310, 255);

            g.setFont(new Font("Arial", -1, 7));
            g.drawString("Av. Ruy Barbosa, 144-Centro-Guarabira-Paraiba", 25, 52);
            g.drawString("Fone:(83)3271-4827 / 99662415 / 88965001", 25, 62);
            g.drawString("E-Mail: suportserv@ig.com.br", 25, 72);

            g.drawString("Av. Ruy Barbosa, 144-Centro-Guarabira-Paraiba", 310, 52);
            g.drawString("Fone:(83)3271-4827 / 99662415 / 88965001", 310, 62);
            g.drawString("E-Mail: suportserv@ig.com.br", 310, 72);

            g.drawString("Caso o contratante deste serviço não buscar o produto deferido acima em no", 310, 370);
            g.drawString("prazo de no máximo 90 (Noventa) dias, o produto passara", 310, 380);
            g.drawString("a ser do contratado, de acordo com O CÓDIGO 629 do inciso 3º.", 310, 390);

            g.drawString("Caso o contratante deste serviço não buscar o produto deferido acima em no", 25, 370);
            g.drawString("prazo de no máximo 90 (Noventa) dias, o produto passara", 25, 380);
            g.drawString("a ser do contratado, de acordo com O CÓDIGO 629 do inciso 3º.", 25, 390);

            g.dispose();// libera recursos do contexto gráfico            
            //g2.dispose();
            pj.end(); // encerra impressão
        }
        f.dispose();

    }

    public void imprimirOrcamento(Orcamento orcamento) {
        f = new Frame("Impressão");
        f.pack();
        // obtenção do Toolkit
        Toolkit tk = f.getToolkit();
        // inicio de sessão de impressão
        PrintJob pj = tk.getPrintJob(f, "print1", null);

        // impressão
        if (pj != null) { // testa de PrintJob válido        
            Graphics g = pj.getGraphics();

            g.drawString("@SUPORTSERV@", 248, 40);



            g.setFont(new Font("Arial", -1, 11));
            g.drawString("Código: " + orcamento.getId(), 442, 101);
            g.drawString("Dados do Cliente: ", 45, 117);
            g.drawString("Nome: " + orcamento.getCliente().getNome(), 45, 135);
            g.drawString("Logradouro: " + orcamento.getCliente().getEndereco().getLogradouro(), 45, 152);
            g.drawString("Nº " + orcamento.getCliente().getEndereco().getNumero(), 442, 154);
            g.drawString("Bairro: " + orcamento.getCliente().getEndereco().getBairro(), 45, 168);
            g.drawString("Cidade: " + orcamento.getCliente().getEndereco().getCidade(), 45, 182);
            g.drawString("CEP: " + orcamento.getCliente().getEndereco().getCep(), 320, 182);
            g.drawString("Tel/Fax: " + orcamento.getCliente().getTel_fixo(), 45, 196);
            g.drawString("Cel: " + orcamento.getCliente().getCel1(), 320, 196);
            g.drawString("RG: " + orcamento.getCliente().getRg(), 45, 210);
            g.drawString("CPF: " + orcamento.getCliente().getCpf_cnpj(), 190, 210);
            g.drawString("GCG/CNPJ: ", 320, 210);
            g.drawLine(25, 216, 570, 216);//linha do cliente abaixo
            g.drawLine(25, 121, 570, 121);//linha do cliente acima
            g.drawLine(25, 230, 570, 230);//linha descrição acima
            g.drawLine(25, 248, 570, 248);//linha descrição intermediaria           
            g.drawLine(25, 105, 570, 105);//linha abaixo do código
            g.drawString("Descrição", 45, 243);
            g.drawString("Quant.", 340, 243);
            g.drawString("V. Unit.", 390, 243);
            g.drawString("V. Total", 440, 243);            

            int cont = 263;
            float total = 0;

            for (Itens i : orcamento.getItens()) {
                if (cont < 820) {
                    
                    g.drawString(" " + i.getNome(), 20, cont);
                    g.drawString(" " + i.getQuant(), 276, cont);
                    g.drawString(" " + i.getValor(), 336, cont);
                    g.drawString(" " + (i.getQuant() * i.getValor()), 415, cont);

                    total += (i.getQuant() * i.getValor());
                    cont += 20;
                } else {
                    cont = 140;
                    g = pj.getGraphics();
                }
            }
            cont += 40;
            g.drawLine(25, cont, 570, cont);//linha final discriçaõ
            g.drawLine(25, (cont + 18), 570, (cont + 18));//linha valor total
            g.drawString("R$:", 430, (cont + 13));
            g.drawString("Valor Total: "+total, 45, (cont + 13));
            g.drawString("Forma de Pagamento: "+orcamento.getForma_pag(), 45, (cont + 36));
            g.drawString("Garantia: "+orcamento.getGarantia(), 45, (cont + 53));
            g.drawString("Data: "+DateFormat.getDateInstance().format(orcamento.getDia_orcamento().getTime()), 45, (cont + 70));
            g.drawString("Observações: ", 45, (cont + 87));
            g.drawString(orcamento.getObs(), 30, (cont + 107));
            g.drawLine(250, (cont + 287), 50, (cont + 287));//linha de assinatura do reponsavel
            g.drawLine(535, (cont + 287), 335, (cont + 287));//linha de assinatura do cliente
            g.drawString("Responsável", 90, (cont + 299));
            g.drawString("Cliente", 413, (cont + 299));


            g.setFont(new Font("Arial", -1, 7));
            g.drawString("Av. Ruy Barbosa, 144-Centro-Guarabira-Paraiba", 227, 52);
            g.drawString("Fone:(83)3271-4827 / 99662415 / 88965001", 237, 62);
            g.drawString("E-Mail: suportserv@ig.com.br", 253, 72);

            g.dispose();// libera recursos do contexto gráfico            
            //g2.dispose();
            pj.end(); // encerra impressão
        }
        f.dispose();
    }

    private Image retonaImagem() {
        Image image = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Fagner\\logo.PNG");
        MediaTracker mt = new MediaTracker(f);
        mt.addImage(image, 0);
        try {
            mt.waitForID(0);
        } catch (InterruptedException e) {
        }
        return image;
    }
}
