package ai;

import android.util.SparseArray;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.internal.ads.zzanp;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class ef implements me {
    public static final oe Z = new af();

    /* renamed from: a0  reason: collision with root package name */
    public static final byte[] f3621a0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: b0  reason: collision with root package name */
    public static final byte[] f3622b0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};

    /* renamed from: c0  reason: collision with root package name */
    public static final UUID f3623c0 = new UUID(72057594037932032L, -9223371306706625679L);
    public ij A;
    public ij B;
    public boolean C;
    public int D;
    public long E;
    public long F;
    public int G;
    public int H;
    public int[] I;
    public int J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public byte R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public ne X;
    public final ze Y;

    /* renamed from: a  reason: collision with root package name */
    public final gf f3624a;

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray<df> f3625b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3626c;

    /* renamed from: d  reason: collision with root package name */
    public final nj f3627d;

    /* renamed from: e  reason: collision with root package name */
    public final nj f3628e;

    /* renamed from: f  reason: collision with root package name */
    public final nj f3629f;

    /* renamed from: g  reason: collision with root package name */
    public final nj f3630g;

    /* renamed from: h  reason: collision with root package name */
    public final nj f3631h;

    /* renamed from: i  reason: collision with root package name */
    public final nj f3632i;

    /* renamed from: j  reason: collision with root package name */
    public final nj f3633j;

    /* renamed from: k  reason: collision with root package name */
    public final nj f3634k;

    /* renamed from: l  reason: collision with root package name */
    public final nj f3635l;

    /* renamed from: m  reason: collision with root package name */
    public ByteBuffer f3636m;

    /* renamed from: n  reason: collision with root package name */
    public long f3637n;

    /* renamed from: o  reason: collision with root package name */
    public long f3638o;

    /* renamed from: p  reason: collision with root package name */
    public long f3639p;

    /* renamed from: q  reason: collision with root package name */
    public long f3640q;

    /* renamed from: r  reason: collision with root package name */
    public long f3641r;

    /* renamed from: s  reason: collision with root package name */
    public df f3642s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3643t;

    /* renamed from: u  reason: collision with root package name */
    public int f3644u;

    /* renamed from: v  reason: collision with root package name */
    public long f3645v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f3646w;

    /* renamed from: x  reason: collision with root package name */
    public long f3647x;

    /* renamed from: y  reason: collision with root package name */
    public long f3648y;

    /* renamed from: z  reason: collision with root package name */
    public long f3649z;

    public ef(int i10) {
        ze zeVar = new ze();
        this.f3638o = -1L;
        this.f3639p = C.TIME_UNSET;
        this.f3640q = C.TIME_UNSET;
        this.f3641r = C.TIME_UNSET;
        this.f3647x = -1L;
        this.f3648y = -1L;
        this.f3649z = C.TIME_UNSET;
        this.Y = zeVar;
        zeVar.b(new bf(this, null));
        this.f3626c = true;
        this.f3624a = new gf();
        this.f3625b = new SparseArray<>();
        this.f3629f = new nj(4);
        this.f3630g = new nj(ByteBuffer.allocate(4).putInt(-1).array());
        this.f3631h = new nj(4);
        this.f3627d = new nj(lj.f6576a);
        this.f3628e = new nj(4);
        this.f3632i = new nj();
        this.f3633j = new nj();
        this.f3634k = new nj(8);
        this.f3635l = new nj();
    }

    public static final int l(int i10) {
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
            case 241:
            case 251:
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
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
            case 17026:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
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
                return 5;
            default:
                return 0;
        }
    }

    public static final boolean m(int i10) {
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }

    public static int[] q(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        int length = iArr.length;
        return length >= i10 ? iArr : new int[Math.max(length + length, i10)];
    }

    public final void b(int i10, long j10, long j11) throws zzanp {
        if (i10 == 160) {
            this.W = false;
        } else if (i10 == 174) {
            this.f3642s = new df(null);
        } else if (i10 == 187) {
            this.C = false;
        } else if (i10 == 19899) {
            this.f3644u = -1;
            this.f3645v = -1L;
        } else if (i10 == 20533) {
            this.f3642s.f3239e = true;
        } else if (i10 == 21968) {
            this.f3642s.f3251q = true;
        } else if (i10 == 408125543) {
            long j12 = this.f3638o;
            if (j12 != -1 && j12 != j10) {
                throw new zzanp("Multiple Segment elements not supported");
            }
            this.f3638o = j10;
            this.f3637n = j11;
        } else if (i10 != 475249515) {
            if (i10 == 524531317 && !this.f3643t) {
                if (this.f3626c && this.f3647x != -1) {
                    this.f3646w = true;
                    return;
                }
                this.X.g(new se(this.f3641r));
                this.f3643t = true;
            }
        } else {
            this.A = new ij(32);
            this.B = new ij(32);
        }
    }

    public final void c(int i10) throws zzanp {
        te seVar;
        ij ijVar;
        ij ijVar2;
        int i11;
        int i12 = 0;
        if (i10 == 160) {
            if (this.D != 2) {
                return;
            }
            if (!this.W) {
                this.L |= 1;
            }
            n(this.f3625b.get(this.J), this.E);
            this.D = 0;
        } else if (i10 == 174) {
            String str = this.f3642s.f3235a;
            if ("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) {
                df dfVar = this.f3642s;
                dfVar.b(this.X, dfVar.f3236b);
                SparseArray<df> sparseArray = this.f3625b;
                df dfVar2 = this.f3642s;
                sparseArray.put(dfVar2.f3236b, dfVar2);
            }
            this.f3642s = null;
        } else if (i10 == 19899) {
            int i13 = this.f3644u;
            if (i13 != -1) {
                long j10 = this.f3645v;
                if (j10 != -1) {
                    if (i13 == 475249515) {
                        this.f3647x = j10;
                        return;
                    }
                    return;
                }
            }
            throw new zzanp("Mandatory element SeekID or SeekPosition not found");
        } else if (i10 == 25152) {
            df dfVar3 = this.f3642s;
            if (dfVar3.f3239e) {
                if (dfVar3.f3241g != null) {
                    dfVar3.f3243i = new ie(new he(zb.f12922b, MimeTypes.VIDEO_WEBM, this.f3642s.f3241g.f10679b, false));
                    return;
                }
                throw new zzanp("Encrypted Track found but ContentEncKeyID was not found");
            }
        } else if (i10 == 28032) {
            df dfVar4 = this.f3642s;
            if (dfVar4.f3239e && dfVar4.f3240f != null) {
                throw new zzanp("Combining encryption and compression is not supported");
            }
        } else if (i10 == 357149030) {
            if (this.f3639p == C.TIME_UNSET) {
                this.f3639p = 1000000L;
            }
            long j11 = this.f3640q;
            if (j11 != C.TIME_UNSET) {
                this.f3641r = p(j11);
            }
        } else if (i10 != 374648427) {
            if (i10 == 475249515 && !this.f3643t) {
                ne neVar = this.X;
                if (this.f3638o != -1 && this.f3641r != C.TIME_UNSET && (ijVar = this.A) != null && ijVar.c() != 0 && (ijVar2 = this.B) != null && ijVar2.c() == this.A.c()) {
                    int c10 = this.A.c();
                    int[] iArr = new int[c10];
                    long[] jArr = new long[c10];
                    long[] jArr2 = new long[c10];
                    long[] jArr3 = new long[c10];
                    for (int i14 = 0; i14 < c10; i14++) {
                        jArr3[i14] = this.A.b(i14);
                        jArr[i14] = this.f3638o + this.B.b(i14);
                    }
                    while (true) {
                        i11 = c10 - 1;
                        if (i12 >= i11) {
                            break;
                        }
                        int i15 = i12 + 1;
                        iArr[i12] = (int) (jArr[i15] - jArr[i12]);
                        jArr2[i12] = jArr3[i15] - jArr3[i12];
                        i12 = i15;
                    }
                    iArr[i11] = (int) ((this.f3638o + this.f3637n) - jArr[i11]);
                    jArr2[i11] = this.f3641r - jArr3[i11];
                    this.A = null;
                    this.B = null;
                    seVar = new ke(iArr, jArr, jArr2, jArr3);
                } else {
                    this.A = null;
                    this.B = null;
                    seVar = new se(this.f3641r);
                }
                neVar.g(seVar);
                this.f3643t = true;
            }
        } else if (this.f3625b.size() != 0) {
            this.X.m();
        } else {
            throw new zzanp("No valid tracks were found");
        }
    }

    public final void d(int i10, long j10) throws zzanp {
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ContentEncodingOrder ");
            sb2.append(j10);
            sb2.append(" not supported");
            throw new zzanp(sb2.toString());
        } else if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            StringBuilder sb3 = new StringBuilder(55);
            sb3.append("ContentEncodingScope ");
            sb3.append(j10);
            sb3.append(" not supported");
            throw new zzanp(sb3.toString());
        } else {
            switch (i10) {
                case 131:
                    this.f3642s.f3237c = (int) j10;
                    return;
                case 136:
                    this.f3642s.L = j10 == 1;
                    return;
                case 155:
                    this.F = p(j10);
                    return;
                case 159:
                    this.f3642s.G = (int) j10;
                    return;
                case 176:
                    this.f3642s.f3244j = (int) j10;
                    return;
                case 179:
                    this.A.a(p(j10));
                    return;
                case 186:
                    this.f3642s.f3245k = (int) j10;
                    return;
                case 215:
                    this.f3642s.f3236b = (int) j10;
                    return;
                case 231:
                    this.f3649z = p(j10);
                    return;
                case 241:
                    if (this.C) {
                        return;
                    }
                    this.B.a(j10);
                    this.C = true;
                    return;
                case 251:
                    this.W = true;
                    return;
                case 16980:
                    if (j10 == 3) {
                        return;
                    }
                    StringBuilder sb4 = new StringBuilder(50);
                    sb4.append("ContentCompAlgo ");
                    sb4.append(j10);
                    sb4.append(" not supported");
                    throw new zzanp(sb4.toString());
                case 17029:
                    if (j10 < 1 || j10 > 2) {
                        StringBuilder sb5 = new StringBuilder(53);
                        sb5.append("DocTypeReadVersion ");
                        sb5.append(j10);
                        sb5.append(" not supported");
                        throw new zzanp(sb5.toString());
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
                    throw new zzanp(sb6.toString());
                case 18401:
                    if (j10 == 5) {
                        return;
                    }
                    StringBuilder sb7 = new StringBuilder(49);
                    sb7.append("ContentEncAlgo ");
                    sb7.append(j10);
                    sb7.append(" not supported");
                    throw new zzanp(sb7.toString());
                case 18408:
                    if (j10 == 1) {
                        return;
                    }
                    StringBuilder sb8 = new StringBuilder(56);
                    sb8.append("AESSettingsCipherMode ");
                    sb8.append(j10);
                    sb8.append(" not supported");
                    throw new zzanp(sb8.toString());
                case 21420:
                    this.f3645v = j10 + this.f3638o;
                    return;
                case 21432:
                    int i11 = (int) j10;
                    if (i11 == 0) {
                        this.f3642s.f3250p = 0;
                        return;
                    } else if (i11 == 1) {
                        this.f3642s.f3250p = 2;
                        return;
                    } else if (i11 == 3) {
                        this.f3642s.f3250p = 1;
                        return;
                    } else if (i11 != 15) {
                        return;
                    } else {
                        this.f3642s.f3250p = 3;
                        return;
                    }
                case 21680:
                    this.f3642s.f3246l = (int) j10;
                    return;
                case 21682:
                    this.f3642s.f3248n = (int) j10;
                    return;
                case 21690:
                    this.f3642s.f3247m = (int) j10;
                    return;
                case 21930:
                    this.f3642s.M = j10 == 1;
                    return;
                case 22186:
                    this.f3642s.J = j10;
                    return;
                case 22203:
                    this.f3642s.K = j10;
                    return;
                case 25188:
                    this.f3642s.H = (int) j10;
                    return;
                case 2352003:
                    this.f3642s.f3238d = (int) j10;
                    return;
                case 2807729:
                    this.f3639p = j10;
                    return;
                default:
                    switch (i10) {
                        case 21945:
                            int i12 = (int) j10;
                            if (i12 == 1) {
                                this.f3642s.f3254t = 2;
                                return;
                            } else if (i12 != 2) {
                                return;
                            } else {
                                this.f3642s.f3254t = 1;
                                return;
                            }
                        case 21946:
                            int i13 = (int) j10;
                            if (i13 != 1) {
                                if (i13 == 16) {
                                    this.f3642s.f3253s = 6;
                                    return;
                                } else if (i13 == 18) {
                                    this.f3642s.f3253s = 7;
                                    return;
                                } else if (i13 != 6 && i13 != 7) {
                                    return;
                                }
                            }
                            this.f3642s.f3253s = 3;
                            return;
                        case 21947:
                            df dfVar = this.f3642s;
                            dfVar.f3251q = true;
                            int i14 = (int) j10;
                            if (i14 == 1) {
                                dfVar.f3252r = 1;
                                return;
                            } else if (i14 == 9) {
                                dfVar.f3252r = 6;
                                return;
                            } else if (i14 == 4 || i14 == 5 || i14 == 6 || i14 == 7) {
                                dfVar.f3252r = 2;
                                return;
                            } else {
                                return;
                            }
                        case 21948:
                            this.f3642s.f3255u = (int) j10;
                            return;
                        case 21949:
                            this.f3642s.f3256v = (int) j10;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    public final void e(int i10, double d10) {
        if (i10 == 181) {
            this.f3642s.I = (int) d10;
        } else if (i10 == 17545) {
            this.f3640q = (long) d10;
        } else {
            switch (i10) {
                case 21969:
                    this.f3642s.f3257w = (float) d10;
                    return;
                case 21970:
                    this.f3642s.f3258x = (float) d10;
                    return;
                case 21971:
                    this.f3642s.f3259y = (float) d10;
                    return;
                case 21972:
                    this.f3642s.f3260z = (float) d10;
                    return;
                case 21973:
                    this.f3642s.A = (float) d10;
                    return;
                case 21974:
                    this.f3642s.B = (float) d10;
                    return;
                case 21975:
                    this.f3642s.C = (float) d10;
                    return;
                case 21976:
                    this.f3642s.D = (float) d10;
                    return;
                case 21977:
                    this.f3642s.E = (float) d10;
                    return;
                case 21978:
                    this.f3642s.F = (float) d10;
                    return;
                default:
                    return;
            }
        }
    }

    public final void f(int i10, String str) throws zzanp {
        if (i10 == 134) {
            this.f3642s.f3235a = str;
        } else if (i10 != 17026) {
            if (i10 != 2274716) {
                return;
            }
            df.a(this.f3642s, str);
        } else if ("webm".equals(str) || "matroska".equals(str)) {
        } else {
            StringBuilder sb2 = new StringBuilder(str.length() + 22);
            sb2.append("DocType ");
            sb2.append(str);
            sb2.append(" not supported");
            throw new zzanp(sb2.toString());
        }
    }

    @Override // ai.me
    public final void g(long j10, long j11) {
        this.f3649z = C.TIME_UNSET;
        this.D = 0;
        this.Y.a();
        this.f3624a.a();
        o();
    }

    @Override // ai.me
    public final boolean h(le leVar) throws IOException, InterruptedException {
        return new ff().a(leVar);
    }

    @Override // ai.me
    public final void i(ne neVar) {
        this.X = neVar;
    }

    @Override // ai.me
    public final int j(le leVar, re reVar) throws IOException, InterruptedException {
        this.V = false;
        while (!this.V) {
            if (!this.Y.c(leVar)) {
                return -1;
            }
            long h10 = leVar.h();
            if (this.f3646w) {
                this.f3648y = h10;
                reVar.f9411a = this.f3647x;
                this.f3646w = false;
                return 1;
            } else if (this.f3643t) {
                long j10 = this.f3648y;
                if (j10 != -1) {
                    reVar.f9411a = j10;
                    this.f3648y = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ed, code lost:
        throw new com.google.android.gms.internal.ads.zzanp("EBML lacing sample size out of range.");
     */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0240  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(int r19, int r20, ai.le r21) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.ef.k(int, int, ai.le):void");
    }

    public final void n(df dfVar, long j10) {
        int i10;
        byte[] d10;
        if ("S_TEXT/UTF8".equals(dfVar.f3235a)) {
            byte[] bArr = this.f3633j.f7359a;
            long j11 = this.F;
            if (j11 == C.TIME_UNSET) {
                d10 = f3622b0;
            } else {
                int i11 = (int) (j11 / 3600000000L);
                long j12 = j11 - (i11 * 3600000000L);
                int i12 = (int) (j12 / 60000000);
                long j13 = j12 - (60000000 * i12);
                d10 = vj.d(String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) (j13 / 1000000)), Integer.valueOf((int) ((j13 - (i10 * 1000000)) / 1000))));
            }
            System.arraycopy(d10, 0, bArr, 19, 12);
            ve veVar = dfVar.O;
            nj njVar = this.f3633j;
            veVar.c(njVar, njVar.e());
            this.U += this.f3633j.e();
        }
        dfVar.O.b(j10, this.L, this.U, 0, dfVar.f3241g);
        this.V = true;
        o();
    }

    public final void o() {
        this.M = 0;
        this.U = 0;
        this.T = 0;
        this.N = false;
        this.O = false;
        this.Q = false;
        this.S = 0;
        this.R = (byte) 0;
        this.P = false;
        this.f3632i.c();
    }

    public final long p(long j10) throws zzanp {
        long j11 = this.f3639p;
        if (j11 != C.TIME_UNSET) {
            return vj.j(j10, j11, 1000L);
        }
        throw new zzanp("Can't scale timecode prior to timecodeScale being set.");
    }

    public final void r(le leVar, int i10) throws IOException, InterruptedException {
        if (this.f3629f.e() >= i10) {
            return;
        }
        if (this.f3629f.h() < i10) {
            nj njVar = this.f3629f;
            byte[] bArr = njVar.f7359a;
            int length = bArr.length;
            njVar.b(Arrays.copyOf(bArr, Math.max(length + length, i10)), this.f3629f.e());
        }
        nj njVar2 = this.f3629f;
        leVar.b(njVar2.f7359a, njVar2.e(), i10 - this.f3629f.e(), false);
        this.f3629f.f(i10);
    }

    public final void s(le leVar, df dfVar, int i10) throws IOException, InterruptedException {
        int i11;
        if ("S_TEXT/UTF8".equals(dfVar.f3235a)) {
            int i12 = i10 + 32;
            if (this.f3633j.h() < i12) {
                this.f3633j.f7359a = Arrays.copyOf(f3621a0, i12 + i10);
            }
            leVar.b(this.f3633j.f7359a, 32, i10, false);
            this.f3633j.i(0);
            this.f3633j.f(i12);
            return;
        }
        ve veVar = dfVar.O;
        if (!this.N) {
            if (dfVar.f3239e) {
                this.L &= -1073741825;
                if (!this.O) {
                    leVar.b(this.f3629f.f7359a, 0, 1, false);
                    this.M++;
                    byte b10 = this.f3629f.f7359a[0];
                    if ((b10 & 128) != 128) {
                        this.R = b10;
                        this.O = true;
                    } else {
                        throw new zzanp("Extension bit is set in signal byte");
                    }
                }
                byte b11 = this.R;
                if ((b11 & 1) == 1) {
                    int i13 = b11 & 2;
                    this.L |= 1073741824;
                    if (!this.P) {
                        leVar.b(this.f3634k.f7359a, 0, 8, false);
                        this.M += 8;
                        this.P = true;
                        nj njVar = this.f3629f;
                        njVar.f7359a[0] = (byte) ((i13 != 2 ? 0 : 128) | 8);
                        njVar.i(0);
                        veVar.c(this.f3629f, 1);
                        this.U++;
                        this.f3634k.i(0);
                        veVar.c(this.f3634k, 8);
                        this.U += 8;
                    }
                    if (i13 == 2) {
                        if (!this.Q) {
                            leVar.b(this.f3629f.f7359a, 0, 1, false);
                            this.M++;
                            this.f3629f.i(0);
                            this.S = this.f3629f.l();
                            this.Q = true;
                        }
                        int i14 = this.S * 4;
                        this.f3629f.a(i14);
                        leVar.b(this.f3629f.f7359a, 0, i14, false);
                        this.M += i14;
                        int i15 = (this.S >> 1) + 1;
                        int i16 = (i15 * 6) + 2;
                        ByteBuffer byteBuffer = this.f3636m;
                        if (byteBuffer == null || byteBuffer.capacity() < i16) {
                            this.f3636m = ByteBuffer.allocate(i16);
                        }
                        this.f3636m.position(0);
                        this.f3636m.putShort((short) i15);
                        int i17 = 0;
                        int i18 = 0;
                        while (true) {
                            i11 = this.S;
                            if (i17 >= i11) {
                                break;
                            }
                            int u10 = this.f3629f.u();
                            if (i17 % 2 == 0) {
                                this.f3636m.putShort((short) (u10 - i18));
                            } else {
                                this.f3636m.putInt(u10 - i18);
                            }
                            i17++;
                            i18 = u10;
                        }
                        int i19 = (i10 - this.M) - i18;
                        if ((i11 & 1) == 1) {
                            this.f3636m.putInt(i19);
                        } else {
                            this.f3636m.putShort((short) i19);
                            this.f3636m.putInt(0);
                        }
                        this.f3635l.b(this.f3636m.array(), i16);
                        veVar.c(this.f3635l, i16);
                        this.U += i16;
                    }
                }
            } else {
                byte[] bArr = dfVar.f3240f;
                if (bArr != null) {
                    this.f3632i.b(bArr, bArr.length);
                }
            }
            this.N = true;
        }
        int e10 = i10 + this.f3632i.e();
        if (!"V_MPEG4/ISO/AVC".equals(dfVar.f3235a) && !"V_MPEGH/ISO/HEVC".equals(dfVar.f3235a)) {
            while (true) {
                int i20 = this.M;
                if (i20 >= e10) {
                    break;
                }
                t(leVar, veVar, e10 - i20);
            }
        } else {
            byte[] bArr2 = this.f3628e.f7359a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i21 = dfVar.P;
            int i22 = 4 - i21;
            while (this.M < e10) {
                int i23 = this.T;
                if (i23 == 0) {
                    int min = Math.min(i21, this.f3632i.d());
                    leVar.b(bArr2, i22 + min, i21 - min, false);
                    if (min > 0) {
                        this.f3632i.k(bArr2, i22, min);
                    }
                    this.M += i21;
                    this.f3628e.i(0);
                    this.T = this.f3628e.u();
                    this.f3627d.i(0);
                    veVar.c(this.f3627d, 4);
                    this.U += 4;
                } else {
                    this.T = i23 - t(leVar, veVar, i23);
                }
            }
        }
        if ("A_VORBIS".equals(dfVar.f3235a)) {
            this.f3630g.i(0);
            veVar.c(this.f3630g, 4);
            this.U += 4;
        }
    }

    public final int t(le leVar, ve veVar, int i10) throws IOException, InterruptedException {
        int d10;
        int d11 = this.f3632i.d();
        if (d11 > 0) {
            d10 = Math.min(i10, d11);
            veVar.c(this.f3632i, d10);
        } else {
            d10 = veVar.d(leVar, i10, false);
        }
        this.M += d10;
        this.U += d10;
        return d10;
    }
}
