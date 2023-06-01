public class Main {
    public static void main(String[] args) {

        Pessoa one = new Pessoa();
        Pessoa two = new Pessoa();

        one.nome = "Ana";
        one.cpf = "242.881.472-61";
        one.rg = 423478;
        one.telefone = "+55 11 9427-0844";
        one.telefonefamiliar = "+55 11 9457-6744";
        one.endereco = "São Paulo Rua XYX";
        one.termoderisco = "Assinado";
        two.nome = "Luka";
        two.cpf = "261.221.982-28";
        two.rg = 0113131;
        two.telefone = "+55 11 9901-8467";
        two.telefonefamiliar = "+55 11 9220-0112";
        two.endereco = "São Paulo Rua XYX";
        two.termoderisco = "Assinado";

        Piloto x = new Piloto();
        x.nome = "";
        x.cpf = "512.712.663-11";
        x.registroanac = 36567;

        Balao five = new Balao();
        five.identifier = 1342;
        five.regularidade = "Regular";
    }
}