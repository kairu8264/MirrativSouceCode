package p4;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class e implements c {

    /* renamed from: a  reason: collision with root package name */
    public String f45779a;

    /* renamed from: b  reason: collision with root package name */
    public int f45780b;

    /* renamed from: c  reason: collision with root package name */
    public int f45781c;

    public e(String str, int i10, int i11) {
        this.f45779a = str;
        this.f45780b = i10;
        this.f45781c = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return (this.f45780b < 0 || eVar.f45780b < 0) ? TextUtils.equals(this.f45779a, eVar.f45779a) && this.f45781c == eVar.f45781c : TextUtils.equals(this.f45779a, eVar.f45779a) && this.f45780b == eVar.f45780b && this.f45781c == eVar.f45781c;
        }
        return false;
    }

    public int hashCode() {
        return n3.c.b(this.f45779a, Integer.valueOf(this.f45781c));
    }
}
