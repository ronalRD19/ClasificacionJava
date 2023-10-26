class Animal {
         public String tipoNacimiento = ""; //se recomiendan los valores vacios ya que cada clase asigna los valores. 
         private String tipoSangre = "";
         private String tipoPiel ="";
         private String entorno = "";
         private int numeroPatas = 0;
	 private boolean  esVertebrado = true;

//método accesor para obtener un atributo de una clase //El estandar de Java plantea que se utilice la preposición getNombreAtributo() 

//getters

	public String getTipoNacimiento() {
		return tipoNacimiento;
	}
	public String getTipoSangre() {
		return tipoSangre;
	} 
	public String getTipoPiel() {
		return tipoPiel;
	}
	public String getEntorno() {
		return entorno;
	}
	public int getNumeroPatas() {
		return numeroPatas;
	}
	public boolean getEsVertebrado() {
		return esVertebrado;
	}
// setters 

	public void setTipoNacimiento (String tipoNacimiento) {
		this.tipoNacimiento = tipoNacimiento; 
	}
	public void setTipoSangre (String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}
	public void setTipoPiel (String tipoPiel) {
		this.tipoPiel = tipoPiel;
	}
	public void setEntorno (String entorno) {
		this.entorno = entorno;
	}
	public void setNumeroPatas (int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}
	public void setEsVertebrado (boolean esVertebrado) {
		this.esVertebrado = esVertebrado;
	}
}

