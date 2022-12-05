package br.senai.sp.jandira.dao;

import java.util.ArrayList;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO { // Simular nosso banco de dados

    private PlanoDeSaude planoDeSaude;
    private static ArrayList<PlanoDeSaude> planos = new ArrayList<>();
    private final static String ARQUIVO = "C:\\pastas\\planoDeSaude.txt";
    private final static String ARQUIVO_TEMP = "C:\\pastas\\planoDeSaude_TEMP.txt";
    private static final Path PATH = Paths.get(ARQUIVO);
    private static final Path PATH_TEMP = Paths.get(ARQUIVO_TEMP);

    public PlanoDeSaudeDAO(PlanoDeSaude planoDeSaude) {
        this.planos.add(planoDeSaude);
    }

    public PlanoDeSaudeDAO() {

    }

    public static void gravar(PlanoDeSaude planoDeSaude) {
        planos.add(planoDeSaude);

        try {
            // gravar a especialidade no arquivo PlanoDeSaude.txt
            BufferedWriter bw = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            String novoPlanoDeSaude = planoDeSaude.getPlanoDeSaudeSeparadorPorPontoEVirgula();

            bw.write(novoPlanoDeSaude);
            bw.newLine();
            bw.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ARQUIVO, "Houve um erro ao abrir o arquivo. ", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static boolean excluir(Integer codigo) {
        for (PlanoDeSaude p : planos) {
            if (p.getCodigo().equals(codigo)) {
                planos.remove(p);
                break;

            }
        }
        atualizarArquivo();
  
        return false;
    }
     private static void atualizarArquivo(){
             //reconstruir um arquivo atualizado, ou seja
        // sem o plano que foi removido
        
        //passo 01- criar uma representaçao dos arquivos que serao manipulados
        File arquivoAtual = new File(ARQUIVO);
        File arquivoTemp = new File(ARQUIVO_TEMP);
        
        try {
         // criar o arquivo temporario
         arquivoTemp.createNewFile();
         
         //abrir o arquivo temporario para escrita
         BufferedWriter bwTemp = Files.newBufferedWriter(
                 PATH_TEMP,
                 StandardOpenOption.APPEND,
                 StandardOpenOption.WRITE);
         
         for(PlanoDeSaude p : planos){
             bwTemp.write(p.getPlanoDeSaudeSeparadorPorPontoEVirgula());
             bwTemp.newLine();
         }
         // fechar o arquivo temporario
         bwTemp.close();
         
         // excluir o arquivo atual - planoDeSaude.txt
         arquivoAtual.delete();
         
         // renomear o arquivo temporario
         arquivoTemp.renameTo(arquivoAtual);
         
        } catch (IOException ex) {
           JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro ao criar  o arquivo.",
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE);
        
    }
     }
    public static PlanoDeSaude getPlanoDeSaude(Integer codigo) {

        for (PlanoDeSaude p : planos) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }

        return null;
    }

    public static void atualizar(PlanoDeSaude planoDeSaude) {
        for (PlanoDeSaude p : planos) {
            if (p.getCodigo().equals(planoDeSaude.getCodigo())) {
                planos.set(planos.indexOf(p), planoDeSaude);
                break;
            }
        }
        atualizarArquivo();
    }

    public static ArrayList<PlanoDeSaude> listarTodos() {
        return planos;
    }

    public static void getListaPlanoDeSaude() {
        try {
            // abrir o arquivo para leitura - LEITOR
            BufferedReader br = Files.newBufferedReader(PATH);

            String linha = br.readLine();

            while (linha != null && !linha.isEmpty()) {
                String[] linhaVetor = linha.split(";");
                PlanoDeSaude novoPlanoDeSaude = new PlanoDeSaude(
                        Integer.valueOf(linhaVetor[0]),
                        linhaVetor[1],
                        linhaVetor[2]);
                planos.add(novoPlanoDeSaude);
                linha = br.readLine();
            }
            br.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro ao abrir o arquivo.",
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    public static DefaultTableModel getTableModel() {

        //matriz que receberar os planos de saude
        // que serao utilizados na tabela (JTable)
        Object[][] dados = new Object[planos.size()][3];

        //for Each, para extrair cada objeto plano dee saude do
        // arrayList planos e separar cada dado na matriz dados
        int i = 0;
        for (PlanoDeSaude p : planos) {
            dados[i][0] = p.getCodigo();
            dados[i][1] = p.getOperadora();
            dados[i][2] = p.getTipoDoPlano();
            i++;
        }

        //definir um vetor com os nomes das colunas da tabela
        String[] titulos = {"Código", "Nome da Operadora", "Tipo do Plano"};

        //criar um modelo que sera ultilizado pela JTable
        // para exibir os dados dos planos 
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);

        return tableModel;

    }

}
