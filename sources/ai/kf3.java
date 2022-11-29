package ai;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* loaded from: classes3.dex */
public final class kf3 implements r53 {

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f6201f = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public final nf3 f6202a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6203b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f6204c;

    /* renamed from: d  reason: collision with root package name */
    public final if3 f6205d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6206e;

    public kf3(ECPublicKey eCPublicKey, byte[] bArr, String str, int i10, if3 if3Var) throws GeneralSecurityException {
        of3.a(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f6202a = new nf3(eCPublicKey);
        this.f6204c = bArr;
        this.f6203b = str;
        this.f6206e = i10;
        this.f6205d = if3Var;
    }

    @Override // ai.r53
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        mf3 a10 = this.f6202a.a(this.f6203b, this.f6204c, bArr2, this.f6205d.zza(), this.f6206e);
        byte[] a11 = this.f6205d.a(a10.b()).a(bArr, f6201f);
        byte[] a12 = a10.a();
        return ByteBuffer.allocate(a12.length + a11.length).put(a12).put(a11).array();
    }
}
