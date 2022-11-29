package ai;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.internal.ads.zzcmw;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class oh1 {

    /* renamed from: a  reason: collision with root package name */
    public final yg.r1 f7790a;

    /* renamed from: b  reason: collision with root package name */
    public final yl2 f7791b;

    /* renamed from: c  reason: collision with root package name */
    public final tg1 f7792c;

    /* renamed from: d  reason: collision with root package name */
    public final og1 f7793d;

    /* renamed from: e  reason: collision with root package name */
    public final zh1 f7794e;

    /* renamed from: f  reason: collision with root package name */
    public final ii1 f7795f;

    /* renamed from: g  reason: collision with root package name */
    public final Executor f7796g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f7797h;

    /* renamed from: i  reason: collision with root package name */
    public final a00 f7798i;

    /* renamed from: j  reason: collision with root package name */
    public final lg1 f7799j;

    public oh1(yg.r1 r1Var, yl2 yl2Var, tg1 tg1Var, og1 og1Var, zh1 zh1Var, ii1 ii1Var, Executor executor, Executor executor2, lg1 lg1Var) {
        this.f7790a = r1Var;
        this.f7791b = yl2Var;
        this.f7798i = yl2Var.f12655i;
        this.f7792c = tg1Var;
        this.f7793d = og1Var;
        this.f7794e = zh1Var;
        this.f7795f = ii1Var;
        this.f7796g = executor;
        this.f7797h = executor2;
        this.f7799j = lg1Var;
    }

    public static void g(RelativeLayout.LayoutParams layoutParams, int i10) {
        if (i10 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i10 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i10 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    public final void a(final ki1 ki1Var) {
        this.f7796g.execute(new Runnable(this, ki1Var) { // from class: ai.lh1

            /* renamed from: w  reason: collision with root package name */
            public final oh1 f6564w;

            /* renamed from: x  reason: collision with root package name */
            public final ki1 f6565x;

            {
                this.f6564w = this;
                this.f6565x = ki1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f6564w.f(this.f6565x);
            }
        });
    }

    public final void b(ki1 ki1Var) {
        if (ki1Var == null || this.f7794e == null || ki1Var.z0() == null || !this.f7792c.b()) {
            return;
        }
        try {
            ki1Var.z0().addView(this.f7794e.a());
        } catch (zzcmw e10) {
            yg.p1.l("web view can not be obtained", e10);
        }
    }

    public final void c(ki1 ki1Var) {
        if (ki1Var == null) {
            return;
        }
        Context context = ki1Var.k5().getContext();
        if (yg.c1.i(context, this.f7792c.f10288a)) {
            if (!(context instanceof Activity)) {
                uj0.a("Activity context is needed for policy validator.");
            } else if (this.f7795f == null || ki1Var.z0() == null) {
            } else {
                try {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    windowManager.addView(this.f7795f.a(ki1Var.z0(), windowManager), yg.c1.j());
                } catch (zzcmw e10) {
                    yg.p1.l("web view can not be obtained", e10);
                }
            }
        }
    }

    public final boolean d(ViewGroup viewGroup) {
        return h(viewGroup, true);
    }

    public final /* synthetic */ void e(ViewGroup viewGroup) {
        boolean z10 = viewGroup != null;
        if (this.f7793d.h() != null) {
            if (this.f7793d.d0() != 2 && this.f7793d.d0() != 1) {
                if (this.f7793d.d0() == 6) {
                    this.f7790a.l(this.f7791b.f12652f, "2", z10);
                    this.f7790a.l(this.f7791b.f12652f, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, z10);
                    return;
                }
                return;
            }
            this.f7790a.l(this.f7791b.f12652f, String.valueOf(this.f7793d.d0()), z10);
        }
    }

    public final /* synthetic */ void f(ki1 ki1Var) {
        ViewGroup viewGroup;
        View view;
        final ViewGroup viewGroup2;
        j00 a10;
        Drawable drawable;
        if (this.f7792c.e() || this.f7792c.c()) {
            String[] strArr = {"1098", "3011"};
            for (int i10 = 0; i10 < 2; i10++) {
                View V = ki1Var.V(strArr[i10]);
                if (V != null && (V instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) V;
                    break;
                }
            }
        }
        viewGroup = null;
        Context context = ki1Var.k5().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (this.f7793d.g0() != null) {
            view = this.f7793d.g0();
            a00 a00Var = this.f7798i;
            if (a00Var != null && viewGroup == null) {
                g(layoutParams, a00Var.A);
                view.setLayoutParams(layoutParams);
            }
        } else if (this.f7793d.f0() instanceof tz) {
            tz tzVar = (tz) this.f7793d.f0();
            if (viewGroup == null) {
                g(layoutParams, tzVar.h());
            }
            View uzVar = new uz(context, tzVar, layoutParams);
            uzVar.setContentDescription((CharSequence) ft.c().c(ox.f8039m2));
            view = uzVar;
        } else {
            view = null;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                tg.i iVar = new tg.i(ki1Var.k5().getContext());
                iVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                iVar.addView(view);
                FrameLayout z02 = ki1Var.z0();
                if (z02 != null) {
                    z02.addView(iVar);
                }
            }
            ki1Var.h1(ki1Var.n(), view, true);
        }
        zz2<String> zz2Var = kh1.J;
        int size = zz2Var.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                viewGroup2 = null;
                break;
            }
            View V2 = ki1Var.V(zz2Var.get(i11));
            i11++;
            if (V2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) V2;
                break;
            }
        }
        this.f7797h.execute(new Runnable(this, viewGroup2) { // from class: ai.mh1

            /* renamed from: w  reason: collision with root package name */
            public final oh1 f6941w;

            /* renamed from: x  reason: collision with root package name */
            public final ViewGroup f6942x;

            {
                this.f6941w = this;
                this.f6942x = viewGroup2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f6941w.e(this.f6942x);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (h(viewGroup2, true)) {
            if (this.f7793d.r() != null) {
                this.f7793d.r().f0(new nh1(ki1Var, viewGroup2));
            }
        } else if (((Boolean) ft.c().c(ox.O6)).booleanValue() && h(viewGroup2, false)) {
            if (this.f7793d.s() != null) {
                this.f7793d.s().f0(new nh1(ki1Var, viewGroup2));
            }
        } else {
            viewGroup2.removeAllViews();
            View k52 = ki1Var.k5();
            Context context2 = k52 != null ? k52.getContext() : null;
            if (context2 == null || (a10 = this.f7799j.a()) == null) {
                return;
            }
            try {
                yh.a f10 = a10.f();
                if (f10 == null || (drawable = (Drawable) yh.b.z0(f10)) == null) {
                    return;
                }
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                yh.a o10 = ki1Var.o();
                if (o10 != null) {
                    if (((Boolean) ft.c().c(ox.f8121w4)).booleanValue()) {
                        imageView.setScaleType((ImageView.ScaleType) yh.b.z0(o10));
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        viewGroup2.addView(imageView);
                    }
                }
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                viewGroup2.addView(imageView);
            } catch (RemoteException unused) {
                uj0.f("Could not get main image drawable");
            }
        }
    }

    public final boolean h(ViewGroup viewGroup, boolean z10) {
        View i10;
        FrameLayout.LayoutParams layoutParams;
        if (z10) {
            i10 = this.f7793d.h();
        } else {
            i10 = this.f7793d.i();
        }
        if (i10 == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (i10.getParent() instanceof ViewGroup) {
            ((ViewGroup) i10.getParent()).removeView(i10);
        }
        if (((Boolean) ft.c().c(ox.f8055o2)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(i10, layoutParams);
        return true;
    }
}
