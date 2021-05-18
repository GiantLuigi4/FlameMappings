package net.minecraft.registry;
public class BuiltinRegistries {
	//Fields
	public static DefaultedRegistry ENTITIES;
	
	public static DefaultedRegistry BLOCKS;
	
	public static DefaultedRegistry ITEMS;
	
	public static BuiltinRegistries TILE_ENTITIES;
	
	//Methods
	public static Object register(BuiltinRegistries register, String name, Object value) {
		return value;
	}
}
