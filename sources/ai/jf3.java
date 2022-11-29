package ai;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

/* loaded from: classes3.dex */
public final class jf3 implements q53 {

    /* renamed from: a  reason: collision with root package name */
    public final ECPrivateKey f5767a;

    /* renamed from: b  reason: collision with root package name */
    public final lf3 f5768b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5769c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f5770d;

    /* renamed from: e  reason: collision with root package name */
    public final if3 f5771e;

    public jf3(ECPrivateKey eCPrivateKey, byte[] bArr, String str, int i10, if3 if3Var) throws GeneralSecurityException {
        this.f5767a = eCPrivateKey;
        this.f5768b = new lf3(eCPrivateKey);
        this.f5770d = bArr;
        this.f5769c = str;
        this.f5771e = if3Var;
    }
}
