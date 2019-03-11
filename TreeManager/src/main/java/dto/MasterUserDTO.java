package dto;

public class MasterUserDTO {
	private final String nombre;
	private String password;
	
	public MasterUserDTO(String nomb,String pass){
		this.nombre=nomb;
		this.password=pass;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}
	

}
