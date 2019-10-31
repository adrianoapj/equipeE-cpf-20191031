package utils;

import enums.CpfStatus;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CpfVerificar {
    public CpfStatus verificar(String cpf) {
        if (cpf.length() != 11) {
            return CpfStatus.DIFFERENT_OF_ELEVEN;
        }
        Pattern pattern = Pattern.compile("(\\d{11})");
        Matcher matcher = pattern.matcher(cpf);
        if (!matcher.matches()){
            return CpfStatus.NOT_ONLY_NUMBERS_STRING;
        }
        Replaces replace = new Replaces();
        CpfDv dv = new CpfDv();
        int[] very = new int[11];
        for (int i = 0; i < 9; i++) {
            very[i] = Integer.parseInt(cpf.split("")[i]);
        }
        very[9] = dv.vr(very);
        very[10] = dv.vr(very);
        String veryright = replace.formatArrayToString(Arrays.toString(very));
        if (!veryright.equals(cpf)) {
            if (veryright.charAt(9) != cpf.charAt(9)) {
                if (veryright.charAt(10) != cpf.charAt(10))
                    return CpfStatus.BOTH_INVALID;
                else
                    return CpfStatus.FIRST_INVALID;
            } else
                return CpfStatus.SECOND_INVALID;
        }
        return CpfStatus.VALID;
    }
}
