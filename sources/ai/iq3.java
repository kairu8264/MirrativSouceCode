package ai;

import android.support.v4.media.session.PlaybackStateCompat;

/* loaded from: classes3.dex */
public final class iq3 {

    /* renamed from: a  reason: collision with root package name */
    public final long f5325a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5326b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5327c;

    /* renamed from: d  reason: collision with root package name */
    public xr3 f5328d;

    /* renamed from: e  reason: collision with root package name */
    public iq3 f5329e;

    public iq3(long j10, int i10) {
        this.f5325a = j10;
        this.f5326b = j10 + PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
    }

    public final int a(long j10) {
        long j11 = this.f5325a;
        int i10 = this.f5328d.f12096b;
        return (int) (j10 - j11);
    }

    public final iq3 b() {
        this.f5328d = null;
        iq3 iq3Var = this.f5329e;
        this.f5329e = null;
        return iq3Var;
    }
}
