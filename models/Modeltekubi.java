// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modeltekubi extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer RightArm;
	private final ModelRenderer body;

	public Modeltekubi() {
		textureWidth = 32;
		textureHeight = 32;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, -22.0F, 0.0F);
		bone.addChild(RightArm);
		RightArm.setTextureOffset(0, 0).addBox(-3.5F, -2.0F, -2.5F, 5.0F, 12.0F, 5.0F, 0.25F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -24.0F, 0.0F);
		bone.addChild(body);

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