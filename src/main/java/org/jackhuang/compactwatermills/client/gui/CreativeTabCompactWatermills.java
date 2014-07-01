/*******************************************************************************
 * Copyright (c) 2013 Aroma1997.
 * All rights reserved. This program and other files related to this program are
 * licensed with a extended GNU General Public License v. 3
 * License informations are at:
 * https://github.com/Aroma1997/CompactWindmills/blob/master/license.txt
 ******************************************************************************/

package org.jackhuang.compactwatermills.client.gui;


import org.jackhuang.compactwatermills.CompactWatermills;
import org.jackhuang.compactwatermills.common.block.GlobalBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * 
 * @author Aroma1997
 * 
 */
public class CreativeTabCompactWatermills extends CreativeTabs {
	
	public CreativeTabCompactWatermills(String name) {
		super(name);
	}
	
	@Override
	public ItemStack getIconItemStack() {
		return new ItemStack(GlobalBlocks.waterMill);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(GlobalBlocks.waterMill);
	}
	
}