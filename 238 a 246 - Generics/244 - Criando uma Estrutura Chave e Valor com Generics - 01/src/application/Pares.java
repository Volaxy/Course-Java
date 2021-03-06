package application;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<K extends Number, V> {
	private final Set<Par<K, V>> itens = new LinkedHashSet<>();
	
	public void add(K key, V value) {
		if(key == null) return;
		
		Par<K, V> newPar = new Par<K, V>(key, value);
		
		if(itens.contains(newPar)) {
			itens.remove(newPar);
		}
		
		itens.add(newPar);
	}
	
	public V getValue(K key) {
		if(key == null) return null;
		
		Optional<Par<K, V>> parOpcional = itens.stream().filter(par -> key.equals(par.getKey())).findFirst();
		
		return parOpcional.isPresent() ? parOpcional.get().getValue() : null;
	}
}
