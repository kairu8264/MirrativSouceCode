package h2;

import android.text.Spannable;
import b2.h;
import java.util.List;
import m2.r;
import m2.t;
import y1.a;
import y1.p;
import y1.q;

/* loaded from: classes.dex */
public final class c {
    public static final int a(long j10) {
        long g10 = r.g(j10);
        t.a aVar = t.f40544b;
        if (t.g(g10, aVar.b())) {
            return 0;
        }
        return t.g(g10, aVar.a()) ? 1 : 2;
    }

    public static final int b(int i10) {
        q.a aVar = q.f61109a;
        if (q.i(i10, aVar.a())) {
            return 0;
        }
        if (q.i(i10, aVar.g())) {
            return 1;
        }
        if (q.i(i10, aVar.b())) {
            return 2;
        }
        if (q.i(i10, aVar.c())) {
            return 3;
        }
        if (q.i(i10, aVar.f())) {
            return 4;
        }
        if (q.i(i10, aVar.d())) {
            return 5;
        }
        if (q.i(i10, aVar.e())) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign".toString());
    }

    public static final void c(Spannable spannable, p pVar, int i10, int i11, m2.d dVar) {
        e.r(spannable, new h(r.h(pVar.c()), a(pVar.c()), r.h(pVar.a()), a(pVar.a()), dVar.G0() * dVar.getDensity(), b(pVar.b())), i10, i11);
    }

    public static final void d(Spannable spannable, List<a.b<p>> list, m2.d dVar) {
        jo.p.h(spannable, "<this>");
        jo.p.h(list, "placeholders");
        jo.p.h(dVar, "density");
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a.b<p> bVar = list.get(i10);
            c(spannable, bVar.a(), bVar.b(), bVar.c(), dVar);
        }
    }
}
