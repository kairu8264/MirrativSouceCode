package ai;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

/* loaded from: classes3.dex */
public final class d34 extends e34 {

    /* renamed from: x  reason: collision with root package name */
    public final byte[] f3125x;

    public d34(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f3125x = bArr;
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() throws CertificateEncodingException {
        return this.f3125x;
    }
}
