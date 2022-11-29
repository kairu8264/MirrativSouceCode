package ai;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class bc {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f2279a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2280b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f2281c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, String> f2282d;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public final long f2283e;

    /* renamed from: f  reason: collision with root package name */
    public final long f2284f;

    /* renamed from: g  reason: collision with root package name */
    public final long f2285g;

    /* renamed from: h  reason: collision with root package name */
    public final String f2286h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2287i;

    public bc(Uri uri, long j10, int i10, byte[] bArr, Map<String, String> map, long j11, long j12, String str, int i11, Object obj) {
        long j13 = j10 + j11;
        boolean z10 = false;
        u9.a(j13 >= 0);
        u9.a(j11 >= 0);
        u9.a((j12 > 0 || j12 == -1) ? true : z10);
        this.f2279a = uri;
        this.f2280b = 1;
        this.f2281c = null;
        this.f2282d = Collections.unmodifiableMap(new HashMap(map));
        this.f2284f = j11;
        this.f2283e = j13;
        this.f2285g = j12;
        this.f2286h = null;
        this.f2287i = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ bc(Uri uri, Uri uri2, long j10, int i10, byte[] bArr, Map<String, String> map, long j11, long j12, String str, int i11, Object obj) {
        this(uri, 0L, 1, null, bArr, map, -1L, null, str, null);
    }

    public static String a(int i10) {
        return "GET";
    }

    public final boolean b(int i10) {
        return (this.f2287i & i10) == i10;
    }

    public final String toString() {
        String a10 = a(1);
        String valueOf = String.valueOf(this.f2279a);
        long j10 = this.f2284f;
        long j11 = this.f2285g;
        int i10 = this.f2287i;
        StringBuilder sb2 = new StringBuilder(a10.length() + 70 + valueOf.length() + 4);
        sb2.append("DataSpec[");
        sb2.append(a10);
        sb2.append(" ");
        sb2.append(valueOf);
        sb2.append(", ");
        sb2.append(j10);
        sb2.append(", ");
        sb2.append(j11);
        sb2.append(", null, ");
        sb2.append(i10);
        sb2.append("]");
        return sb2.toString();
    }

    @Deprecated
    public bc(Uri uri, byte[] bArr, long j10, long j11, long j12, String str, int i10) {
        this(uri, j10 - j11, 1, null, Collections.emptyMap(), j11, j12, null, i10, null);
    }
}
