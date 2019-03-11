package dto;

import java.util.List;

public class NodeDTO {
	
	private int id;
	private String Nombre;
	private String Apellido;
	private double puntosDeRed;
	private double puntosPersonales; 
	private List<NodeDTO> lineas;
	
	
	public NodeDTO(String nombre, String apellido){
		this.Nombre=nombre;
		this.Apellido=apellido;	
	}

	public void calcularPuntosDeRed(){
		int total=0;
		for (NodeDTO p : this.lineas){
			total+=p.puntosTotales();
		}
		this.puntosDeRed=total;
		return;
	}

	private double puntosTotales() {
	int total=0;
	this.calcularPuntosDeRed();
		return (total+this.puntosPersonales);
	}
	
	
	

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPuntosDeRed() {
		return puntosDeRed;
	}

	public void setPuntosDeRed(double puntosDeRed) {
		this.puntosDeRed = puntosDeRed;
	}

	public double getPuntosPersonales() {
		return puntosPersonales;
	}

	public void setPuntosPersonales(double puntosPersonales) {
		this.puntosPersonales = puntosPersonales;
	}

	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getApellido() {
		return Apellido;
	}


	public void setApellido(String apellido) {
		Apellido = apellido;
	}


	public List<NodeDTO> getLineas() {
		return lineas;
	}


	public void setLineas(List<NodeDTO> lineas) {
		this.lineas = lineas;
	}
	
	
}
