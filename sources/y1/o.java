package y1;

import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final long f61105a = m2.r.f40540b.a();

    public static final n a(n nVar, m2.q qVar) {
        jo.p.h(nVar, TtmlNode.TAG_STYLE);
        jo.p.h(qVar, "direction");
        j2.e f10 = nVar.f();
        j2.e g10 = j2.e.g(f10 != null ? f10.m() : j2.e.f37075b.f());
        j2.g f11 = j2.g.f(e0.d(qVar, nVar.g()));
        long c10 = m2.s.e(nVar.c()) ? f61105a : nVar.c();
        j2.j h10 = nVar.h();
        if (h10 == null) {
            h10 = j2.j.f37103c.a();
        }
        return new n(g10, f11, c10, h10, nVar.e(), nVar.d(), null);
    }
}
