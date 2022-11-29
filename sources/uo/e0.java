package uo;

/* loaded from: classes4.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f56009a;

    /* renamed from: b  reason: collision with root package name */
    public final io.l<Throwable, wn.v> f56010b;

    /* JADX WARN: Multi-variable type inference failed */
    public e0(Object obj, io.l<? super Throwable, wn.v> lVar) {
        this.f56009a = obj;
        this.f56010b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            return jo.p.c(this.f56009a, e0Var.f56009a) && jo.p.c(this.f56010b, e0Var.f56010b);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f56009a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f56010b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f56009a + ", onCancellation=" + this.f56010b + ')';
    }
}
