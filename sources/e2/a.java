package e2;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final y1.a f30055a;

    /* renamed from: b  reason: collision with root package name */
    public final int f30056b;

    public a(y1.a aVar, int i10) {
        jo.p.h(aVar, "annotatedString");
        this.f30055a = aVar;
        this.f30056b = i10;
    }

    @Override // e2.d
    public void a(g gVar) {
        jo.p.h(gVar, "buffer");
        if (gVar.l()) {
            gVar.m(gVar.f(), gVar.e(), b());
        } else {
            gVar.m(gVar.k(), gVar.j(), b());
        }
        int g10 = gVar.g();
        int i10 = this.f30056b;
        gVar.o(po.n.m(i10 > 0 ? (g10 + i10) - 1 : (g10 + i10) - b().length(), 0, gVar.h()));
    }

    public final String b() {
        return this.f30055a.g();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return jo.p.c(b(), aVar.b()) && this.f30056b == aVar.f30056b;
        }
        return false;
    }

    public int hashCode() {
        return (b().hashCode() * 31) + this.f30056b;
    }

    public String toString() {
        return "CommitTextCommand(text='" + b() + "', newCursorPosition=" + this.f30056b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String str, int i10) {
        this(new y1.a(str, null, null, 6, null), i10);
        jo.p.h(str, "text");
    }
}
