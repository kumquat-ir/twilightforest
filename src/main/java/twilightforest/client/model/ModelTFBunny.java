// Date: 4/28/2012 9:36:32 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package twilightforest.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelTFBunny extends ModelBase {

    // fields
    ModelRenderer tail;
    ModelRenderer body;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer leg3;
    ModelRenderer leg4;
    ModelRenderer head;

    public ModelTFBunny() {
        textureWidth = 32;
        textureHeight = 32;
        setTextureOffset("head.head", 0, 0);
        setTextureOffset("head.ear2", 16, 0);
        setTextureOffset("head.ear1", 16, 0);

        tail = new ModelRenderer(this, 0, 18);
        tail.addBox(-1F, -1F, 0F, 2, 2, 2);
        tail.setRotationPoint(0F, 20F, 3F);
        tail.setTextureSize(32, 32);
        tail.mirror = true;
        setRotation(tail, 0F, 0F, 0F);
        body = new ModelRenderer(this, 0, 8);
        body.addBox(-2F, -1F, -2F, 4, 3, 5);
        body.setRotationPoint(0F, 21F, 0F);
        body.setTextureSize(32, 32);
        body.mirror = true;
        setRotation(body, 0F, 0F, 0F);
        leg1 = new ModelRenderer(this, 0, 16);
        leg1.addBox(0F, 0F, 0F, 1, 1, 1);
        leg1.setRotationPoint(-2F, 23F, 2F);
        leg1.setTextureSize(32, 32);
        leg1.mirror = true;
        setRotation(leg1, 0F, 0F, 0F);
        leg2 = new ModelRenderer(this, 0, 16);
        leg2.addBox(0F, 0F, 0F, 1, 1, 1);
        leg2.setRotationPoint(1F, 23F, 2F);
        leg2.setTextureSize(32, 32);
        leg2.mirror = true;
        setRotation(leg2, 0F, 0F, 0F);
        leg3 = new ModelRenderer(this, 0, 16);
        leg3.addBox(0F, 0F, 0F, 1, 1, 1);
        leg3.setRotationPoint(-2F, 23F, -2F);
        leg3.setTextureSize(32, 32);
        leg3.mirror = true;
        setRotation(leg3, 0F, 0F, 0F);
        leg4 = new ModelRenderer(this, 0, 16);
        leg4.addBox(0F, 0F, 0F, 1, 1, 1);
        leg4.setRotationPoint(1F, 23F, -2F);
        leg4.setTextureSize(32, 32);
        leg4.mirror = true;
        setRotation(leg4, 0F, 0F, 0F);
        head = new ModelRenderer(this, "head");
        head.setRotationPoint(0F, 22F, -1F);
        setRotation(head, 0F, 0F, 0F);
        head.mirror = true;
        head.addBox("head", -2F, -4F, -3F, 4, 4, 4);
        head.addBox("ear2", -2.5F, -8F, -0.5F, 2, 4, 1);
        head.addBox("ear1", 0.5F, -8F, -0.5F, 2, 4, 1);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5);
        tail.render(f5);
        body.render(f5);
        leg1.render(f5);
        leg2.render(f5);
        leg3.render(f5);
        leg4.render(f5);
        head.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    /**
     * Sets the models various rotation angles.
     */
    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6) {
        this.head.rotateAngleX = par5 / (180F / (float) Math.PI);
        this.head.rotateAngleY = par4 / (180F / (float) Math.PI);
        this.leg1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
        this.leg2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float) Math.PI) * 1.4F * par2;
        this.leg3.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float) Math.PI) * 1.4F * par2;
        this.leg4.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;

    }

}
