package uo;

/* loaded from: classes4.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f55991a;

    /* renamed from: b  reason: collision with root package name */
    public final n f55992b;

    /* renamed from: c  reason: collision with root package name */
    public final io.l<Throwable, wn.v> f55993c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f55994d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f55995e;

    /* JADX WARN: Multi-variable type inference failed */
    public c0(Object obj, n nVar, io.l<? super Throwable, wn.v> lVar, Object obj2, Throwable th2) {
        this.f55991a = obj;
        this.f55992b = nVar;
        this.f55993c = lVar;
        this.f55994d = obj2;
        this.f55995e = th2;
    }

    public static /* synthetic */ c0 b(c0 c0Var, Object obj, n nVar, io.l lVar, Object obj2, Throwable th2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = c0Var.f55991a;
        }
        if ((i10 & 2) != 0) {
            nVar = c0Var.f55992b;
        }
        n nVar2 = nVar;
        io.l<Throwable, wn.v> lVar2 = lVar;
        if ((i10 & 4) != 0) {
            lVar2 = c0Var.f55993c;
        }
        io.l lVar3 = lVar2;
        if ((i10 & 8) != 0) {
            obj2 = c0Var.f55994d;
        }
        Object obj4 = obj2;
        if ((i10 & 16) != 0) {
            th2 = c0Var.f55995e;
        }
        return c0Var.a(obj, nVar2, lVar3, obj4, th2);
    }

    public final c0 a(Object obj, n nVar, io.l<? super Throwable, wn.v> lVar, Object obj2, Throwable th2) {
        return new c0(obj, nVar, lVar, obj2, th2);
    }

    public final boolean c() {
        return this.f55995e != null;
    }

    public final void d(q<?> qVar, Throwable th2) {
        n nVar = this.f55992b;
        if (nVar != null) {
            qVar.l(nVar, th2);
        }
        io.l<Throwable, wn.v> lVar = this.f55993c;
        if (lVar == null) {
            return;
        }
        qVar.m(lVar, th2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            return jo.p.c(this.f55991a, c0Var.f55991a) && jo.p.c(this.f55992b, c0Var.f55992b) && jo.p.c(this.f55993c, c0Var.f55993c) && jo.p.c(this.f55994d, c0Var.f55994d) && jo.p.c(this.f55995e, c0Var.f55995e);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f55991a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        n nVar = this.f55992b;
        int hashCode2 = (hashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        io.l<Throwable, wn.v> lVar = this.f55993c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f55994d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f55995e;
        return hashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f55991a + ", cancelHandler=" + this.f55992b + ", onCancellation=" + this.f55993c + ", idempotentResume=" + this.f55994d + ", cancelCause=" + this.f55995e + ')';
    }

    public /* synthetic */ c0(Object obj, n nVar, io.l lVar, Object obj2, Throwable th2, int i10, jo.h hVar) {
        this(obj, (i10 & 2) != 0 ? null : nVar, (i10 & 4) != 0 ? null : lVar, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th2);
    }
}
