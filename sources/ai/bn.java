package ai;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.List;

/* loaded from: classes3.dex */
public final class bn extends sh.a {
    public static final Parcelable.Creator<bn> CREATOR = new cn();
    public final String A;
    public final Bundle B;
    public final boolean C;
    public long D;
    public String E;
    public int F;

    /* renamed from: w  reason: collision with root package name */
    public final String f2404w;

    /* renamed from: x  reason: collision with root package name */
    public final long f2405x;

    /* renamed from: y  reason: collision with root package name */
    public final String f2406y;

    /* renamed from: z  reason: collision with root package name */
    public final String f2407z;

    public bn(String str, long j10, String str2, String str3, String str4, Bundle bundle, boolean z10, long j11, String str5, int i10) {
        this.f2404w = str;
        this.f2405x = j10;
        this.f2406y = str2 == null ? "" : str2;
        this.f2407z = str3 == null ? "" : str3;
        this.A = str4 == null ? "" : str4;
        this.B = bundle == null ? new Bundle() : bundle;
        this.C = z10;
        this.D = j11;
        this.E = str5;
        this.F = i10;
    }

    public static bn p(Uri uri) {
        try {
            if ("gcache".equals(uri.getScheme())) {
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments.size() != 2) {
                    int size = pathSegments.size();
                    StringBuilder sb2 = new StringBuilder(62);
                    sb2.append("Expected 2 path parts for namespace and id, found :");
                    sb2.append(size);
                    uj0.f(sb2.toString());
                    return null;
                }
                String str = pathSegments.get(0);
                String str2 = pathSegments.get(1);
                String host = uri.getHost();
                String queryParameter = uri.getQueryParameter("url");
                boolean equals = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(uri.getQueryParameter("read_only"));
                String queryParameter2 = uri.getQueryParameter("expiration");
                long parseLong = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
                Bundle bundle = new Bundle();
                for (String str3 : uri.getQueryParameterNames()) {
                    if (str3.startsWith("tag.")) {
                        bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                    }
                }
                return new bn(queryParameter, parseLong, host, str, str2, bundle, equals, 0L, "", 0);
            }
            return null;
        } catch (NullPointerException | NumberFormatException e10) {
            uj0.g("Unable to parse Uri into cache offering.", e10);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.q(parcel, 2, this.f2404w, false);
        sh.b.n(parcel, 3, this.f2405x);
        sh.b.q(parcel, 4, this.f2406y, false);
        sh.b.q(parcel, 5, this.f2407z, false);
        sh.b.q(parcel, 6, this.A, false);
        sh.b.e(parcel, 7, this.B, false);
        sh.b.c(parcel, 8, this.C);
        sh.b.n(parcel, 9, this.D);
        sh.b.q(parcel, 10, this.E, false);
        sh.b.k(parcel, 11, this.F);
        sh.b.b(parcel, a10);
    }
}
