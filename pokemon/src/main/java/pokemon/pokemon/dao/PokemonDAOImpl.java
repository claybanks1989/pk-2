package pokemon.pokemon.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import pokemon.pokemon.dto.Pokemon;

public class PokemonDAOImpl implements PokemonDAO {

	Configuration configuration = new Configuration().configure();
	StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
	SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
	
	public void createPokemon(Pokemon pokemon) {
		// TODO Auto-generated method stub
		
	}

	public Pokemon getPokemon(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updatePokemon(Pokemon pokemon) {
		// TODO Auto-generated method stub
		
	}

	public void deletePokemon(Integer id) {
		// TODO Auto-generated method stub
		
	}

	public List<Pokemon> getPokemonList() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			List<?> pokemonList = session.createQuery("FROM Pokemon").list(); 
	         for (Iterator<?> iterator = 
	                           pokemonList.iterator(); iterator.hasNext();){
	            Pokemon pokemon = (Pokemon) iterator.next(); 
	            System.out.print("ID: " + pokemon.getP_id()); 
	            System.out.print("Name: " +  pokemon.getName()); 
	            System.out.println("Type: " + pokemon.getType()); 
	         }
			
		}catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	    }
		return null;
	}

	public void save(Pokemon pokemon) {
		// TODO Auto-generated method stub
		
	}


}
