package com.github.wickedfable.vegetariansarecrazy;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;


public class vegetariansarecrazy extends JavaPlugin
{

	public void onEnable()
	{
		getLogger().info("[v0.1.3] Plugin is active.");
    
		ShapelessRecipe vegetarian_book = new ShapelessRecipe(new ItemStack(Material.BOOK, 1)).addIngredient(Material.PAPER).addIngredient(Material.PAPER).addIngredient(Material.PAPER).addIngredient(Material.WHEAT);
		getServer().addRecipe(vegetarian_book);
		
		ShapelessRecipe vegetarian_pumpkinpie = new ShapelessRecipe(new ItemStack(Material.PUMPKIN_PIE, 1)).addIngredient(Material.SUGAR).addIngredient(Material.APPLE).addIngredient(Material.PUMPKIN);
		getServer().addRecipe(vegetarian_pumpkinpie);
		
		ShapelessRecipe vegetarian_bookandquill = new ShapelessRecipe(new ItemStack(Material.BOOK_AND_QUILL, 1)).addIngredient(Material.FEATHER).addIngredient(Material.COAL).addIngredient(Material.BOOK);
		getServer().addRecipe(vegetarian_bookandquill);
    
		ShapedRecipe vegetarian_itemframe = new ShapedRecipe(new ItemStack(Material.ITEM_FRAME, 1)).shape(new String[] { "AAA", "ABA", "AAA" }).setIngredient('A', Material.STICK).setIngredient('B', Material.WHEAT);
		getServer().addRecipe(vegetarian_itemframe);
		
		ShapedRecipe vegetarian_cake = new ShapedRecipe(new ItemStack(Material.CAKE, 1)).shape(new String[] { "AAA", "BCB", "DDD" }).setIngredient('A', Material.MILK_BUCKET).setIngredient('B', Material.SUGAR).setIngredient('C', Material.APPLE).setIngredient('D', Material.WHEAT);
		getServer().addRecipe(vegetarian_cake);
		
		ShapedRecipe vegetarian_feather = new ShapedRecipe(new ItemStack(Material.FEATHER, 1)).shape(new String[] { " A ", "A A"}).setIngredient('A', Material.STRING);
		getServer().addRecipe(vegetarian_feather);
	}

  public void onDisable()
  {
		getLogger().info("[v0.1.3] Plugin is disabled.");
  }
}