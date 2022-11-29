package zo;

import com.google.android.exoplayer2.C;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import zo.h0;

/* loaded from: classes4.dex */
public abstract class h0<S extends h0<S>> extends h<S> {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f63292d = AtomicIntegerFieldUpdater.newUpdater(h0.class, "cleanedAndPointers");

    /* renamed from: c  reason: collision with root package name */
    public final long f63293c;
    private volatile /* synthetic */ int cleanedAndPointers;

    public h0(long j10, S s10, int i10) {
        super(s10);
        this.f63293c = j10;
        this.cleanedAndPointers = i10 << 16;
    }

    @Override // zo.h
    public boolean g() {
        return this.cleanedAndPointers == n() && !i();
    }

    public final boolean l() {
        return f63292d.addAndGet(this, -65536) == n() && !i();
    }

    public final long m() {
        return this.f63293c;
    }

    public abstract int n();

    public final void o() {
        if (f63292d.incrementAndGet(this) != n() || i()) {
            return;
        }
        j();
    }

    public final boolean p() {
        int i10;
        do {
            i10 = this.cleanedAndPointers;
            if (!(i10 != n() || i())) {
                return false;
            }
        } while (!f63292d.compareAndSet(this, i10, C.DEFAULT_BUFFER_SEGMENT_SIZE + i10));
        return true;
    }
}
