package y1;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import d2.l;
import java.util.ArrayList;
import java.util.List;
import y1.a;

/* loaded from: classes.dex */
public final class e implements k {

    /* renamed from: a  reason: collision with root package name */
    public final y1.a f61080a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a.b<p>> f61081b;

    /* renamed from: c  reason: collision with root package name */
    public final wn.f f61082c;

    /* renamed from: d  reason: collision with root package name */
    public final wn.f f61083d;

    /* renamed from: e  reason: collision with root package name */
    public final List<j> f61084e;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<Float> {
        public a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Float invoke() {
            j jVar;
            k b10;
            List<j> f10 = e.this.f();
            if (f10.isEmpty()) {
                jVar = null;
            } else {
                j jVar2 = f10.get(0);
                float c10 = jVar2.b().c();
                int l10 = xn.s.l(f10);
                int i10 = 1;
                if (1 <= l10) {
                    while (true) {
                        j jVar3 = f10.get(i10);
                        float c11 = jVar3.b().c();
                        if (Float.compare(c10, c11) < 0) {
                            jVar2 = jVar3;
                            c10 = c11;
                        }
                        if (i10 == l10) {
                            break;
                        }
                        i10++;
                    }
                }
                jVar = jVar2;
            }
            j jVar4 = jVar;
            return Float.valueOf((jVar4 == null || (b10 = jVar4.b()) == null) ? 0.0f : b10.c());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.a<Float> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Float invoke() {
            j jVar;
            k b10;
            List<j> f10 = e.this.f();
            if (f10.isEmpty()) {
                jVar = null;
            } else {
                j jVar2 = f10.get(0);
                float a10 = jVar2.b().a();
                int l10 = xn.s.l(f10);
                int i10 = 1;
                if (1 <= l10) {
                    while (true) {
                        j jVar3 = f10.get(i10);
                        float a11 = jVar3.b().a();
                        if (Float.compare(a10, a11) < 0) {
                            jVar2 = jVar3;
                            a10 = a11;
                        }
                        if (i10 == l10) {
                            break;
                        }
                        i10++;
                    }
                }
                jVar = jVar2;
            }
            j jVar4 = jVar;
            return Float.valueOf((jVar4 == null || (b10 = jVar4.b()) == null) ? 0.0f : b10.a());
        }
    }

    public e(y1.a aVar, d0 d0Var, List<a.b<p>> list, m2.d dVar, l.b bVar) {
        y1.a i10;
        List b10;
        y1.a aVar2 = aVar;
        jo.p.h(aVar2, "annotatedString");
        jo.p.h(d0Var, TtmlNode.TAG_STYLE);
        jo.p.h(list, "placeholders");
        jo.p.h(dVar, "density");
        jo.p.h(bVar, "fontFamilyResolver");
        this.f61080a = aVar2;
        this.f61081b = list;
        wn.i iVar = wn.i.NONE;
        this.f61082c = wn.g.b(iVar, new b());
        this.f61083d = wn.g.b(iVar, new a());
        n D = d0Var.D();
        List<a.b<n>> h10 = y1.b.h(aVar2, D);
        ArrayList arrayList = new ArrayList(h10.size());
        int size = h10.size();
        int i11 = 0;
        while (i11 < size) {
            a.b<n> bVar2 = h10.get(i11);
            i10 = y1.b.i(aVar2, bVar2.f(), bVar2.d());
            n h11 = h(bVar2.e(), D);
            String g10 = i10.g();
            d0 B = d0Var.B(h11);
            List<a.b<v>> e10 = i10.e();
            b10 = f.b(g(), bVar2.f(), bVar2.d());
            arrayList.add(new j(l.a(g10, B, e10, b10, dVar, bVar), bVar2.f(), bVar2.d()));
            i11++;
            aVar2 = aVar;
        }
        this.f61084e = arrayList;
    }

    @Override // y1.k
    public float a() {
        return ((Number) this.f61082c.getValue()).floatValue();
    }

    @Override // y1.k
    public boolean b() {
        List<j> list = this.f61084e;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (list.get(i10).b().b()) {
                return true;
            }
        }
        return false;
    }

    @Override // y1.k
    public float c() {
        return ((Number) this.f61083d.getValue()).floatValue();
    }

    public final y1.a e() {
        return this.f61080a;
    }

    public final List<j> f() {
        return this.f61084e;
    }

    public final List<a.b<p>> g() {
        return this.f61081b;
    }

    public final n h(n nVar, n nVar2) {
        j2.g g10 = nVar.g();
        if (g10 != null) {
            g10.l();
            return nVar;
        }
        return n.b(nVar, null, nVar2.g(), 0L, null, 13, null);
    }
}
