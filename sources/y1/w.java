package y1;

import c1.c0;
import c1.f1;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final long f61188a = m2.s.d(14);

    /* renamed from: b  reason: collision with root package name */
    public static final long f61189b = m2.s.d(0);

    /* renamed from: c  reason: collision with root package name */
    public static final long f61190c;

    /* renamed from: d  reason: collision with root package name */
    public static final long f61191d;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<j2.h> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f61192w = new a();

        public a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final j2.h invoke() {
            return j2.h.f37095a.a(w.f61191d);
        }
    }

    static {
        c0.a aVar = c1.c0.f18634b;
        f61190c = aVar.d();
        f61191d = aVar.a();
    }

    public static final v b(v vVar) {
        long m10;
        jo.p.h(vVar, TtmlNode.TAG_STYLE);
        j2.h b10 = vVar.r().b(a.f61192w);
        long i10 = m2.s.e(vVar.i()) ? f61188a : vVar.i();
        d2.x l10 = vVar.l();
        if (l10 == null) {
            l10 = d2.x.f29149x.d();
        }
        d2.x xVar = l10;
        d2.u j10 = vVar.j();
        d2.u c10 = d2.u.c(j10 != null ? j10.i() : d2.u.f29139b.b());
        d2.v k10 = vVar.k();
        d2.v e10 = d2.v.e(k10 != null ? k10.m() : d2.v.f29143b.a());
        d2.l g10 = vVar.g();
        if (g10 == null) {
            g10 = d2.l.f29100x.a();
        }
        d2.l lVar = g10;
        String h10 = vVar.h();
        if (h10 == null) {
            h10 = "";
        }
        String str = h10;
        if (m2.s.e(vVar.m())) {
            m10 = f61189b;
        } else {
            m10 = vVar.m();
        }
        long j11 = m10;
        j2.a d10 = vVar.d();
        j2.a b11 = j2.a.b(d10 != null ? d10.h() : j2.a.f37055b.a());
        j2.i s10 = vVar.s();
        if (s10 == null) {
            s10 = j2.i.f37099c.a();
        }
        j2.i iVar = s10;
        f2.f n10 = vVar.n();
        if (n10 == null) {
            n10 = f2.f.f31707y.a();
        }
        f2.f fVar = n10;
        long c11 = vVar.c();
        if (!(c11 != c1.c0.f18634b.e())) {
            c11 = f61190c;
        }
        long j12 = c11;
        j2.f q10 = vVar.q();
        if (q10 == null) {
            q10 = j2.f.f37083b.c();
        }
        j2.f fVar2 = q10;
        f1 p10 = vVar.p();
        if (p10 == null) {
            p10 = f1.f18663d.a();
        }
        return new v(b10, i10, xVar, c10, e10, lVar, str, j11, b11, iVar, fVar, j12, fVar2, p10, vVar.o(), (jo.h) null);
    }
}
