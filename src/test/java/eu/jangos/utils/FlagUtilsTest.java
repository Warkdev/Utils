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

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Warkdev
 */
public class FlagUtilsTest {
    
    public FlagUtilsTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }   

    /**
     * Test of getByte method, of class FlagUtils.
     */
    @org.junit.jupiter.api.Test
    public void testGetByte_short_int() {
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
     * Test of setByte method, of class FlagUtils.
     */
    @org.junit.jupiter.api.Test
    public void testSetByte_3args_1() {
        System.out.println("setByte");
        short field = 0;
        int pos = 0;
        byte value = 0;
        short expResult = 0;
        short result = FlagUtils.setByte(field, pos, value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getByte method, of class FlagUtils.
     */
    @org.junit.jupiter.api.Test
    public void testGetByte_int_int() {
        System.out.println("getByte");
        int flags = 0;
        int pos = 0;
        short expResult = 0;
        short result = FlagUtils.getByte(flags, pos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setByte method, of class FlagUtils.
     */
    @org.junit.jupiter.api.Test
    public void testSetByte_3args_2() {
        System.out.println("setByte");
        int field = 0;
        int pos = 0;
        byte value = 0;
        int expResult = 0;
        int result = FlagUtils.setByte(field, pos, value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getByte method, of class FlagUtils.
     */
    @org.junit.jupiter.api.Test
    public void testGetByte_long_int() {
        System.out.println("getByte");
        long flags = 0L;
        int pos = 0;
        short expResult = 0;
        short result = FlagUtils.getByte(flags, pos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setByte method, of class FlagUtils.
     */
    @org.junit.jupiter.api.Test
    public void testSetByte_3args_3() {
        System.out.println("setByte");
        long field = 0L;
        int pos = 0;
        byte value = 0;
        long expResult = 0L;
        long result = FlagUtils.setByte(field, pos, value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasFlag method, of class FlagUtils.
     */
    @org.junit.jupiter.api.Test
    public void testHasFlag_byte_byte() {
        System.out.println("hasFlag");
        byte field = 0;
        byte flag = 0;
        boolean expResult = false;
        boolean result = FlagUtils.hasFlag(field, flag);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasFlag method, of class FlagUtils.
     */
    @org.junit.jupiter.api.Test
    public void testHasFlag_short_short() {
        System.out.println("hasFlag");
        short field = 0;
        short flag = 0;
        boolean expResult = false;
        boolean result = FlagUtils.hasFlag(field, flag);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasFlag method, of class FlagUtils.
     */
    @org.junit.jupiter.api.Test
    public void testHasFlag_int_int() {
        System.out.println("hasFlag");
        int field = 0;
        int flag = 0;
        boolean expResult = false;
        boolean result = FlagUtils.hasFlag(field, flag);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasFlag method, of class FlagUtils.
     */
    @org.junit.jupiter.api.Test
    public void testHasFlag_long_long() {
        System.out.println("hasFlag");
        long field = 0L;
        long flag = 0L;
        boolean expResult = false;
        boolean result = FlagUtils.hasFlag(field, flag);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSet method, of class FlagUtils.
     */
    @org.junit.jupiter.api.Test
    public void testIsSet_byte_int() {
        System.out.println("isSet");
        byte field = 0;
        int pos = 0;
        boolean expResult = false;
        boolean result = FlagUtils.isSet(field, pos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSet method, of class FlagUtils.
     */
    @org.junit.jupiter.api.Test
    public void testIsSet_short_int() {
        System.out.println("isSet");
        short field = 0;
        int pos = 0;
        boolean expResult = false;
        boolean result = FlagUtils.isSet(field, pos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSet method, of class FlagUtils.
     */
    @org.junit.jupiter.api.Test
    public void testIsSet_int_int() {
        System.out.println("isSet");
        int field = 0;
        int pos = 0;
        boolean expResult = false;
        boolean result = FlagUtils.isSet(field, pos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSet method, of class FlagUtils.
     */
    @org.junit.jupiter.api.Test
    public void testIsSet_long_int() {
        System.out.println("isSet");
        long field = 0L;
        int pos = 0;
        boolean expResult = false;
        boolean result = FlagUtils.isSet(field, pos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFlag method, of class FlagUtils.
     */
    @org.junit.jupiter.api.Test
    public void testSetFlag_3args_1() {
        System.out.println("setFlag");
        byte field = 0;
        int pos = 0;
        boolean value = false;
        byte expResult = 0;
        byte result = FlagUtils.setFlag(field, pos, value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFlag method, of class FlagUtils.
     */
    @org.junit.jupiter.api.Test
    public void testSetFlag_3args_2() {
        System.out.println("setFlag");
        short field = 0;
        int pos = 0;
        boolean value = false;
        short expResult = 0;
        short result = FlagUtils.setFlag(field, pos, value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFlag method, of class FlagUtils.
     */
    @org.junit.jupiter.api.Test
    public void testSetFlag_3args_3() {
        System.out.println("setFlag");
        int field = 0;
        int pos = 0;
        boolean value = false;
        int expResult = 0;
        int result = FlagUtils.setFlag(field, pos, value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFlag method, of class FlagUtils.
     */
    @org.junit.jupiter.api.Test
    public void testSetFlag_3args_4() {
        System.out.println("setFlag");
        long field = 0L;
        int pos = 0;
        boolean value = false;
        long expResult = 0L;
        long result = FlagUtils.setFlag(field, pos, value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
