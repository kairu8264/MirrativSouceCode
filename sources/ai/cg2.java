package ai;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.internal.ads.zzdd;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class cg2 implements u71 {

    /* renamed from: b  reason: collision with root package name */
    public int f2810b;

    /* renamed from: c  reason: collision with root package name */
    public float f2811c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f2812d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    public t51 f2813e;

    /* renamed from: f  reason: collision with root package name */
    public t51 f2814f;

    /* renamed from: g  reason: collision with root package name */
    public t51 f2815g;

    /* renamed from: h  reason: collision with root package name */
    public t51 f2816h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2817i;

    /* renamed from: j  reason: collision with root package name */
    public bf2 f2818j;

    /* renamed from: k  reason: collision with root package name */
    public ByteBuffer f2819k;

    /* renamed from: l  reason: collision with root package name */
    public ShortBuffer f2820l;

    /* renamed from: m  reason: collision with root package name */
    public ByteBuffer f2821m;

    /* renamed from: n  reason: collision with root package name */
    public long f2822n;

    /* renamed from: o  reason: collision with root package name */
    public long f2823o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2824p;

    public cg2() {
        t51 t51Var = t51.f10147e;
        this.f2813e = t51Var;
        this.f2814f = t51Var;
        this.f2815g = t51Var;
        this.f2816h = t51Var;
        ByteBuffer byteBuffer = u71.f10618a;
        this.f2819k = byteBuffer;
        this.f2820l = byteBuffer.asShortBuffer();
        this.f2821m = byteBuffer;
        this.f2810b = -1;
    }

    @Override // ai.u71
    public final boolean a() {
        bf2 bf2Var;
        return this.f2824p && ((bf2Var = this.f2818j) == null || bf2Var.f() == 0);
    }

    @Override // ai.u71
    public final t51 b(t51 t51Var) throws zzdd {
        if (t51Var.f10150c == 2) {
            int i10 = this.f2810b;
            if (i10 == -1) {
                i10 = t51Var.f10148a;
            }
            this.f2813e = t51Var;
            t51 t51Var2 = new t51(i10, t51Var.f10149b, 2);
            this.f2814f = t51Var2;
            this.f2817i = true;
            return t51Var2;
        }
        throw new zzdd(t51Var);
    }

    @Override // ai.u71
    public final ByteBuffer c() {
        int f10;
        bf2 bf2Var = this.f2818j;
        if (bf2Var != null && (f10 = bf2Var.f()) > 0) {
            if (this.f2819k.capacity() < f10) {
                ByteBuffer order = ByteBuffer.allocateDirect(f10).order(ByteOrder.nativeOrder());
                this.f2819k = order;
                this.f2820l = order.asShortBuffer();
            } else {
                this.f2819k.clear();
                this.f2820l.clear();
            }
            bf2Var.c(this.f2820l);
            this.f2823o += f10;
            this.f2819k.limit(f10);
            this.f2821m = this.f2819k;
        }
        ByteBuffer byteBuffer = this.f2821m;
        this.f2821m = u71.f10618a;
        return byteBuffer;
    }

    @Override // ai.u71
    public final void d() {
        bf2 bf2Var = this.f2818j;
        if (bf2Var != null) {
            bf2Var.d();
        }
        this.f2824p = true;
    }

    @Override // ai.u71
    public final void e() {
        this.f2811c = 1.0f;
        this.f2812d = 1.0f;
        t51 t51Var = t51.f10147e;
        this.f2813e = t51Var;
        this.f2814f = t51Var;
        this.f2815g = t51Var;
        this.f2816h = t51Var;
        ByteBuffer byteBuffer = u71.f10618a;
        this.f2819k = byteBuffer;
        this.f2820l = byteBuffer.asShortBuffer();
        this.f2821m = byteBuffer;
        this.f2810b = -1;
        this.f2817i = false;
        this.f2818j = null;
        this.f2822n = 0L;
        this.f2823o = 0L;
        this.f2824p = false;
    }

    @Override // ai.u71
    public final void f() {
        if (zzb()) {
            t51 t51Var = this.f2813e;
            this.f2815g = t51Var;
            t51 t51Var2 = this.f2814f;
            this.f2816h = t51Var2;
            if (this.f2817i) {
                this.f2818j = new bf2(t51Var.f10148a, t51Var.f10149b, this.f2811c, this.f2812d, t51Var2.f10148a);
            } else {
                bf2 bf2Var = this.f2818j;
                if (bf2Var != null) {
                    bf2Var.e();
                }
            }
        }
        this.f2821m = u71.f10618a;
        this.f2822n = 0L;
        this.f2823o = 0L;
        this.f2824p = false;
    }

    @Override // ai.u71
    public final void g(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            bf2 bf2Var = this.f2818j;
            Objects.requireNonNull(bf2Var);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f2822n += remaining;
            bf2Var.b(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    public final void h(float f10) {
        if (this.f2811c != f10) {
            this.f2811c = f10;
            this.f2817i = true;
        }
    }

    public final void i(float f10) {
        if (this.f2812d != f10) {
            this.f2812d = f10;
            this.f2817i = true;
        }
    }

    public final long j(long j10) {
        if (this.f2823o >= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            long j11 = this.f2822n;
            bf2 bf2Var = this.f2818j;
            Objects.requireNonNull(bf2Var);
            long a10 = j11 - bf2Var.a();
            int i10 = this.f2816h.f10148a;
            int i11 = this.f2815g.f10148a;
            if (i10 == i11) {
                return sb.h(j10, a10, this.f2823o);
            }
            return sb.h(j10, a10 * i10, this.f2823o * i11);
        }
        return (long) (this.f2811c * j10);
    }

    @Override // ai.u71
    public final boolean zzb() {
        if (this.f2814f.f10148a != -1) {
            if (Math.abs(this.f2811c - 1.0f) >= 1.0E-4f || Math.abs(this.f2812d - 1.0f) >= 1.0E-4f) {
                return true;
            }
            return this.f2814f.f10148a != this.f2813e.f10148a;
        }
        return false;
    }
}
