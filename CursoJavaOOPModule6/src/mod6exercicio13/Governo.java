package mod6exercicio13;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Governo {

	// armazena uma lista de políticos por estado da federação
	private Map<String, List<Politico>> partidosPoliticos;

	public Governo() {
		this.partidosPoliticos = new HashMap<String, List<Politico>>();
	}

	public void adicionarPolitico(String partidoPolitico, Politico politico) {
		// recupera a lista de políticos para um partido
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		
		// se não existir uma lista de políticos para o partido informado,
		// devemos instanciar uma nova lista (pois é a primeira inclusão neste partido)
		if (politicos == null) {
			politicos = new ArrayList<Politico>();
		}
		
		// adiciona o político recebido como parâmetro à lista de políticos
		politicos.add(politico);
		
		// adiciona a lista de políticos ao mapa de partidos usando
		// como chave o nome do partido
		this.partidosPoliticos.put(partidoPolitico, politicos);
	}

	public BigDecimal calcularGastosComSalario(String partidoPolitico) {
		// implementar busca de políticos para o partido informado
		// e cálculo dos salários
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		
		BigDecimal salarioTotal = BigDecimal.ZERO;
		
		if (politicos != null) {
			for (Politico politico : politicos) {
				salarioTotal = salarioTotal.add(politico.getCargo().getSalario());
			}			
		}
		
		return salarioTotal;
	}
	
	public BigDecimal calcularGastosComSalarioParaCargo(Cargo cargo, String partidoPolitico) {
		// implementar busca dos políticos para o partido e cargo informados
		// e cálculo dos salários
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		
		BigDecimal salarioTotalParaCargoInformado = BigDecimal.ZERO;
		
		if (politicos != null) {
			for (Politico politico : politicos) {
				if (cargo.equals(politico.getCargo())) {
					salarioTotalParaCargoInformado = salarioTotalParaCargoInformado.add(
							politico.getCargo().getSalario());
				}
			}			
		}
		
		return salarioTotalParaCargoInformado;
	}

}