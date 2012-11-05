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
		getLogger().info("[Vegetarians Are Crazy][v0.1a] Plugin is active.");
    
		ShapelessRecipe vegetarian_book = new ShapelessRecipe(new ItemStack(Material.BOOK, 1)).addIngredient(Material.PAPER).addIngredient(Material.PAPER).addIngredient(Material.PAPER).addIngredient(Material.WHEAT);
		getServer().addRecipe(vegetarian_book);
    
		ShapedRecipe vegetarian_itemframe = new ShapedRecipe(new ItemStack(Material.ITEM_FRAME)).shape(new String[] { "AAA", "ABA", "AAA" }).setIngredient('A', Material.STICK).setIngredient('B', Material.WHEAT);
		getServer().addRecipe(vegetarian_itemframe);
	}

  public void onDisable()
  {
		getLogger().info("[Vegetarians Are Crazy][v0.1a] Plugin is disabled.");
  }
}