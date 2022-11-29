package d6;

import a6.q;
import jo.p;

/* loaded from: classes.dex */
public final class l extends g {

    /* renamed from: a  reason: collision with root package name */
    public final q f29229a;

    /* renamed from: b  reason: collision with root package name */
    public final String f29230b;

    /* renamed from: c  reason: collision with root package name */
    public final a6.d f29231c;

    public l(q qVar, String str, a6.d dVar) {
        super(null);
        this.f29229a = qVar;
        this.f29230b = str;
        this.f29231c = dVar;
    }

    public final a6.d a() {
        return this.f29231c;
    }

    public final q b() {
        return this.f29229a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (p.c(this.f29229a, lVar.f29229a) && p.c(this.f29230b, lVar.f29230b) && this.f29231c == lVar.f29231c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f29229a.hashCode() * 31;
        String str = this.f29230b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f29231c.hashCode();
    }
}
