package ai;

import android.util.Log;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.DefaultRenderersFactory;

/* loaded from: classes3.dex */
public final class b3 implements x4 {

    /* renamed from: a  reason: collision with root package name */
    public final is3 f2206a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2207b;

    /* renamed from: c  reason: collision with root package name */
    public final long f2208c;

    /* renamed from: d  reason: collision with root package name */
    public final long f2209d;

    /* renamed from: e  reason: collision with root package name */
    public final long f2210e;

    /* renamed from: f  reason: collision with root package name */
    public final long f2211f;

    /* renamed from: g  reason: collision with root package name */
    public int f2212g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2213h;

    public b3() {
        is3 is3Var = new is3(true, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        i(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS, 0, "bufferForPlaybackMs", "0");
        i(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        i(50000, DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS, "minBufferMs", "bufferForPlaybackMs");
        i(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        i(50000, 50000, "maxBufferMs", "minBufferMs");
        i(0, 0, "backBufferDurationMs", "0");
        this.f2206a = is3Var;
        this.f2207b = y2.b(50000L);
        this.f2208c = y2.b(50000L);
        this.f2209d = y2.b(2500L);
        this.f2210e = y2.b(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
        this.f2212g = 13107200;
        this.f2211f = y2.b(0L);
    }

    public static void i(int i10, int i11, String str, String str2) {
        boolean z10 = i10 >= i11;
        StringBuilder sb2 = new StringBuilder(str.length() + 21 + str2.length());
        sb2.append(str);
        sb2.append(" cannot be less than ");
        sb2.append(str2);
        u9.b(z10, sb2.toString());
    }

    public final void a(boolean z10) {
        this.f2212g = 13107200;
        this.f2213h = false;
        if (z10) {
            this.f2206a.a();
        }
    }

    @Override // ai.x4
    public final void b() {
        a(true);
    }

    @Override // ai.x4
    public final boolean c() {
        return false;
    }

    @Override // ai.x4
    public final long d() {
        return this.f2211f;
    }

    @Override // ai.x4
    public final is3 e() {
        return this.f2206a;
    }

    @Override // ai.x4
    public final boolean f(long j10, float f10, boolean z10, long j11) {
        long k10 = sb.k(j10, f10);
        long j12 = z10 ? this.f2210e : this.f2209d;
        if (j11 != C.TIME_UNSET) {
            j12 = Math.min(j11 / 2, j12);
        }
        return j12 <= 0 || k10 >= j12 || this.f2206a.g() >= this.f2212g;
    }

    @Override // ai.x4
    public final void g(u6[] u6VarArr, uz3 uz3Var, br3[] br3VarArr) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 < 2) {
                if (br3VarArr[i10] != null) {
                    i11 += u6VarArr[i10].U() != 1 ? DefaultLoadControl.DEFAULT_VIDEO_BUFFER_SIZE : 13107200;
                }
                i10++;
            } else {
                int max = Math.max(13107200, i11);
                this.f2212g = max;
                this.f2206a.b(max);
                return;
            }
        }
    }

    @Override // ai.x4
    public final boolean h(long j10, long j11, float f10) {
        int g10 = this.f2206a.g();
        int i10 = this.f2212g;
        long j12 = this.f2207b;
        if (f10 > 1.0f) {
            j12 = Math.min(sb.j(j12, f10), this.f2208c);
        }
        if (j11 < Math.max(j12, 500000L)) {
            boolean z10 = g10 < i10;
            this.f2213h = z10;
            if (!z10 && j11 < 500000) {
                Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.f2208c || g10 >= i10) {
            this.f2213h = false;
        }
        return this.f2213h;
    }

    @Override // ai.x4
    public final void zza() {
        a(false);
    }

    @Override // ai.x4
    public final void zzb() {
        a(true);
    }
}
