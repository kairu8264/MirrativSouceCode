package ai;

import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import com.google.android.gms.internal.ads.zzdd;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class ae2 extends lv1 {

    /* renamed from: i  reason: collision with root package name */
    public int f1830i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1831j;

    /* renamed from: k  reason: collision with root package name */
    public byte[] f1832k;

    /* renamed from: l  reason: collision with root package name */
    public byte[] f1833l;

    /* renamed from: m  reason: collision with root package name */
    public int f1834m;

    /* renamed from: n  reason: collision with root package name */
    public int f1835n;

    /* renamed from: o  reason: collision with root package name */
    public int f1836o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1837p;

    /* renamed from: q  reason: collision with root package name */
    public long f1838q;

    public ae2() {
        byte[] bArr = sb.f9783f;
        this.f1832k = bArr;
        this.f1833l = bArr;
    }

    @Override // ai.u71
    public final void g(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !i()) {
            int i10 = this.f1834m;
            if (i10 == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f1832k.length));
                int limit2 = byteBuffer.limit();
                while (true) {
                    limit2 -= 2;
                    if (limit2 >= byteBuffer.position()) {
                        if (Math.abs((int) byteBuffer.getShort(limit2)) > 1024) {
                            int i11 = this.f1830i;
                            position = ((limit2 / i11) * i11) + i11;
                            break;
                        }
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f1834m = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    h(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f1837p = true;
                    }
                }
                byteBuffer.limit(limit);
            } else if (i10 != 1) {
                int limit3 = byteBuffer.limit();
                int s10 = s(byteBuffer);
                byteBuffer.limit(s10);
                this.f1838q += byteBuffer.remaining() / this.f1830i;
                q(byteBuffer, this.f1833l, this.f1836o);
                if (s10 < limit3) {
                    p(this.f1833l, this.f1836o);
                    this.f1834m = 0;
                    byteBuffer.limit(limit3);
                }
            } else {
                int limit4 = byteBuffer.limit();
                int s11 = s(byteBuffer);
                int position2 = s11 - byteBuffer.position();
                byte[] bArr = this.f1832k;
                int length = bArr.length;
                int i12 = this.f1835n;
                int i13 = length - i12;
                if (s11 < limit4 && position2 < i13) {
                    p(bArr, i12);
                    this.f1835n = 0;
                    this.f1834m = 0;
                } else {
                    int min = Math.min(position2, i13);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f1832k, this.f1835n, min);
                    int i14 = this.f1835n + min;
                    this.f1835n = i14;
                    byte[] bArr2 = this.f1832k;
                    if (i14 == bArr2.length) {
                        if (this.f1837p) {
                            p(bArr2, this.f1836o);
                            long j10 = this.f1838q;
                            int i15 = this.f1835n;
                            int i16 = this.f1836o;
                            this.f1838q = j10 + ((i15 - (i16 + i16)) / this.f1830i);
                            i14 = i15;
                        } else {
                            this.f1838q += (i14 - this.f1836o) / this.f1830i;
                        }
                        q(byteBuffer, this.f1832k, i14);
                        this.f1835n = 0;
                        this.f1834m = 2;
                    }
                    byteBuffer.limit(limit4);
                }
            }
        }
    }

    @Override // ai.lv1
    public final t51 j(t51 t51Var) throws zzdd {
        if (t51Var.f10150c == 2) {
            return this.f1831j ? t51Var : t51.f10147e;
        }
        throw new zzdd(t51Var);
    }

    @Override // ai.lv1
    public final void k() {
        int i10 = this.f1835n;
        if (i10 > 0) {
            p(this.f1832k, i10);
        }
        if (this.f1837p) {
            return;
        }
        this.f1838q += this.f1836o / this.f1830i;
    }

    @Override // ai.lv1
    public final void l() {
        if (this.f1831j) {
            this.f1830i = this.f6695b.f10151d;
            int r10 = r(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) * this.f1830i;
            if (this.f1832k.length != r10) {
                this.f1832k = new byte[r10];
            }
            int r11 = r(SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US) * this.f1830i;
            this.f1836o = r11;
            if (this.f1833l.length != r11) {
                this.f1833l = new byte[r11];
            }
        }
        this.f1834m = 0;
        this.f1838q = 0L;
        this.f1835n = 0;
        this.f1837p = false;
    }

    @Override // ai.lv1
    public final void m() {
        this.f1831j = false;
        this.f1836o = 0;
        byte[] bArr = sb.f9783f;
        this.f1832k = bArr;
        this.f1833l = bArr;
    }

    public final void n(boolean z10) {
        this.f1831j = z10;
    }

    public final long o() {
        return this.f1838q;
    }

    public final void p(byte[] bArr, int i10) {
        h(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f1837p = true;
        }
    }

    public final void q(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.f1836o);
        int i11 = this.f1836o - min;
        System.arraycopy(bArr, i10 - i11, this.f1833l, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f1833l, i11, min);
    }

    public final int r(long j10) {
        return (int) ((j10 * this.f6695b.f10148a) / 1000000);
    }

    public final int s(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > 1024) {
                int i10 = this.f1830i;
                return i10 * (position / i10);
            }
        }
        return byteBuffer.limit();
    }

    @Override // ai.lv1, ai.u71
    public final boolean zzb() {
        return this.f1831j;
    }
}
