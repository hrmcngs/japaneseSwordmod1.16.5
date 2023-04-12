// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelshulker_ConvertedMk2 extends EntityModel<Entity> {
	private final ModelRenderer lid;
	private final ModelRenderer base;
	private final ModelRenderer head;

	public Modelshulker_ConvertedMk2() {
		textureWidth = 64;
		textureHeight = 64;

		lid = new ModelRenderer(this);
		lid.setRotationPoint(0.0F, 24.0F, 0.0F);
		lid.setTextureOffset(0, 0).addBox(-8.0F, -18.0F, -8.0F, 16.0F, 12.0F, 16.0F, 0.0F, false);

		base = new ModelRenderer(this);
		base.setRotationPoint(0.0F, 24.0F, 0.0F);
		base.setTextureOffset(0, 28).addBox(-8.0F, -8.0F, -8.0F, 16.0F, 8.0F, 16.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 12.0F, 0.0F);
		head.setTextureOffset(0, 52).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		lid.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		base.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}