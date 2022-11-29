package ai;

import android.util.SparseArray;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.internal.ads.zzaha;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes3.dex */
public final class by3 implements mv3 {

    /* renamed from: b0  reason: collision with root package name */
    public static final sv3 f2593b0 = wx3.f11796a;

    /* renamed from: c0  reason: collision with root package name */
    public static final byte[] f2594c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: d0  reason: collision with root package name */
    public static final byte[] f2595d0 = sb.X("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: e0  reason: collision with root package name */
    public static final byte[] f2596e0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: f0  reason: collision with root package name */
    public static final UUID f2597f0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: g0  reason: collision with root package name */
    public static final Map<String, Integer> f2598g0;
    public long A;
    public pa B;
    public pa C;
    public boolean D;
    public boolean E;
    public int F;
    public long G;
    public long H;
    public int I;
    public int J;
    public int[] K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public byte X;
    public boolean Y;
    public pv3 Z;

    /* renamed from: a  reason: collision with root package name */
    public final dy3 f2599a;

    /* renamed from: a0  reason: collision with root package name */
    public final ux3 f2600a0;

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray<zx3> f2601b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2602c;

    /* renamed from: d  reason: collision with root package name */
    public final hb f2603d;

    /* renamed from: e  reason: collision with root package name */
    public final hb f2604e;

    /* renamed from: f  reason: collision with root package name */
    public final hb f2605f;

    /* renamed from: g  reason: collision with root package name */
    public final hb f2606g;

    /* renamed from: h  reason: collision with root package name */
    public final hb f2607h;

    /* renamed from: i  reason: collision with root package name */
    public final hb f2608i;

    /* renamed from: j  reason: collision with root package name */
    public final hb f2609j;

    /* renamed from: k  reason: collision with root package name */
    public final hb f2610k;

    /* renamed from: l  reason: collision with root package name */
    public final hb f2611l;

    /* renamed from: m  reason: collision with root package name */
    public final hb f2612m;

    /* renamed from: n  reason: collision with root package name */
    public ByteBuffer f2613n;

    /* renamed from: o  reason: collision with root package name */
    public long f2614o;

    /* renamed from: p  reason: collision with root package name */
    public long f2615p;

    /* renamed from: q  reason: collision with root package name */
    public long f2616q;

    /* renamed from: r  reason: collision with root package name */
    public long f2617r;

    /* renamed from: s  reason: collision with root package name */
    public long f2618s;

    /* renamed from: t  reason: collision with root package name */
    public zx3 f2619t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2620u;

    /* renamed from: v  reason: collision with root package name */
    public int f2621v;

    /* renamed from: w  reason: collision with root package name */
    public long f2622w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f2623x;

    /* renamed from: y  reason: collision with root package name */
    public long f2624y;

    /* renamed from: z  reason: collision with root package name */
    public long f2625z;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f2598g0 = Collections.unmodifiableMap(hashMap);
    }

    public by3(int i10) {
        ux3 ux3Var = new ux3();
        this.f2615p = -1L;
        this.f2616q = C.TIME_UNSET;
        this.f2617r = C.TIME_UNSET;
        this.f2618s = C.TIME_UNSET;
        this.f2624y = -1L;
        this.f2625z = -1L;
        this.A = C.TIME_UNSET;
        this.f2600a0 = ux3Var;
        ux3Var.a(new xx3(this, null));
        this.f2602c = true;
        this.f2599a = new dy3();
        this.f2601b = new SparseArray<>();
        this.f2605f = new hb(4);
        this.f2606g = new hb(ByteBuffer.allocate(4).putInt(-1).array());
        this.f2607h = new hb(4);
        this.f2603d = new hb(xa.f11894a);
        this.f2604e = new hb(4);
        this.f2608i = new hb();
        this.f2609j = new hb();
        this.f2610k = new hb(8);
        this.f2611l = new hb();
        this.f2612m = new hb();
        this.K = new int[1];
    }

