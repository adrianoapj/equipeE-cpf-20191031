package utils;

import enums.CpfStatus;

public class CpfUtils {
    public String gerarUnico(String setUF, boolean format) {
        return new CpfGerar().gerarCpfUnico(setUF,format);
    }

    public CpfStatus verificar(String cpf){
        return new CpfVerificar().verificar(cpf);
    }

    public String cpfState (String cpf){
        return new CpfState().CpfE(cpf);
    }
}
