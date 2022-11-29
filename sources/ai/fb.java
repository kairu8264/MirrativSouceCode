package ai;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class fb {

    /* renamed from: e  reason: collision with root package name */
    public static fb f3980e;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f3981a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList<WeakReference<ab>> f3982b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final Object f3983c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public int f3984d = 0;

    public fb(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new db(this, null), intentFilter);
    }

    public static synchronized fb a(Context context) {
        fb fbVar;
        synchronized (fb.class) {
            if (f3980e == null) {
                f3980e = new fb(context);
            }
            fbVar = f3980e;
        }
        return fbVar;
    }

    public static /* synthetic */ void d(fb fbVar, int i10) {
        synchronized (fbVar.f3983c) {
            if (fbVar.f3984d == i10) {
                return;
            }
            fbVar.f3984d = i10;
            Iterator<WeakReference<ab>> it = fbVar.f3982b.iterator();
            while (it.hasNext()) {
                WeakReference<ab> next = it.next();
                ab abVar = next.get();
                if (abVar != null) {
                    abVar.G(i10);
                } else {
                    fbVar.f3982b.remove(next);
                }
            }
        }
    }

    public final void b(final ab abVar) {
        Iterator<WeakReference<ab>> it = this.f3982b.iterator();
        while (it.hasNext()) {
            WeakReference<ab> next = it.next();
            if (next.get() == null) {
                this.f3982b.remove(next);
            }
        }
        this.f3982b.add(new WeakReference<>(abVar));
        this.f3981a.post(new Runnable(this, abVar) { // from class: ai.ya

            /* renamed from: w  reason: collision with root package name */
            public final fb f12489w;

            /* renamed from: x  reason: collision with root package name */
            public final ab f12490x;

            {
                this.f12489w = this;
                this.f12490x = abVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12490x.G(this.f12489w.c());
            }
        });
    }

    public final int c() {
        int i10;
        synchronized (this.f3983c) {
            i10 = this.f3984d;
        }
        return i10;
    }
}
