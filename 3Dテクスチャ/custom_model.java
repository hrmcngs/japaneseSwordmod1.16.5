// Made with Blockbench 4.4.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class custom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart bone4;

	public custom_model(ModelPart root) {
		this.bone4 = root.getChild("bone4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone4 = partdefinition.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(31, 19).addBox(-1.0F, -7.0F, -6.0F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -22.75F, -5.75F, -2.3562F, 0.0F, 0.0F));

		PartDefinition bone11 = bone4.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 16.0F));

		PartDefinition bone3 = bone11.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, -15.0F));

		PartDefinition bone = bone3.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone2 = bone3.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(0, 38).addBox(-1.0F, -6.0F, -6.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(46, 4).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 2.0F));

		PartDefinition bone5 = bone11.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(0.0F, -5.0F, -11.0F));

		PartDefinition bone6 = bone5.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(30, 35).addBox(-1.0F, -6.0F, -6.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(40, 45).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone7 = bone5.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(8, 34).addBox(-1.0F, -6.0F, -6.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(18, 44).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 2.0F));

		PartDefinition bone12 = bone4.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offset(0.0F, -14.0F, 30.0F));

		PartDefinition bone13 = bone12.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, -15.0F));

		PartDefinition bone14 = bone13.addOrReplaceChild("bone14", CubeListBuilder.create().texOffs(20, 16).addBox(-1.0F, -6.0F, -8.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(43, 27).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(34, 43).addBox(-1.0F, -4.0F, -6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone15 = bone13.addOrReplaceChild("bone15", CubeListBuilder.create().texOffs(20, 8).addBox(-1.0F, -6.0F, -8.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(26, 41).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 2.0F));

		PartDefinition bone16 = bone12.addOrReplaceChild("bone16", CubeListBuilder.create(), PartPose.offset(0.0F, -5.0F, -11.0F));

		PartDefinition bone17 = bone16.addOrReplaceChild("bone17", CubeListBuilder.create().texOffs(20, 0).addBox(-1.0F, -6.0F, -8.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(42, 33).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone18 = bone16.addOrReplaceChild("bone18", CubeListBuilder.create().texOffs(10, 18).addBox(-1.0F, -6.0F, -8.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(10, 42).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 2.0F));

		PartDefinition bone19 = bone12.addOrReplaceChild("bone19", CubeListBuilder.create(), PartPose.offset(0.0F, -9.0F, -7.0F));

		PartDefinition bone20 = bone19.addOrReplaceChild("bone20", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, -6.0F, -8.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(40, 39).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone21 = bone19.addOrReplaceChild("bone21", CubeListBuilder.create().texOffs(10, 10).addBox(-1.0F, -6.0F, -8.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(40, 18).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 2.0F));

		PartDefinition bone22 = bone12.addOrReplaceChild("bone22", CubeListBuilder.create(), PartPose.offset(0.0F, -13.0F, -3.0F));

		PartDefinition bone23 = bone22.addOrReplaceChild("bone23", CubeListBuilder.create().texOffs(10, 2).addBox(-1.0F, -6.0F, -8.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(40, 10).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone24 = bone22.addOrReplaceChild("bone24", CubeListBuilder.create().texOffs(0, 8).addBox(-1.0F, -6.0F, -8.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(40, 0).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 2.0F));

		PartDefinition bone25 = bone12.addOrReplaceChild("bone25", CubeListBuilder.create(), PartPose.offset(0.0F, -17.0F, 1.0F));

		PartDefinition bone26 = bone25.addOrReplaceChild("bone26", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -6.0F, -8.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(18, 38).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone27 = bone25.addOrReplaceChild("bone27", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 2.0F));

		PartDefinition bone8 = bone4.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(0.0F, -9.0F, 9.0F));

		PartDefinition bone9 = bone8.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(32, 29).addBox(-1.0F, -6.0F, -6.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 44).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone10 = bone8.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(30, 10).addBox(-1.0F, -6.0F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(10, 26).addBox(-1.0F, -8.0F, -8.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(20, 24).addBox(-1.0F, -10.0F, -10.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(22, 32).addBox(-1.0F, -12.0F, -10.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(30, 2).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 32).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 2.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}