package br.com.marmita.model.enums;

public enum NivelAcesso {

	USUARIO(1),
	VENDEDOR(2),
	ADMINISTRADOR(3);
	
	private int cod;
	
	private NivelAcesso(int cod) {
		this.cod = cod;
	}
	
	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public static NivelAcesso toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		
		for (NivelAcesso x : NivelAcesso.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}
