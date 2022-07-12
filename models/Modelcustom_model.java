// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelcustom_model extends EntityModel<Entity> {
	private final ModelRenderer bone;

	public Modelcustom_model() {
		textureWidth = 32;
		textureHeight = 32;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.setTextureOffset(7, 2).addBox(-0.5F, -3.0F, 5.25F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(8, 15).addBox(-0.5F, -5.0F, 4.25F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(15, 4).addBox(-0.5F, -6.0F, 3.25F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(4, 15).addBox(-0.5F, -7.0F, 2.25F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 14).addBox(-0.5F, -8.0F, 1.25F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(12, 12).addBox(-0.5F, -9.0F, 0.25F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(6, 0).addBox(-0.5F, -10.0F, -0.75F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 5).addBox(-0.5F, -11.0F, -1.75F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(16, 11).addBox(-0.5F, -11.0F, -2.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(12, 8).addBox(-0.5F, -11.0F, -4.75F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(12, 0).addBox(-0.5F, -13.0F, -4.75F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-0.5F, -13.0F, -5.75F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 10).addBox(-0.5F, -14.0F, -5.75F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(15, 15).addBox(-0.5F, -13.0F, -2.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(16, 8).addBox(-0.5F, -13.0F, -1.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(7, 8).addBox(-0.5F, -14.0F, -0.75F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(16, 0).addBox(-0.5F, -15.0F, 2.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 5).addBox(-0.5F, -16.0F, -1.75F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-0.5F, -15.0F, -1.75F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(10, 0).addBox(-0.5F, -15.0F, -2.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(6, 12).addBox(-0.5F, -14.0F, -2.75F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(12, 17).addBox(-0.5F, -4.0F, 5.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}