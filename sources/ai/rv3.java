package ai;

/* loaded from: classes3.dex */
public class rv3 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f9603a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9604b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9605c;

    /* renamed from: d  reason: collision with root package name */
    public final long f9606d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9607e;

    public rv3(rv3 rv3Var) {
        this.f9603a = rv3Var.f9603a;
        this.f9604b = rv3Var.f9604b;
        this.f9605c = rv3Var.f9605c;
        this.f9606d = rv3Var.f9606d;
        this.f9607e = rv3Var.f9607e;
    }

    public rv3(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    public rv3(Object obj, int i10, int i11, long j10, int i12) {
        this.f9603a = obj;
        this.f9604b = i10;
        this.f9605c = i11;
        this.f9606d = j10;
        this.f9607e = i12;
    }

    public final rv3 a(Object obj) {
        return this.f9603a.equals(obj) ? this : new rv3(obj, this.f9604b, this.f9605c, this.f9606d, this.f9607e);
    }

    public final boolean b() {
        return this.f9604b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rv3) {
            rv3 rv3Var = (rv3) obj;
            return this.f9603a.equals(rv3Var.f9603a) && this.f9604b == rv3Var.f9604b && this.f9605c == rv3Var.f9605c && this.f9606d == rv3Var.f9606d && this.f9607e == rv3Var.f9607e;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f9603a.hashCode() + 527) * 31) + this.f9604b) * 31) + this.f9605c) * 31) + ((int) this.f9606d)) * 31) + this.f9607e;
    }

    public rv3(Object obj, long j10) {
        this(obj, -1, -1, -1L, -1);
    }

    public rv3(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }
}
