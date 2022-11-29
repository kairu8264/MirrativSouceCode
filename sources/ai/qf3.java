package ai;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class qf3 implements m53 {

    /* renamed from: a  reason: collision with root package name */
    public final bg3 f8925a;

    /* renamed from: b  reason: collision with root package name */
    public final e63 f8926b;

    public qf3(bg3 bg3Var, e63 e63Var, int i10) {
        this.f8925a = bg3Var;
        this.f8926b = e63Var;
    }

    @Override // ai.m53
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] a10 = this.f8925a.a(bArr);
        return df3.a(a10, this.f8926b.a(df3.a(bArr2, a10, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8))));
    }
}
