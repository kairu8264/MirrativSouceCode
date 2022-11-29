package dp;

import zo.k0;
import zo.n0;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final int f29770a;

    /* renamed from: b  reason: collision with root package name */
    public static final k0 f29771b;

    /* renamed from: c  reason: collision with root package name */
    public static final k0 f29772c;

    /* renamed from: d  reason: collision with root package name */
    public static final k0 f29773d;

    /* renamed from: e  reason: collision with root package name */
    public static final k0 f29774e;

    /* renamed from: f  reason: collision with root package name */
    public static final int f29775f;

    static {
        int d10;
        int d11;
        d10 = n0.d("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
        f29770a = d10;
        f29771b = new k0("PERMIT");
        f29772c = new k0("TAKEN");
        f29773d = new k0("BROKEN");
        f29774e = new k0("CANCELLED");
        d11 = n0.d("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
        f29775f = d11;
    }

    public static final f a(int i10, int i11) {
        return new g(i10, i11);
    }

    public static /* synthetic */ f b(int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return a(i10, i11);
    }

    public static final i j(long j10, i iVar) {
        return new i(j10, iVar, 0);
    }
}
