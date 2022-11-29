package ai;

import com.google.android.gms.internal.ads.zzaoa;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class vd implements bd {

    /* renamed from: b  reason: collision with root package name */
    public int f11023b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f11024c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f11025d = 0;

    /* renamed from: e  reason: collision with root package name */
    public ByteBuffer f11026e;

    /* renamed from: f  reason: collision with root package name */
    public ByteBuffer f11027f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11028g;

    public vd() {
        ByteBuffer byteBuffer = bd.f2291a;
        this.f11026e = byteBuffer;
        this.f11027f = byteBuffer;
    }

    @Override // ai.bd
    public final void a() {
        this.f11028g = true;
    }

    @Override // ai.bd
    public final int b() {
        return this.f11024c;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080 A[LOOP:2: B:25:0x0080->B:26:0x0082, LOOP_START, PHI: r0 
      PHI: (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:16:0x0040, B:26:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ai.bd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.nio.ByteBuffer r8) {
        /*
            r7 = this;
            int r0 = r8.position()
            int r1 = r8.limit()
            int r2 = r1 - r0
            int r3 = r7.f11025d
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 3
            if (r3 == r5) goto L20
            if (r3 == r6) goto L21
            if (r3 != r4) goto L1a
            int r2 = r2 / 2
            goto L22
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L20:
            int r2 = r2 / r6
        L21:
            int r2 = r2 + r2
        L22:
            java.nio.ByteBuffer r3 = r7.f11026e
            int r3 = r3.capacity()
            if (r3 >= r2) goto L39
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            r7.f11026e = r2
            goto L3e
        L39:
            java.nio.ByteBuffer r2 = r7.f11026e
            r2.clear()
        L3e:
            int r2 = r7.f11025d
            if (r2 == r5) goto L80
            if (r2 == r6) goto L67
            if (r2 != r4) goto L61
        L46:
            if (r0 >= r1) goto L9b
            java.nio.ByteBuffer r2 = r7.f11026e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f11026e
            int r3 = r0 + 3
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L46
        L61:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L67:
            if (r0 >= r1) goto L9b
            java.nio.ByteBuffer r2 = r7.f11026e
            r3 = 0
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f11026e
            byte r3 = r8.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + (-128)
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L67
        L80:
            if (r0 >= r1) goto L9b
            java.nio.ByteBuffer r2 = r7.f11026e
            int r3 = r0 + 1
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f11026e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L80
        L9b:
            int r0 = r8.limit()
            r8.position(r0)
            java.nio.ByteBuffer r8 = r7.f11026e
            r8.flip()
            java.nio.ByteBuffer r8 = r7.f11026e
            r7.f11027f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.vd.c(java.nio.ByteBuffer):void");
    }

    @Override // ai.bd
    public final int d() {
        return 2;
    }

    @Override // ai.bd
    public final boolean e() {
        return this.f11028g && this.f11027f == bd.f2291a;
    }

    @Override // ai.bd
    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.f11027f;
        this.f11027f = bd.f2291a;
        return byteBuffer;
    }

    @Override // ai.bd
    public final void g() {
        h();
        this.f11026e = bd.f2291a;
        this.f11023b = -1;
        this.f11024c = -1;
        this.f11025d = 0;
    }

    @Override // ai.bd
    public final void h() {
        this.f11027f = bd.f2291a;
        this.f11028g = false;
    }

    @Override // ai.bd
    public final boolean i(int i10, int i11, int i12) throws zzaoa {
        if (i12 == 3 || i12 == 2 || i12 == Integer.MIN_VALUE || i12 == 1073741824) {
            if (this.f11023b == i10 && this.f11024c == i11 && this.f11025d == i12) {
                return false;
            }
            this.f11023b = i10;
            this.f11024c = i11;
            this.f11025d = i12;
            if (i12 == 2) {
                this.f11026e = bd.f2291a;
                return true;
            }
            return true;
        }
        throw new zzaoa(i10, i11, i12);
    }

    @Override // ai.bd
    public final boolean zzb() {
        int i10 = this.f11025d;
        return (i10 == 0 || i10 == 2) ? false : true;
    }
}
