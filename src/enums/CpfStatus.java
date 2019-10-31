//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package enums;

public enum CpfStatus {
    VALID(true, 0, "CPF válido!"),
    FIRST_INVALID(false, 1, "Primeiro dígito verificador inválido!"),
    SECOND_INVALID(false, 2, "Segundo dígito verificador inválido!"),
    BOTH_INVALID(false, 3, "Todos os dígitos verificadores são inválidos!"),
    NOT_ONLY_NUMBERS_STRING(false, 4, "A String informada não pôde ser convertida para um tipo numérico."),
    DIFFERENT_OF_ELEVEN(false, 5, "Informe um valor com 11 dígitos.");

    int status;
    boolean valid;
    String response;

    public int getStatus() {
        return this.status;
    }

    public boolean getValid() {
        return this.valid;
    }

    public String getResponse() {
        return this.response;
    }

    private CpfStatus(boolean valid, int status, String response) {
        this.valid = valid;
        this.status = status;
        this.response = response;
    }

    private CpfStatus(boolean valid, int status) {
        this.valid = valid;
        this.status = status;
    }
}
