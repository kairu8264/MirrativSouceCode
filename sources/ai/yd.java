package ai;

import com.google.android.gms.internal.ads.zzaoa;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes3.dex */
public final class yd implements bd {

    /* renamed from: d  reason: collision with root package name */
    public wd f12535d;

    /* renamed from: g  reason: collision with root package name */
    public ByteBuffer f12538g;

    /* renamed from: h  reason: collision with root package name */
    public ShortBuffer f12539h;

    /* renamed from: i  reason: collision with root package name */
    public ByteBuffer f12540i;

    /* renamed from: j  reason: collision with root package name */
    public long f12541j;

    /* renamed from: k  reason: collision with root package name */
    public long f12542k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f12543l;

    /* renamed from: e  reason: collision with root package name */
    public float f12536e = 1.0f;

    /* renamed from: f  reason: collision with root package name */
    public float f12537f = 1.0f;

    /* renamed from: b  reason: collision with root package name */
    public int f12533b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f12534c = -1;

    public yd() {
        ByteBuffer byteBuffer = bd.f2291a;
        this.f12538g = byteBuffer;
        this.f12539h = byteBuffer.asShortBuffer();
        this.f12540i = byteBuffer;
    }

    @Override // ai.bd
    public final void a() {
        this.f12535d.e();
        this.f12543l = true;
    }

    @Override // ai.bd
    public final int b() {
        return this.f12533b;
    }

    @Override // ai.bd
    public final void c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f12541j += remaining;
            this.f12535d.c(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int f10 = this.f12535d.f() * this.f12533b;
        int i10 = f10 + f10;
        if (i10 > 0) {
            if (this.f12538g.capacity() < i10) {
                ByteBuffer order = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
                this.f12538g = order;
                this.f12539h = order.asShortBuffer();
            } else {
                this.f12538g.clear();
                this.f12539h.clear();
            }
            this.f12535d.d(this.f12539h);
            this.f12542k += i10;
            this.f12538g.limit(i10);
            this.f12540i = this.f12538g;
        }
    }

    @Override // ai.bd
    public final int d() {
        return 2;
    }

    @Override // ai.bd
    public final boolean e() {
        wd wdVar;
        return this.f12543l && ((wdVar = this.f12535d) == null || wdVar.f() == 0);
    }

    @Override // ai.bd
    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.f12540i;
        this.f12540i = bd.f2291a;
        return byteBuffer;
    }

    @Override // ai.bd
    public final void g() {
        this.f12535d = null;
        ByteBuffer byteBuffer = bd.f2291a;
        this.f12538g = byteBuffer;
        this.f12539h = byteBuffer.asShortBuffer();
        this.f12540i = byteBuffer;
        this.f12533b = -1;
        this.f12534c = -1;
        this.f12541j = 0L;
        this.f12542k = 0L;
        this.f12543l = false;
    }

    @Override // ai.bd
    public final void h() {
        wd wdVar = new wd(this.f12534c, this.f12533b);
        this.f12535d = wdVar;
        wdVar.a(this.f12536e);
        this.f12535d.b(this.f12537f);
        this.f12540i = bd.f2291a;
        this.f12541j = 0L;
        this.f12542k = 0L;
        this.f12543l = false;
    }

    @Override // ai.bd
    public final boolean i(int i10, int i11, int i12) throws zzaoa {
        if (i12 == 2) {
            if (this.f12534c == i10 && this.f12533b == i11) {
                return false;
            }
            this.f12534c = i10;
            this.f12533b = i11;
            return true;
        }
        throw new zzaoa(i10, i11, i12);
    }

    public final float j(float f10) {
        float g10 = vj.g(f10, 0.1f, 8.0f);
        this.f12536e = g10;
        return g10;
    }

    public final float k(float f10) {
        this.f12537f = vj.g(1.0f, 0.1f, 8.0f);
        return 1.0f;
    }

    public final long l() {
        return this.f12541j;
    }

    public final long m() {
        return this.f12542k;
    }

    @Override // ai.bd
    public final boolean zzb() {
        return Math.abs(this.f12536e + (-1.0f)) >= 0.01f || Math.abs(this.f12537f + (-1.0f)) >= 0.01f;
    }
}
