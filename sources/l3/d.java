package l3;

import android.util.Base64;
import java.util.List;
import n3.h;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f39512a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39513b;

    /* renamed from: c  reason: collision with root package name */
    public final String f39514c;

    /* renamed from: d  reason: collision with root package name */
    public final List<List<byte[]>> f39515d;

    /* renamed from: e  reason: collision with root package name */
    public final int f39516e;

    /* renamed from: f  reason: collision with root package name */
    public final String f39517f;

    public d(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f39512a = (String) h.g(str);
        this.f39513b = (String) h.g(str2);
        this.f39514c = (String) h.g(str3);
        this.f39515d = (List) h.g(list);
        this.f39516e = 0;
        this.f39517f = a(str, str2, str3);
    }

    public final String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List<List<byte[]>> b() {
        return this.f39515d;
    }

    public int c() {
        return this.f39516e;
    }

    public String d() {
        return this.f39517f;
    }

    public String e() {
        return this.f39512a;
    }

    public String f() {
        return this.f39513b;
    }

    public String g() {
        return this.f39514c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f39512a + ", mProviderPackage: " + this.f39513b + ", mQuery: " + this.f39514c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f39515d.size(); i10++) {
            sb2.append(" [");
            List<byte[]> list = this.f39515d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f39516e);
        return sb2.toString();
    }

    public d(String str, String str2, String str3, int i10) {
        this.f39512a = (String) h.g(str);
        this.f39513b = (String) h.g(str2);
        this.f39514c = (String) h.g(str3);
        this.f39515d = null;
        h.a(i10 != 0);
        this.f39516e = i10;
        this.f39517f = a(str, str2, str3);
    }
}