    public static final int n(int i10) {
        switch (i10) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    public static final boolean o(int i10) {
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }

    public static byte[] w(long j10, String str, long j11) {
        u9.a(j10 != C.TIME_UNSET);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - ((i10 * 3600) * 1000000);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - ((i11 * 60) * 1000000);
        int i12 = (int) (j13 / 1000000);
        return sb.X(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11))));
    }

    public static int[] z(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        int length = iArr.length;
        return length >= i10 ? iArr : new int[Math.max(length + length, i10)];
    }

    public final void d(int i10, long j10, long j11) throws zzaha {
        u9.e(this.Z);
        if (i10 == 160) {
            this.P = false;
        } else if (i10 == 174) {
            this.f2619t = new zx3(null);
        } else if (i10 == 187) {
            this.D = false;
        } else if (i10 == 19899) {
            this.f2621v = -1;
            this.f2622w = -1L;
        } else if (i10 == 20533) {
            p(i10);
            this.f2619t.f13255h = true;
        } else if (i10 == 21968) {
            p(i10);
            this.f2619t.f13271x = true;
        } else if (i10 == 408125543) {
            long j12 = this.f2615p;
            if (j12 != -1 && j12 != j10) {
                throw zzaha.b("Multiple Segment elements not supported", null);
            }
            this.f2615p = j10;
            this.f2614o = j11;
        } else if (i10 != 475249515) {
            if (i10 == 524531317 && !this.f2620u) {
                if (this.f2602c && this.f2624y != -1) {
                    this.f2623x = true;
                    return;
                }
                this.Z.s(new kw3(this.f2618s, 0L));
                this.f2620u = true;
            }
        } else {
            this.B = new pa(32);
            this.C = new pa(32);
        }
    }

    @Override // ai.mv3
    public final int e(nv3 nv3Var, iw3 iw3Var) throws IOException {
        this.E = false;
        while (!this.E) {
            if (!this.f2600a0.c(nv3Var)) {
                for (int i10 = 0; i10 < this.f2601b.size(); i10++) {
                    zx3 valueAt = this.f2601b.valueAt(i10);
                    zx3.e(valueAt);
                    ay3 ay3Var = valueAt.T;
                    if (ay3Var != null) {
                        ay3Var.d(valueAt);
                    }
                }
                return -1;
            }
            long n10 = nv3Var.n();
            if (this.f2623x) {
                this.f2625z = n10;
                iw3Var.f5438a = this.f2624y;
                this.f2623x = false;
                return 1;
            } else if (this.f2620u) {
                long j10 = this.f2625z;
                if (j10 != -1) {
                    iw3Var.f5438a = j10;
                    this.f2625z = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0252, code lost:
        if (r3.equals("V_AV1") != false) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(int r22) throws com.google.android.gms.internal.ads.zzaha {
        /*
            Method dump skipped, instructions count: 1092
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.by3.f(int):void");
    }

    @Override // ai.mv3
    public final void g(long j10, long j11) {
        this.A = C.TIME_UNSET;
        this.F = 0;
        this.f2600a0.b();
        this.f2599a.a();
        u();
        for (int i10 = 0; i10 < this.f2601b.size(); i10++) {
            ay3 ay3Var = this.f2601b.valueAt(i10).T;
            if (ay3Var != null) {
                ay3Var.a();
            }
        }
    }

    @Override // ai.mv3
    public final void h(pv3 pv3Var) {
        this.Z = pv3Var;
    }

    @Override // ai.mv3
    public final boolean i(nv3 nv3Var) throws IOException {
        return new cy3().a(nv3Var);
    }

    public final void j(int i10, long j10) throws zzaha {
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ContentEncodingOrder ");
            sb2.append(j10);
            sb2.append(" not supported");
            throw zzaha.b(sb2.toString(), null);
        } else if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            StringBuilder sb3 = new StringBuilder(55);
            sb3.append("ContentEncodingScope ");
            sb3.append(j10);
            sb3.append(" not supported");
            throw zzaha.b(sb3.toString(), null);
        } else {
            switch (i10) {
                case 131:
                    p(i10);
                    this.f2619t.f13251d = (int) j10;
                    return;
                case 136:
                    p(i10);
                    this.f2619t.V = j10 == 1;
                    return;
                case 155:
                    this.H = y(j10);
                    return;
                case 159:
                    p(i10);
                    this.f2619t.O = (int) j10;
                    return;
                case 176:
                    p(i10);
                    this.f2619t.f13260m = (int) j10;
                    return;
                case 179:
                    q(i10);
                    this.B.a(y(j10));
                    return;
                case 186:
                    p(i10);
                    this.f2619t.f13261n = (int) j10;
                    return;
                case 215:
                    p(i10);
                    this.f2619t.f13250c = (int) j10;
                    return;
                case 231:
                    this.A = y(j10);
                    return;
                case 238:
                    this.O = (int) j10;
                    return;
                case 241:
                    if (this.D) {
                        return;
                    }
                    q(i10);
                    this.C.a(j10);
                    this.D = true;
                    return;
                case 251:
                    this.P = true;
                    return;
                case 16871:
                    p(i10);
                    zx3.a(this.f2619t, (int) j10);
                    return;
                case 16980:
                    if (j10 == 3) {
                        return;
                    }
                    StringBuilder sb4 = new StringBuilder(50);
                    sb4.append("ContentCompAlgo ");
                    sb4.append(j10);
                    sb4.append(" not supported");
                    throw zzaha.b(sb4.toString(), null);
                case 17029:
                    if (j10 < 1 || j10 > 2) {
                        StringBuilder sb5 = new StringBuilder(53);
                        sb5.append("DocTypeReadVersion ");
                        sb5.append(j10);
                        sb5.append(" not supported");
                        throw zzaha.b(sb5.toString(), null);
                    }
                    return;
                case 17143:
                    if (j10 == 1) {
                        return;
                    }
                    StringBuilder sb6 = new StringBuilder(50);
                    sb6.append("EBMLReadVersion ");
                    sb6.append(j10);
                    sb6.append(" not supported");
                    throw zzaha.b(sb6.toString(), null);
                case 18401:
                    if (j10 == 5) {
                        return;
                    }
                    StringBuilder sb7 = new StringBuilder(49);
                    sb7.append("ContentEncAlgo ");
                    sb7.append(j10);
                    sb7.append(" not supported");
                    throw zzaha.b(sb7.toString(), null);
                case 18408:
                    if (j10 == 1) {
                        return;
                    }
                    StringBuilder sb8 = new StringBuilder(56);
                    sb8.append("AESSettingsCipherMode ");
                    sb8.append(j10);
                    sb8.append(" not supported");
                    throw zzaha.b(sb8.toString(), null);
                case 21420:
                    this.f2622w = j10 + this.f2615p;
                    return;
                case 21432:
                    p(i10);
                    int i11 = (int) j10;
                    if (i11 == 0) {
                        this.f2619t.f13270w = 0;
                        return;
                    } else if (i11 == 1) {
                        this.f2619t.f13270w = 2;
                        return;
                    } else if (i11 == 3) {
                        this.f2619t.f13270w = 1;
                        return;
                    } else if (i11 != 15) {
                        return;
                    } else {
                        this.f2619t.f13270w = 3;
                        return;
                    }
                case 21680:
                    p(i10);
                    this.f2619t.f13262o = (int) j10;
                    return;
                case 21682:
                    p(i10);
                    this.f2619t.f13264q = (int) j10;
                    return;
                case 21690:
                    p(i10);
                    this.f2619t.f13263p = (int) j10;
                    return;
                case 21930:
                    p(i10);
                    this.f2619t.U = j10 == 1;
                    return;
                case 21998:
                    p(i10);
                    this.f2619t.f13253f = (int) j10;
                    return;
                case 22186:
                    p(i10);
                    this.f2619t.R = j10;
                    return;
                case 22203:
                    p(i10);
                    this.f2619t.S = j10;
                    return;
                case 25188:
                    p(i10);
                    this.f2619t.P = (int) j10;
                    return;
                case 30321:
                    p(i10);
                    int i12 = (int) j10;
                    if (i12 == 0) {
                        this.f2619t.f13265r = 0;
                        return;
                    } else if (i12 == 1) {
                        this.f2619t.f13265r = 1;
                        return;
                    } else if (i12 == 2) {
                        this.f2619t.f13265r = 2;
                        return;
                    } else if (i12 != 3) {
                        return;
                    } else {
                        this.f2619t.f13265r = 3;
                        return;
                    }
                case 2352003:
                    p(i10);
                    this.f2619t.f13252e = (int) j10;
                    return;
                case 2807729:
                    this.f2616q = j10;
                    return;
                default:
                    switch (i10) {
                        case 21945:
                            p(i10);
                            int i13 = (int) j10;
                            if (i13 == 1) {
                                this.f2619t.A = 2;
                                return;
                            } else if (i13 != 2) {
                                return;
                            } else {
                                this.f2619t.A = 1;
                                return;
                            }
                        case 21946:
                            p(i10);
                            int b10 = vq3.b((int) j10);
                            if (b10 != -1) {
                                this.f2619t.f13273z = b10;
                                return;
                            }
                            return;
                        case 21947:
                            p(i10);
                            this.f2619t.f13271x = true;
                            int a10 = vq3.a((int) j10);
                            if (a10 != -1) {
                                this.f2619t.f13272y = a10;
                                return;
                            }
                            return;
                        case 21948:
                            p(i10);
                            this.f2619t.B = (int) j10;
                            return;
                        case 21949:
                            p(i10);
                            this.f2619t.C = (int) j10;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    public final void k(int i10, double d10) throws zzaha {
        if (i10 == 181) {
            p(i10);
            this.f2619t.Q = (int) d10;
        } else if (i10 != 17545) {
            switch (i10) {
                case 21969:
                    p(i10);
                    this.f2619t.D = (float) d10;
                    return;
                case 21970:
                    p(i10);
                    this.f2619t.E = (float) d10;
                    return;
                case 21971:
                    p(i10);
                    this.f2619t.F = (float) d10;
                    return;
                case 21972:
                    p(i10);
                    this.f2619t.G = (float) d10;
                    return;
                case 21973:
                    p(i10);
                    this.f2619t.H = (float) d10;
                    return;
                case 21974:
                    p(i10);
                    this.f2619t.I = (float) d10;
                    return;
                case 21975:
                    p(i10);
                    this.f2619t.J = (float) d10;
                    return;
                case 21976:
                    p(i10);
                    this.f2619t.K = (float) d10;
                    return;
                case 21977:
                    p(i10);
                    this.f2619t.L = (float) d10;
                    return;
                case 21978:
                    p(i10);
                    this.f2619t.M = (float) d10;
                    return;
                default:
                    switch (i10) {
                        case 30323:
                            p(i10);
                            this.f2619t.f13266s = (float) d10;
                            return;
                        case 30324:
                            p(i10);
                            this.f2619t.f13267t = (float) d10;
                            return;
                        case 30325:
                            p(i10);
                            this.f2619t.f13268u = (float) d10;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.f2617r = (long) d10;
        }
    }

    public final void l(int i10, String str) throws zzaha {
        if (i10 == 134) {
            p(i10);
            this.f2619t.f13249b = str;
        } else if (i10 == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(str.length() + 22);
            sb2.append("DocType ");
            sb2.append(str);
            sb2.append(" not supported");
            throw zzaha.b(sb2.toString(), null);
        } else if (i10 == 21358) {
            p(i10);
            this.f2619t.f13248a = str;
        } else if (i10 != 2274716) {
        } else {
            p(i10);
            zx3.c(this.f2619t, str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0281, code lost:
        throw com.google.android.gms.internal.ads.zzaha.b("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(int r19, int r20, ai.nv3 r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.by3.m(int, int, ai.nv3):void");
    }

    @EnsuresNonNull({"currentTrack"})
    public final void p(int i10) throws zzaha {
        if (this.f2619t != null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("Element ");
        sb2.append(i10);
        sb2.append(" must be in a TrackEntry");
        throw zzaha.b(sb2.toString(), null);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    public final void q(int i10) throws zzaha {
        if (this.B == null || this.C == null) {
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("Element ");
            sb2.append(i10);
            sb2.append(" must be in a Cues");
            throw zzaha.b(sb2.toString(), null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b9 A[EDGE_INSN: B:52:0x00b9->B:41:0x00b9 ?: BREAK  , SYNTHETIC] */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(ai.zx3 r17, long r18, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.by3.r(ai.zx3, long, int, int, int):void");
    }

    public final void s(nv3 nv3Var, int i10) throws IOException {
        if (this.f2605f.m() >= i10) {
            return;
        }
        if (this.f2605f.r() < i10) {
            hb hbVar = this.f2605f;
            int r10 = hbVar.r();
            hbVar.k(Math.max(r10 + r10, i10));
        }
        ((hv3) nv3Var).f(this.f2605f.q(), this.f2605f.m(), i10 - this.f2605f.m(), false);
        this.f2605f.n(i10);
    }

    @RequiresNonNull({"#2.output"})
    public final int t(nv3 nv3Var, zx3 zx3Var, int i10) throws IOException {
        int i11;
        if ("S_TEXT/UTF8".equals(zx3Var.f13249b)) {
            v(nv3Var, f2594c0, i10);
            int i12 = this.R;
            u();
            return i12;
        } else if ("S_TEXT/ASS".equals(zx3Var.f13249b)) {
            v(nv3Var, f2596e0, i10);
            int i13 = this.R;
            u();
            return i13;
        } else {
            pw3 pw3Var = zx3Var.X;
            if (!this.T) {
                if (zx3Var.f13255h) {
                    this.N &= -1073741825;
                    if (!this.U) {
                        ((hv3) nv3Var).f(this.f2605f.q(), 0, 1, false);
                        this.Q++;
                        if ((this.f2605f.q()[0] & 128) != 128) {
                            this.X = this.f2605f.q()[0];
                            this.U = true;
                        } else {
                            throw zzaha.b("Extension bit is set in signal byte", null);
                        }
                    }
                    byte b10 = this.X;
                    if ((b10 & 1) == 1) {
                        int i14 = b10 & 2;
                        this.N |= 1073741824;
                        if (!this.Y) {
                            ((hv3) nv3Var).f(this.f2610k.q(), 0, 8, false);
                            this.Q += 8;
                            this.Y = true;
                            this.f2605f.q()[0] = (byte) ((i14 != 2 ? 0 : 128) | 8);
                            this.f2605f.p(0);
                            pw3Var.d(this.f2605f, 1, 1);
                            this.R++;
                            this.f2610k.p(0);
                            pw3Var.d(this.f2610k, 8, 1);
                            this.R += 8;
                        }
                        if (i14 == 2) {
                            if (!this.V) {
                                ((hv3) nv3Var).f(this.f2605f.q(), 0, 1, false);
                                this.Q++;
                                this.f2605f.p(0);
                                this.W = this.f2605f.v();
                                this.V = true;
                            }
                            int i15 = this.W * 4;
                            this.f2605f.i(i15);
                            ((hv3) nv3Var).f(this.f2605f.q(), 0, i15, false);
                            this.Q += i15;
                            int i16 = (this.W >> 1) + 1;
                            int i17 = (i16 * 6) + 2;
                            ByteBuffer byteBuffer = this.f2613n;
                            if (byteBuffer == null || byteBuffer.capacity() < i17) {
                                this.f2613n = ByteBuffer.allocate(i17);
                            }
                            this.f2613n.position(0);
                            this.f2613n.putShort((short) i16);
                            int i18 = 0;
                            int i19 = 0;
                            while (true) {
                                i11 = this.W;
                                if (i18 >= i11) {
                                    break;
                                }
                                int b11 = this.f2605f.b();
                                if (i18 % 2 == 0) {
                                    this.f2613n.putShort((short) (b11 - i19));
                                } else {
                                    this.f2613n.putInt(b11 - i19);
                                }
                                i18++;
                                i19 = b11;
                            }
                            int i20 = (i10 - this.Q) - i19;
                            if ((i11 & 1) == 1) {
                                this.f2613n.putInt(i20);
                            } else {
                                this.f2613n.putShort((short) i20);
                                this.f2613n.putInt(0);
                            }
                            this.f2611l.j(this.f2613n.array(), i17);
                            pw3Var.d(this.f2611l, i17, 1);
                            this.R += i17;
                        }
                    }
                } else {
                    byte[] bArr = zx3Var.f13256i;
                    if (bArr != null) {
                        this.f2608i.j(bArr, bArr.length);
                    }
                }
                if (zx3Var.f13253f > 0) {
                    this.N |= 268435456;
                    this.f2612m.i(0);
                    this.f2605f.i(4);
                    this.f2605f.q()[0] = (byte) ((i10 >> 24) & 255);
                    this.f2605f.q()[1] = (byte) ((i10 >> 16) & 255);
                    this.f2605f.q()[2] = (byte) ((i10 >> 8) & 255);
                    this.f2605f.q()[3] = (byte) (i10 & 255);
                    pw3Var.d(this.f2605f, 4, 2);
                    this.R += 4;
                }
                this.T = true;
            }
            int m10 = i10 + this.f2608i.m();
            if (!"V_MPEG4/ISO/AVC".equals(zx3Var.f13249b) && !"V_MPEGH/ISO/HEVC".equals(zx3Var.f13249b)) {
                if (zx3Var.T != null) {
                    u9.d(this.f2608i.m() == 0);
                    zx3Var.T.b(nv3Var);
                }
                while (true) {
                    int i21 = this.Q;
                    if (i21 >= m10) {
                        break;
                    }
                    int x10 = x(nv3Var, pw3Var, m10 - i21);
                    this.Q += x10;
                    this.R += x10;
                }
            } else {
                byte[] q10 = this.f2604e.q();
                q10[0] = 0;
                q10[1] = 0;
                q10[2] = 0;
                int i22 = zx3Var.Y;
                int i23 = 4 - i22;
                while (this.Q < m10) {
                    int i24 = this.S;
                    if (i24 == 0) {
                        int min = Math.min(i22, this.f2608i.l());
                        ((hv3) nv3Var).f(q10, i23 + min, i22 - min, false);
                        if (min > 0) {
                            this.f2608i.u(q10, i23, min);
                        }
                        this.Q += i22;
                        this.f2604e.p(0);
                        this.S = this.f2604e.b();
                        this.f2603d.p(0);
                        nw3.b(pw3Var, this.f2603d, 4);
                        this.R += 4;
                    } else {
                        int x11 = x(nv3Var, pw3Var, i24);
                        this.Q += x11;
                        this.R += x11;
                        this.S -= x11;
                    }
                }
            }
            if ("A_VORBIS".equals(zx3Var.f13249b)) {
                this.f2606g.p(0);
                nw3.b(pw3Var, this.f2606g, 4);
                this.R += 4;
            }
            int i25 = this.R;
            u();
            return i25;
        }
    }

    public final void u() {
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = 0;
        this.X = (byte) 0;
        this.Y = false;
        this.f2608i.i(0);
    }

    public final void v(nv3 nv3Var, byte[] bArr, int i10) throws IOException {
        int length = bArr.length;
        int i11 = i10 + 32;
        if (this.f2609j.r() < i11) {
            hb hbVar = this.f2609j;
            byte[] copyOf = Arrays.copyOf(bArr, i11 + i10);
            hbVar.j(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.f2609j.q(), 0, 32);
        }
        ((hv3) nv3Var).f(this.f2609j.q(), 32, i10, false);
        this.f2609j.p(0);
        this.f2609j.n(i11);
    }

    public final int x(nv3 nv3Var, pw3 pw3Var, int i10) throws IOException {
        int l10 = this.f2608i.l();
        if (l10 > 0) {
            int min = Math.min(i10, l10);
            nw3.b(pw3Var, this.f2608i, min);
            return min;
        }
        return nw3.a(pw3Var, nv3Var, i10, false);
    }

    public final long y(long j10) throws zzaha {
        long j11 = this.f2616q;
        if (j11 != C.TIME_UNSET) {
            return sb.h(j10, j11, 1000L);
        }
        throw zzaha.b("Can't scale timecode prior to timecodeScale being set.", null);
    }
}
