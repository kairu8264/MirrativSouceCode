package x0;

import io.l;
import io.p;
import jo.q;
import x0.f;

/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: w  reason: collision with root package name */
    public final f f59348w;

    /* renamed from: x  reason: collision with root package name */
    public final f f59349x;

    /* loaded from: classes.dex */
    public static final class a extends q implements p<String, f.b, String> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f59350w = new a();

        public a() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final String invoke(String str, f.b bVar) {
            jo.p.h(str, "acc");
            jo.p.h(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public c(f fVar, f fVar2) {
        jo.p.h(fVar, "outer");
        jo.p.h(fVar2, "inner");
        this.f59348w = fVar;
        this.f59349x = fVar2;
    }

    @Override // x0.f
    public boolean e(l<? super f.b, Boolean> lVar) {
        jo.p.h(lVar, "predicate");
        return this.f59348w.e(lVar) && this.f59349x.e(lVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (jo.p.c(this.f59348w, cVar.f59348w) && jo.p.c(this.f59349x, cVar.f59349x)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f59348w.hashCode() + (this.f59349x.hashCode() * 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x0.f
    public <R> R k(R r10, p<? super R, ? super f.b, ? extends R> pVar) {
        jo.p.h(pVar, "operation");
        return (R) this.f59349x.k(this.f59348w.k(r10, pVar), pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x0.f
    public <R> R o(R r10, p<? super f.b, ? super R, ? extends R> pVar) {
        jo.p.h(pVar, "operation");
        return (R) this.f59348w.o(this.f59349x.o(r10, pVar), pVar);
    }

    public String toString() {
        return '[' + ((String) k("", a.f59350w)) + ']';
    }
}
