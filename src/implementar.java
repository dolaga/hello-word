import java.util.HashMap;
import java.util.Map;

public class implementar implements Metodos{
	
	Map<String, Usuario> hash= new HashMap<String, Usuario>();
	@Override
	public void guardar(String contraseņa, Usuario usuario) {
		// TODO Auto-generated method stub
		hash.put(contraseņa, usuario);
	}

	@Override
	public Usuario buscar(String  contraseņa) {
		// TODO Auto-generated method stub
		Usuario usuario = hash.get(contraseņa);
		return usuario;
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		for(Usuario u: hash.values() ) {
			System.out.println(u.toString());
		}
		
	}
	public void retirarDinero(String contraseņa , double cantidad ) {
		if(hash.containsKey(contraseņa)) {
			Usuario u= hash.get(contraseņa);
			double Saldo= u.getSaldoInicial();
			if(Saldo>= cantidad){
			u.setSaldoInicial(Saldo-cantidad);
			}
			else {
				System.out.println("saldo insufuciente ");
				
			}	
		}
	           
	     
	      
	}
	public void depositar(String contraseņa, double cantidad) {
		if(hash.containsKey(contraseņa)) {
			Usuario u= hash.get(contraseņa);
			double saldo= u.getSaldoInicial();
			u.setSaldoInicial(saldo+cantidad);
		}
	}
	
}
