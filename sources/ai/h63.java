package ai;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class h63<P> {

    /* renamed from: a  reason: collision with root package name */
    public final P f4761a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f4762b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4763c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4764d;

    public h63(P p10, byte[] bArr, int i10, int i11, int i12) {
        this.f4761a = p10;
        this.f4762b = Arrays.copyOf(bArr, bArr.length);
        this.f4763c = i10;
        this.f4764d = i11;
    }

    public final P a() {
        return this.f4761a;
    }

    public final byte[] b() {
        byte[] bArr = this.f4762b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final int c() {
        return this.f4763c;
    }

    public final int d() {
        return this.f4764d;
    }
}
