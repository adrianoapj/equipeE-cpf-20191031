package utils;

class CpfDv {
    int contr = 1;
    protected int vr(int[] cpf) {
        int soma = 0;
        for (int i = 0; i < 11 - 2; i++) {
            soma += (i + contr) * cpf[i];
        }
        if (contr == 1) {
            soma = (soma % 11) % 10;
        } else if (contr == 0) {
            soma = ((soma + (cpf[9] * 9)) % 11) % 10;
        }
        if (contr == 0) {
            contr++;
        } else {
            contr = 0;
        }
        return soma;
    }
}
