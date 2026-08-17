public class Consulta {

    public String data;
    public String hora;
    public Medico medico;
    public Paciente paciente;
    public String motivo;
    public String historico;

    public Consulta(String data, String hora, Medico medico, Paciente paciente,
                    String motivo, String historico) {

        this.data = data;
        this.hora = hora;
        this.medico = medico;
        this.paciente = paciente;
        this.motivo = motivo;
        this.historico = historico;
    }

    public void marcar() {
        System.out.println("Consulta marcada!");
    }

    public void cancelar() {
        System.out.println("Consulta cancelada!");
    }

    public void consultar() {
        System.out.println("Consultando consulta do paciente: " + paciente.getNome());
    }

    public void realizar() {
        System.out.println("Consulta realizada pelo médico: " + medico.getNome());
    }

    public void atualizar() {
        System.out.println("Consulta atualizada!");
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }
}