package utils;

import java.util.Arrays;
import java.util.Random;

class CpfGerar {
    private int getEstado(String sigla) {
        String[][] uf = {{"RS", "DF", "GO", "MT", "MS", "TO", "AM", "PA", "RO", "AM", "AC", "RR", "CE", "MA", "PI", "PB", "PE", "AL", "RN", "BA", "SE", "MG", "RJ", "ES", "SP", "PR", "SC"},
                {"0", "1", "1", "1", "1", "1", "2", "2", "2", "2", "2", "2", "3", "3", "3", "4", "4", "4", "4", "5", "5", "6", "7", "7", "8", "9", "9"}};
        int estado;
        if(sigla.equalsIgnoreCase("na")){
            Random r = new Random();
            return Integer.parseInt(uf[1][r.nextInt(uf[0].length)]);
        }else {
            for (int i = 0; i < 26; i++) {
                if (sigla.equalsIgnoreCase(uf[0][i])) {
                    estado = Integer.parseInt(uf[1][i]);
                    return estado;
                }
            }
        }
        return 10;
    }

    //Geração dos 9 primeiros numeros

    private String process(int estado ,boolean format) {

        CpfDv dv = new CpfDv();
        Random random = new Random();

        int[] cpf = {0, 0, 0, 0, 0, 0, 0, 0, estado, 0, 0};
        for (int i = 0; i <= 7; i++) {
            cpf[i] = random.nextInt(9);
        }
        cpf[9] = dv.vr(cpf);
        cpf[10] = dv.vr(cpf);
        String cpfString = Arrays.toString(cpf).replaceAll("[^0-9]", "");
        if(format) {
            Replaces replace = new Replaces();
            return replace.formatCpf(cpfString);
        }else {
            return cpfString;
        }
    }

    //Inicio do gerar
    public String gerarCpfUnico(String setuf , boolean format) {
        String cpfs ;
        int estado = getEstado(setuf);
        if(estado < 10) {
            cpfs = process(estado,format);
            return cpfs;
        }
        return "";
    }
    public String[] gerarCpfMultiplus(int quantidade, String setuf , boolean format) {
        String[] cpfs = new String[quantidade];
        int livre = 0;
        int estado = getEstado(setuf) ;
        if(estado < 10) {
            for (int i = 0; i < cpfs.length; i++) {
                cpfs[livre] = process(estado,format);
                livre++;
            }
            return cpfs;
        }
        return null;
    }
}