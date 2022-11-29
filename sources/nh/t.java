package nh;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class t extends s {

    /* renamed from: x  reason: collision with root package name */
    public final byte[] f43563x;

    public t(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f43563x = bArr;
    }

    @Override // nh.s
    public final byte[] h1() {
        return this.f43563x;
    }
}
