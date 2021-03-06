/*
 * ForgeOCEP
 * Copyright (C) 2019 Forge Overly Complicated Example Project
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301
 * USA
 */

package examplemod.examplemod2.common.blocks;

import examplemod.examplemod2.ExampleMod2;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBlue extends Block {

    public static final String NAME = "blue_block";
    public static final BlockBlue BLOCK_BLUE = new BlockBlue(Properties.create(Material.IRON));

    public BlockBlue(Properties properties) {
        super(properties);

        setRegistryName(ExampleMod2.MOD_ID, NAME);
    }

}
