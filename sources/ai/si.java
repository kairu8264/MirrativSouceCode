package ai;

import android.net.Uri;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class si implements ui {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f9839a;

    /* renamed from: b  reason: collision with root package name */
    public Uri f9840b;

    /* renamed from: c  reason: collision with root package name */
    public int f9841c;

    /* renamed from: d  reason: collision with root package name */
    public int f9842d;

    public si(byte[] bArr) {
        Objects.requireNonNull(bArr);
        fj.a(bArr.length > 0);
        this.f9839a = bArr;
    }

    @Override // ai.ui
    public final Uri b() {
        return this.f9840b;
    }

    @Override // ai.ui
    public final void d() throws IOException {
        this.f9840b = null;
    }

    @Override // ai.ui
    public final int e(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f9842d;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        System.arraycopy(this.f9839a, this.f9841c, bArr, i10, min);
        this.f9841c += min;
        this.f9842d -= min;
        return min;
    }

    @Override // ai.ui
    public final long f(vi viVar) throws IOException {
        this.f9840b = viVar.f11093a;
        long j10 = viVar.f11095c;
        int i10 = (int) j10;
        this.f9841c = i10;
        long j11 = viVar.f11096d;
        int length = (int) (j11 == -1 ? this.f9839a.length - j10 : j11);
        this.f9842d = length;
        if (length <= 0 || i10 + length > this.f9839a.length) {
            int length2 = this.f9839a.length;
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("Unsatisfiable range: [");
            sb2.append(i10);
            sb2.append(", ");
            sb2.append(j11);
            sb2.append("], length: ");
            sb2.append(length2);
            throw new IOException(sb2.toString());
        }
        return length;
    }
}
