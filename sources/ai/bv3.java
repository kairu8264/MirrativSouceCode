package ai;

import com.google.android.exoplayer2.C;

/* loaded from: classes3.dex */
public final class bv3 {

    /* renamed from: d  reason: collision with root package name */
    public static final bv3 f2561d = new bv3(-3, C.TIME_UNSET, -1);

    /* renamed from: a  reason: collision with root package name */
    public final int f2562a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2563b;

    /* renamed from: c  reason: collision with root package name */
    public final long f2564c;

    public bv3(int i10, long j10, long j11) {
        this.f2562a = i10;
        this.f2563b = j10;
        this.f2564c = j11;
    }

    public static bv3 d(long j10, long j11) {
        return new bv3(-1, j10, j11);
    }

    public static bv3 e(long j10, long j11) {
        return new bv3(-2, j10, j11);
    }

    public static bv3 f(long j10) {
        return new bv3(0, C.TIME_UNSET, j10);
    }
}
