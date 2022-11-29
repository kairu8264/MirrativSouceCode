package ai;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class xm1 {

    /* renamed from: a  reason: collision with root package name */
    public final t41 f12012a;

    /* renamed from: b  reason: collision with root package name */
    public final lc1 f12013b;

    /* renamed from: c  reason: collision with root package name */
    public final d61 f12014c;

    /* renamed from: d  reason: collision with root package name */
    public final q61 f12015d;

    /* renamed from: e  reason: collision with root package name */
    public final c71 f12016e;

    /* renamed from: f  reason: collision with root package name */
    public final v91 f12017f;

    /* renamed from: g  reason: collision with root package name */
    public final Executor f12018g;

    /* renamed from: h  reason: collision with root package name */
    public final ic1 f12019h;

    /* renamed from: i  reason: collision with root package name */
    public final ax0 f12020i;

    /* renamed from: j  reason: collision with root package name */
    public final wg.b f12021j;

    /* renamed from: k  reason: collision with root package name */
    public final wg0 f12022k;

    /* renamed from: l  reason: collision with root package name */
    public final u f12023l;

    /* renamed from: m  reason: collision with root package name */
    public final m91 f12024m;

    /* renamed from: n  reason: collision with root package name */
    public final ey1 f12025n;

    /* renamed from: o  reason: collision with root package name */
    public final fr2 f12026o;

    /* renamed from: p  reason: collision with root package name */
    public final pp1 f12027p;

    /* renamed from: q  reason: collision with root package name */
    public final nq2 f12028q;

    public xm1(t41 t41Var, d61 d61Var, q61 q61Var, c71 c71Var, v91 v91Var, Executor executor, ic1 ic1Var, ax0 ax0Var, wg.b bVar, wg0 wg0Var, u uVar, m91 m91Var, ey1 ey1Var, fr2 fr2Var, pp1 pp1Var, nq2 nq2Var, lc1 lc1Var) {
        this.f12012a = t41Var;
        this.f12014c = d61Var;
        this.f12015d = q61Var;
        this.f12016e = c71Var;
        this.f12017f = v91Var;
        this.f12018g = executor;
        this.f12019h = ic1Var;
        this.f12020i = ax0Var;
        this.f12021j = bVar;
        this.f12022k = wg0Var;
        this.f12023l = uVar;
        this.f12024m = m91Var;
        this.f12025n = ey1Var;
        this.f12026o = fr2Var;
        this.f12027p = pp1Var;
        this.f12028q = nq2Var;
        this.f12013b = lc1Var;
    }

    public static final s43<?> j(rp0 rp0Var, String str, String str2) {
        final mk0 mk0Var = new mk0();
        rp0Var.i0().b1(new dr0(mk0Var) { // from class: ai.vm1

            /* renamed from: w  reason: collision with root package name */
            public final mk0 f11127w;

            {
                this.f11127w = mk0Var;
            }

            @Override // ai.dr0
            public final void b(boolean z10) {
                mk0 mk0Var2 = this.f11127w;
                if (z10) {
                    mk0Var2.d(null);
                } else {
                    mk0Var2.e(new Exception("Ad Web View failed to load."));
                }
            }
        });
        rp0Var.Z0(str, str2, null);
        return mk0Var;
    }

    public final /* synthetic */ void c(rp0 rp0Var, rp0 rp0Var2, Map map) {
        this.f12020i.h(rp0Var);
    }

    public final /* synthetic */ void d(View view) {
        this.f12021j.a();
    }

    public final /* synthetic */ boolean e(View view, MotionEvent motionEvent) {
        this.f12021j.a();
        return false;
    }

    public final /* synthetic */ void f() {
        this.f12014c.zzb();
    }

    public final /* synthetic */ void g(String str, String str2) {
        this.f12017f.w0(str, str2);
    }

    public final /* synthetic */ void h() {
        this.f12012a.onAdClicked();
    }

    public final void i(final rp0 rp0Var, boolean z10, u30 u30Var) {
        q b10;
        rp0Var.i0().L0(new or(this) { // from class: ai.om1

            /* renamed from: w  reason: collision with root package name */
            public final xm1 f7854w;

            {
                this.f7854w = this;
            }

            @Override // ai.or
            public final void onAdClicked() {
                this.f7854w.h();
            }
        }, this.f12015d, this.f12016e, new s20(this) { // from class: ai.pm1

            /* renamed from: w  reason: collision with root package name */
            public final xm1 f8475w;

            {
                this.f8475w = this;
            }

            @Override // ai.s20
            public final void w0(String str, String str2) {
                this.f8475w.g(str, str2);
            }
        }, new xg.x(this) { // from class: ai.qm1

            /* renamed from: w  reason: collision with root package name */
            public final xm1 f9007w;

            {
                this.f9007w = this;
            }

            @Override // xg.x
            public final void f() {
                this.f9007w.f();
            }
        }, z10, u30Var, this.f12021j, new wm1(this), this.f12022k, this.f12025n, this.f12026o, this.f12027p, this.f12028q, null, this.f12013b);
        rp0Var.setOnTouchListener(new View.OnTouchListener(this) { // from class: ai.rm1

            /* renamed from: w  reason: collision with root package name */
            public final xm1 f9502w;

            {
                this.f9502w = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.f9502w.e(view, motionEvent);
                return false;
            }
        });
        rp0Var.setOnClickListener(new View.OnClickListener(this) { // from class: ai.sm1

            /* renamed from: w  reason: collision with root package name */
            public final xm1 f9879w;

            {
                this.f9879w = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9879w.d(view);
            }
        });
        if (((Boolean) ft.c().c(ox.K1)).booleanValue() && (b10 = this.f12023l.b()) != null) {
            b10.b((View) rp0Var);
        }
        this.f12019h.y0(rp0Var, this.f12018g);
        this.f12019h.y0(new vk(rp0Var) { // from class: ai.tm1

            /* renamed from: w  reason: collision with root package name */
            public final rp0 f10354w;

            {
                this.f10354w = rp0Var;
            }

            @Override // ai.vk
            public final void U(uk ukVar) {
                fr0 i02 = this.f10354w.i0();
                Rect rect = ukVar.f10730d;
                i02.k0(rect.left, rect.top, false);
            }
        }, this.f12018g);
        this.f12019h.S0((View) rp0Var);
        rp0Var.c1("/trackActiveViewUnit", new r30(this, rp0Var) { // from class: ai.um1

            /* renamed from: a  reason: collision with root package name */
            public final xm1 f10756a;

            /* renamed from: b  reason: collision with root package name */
            public final rp0 f10757b;

            {
                this.f10756a = this;
                this.f10757b = rp0Var;
            }

            @Override // ai.r30
            public final void a(Object obj, Map map) {
                this.f10756a.c(this.f10757b, (rp0) obj, map);
            }
        });
        this.f12020i.j(rp0Var);
    }
}
