package d7;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import e7.c;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class t {

    /* renamed from: b  reason: collision with root package name */
    public static s.h<WeakReference<Interpolator>> f29284b;

    /* renamed from: a  reason: collision with root package name */
    public static final Interpolator f29283a = new LinearInterpolator();

    /* renamed from: c  reason: collision with root package name */
    public static c.a f29285c = c.a.a(TopicConstant.PACKET_TYPE_TEXT, "s", i7.e.f36387u, "o", TopicConstant.EXTEND_AVC_IDR, "h", "to", "ti");

    /* renamed from: d  reason: collision with root package name */
    public static c.a f29286d = c.a.a("x", "y");

    public static WeakReference<Interpolator> a(int i10) {
        WeakReference<Interpolator> h10;
        synchronized (t.class) {
            h10 = g().h(i10);
        }
        return h10;
    }

    public static Interpolator b(PointF pointF, PointF pointF2) {
        Interpolator linearInterpolator;
        pointF.x = f7.g.c(pointF.x, -1.0f, 1.0f);
        pointF.y = f7.g.c(pointF.y, -100.0f, 100.0f);
        pointF2.x = f7.g.c(pointF2.x, -1.0f, 1.0f);
        float c10 = f7.g.c(pointF2.y, -100.0f, 100.0f);
        pointF2.y = c10;
        int i10 = f7.h.i(pointF.x, pointF.y, pointF2.x, c10);
        WeakReference<Interpolator> a10 = a(i10);
        Interpolator interpolator = a10 != null ? a10.get() : null;
        if (a10 == null || interpolator == null) {
            try {
                linearInterpolator = q3.b.a(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e10) {
                if ("The Path cannot loop back on itself.".equals(e10.getMessage())) {
                    linearInterpolator = q3.b.a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    linearInterpolator = new LinearInterpolator();
                }
            }
            interpolator = linearInterpolator;
            try {
                h(i10, new WeakReference(interpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator;
    }

    public static <T> g7.a<T> c(e7.c cVar, s6.d dVar, float f10, m0<T> m0Var, boolean z10, boolean z11) throws IOException {
        if (z10 && z11) {
            return e(dVar, cVar, f10, m0Var);
        }
        if (z10) {
            return d(dVar, cVar, f10, m0Var);
        }
        return f(cVar, f10, m0Var);
    }

    public static <T> g7.a<T> d(s6.d dVar, e7.c cVar, float f10, m0<T> m0Var) throws IOException {
        Interpolator interpolator;
        Interpolator interpolator2;
        T t10;
        cVar.d();
        PointF pointF = null;
        boolean z10 = false;
        T t11 = null;
        T t12 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        float f11 = 0.0f;
        PointF pointF4 = null;
        while (cVar.i()) {
            switch (cVar.E(f29285c)) {
                case 0:
                    f11 = (float) cVar.n();
                    break;
                case 1:
                    t12 = m0Var.a(cVar, f10);
                    break;
                case 2:
                    t11 = m0Var.a(cVar, f10);
                    break;
                case 3:
                    pointF = s.e(cVar, 1.0f);
                    break;
                case 4:
                    pointF4 = s.e(cVar, 1.0f);
                    break;
                case 5:
                    if (cVar.o() != 1) {
                        z10 = false;
                        break;
                    } else {
                        z10 = true;
                        break;
                    }
                case 6:
                    pointF2 = s.e(cVar, f10);
                    break;
                case 7:
                    pointF3 = s.e(cVar, f10);
                    break;
                default:
                    cVar.G();
                    break;
            }
        }
        cVar.h();
        if (z10) {
            interpolator2 = f29283a;
            t10 = t12;
        } else {
            if (pointF != null && pointF4 != null) {
                interpolator = b(pointF, pointF4);
            } else {
                interpolator = f29283a;
            }
            interpolator2 = interpolator;
            t10 = t11;
        }
        g7.a<T> aVar = new g7.a<>(dVar, t12, t10, interpolator2, f11, null);
        aVar.f32810o = pointF2;
        aVar.f32811p = pointF3;
        return aVar;
    }

    public static <T> g7.a<T> e(s6.d dVar, e7.c cVar, float f10, m0<T> m0Var) throws IOException {
        Interpolator interpolator;
        Interpolator b10;
        Interpolator b11;
        T t10;
        PointF pointF;
        g7.a<T> aVar;
        PointF pointF2;
        float f11;
        PointF pointF3;
        cVar.d();
        PointF pointF4 = null;
        boolean z10 = false;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        T t11 = null;
        PointF pointF8 = null;
        PointF pointF9 = null;
        PointF pointF10 = null;
        float f12 = 0.0f;
        PointF pointF11 = null;
        T t12 = null;
        while (cVar.i()) {
            switch (cVar.E(f29285c)) {
                case 0:
                    pointF2 = pointF4;
                    f12 = (float) cVar.n();
                    break;
                case 1:
                    pointF2 = pointF4;
                    t11 = m0Var.a(cVar, f10);
                    break;
                case 2:
                    pointF2 = pointF4;
                    t12 = m0Var.a(cVar, f10);
                    break;
                case 3:
                    pointF2 = pointF4;
                    f11 = f12;
                    PointF pointF12 = pointF11;
                    if (cVar.z() == c.b.BEGIN_OBJECT) {
                        cVar.d();
                        float f13 = 0.0f;
                        float f14 = 0.0f;
                        float f15 = 0.0f;
                        float f16 = 0.0f;
                        while (cVar.i()) {
                            int E = cVar.E(f29286d);
                            if (E == 0) {
                                c.b z11 = cVar.z();
                                c.b bVar = c.b.NUMBER;
                                if (z11 == bVar) {
                                    f15 = (float) cVar.n();
                                    f13 = f15;
                                } else {
                                    cVar.c();
                                    f13 = (float) cVar.n();
                                    f15 = cVar.z() == bVar ? (float) cVar.n() : f13;
                                    cVar.e();
                                }
                            } else if (E != 1) {
                                cVar.G();
                            } else {
                                c.b z12 = cVar.z();
                                c.b bVar2 = c.b.NUMBER;
                                if (z12 == bVar2) {
                                    f16 = (float) cVar.n();
                                    f14 = f16;
                                } else {
                                    cVar.c();
                                    f14 = (float) cVar.n();
                                    f16 = cVar.z() == bVar2 ? (float) cVar.n() : f14;
                                    cVar.e();
                                }
                            }
                        }
                        PointF pointF13 = new PointF(f13, f14);
                        PointF pointF14 = new PointF(f15, f16);
                        cVar.h();
                        pointF8 = pointF14;
                        pointF7 = pointF13;
                        pointF11 = pointF12;
                        f12 = f11;
                        break;
                    } else {
                        pointF5 = s.e(cVar, f10);
                        f12 = f11;
                        pointF11 = pointF12;
                        break;
                    }
                case 4:
                    if (cVar.z() == c.b.BEGIN_OBJECT) {
                        cVar.d();
                        float f17 = 0.0f;
                        float f18 = 0.0f;
                        float f19 = 0.0f;
                        float f20 = 0.0f;
                        while (cVar.i()) {
                            PointF pointF15 = pointF11;
                            int E2 = cVar.E(f29286d);
                            if (E2 != 0) {
                                pointF3 = pointF4;
                                if (E2 != 1) {
                                    cVar.G();
                                } else {
                                    c.b z13 = cVar.z();
                                    c.b bVar3 = c.b.NUMBER;
                                    if (z13 == bVar3) {
                                        f20 = (float) cVar.n();
                                        f12 = f12;
                                        f18 = f20;
                                    } else {
                                        float f21 = f12;
                                        cVar.c();
                                        float n10 = (float) cVar.n();
                                        float n11 = cVar.z() == bVar3 ? (float) cVar.n() : n10;
                                        cVar.e();
                                        f12 = f21;
                                        pointF11 = pointF15;
                                        pointF4 = pointF3;
                                        f20 = n11;
                                        f18 = n10;
                                    }
                                }
                            } else {
                                pointF3 = pointF4;
                                float f22 = f12;
                                c.b z14 = cVar.z();
                                c.b bVar4 = c.b.NUMBER;
                                if (z14 == bVar4) {
                                    f19 = (float) cVar.n();
                                    f12 = f22;
                                    f17 = f19;
                                } else {
                                    cVar.c();
                                    f17 = (float) cVar.n();
                                    f19 = cVar.z() == bVar4 ? (float) cVar.n() : f17;
                                    cVar.e();
                                    f12 = f22;
                                }
                            }
                            pointF11 = pointF15;
                            pointF4 = pointF3;
                        }
                        pointF2 = pointF4;
                        f11 = f12;
                        PointF pointF16 = new PointF(f17, f18);
                        PointF pointF17 = new PointF(f19, f20);
                        cVar.h();
                        pointF10 = pointF17;
                        pointF9 = pointF16;
                        f12 = f11;
                        break;
                    } else {
                        pointF2 = pointF4;
                        pointF6 = s.e(cVar, f10);
                        break;
                    }
                case 5:
                    if (cVar.o() == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                        continue;
                    }
                case 6:
                    pointF11 = s.e(cVar, f10);
                    continue;
                case 7:
                    pointF4 = s.e(cVar, f10);
                    continue;
                default:
                    pointF2 = pointF4;
                    cVar.G();
                    break;
            }
            pointF4 = pointF2;
        }
        PointF pointF18 = pointF4;
        float f23 = f12;
        PointF pointF19 = pointF11;
        cVar.h();
        if (z10) {
            interpolator = f29283a;
            t10 = t11;
        } else {
            if (pointF5 != null && pointF6 != null) {
                interpolator = b(pointF5, pointF6);
            } else if (pointF7 != null && pointF8 != null && pointF9 != null && pointF10 != null) {
                b10 = b(pointF7, pointF9);
                b11 = b(pointF8, pointF10);
                t10 = t12;
                interpolator = null;
                if (b10 == null && b11 != null) {
                    pointF = pointF19;
                    aVar = new g7.a<>(dVar, t11, t10, b10, b11, f23, null);
                } else {
                    pointF = pointF19;
                    aVar = new g7.a<>(dVar, t11, t10, interpolator, f23, null);
                }
                aVar.f32810o = pointF;
                aVar.f32811p = pointF18;
                return aVar;
            } else {
                interpolator = f29283a;
            }
            t10 = t12;
        }
        b10 = null;
        b11 = null;
        if (b10 == null) {
        }
        pointF = pointF19;
        aVar = new g7.a<>(dVar, t11, t10, interpolator, f23, null);
        aVar.f32810o = pointF;
        aVar.f32811p = pointF18;
        return aVar;
    }

    public static <T> g7.a<T> f(e7.c cVar, float f10, m0<T> m0Var) throws IOException {
        return new g7.a<>(m0Var.a(cVar, f10));
    }

    public static s.h<WeakReference<Interpolator>> g() {
        if (f29284b == null) {
            f29284b = new s.h<>();
        }
        return f29284b;
    }

    public static void h(int i10, WeakReference<Interpolator> weakReference) {
        synchronized (t.class) {
            f29284b.n(i10, weakReference);
        }
    }
}
