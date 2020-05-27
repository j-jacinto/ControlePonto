import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarControlePonto {
	public static void main(String[] args) {
		
		Gerente gerente1 = new Gerente();
			gerente1.setLogin(" gerente1");
			gerente1.setNome("Gerente Brizante");
			gerente1.setSenha("estevao");
		
		Secretaria secretaria1 = new Secretaria();
			secretaria1.setRamal("9000");
			secretaria1.setTelefone("3818-2439");
			secretaria1.setNome("Secretária Júlia");
		
		Operador operador1 = new Operador();
			operador1.setValorHora(9.00);
			operador1.setNome("Operador Samuel");
		
		RegistroPonto registro1 = new RegistroPonto();
			registro1.setFunc(gerente1);
			registro1.setDataRegistro(LocalDate.of(2020, 05, 04));
			registro1.setHoraEntrada(LocalDateTime.of(2020, 05, 04, 13, 28, 17));
			registro1.apresentarRegistroPonto();
		
		RegistroPonto registro2 = new RegistroPonto();
			registro2.setFunc(secretaria1);
			registro2.setDataRegistro(LocalDate.of(2020, 05, 04));
			registro2.setHoraEntrada(LocalDateTime.of(2020, 05, 04, 13, 38, 28));
			registro2.apresentarRegistroPonto();
		
		RegistroPonto registro3 = new RegistroPonto();
			registro3.setFunc(operador1);
			registro3.setDataRegistro(LocalDate.of(2020, 05, 04));
			registro3.setHoraEntrada(LocalDateTime.of(2020, 05, 04, 13, 48, 39));
			registro3.apresentarRegistroPonto();
		
		RegistroPonto registro4 = new RegistroPonto();
			registro4.setFunc(gerente1);
			registro4.setDataRegistro(registro1.getDataRegistro());
			registro4.setHoraEntrada(registro1.getHoraEntrada());
			registro4.setHoraSaida(LocalDateTime.of(2020, 05, 23, 14, 00, 04));
			registro4.apresentarRegistroPonto();
		
		RegistroPonto registro5 = new RegistroPonto();
			registro5.setFunc(secretaria1);
			registro5.setDataRegistro(registro2.getDataRegistro());
			registro5.setHoraEntrada(registro2.getHoraEntrada());
			registro5.setHoraSaida(LocalDateTime.of(2020, 05, 23, 14, 01, 07));
			registro5.apresentarRegistroPonto();
		
		RegistroPonto registro6 = new RegistroPonto();
			registro6.setFunc(operador1);
			registro6.setDataRegistro(registro3.getDataRegistro());
			registro6.setHoraEntrada(registro3.getHoraEntrada());
			registro6.setHoraSaida(LocalDateTime.of(2020, 05, 23, 14, 02, 11));
			registro6.apresentarRegistroPonto();
	}
}
