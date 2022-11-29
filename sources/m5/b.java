package m5;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k5.j;
import k5.s;
import l5.e;
import l5.i;
import p5.c;
import p5.d;
import t5.p;
import u5.f;

/* loaded from: classes.dex */
public class b implements e, c, l5.b {
    public static final String E = j.f("GreedyScheduler");
    public a A;
    public boolean B;
    public Boolean D;

    /* renamed from: w  reason: collision with root package name */
    public final Context f40606w;

    /* renamed from: x  reason: collision with root package name */
    public final i f40607x;

    /* renamed from: y  reason: collision with root package name */
    public final d f40608y;

    /* renamed from: z  reason: collision with root package name */
    public final Set<p> f40609z = new HashSet();
    public final Object C = new Object();

    public b(Context context, androidx.work.a aVar, w5.a aVar2, i iVar) {
        this.f40606w = context;
        this.f40607x = iVar;
        this.f40608y = new d(context, aVar2, this);
        this.A = new a(this, aVar.k());
    }

    @Override // l5.e
    public void a(String str) {
        if (this.D == null) {
            g();
        }
        if (!this.D.booleanValue()) {
            j.c().d(E, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        h();
        j.c().a(E, String.format("Cancelling work ID %s", str), new Throwable[0]);
        a aVar = this.A;
        if (aVar != null) {
            aVar.b(str);
        }
        this.f40607x.x(str);
    }

    @Override // p5.c
    public void b(List<String> list) {
        for (String str : list) {
            j.c().a(E, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f40607x.x(str);
        }
    }

    @Override // l5.e
    public boolean c() {
        return false;
    }

    @Override // l5.b
    public void d(String str, boolean z10) {
        i(str);
    }

    @Override // l5.e
    public void e(p... pVarArr) {
        if (this.D == null) {
            g();
        }
        if (!this.D.booleanValue()) {
            j.c().d(E, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p pVar : pVarArr) {
            long a10 = pVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (pVar.f53193b == s.a.ENQUEUED) {
                if (currentTimeMillis < a10) {
                    a aVar = this.A;
                    if (aVar != null) {
                        aVar.a(pVar);
                    }
                } else if (pVar.b()) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 23 && pVar.f53201j.h()) {
                        j.c().a(E, String.format("Ignoring WorkSpec %s, Requires device idle.", pVar), new Throwable[0]);
                    } else if (i10 >= 24 && pVar.f53201j.e()) {
                        j.c().a(E, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", pVar), new Throwable[0]);
                    } else {
                        hashSet.add(pVar);
                        hashSet2.add(pVar.f53192a);
                    }
                } else {
                    j.c().a(E, String.format("Starting work for %s", pVar.f53192a), new Throwable[0]);
                    this.f40607x.u(pVar.f53192a);
                }
            }
        }
        synchronized (this.C) {
            if (!hashSet.isEmpty()) {
                j.c().a(E, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                this.f40609z.addAll(hashSet);
                this.f40608y.d(this.f40609z);
            }
        }
    }

    @Override // p5.c
    public void f(List<String> list) {
        for (String str : list) {
            j.c().a(E, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f40607x.u(str);
        }
    }

    public final void g() {
        this.D = Boolean.valueOf(f.b(this.f40606w, this.f40607x.i()));
    }

    public final void h() {
        if (this.B) {
            return;
        }
        this.f40607x.m().c(this);
        this.B = true;
    }

    public final void i(String str) {
        synchronized (this.C) {
            Iterator<p> it = this.f40609z.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.f53192a.equals(str)) {
                    j.c().a(E, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.f40609z.remove(next);
                    this.f40608y.d(this.f40609z);
                    break;
                }
            }
        }
    }
}
