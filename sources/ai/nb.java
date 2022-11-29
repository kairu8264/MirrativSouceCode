package ai;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class nb implements ha {

    /* renamed from: b */
    public static final List<mb> f7249b = new ArrayList(50);

    /* renamed from: a */
    public final Handler f7250a;

    public nb(Handler handler) {
        this.f7250a = handler;
    }

    public static /* synthetic */ void b(mb mbVar) {
        List<mb> list = f7249b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(mbVar);
            }
        }
    }

    public static mb c() {
        mb mbVar;
        List<mb> list = f7249b;
        synchronized (list) {
            mbVar = list.isEmpty() ? new mb(null) : list.remove(list.size() - 1);
        }
        return mbVar;
    }

    @Override // ai.ha
    public final boolean E(int i10) {
        return this.f7250a.sendEmptyMessage(i10);
    }

    @Override // ai.ha
    public final boolean G(int i10) {
        return this.f7250a.hasMessages(0);
    }

    @Override // ai.ha
    public final ga a(int i10) {
        mb c10 = c();
        c10.a(this.f7250a.obtainMessage(i10), this);
        return c10;
    }

    @Override // ai.ha
    public final void c0(int i10) {
        this.f7250a.removeMessages(2);
    }

    @Override // ai.ha
    public final ga d0(int i10, Object obj) {
        mb c10 = c();
        c10.a(this.f7250a.obtainMessage(i10, obj), this);
        return c10;
    }

    @Override // ai.ha
    public final boolean e0(ga gaVar) {
        return ((mb) gaVar).b(this.f7250a);
    }

    @Override // ai.ha
    public final boolean f0(int i10, long j10) {
        return this.f7250a.sendEmptyMessageAtTime(2, j10);
    }

    @Override // ai.ha
    public final ga g0(int i10, int i11, int i12) {
        mb c10 = c();
        c10.a(this.f7250a.obtainMessage(1, i11, i12), this);
        return c10;
    }

    @Override // ai.ha
    public final void h0(Object obj) {
        this.f7250a.removeCallbacksAndMessages(null);
    }

    @Override // ai.ha
    public final boolean i0(Runnable runnable) {
        return this.f7250a.post(runnable);
    }
}
