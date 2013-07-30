package net.minecraft.src;

public class ItemBiere extends Item
{
    public ItemBiere(int var1)
    {
        super(var1);
        this.setMaxStackSize(1);
        this.setCreativeTab(CreativeTabs.tabFood);
    }

    public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par3EntityPlayer.capabilities.isCreativeMode)
        {
            --par1ItemStack.stackSize;
        }

        if (!par2World.isRemote)
        {
          par3EntityPlayer.clearActivePotions();
            par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.blindness.id, 13, 0));
            par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.confusion.id, 500, 2));
            par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 300, 0));
            par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.wither.id, 50, 0));
        }

        return par1ItemStack.stackSize <= 0 ? new ItemStack(Item.biereVide) : par1ItemStack;
    }

    /**
     * How long it takes to use or consume an item
     */
    public int getMaxItemUseDuration(ItemStack var1)
    {
        return 32;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack var1)
    {
        return EnumAction.drink;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        var3.setItemInUse(var1, this.getMaxItemUseDuration(var1));
        return var1;
    }

    /**
     * Return an item rarity from EnumRarity
     */
    public EnumRarity getRarity(ItemStack var1)
    {
        return var1.getItemDamage() == 0 ? EnumRarity.epic : EnumRarity.epic;
    }
}
