package c1;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import c1.j1;
import c1.k1;

/* loaded from: classes.dex */
public final class i {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18688a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f18689b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f18690c;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            iArr[Paint.Style.STROKE.ordinal()] = 1;
            f18688a = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            f18689b = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            iArr3[Paint.Join.MITER.ordinal()] = 1;
            iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            iArr3[Paint.Join.ROUND.ordinal()] = 3;
            f18690c = iArr3;
        }
    }

    public static final s0 a() {
        return new h();
    }

    public static final float b(Paint paint) {
        jo.p.h(paint, "<this>");
        return paint.getAlpha() / 255.0f;
    }

    public static final long c(Paint paint) {
        jo.p.h(paint, "<this>");
        return e0.b(paint.getColor());
    }

    public static final int d(Paint paint) {
        jo.p.h(paint, "<this>");
        if (!paint.isFilterBitmap()) {
            return f0.f18658a.b();
        }
        return f0.f18658a.a();
    }

    public static final int e(Paint paint) {
        jo.p.h(paint, "<this>");
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i10 = strokeCap == null ? -1 : a.f18689b[strokeCap.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return j1.f18697b.a();
                }
                return j1.f18697b.c();
            }
            return j1.f18697b.b();
        }
        return j1.f18697b.a();
    }

    public static final int f(Paint paint) {
        jo.p.h(paint, "<this>");
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i10 = strokeJoin == null ? -1 : a.f18690c[strokeJoin.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return k1.f18705b.b();
                }
                return k1.f18705b.c();
            }
            return k1.f18705b.a();
        }
        return k1.f18705b.b();
    }

    public static final float g(Paint paint) {
        jo.p.h(paint, "<this>");
        return paint.getStrokeMiter();
    }

    public static final float h(Paint paint) {
        jo.p.h(paint, "<this>");
        return paint.getStrokeWidth();
    }

    public static final Paint i() {
        return new Paint(7);
    }

    public static final void j(Paint paint, float f10) {
        jo.p.h(paint, "<this>");
        paint.setAlpha((int) Math.rint(f10 * 255.0f));
    }

    public static final void k(Paint paint, int i10) {
        jo.p.h(paint, "$this$setNativeBlendMode");
        if (Build.VERSION.SDK_INT >= 29) {
            p1.f18734a.a(paint, i10);
        } else {
            paint.setXfermode(new PorterDuffXfermode(c1.a.b(i10)));
        }
    }

    public static final void l(Paint paint, long j10) {
        jo.p.h(paint, "$this$setNativeColor");
        paint.setColor(e0.i(j10));
    }

    public static final void m(Paint paint, d0 d0Var) {
        jo.p.h(paint, "<this>");
        paint.setColorFilter(d0Var != null ? d.b(d0Var) : null);
    }

    public static final void n(Paint paint, int i10) {
        jo.p.h(paint, "$this$setNativeFilterQuality");
        paint.setFilterBitmap(!f0.d(i10, f0.f18658a.b()));
    }

    public static final void o(Paint paint, v0 v0Var) {
        jo.p.h(paint, "<this>");
        k kVar = (k) v0Var;
        paint.setPathEffect(kVar != null ? kVar.a() : null);
    }

    public static final void p(Paint paint, Shader shader) {
        jo.p.h(paint, "<this>");
        paint.setShader(shader);
    }

    public static final void q(Paint paint, int i10) {
        Paint.Cap cap;
        jo.p.h(paint, "$this$setNativeStrokeCap");
        j1.a aVar = j1.f18697b;
        if (j1.g(i10, aVar.c())) {
            cap = Paint.Cap.SQUARE;
        } else if (j1.g(i10, aVar.b())) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = j1.g(i10, aVar.a()) ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public static final void r(Paint paint, int i10) {
        Paint.Join join;
        jo.p.h(paint, "$this$setNativeStrokeJoin");
        k1.a aVar = k1.f18705b;
        if (k1.g(i10, aVar.b())) {
            join = Paint.Join.MITER;
        } else if (k1.g(i10, aVar.a())) {
            join = Paint.Join.BEVEL;
        } else {
            join = k1.g(i10, aVar.c()) ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public static final void s(Paint paint, float f10) {
        jo.p.h(paint, "<this>");
        paint.setStrokeMiter(f10);
    }

    public static final void t(Paint paint, float f10) {
        jo.p.h(paint, "<this>");
        paint.setStrokeWidth(f10);
    }

    public static final void u(Paint paint, int i10) {
        jo.p.h(paint, "$this$setNativeStyle");
        paint.setStyle(t0.d(i10, t0.f18770a.b()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
