package ai;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class bs3 {

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList<as3> f2473a = new CopyOnWriteArrayList<>();

    public final void a(Handler handler, cs3 cs3Var) {
        b(cs3Var);
        this.f2473a.add(new as3(handler, cs3Var));
    }

    public final void b(cs3 cs3Var) {
        cs3 cs3Var2;
        Iterator<as3> it = this.f2473a.iterator();
        while (it.hasNext()) {
            as3 next = it.next();
            cs3Var2 = next.f1991b;
            if (cs3Var2 == cs3Var) {
                next.d();
                this.f2473a.remove(next);
            }
        }
    }

    public final void c(final int i10, final long j10, final long j11) {
        boolean z10;
        Handler handler;
        Iterator<as3> it = this.f2473a.iterator();
        while (it.hasNext()) {
            final as3 next = it.next();
            z10 = next.f1992c;
            if (!z10) {
                handler = next.f1990a;
                handler.post(new Runnable(next, i10, j10, j11) { // from class: ai.zr3

                    /* renamed from: w  reason: collision with root package name */
                    public final as3 f13083w;

                    /* renamed from: x  reason: collision with root package name */
                    public final int f13084x;

                    /* renamed from: y  reason: collision with root package name */
                    public final long f13085y;

                    /* renamed from: z  reason: collision with root package name */
                    public final long f13086z;

                    {
                        this.f13083w = next;
                        this.f13084x = i10;
                        this.f13085y = j10;
                        this.f13086z = j11;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        cs3 cs3Var;
                        as3 as3Var = this.f13083w;
                        int i11 = this.f13084x;
                        long j12 = this.f13085y;
                        long j13 = this.f13086z;
                        cs3Var = as3Var.f1991b;
                        cs3Var.D(i11, j12, j13);
                    }
                });
            }
        }
    }
}
