package coil.request;

import androidx.lifecycle.o;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import coil.util.Lifecycles;
import j6.i;
import java.util.concurrent.CancellationException;
import l6.b;
import o6.k;
import uo.d2;
import x5.e;

/* loaded from: classes.dex */
public final class ViewTargetRequestDelegate extends RequestDelegate {
    public final d2 A;

    /* renamed from: w  reason: collision with root package name */
    public final e f20023w;

    /* renamed from: x  reason: collision with root package name */
    public final i f20024x;

    /* renamed from: y  reason: collision with root package name */
    public final b<?> f20025y;

    /* renamed from: z  reason: collision with root package name */
    public final o f20026z;

    public ViewTargetRequestDelegate(e eVar, i iVar, b<?> bVar, o oVar, d2 d2Var) {
        super(null);
        this.f20023w = eVar;
        this.f20024x = iVar;
        this.f20025y = bVar;
        this.f20026z = oVar;
        this.A = d2Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View] */
    @Override // coil.request.RequestDelegate
    public void a() {
        if (this.f20025y.a().isAttachedToWindow()) {
            return;
        }
        k.l(this.f20025y.a()).c(this);
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View] */
    @Override // androidx.lifecycle.h, androidx.lifecycle.m
    public void g(u uVar) {
        k.l(this.f20025y.a()).a();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View] */
    @Override // coil.request.RequestDelegate
    public void j() {
        this.f20026z.a(this);
        b<?> bVar = this.f20025y;
        if (bVar instanceof t) {
            Lifecycles.b(this.f20026z, (t) bVar);
        }
        k.l(this.f20025y.a()).c(this);
    }

    public void k() {
        d2.a.a(this.A, null, 1, null);
        b<?> bVar = this.f20025y;
        if (bVar instanceof t) {
            this.f20026z.c((t) bVar);
        }
        this.f20026z.c(this);
    }

    public final void l() {
        this.f20023w.c(this.f20024x);
    }
}
