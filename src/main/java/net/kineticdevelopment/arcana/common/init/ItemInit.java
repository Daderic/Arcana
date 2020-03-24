package net.kineticdevelopment.arcana.common.init;

import net.kineticdevelopment.arcana.common.items.ItemAttachment;
import net.kineticdevelopment.arcana.common.items.attachment.Cap;
import net.kineticdevelopment.arcana.common.items.attachment.Focus;
import net.kineticdevelopment.arcana.common.objects.items.ItemBase;
import net.kineticdevelopment.arcana.common.objects.items.ItemFocus;
import net.kineticdevelopment.arcana.common.objects.items.ItemWand;
import net.kineticdevelopment.arcana.common.objects.items.ResearchBookItem;
import net.kineticdevelopment.arcana.common.objects.items.armor.GoggleBase;
import net.kineticdevelopment.arcana.common.objects.items.tools.*;
import net.kineticdevelopment.arcana.core.Main;
import net.kineticdevelopment.arcana.utilities.GogglePriority;
import net.minecraft.client.particle.ParticleDrip;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;

import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Initialize Items here
 * @author Merijn, Tea, Wilkon
 * @see BlockStateInit
 * @see EntityInit
 * @see BlockInit
 */
public class ItemInit {

	public static final List<Item> ITEMS = new ArrayList<Item>();

	// Materials - Values
	public static Item.ToolMaterial MATERIAL_ARCANIUM = EnumHelper.addToolMaterial("material_arcanium",4,1987,9.0F,4.0F, 20);
	public static Item.ToolMaterial MATERIAL_VOID_METAL = EnumHelper.addToolMaterial("material_void_metal",5,250, 10.0F, 4.5F,8);
	public static ItemArmor.ArmorMaterial MATERIAL_GOGGLES_REVEALING = EnumHelper.addArmorMaterial("material_goggles", Main.MODID + ":goggles_of_revealing", 50, new int[] {0, 0, 0, 2}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);

	//Weapons
	public static Item ARCANIUM_AXE = new net.kineticdevelopment.arcana.common.objects.items.tools.AxeBase("arcanium_axe", MATERIAL_ARCANIUM).setCreativeTab(Main.TAB_ARCANA);
	public static Item ARCANIUM_SWORD = new net.kineticdevelopment.arcana.common.objects.items.tools.SwordBase("arcanium_sword", MATERIAL_ARCANIUM).setCreativeTab(Main.TAB_ARCANA);
	public static Item VOID_METAL_AXE = new net.kineticdevelopment.arcana.common.objects.items.tools.AxeBase("void_metal_axe", MATERIAL_VOID_METAL).setCreativeTab(Main.TAB_ARCANA);
	public static Item VOID_METAL_SWORD = new net.kineticdevelopment.arcana.common.objects.items.tools.SwordBase("void_metal_sword", MATERIAL_VOID_METAL).setCreativeTab(Main.TAB_ARCANA);

	//Tools
	public static Item ARCANIUM_HOE = new net.kineticdevelopment.arcana.common.objects.items.tools.HoeBase("arcanium_hoe", MATERIAL_ARCANIUM).setCreativeTab(Main.TAB_ARCANA);
	public static Item ARCANIUM_PICKAXE = new net.kineticdevelopment.arcana.common.objects.items.tools.PickaxeBase("arcanium_pickaxe", MATERIAL_ARCANIUM).setCreativeTab(Main.TAB_ARCANA);
	public static Item ARCANIUM_SHOVEL = new net.kineticdevelopment.arcana.common.objects.items.tools.ShovelBase("arcanium_shovel", MATERIAL_ARCANIUM).setCreativeTab(Main.TAB_ARCANA);
	public static Item VOID_METAL_HOE = new net.kineticdevelopment.arcana.common.objects.items.tools.HoeBase("void_metal_hoe", MATERIAL_VOID_METAL).setCreativeTab(Main.TAB_ARCANA);
	public static Item VOID_METAL_PICKAXE = new net.kineticdevelopment.arcana.common.objects.items.tools.PickaxeBase("void_metal_pickaxe", MATERIAL_VOID_METAL).setCreativeTab(Main.TAB_ARCANA);
	public static Item VOID_METAL_SHOVEL = new net.kineticdevelopment.arcana.common.objects.items.tools.ShovelBase("void_metal_shovel", MATERIAL_VOID_METAL).setCreativeTab(Main.TAB_ARCANA);

	//Items With Function

	public static Item RESEARCH_NOTE_COMPLETE = new ItemBase("research_note_complete").setCreativeTab(Main.TAB_ARCANA);
	public static Item RESEARCH_NOTE = new ItemBase("research_note").setCreativeTab(Main.TAB_ARCANA);

