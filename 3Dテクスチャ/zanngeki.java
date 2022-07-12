// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class zanngeki extends EntityModel<Entity> {
	private final ModelRenderer bone;

	public zanngeki() {
		textureWidth = 32;
		textureHeight = 32;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.setTextureOffset(0, 6).addBox(2.0F, -3.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 8).addBox(5.0F, -1.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(7, 3).addBox(-5.0F, -3.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(7, 5).addBox(-7.0F, -2.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(7, 7).addBox(4.0F, -2.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-2.0F, -5.0F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 2).addBox(-4.0F, -4.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 4).addBox(1.0F, -4.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(9, 1).addBox(-8.0F, -1.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
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