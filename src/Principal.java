import enums.CpfStatus;
import enums.Estados;
import utils.CpfState;
import utils.CpfUtils;
import utils.Replaces;

import java.util.Scanner;

public class Principal {

    Principal() {
        Scanner ler = new Scanner(System.in);
        CpfUtils cut = new CpfUtils();
        String uCpf = ler.next();
        CpfStatus estado = cut.verificar(uCpf);
        System.out.println(estado.getResponse());
        System.out.println(new Replaces().formatCpf(uCpf));
        System.out.println(cut.cpfState(uCpf));
        String cpf = cut.gerarUnico("NA", true);
        String nCpf = cut.gerarUnico("NA", false);
        System.out.println(cpf);
        System.out.println(nCpf);
    }

    public static void main(String[] args) {
        new Principal();
    }
}
