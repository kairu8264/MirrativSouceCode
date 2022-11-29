package z5;

import android.graphics.drawable.Drawable;
import androidx.compose.ui.platform.b1;
import b1.l;
import c1.k0;
import j6.i;
import k6.b;
import kotlin.KotlinNothingValueException;
import n6.d;
import wn.v;
import z5.b;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f62551a = new a();

    /* loaded from: classes.dex */
    public static final class a implements n6.d {
        @Override // l6.a
        public void e(Drawable drawable) {
            d.a.c(this, drawable);
        }

        @Override // l6.a
        public void j(Drawable drawable) {
            d.a.b(this, drawable);
        }

        @Override // l6.a
        public void k(Drawable drawable) {
            d.a.a(this, drawable);
        }

        @Override // n6.d
        public Drawable l() {
            return null;
        }
    }

    public static final /* synthetic */ a a() {
        return f62551a;
    }

    public static final /* synthetic */ k6.h b(long j10) {
        return e(j10);
    }

    public static final boolean c(long j10) {
        return ((double) l.i(j10)) >= 0.5d && ((double) l.g(j10)) >= 0.5d;
    }

    public static final b d(Object obj, x5.e eVar, io.l<? super b.c, ? extends b.c> lVar, io.l<? super b.c, v> lVar2, q1.f fVar, int i10, l0.i iVar, int i11, int i12) {
        iVar.x(294036008);
        if ((i12 & 4) != 0) {
            lVar = b.R.a();
        }
        if ((i12 & 8) != 0) {
            lVar2 = null;
        }
        if ((i12 & 16) != 0) {
            fVar = q1.f.f48569a.d();
        }
        if ((i12 & 32) != 0) {
            i10 = e1.e.f30042e.b();
        }
        j6.i e10 = j.e(obj, iVar, 8);
        h(e10);
        iVar.x(-3687241);
        Object y10 = iVar.y();
        if (y10 == l0.i.f39065a.a()) {
            y10 = new b(e10, eVar);
            iVar.q(y10);
        }
        iVar.O();
        b bVar = (b) y10;
        bVar.M(lVar);
        bVar.H(lVar2);
        bVar.E(fVar);
        bVar.F(i10);
        bVar.J(((Boolean) iVar.G(b1.a())).booleanValue());
        bVar.G(eVar);
        bVar.K(e10);
        bVar.a();
        iVar.O();
        return bVar;
    }

    public static final k6.h e(long j10) {
        k6.b bVar;
        k6.b bVar2;
        boolean z10 = true;
        if (j10 == l.f16742b.a()) {
            return k6.h.f38444d;
        }
        if (c(j10)) {
            float i10 = l.i(j10);
            if ((Float.isInfinite(i10) || Float.isNaN(i10)) ? false : true) {
                bVar = new b.C0535b(lo.c.c(l.i(j10)));
            } else {
                bVar = b.a.f38437a;
            }
            float g10 = l.g(j10);
            if (Float.isInfinite(g10) || Float.isNaN(g10)) {
                z10 = false;
            }
            if (z10) {
                bVar2 = new b.C0535b(lo.c.c(l.g(j10)));
            } else {
                bVar2 = b.a.f38437a;
            }
            return new k6.h(bVar, bVar2);
        }
        return null;
    }

    public static final Void f(String str, String str2) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + str2);
    }

    public static /* synthetic */ Void g(String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "If you wish to display this " + str + ", use androidx.compose.foundation.Image.";
        }
        return f(str, str2);
    }

    public static final void h(j6.i iVar) {
        Object m10 = iVar.m();
        if (!(m10 instanceof i.a)) {
            if (!(m10 instanceof k0)) {
                if (!(m10 instanceof g1.c)) {
                    if (!(m10 instanceof f1.d)) {
                        if (!(iVar.M() == null)) {
                            throw new IllegalArgumentException("request.target must be null.".toString());
                        }
                        return;
                    }
                    g("Painter", null, 2, null);
                    throw new KotlinNothingValueException();
                }
                g("ImageVector", null, 2, null);
                throw new KotlinNothingValueException();
            }
            g("ImageBitmap", null, 2, null);
            throw new KotlinNothingValueException();
        }
        f("ImageRequest.Builder", "Did you forget to call ImageRequest.Builder.build()?");
        throw new KotlinNothingValueException();
    }
}
