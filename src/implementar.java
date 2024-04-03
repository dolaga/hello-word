import java.util.HashMap;
import java.util.Map;

public class implementar implements Metodos{
	
	Map<String, Usuario> hash= new HashMap<String, Usuario>();
	@Override
	public void guardar(String contraseña, Usuario usuario) {
		// TODO Auto-generated method stub
		hash.put(contraseña, usuario);
	}

	@Override
	public Usuario buscar(String  contraseña) {
		// TODO Auto-generated method stub
		Usuario usuario = hash.get(contraseña);
		return usuario;
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		for(Usuario u: hash.values() ) {
			System.out.println(u.toString());
		}
		
	}
	public void retirarDinero(String contraseña , double cantidad ) {
		if(hash.containsKey(contraseña)) {
			Usuario u= hash.get(contraseña);
			double Saldo= u.getSaldoInicial();
			if(Saldo>= cantidad){
			u.setSaldoInicial(Saldo-cantidad);
			}
			else {
				System.out.println("saldo insufuciente ");
				
			}	
		}
	           
	     
	      
	}
	public void depositar(String contraseña, double cantidad) {
		if(hash.containsKey(contraseña)) {
			Usuario u= hash.get(contraseña);
			double saldo= u.getSaldoInicial();
			u.setSaldoInicial(saldo+cantidad);
		}
	}
	
}
