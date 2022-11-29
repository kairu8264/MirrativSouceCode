package ai;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class e44 {

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f3535c = f44.f3946b;

    /* renamed from: a  reason: collision with root package name */
    public final List<d44> f3536a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public boolean f3537b = false;

    public final synchronized void a(String str, long j10) {
        if (!this.f3537b) {
            this.f3536a.add(new d44(str, j10, SystemClock.elapsedRealtime()));
        } else {
            throw new IllegalStateException("Marker added to finished log");
        }
    }

    public final synchronized void b(String str) {
        List<d44> list;
        long j10;
        this.f3537b = true;
        if (this.f3536a.size() == 0) {
            j10 = 0;
        } else {
            j10 = this.f3536a.get(list.size() - 1).f3140c - this.f3536a.get(0).f3140c;
        }
        if (j10 <= 0) {
            return;
        }
        long j11 = this.f3536a.get(0).f3140c;
        f44.b("(%-4d ms) %s", Long.valueOf(j10), str);
        for (d44 d44Var : this.f3536a) {
            long j12 = d44Var.f3140c;
            f44.b("(+%-4d) [%2d] %s", Long.valueOf(j12 - j11), Long.valueOf(d44Var.f3139b), d44Var.f3138a);
            j11 = j12;
        }
    }

    public final void finalize() throws Throwable {
        if (this.f3537b) {
            return;
        }
        b("Request on the loose");
        f44.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
