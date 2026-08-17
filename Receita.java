public class Receita {

    public Consulta consulta;
    public String data;
    public String descritivo;

    public Receita(Consulta consulta, String data, String descritivo) {
        this.consulta = consulta;
        this.data = data;
        this.descritivo = descritivo;
    }

    public void prescrever() {
        System.out.println("Receita prescrita!");
    }

    public void consultar() {
        System.out.println("Consultando receita...");
        System.out.println("Data: " + data);
        System.out.println("Descrição: " + descritivo);
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }
}