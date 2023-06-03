// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelarmor_layer_3_Converted extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer left_shoe;
	private final ModelRenderer right_shoe;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;

	public Modelarmor_layer_3_Converted() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(28, 0).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.75F, false);
		head.setTextureOffset(20, 18).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(0, 30).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.75F, false);
		body.setTextureOffset(0, 0).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, 0.6F, false);

		left_shoe = new ModelRenderer(this);
		left_shoe.setRotationPoint(1.9F, 12.0F, 0.0F);
		left_shoe.setTextureOffset(40, 34).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.75F, true);

		right_shoe = new ModelRenderer(this);
		right_shoe.setRotationPoint(-1.9F, 12.0F, 0.0F);
		right_shoe.setTextureOffset(40, 34).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.75F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(5.0F, 2.0F, 0.0F);
		left_arm.setTextureOffset(24, 34).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.75F, true);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		right_arm.setTextureOffset(24, 34).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.75F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_shoe.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_shoe.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}