	public static Item ARCANUM = new ResearchBookItem("arcanum", new ResourceLocation(Main.MODID, "arcanum")).setCreativeTab(Main.TAB_ARCANA);
	public static Item GRIMOIRE = new ResearchBookItem("illustrious_grimoire", new ResourceLocation(Main.MODID, "illustrious_grimoire")).setCreativeTab(Main.TAB_ARCANA);
	public static Item CODEX = new ResearchBookItem("tainted_codex", new ResourceLocation(Main.MODID, "tainted_codex")).setCreativeTab(Main.TAB_ARCANA);
	public static Item RITES = new ResearchBookItem("crimson_rites", new ResourceLocation(Main.MODID, "crimson_rites")).setCreativeTab(Main.TAB_ARCANA);

	//Food - Will add food class soon --Tea :D
	public static Item CAT_MEAT_COOKED = new ItemBase("cooked_cat_meat").setCreativeTab(Main.TAB_ARCANA);
	public static Item CAT_MEAT_UNCOOKED = new ItemBase("cat_meat").setCreativeTab(Main.TAB_ARCANA);
	public static Item DOG_MEAT_COOKED = new ItemBase("cooked_dog_meat").setCreativeTab(Main.TAB_ARCANA);
	public static Item DOG_MEAT_UNCOOKED = new ItemBase("dog_meat").setCreativeTab(Main.TAB_ARCANA);

	// Ingots
	public static Item THAUMIUM_INGOT = new ItemBase("thaumium_ingot").setCreativeTab(Main.TAB_ARCANA);
	public static Item ARCANIUM_INGOT = new ItemBase("arcanium_ingot").setCreativeTab(Main.TAB_ARCANA);
	public static Item VOID_METAL_INGOT = new ItemBase("void_metal_ingot").setCreativeTab(Main.TAB_ARCANA);

	// Materials - Items
	public static Item SILVERWOOD_STICK = new ItemBase("silverwood_stick").setCreativeTab(Main.TAB_ARCANA);

	// Wand Parts
	public static Item FOCUS_PARTS = new ItemBase("focus_parts").setCreativeTab(Main.TAB_ARCANA);
	public static Item ITEM_IRON_CAPS = new ItemBase("item_iron_cap").setCreativeTab(Main.TAB_ARCANA);
	public static Item ITEM_GOLD_CAPS = new ItemBase("item_gold_cap").setCreativeTab(Main.TAB_ARCANA);
	public static Item ITEM_THAUMIUM_CAPS = new ItemBase("item_thaumium_cap").setCreativeTab(Main.TAB_ARCANA);
	public static Item ITEM_VOID_CAPS = new ItemBase("item_void_cap").setCreativeTab(Main.TAB_ARCANA);
	public static Item ITEM_COPPER_CAPS = new ItemBase("item_copper_cap").setCreativeTab(Main.TAB_ARCANA);
	public static Item ITEM_SILVER_CAPS = new ItemBase("item_silver_cap").setCreativeTab(Main.TAB_ARCANA);
	public static Item ITEM_MANASTEEL_CAPS = new ItemBase("item_manasteel_cap").setCreativeTab(Main.TAB_ARCANA);
	public static Item ITEM_ELEMENTIUM_CAPS = new ItemBase("item_elementium_cap").setCreativeTab(Main.TAB_ARCANA);
	public static Item ITEM_TERRASTEEL_CAPS = new ItemBase("item_terrasteel_cap").setCreativeTab(Main.TAB_ARCANA);

	public static Item GREATWOOD_WAND_CORE = new ItemBase("greatwood_wand_core").setCreativeTab(Main.TAB_ARCANA);
	public static Item TAINTED_WAND_CORE = new ItemBase("tainted_wand_core").setCreativeTab(Main.TAB_ARCANA);
	public static Item DAIR_WAND_CORE = new ItemBase("dair_wand_core").setCreativeTab(Main.TAB_ARCANA);
	public static Item HAWTHORN_WAND_CORE = new ItemBase("hawthorn_wand_core").setCreativeTab(Main.TAB_ARCANA);
	public static Item SILVERWOOD_WAND_CORE = new ItemBase("silverwood_wand_core").setCreativeTab(Main.TAB_ARCANA);
	public static Item ARCANIUM_WAND_CORE = new ItemBase("arcanium_wand_core").setCreativeTab(Main.TAB_ARCANA);


	// Armor/Goggles
	public static GoggleBase GOGGLES_OF_REVEALING = new GoggleBase("goggles_of_revealing", MATERIAL_GOGGLES_REVEALING, 1, GogglePriority.SHOW_NODE);


