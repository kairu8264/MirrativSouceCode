package androidx.lifecycle;

import android.annotation.SuppressLint;
import java.util.ArrayDeque;
import java.util.Queue;
import uo.g1;
import uo.o2;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b  reason: collision with root package name */
    public boolean f15543b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f15544c;

    /* renamed from: a  reason: collision with root package name */
    public boolean f15542a = true;

    /* renamed from: d  reason: collision with root package name */
    public final Queue<Runnable> f15545d = new ArrayDeque();

    /* loaded from: classes.dex */
    public static final class a implements Runnable {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Runnable f15547x;

        public a(Runnable runnable) {
            this.f15547x = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.e(this.f15547x);
        }
    }

    public final boolean b() {
        return this.f15543b || !this.f15542a;
    }

    @SuppressLint({"WrongThread"})
    public final void c(ao.g gVar, Runnable runnable) {
        jo.p.h(gVar, "context");
        jo.p.h(runnable, "runnable");
        o2 h02 = g1.c().h0();
        if (!h02.c0(gVar) && !b()) {
            e(runnable);
        } else {
            h02.X(gVar, new a(runnable));
        }
    }

    public final void d() {
        if (this.f15544c) {
            return;
        }
        try {
            this.f15544c = true;
            while ((!this.f15545d.isEmpty()) && b()) {
                Runnable poll = this.f15545d.poll();
                if (poll != null) {
                    poll.run();
                }
            }
        } finally {
            this.f15544c = false;
        }
    }

    public final void e(Runnable runnable) {
        if (this.f15545d.offer(runnable)) {
            d();
            return;
        }
        throw new IllegalStateException("cannot enqueue any more runnables".toString());
    }

    public final void f() {
        this.f15543b = true;
        d();
    }

    public final void g() {
        this.f15542a = true;
    }

    public final void h() {
        if (this.f15542a) {
            if (!this.f15543b) {
                this.f15542a = false;
                d();
                return;
            }
            throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
        }
    }
}
