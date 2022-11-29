package ai;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class vi {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f11093a;

    /* renamed from: b  reason: collision with root package name */
    public final long f11094b;

    /* renamed from: c  reason: collision with root package name */
    public final long f11095c;

    /* renamed from: d  reason: collision with root package name */
    public final long f11096d;

    public vi(Uri uri, byte[] bArr, long j10, long j11, long j12, String str, int i10) {
        boolean z10 = false;
        fj.a(j10 >= 0);
        fj.a(j11 >= 0);
        fj.a((j12 > 0 || j12 == -1) ? true : z10);
        this.f11093a = uri;
        this.f11094b = j10;
        this.f11095c = j11;
        this.f11096d = j12;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11093a);
        String arrays = Arrays.toString((byte[]) null);
        long j10 = this.f11094b;
        long j11 = this.f11095c;
        long j12 = this.f11096d;
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 93 + String.valueOf(arrays).length() + 4);
        sb2.append("DataSpec[");
        sb2.append(valueOf);
        sb2.append(", ");
        sb2.append(arrays);
        sb2.append(", ");
        sb2.append(j10);
        sb2.append(", ");
        sb2.append(j11);
        sb2.append(", ");
        sb2.append(j12);
        sb2.append(", null, 0]");
        return sb2.toString();
    }
}
