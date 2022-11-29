package tf;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import b1.l;
import b1.m;
import c1.d0;
import c1.w;
import e1.e;
import f1.d;
import jo.p;
import kotlin.NoWhenBranchMatchedException;
import l0.k1;
import l0.s0;
import l0.z1;
import lo.c;
import m2.q;
import po.n;
import wn.f;
import wn.g;

/* loaded from: classes3.dex */
public final class a extends d implements k1 {
    public final Drawable C;
    public final s0 D;
    public final f E;

    /* renamed from: tf.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C0834a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f53614a;

        static {
            int[] iArr = new int[q.values().length];
            iArr[q.Ltr.ordinal()] = 1;
            iArr[q.Rtl.ordinal()] = 2;
            f53614a = iArr;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends jo.q implements io.a<C0835a> {

        /* renamed from: tf.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0835a implements Drawable.Callback {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ a f53616w;

            public C0835a(a aVar) {
                this.f53616w = aVar;
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void invalidateDrawable(Drawable drawable) {
                p.h(drawable, "d");
                a aVar = this.f53616w;
                aVar.s(aVar.r() + 1);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
                Handler b10;
                p.h(drawable, "d");
                p.h(runnable, "what");
                b10 = tf.b.b();
                b10.postAtTime(runnable, j10);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                Handler b10;
                p.h(drawable, "d");
                p.h(runnable, "what");
                b10 = tf.b.b();
                b10.removeCallbacks(runnable);
            }
        }

        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final C0835a invoke() {
            return new C0835a(a.this);
        }
    }

    public a(Drawable drawable) {
        s0 e10;
        p.h(drawable, "drawable");
        this.C = drawable;
        e10 = z1.e(0, null, 2, null);
        this.D = e10;
        this.E = g.a(new b());
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // l0.k1
    public void a() {
        this.C.setCallback(p());
        this.C.setVisible(true, true);
        Drawable drawable = this.C;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // l0.k1
    public void b() {
        c();
    }

    @Override // l0.k1
    public void c() {
        Drawable drawable = this.C;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        this.C.setVisible(false, false);
        this.C.setCallback(null);
    }

    @Override // f1.d
    public boolean d(float f10) {
        this.C.setAlpha(n.m(c.c(f10 * 255), 0, 255));
        return true;
    }

    @Override // f1.d
    public boolean e(d0 d0Var) {
        this.C.setColorFilter(d0Var == null ? null : c1.d.b(d0Var));
        return true;
    }

    @Override // f1.d
    public boolean f(q qVar) {
        p.h(qVar, "layoutDirection");
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 23) {
            Drawable drawable = this.C;
            int i11 = C0834a.f53614a[qVar.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i10 = 1;
            }
            return drawable.setLayoutDirection(i10);
        }
        return false;
    }

    @Override // f1.d
    public long k() {
        if (this.C.getIntrinsicWidth() >= 0 && this.C.getIntrinsicHeight() >= 0) {
            return m.a(this.C.getIntrinsicWidth(), this.C.getIntrinsicHeight());
        }
        return l.f16742b.a();
    }

    @Override // f1.d
    public void m(e eVar) {
        p.h(eVar, "<this>");
        w e10 = eVar.M0().e();
        r();
        q().setBounds(0, 0, c.c(l.i(eVar.c())), c.c(l.g(eVar.c())));
        try {
            e10.p();
            q().draw(c1.c.c(e10));
        } finally {
            e10.k();
        }
    }

    public final Drawable.Callback p() {
        return (Drawable.Callback) this.E.getValue();
    }

    public final Drawable q() {
        return this.C;
    }

    public final int r() {
        return ((Number) this.D.getValue()).intValue();
    }

    public final void s(int i10) {
        this.D.setValue(Integer.valueOf(i10));
    }
}
