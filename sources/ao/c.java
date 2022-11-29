package ao;

import ao.g;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import io.p;
import java.io.Serializable;
import jo.q;

/* loaded from: classes4.dex */
public final class c implements g, Serializable {

    /* renamed from: w  reason: collision with root package name */
    public final g f16645w;

    /* renamed from: x  reason: collision with root package name */
    public final g.b f16646x;

    /* loaded from: classes4.dex */
    public static final class a extends q implements p<String, g.b, String> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f16647w = new a();

        public a() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final String invoke(String str, g.b bVar) {
            jo.p.h(str, "acc");
            jo.p.h(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public c(g gVar, g.b bVar) {
        jo.p.h(gVar, TtmlNode.LEFT);
        jo.p.h(bVar, "element");
        this.f16645w = gVar;
        this.f16646x = bVar;
    }

    public final boolean b(g.b bVar) {
        return jo.p.c(get(bVar.getKey()), bVar);
    }

    public final boolean d(c cVar) {
        while (b(cVar.f16646x)) {
            g gVar = cVar.f16645w;
            if (gVar instanceof c) {
                cVar = (c) gVar;
            } else {
                jo.p.f(gVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return b((g.b) gVar);
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f() != f() || !cVar.d(this)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int f() {
        int i10 = 2;
        c cVar = this;
        while (true) {
            g gVar = cVar.f16645w;
            cVar = gVar instanceof c ? (c) gVar : null;
            if (cVar == null) {
                return i10;
            }
            i10++;
        }
    }

    @Override // ao.g
    public <R> R fold(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        jo.p.h(pVar, "operation");
        return pVar.invoke((Object) this.f16645w.fold(r10, pVar), this.f16646x);
    }

    @Override // ao.g
    public <E extends g.b> E get(g.c<E> cVar) {
        jo.p.h(cVar, "key");
        c cVar2 = this;
        while (true) {
            E e10 = (E) cVar2.f16646x.get(cVar);
            if (e10 != null) {
                return e10;
            }
            g gVar = cVar2.f16645w;
            if (gVar instanceof c) {
                cVar2 = (c) gVar;
            } else {
                return (E) gVar.get(cVar);
            }
        }
    }

    public int hashCode() {
        return this.f16645w.hashCode() + this.f16646x.hashCode();
    }

    @Override // ao.g
    public g minusKey(g.c<?> cVar) {
        jo.p.h(cVar, "key");
        if (this.f16646x.get(cVar) != null) {
            return this.f16645w;
        }
        g minusKey = this.f16645w.minusKey(cVar);
        return minusKey == this.f16645w ? this : minusKey == h.f16651w ? this.f16646x : new c(minusKey, this.f16646x);
    }

    @Override // ao.g
    public g plus(g gVar) {
        return g.a.a(this, gVar);
    }

    public String toString() {
        return '[' + ((String) fold("", a.f16647w)) + ']';
    }
}
