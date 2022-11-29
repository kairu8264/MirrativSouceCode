package ai;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import com.google.android.exoplayer2.C;
import com.google.android.gms.internal.ads.zzamy;
import com.google.android.gms.internal.ads.zzarm;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@TargetApi(19)
/* loaded from: classes3.dex */
public abstract class gg extends yb {
    public static final byte[] P = vj.m("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    public ByteBuffer[] A;
    public ByteBuffer[] B;
    public long C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public de O;

    /* renamed from: i  reason: collision with root package name */
    public final ig f4410i;

    /* renamed from: j  reason: collision with root package name */
    public final ee f4411j;

    /* renamed from: k  reason: collision with root package name */
    public final ee f4412k;

    /* renamed from: l  reason: collision with root package name */
    public final pc f4413l;

    /* renamed from: m  reason: collision with root package name */
    public final List<Long> f4414m;

    /* renamed from: n  reason: collision with root package name */
    public final MediaCodec.BufferInfo f4415n;

    /* renamed from: o  reason: collision with root package name */
    public oc f4416o;

    /* renamed from: p  reason: collision with root package name */
    public MediaCodec f4417p;

    /* renamed from: q  reason: collision with root package name */
    public fg f4418q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f4419r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f4420s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f4421t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f4422u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f4423v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f4424w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f4425x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f4426y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f4427z;

    public gg(int i10, ig igVar, je jeVar, boolean z10) {
        super(i10);
        fj.d(vj.f11100a >= 16);
        this.f4410i = igVar;
        this.f4411j = new ee(0);
        this.f4412k = new ee(0);
        this.f4413l = new pc();
        this.f4414m = new ArrayList();
        this.f4415n = new MediaCodec.BufferInfo();
        this.H = 0;
        this.I = 0;
    }

    public final void A() throws zzamy {
        if (this.I == 2) {
            U();
            L();
            return;
        }
        this.M = true;
        K();
    }

    public abstract int B(ig igVar, oc ocVar) throws zzarm;

    public fg C(ig igVar, oc ocVar, boolean z10) throws zzarm {
        return og.a(ocVar.B, false);
    }

    @Override // ai.rc
    public boolean D() {
        return this.M;
    }

    public abstract void E(fg fgVar, MediaCodec mediaCodec, oc ocVar, MediaCrypto mediaCrypto) throws zzarm;

    public abstract void G(String str, long j10, long j11);

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        if (r6.G == r0.G) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void H(ai.oc r6) throws com.google.android.gms.internal.ads.zzamy {
        /*
            r5 = this;
            ai.oc r0 = r5.f4416o
            r5.f4416o = r6
            ai.ie r6 = r6.E
            if (r0 != 0) goto La
            r1 = 0
            goto Lc
        La:
            ai.ie r1 = r0.E
        Lc:
            boolean r6 = ai.vj.a(r6, r1)
            if (r6 != 0) goto L29
            ai.oc r6 = r5.f4416o
            ai.ie r6 = r6.E
            if (r6 != 0) goto L19
            goto L29
        L19:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r6.<init>(r0)
            int r0 = r5.y()
            com.google.android.gms.internal.ads.zzamy r6 = com.google.android.gms.internal.ads.zzamy.a(r6, r0)
            throw r6
        L29:
            android.media.MediaCodec r6 = r5.f4417p
            r1 = 1
            if (r6 == 0) goto L56
            ai.fg r2 = r5.f4418q
            boolean r2 = r2.f4012b
            ai.oc r3 = r5.f4416o
            boolean r6 = r5.W(r6, r2, r0, r3)
            if (r6 == 0) goto L56
            r5.G = r1
            r5.H = r1
            boolean r6 = r5.f4421t
            r2 = 0
            if (r6 == 0) goto L52
            ai.oc r6 = r5.f4416o
            int r3 = r6.F
            int r4 = r0.F
            if (r3 != r4) goto L52
            int r6 = r6.G
            int r0 = r0.G
            if (r6 != r0) goto L52
            goto L53
        L52:
            r1 = r2
        L53:
            r5.f4426y = r1
            return
        L56:
            boolean r6 = r5.J
            if (r6 == 0) goto L5d
            r5.I = r1
            return
        L5d:
            r5.U()
            r5.L()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.gg.H(ai.oc):void");
    }

    public abstract void I(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzamy;

    public abstract boolean J(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, int i11, long j12, boolean z10) throws zzamy;

    public void K() throws zzamy {
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x015c A[Catch: Exception -> 0x01d1, TryCatch #1 {Exception -> 0x01d1, blocks: (B:99:0x014c, B:101:0x015c, B:103:0x0167, B:102:0x0161), top: B:116:0x014c }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0161 A[Catch: Exception -> 0x01d1, TryCatch #1 {Exception -> 0x01d1, blocks: (B:99:0x014c, B:101:0x015c, B:103:0x0167, B:102:0x0161), top: B:116:0x014c }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L() throws com.google.android.gms.internal.ads.zzamy {
        /*
            Method dump skipped, instructions count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.gg.L():void");
    }

    @Override // ai.rc
    public boolean M() {
        if (this.f4416o != null) {
            if (n() || this.E >= 0) {
                return true;
            }
            if (this.C != C.TIME_UNSET && SystemClock.elapsedRealtime() < this.C) {
                return true;
            }
        }
        return false;
    }

    @Override // ai.rc
    public final void N(long j10, long j11) throws zzamy {
        boolean J;
        int dequeueOutputBuffer;
        boolean z10;
        if (this.M) {
            K();
            return;
        }
        if (this.f4416o == null) {
            this.f4412k.a();
            int b10 = b(this.f4413l, this.f4412k, true);
            if (b10 != -5) {
                if (b10 == -4) {
                    fj.d(this.f4412k.c());
                    this.L = true;
                    A();
                    return;
                }
                return;
            }
            H(this.f4413l.f8372a);
        }
        L();
        if (this.f4417p != null) {
            tj.a("drainAndFeed");
            while (true) {
                if (this.E < 0) {
                    if (this.f4424w && this.K) {
                        try {
                            dequeueOutputBuffer = this.f4417p.dequeueOutputBuffer(this.f4415n, 0L);
                            this.E = dequeueOutputBuffer;
                        } catch (IllegalStateException unused) {
                            A();
                            if (this.M) {
                                U();
                            }
                        }
                    } else {
                        dequeueOutputBuffer = this.f4417p.dequeueOutputBuffer(this.f4415n, 0L);
                        this.E = dequeueOutputBuffer;
                    }
                    if (dequeueOutputBuffer >= 0) {
                        if (this.f4427z) {
                            this.f4427z = false;
                            this.f4417p.releaseOutputBuffer(dequeueOutputBuffer, false);
                            this.E = -1;
                        } else {
                            MediaCodec.BufferInfo bufferInfo = this.f4415n;
                            if ((bufferInfo.flags & 4) != 0) {
                                A();
                                this.E = -1;
                                break;
                            }
                            ByteBuffer byteBuffer = this.B[this.E];
                            if (byteBuffer != null) {
                                byteBuffer.position(bufferInfo.offset);
                                MediaCodec.BufferInfo bufferInfo2 = this.f4415n;
                                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                            }
                            long j12 = this.f4415n.presentationTimeUs;
                            int size = this.f4414m.size();
                            int i10 = 0;
                            while (true) {
                                if (i10 >= size) {
                                    z10 = false;
                                    break;
                                } else if (this.f4414m.get(i10).longValue() == j12) {
                                    this.f4414m.remove(i10);
                                    z10 = true;
                                    break;
                                } else {
                                    i10++;
                                }
                            }
                            this.F = z10;
                        }
                    } else if (dequeueOutputBuffer == -2) {
                        MediaFormat outputFormat = this.f4417p.getOutputFormat();
                        if (this.f4421t && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                            this.f4427z = true;
                        } else {
                            if (this.f4425x) {
                                outputFormat.setInteger("channel-count", 1);
                            }
                            I(this.f4417p, outputFormat);
                        }
                    } else if (dequeueOutputBuffer == -3) {
                        this.B = this.f4417p.getOutputBuffers();
                    } else if (this.f4422u && (this.L || this.I == 2)) {
                        A();
                    }
                }
                if (this.f4424w && this.K) {
                    try {
                        MediaCodec mediaCodec = this.f4417p;
                        ByteBuffer[] byteBufferArr = this.B;
                        int i11 = this.E;
                        ByteBuffer byteBuffer2 = byteBufferArr[i11];
                        MediaCodec.BufferInfo bufferInfo3 = this.f4415n;
                        J = J(j10, j11, mediaCodec, byteBuffer2, i11, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.F);
                    } catch (IllegalStateException unused2) {
                        A();
                        if (this.M) {
                            U();
                        }
                    }
                } else {
                    MediaCodec mediaCodec2 = this.f4417p;
                    ByteBuffer[] byteBufferArr2 = this.B;
                    int i12 = this.E;
                    ByteBuffer byteBuffer3 = byteBufferArr2[i12];
                    MediaCodec.BufferInfo bufferInfo4 = this.f4415n;
                    J = J(j10, j11, mediaCodec2, byteBuffer3, i12, bufferInfo4.flags, bufferInfo4.presentationTimeUs, this.F);
                }
                if (!J) {
                    break;
                }
                long j13 = this.f4415n.presentationTimeUs;
                this.E = -1;
            }
            do {
            } while (z());
            tj.b();
        } else {
            e(j10);
            this.f4412k.a();
            int b11 = b(this.f4413l, this.f4412k, false);
            if (b11 == -5) {
                H(this.f4413l.f8372a);
            } else if (b11 == -4) {
                fj.d(this.f4412k.c());
                this.L = true;
                A();
            }
        }
        this.O.a();
    }

    public boolean R(fg fgVar) {
        return true;
    }

    public final MediaCodec S() {
        return this.f4417p;
    }

    public final fg T() {
        return this.f4418q;
    }

    public void U() {
        this.C = C.TIME_UNSET;
        this.D = -1;
        this.E = -1;
        this.F = false;
        this.f4414m.clear();
        this.A = null;
        this.B = null;
        this.f4418q = null;
        this.G = false;
        this.J = false;
        this.f4419r = false;
        this.f4420s = false;
        this.f4421t = false;
        this.f4422u = false;
        this.f4423v = false;
        this.f4425x = false;
        this.f4426y = false;
        this.f4427z = false;
        this.K = false;
        this.H = 0;
        this.I = 0;
        this.f4411j.f3616c = null;
        MediaCodec mediaCodec = this.f4417p;
        if (mediaCodec != null) {
            this.O.f3221b++;
            try {
                mediaCodec.stop();
                try {
                    this.f4417p.release();
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    this.f4417p.release();
                    throw th2;
                } finally {
                }
            }
        }
    }

    public void V(ee eeVar) {
    }

    public boolean W(MediaCodec mediaCodec, boolean z10, oc ocVar, oc ocVar2) {
        return false;
    }

    @Override // ai.sc
    public final int l() {
        return 4;
    }

    @Override // ai.sc
    public final int m(oc ocVar) throws zzamy {
        try {
            return B(this.f4410i, ocVar);
        } catch (zzarm e10) {
            throw zzamy.a(e10, y());
        }
    }

    @Override // ai.yb
    public void r(boolean z10) throws zzamy {
        this.O = new de();
    }

    @Override // ai.yb
    public void t(long j10, boolean z10) throws zzamy {
        this.L = false;
        this.M = false;
        if (this.f4417p != null) {
            this.C = C.TIME_UNSET;
            this.D = -1;
            this.E = -1;
            this.N = true;
            this.F = false;
            this.f4414m.clear();
            this.f4426y = false;
            this.f4427z = false;
            if (!this.f4420s && (!this.f4423v || !this.K)) {
                if (this.I != 0) {
                    U();
                    L();
                } else {
                    this.f4417p.flush();
                    this.J = false;
                }
            } else {
                U();
                L();
            }
            if (!this.G || this.f4416o == null) {
                return;
            }
            this.H = 1;
        }
    }

    @Override // ai.yb
    public void w() {
        this.f4416o = null;
        U();
    }

    public final boolean z() throws zzamy {
        MediaCodec mediaCodec = this.f4417p;
        if (mediaCodec == null || this.I == 2 || this.L) {
            return false;
        }
        if (this.D < 0) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            this.D = dequeueInputBuffer;
            if (dequeueInputBuffer < 0) {
                return false;
            }
            ee eeVar = this.f4411j;
            eeVar.f3616c = this.A[dequeueInputBuffer];
            eeVar.a();
        }
        if (this.I == 1) {
            if (!this.f4422u) {
                this.K = true;
                this.f4417p.queueInputBuffer(this.D, 0, 0, 0L, 4);
                this.D = -1;
            }
            this.I = 2;
            return false;
        } else if (this.f4426y) {
            this.f4426y = false;
            ByteBuffer byteBuffer = this.f4411j.f3616c;
            byte[] bArr = P;
            byteBuffer.put(bArr);
            MediaCodec mediaCodec2 = this.f4417p;
            int i10 = this.D;
            int length = bArr.length;
            mediaCodec2.queueInputBuffer(i10, 0, 38, 0L, 0);
            this.D = -1;
            this.J = true;
            return true;
        } else {
            if (this.H == 1) {
                for (int i11 = 0; i11 < this.f4416o.D.size(); i11++) {
                    this.f4411j.f3616c.put(this.f4416o.D.get(i11));
                }
                this.H = 2;
            }
            int position = this.f4411j.f3616c.position();
            int b10 = b(this.f4413l, this.f4411j, false);
            if (b10 == -3) {
                return false;
            }
            if (b10 == -5) {
                if (this.H == 2) {
                    this.f4411j.a();
                    this.H = 1;
                }
                H(this.f4413l.f8372a);
                return true;
            } else if (this.f4411j.c()) {
                if (this.H == 2) {
                    this.f4411j.a();
                    this.H = 1;
                }
                this.L = true;
                if (!this.J) {
                    A();
                    return false;
                }
                try {
                    if (!this.f4422u) {
                        this.K = true;
                        this.f4417p.queueInputBuffer(this.D, 0, 0, 0L, 4);
                        this.D = -1;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e10) {
                    throw zzamy.a(e10, y());
                }
            } else if (this.N && !this.f4411j.d()) {
                this.f4411j.a();
                if (this.H == 2) {
                    this.H = 1;
                }
                return true;
            } else {
                this.N = false;
                boolean i12 = this.f4411j.i();
                if (this.f4419r && !i12) {
                    ByteBuffer byteBuffer2 = this.f4411j.f3616c;
                    byte[] bArr2 = lj.f6576a;
                    int position2 = byteBuffer2.position();
                    int i13 = 0;
                    int i14 = 0;
                    while (true) {
                        int i15 = i13 + 1;
                        if (i15 < position2) {
                            int i16 = byteBuffer2.get(i13) & TagConstant.TAG_CAT_RESERVED;
                            if (i14 == 3) {
                                if (i16 == 1) {
                                    if ((byteBuffer2.get(i15) & 31) == 7) {
                                        ByteBuffer duplicate = byteBuffer2.duplicate();
                                        duplicate.position(i13 - 3);
                                        duplicate.limit(position2);
                                        byteBuffer2.position(0);
                                        byteBuffer2.put(duplicate);
                                        break;
                                    }
                                    i16 = 1;
                                }
                            } else if (i16 == 0) {
                                i14++;
                            }
                            if (i16 != 0) {
                                i14 = 0;
                            }
                            i13 = i15;
                        } else {
                            byteBuffer2.clear();
                            break;
                        }
                    }
                    if (this.f4411j.f3616c.position() == 0) {
                        return true;
                    }
                    this.f4419r = false;
                }
                try {
                    ee eeVar2 = this.f4411j;
                    long j10 = eeVar2.f3617d;
                    if (eeVar2.b()) {
                        this.f4414m.add(Long.valueOf(j10));
                    }
                    this.f4411j.f3616c.flip();
                    V(this.f4411j);
                    if (i12) {
                        MediaCodec.CryptoInfo b11 = this.f4411j.f3615b.b();
                        if (position != 0) {
                            if (b11.numBytesOfClearData == null) {
                                b11.numBytesOfClearData = new int[1];
                            }
                            int[] iArr = b11.numBytesOfClearData;
                            iArr[0] = iArr[0] + position;
                        }
                        this.f4417p.queueSecureInputBuffer(this.D, 0, b11, j10, 0);
                    } else {
                        this.f4417p.queueInputBuffer(this.D, 0, this.f4411j.f3616c.limit(), j10, 0);
                    }
                    this.D = -1;
                    this.J = true;
                    this.H = 0;
                    this.O.f3222c++;
                    return true;
                } catch (MediaCodec.CryptoException e11) {
                    throw zzamy.a(e11, y());
                }
            }
        }
    }
}
