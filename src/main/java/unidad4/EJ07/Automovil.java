package unidad4.EJ07;

import java.util.Objects;

public class Automovil {

	private String modelo;
	private float capacidadDeposito;
	private float litrosDeposito;
	private float consumo;
	private float kilometros;
	private float consumoTotal;
	
	public Automovil(String modelo, float capacidadDeposito, float litrosDeposito, float consumo) {
		this.modelo = modelo;
		this.capacidadDeposito = capacidadDeposito;
		this.litrosDeposito = litrosDeposito;
		this.consumo = consumo;
	}

	public Automovil(String modelo, float capacidadDeposito, float consumo) {
		this.modelo = modelo;
		this.capacidadDeposito = litrosDeposito = capacidadDeposito;
		this.consumo = consumo;
	}
	
	public float llenarDeposito() {
		float restante = capacidadDeposito - litrosDeposito;
		litrosDeposito = capacidadDeposito;
		return restante;
	}
	
	public float llenarDeposito(float litros) {
		litrosDeposito += litros;
		if (litrosDeposito > capacidadDeposito) {
			float sobrante = litrosDeposito - capacidadDeposito;
			litrosDeposito = capacidadDeposito;
			return sobrante;
		}
		return 0;
	}
	
	public float desplazar(float kilometros) {
		float litrosNecesarios = kilometros * consumo;
		if (litrosDeposito < litrosNecesarios)
			return 0;
		litrosDeposito -= litrosNecesarios;
		consumoTotal += litrosNecesarios;
		this.kilometros += kilometros;
		return litrosNecesarios;
	}

	public String getModelo() {
		return modelo;
	}

	public float getCapacidadDeposito() {
		return capacidadDeposito;
	}

	public float getLitrosDeposito() {
		return litrosDeposito;
	}

	public float getConsumo() {
		return consumo;
	}

	public float getKilometros() {
		return kilometros;
	}

	public float getConsumoTotal() {
		return consumoTotal;
	}

	@Override
	public String toString() {
		return "Automovil [modelo=" + modelo + ", capacidadDeposito=" + capacidadDeposito + ", litrosDeposito="
				+ litrosDeposito + ", consumo=" + consumo + ", kilometros=" + kilometros + ", consumoTotal="
				+ consumoTotal + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Float.valueOf(capacidadDeposito), Float.valueOf(consumo), Float.valueOf(consumoTotal),
				Float.valueOf(kilometros), Float.valueOf(litrosDeposito), modelo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Automovil other = (Automovil) obj;
		return Float.floatToIntBits(capacidadDeposito) == Float.floatToIntBits(other.capacidadDeposito)
				&& Float.floatToIntBits(consumo) == Float.floatToIntBits(other.consumo)
				&& Float.floatToIntBits(consumoTotal) == Float.floatToIntBits(other.consumoTotal)
				&& Float.floatToIntBits(kilometros) == Float.floatToIntBits(other.kilometros)
				&& Float.floatToIntBits(litrosDeposito) == Float.floatToIntBits(other.litrosDeposito)
				&& Objects.equals(modelo, other.modelo);
	}
	
}
