package pokemon.app;

import java.util.Date;

import javax.transaction.SystemException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import pokemon.pokemon.dto.Pokemon;
import pokemon.trainer.dto.Trainer;
import pokemon.user.dto.User;

public class Main {

	public static void main(String[] args) throws SystemException{
		System.out.println("Starting Pokemon App...");
		Pokemon pokemon = new Pokemon();
		pokemon.setP_id(10);
		pokemon.setName("Caterpie");
		pokemon.setType("Bug");
		pokemon.setDateAdded(new Date());
		
		
		//String x = pokemon.getName();
		/*Trainer trainer = new Trainer();
		trainer.setT_id(8);
		trainer.setName("Bug Catcher");
		trainer.setHometown("Viridian Forest");
		*/
		// Creating the Config and session 
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		try {
			session.save(pokemon);
			session.getTransaction().commit();
			System.out.println("Saved " + pokemon.getName() + " successfully");
		}
		finally{
			
		}
		pokemon = null;
		

		session = sessionFactory.openSession();
		session.beginTransaction();
		pokemon = (Pokemon) session.get(Pokemon.class, 25);
	/*	User user = new User();
		user.setName("Clay");
		user.setSearchQuery("Pokemon Searched For: " + pokemon.getName());
		session.save(user);*/
		System.out.println("Your Pokemon is: " + pokemon.getName());
		session.getTransaction().commit();
		
	}
}
