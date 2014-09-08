package pokemon.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import pokemon.pokemon.dto.Pokemon;
//@RequestMapping(value="/pokemon")

@Controller
@RequestMapping("/*")
public class PokemonController {

	private Pokemon pokemon;
	
	//@ResponseBody //Pokemon getShopInJSON(@PathVariable String name) {
	@RequestMapping(value = "/add", method=RequestMethod.POST)
	public Pokemon addPokemon(){
		System.out.println("Adding a pokemon");
		return pokemon;
	}
	@RequestMapping(value = "/search")
	public Pokemon getPokemon(){
		System.out.println("Searching for pokemon");
		return pokemon;
	}
	
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