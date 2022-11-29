package ai;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class qo {

    /* renamed from: a  reason: collision with root package name */
    public final String f9019a;

    /* renamed from: b  reason: collision with root package name */
    public final v4 f9020b;

    /* renamed from: c  reason: collision with root package name */
    public final v4 f9021c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9022d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9023e;

    public qo(String str, v4 v4Var, v4 v4Var2, int i10, int i11) {
        boolean z10 = false;
        if (i10 != 0) {
            i11 = i11 == 0 ? 0 : i11;
            u9.a(z10);
            u9.f(str);
            this.f9019a = str;
            Objects.requireNonNull(v4Var);
            this.f9020b = v4Var;
            Objects.requireNonNull(v4Var2);
            this.f9021c = v4Var2;
            this.f9022d = i10;
            this.f9023e = i11;
        }
        z10 = true;
        u9.a(z10);
        u9.f(str);
        this.f9019a = str;
        Objects.requireNonNull(v4Var);
        this.f9020b = v4Var;
        Objects.requireNonNull(v4Var2);
        this.f9021c = v4Var2;
        this.f9022d = i10;
        this.f9023e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qo.class == obj.getClass()) {
            qo qoVar = (qo) obj;
            if (this.f9022d == qoVar.f9022d && this.f9023e == qoVar.f9023e && this.f9019a.equals(qoVar.f9019a) && this.f9020b.equals(qoVar.f9020b) && this.f9021c.equals(qoVar.f9021c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f9022d + 527) * 31) + this.f9023e) * 31) + this.f9019a.hashCode()) * 31) + this.f9020b.hashCode()) * 31) + this.f9021c.hashCode();
    }
}
