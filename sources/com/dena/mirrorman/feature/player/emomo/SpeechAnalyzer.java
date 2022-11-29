package com.dena.mirrorman.feature.player.emomo;

import ao.d;
import ao.g;
import co.f;
import co.l;
import com.dena.mirrorman.unity.UnityManager;
import io.p;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import jo.h;
import uo.b0;
import uo.d2;
import uo.i2;
import uo.l0;
import uo.q0;
import uo.v1;
import wn.m;
import wn.v;

/* loaded from: classes2.dex */
public final class SpeechAnalyzer {

    /* renamed from: h  reason: collision with root package name */
    public static final a f25947h = new a(null);

    /* renamed from: i  reason: collision with root package name */
    public static final int f25948i = 8;

    /* renamed from: a  reason: collision with root package name */
    public boolean f25949a;

    /* renamed from: d  reason: collision with root package name */
    public int f25952d;

    /* renamed from: e  reason: collision with root package name */
    public int f25953e;

    /* renamed from: f  reason: collision with root package name */
    public d2 f25954f;

    /* renamed from: b  reason: collision with root package name */
    public ue.b f25950b = ue.b.EMPTY;

    /* renamed from: c  reason: collision with root package name */
    public ue.a f25951c = ue.a.LEVEL0;

    /* renamed from: g  reason: collision with root package name */
    public final l0 f25955g = new c(l0.f56050r, this);

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    @f(c = "com.dena.mirrorman.feature.player.emomo.SpeechAnalyzer$onAudioLoaded$1", f = "SpeechAnalyzer.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends l implements p<q0, d<? super v>, Object> {
        public final /* synthetic */ double[] A;
        public final /* synthetic */ double B;

        /* renamed from: w  reason: collision with root package name */
        public int f25956w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f25958y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ double[] f25959z;

        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f25960a;

            static {
                int[] iArr = new int[ue.b.values().length];
                iArr[ue.b.EMPTY.ordinal()] = 1;
                f25960a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, double[] dArr, double[] dArr2, double d10, d<? super b> dVar) {
            super(2, dVar);
            this.f25958y = i10;
            this.f25959z = dArr;
            this.A = dArr2;
            this.B = d10;
        }

        @Override // co.a
        public final d<v> create(Object obj, d<?> dVar) {
            return new b(this.f25958y, this.f25959z, this.A, this.B, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            v vVar;
            ue.a c10;
            bo.c.c();
            if (this.f25956w == 0) {
                m.b(obj);
                try {
                    SpeechAnalyzer.this.analyze(this.f25958y, this.f25959z, this.A);
                    ue.b a10 = ue.b.Companion.a(this.A);
                    ue.a a11 = ue.a.Companion.a(this.B);
                    g9.a.g("onAudioLoaded f0 = " + this.A[0] + " f1 = " + this.A[1] + " rip = " + a10.name() + " db = " + this.B);
                    if (a10 == SpeechAnalyzer.this.f25950b && a11 == SpeechAnalyzer.this.f25951c) {
                        vVar = v.f59242a;
                    } else {
                        double[] dArr = this.A;
                        if (dArr[1] >= dArr[0]) {
                            if (a.f25960a[a10.ordinal()] != 1) {
                                if (a10 != SpeechAnalyzer.this.f25950b) {
                                    c10 = a11.c();
                                } else if (a11.e() > SpeechAnalyzer.this.f25951c.e()) {
                                    c10 = SpeechAnalyzer.this.f25951c.h();
                                } else if (a11.e() < SpeechAnalyzer.this.f25951c.e()) {
                                    c10 = SpeechAnalyzer.this.f25951c.c();
                                } else {
                                    vVar = v.f59242a;
                                }
                                UnityManager.Companion.getInstance().setMouth(a10, c10);
                                SpeechAnalyzer.this.f25951c = c10;
                                SpeechAnalyzer.this.f25950b = a10;
                                SpeechAnalyzer.this.f25953e = 0;
                            } else {
                                SpeechAnalyzer.this.f25953e++;
                            }
                            if (SpeechAnalyzer.this.f25953e > 2) {
                                SpeechAnalyzer.this.f25951c = a11.c();
                                SpeechAnalyzer.this.f25953e = 0;
                                UnityManager.Companion.getInstance().setMouth(a10, SpeechAnalyzer.this.f25951c);
                            }
                            SpeechAnalyzer.this.f25954f = null;
                            return v.f59242a;
                        }
                        vVar = v.f59242a;
                    }
                    return vVar;
                } finally {
                    SpeechAnalyzer.this.f25954f = null;
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends ao.a implements l0 {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ SpeechAnalyzer f25961w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(l0.a aVar, SpeechAnalyzer speechAnalyzer) {
            super(aVar);
            this.f25961w = speechAnalyzer;
        }

        @Override // uo.l0
        public void handleException(g gVar, Throwable th2) {
            UnityManager.Companion.getInstance().setMouth(ue.b.EMPTY, ue.a.LEVEL0);
            g9.a.c(th2);
            this.f25961w.f25949a = true;
        }
    }

    static {
        System.loadLibrary("voice-analyzer");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native double[] analyze(long j10, double[] dArr, double[] dArr2);

    public final double j(double[] dArr, int i10) {
        double d10 = 0.0d;
        for (double d11 : dArr) {
            d10 += Math.pow(d11, 2.0d);
        }
        return 20 * Math.log10(Math.sqrt(d10 / i10));
    }

    public final void k(byte[] bArr, int i10) {
        b0 b10;
        jo.p.h(bArr, "pcmAudio");
        if (this.f25949a || UnityManager.Companion.getInstance().isLoadingAvatar()) {
            return;
        }
        int i11 = this.f25952d + 1;
        this.f25952d = i11;
        if (i11 % i10 != 0) {
            return;
        }
        int length = bArr.length / 2;
        short[] sArr = new short[length];
        ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(sArr);
        double[] dArr = new double[length];
        for (int i12 = 0; i12 < length; i12++) {
            dArr[i12] = sArr[i12] / 32768.0d;
        }
        double j10 = j(dArr, length);
        double[] dArr2 = new double[2];
        if (j10 < -32.0d) {
            ue.a aVar = this.f25951c;
            if (aVar == ue.a.LEVEL0) {
                return;
            }
            this.f25951c = aVar.c();
            UnityManager.Companion.getInstance().setMouth(this.f25950b, this.f25951c);
        } else if (this.f25954f == null) {
            b10 = i2.b(null, 1, null);
            this.f25954f = b10;
            uo.l.d(v1.f56093w, this.f25955g.plus(b10), null, new b(length, dArr, dArr2, j10, null), 2, null);
        } else {
            g9.a.g("onAudioLoaded skipped");
        }
    }
}
