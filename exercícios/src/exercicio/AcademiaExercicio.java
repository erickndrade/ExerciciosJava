package exercicio;

public class AcademiaExercicio {
	
	String nomeExercicio;
	double ganhoMassa;

	public AcademiaExercicio() {
		// TODO Auto-generated constructor stub
	}
	
	AcademiaExercicio(String nomeExercicio, double ganhoMassa){
		
		this.nomeExercicio = nomeExercicio;
		this.ganhoMassa = ganhoMassa;
		
	}
	
	double novoPeso() {
		
		return ganhoMassa;
	}
	
}
