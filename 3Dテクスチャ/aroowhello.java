// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class aroowhello extends EntityModel<Entity> {
	private final ModelRenderer bone3;
	private final ModelRenderer bone2;
	private final ModelRenderer bone;

	public aroowhello() {
		textureWidth = 16;
		textureHeight = 16;

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(bone3, 0.0F, 0.0F, -3.1416F);
		

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(bone2);
		setRotationAngle(bone2, 0.0F, -1.5708F, 0.0F);
		bone2.setTextureOffset(0, 0).addBox(-0.5F, -14.0F, 0.0F, 1.0F, 14.0F, 0.0F, 0.0F, false);
		bone2.setTextureOffset(8, 8).addBox(-1.5F, -13.0F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		bone2.setTextureOffset(8, 6).addBox(0.5F, -13.0F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		bone2.setTextureOffset(6, 3).addBox(0.5F, -4.0F, 0.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone2.setTextureOffset(6, 0).addBox(-1.5F, -4.0F, 0.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone2.setTextureOffset(4, 3).addBox(-2.5F, -3.0F, 0.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone2.setTextureOffset(4, 0).addBox(1.5F, -3.0F, 0.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(bone);
		bone.setTextureOffset(2, 0).addBox(-0.5F, -14.0F, 0.0F, 1.0F, 14.0F, 0.0F, 0.0F, false);
		bone.setTextureOffset(6, 9).addBox(-1.5F, -13.0F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		bone.setTextureOffset(4, 9).addBox(0.5F, -13.0F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		bone.setTextureOffset(8, 3).addBox(0.5F, -4.0F, 0.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone.setTextureOffset(8, 0).addBox(-1.5F, -4.0F, 0.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone.setTextureOffset(6, 6).addBox(-2.5F, -3.0F, 0.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone.setTextureOffset(4, 6).addBox(1.5F, -3.0F, 0.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);
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