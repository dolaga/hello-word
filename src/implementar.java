import java.util.HashMap;
import java.util.Map;

public class implementar implements Metodos{
	
	Map<String, Usuario> hash= new HashMap<String, Usuario>();
	@Override
	public void guardar(String contrase�a, Usuario usuario) {
		// TODO Auto-generated method stub
		hash.put(contrase�a, usuario);
	}

	@Override
	public Usuario buscar(String  contrase�a) {
		// TODO Auto-generated method stub
		Usuario usuario = hash.get(contrase�a);
		return usuario;
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		for(Usuario u: hash.values() ) {
			System.out.println(u.toString());
		}
		
	}
	public void retirarDinero(String contrase�a , double cantidad ) {
		if(hash.containsKey(contrase�a)) {
			Usuario u= hash.get(contrase�a);
			double Saldo= u.getSaldoInicial();
			if(Saldo>= cantidad){
			u.setSaldoInicial(Saldo-cantidad);
			}
			else {
				System.out.println("saldo insufuciente ");
				
			}	
		}
	           
	     
	      
	}
	public void depositar(String contrase�a, double cantidad) {
		if(hash.containsKey(contrase�a)) {
			Usuario u= hash.get(contrase�a);
			double saldo= u.getSaldoInicial();
			u.setSaldoInicial(saldo+cantidad);
		}
	}
	
}
