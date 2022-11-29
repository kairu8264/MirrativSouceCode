package ai;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.exoplayer2.C;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class lu1 {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public long F;

    /* renamed from: a  reason: collision with root package name */
    public final jt1 f6668a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f6669b;

    /* renamed from: c  reason: collision with root package name */
    public AudioTrack f6670c;

    /* renamed from: d  reason: collision with root package name */
    public int f6671d;

    /* renamed from: e  reason: collision with root package name */
    public int f6672e;

    /* renamed from: f  reason: collision with root package name */
    public js1 f6673f;

    /* renamed from: g  reason: collision with root package name */
    public int f6674g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6675h;

    /* renamed from: i  reason: collision with root package name */
    public long f6676i;

    /* renamed from: j  reason: collision with root package name */
    public float f6677j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6678k;

    /* renamed from: l  reason: collision with root package name */
    public long f6679l;

    /* renamed from: m  reason: collision with root package name */
    public long f6680m;

    /* renamed from: n  reason: collision with root package name */
    public Method f6681n;

    /* renamed from: o  reason: collision with root package name */
    public long f6682o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f6683p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f6684q;

    /* renamed from: r  reason: collision with root package name */
    public long f6685r;

    /* renamed from: s  reason: collision with root package name */
    public long f6686s;

    /* renamed from: t  reason: collision with root package name */
    public long f6687t;

    /* renamed from: u  reason: collision with root package name */
    public long f6688u;

    /* renamed from: v  reason: collision with root package name */
    public int f6689v;

    /* renamed from: w  reason: collision with root package name */
    public int f6690w;

    /* renamed from: x  reason: collision with root package name */
    public long f6691x;

    /* renamed from: y  reason: collision with root package name */
    public long f6692y;

    /* renamed from: z  reason: collision with root package name */
    public long f6693z;

    public lu1(jt1 jt1Var) {
        this.f6668a = jt1Var;
        if (sb.f9778a >= 18) {
            try {
                this.f6681n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f6669b = new long[10];
    }

    public final void a(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.f6670c = audioTrack;
        this.f6671d = i11;
        this.f6672e = i12;
        this.f6673f = new js1(audioTrack);
        this.f6674g = audioTrack.getSampleRate();
        this.f6675h = false;
        boolean p10 = sb.p(i10);
        this.f6684q = p10;
        this.f6676i = p10 ? m(i12 / i11) : -9223372036854775807L;
        this.f6686s = 0L;
        this.f6687t = 0L;
        this.f6688u = 0L;
        this.f6683p = false;
        this.f6691x = C.TIME_UNSET;
        this.f6692y = C.TIME_UNSET;
        this.f6685r = 0L;
        this.f6682o = 0L;
        this.f6677j = 1.0f;
    }

    public final long b(boolean z10) {
        long j10;
        gn1 gn1Var;
        gn1 gn1Var2;
        ej1 ej1Var;
        String str;
        long H;
        long I;
        long H2;
        long I2;
        Method method;
        AudioTrack audioTrack;
        lu1 lu1Var = this;
        AudioTrack audioTrack2 = lu1Var.f6670c;
        Objects.requireNonNull(audioTrack2);
        if (audioTrack2.getPlayState() == 3) {
            long m10 = lu1Var.m(o());
            if (m10 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - lu1Var.f6680m >= 30000) {
                    long[] jArr = lu1Var.f6669b;
                    int i10 = lu1Var.f6689v;
                    jArr[i10] = m10 - nanoTime;
                    lu1Var.f6689v = (i10 + 1) % 10;
                    int i11 = lu1Var.f6690w;
                    if (i11 < 10) {
                        lu1Var.f6690w = i11 + 1;
                    }
                    lu1Var.f6680m = nanoTime;
                    lu1Var.f6679l = 0L;
                    int i12 = 0;
                    while (true) {
                        int i13 = lu1Var.f6690w;
                        if (i12 >= i13) {
                            break;
                        }
                        lu1Var.f6679l += lu1Var.f6669b[i12] / i13;
                        i12++;
                    }
                }
                if (!lu1Var.f6675h) {
                    js1 js1Var = lu1Var.f6673f;
                    Objects.requireNonNull(js1Var);
                    if (js1Var.a(nanoTime)) {
                        long f10 = js1Var.f();
                        long g10 = js1Var.g();
                        if (Math.abs(f10 - nanoTime) > 5000000) {
                            q32 q32Var = (q32) lu1Var.f6668a;
                            H2 = q32Var.f8804a.H();
                            I2 = q32Var.f8804a.I();
                            StringBuilder sb2 = new StringBuilder(180);
                            sb2.append("Spurious audio timestamp (system clock mismatch): ");
                            sb2.append(g10);
                            sb2.append(", ");
                            sb2.append(f10);
                            sb2.append(", ");
                            sb2.append(nanoTime);
                            sb2.append(", ");
                            sb2.append(m10);
                            sb2.append(", ");
                            sb2.append(H2);
                            sb2.append(", ");
                            sb2.append(I2);
                            Log.w("DefaultAudioSink", sb2.toString());
                            js1Var.b();
                            lu1Var = this;
                            str = "DefaultAudioSink";
                        } else {
                            if (Math.abs(lu1Var.m(g10) - m10) > 5000000) {
                                q32 q32Var2 = (q32) lu1Var.f6668a;
                                H = q32Var2.f8804a.H();
                                I = q32Var2.f8804a.I();
                                StringBuilder sb3 = new StringBuilder(182);
                                sb3.append("Spurious audio timestamp (frame position mismatch): ");
                                sb3.append(g10);
                                sb3.append(", ");
                                sb3.append(f10);
                                sb3.append(", ");
                                sb3.append(nanoTime);
                                sb3.append(", ");
                                sb3.append(m10);
                                sb3.append(", ");
                                sb3.append(H);
                                sb3.append(", ");
                                sb3.append(I);
                                str = "DefaultAudioSink";
                                Log.w(str, sb3.toString());
                                js1Var.b();
                            } else {
                                str = "DefaultAudioSink";
                                js1Var.c();
                            }
                            lu1Var = this;
                        }
                    } else {
                        str = "DefaultAudioSink";
                    }
                    if (lu1Var.f6684q && (method = lu1Var.f6681n) != null && nanoTime - lu1Var.f6685r >= 500000) {
                        try {
                            Objects.requireNonNull(lu1Var.f6670c);
                            int i14 = sb.f9778a;
                            long intValue = (((Integer) method.invoke(audioTrack, new Object[0])).intValue() * 1000) - lu1Var.f6676i;
                            lu1Var.f6682o = intValue;
                            long max = Math.max(intValue, 0L);
                            lu1Var.f6682o = max;
                            if (max > 5000000) {
                                StringBuilder sb4 = new StringBuilder(61);
                                sb4.append("Ignoring impossibly large audio latency: ");
                                sb4.append(max);
                                Log.w(str, sb4.toString());
                                lu1Var.f6682o = 0L;
                            }
                        } catch (Exception unused) {
                            lu1Var.f6681n = null;
                        }
                        lu1Var.f6685r = nanoTime;
                    }
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        js1 js1Var2 = lu1Var.f6673f;
        Objects.requireNonNull(js1Var2);
        boolean d10 = js1Var2.d();
        if (d10) {
            j10 = lu1Var.m(js1Var2.g()) + sb.j(nanoTime2 - js1Var2.f(), lu1Var.f6677j);
        } else {
            if (lu1Var.f6690w == 0) {
                j10 = lu1Var.m(o());
            } else {
                j10 = lu1Var.f6679l + nanoTime2;
            }
            if (!z10) {
                j10 = Math.max(0L, j10 - lu1Var.f6682o);
            }
        }
        if (lu1Var.D != d10) {
            lu1Var.F = lu1Var.C;
            lu1Var.E = lu1Var.B;
        }
        long j11 = nanoTime2 - lu1Var.F;
        if (j11 < 1000000) {
            long j12 = (j11 * 1000) / 1000000;
            j10 = ((j10 * j12) + ((1000 - j12) * (lu1Var.E + sb.j(j11, lu1Var.f6677j)))) / 1000;
        }
        if (!lu1Var.f6678k) {
            long j13 = lu1Var.B;
            if (j10 > j13) {
                lu1Var.f6678k = true;
                long currentTimeMillis = System.currentTimeMillis() - y2.a(sb.k(y2.a(j10 - j13), lu1Var.f6677j));
                q32 q32Var3 = (q32) lu1Var.f6668a;
                gn1Var = q32Var3.f8804a.f10629k;
                if (gn1Var != null) {
                    gn1Var2 = q32Var3.f8804a.f10629k;
                    ej1Var = ((w92) gn1Var2).f11523a.Y0;
                    ej1Var.d(currentTimeMillis);
                }
            }
        }
        lu1Var.C = nanoTime2;
        lu1Var.B = j10;
        lu1Var.D = d10;
        return j10;
    }

    public final void c() {
        js1 js1Var = this.f6673f;
        Objects.requireNonNull(js1Var);
        js1Var.e();
    }

    public final boolean d() {
        AudioTrack audioTrack = this.f6670c;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    public final boolean e(long j10) {
        gn1 gn1Var;
        long j11;
        gn1 gn1Var2;
        ej1 ej1Var;
        AudioTrack audioTrack = this.f6670c;
        Objects.requireNonNull(audioTrack);
        int playState = audioTrack.getPlayState();
        if (this.f6675h) {
            if (playState == 2) {
                this.f6683p = false;
                return false;
            } else if (playState == 1) {
                if (o() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z10 = this.f6683p;
        boolean j12 = j(j10);
        this.f6683p = j12;
        if (z10 && !j12 && playState != 1) {
            jt1 jt1Var = this.f6668a;
            int i10 = this.f6672e;
            long a10 = y2.a(this.f6676i);
            q32 q32Var = (q32) jt1Var;
            gn1Var = q32Var.f8804a.f10629k;
            if (gn1Var != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                j11 = q32Var.f8804a.M;
                gn1Var2 = q32Var.f8804a.f10629k;
                ej1Var = ((w92) gn1Var2).f11523a.Y0;
                ej1Var.e(i10, a10, elapsedRealtime - j11);
            }
        }
        return true;
    }

    public final int f(long j10) {
        return this.f6672e - ((int) (j10 - (o() * this.f6671d)));
    }

    public final long g(long j10) {
        return y2.a(m(-o()));
    }

    public final boolean h(long j10) {
        return this.f6692y != C.TIME_UNSET && j10 > 0 && SystemClock.elapsedRealtime() - this.f6692y >= 200;
    }

    public final void i(long j10) {
        this.f6693z = o();
        this.f6691x = SystemClock.elapsedRealtime() * 1000;
        this.A = j10;
    }

    public final boolean j(long j10) {
        if (j10 <= o()) {
            if (this.f6675h) {
                AudioTrack audioTrack = this.f6670c;
                Objects.requireNonNull(audioTrack);
                return audioTrack.getPlayState() == 2 && o() == 0;
            }
            return false;
        }
        return true;
    }

    public final boolean k() {
        n();
        if (this.f6691x == C.TIME_UNSET) {
            js1 js1Var = this.f6673f;
            Objects.requireNonNull(js1Var);
            js1Var.e();
            return true;
        }
        return false;
    }

    public final void l() {
        n();
        this.f6670c = null;
        this.f6673f = null;
    }

    public final long m(long j10) {
        return (j10 * 1000000) / this.f6674g;
    }

    public final void n() {
        this.f6679l = 0L;
        this.f6690w = 0;
        this.f6689v = 0;
        this.f6680m = 0L;
        this.C = 0L;
        this.F = 0L;
        this.f6678k = false;
    }

    public final long o() {
        AudioTrack audioTrack = this.f6670c;
        Objects.requireNonNull(audioTrack);
        if (this.f6691x != C.TIME_UNSET) {
            return Math.min(this.A, this.f6693z + ((((SystemClock.elapsedRealtime() * 1000) - this.f6691x) * this.f6674g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.f6675h) {
            if (playState == 2) {
                if (playbackHeadPosition == 0) {
                    this.f6688u = this.f6686s;
                }
                playState = 2;
            }
            playbackHeadPosition += this.f6688u;
        }
        if (sb.f9778a <= 29) {
            if (playbackHeadPosition == 0 && this.f6686s > 0 && playState == 3) {
                if (this.f6692y == C.TIME_UNSET) {
                    this.f6692y = SystemClock.elapsedRealtime();
                }
                return this.f6686s;
            }
            this.f6692y = C.TIME_UNSET;
        }
        if (this.f6686s > playbackHeadPosition) {
            this.f6687t++;
        }
        this.f6686s = playbackHeadPosition;
        return playbackHeadPosition + (this.f6687t << 32);
    }
}
