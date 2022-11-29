package rp;

import com.google.android.exoplayer2.C;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public static final d0 f51672a = new d0();

    /* renamed from: b  reason: collision with root package name */
    public static final int f51673b = C.DEFAULT_BUFFER_SEGMENT_SIZE;

    /* renamed from: c  reason: collision with root package name */
    public static final c0 f51674c = new c0(new byte[0], 0, 0, false, false);

    /* renamed from: d  reason: collision with root package name */
    public static final int f51675d;

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicReference<c0>[] f51676e;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f51675d = highestOneBit;
        AtomicReference<c0>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i10 = 0; i10 < highestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference<>();
        }
        f51676e = atomicReferenceArr;
    }

    public static final void b(c0 c0Var) {
        AtomicReference<c0> a10;
        c0 c0Var2;
        jo.p.h(c0Var, "segment");
        if (c0Var.f51670f == null && c0Var.f51671g == null) {
            if (c0Var.f51668d || (c0Var2 = (a10 = f51672a.a()).get()) == f51674c) {
                return;
            }
            int i10 = c0Var2 == null ? 0 : c0Var2.f51667c;
            if (i10 >= f51673b) {
                return;
            }
            c0Var.f51670f = c0Var2;
            c0Var.f51666b = 0;
            c0Var.f51667c = i10 + 8192;
            if (a10.compareAndSet(c0Var2, c0Var)) {
                return;
            }
            c0Var.f51670f = null;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final c0 c() {
        AtomicReference<c0> a10 = f51672a.a();
        c0 c0Var = f51674c;
        c0 andSet = a10.getAndSet(c0Var);
        if (andSet == c0Var) {
            return new c0();
        }
        if (andSet == null) {
            a10.set(null);
            return new c0();
        }
        a10.set(andSet.f51670f);
        andSet.f51670f = null;
        andSet.f51667c = 0;
        return andSet;
    }

    public final AtomicReference<c0> a() {
        return f51676e[(int) (Thread.currentThread().getId() & (f51675d - 1))];
    }
}
