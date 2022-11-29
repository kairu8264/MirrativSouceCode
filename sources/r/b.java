package r;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* loaded from: classes.dex */
public class b implements e {
    @Override // r.e
    public void a(d dVar, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        dVar.b(new f(colorStateList, f10));
        View g10 = dVar.g();
        g10.setClipToOutline(true);
        g10.setElevation(f11);
        n(dVar, f12);
    }

    @Override // r.e
    public float b(d dVar) {
        return l(dVar) * 2.0f;
    }

    @Override // r.e
    public void c(d dVar, float f10) {
        dVar.g().setElevation(f10);
    }

    @Override // r.e
    public void d(d dVar) {
        n(dVar, j(dVar));
    }

    @Override // r.e
    public void e(d dVar) {
        n(dVar, j(dVar));
    }

    @Override // r.e
    public void f(d dVar, float f10) {
        p(dVar).h(f10);
    }

    @Override // r.e
    public void g(d dVar) {
        if (!dVar.c()) {
            dVar.a(0, 0, 0, 0);
            return;
        }
        float j10 = j(dVar);
        float l10 = l(dVar);
        int ceil = (int) Math.ceil(g.c(j10, l10, dVar.f()));
        int ceil2 = (int) Math.ceil(g.d(j10, l10, dVar.f()));
        dVar.a(ceil, ceil2, ceil, ceil2);
    }

    @Override // r.e
    public ColorStateList h(d dVar) {
        return p(dVar).b();
    }

    @Override // r.e
    public float i(d dVar) {
        return dVar.g().getElevation();
    }

    @Override // r.e
    public float j(d dVar) {
        return p(dVar).c();
    }

    @Override // r.e
    public float k(d dVar) {
        return l(dVar) * 2.0f;
    }

    @Override // r.e
    public float l(d dVar) {
        return p(dVar).d();
    }

    @Override // r.e
    public void m() {
    }

    @Override // r.e
    public void n(d dVar, float f10) {
        p(dVar).g(f10, dVar.c(), dVar.f());
        g(dVar);
    }

    @Override // r.e
    public void o(d dVar, ColorStateList colorStateList) {
        p(dVar).f(colorStateList);
    }

    public final f p(d dVar) {
        return (f) dVar.d();
    }
}
