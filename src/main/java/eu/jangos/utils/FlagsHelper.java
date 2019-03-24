/*
 * Copyright (C) 2017 GetMangos
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

/**
 * FlagsHelper is nothing more than an enum of flags positions. It is designed to be used in combination
 * with FlagUtils to help you finding whether a flag is active or not on a field (byte, short, int, long).
 * @author GetMangos
 */
public enum FlagsHelper {
    FLAG_1(1),
    FLAG_2(2),
    FLAG_3(3),
    FLAG_4(4),
    FLAG_5(5),
    FLAG_6(6),
    FLAG_7(7),
    FLAG_8(8),
    FLAG_9(9),
    FLAG_10(10),
    FLAG_11(11),
    FLAG_12(12),
    FLAG_13(13),
    FLAG_14(14),
    FLAG_15(15),
    FLAG_16(16),
    FLAG_17(17),
    FLAG_18(18),
    FLAG_19(19),
    FLAG_20(20),
    FLAG_21(21),
    FLAG_22(22),
    FLAG_23(23),
    FLAG_24(24),
    FLAG_25(25),
    FLAG_26(26),
    FLAG_27(27),
    FLAG_28(28),
    FLAG_29(29),
    FLAG_30(30),
    FLAG_31(31),
    FLAG_32(32),
    FLAG_33(33),
    FLAG_34(34),
    FLAG_35(35),
    FLAG_36(36),
    FLAG_37(37),
    FLAG_38(38),
    FLAG_39(39),
    FLAG_40(40),
    FLAG_41(41),
    FLAG_42(42),
    FLAG_43(43),
    FLAG_44(44),
    FLAG_45(45),
    FLAG_46(46),
    FLAG_47(47),
    FLAG_48(48),
    FLAG_49(49),
    FLAG_50(50),
    FLAG_51(51),
    FLAG_52(52),
    FLAG_53(53),
    FLAG_54(54),
    FLAG_55(55),
    FLAG_56(56),
    FLAG_57(57),
    FLAG_58(58),
    FLAG_59(59),
    FLAG_60(60),
    FLAG_61(61),
    FLAG_62(62),
    FLAG_63(63),
    FLAG_64(64);

    private int pos;

    private FlagsHelper(int pos) {
        this.pos = pos;
    }

    public int getPos() {
        return pos;
    }
}
