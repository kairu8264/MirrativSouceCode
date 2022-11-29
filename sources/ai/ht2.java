package ai;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ht2 implements ls2 {

    /* renamed from: g  reason: collision with root package name */
    public static final ht2 f4984g = new ht2();

    /* renamed from: h  reason: collision with root package name */
    public static final Handler f4985h = new Handler(Looper.getMainLooper());

    /* renamed from: i  reason: collision with root package name */
    public static Handler f4986i = null;

    /* renamed from: j  reason: collision with root package name */
    public static final Runnable f4987j = new dt2();

    /* renamed from: k  reason: collision with root package name */
    public static final Runnable f4988k = new et2();

    /* renamed from: b  reason: collision with root package name */
    public int f4990b;

    /* renamed from: f  reason: collision with root package name */
    public long f4994f;

    /* renamed from: a  reason: collision with root package name */
    public final List<gt2> f4989a = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final at2 f4992d = new at2();

    /* renamed from: c  reason: collision with root package name */
    public final os2 f4991c = new os2();

    /* renamed from: e  reason: collision with root package name */
    public final bt2 f4993e = new bt2(new kt2());

    public static ht2 f() {
        return f4984g;
    }

    public static /* synthetic */ void j(ht2 ht2Var) {
        ht2Var.f4990b = 0;
        ht2Var.f4994f = System.nanoTime();
        ht2Var.f4992d.d();
        long nanoTime = System.nanoTime();
        ns2 a10 = ht2Var.f4991c.a();
        if (ht2Var.f4992d.b().size() > 0) {
            Iterator<String> it = ht2Var.f4992d.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject b10 = vs2.b(0, 0, 0, 0);
                View h10 = ht2Var.f4992d.h(next);
                ns2 b11 = ht2Var.f4991c.b();
                String c10 = ht2Var.f4992d.c(next);
                if (c10 != null) {
                    JSONObject a11 = b11.a(h10);
                    vs2.d(a11, next);
                    vs2.e(a11, c10);
                    vs2.g(b10, a11);
                }
                vs2.h(b10);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                ht2Var.f4993e.b(b10, hashSet, nanoTime);
            }
        }
        if (ht2Var.f4992d.a().size() > 0) {
            JSONObject b12 = vs2.b(0, 0, 0, 0);
            ht2Var.k(null, a10, b12, 1);
            vs2.h(b12);
            ht2Var.f4993e.a(b12, ht2Var.f4992d.a(), nanoTime);
        } else {
            ht2Var.f4993e.c();
        }
        ht2Var.f4992d.e();
        long nanoTime2 = System.nanoTime() - ht2Var.f4994f;
        if (ht2Var.f4989a.size() > 0) {
            for (gt2 gt2Var : ht2Var.f4989a) {
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                gt2Var.zzb();
                if (gt2Var instanceof ft2) {
                    ((ft2) gt2Var).zza();
                }
            }
        }
    }

    public static final void l() {
        Handler handler = f4986i;
        if (handler != null) {
            handler.removeCallbacks(f4988k);
            f4986i = null;
        }
    }

    @Override // ai.ls2
    public final void a(View view, ns2 ns2Var, JSONObject jSONObject) {
        int j10;
        if (ys2.b(view) != null || (j10 = this.f4992d.j(view)) == 3) {
            return;
        }
        JSONObject a10 = ns2Var.a(view);
        vs2.g(jSONObject, a10);
        String g10 = this.f4992d.g(view);
        if (g10 != null) {
            vs2.d(a10, g10);
            this.f4992d.f();
        } else {
            zs2 i10 = this.f4992d.i(view);
            if (i10 != null) {
                vs2.f(a10, i10);
            }
            k(view, ns2Var, a10, j10);
        }
        this.f4990b++;
    }

    public final void g() {
        if (f4986i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f4986i = handler;
            handler.post(f4987j);
            f4986i.postDelayed(f4988k, 200L);
        }
    }

    public final void h() {
        l();
        this.f4989a.clear();
        f4985h.post(new ct2(this));
    }

    public final void i() {
        l();
    }

    public final void k(View view, ns2 ns2Var, JSONObject jSONObject, int i10) {
        ns2Var.b(view, jSONObject, this, i10 == 1);
    }
}
