
public class Usuario {
String nombre;
String app;
String contraseña;
int pin;
double saldoInicial;
public Usuario() {

}
public Usuario(int pin) {
	super();
	this.pin = pin;
}
public Usuario(String nombre, String app, String contraseña, int pin, double saldoInicial) {
	super();
	this.nombre = nombre;
	this.app = app;
	this.contraseña = contraseña;
	this.pin = pin;
	this.saldoInicial = saldoInicial;
}
@Override
public String toString() {
	return "Usuario [nombre=" + nombre + ", app=" + app + ", contraseña=" + contraseña + ", pin=" + pin
			+ ", saldoInicial=" + saldoInicial + "]";
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApp() {
	return app;
}
public void setApp(String app) {
	this.app = app;
}
public String getContraseña() {
	return contraseña;
}
public void setContraseña(String contraseña) {
	this.contraseña = contraseña;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
public double getSaldoInicial() {
	return saldoInicial;
}
public void setSaldoInicial(double saldoInicial) {
	this.saldoInicial = saldoInicial;
}


}
