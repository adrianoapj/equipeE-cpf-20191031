package utils;

import enums.CpfStatus;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replaces {
    public String formatCpf(String cpf) {
        CpfUtils cut = new CpfUtils();
        if(cut.verificar(cpf).equals(CpfStatus.DIFFERENT_OF_ELEVEN) ||
                cut.verificar(cpf).equals(CpfStatus.NOT_ONLY_NUMBERS_STRING))
            return "Não foi possível formatar o CPF :(";
        Pattern pattern = Pattern.compile("(\\d{3})(\\d{3})(\\d{3})(\\d{2})");
        Matcher matcher = pattern.matcher(cpf);
        if (matcher.matches()){
            cpf = matcher.replaceAll("$1.$2.$3-$4");
        }
        return cpf;
    }
    public String formatArrayToString(String cpfs){
        cpfs = cpfs.replace(" ","").replace("[","").replace("]","").replace(",","");
        return cpfs;
    }
}
