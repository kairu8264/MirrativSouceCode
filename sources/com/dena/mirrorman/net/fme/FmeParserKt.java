package com.dena.mirrorman.net.fme;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import jo.p;
import po.i;
import xn.o;

/* loaded from: classes2.dex */
public final class FmeParserKt {
    public static final byte[] getBytes(byte[] bArr, int i10, int i11) {
        p.h(bArr, "bytes");
        return o.X(bArr, new i(i10, (i11 + i10) - 1));
    }

    public static final int parseIntFromBytes(byte[] bArr) {
        p.h(bArr, "bytes");
        int length = bArr.length;
        if (length != 1) {
            if (length != 2) {
                return ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getInt();
            }
            return ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getShort();
        }
        return bArr[0];
    }
}
