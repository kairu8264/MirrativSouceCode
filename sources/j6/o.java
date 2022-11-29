package j6;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import coil.request.BaseRequestDelegate;
import coil.request.NullRequestDataException;
import coil.request.RequestDelegate;
import coil.request.ViewTargetRequestDelegate;
import k6.b;
import o6.u;
import uo.d2;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final x5.e f37226a;

    /* renamed from: b  reason: collision with root package name */
    public final u f37227b;

    /* renamed from: c  reason: collision with root package name */
    public final o6.o f37228c;

    public o(x5.e eVar, u uVar, o6.s sVar) {
        this.f37226a = eVar;
        this.f37227b = uVar;
        this.f37228c = o6.h.a(sVar);
    }

    public final boolean a(m mVar) {
        return !o6.a.d(mVar.f()) || this.f37228c.b();
    }

    public final e b(i iVar, Throwable th2) {
        Drawable t10;
        if (th2 instanceof NullRequestDataException) {
            t10 = iVar.u();
            if (t10 == null) {
                t10 = iVar.t();
            }
        } else {
            t10 = iVar.t();
        }
        return new e(t10, iVar, th2);
    }

    public final boolean c(i iVar, Bitmap.Config config) {
        if (o6.a.d(config)) {
            if (iVar.h()) {
                l6.a M = iVar.M();
                if (M instanceof l6.b) {
                    View a10 = ((l6.b) M).a();
                    if (a10.isAttachedToWindow() && !a10.isHardwareAccelerated()) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean d(i iVar, k6.h hVar) {
        return c(iVar, iVar.j()) && this.f37228c.a(hVar);
    }

    public final boolean e(i iVar) {
        return iVar.O().isEmpty() || xn.o.B(o6.k.o(), iVar.j());
    }

    public final m f(i iVar, k6.h hVar) {
        a aVar;
        k6.g gVar;
        Bitmap.Config j10 = e(iVar) && d(iVar, hVar) ? iVar.j() : Bitmap.Config.ARGB_8888;
        if (this.f37227b.c()) {
            aVar = iVar.D();
        } else {
            aVar = a.DISABLED;
        }
        a aVar2 = aVar;
        boolean z10 = iVar.i() && iVar.O().isEmpty() && j10 != Bitmap.Config.ALPHA_8;
        k6.b b10 = hVar.b();
        b.a aVar3 = b.a.f38437a;
        if (!jo.p.c(b10, aVar3) && !jo.p.c(hVar.a(), aVar3)) {
            gVar = iVar.J();
        } else {
            gVar = k6.g.FIT;
        }
        return new m(iVar.l(), j10, iVar.k(), hVar, gVar, o6.j.a(iVar), z10, iVar.I(), iVar.r(), iVar.x(), iVar.L(), iVar.E(), iVar.C(), iVar.s(), aVar2);
    }

    public final RequestDelegate g(i iVar, d2 d2Var) {
        androidx.lifecycle.o z10 = iVar.z();
        l6.a M = iVar.M();
        if (M instanceof l6.b) {
            return new ViewTargetRequestDelegate(this.f37226a, iVar, (l6.b) M, z10, d2Var);
        }
        return new BaseRequestDelegate(z10, d2Var);
    }
}
