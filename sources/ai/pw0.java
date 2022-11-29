package ai;

import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class pw0 implements v41, k61, p51, or, l51 {
    public final sl2 A;
    public final fl2 B;
    public final cr2 C;
    public final im2 D;
    public final u E;
    public final oy F;
    public final WeakReference<View> G;
    public boolean H;
    public final AtomicBoolean I = new AtomicBoolean();
    public final qy J;

    /* renamed from: w  reason: collision with root package name */
    public final Context f8705w;

    /* renamed from: x  reason: collision with root package name */
    public final Executor f8706x;

    /* renamed from: y  reason: collision with root package name */
    public final Executor f8707y;

    /* renamed from: z  reason: collision with root package name */
    public final ScheduledExecutorService f8708z;

    public pw0(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, sl2 sl2Var, fl2 fl2Var, cr2 cr2Var, im2 im2Var, View view, u uVar, oy oyVar, qy qyVar, byte[] bArr) {
        this.f8705w = context;
        this.f8706x = executor;
        this.f8707y = executor2;
        this.f8708z = scheduledExecutorService;
        this.A = sl2Var;
        this.B = fl2Var;
        this.C = cr2Var;
        this.D = im2Var;
        this.E = uVar;
        this.G = new WeakReference<>(view);
        this.F = oyVar;
        this.J = qyVar;
    }

    @Override // ai.v41
    public final void B(ye0 ye0Var, String str, String str2) {
        im2 im2Var = this.D;
        cr2 cr2Var = this.C;
        fl2 fl2Var = this.B;
        im2Var.a(cr2Var.c(fl2Var, fl2Var.f4096i, ye0Var));
    }

    public final void K(final int i10, final int i11) {
        View view;
        if (i10 > 0 && ((view = this.G.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            this.f8708z.schedule(new Runnable(this, i10, i11) { // from class: ai.kw0

                /* renamed from: w  reason: collision with root package name */
                public final pw0 f6380w;

                /* renamed from: x  reason: collision with root package name */
                public final int f6381x;

                /* renamed from: y  reason: collision with root package name */
                public final int f6382y;

                {
                    this.f6380w = this;
                    this.f6381x = i10;
                    this.f6382y = i11;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f6380w.v(this.f6381x, this.f6382y);
                }
            }, i11, TimeUnit.MILLISECONDS);
        } else {
            A();
        }
    }

    /* renamed from: M */
    public final void A() {
        String e10 = ((Boolean) ft.c().c(ox.f7940a2)).booleanValue() ? this.E.b().e(this.f8705w, this.G.get(), null) : null;
        if ((((Boolean) ft.c().c(ox.f8005i0)).booleanValue() && this.A.f9876b.f9497b.f6282g) || !bz.f2633h.e().booleanValue()) {
            im2 im2Var = this.D;
            cr2 cr2Var = this.C;
            sl2 sl2Var = this.A;
            fl2 fl2Var = this.B;
            im2Var.a(cr2Var.b(sl2Var, fl2Var, false, e10, null, fl2Var.f4086d));
            return;
        }
        j43.p((z33) j43.h(z33.E(j43.a(null)), ((Long) ft.c().c(ox.G0)).longValue(), TimeUnit.MILLISECONDS, this.f8708z), new ow0(this, e10), this.f8706x);
    }

    @Override // ai.k61
    public final synchronized void a() {
        if (this.H) {
            ArrayList arrayList = new ArrayList(this.B.f4086d);
            arrayList.addAll(this.B.f4092g);
            this.D.a(this.C.b(this.A, this.B, true, null, null, arrayList));
        } else {
            im2 im2Var = this.D;
            cr2 cr2Var = this.C;
            sl2 sl2Var = this.A;
            fl2 fl2Var = this.B;
            im2Var.a(cr2Var.a(sl2Var, fl2Var, fl2Var.f4103n));
            im2 im2Var2 = this.D;
            cr2 cr2Var2 = this.C;
            sl2 sl2Var2 = this.A;
            fl2 fl2Var2 = this.B;
            im2Var2.a(cr2Var2.a(sl2Var2, fl2Var2, fl2Var2.f4092g));
        }
        this.H = true;
    }

    @Override // ai.v41
    public final void e() {
    }

    @Override // ai.p51
    public final void f() {
        if (this.I.compareAndSet(false, true)) {
            int intValue = ((Integer) ft.c().c(ox.f7967d2)).intValue();
            if (intValue > 0) {
                K(intValue, ((Integer) ft.c().c(ox.f7975e2)).intValue());
                return;
            }
            if (((Boolean) ft.c().c(ox.f7958c2)).booleanValue()) {
                this.f8707y.execute(new Runnable(this) { // from class: ai.iw0

                    /* renamed from: w  reason: collision with root package name */
                    public final pw0 f5431w;

                    {
                        this.f5431w = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5431w.z();
                    }
                });
            } else {
                A();
            }
        }
    }

    @Override // ai.v41
    public final void g() {
    }

    @Override // ai.v41
    public final void h() {
    }

    @Override // ai.v41
    public final void j() {
        im2 im2Var = this.D;
        cr2 cr2Var = this.C;
        sl2 sl2Var = this.A;
        fl2 fl2Var = this.B;
        im2Var.a(cr2Var.a(sl2Var, fl2Var, fl2Var.f4094h));
    }

    @Override // ai.v41
    public final void k() {
        im2 im2Var = this.D;
        cr2 cr2Var = this.C;
        sl2 sl2Var = this.A;
        fl2 fl2Var = this.B;
        im2Var.a(cr2Var.a(sl2Var, fl2Var, fl2Var.f4098j));
    }

    @Override // ai.l51
    public final void n(sr srVar) {
        if (((Boolean) ft.c().c(ox.Z0)).booleanValue()) {
            this.D.a(this.C.a(this.A, this.B, cr2.d(2, srVar.f9916w, this.B.f4104o)));
        }
    }

    @Override // ai.or
    public final void onAdClicked() {
        if ((!((Boolean) ft.c().c(ox.f8005i0)).booleanValue() || !this.A.f9876b.f9497b.f6282g) && bz.f2629d.e().booleanValue()) {
            j43.p(j43.f(z33.E(this.F.b()), Throwable.class, hw0.f5017a, hk0.f4883f), new nw0(this), this.f8706x);
            return;
        }
        im2 im2Var = this.D;
        cr2 cr2Var = this.C;
        sl2 sl2Var = this.A;
        fl2 fl2Var = this.B;
        List<String> a10 = cr2Var.a(sl2Var, fl2Var, fl2Var.f4084c);
        wg.t.d();
        im2Var.b(a10, true == yg.d2.i(this.f8705w) ? 2 : 1);
    }

    public final /* synthetic */ void v(final int i10, final int i11) {
        this.f8706x.execute(new Runnable(this, i10, i11) { // from class: ai.lw0

            /* renamed from: w  reason: collision with root package name */
            public final pw0 f6704w;

            /* renamed from: x  reason: collision with root package name */
            public final int f6705x;

            /* renamed from: y  reason: collision with root package name */
            public final int f6706y;

            {
                this.f6704w = this;
                this.f6705x = i10;
                this.f6706y = i11;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f6704w.y(this.f6705x, this.f6706y);
            }
        });
    }

    public final /* synthetic */ void y(int i10, int i11) {
        K(i10 - 1, i11);
    }

    public final /* synthetic */ void z() {
        this.f8706x.execute(new Runnable(this) { // from class: ai.mw0

            /* renamed from: w  reason: collision with root package name */
            public final pw0 f7076w;

            {
                this.f7076w = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f7076w.A();
            }
        });
    }
}
