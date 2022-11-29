package uo;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.KotlinNothingValueException;

/* loaded from: classes4.dex */
public final class e3 implements io.l<Throwable, wn.v> {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f56012z = AtomicIntegerFieldUpdater.newUpdater(e3.class, "_state");

    /* renamed from: w  reason: collision with root package name */
    public final d2 f56013w;

    /* renamed from: y  reason: collision with root package name */
    public i1 f56015y;
    private volatile /* synthetic */ int _state = 0;

    /* renamed from: x  reason: collision with root package name */
    public final Thread f56014x = Thread.currentThread();

    public e3(d2 d2Var) {
        this.f56013w = d2Var;
    }

    public final void a() {
        while (true) {
            int i10 = this._state;
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        b(i10);
                        throw new KotlinNothingValueException();
                    }
                }
            } else if (f56012z.compareAndSet(this, i10, 1)) {
                i1 i1Var = this.f56015y;
                if (i1Var == null) {
                    return;
                }
                i1Var.dispose();
                return;
            }
        }
    }

    public final Void b(int i10) {
        throw new IllegalStateException(jo.p.o("Illegal state ", Integer.valueOf(i10)).toString());
    }

    public void c(Throwable th2) {
        int i10;
        do {
            i10 = this._state;
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return;
                }
                b(i10);
                throw new KotlinNothingValueException();
            }
        } while (!f56012z.compareAndSet(this, i10, 2));
        this.f56014x.interrupt();
        this._state = 3;
    }

    public final void d() {
        int i10;
        this.f56015y = this.f56013w.O(true, true, this);
        do {
            i10 = this._state;
            if (i10 != 0) {
                if (i10 == 2 || i10 == 3) {
                    return;
                }
                b(i10);
                throw new KotlinNothingValueException();
            }
        } while (!f56012z.compareAndSet(this, i10, 0));
    }

    @Override // io.l
    public /* bridge */ /* synthetic */ wn.v invoke(Throwable th2) {
        c(th2);
        return wn.v.f59242a;
    }
}
