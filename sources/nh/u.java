package nh;

import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public abstract class u extends s {

    /* renamed from: y  reason: collision with root package name */
    public static final WeakReference<byte[]> f43564y = new WeakReference<>(null);

    /* renamed from: x  reason: collision with root package name */
    public WeakReference<byte[]> f43565x;

    public u(byte[] bArr) {
        super(bArr);
        this.f43565x = f43564y;
    }

    public abstract byte[] M1();

    @Override // nh.s
    public final byte[] h1() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f43565x.get();
            if (bArr == null) {
                bArr = M1();
                this.f43565x = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }
}
