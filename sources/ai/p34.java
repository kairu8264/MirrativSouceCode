package ai;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class p34 {

    /* renamed from: a  reason: collision with root package name */
    public final String f8289a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8290b;

    public p34(String str, String str2) {
        this.f8289a = str;
        this.f8290b = str2;
    }

    public final String a() {
        return this.f8289a;
    }

    public final String b() {
        return this.f8290b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p34.class == obj.getClass()) {
            p34 p34Var = (p34) obj;
            if (TextUtils.equals(this.f8289a, p34Var.f8289a) && TextUtils.equals(this.f8290b, p34Var.f8290b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f8289a.hashCode() * 31) + this.f8290b.hashCode();
    }

    public final String toString() {
        String str = this.f8289a;
        String str2 = this.f8290b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length());
        sb2.append("Header[name=");
        sb2.append(str);
        sb2.append(",value=");
        sb2.append(str2);
        sb2.append("]");
        return sb2.toString();
    }
}
