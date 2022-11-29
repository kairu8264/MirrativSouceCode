package c1;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import c1.r;

/* loaded from: classes.dex */
public final class a {
    public static final BlendMode a(int i10) {
        r.a aVar = r.f18740b;
        return r.G(i10, aVar.a()) ? BlendMode.CLEAR : r.G(i10, aVar.x()) ? BlendMode.SRC : r.G(i10, aVar.g()) ? BlendMode.DST : r.G(i10, aVar.B()) ? BlendMode.SRC_OVER : r.G(i10, aVar.k()) ? BlendMode.DST_OVER : r.G(i10, aVar.z()) ? BlendMode.SRC_IN : r.G(i10, aVar.i()) ? BlendMode.DST_IN : r.G(i10, aVar.A()) ? BlendMode.SRC_OUT : r.G(i10, aVar.j()) ? BlendMode.DST_OUT : r.G(i10, aVar.y()) ? BlendMode.SRC_ATOP : r.G(i10, aVar.h()) ? BlendMode.DST_ATOP : r.G(i10, aVar.C()) ? BlendMode.XOR : r.G(i10, aVar.t()) ? BlendMode.PLUS : r.G(i10, aVar.q()) ? BlendMode.MODULATE : r.G(i10, aVar.v()) ? BlendMode.SCREEN : r.G(i10, aVar.s()) ? BlendMode.OVERLAY : r.G(i10, aVar.e()) ? BlendMode.DARKEN : r.G(i10, aVar.o()) ? BlendMode.LIGHTEN : r.G(i10, aVar.d()) ? BlendMode.COLOR_DODGE : r.G(i10, aVar.c()) ? BlendMode.COLOR_BURN : r.G(i10, aVar.m()) ? BlendMode.HARD_LIGHT : r.G(i10, aVar.w()) ? BlendMode.SOFT_LIGHT : r.G(i10, aVar.f()) ? BlendMode.DIFFERENCE : r.G(i10, aVar.l()) ? BlendMode.EXCLUSION : r.G(i10, aVar.r()) ? BlendMode.MULTIPLY : r.G(i10, aVar.n()) ? BlendMode.HUE : r.G(i10, aVar.u()) ? BlendMode.SATURATION : r.G(i10, aVar.b()) ? BlendMode.COLOR : r.G(i10, aVar.p()) ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final PorterDuff.Mode b(int i10) {
        r.a aVar = r.f18740b;
        if (r.G(i10, aVar.a())) {
            return PorterDuff.Mode.CLEAR;
        }
        if (r.G(i10, aVar.x())) {
            return PorterDuff.Mode.SRC;
        }
        if (r.G(i10, aVar.g())) {
            return PorterDuff.Mode.DST;
        }
        if (r.G(i10, aVar.B())) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (r.G(i10, aVar.k())) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (r.G(i10, aVar.z())) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (r.G(i10, aVar.i())) {
            return PorterDuff.Mode.DST_IN;
        }
        if (r.G(i10, aVar.A())) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (r.G(i10, aVar.j())) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (r.G(i10, aVar.y())) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (r.G(i10, aVar.h())) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (r.G(i10, aVar.C())) {
            return PorterDuff.Mode.XOR;
        }
        if (r.G(i10, aVar.t())) {
            return PorterDuff.Mode.ADD;
        }
        if (r.G(i10, aVar.v())) {
            return PorterDuff.Mode.SCREEN;
        }
        if (r.G(i10, aVar.s())) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (r.G(i10, aVar.e())) {
            return PorterDuff.Mode.DARKEN;
        }
        if (r.G(i10, aVar.o())) {
            return PorterDuff.Mode.LIGHTEN;
        }
        if (r.G(i10, aVar.q())) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
