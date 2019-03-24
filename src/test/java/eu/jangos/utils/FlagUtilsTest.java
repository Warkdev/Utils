/*
 * Copyright (C) 2019 Warkdev
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package eu.jangos.utils;

import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Warkdev
 */
public class FlagUtilsTest {

    public FlagUtilsTest() {
    }

    /**
     * Test of getByte method, of class FlagUtils.
     */
    @Test
    public void testGetByteShort() {
        System.out.println("getByte");
        int flags = 260246804;
        int pos = 1;
        short expResult = 20;
        short result = FlagUtils.getByte(flags, pos);
        assertEquals(expResult, result);

        pos = 2;
        expResult = 13;
        result = FlagUtils.getByte(flags, pos);
        assertEquals(expResult, result);

        pos = 3;
        expResult = 131;
        result = FlagUtils.getByte(flags, pos);
        assertEquals(expResult, result);

        pos = 4;
        expResult = 15;
        result = FlagUtils.getByte(flags, pos);
        assertEquals(expResult, result);
    }

    /**
     * Test of getByte method, of class FlagUtils. This test must fail.
     */
    @Test
    public void testGetByteIntOutOfRange() {
        System.out.println("testGetByteOutOfRange");

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FlagUtils.getByte(0, -1);
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FlagUtils.getByte(0, 5);
        });
    }

    /**
     * Test of setByte method, of class FlagUtils.
     */
    @Test
    public void testSetByteShort() {
        System.out.println("setByte");
        short field = 255;
        int pos = 1;
        short value = 127;
        short expResult = 127;
        short result = FlagUtils.setByte(field, pos, value);
        assertEquals(expResult, result);

        field = 255;
        pos = 2;
        value = 255;
        expResult = -1;
        result = FlagUtils.setByte(field, pos, value);
        assertEquals(expResult, result);
    }

    /**
     * Test of getByte method, of class FlagUtils. This test must fail.
     */
    @Test
    public void testSetByteShortOutOfRange() {
        System.out.println("testSetByteOutOfRange");

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FlagUtils.setByte((short) 0, (short) -1, (short) 0);
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FlagUtils.setByte((short) 0, (short) 3, (short) 0);
        });
    }

    /**
     * Test of setByte method, of class FlagUtils.
     */
    @Test
    public void testSetByteInt() {
        System.out.println("setByte");
        int field = 255;
        int pos = 1;
        short value = 127;
        int expResult = 127;
        int result = FlagUtils.setByte(field, pos, value);
        assertEquals(expResult, result);

        field = 255;
        pos = 2;
        value = 255;
        expResult = 65535;
        result = FlagUtils.setByte(field, pos, value);
        assertEquals(expResult, result);

        field = 255;
        pos = 3;
        value = 255;
        expResult = 16711935;
        result = FlagUtils.setByte(field, pos, value);
        assertEquals(expResult, result);

        field = 255;
        pos = 4;
        value = 255;
        expResult = -16776961;
        result = FlagUtils.setByte(field, pos, value);
        assertEquals(expResult, result);
    }

    @Test
    public void testSetByteIntOutOfRange() {
        System.out.println("testSetByteOutOfRange");

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FlagUtils.setByte(0, -1, (short) 0);
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FlagUtils.setByte(0, 5, (short) 0);
        });
    }

    /**
     * Test of getByte method, of class FlagUtils.
     */
    @Test
    public void testGetByteLong() {
        System.out.println("getByte");
        long flags = 260246804L;
        int pos = 1;
        short expResult = 20;
        short result = FlagUtils.getByte(flags, pos);
        assertEquals(expResult, result);

        pos = 2;
        expResult = 13;
        result = FlagUtils.getByte(flags, pos);
        assertEquals(expResult, result);

        pos = 3;
        expResult = 131;
        result = FlagUtils.getByte(flags, pos);
        assertEquals(expResult, result);

        pos = 4;
        expResult = 15;
        result = FlagUtils.getByte(flags, pos);
        assertEquals(expResult, result);
    }

    /**
     * Test of getByte method, of class FlagUtils. This test must fail.
     */
    @Test
    public void testGetByteLongOutOfRange() {
        System.out.println("testGetByteOutOfRange");

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FlagUtils.getByte((long) 0, -1);
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FlagUtils.getByte((long) 0, 9);
        });
    }

    /**
     * Test of setByte method, of class FlagUtils.
     */
    @Test
    public void testSetByteLong() {
        System.out.println("setByte");
        long field = 255L;
        int pos = 1;
        short value = 127;
        long expResult = 127;
        long result = FlagUtils.setByte(field, pos, value);
        assertEquals(expResult, result);

        field = 255;
        pos = 2;
        value = 255;
        expResult = 65535;
        result = FlagUtils.setByte(field, pos, value);
        assertEquals(expResult, result);

        field = 255;
        pos = 3;
        value = 255;
        expResult = 16711935;
        result = FlagUtils.setByte(field, pos, value);
        assertEquals(expResult, result);

        field = 255;
        pos = 4;
        value = 255;
        expResult = 4278190335L;
        result = FlagUtils.setByte(field, pos, value);
        assertEquals(expResult, result);
    }

    @Test
    public void testSetByteLongOutOfRange() {
        System.out.println("testSetByteOutOfRange");

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FlagUtils.setByte((long) 0, -1, (short) 0);
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FlagUtils.setByte((long) 0, 9, (short) 0);
        });
    }

    /**
     * Test of hasFlag method, of class FlagUtils.
     */
    @Test
    public void testHasFlagByte() {
        System.out.println("hasFlag");
        byte field = -86;
        byte flag = 0x1;
        boolean expResult = false;
        boolean result = FlagUtils.hasFlag(field, flag);
        assertEquals(expResult, result);

        flag = 0x2;
        expResult = true;
        result = FlagUtils.hasFlag(field, flag);
        assertEquals(expResult, result);

        flag = 0x4;
        expResult = false;
        result = FlagUtils.hasFlag(field, flag);
        assertEquals(expResult, result);

        flag = 0x8;
        expResult = true;
        result = FlagUtils.hasFlag(field, flag);
        assertEquals(expResult, result);

        flag = 0x10;
        expResult = false;
        result = FlagUtils.hasFlag(field, flag);
        assertEquals(expResult, result);

        flag = 0x20;
        expResult = true;
        result = FlagUtils.hasFlag(field, flag);
        assertEquals(expResult, result);

        flag = 0x40;
        expResult = false;
        result = FlagUtils.hasFlag(field, flag);
        assertEquals(expResult, result);
    }

    /**
     * Test of hasFlag method, of class FlagUtils.
     */
    @Test
    public void testHasFlagShort() {
        System.out.println("hasFlag");
        short field = 0x6AAA;
        short flag = 0x1;
        boolean expResult = false;
        boolean result = FlagUtils.hasFlag(field, flag);
        assertEquals(expResult, result);

        flag = 0x2;
        expResult = true;
        result = FlagUtils.hasFlag(field, flag);
        assertEquals(expResult, result);

        flag = 0x4;
        expResult = false;
        result = FlagUtils.hasFlag(field, flag);
        assertEquals(expResult, result);

        flag = 0x8;
        expResult = true;
        result = FlagUtils.hasFlag(field, flag);
        assertEquals(expResult, result);

        flag = 0x10;
        expResult = false;
        result = FlagUtils.hasFlag(field, flag);
        assertEquals(expResult, result);

        flag = 0x20;
        expResult = true;
        result = FlagUtils.hasFlag(field, flag);
        assertEquals(expResult, result);

        flag = 0x40;
        expResult = false;
        result = FlagUtils.hasFlag(field, flag);
        assertEquals(expResult, result);

        flag = 0x80;
        expResult = true;
        result = FlagUtils.hasFlag(field, flag);
        assertEquals(expResult, result);
    }

    /**
     * Test of hasFlag method, of class FlagUtils.
     */
    @Test
    public void testHasFlagInt() {
        System.out.println("hasFlag");
        int field = 0x6AAAAAAA;
        int flag = 0x1;
        boolean expResult = false;
        boolean result = FlagUtils.hasFlag(field, flag);
        assertEquals(expResult, result);

        flag = 0x2;
        expResult = true;
        result = FlagUtils.hasFlag(field, flag);
        assertEquals(expResult, result);

        flag = 0x4;
        expResult = false;
        result = FlagUtils.hasFlag(field, flag);
        assertEquals(expResult, result);

        flag = 0x8;
        expResult = true;
        result = FlagUtils.hasFlag(field, flag);
        assertEquals(expResult, result);

        flag = 0x100;
        expResult = false;
        result = FlagUtils.hasFlag(field, flag);
        assertEquals(expResult, result);

        flag = 0x200;
        expResult = true;
        result = FlagUtils.hasFlag(field, flag);
        assertEquals(expResult, result);

        flag = 0x400;
        expResult = false;
        result = FlagUtils.hasFlag(field, flag);
        assertEquals(expResult, result);

        flag = 0x800;
        expResult = true;
        result = FlagUtils.hasFlag(field, flag);
        assertEquals(expResult, result);
    }

    /**
     * Test of hasFlag method, of class FlagUtils.
     */
    @Test
    public void testHasFlagLong() {
        System.out.println("hasFlag");
        long field = 0x6AAAAAAAAAAAAAAAL;
        long flag = 0x1000;
        boolean expResult = false;
        boolean result = FlagUtils.hasFlag(field, flag);
        assertEquals(expResult, result);

        flag = 0x2000;
        expResult = true;
        result = FlagUtils.hasFlag(field, flag);
        assertEquals(expResult, result);

        flag = 0x4000;
        expResult = false;
        result = FlagUtils.hasFlag(field, flag);
        assertEquals(expResult, result);

        flag = 0x8000;
        expResult = true;
        result = FlagUtils.hasFlag(field, flag);
        assertEquals(expResult, result);

        flag = 0x10000;
        expResult = false;
        result = FlagUtils.hasFlag(field, flag);
        assertEquals(expResult, result);

        flag = 0x20000;
        expResult = true;
        result = FlagUtils.hasFlag(field, flag);
        assertEquals(expResult, result);

        flag = 0x40000;
        expResult = false;
        result = FlagUtils.hasFlag(field, flag);
        assertEquals(expResult, result);

        flag = 0x80000;
        expResult = true;
        result = FlagUtils.hasFlag(field, flag);
        assertEquals(expResult, result);
    }

    /**
     * Test of isSet method, of class FlagUtils.
     */
    @Test
    public void testIsSetByte() {
        System.out.println("isSet");
        byte field = 0x7A;
        int pos = 1;
        boolean expResult = false;
        boolean result = FlagUtils.isSet(field, pos);
        assertEquals(expResult, result);

        pos = 2;
        expResult = true;
        result = FlagUtils.isSet(field, pos);
        assertEquals(expResult, result);

        pos = 3;
        expResult = false;
        result = FlagUtils.isSet(field, pos);
        assertEquals(expResult, result);

        pos = 4;
        expResult = true;
        result = FlagUtils.isSet(field, pos);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsSetByteOutOfRange() {
        System.out.println("testIsSetByteOutOfRange");

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FlagUtils.isSet((byte) 0, -1);
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FlagUtils.isSet((byte) 0, 9);
        });
    }

    /**
     * Test of isSet method, of class FlagUtils.
     */
    @Test
    public void testIsSetShort() {
        System.out.println("isSet");
        short field = 0x7AAA;
        int pos = 1;
        boolean expResult = false;
        boolean result = FlagUtils.isSet(field, pos);
        assertEquals(expResult, result);

        pos = 6;
        expResult = true;
        result = FlagUtils.isSet(field, pos);
        assertEquals(expResult, result);

        pos = 9;
        expResult = false;
        result = FlagUtils.isSet(field, pos);
        assertEquals(expResult, result);

        pos = 10;
        expResult = true;
        result = FlagUtils.isSet(field, pos);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsShortByteOutOfRange() {
        System.out.println("testIsSetByteOutOfRange");

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FlagUtils.isSet((short) 0, -1);
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FlagUtils.isSet((short) 0, 17);
        });
    }

    /**
     * Test of isSet method, of class FlagUtils.
     */
    @Test
    public void testIsSetInt() {
        System.out.println("isSet");
        int field = 0x7AAAAAAA;
        int pos = 17;
        boolean expResult = false;
        boolean result = FlagUtils.isSet(field, pos);
        assertEquals(expResult, result);

        pos = 18;
        expResult = true;
        result = FlagUtils.isSet(field, pos);
        assertEquals(expResult, result);

        pos = 23;
        expResult = false;
        result = FlagUtils.isSet(field, pos);
        assertEquals(expResult, result);

        pos = 24;
        expResult = true;
        result = FlagUtils.isSet(field, pos);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsSetIntOutOfRange() {
        System.out.println("testIsSetByteOutOfRange");

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FlagUtils.isSet(0, -1);
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FlagUtils.isSet(0, 33);
        });
    }

    /**
     * Test of isSet method, of class FlagUtils.
     */
    @Test
    public void testIsSetLong() {
        System.out.println("isSet");
        long field = 0x7AAAAAAAAAAAAAAAL;
        int pos = 33;
        boolean expResult = false;
        boolean result = FlagUtils.isSet(field, pos);
        assertEquals(expResult, result);

        pos = 34;
        expResult = true;
        result = FlagUtils.isSet(field, pos);
        assertEquals(expResult, result);

        pos = 45;
        expResult = false;
        result = FlagUtils.isSet(field, pos);
        assertEquals(expResult, result);

        pos = 46;
        expResult = true;
        result = FlagUtils.isSet(field, pos);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsSetLongOutOfRange() {
        System.out.println("testIsSetByteOutOfRange");

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FlagUtils.isSet(0L, -1);
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FlagUtils.isSet(0L, 65);
        });
    }

    /**
     * Test of setFlag method, of class FlagUtils.
     */
    @Test
    public void testSetFlagByte() {
        System.out.println("setFlag");
        byte field = 0;
        int pos = 1;
        boolean value = true;
        byte expResult = 1;
        byte result = FlagUtils.setFlag(field, pos, value);
        assertEquals(expResult, result);
        
        field = 1;
        pos = 2;
        value = true;
        expResult = 3;
        result = FlagUtils.setFlag(field, pos, value);
        assertEquals(expResult, result);
        
        field = 3;
        pos = 2;
        value = false;
        expResult = 1;
        result = FlagUtils.setFlag(field, pos, value);
        assertEquals(expResult, result);
        
        field = 1;
        pos = 1;
        value = false;
        expResult = 0;
        result = FlagUtils.setFlag(field, pos, value);
        assertEquals(expResult, result);
    }

    @Test
    public void testsetFlagByteOutOfRange() {
        System.out.println("testIsSetByteOutOfRange");

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FlagUtils.isSet((byte) 0, -1);
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FlagUtils.isSet((byte) 0, 9);
        });
    }
    
    /**
     * Test of setFlag method, of class FlagUtils.
     */
    @Test
    public void testSetFlagShort() {
        System.out.println("setFlag");
        short field = 0;
        int pos = 1;
        boolean value = true;
        short expResult = 0x1;
        short result = FlagUtils.setFlag(field, pos, value);
        assertEquals(expResult, result);
                
        field = 0x1;
        pos = 9;
        value = true;
        expResult = 0x101;
        result = FlagUtils.setFlag(field, pos, value);
        assertEquals(expResult, result);
        
        field = 0x101;
        pos = 9;
        value = false;
        expResult = 0x1;
        result = FlagUtils.setFlag(field, pos, value);
        assertEquals(expResult, result);
        
        field = 0x1;
        pos = 1;
        value = false;
        expResult = 0;
        result = FlagUtils.setFlag(field, pos, value);
        assertEquals(expResult, result);
    }

    @Test
    public void testsetFlagShortOutOfRange() {
        System.out.println("testIsSetByteOutOfRange");

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FlagUtils.isSet((short) 0, -1);
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FlagUtils.isSet((short) 0, 17);
        });
    }
    
    /**
     * Test of setFlag method, of class FlagUtils.
     */
    @Test
    public void testSetFlagInt() {
        System.out.println("setFlag");
        int field = 0;
        int pos = 1;
        boolean value = true;
        int expResult = 0x1;
        int result = FlagUtils.setFlag(field, pos, value);
        assertEquals(expResult, result);
                
        field = 0x1;
        pos = 17;
        value = true;
        expResult = 0x10001;
        result = FlagUtils.setFlag(field, pos, value);
        assertEquals(expResult, result);
        
        field = 0x10001;
        pos = 17;
        value = false;
        expResult = 0x1;
        result = FlagUtils.setFlag(field, pos, value);
        assertEquals(expResult, result);
        
        field = 0x1;
        pos = 1;
        value = false;
        expResult = 0;
        result = FlagUtils.setFlag(field, pos, value);
        assertEquals(expResult, result);
    }    
    
    @Test
    public void testsetFlagIntOutOfRange() {
        System.out.println("testIsSetByteOutOfRange");

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FlagUtils.isSet(0, -1);
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FlagUtils.isSet(0, 33);
        });
    }
    
    /**
     * Test of setFlag method, of class FlagUtils.
     */
    @Test
    public void testSetFlagLong() {
        System.out.println("setFlag");
        long field = 0;
        int pos = 1;
        boolean value = true;
        long expResult = 0x1;
        long result = FlagUtils.setFlag(field, pos, value);
        assertEquals(expResult, result);
                
        field = 0x1;
        pos = 33;
        value = true;
        expResult = 0x100000001L;
        result = FlagUtils.setFlag(field, pos, value);
        assertEquals(expResult, result);
        
        field = 0x100000001L;
        pos = 33;
        value = false;
        expResult = 0x1;
        result = FlagUtils.setFlag(field, pos, value);
        assertEquals(expResult, result);
        
        field = 0x1;
        pos = 1;
        value = false;
        expResult = 0;
        result = FlagUtils.setFlag(field, pos, value);
        assertEquals(expResult, result);
    }

    @Test
    public void testsetFlagLongOutOfRange() {
        System.out.println("testIsSetByteOutOfRange");

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FlagUtils.isSet(0L, -1);
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FlagUtils.isSet(0L, 65);
        });
    }   
}
