package ai;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class v73 implements m53 {

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f11001c = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public final hd3 f11002a;

    /* renamed from: b  reason: collision with root package name */
    public final m53 f11003b;

    public v73(hd3 hd3Var, m53 m53Var) {
        this.f11002a = hd3Var;
        this.f11003b = m53Var;
    }

    @Override // ai.m53
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] L = t63.h(this.f11002a).L();
        byte[] a10 = this.f11003b.a(L, f11001c);
        byte[] a11 = ((m53) t63.j(this.f11002a.B(), L, m53.class)).a(bArr, bArr2);
        int length = a10.length;
        return ByteBuffer.allocate(length + 4 + a11.length).putInt(length).put(a10).put(a11).array();
    }
}
