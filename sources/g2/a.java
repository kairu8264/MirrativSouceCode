package g2;

import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import d2.l;
import d2.u;
import d2.x;
import d2.y;
import j2.f;
import java.util.List;
import jo.p;
import y1.a;
import y1.f0;
import y1.v;

/* loaded from: classes.dex */
public final class a {
    public static final void a(SpannableString spannableString, v vVar, int i10, int i11, m2.d dVar, l.b bVar) {
        h2.e.i(spannableString, vVar.f(), i10, i11);
        h2.e.l(spannableString, vVar.i(), dVar, i10, i11);
        if (vVar.l() != null || vVar.j() != null) {
            x l10 = vVar.l();
            if (l10 == null) {
                l10 = x.f29149x.d();
            }
            u j10 = vVar.j();
            spannableString.setSpan(new StyleSpan(d2.f.c(l10, j10 != null ? j10.i() : u.f29139b.b())), i10, i11, 33);
        }
        if (vVar.g() != null) {
            if (vVar.g() instanceof y) {
                spannableString.setSpan(new TypefaceSpan(((y) vVar.g()).f()), i10, i11, 33);
            } else if (Build.VERSION.SDK_INT >= 28) {
                d2.l g10 = vVar.g();
                d2.v k10 = vVar.k();
                spannableString.setSpan(j.f32605a.a((Typeface) l.b.b(bVar, g10, null, 0, k10 != null ? k10.m() : d2.v.f29143b.a(), 6, null).getValue()), i10, i11, 33);
            }
        }
        if (vVar.q() != null) {
            j2.f q10 = vVar.q();
            f.a aVar = j2.f.f37083b;
            if (q10.d(aVar.d())) {
                spannableString.setSpan(new UnderlineSpan(), i10, i11, 33);
            }
            if (vVar.q().d(aVar.b())) {
                spannableString.setSpan(new StrikethroughSpan(), i10, i11, 33);
            }
        }
        if (vVar.s() != null) {
            spannableString.setSpan(new ScaleXSpan(vVar.s().b()), i10, i11, 33);
        }
        h2.e.p(spannableString, vVar.n(), i10, i11);
        h2.e.f(spannableString, vVar.c(), i10, i11);
    }

    public static final SpannableString b(y1.a aVar, m2.d dVar, l.b bVar) {
        v a10;
        p.h(aVar, "<this>");
        p.h(dVar, "density");
        p.h(bVar, "fontFamilyResolver");
        SpannableString spannableString = new SpannableString(aVar.g());
        List<a.b<v>> e10 = aVar.e();
        int size = e10.size();
        for (int i10 = 0; i10 < size; i10++) {
            a.b<v> bVar2 = e10.get(i10);
            int b10 = bVar2.b();
            int c10 = bVar2.c();
            a10 = r14.a((r35 & 1) != 0 ? r14.f() : 0L, (r35 & 2) != 0 ? r14.f61174b : 0L, (r35 & 4) != 0 ? r14.f61175c : null, (r35 & 8) != 0 ? r14.f61176d : null, (r35 & 16) != 0 ? r14.f61177e : null, (r35 & 32) != 0 ? r14.f61178f : null, (r35 & 64) != 0 ? r14.f61179g : null, (r35 & 128) != 0 ? r14.f61180h : 0L, (r35 & 256) != 0 ? r14.f61181i : null, (r35 & 512) != 0 ? r14.f61182j : null, (r35 & 1024) != 0 ? r14.f61183k : null, (r35 & 2048) != 0 ? r14.f61184l : 0L, (r35 & 4096) != 0 ? r14.f61185m : null, (r35 & 8192) != 0 ? bVar2.a().f61186n : null);
            a(spannableString, a10, b10, c10, dVar, bVar);
        }
        List<a.b<f0>> h10 = aVar.h(0, aVar.length());
        int size2 = h10.size();
        for (int i11 = 0; i11 < size2; i11++) {
            a.b<f0> bVar3 = h10.get(i11);
            spannableString.setSpan(h2.g.a(bVar3.a()), bVar3.b(), bVar3.c(), 33);
        }
        return spannableString;
    }
}
