package ai;

import android.net.Uri;
import android.util.Base64;
import com.google.android.gms.internal.ads.zzaha;
import com.google.android.gms.internal.ads.zzak;
import java.io.IOException;
import java.net.URLDecoder;

/* loaded from: classes3.dex */
public final class hs3 extends z4 {

    /* renamed from: e  reason: collision with root package name */
    public bc f4959e;

    /* renamed from: f  reason: collision with root package name */
    public byte[] f4960f;

    /* renamed from: g  reason: collision with root package name */
    public int f4961g;

    /* renamed from: h  reason: collision with root package name */
    public int f4962h;

    public hs3() {
        super(false);
    }

    @Override // ai.a6
    public final int b(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f4962h;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        System.arraycopy(sb.I(this.f4960f), this.f4961g, bArr, i10, min);
        this.f4961g += min;
        this.f4962h -= min;
        s(min);
        return min;
    }

    @Override // ai.a8
    public final void g() {
        if (this.f4960f != null) {
            this.f4960f = null;
            t();
        }
        this.f4959e = null;
    }

    @Override // ai.a8
    public final Uri h() {
        bc bcVar = this.f4959e;
        if (bcVar != null) {
            return bcVar.f2279a;
        }
        return null;
    }

    @Override // ai.a8
    public final long m(bc bcVar) throws IOException {
        q(bcVar);
        this.f4959e = bcVar;
        Uri uri = bcVar.f2279a;
        String scheme = uri.getScheme();
        boolean equals = "data".equals(scheme);
        String valueOf = String.valueOf(scheme);
        u9.b(equals, valueOf.length() != 0 ? "Unsupported scheme: ".concat(valueOf) : new String("Unsupported scheme: "));
        String[] Y = sb.Y(uri.getSchemeSpecificPart(), ",");
        if (Y.length == 2) {
            String str = Y[1];
            if (Y[0].contains(";base64")) {
                try {
                    this.f4960f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e10) {
                    String valueOf2 = String.valueOf(str);
                    throw zzaha.a(valueOf2.length() != 0 ? "Error while parsing Base64 encoded string: ".concat(valueOf2) : new String("Error while parsing Base64 encoded string: "), e10);
                }
            } else {
                this.f4960f = sb.X(URLDecoder.decode(str, zw2.f13230a.name()));
            }
            long j10 = bcVar.f2284f;
            int length = this.f4960f.length;
            if (j10 <= length) {
                int i10 = (int) j10;
                this.f4961g = i10;
                int i11 = length - i10;
                this.f4962h = i11;
                long j11 = bcVar.f2285g;
                if (j11 != -1) {
                    this.f4962h = (int) Math.min(i11, j11);
                }
                r(bcVar);
                long j12 = bcVar.f2285g;
                return j12 != -1 ? j12 : this.f4962h;
            }
            this.f4960f = null;
            throw new zzak(2008);
        }
        throw zzaha.a("Unexpected URI format: ".concat(String.valueOf(uri)), null);
    }
}
