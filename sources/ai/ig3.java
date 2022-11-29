package ai;

import java.security.SecureRandom;

/* loaded from: classes3.dex */
public final class ig3 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<SecureRandom> f5224a = new hg3();

    public static byte[] a(int i10) {
        byte[] bArr = new byte[i10];
        f5224a.get().nextBytes(bArr);
        return bArr;
    }
}
