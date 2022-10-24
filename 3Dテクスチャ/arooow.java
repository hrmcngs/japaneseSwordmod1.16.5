// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class arooow extends EntityModel<Entity> {
	private final ModelRenderer bone3;
	private final ModelRenderer bone2;
	private final ModelRenderer bone;

	public arooow() {
		textureWidth = 32;
		textureHeight = 32;

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.5F, -0.5F, 0.0F);
		bone3.addChild(bone2);
		bone2.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -6.0F, 1.0F, 0.0F, 14.0F, 0.0F, false);
		bone2.setTextureOffset(5, 2).addBox(0.0F, -1.0F, 5.0F, 1.0F, 0.0F, 2.0F, 0.0F, false);
		bone2.setTextureOffset(2, 3).addBox(-2.0F, -1.0F, -5.0F, 1.0F, 0.0F, 3.0F, 0.0F, false);
		bone2.setTextureOffset(0, 3).addBox(-3.0F, -1.0F, -6.0F, 1.0F, 0.0F, 3.0F, 0.0F, false);
		bone2.setTextureOffset(2, 0).addBox(1.0F, -1.0F, -6.0F, 1.0F, 0.0F, 3.0F, 0.0F, false);
		bone2.setTextureOffset(0, 0).addBox(0.0F, -1.0F, -5.0F, 1.0F, 0.0F, 3.0F, 0.0F, false);
		bone2.setTextureOffset(5, 0).addBox(-2.0F, -1.0F, 5.0F, 1.0F, 0.0F, 2.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(bone);
		bone.setTextureOffset(0, 6).addBox(0.0F, -3.0F, -5.0F, 0.0F, 1.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(0, 5).addBox(0.0F, -4.0F, -6.0F, 0.0F, 1.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(0.0F, -2.0F, -6.0F, 0.0F, 1.0F, 14.0F, 0.0F, false);
		bone.setTextureOffset(6, 4).addBox(0.0F, -1.0F, 5.0F, 0.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 4).addBox(0.0F, 0.0F, -6.0F, 0.0F, 1.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(6, 5).addBox(0.0F, -3.0F, 5.0F, 0.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 3).addBox(0.0F, -1.0F, -5.0F, 0.0F, 1.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bone3.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}