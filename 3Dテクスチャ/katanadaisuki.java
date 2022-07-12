// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class katanadaisuki extends EntityModel<Entity> {
	private final ModelRenderer bone;

	public katanadaisuki() {
		textureWidth = 32;
		textureHeight = 32;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-5.75F, 7.75F, 0.0F);
		setRotationAngle(bone, 0.0F, 0.0F, 2.3562F);
		bone.setTextureOffset(13, 18).addBox(-4.0F, -4.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(12, 3).addBox(-4.0F, -6.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-8.0F, -3.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(18, 0).addBox(-2.0F, -4.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(14, 10).addBox(-1.0F, -3.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(17, 17).addBox(0.0F, -4.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(3, 15).addBox(-1.0F, -6.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(7, 14).addBox(-2.0F, -7.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(10, 17).addBox(-3.0F, -7.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(17, 2).addBox(-3.0F, -8.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(14, 15).addBox(-2.0F, -9.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(11, 11).addBox(-1.0F, -10.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 10).addBox(0.0F, -11.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(8, 6).addBox(1.0F, -12.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(8, 0).addBox(2.0F, -13.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(4, 4).addBox(3.0F, -14.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 4).addBox(4.0F, -15.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(4, 10).addBox(5.0F, -15.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(12, 6).addBox(6.0F, -15.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(15, 12).addBox(7.0F, -15.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(16, 6).addBox(-4.0F, -8.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(12, 0).addBox(-6.0F, -9.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 18).addBox(-5.0F, -7.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(6, 18).addBox(-5.0F, -5.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(18, 14).addBox(-6.0F, -4.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(3, 19).addBox(-5.0F, -4.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(18, 4).addBox(-5.0F, -3.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}