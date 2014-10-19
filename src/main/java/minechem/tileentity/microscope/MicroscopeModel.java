// Date: 19/12/2012 19:16:44
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package minechem.tileentity.microscope;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class MicroscopeModel extends ModelBase
{
	// fields
	ModelRenderer base;
	ModelRenderer neck_lower;
	ModelRenderer platter;
	ModelRenderer light;
	ModelRenderer neck_upper;
	ModelRenderer top;
	ModelRenderer eyepiece;
	ModelRenderer lens1;
	ModelRenderer lens2;
	ModelRenderer lens3;
	ModelRenderer focus_right;
	ModelRenderer focus_left;
	ModelRenderer axle;

	public MicroscopeModel()
	{
		textureWidth = 64;
		textureHeight = 32;

		base = new ModelRenderer(this, 8, 16);
		base.addBox(0F, 0F, 0F, 14, 2, 14);
		base.setRotationPoint(-7F, 22F, -7F);
		base.setTextureSize(64, 32);
		base.mirror = true;
		setRotation(base, 0F, 0F, 0F);
		neck_lower = new ModelRenderer(this, 16, 6);
		neck_lower.addBox(0F, 0F, 0F, 4, 6, 4);
		neck_lower.setRotationPoint(-2F, 16F, -7F);
		neck_lower.setTextureSize(64, 32);
		neck_lower.mirror = true;
		setRotation(neck_lower, 0F, 0F, 0F);
		platter = new ModelRenderer(this, 32, 7);
		platter.addBox(0F, 0F, 0F, 8, 1, 8);
		platter.setRotationPoint(-4F, 18F, -4F);
		platter.setTextureSize(64, 32);
		platter.mirror = true;
		setRotation(platter, 0F, 0F, 0F);
		light = new ModelRenderer(this, 0, 28);
		light.addBox(0F, 0F, 0F, 2, 2, 2);
		light.setRotationPoint(-1F, 20F, -1F);
		light.setTextureSize(64, 32);
		light.mirror = true;
		setRotation(light, 0F, 0F, 0F);
		neck_upper = new ModelRenderer(this, 8, 8);
		neck_upper.addBox(0F, 0F, 0F, 2, 6, 2);
		neck_upper.setRotationPoint(-1F, 11F, -3F);
		neck_upper.setTextureSize(64, 32);
		neck_upper.mirror = true;
		setRotation(neck_upper, -0.5061455F, 0F, 0F);
		top = new ModelRenderer(this, 46, 0);
		top.addBox(0F, 0F, 0F, 4, 2, 5);
		top.setRotationPoint(-2F, 11F, -3F);
		top.setTextureSize(64, 32);
		top.mirror = true;
		setRotation(top, 0F, 0F, 0F);
		eyepiece = new ModelRenderer(this, 0, 4);
		eyepiece.addBox(0F, 0F, 0F, 1, 4, 1);
		eyepiece.setRotationPoint(-0.5F, 9F, -6F);
		eyepiece.setTextureSize(64, 32);
		eyepiece.mirror = true;
		setRotation(eyepiece, 0.8028515F, 0F, 0F);
		lens1 = new ModelRenderer(this, 6, 0);
		lens1.addBox(0F, 0F, 0F, 1, 3, 1);
		lens1.setRotationPoint(-0.5F, 13F, -0.5F);
		lens1.setTextureSize(64, 32);
		lens1.mirror = true;
		setRotation(lens1, 0F, 0F, 0F);
		lens2 = new ModelRenderer(this, 6, 0);
		lens2.addBox(0F, 0F, 0F, 1, 3, 1);
		lens2.setRotationPoint(0.3666667F, 11.93333F, 1.1F);
		lens2.setTextureSize(64, 32);
		lens2.mirror = true;
		setRotation(lens2, 0.3717861F, 1.07818F, 0.1858931F);
		lens3 = new ModelRenderer(this, 6, 0);
		lens3.addBox(0F, 0F, 0F, 1, 3, 1);
		lens3.setRotationPoint(-0.2F, 11.73333F, 1.2F);
		lens3.setTextureSize(64, 32);
		lens3.mirror = false;
		setRotation(lens3, -0.1115358F, -2.767534F, -0.3346075F);
		focus_right = new ModelRenderer(this, 0, 0);
		focus_right.addBox(0F, 0F, 0F, 1, 2, 2);
		focus_right.setRotationPoint(3F, 17F, -7F);
		focus_right.setTextureSize(64, 32);
		focus_right.mirror = true;
		setRotation(focus_right, 0F, 0F, 0F);
		focus_left = new ModelRenderer(this, 0, 0);
		focus_left.addBox(0F, 0F, 0F, 1, 2, 2);
		focus_left.setRotationPoint(-4F, 17F, -7F);
		focus_left.setTextureSize(64, 32);
		focus_left.mirror = true;
		setRotation(focus_left, 0F, 0F, 0F);
		axle = new ModelRenderer(this, 10, 0);
		axle.addBox(0F, 0F, 0F, 6, 1, 1);
		axle.setRotationPoint(-3F, 17.5F, -6.5F);
		axle.setTextureSize(64, 32);
		axle.mirror = true;
		setRotation(axle, 0F, 0F, 0F);
	}

	public void render(float scale)
	{
		base.render(scale);
		neck_lower.render(scale);
		platter.render(scale);
		light.render(scale);
		neck_upper.render(scale);
		top.render(scale);
		eyepiece.render(scale);
		lens1.render(scale);
		lens2.render(scale);
		lens3.mirror = false;
		setRotation(lens3, -0.1115358F, -2.767534F, 0.3346075F);
		lens3.render(scale);
		focus_right.render(scale);
		focus_left.render(scale);
		axle.render(scale);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

}
