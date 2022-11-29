package e2;

/* loaded from: classes.dex */
public final class y implements d {

    /* renamed from: a  reason: collision with root package name */
    public final y1.a f30164a;

    /* renamed from: b  reason: collision with root package name */
    public final int f30165b;

    public y(y1.a aVar, int i10) {
        jo.p.h(aVar, "annotatedString");
        this.f30164a = aVar;
        this.f30165b = i10;
    }

    @Override // e2.d
    public void a(g gVar) {
        jo.p.h(gVar, "buffer");
        if (gVar.l()) {
            int f10 = gVar.f();
            gVar.m(gVar.f(), gVar.e(), b());
            if (b().length() > 0) {
                gVar.n(f10, b().length() + f10);
            }
        } else {
            int k10 = gVar.k();
            gVar.m(gVar.k(), gVar.j(), b());
            if (b().length() > 0) {
                gVar.n(k10, b().length() + k10);
            }
        }
        int g10 = gVar.g();
        int i10 = this.f30165b;
        gVar.o(po.n.m(i10 > 0 ? (g10 + i10) - 1 : (g10 + i10) - b().length(), 0, gVar.h()));
    }

    public final String b() {
        return this.f30164a.g();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            return jo.p.c(b(), yVar.b()) && this.f30165b == yVar.f30165b;
        }
        return false;
    }

    public int hashCode() {
        return (b().hashCode() * 31) + this.f30165b;
    }

    public String toString() {
        return "SetComposingTextCommand(text='" + b() + "', newCursorPosition=" + this.f30165b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(String str, int i10) {
        this(new y1.a(str, null, null, 6, null), i10);
        jo.p.h(str, "text");
    }
}
