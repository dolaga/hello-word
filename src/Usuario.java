
public class Usuario {
String nombre;
String app;
String contrase�a;
int pin;
double saldoInicial;
public Usuario() {

}
public Usuario(int pin) {
	super();
	this.pin = pin;
}
public Usuario(String nombre, String app, String contrase�a, int pin, double saldoInicial) {
	super();
	this.nombre = nombre;
	this.app = app;
	this.contrase�a = contrase�a;
	this.pin = pin;
	this.saldoInicial = saldoInicial;
}
@Override
public String toString() {
	return "Usuario [nombre=" + nombre + ", app=" + app + ", contrase�a=" + contrase�a + ", pin=" + pin
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
public String getContrase�a() {
	return contrase�a;
}
public void setContrase�a(String contrase�a) {
	this.contrase�a = contrase�a;
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
