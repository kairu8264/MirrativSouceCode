package com.mirrativ.llstream.extension;

/* loaded from: classes4.dex */
public final class UintKt {
    /* renamed from: toByteArray-WZ4Q5Ns  reason: not valid java name */
    public static final byte[] m27toByteArrayWZ4Q5Ns(int i10) {
        return new byte[]{(byte) (i10 & 255), (byte) ((i10 >>> 8) & 255), (byte) ((i10 >>> 16) & 255), (byte) ((i10 >>> 24) & 255)};
    }
}
