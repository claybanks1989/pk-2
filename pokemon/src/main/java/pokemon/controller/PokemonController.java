package pokemon.controller;

import java.util.Map;

import javax.transaction.SystemException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import pokemon.pokemon.dto.Pokemon;
//@RequestMapping(value="/pokemon")

@Controller
@RequestMapping("/*")
public class PokemonController {

	Configuration configuration = new Configuration().configure();
	StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
	SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());

/*	@RequestMapping(value="/add{pId}")
	public String findDepatment(
			@PathVariable String pId,
			@PathVariable String pName,
			@PathVariable String pType
			
			){

	  System.out.println("Find department with ID: " + pId + pName + pType);
	  return "someResult";

 */
	
	 @RequestMapping(value = "/add",  method=RequestMethod.POST)
	public String addPokemon(
			@RequestParam Map<String,String> requestParams,
			@ModelAttribute Pokemon pokemon, Model model) {
		model.addAttribute("Pokemon", pokemon);
		System.out.println("In add method");
		
		int pId = Integer.parseInt(requestParams.get("pId"));
		String name = requestParams.get("pName");
		String type = requestParams.get("pType");
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		try {
			
			//model.addAttribute(arg0, arg1)
			pokemon.setP_id(pId);
			pokemon.setName(name);
			pokemon.setType(type);
			session.save(pokemon);
			session.getTransaction().commit();
			System.out.println("Saved " + pokemon.getName() + " successfully");
		}
		catch(Exception e){
			System.out.println("Error: " + e);
		}
		finally{
			session.flush();
		}
		System.out.println("Adding a pokemon");
		
		return "Pokemon"; 
	}
/*	@RequestMapping(value = "/search",  method=RequestMethod.GET)
	public String getPokemon(@RequestParam("pokemon_name") String pokemonName){
	
		System.out.println("Pokemon found: " + pokemonName);
		return pokemonName;
	}
	 */
	/*@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public Pokemon deletePokemon(){
		 System.out.println("Deleting a pokemon");
		return pokemon;
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.NO_CONTENT) //Pokemon getShopInJSON(@PathVariable String name) {
	public void setPokemon(@RequestBody Pokemon pokemon){
		this.pokemon = pokemon;
	}*/
	/*@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printHello(ModelMap model) {
	    model.addAttribute("message", "Hello Spring MVC Framework!");
	    return "hello";
	}*/
	
}