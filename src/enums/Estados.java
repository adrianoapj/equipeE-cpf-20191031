package enums;

public enum Estados {
    RS("Rio Grande do Sul",0),
    DF("Distrito Federal",1),
    GO("Goiás",1),
    MT("Mato Grosso",1),
    MS("Mato Grosso do Sul",1),
    TO("Tocantins",1),
    AM("Amazonas",2),
    PA("Pará",2),
    RO("Roraima",2),
    AP("Amapá",2),
    RR("Rondônia",2),
    AC("Acre",2),
    CE("Ceará",3),
    MA("Maranhão",3),
    PI("Piauí",3),
    PB("Paraiba",4),
    PE("Pernabuco",4),
    AL("Alagoas",4),
    RN("Rio Grande do Norte",4),
    BA("Bahia",5),
    SE("Sergipe",5),
    MG("Minas Gerais",6),
    RJ("Rio de Janeiro",7),
    ES("Espírito Santo",7),
    SP("São Paulo",8),
    PR("Paraná",9),
    SC("Santa Catarina",9),
    NA("Não há como obter o estado de um CPF inválido :P",12);
    private String nome;
    private int index;
    Estados(String nome, int index){
        this.nome = nome;
        this.index = index;
    }
    public String getNome() {
        return nome;
    }
    public int getIndex(){
        return index;
    }
}
