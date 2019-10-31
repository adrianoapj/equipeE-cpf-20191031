package utils;

import enums.CpfStatus;
import enums.Estados;

public class CpfState {
    public String CpfE(String cpf) {
        String estado = cpf;
        CpfUtils utils = new CpfUtils();
        if(utils.verificar(cpf).equals(CpfStatus.VALID)) {
            StringBuilder sb = new StringBuilder();
            for (Estados e : Estados.values()) {
                if (e.getIndex() == cpf.charAt(8)-48){
                    estado = (sb.append(e.getNome()).append(", ")).toString();
                }
            }
            estado = estado.substring(0, estado.length() - 2) + ".";
            sb.delete(0, sb.length());
            return estado;
        }
        return Estados.NA.getNome();
    }
}