	// Wand Attachments
	public static ItemAttachment IRON_CAP = new Cap("iron_cap").setId(0);
	public static ItemAttachment GOLD_CAP = new Cap("gold_cap").setId(1);
	public static ItemAttachment THAUMIUM_CAP = new Cap("thaumium_cap").setId(2);
	public static ItemAttachment VOID_CAP = new Cap("void_cap").setId(3);
	public static ItemAttachment COPPER_CAP = new Cap("copper_cap").setId(4);
	public static ItemAttachment SILVER_CAP = new Cap("silver_cap").setId(5);
	public static ItemAttachment ELEMENTIUM_CAP = new Cap("elementium_cap").setId(6);
	public static ItemAttachment MANASTEEL_CAP = new Cap("manasteel_cap").setId(7);
	public static ItemAttachment TERRASTEEL_CAP = new Cap("terrasteel_cap").setId(8);

	public static ItemAttachment[] CAPS = new ItemAttachment[] {IRON_CAP, GOLD_CAP, THAUMIUM_CAP, VOID_CAP, COPPER_CAP, SILVER_CAP ,ELEMENTIUM_CAP, MANASTEEL_CAP, TERRASTEEL_CAP};

	public static Item FOCUS = new ItemFocus("focus");

	// Wand stuff
	public static Item WOOD_WAND = new ItemWand("wood_wand").setAttachments(() -> {
		ItemAttachment[][] attachments = new ItemAttachment[2][CAPS.length];

		attachments[0] = new ItemAttachment[] {IRON_CAP};

		attachments[1] = new ItemAttachment[] {Focus.DEFAULT};
		return attachments;
	}).setCreativeTab(Main.TAB_ARCANA);

	public static Item GREATWOOD_WAND = new ItemWand("greatwood_wand").setAttachments(() -> {
		ItemAttachment[][] attachments = new ItemAttachment[2][CAPS.length];

		attachments[0] = new ItemAttachment[] {IRON_CAP, COPPER_CAP, GOLD_CAP, SILVER_CAP, MANASTEEL_CAP};

		attachments[1] = new ItemAttachment[] {Focus.DEFAULT};
		return attachments;
	}).setCreativeTab(Main.TAB_ARCANA);

	public static Item TAINTED_WAND = new ItemWand("tainted_wand").setAttachments(() -> {
		ItemAttachment[][] attachments = new ItemAttachment[2][CAPS.length];

		attachments[0] = new ItemAttachment[] {IRON_CAP, COPPER_CAP, GOLD_CAP, SILVER_CAP, MANASTEEL_CAP};

		attachments[1] = new ItemAttachment[] {Focus.DEFAULT};
		return attachments;
	}).setCreativeTab(Main.TAB_ARCANA);

	public static Item DAIR_WAND = new ItemWand("dair_wand").setAttachments(() -> {
		ItemAttachment[][] attachments = new ItemAttachment[2][CAPS.length];

		attachments[0] = new ItemAttachment[] {IRON_CAP, GOLD_CAP, THAUMIUM_CAP, COPPER_CAP, SILVER_CAP, MANASTEEL_CAP, ELEMENTIUM_CAP};

		attachments[1] = new ItemAttachment[] {Focus.DEFAULT};
		return attachments;
	}).setCreativeTab(Main.TAB_ARCANA);

	public static Item HAWTHORN_WAND = new ItemWand("hawthorn_wand").setAttachments(() -> {
		ItemAttachment[][] attachments = new ItemAttachment[2][CAPS.length];

		attachments[0] = new ItemAttachment[] {IRON_CAP, COPPER_CAP, GOLD_CAP, SILVER_CAP, MANASTEEL_CAP, ELEMENTIUM_CAP, THAUMIUM_CAP};

		attachments[1] = new ItemAttachment[] {Focus.DEFAULT};
		return attachments;
	}).setCreativeTab(Main.TAB_ARCANA);

	public static Item SILVERWOOD_WAND = new ItemWand("silverwood_wand").setAttachments(() -> {
		ItemAttachment[][] attachments = new ItemAttachment[2][CAPS.length];

		attachments[0] = CAPS;

		attachments[1] = new ItemAttachment[] {Focus.DEFAULT};
		return attachments;
	}).setCreativeTab(Main.TAB_ARCANA);

	public static Item ARCANIUM_WAND = new ItemWand("arcanium_wand").setAttachments(() -> {
		ItemAttachment[][] attachments = new ItemAttachment[2][CAPS.length];

		attachments[0] = CAPS;

		attachments[1] = new ItemAttachment[] {Focus.DEFAULT};
		return attachments;
	}).setCreativeTab(Main.TAB_ARCANA);


}
