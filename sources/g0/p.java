package g0;

/* loaded from: classes.dex */
public final class p {
    public static final boolean a(b1.h hVar, long j10) {
        jo.p.h(hVar, "$this$containsInclusive");
        float i10 = hVar.i();
        float j11 = hVar.j();
        float m10 = b1.f.m(j10);
        if (i10 <= m10 && m10 <= j11) {
            float l10 = hVar.l();
            float e10 = hVar.e();
            float n10 = b1.f.n(j10);
            if (l10 <= n10 && n10 <= e10) {
                return true;
            }
        }
        return false;
    }

    public static final b1.h b(q1.q qVar) {
        jo.p.h(qVar, "<this>");
        b1.h c10 = q1.r.c(qVar);
        return b1.i.a(qVar.q(c10.m()), qVar.q(c10.f()));
    }
}
