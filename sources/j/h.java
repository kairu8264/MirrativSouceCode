package j;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import o3.j0;
import o3.k0;
import o3.l0;

/* loaded from: classes.dex */
public class h {

    /* renamed from: c  reason: collision with root package name */
    public Interpolator f37040c;

    /* renamed from: d  reason: collision with root package name */
    public k0 f37041d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f37042e;

    /* renamed from: b  reason: collision with root package name */
    public long f37039b = -1;

    /* renamed from: f  reason: collision with root package name */
    public final l0 f37043f = new a();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<j0> f37038a = new ArrayList<>();

    /* loaded from: classes.dex */
    public class a extends l0 {

        /* renamed from: a  reason: collision with root package name */
        public boolean f37044a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f37045b = 0;

        public a() {
        }

        public void a() {
            this.f37045b = 0;
            this.f37044a = false;
            h.this.b();
        }

        @Override // o3.l0, o3.k0
        public void onAnimationEnd(View view) {
            int i10 = this.f37045b + 1;
            this.f37045b = i10;
            if (i10 == h.this.f37038a.size()) {
                k0 k0Var = h.this.f37041d;
                if (k0Var != null) {
                    k0Var.onAnimationEnd(null);
                }
                a();
            }
        }

        @Override // o3.l0, o3.k0
        public void onAnimationStart(View view) {
            if (this.f37044a) {
                return;
            }
            this.f37044a = true;
            k0 k0Var = h.this.f37041d;
            if (k0Var != null) {
                k0Var.onAnimationStart(null);
            }
        }
    }

    public void a() {
        if (this.f37042e) {
            Iterator<j0> it = this.f37038a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f37042e = false;
        }
    }

    public void b() {
        this.f37042e = false;
    }

    public h c(j0 j0Var) {
        if (!this.f37042e) {
            this.f37038a.add(j0Var);
        }
        return this;
    }

    public h d(j0 j0Var, j0 j0Var2) {
        this.f37038a.add(j0Var);
        j0Var2.h(j0Var.c());
        this.f37038a.add(j0Var2);
        return this;
    }

    public h e(long j10) {
        if (!this.f37042e) {
            this.f37039b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f37042e) {
            this.f37040c = interpolator;
        }
        return this;
    }

    public h g(k0 k0Var) {
        if (!this.f37042e) {
            this.f37041d = k0Var;
        }
        return this;
    }

    public void h() {
        if (this.f37042e) {
            return;
        }
        Iterator<j0> it = this.f37038a.iterator();
        while (it.hasNext()) {
            j0 next = it.next();
            long j10 = this.f37039b;
            if (j10 >= 0) {
                next.d(j10);
            }
            Interpolator interpolator = this.f37040c;
            if (interpolator != null) {
                next.e(interpolator);
            }
            if (this.f37041d != null) {
                next.f(this.f37043f);
            }
            next.j();
        }
        this.f37042e = true;
    }
}
