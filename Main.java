public class Main {

    public static void main(String[] args) {

        // Objeto da classe Paciente
        Paciente paciente = new Paciente(
            "João Silva",
            "123.456.789-00",
            "(11) 99999-9999",
            "Masculino",
            25
        );

        // Objeto da classe Medico
        Medico medico = new Medico(
            "Dr. Carlos",
            "CRM123456",
            "(11) 98888-8888",
            "Cardiologia",
            "1234"
        );

        // Objeto da classe Recepcionista
        Recepcionista recepcionista = new Recepcionista(
            "Maria",
            "987.654.321-00",
            "(11) 97777-7777",
            "5678"
        );

        // Objeto da classe Agenda
        Agenda agenda = new Agenda(
            "16/08/2026",
            "14:00",
            medico,
            paciente
        );

        // Objeto da classe Consulta
        Consulta consulta = new Consulta(
            "16/08/2026",
            "14:00",
            medico,
            paciente,
            "Dor no peito",
            "Paciente relatou dores recentes."
        );

        // Objeto da classe Receita
        Receita receita = new Receita(
            consulta,
            "16/08/2026",
            "Tomar medicamento conforme orientação médica."
        );

        // Objeto da classe Exame
        Exame exame = new Exame(
            consulta,
            "16/08/2026",
            "Exame de sangue."
        );

        // Testando os métodos

        System.out.println("===== PACIENTE =====");
        paciente.cadastrar();
        paciente.consultar();

        System.out.println();

        System.out.println("===== MÉDICO =====");
        medico.acessar();

        System.out.println();

        System.out.println("===== RECEPCIONISTA =====");
        recepcionista.acessar();

        System.out.println();

        System.out.println("===== AGENDA =====");
        agenda.consultar();

        System.out.println();

        System.out.println("===== CONSULTA =====");
        consulta.marcar();
        consulta.consultar();
        consulta.realizar();

        System.out.println();

        System.out.println("===== RECEITA =====");
        receita.prescrever();
        receita.consultar();

        System.out.println();

        System.out.println("===== EXAME =====");
        exame.solicitar();
        exame.consultar();
    }
}