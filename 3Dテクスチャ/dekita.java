// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class custom_model extends EntityModel<Entity> {
	private final ModelRenderer bone;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.5F, 7.5F, -6.5F);
		setRotationAngle(bone, -2.3562F, 0.0F, 0.0F);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -8.0F, -4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -5.0F, -5.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -3.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -3.0F, -8.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -8.0F, -3.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -9.0F, -2.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -10.0F, -1.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -11.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -12.0F, 1.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -13.0F, 2.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -14.0F, 3.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -15.0F, 4.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -16.0F, 5.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -16.0F, 6.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -16.0F, 7.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -3.0F, -1.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -9.0F, -5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -10.0F, -6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
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