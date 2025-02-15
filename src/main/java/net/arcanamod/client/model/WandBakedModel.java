package net.arcanamod.client.model;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.TransformationMatrix;
import net.minecraft.client.renderer.model.*;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraftforge.client.model.BakedItemModel;
import net.minecraftforge.client.model.IModelConfiguration;

import javax.annotation.ParametersAreNonnullByDefault;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault
public class WandBakedModel extends BakedItemModel{
	
	final WandModelGeometry parent;
	IModelConfiguration owner;
	IModelTransform modelTransform;
	ItemCameraTransforms itemTransforms;
	
	public WandBakedModel(ImmutableList<BakedQuad> quads, TextureAtlasSprite particle, ImmutableMap<ItemCameraTransforms.TransformType, TransformationMatrix> transforms, ItemOverrideList overrides, boolean untransformed, boolean isSideLit, WandModelGeometry parent, IModelConfiguration owner, IModelTransform modelTransform, ItemCameraTransforms itemTransforms){
		super(quads, particle, transforms, overrides, untransformed, isSideLit);
		this.parent = parent;
		this.owner = owner;
		this.modelTransform = modelTransform;
		this.itemTransforms = itemTransforms;
	}
	
	public WandModelGeometry getParent(){
		return parent;
	}
	
	public ItemCameraTransforms getItemCameraTransforms(){
		return itemTransforms != null ? itemTransforms : ItemCameraTransforms.DEFAULT;
	}
}