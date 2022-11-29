package jo;

import java.io.Serializable;

/* loaded from: classes4.dex */
public class a implements k, Serializable {
    public final boolean A;
    public final int B;
    public final int C;

    /* renamed from: w  reason: collision with root package name */
    public final Object f38121w;

    /* renamed from: x  reason: collision with root package name */
    public final Class f38122x;

    /* renamed from: y  reason: collision with root package name */
    public final String f38123y;

    /* renamed from: z  reason: collision with root package name */
    public final String f38124z;

    public a(int i10, Object obj, Class cls, String str, String str2, int i11) {
        this.f38121w = obj;
        this.f38122x = cls;
        this.f38123y = str;
        this.f38124z = str2;
        this.A = (i11 & 1) == 1;
        this.B = i10;
        this.C = i11 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.A == aVar.A && this.B == aVar.B && this.C == aVar.C && p.c(this.f38121w, aVar.f38121w) && p.c(this.f38122x, aVar.f38122x) && this.f38123y.equals(aVar.f38123y) && this.f38124z.equals(aVar.f38124z);
        }
        return false;
    }

    @Override // jo.k
    public int getArity() {
        return this.B;
    }

    public int hashCode() {
        Object obj = this.f38121w;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f38122x;
        return ((((((((((hashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.f38123y.hashCode()) * 31) + this.f38124z.hashCode()) * 31) + (this.A ? 1231 : 1237)) * 31) + this.B) * 31) + this.C;
    }

    public String toString() {
        return f0.g(this);
    }
}
