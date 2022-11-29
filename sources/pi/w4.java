package pi;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class w4<V> extends FutureTask<V> implements Comparable<w4<V>> {

    /* renamed from: w  reason: collision with root package name */
    public final long f48302w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f48303x;

    /* renamed from: y  reason: collision with root package name */
    public final String f48304y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ y4 f48305z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(y4 y4Var, Runnable runnable, boolean z10, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        this.f48305z = y4Var;
        rh.p.i(str);
        atomicLong = y4.f48372l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f48302w = andIncrement;
        this.f48304y = str;
        this.f48303x = z10;
        if (andIncrement == Long.MAX_VALUE) {
            y4Var.f48285a.r().p().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        w4 w4Var = (w4) obj;
        boolean z10 = this.f48303x;
        if (z10 != w4Var.f48303x) {
            return !z10 ? 1 : -1;
        }
        int i10 = (this.f48302w > w4Var.f48302w ? 1 : (this.f48302w == w4Var.f48302w ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        if (i10 > 0) {
            return 1;
        }
        this.f48305z.f48285a.r().s().b("Two tasks share the same index. index", Long.valueOf(this.f48302w));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th2) {
        this.f48305z.f48285a.r().p().b(this.f48304y, th2);
        super.setException(th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(y4 y4Var, Callable<V> callable, boolean z10, String str) {
        super(callable);
        AtomicLong atomicLong;
        this.f48305z = y4Var;
        rh.p.i("Task exception on worker thread");
        atomicLong = y4.f48372l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f48302w = andIncrement;
        this.f48304y = "Task exception on worker thread";
        this.f48303x = z10;
        if (andIncrement == Long.MAX_VALUE) {
            y4Var.f48285a.r().p().a("Tasks index overflow");
        }
    }
}
