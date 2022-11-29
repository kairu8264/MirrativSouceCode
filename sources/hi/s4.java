package hi;

import com.google.android.exoplayer2.C;
import java.util.List;

/* loaded from: classes3.dex */
public final class s4 extends t8<s4, r4> implements x9 {
    public static final /* synthetic */ int zza = 0;
    private static final s4 zze;
    private boolean zzA;
    private long zzC;
    private int zzD;
    private boolean zzG;
    private int zzJ;
    private int zzK;
    private int zzL;
    private long zzN;
    private long zzO;
    private int zzR;
    private w4 zzT;
    private long zzV;
    private long zzW;
    private int zzZ;
    private boolean zzaa;
    private boolean zzac;
    private o4 zzad;
    private int zzf;
    private int zzg;
    private int zzh;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzt;
    private long zzx;
    private long zzy;
    private a9<i4> zzi = t8.f();
    private a9<c5> zzj = t8.f();
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private String zzs = "";
    private String zzu = "";
    private String zzv = "";
    private String zzw = "";
    private String zzz = "";
    private String zzB = "";
    private String zzE = "";
    private String zzF = "";
    private a9<e4> zzH = t8.f();
    private String zzI = "";
    private String zzM = "";
    private String zzP = "";
    private String zzQ = "";
    private String zzS = "";
    private y8 zzU = t8.n();
    private String zzX = "";
    private String zzY = "";
    private String zzab = "";

    static {
        s4 s4Var = new s4();
        zze = s4Var;
        t8.j(s4.class, s4Var);
    }

    public static /* synthetic */ void B0(s4 s4Var, String str) {
        s4Var.zzg |= 128;
        s4Var.zzY = str;
    }

    public static /* synthetic */ void C0(s4 s4Var, Iterable iterable) {
        s4Var.c1();
        e7.c(iterable, s4Var.zzi);
    }

    public static /* synthetic */ void E0(s4 s4Var, int i10) {
        s4Var.c1();
        s4Var.zzi.remove(i10);
    }

    public static /* synthetic */ void F0(s4 s4Var, int i10, c5 c5Var) {
        c5Var.getClass();
        s4Var.d1();
        s4Var.zzj.set(i10, c5Var);
    }

    public static /* synthetic */ void G0(s4 s4Var, c5 c5Var) {
        c5Var.getClass();
        s4Var.d1();
        s4Var.zzj.add(c5Var);
    }

    public static /* synthetic */ void H(s4 s4Var, long j10) {
        s4Var.zzf |= 1073741824;
        s4Var.zzO = j10;
    }

    public static /* synthetic */ void H0(s4 s4Var, Iterable iterable) {
        s4Var.d1();
        e7.c(iterable, s4Var.zzj);
    }

    public static /* synthetic */ void I(s4 s4Var) {
        s4Var.zzf &= Integer.MAX_VALUE;
        s4Var.zzP = zze.zzP;
    }

    public static /* synthetic */ void I0(s4 s4Var, int i10) {
        s4Var.d1();
        s4Var.zzj.remove(i10);
    }

    public static /* synthetic */ void J(s4 s4Var, int i10) {
        s4Var.zzg |= 2;
        s4Var.zzR = i10;
    }

    public static /* synthetic */ void J0(s4 s4Var, long j10) {
        s4Var.zzf |= 2;
        s4Var.zzk = j10;
    }

    public static r4 J1() {
        return zze.k();
    }

    public static /* synthetic */ void K(s4 s4Var, int i10, i4 i4Var) {
        i4Var.getClass();
        s4Var.c1();
        s4Var.zzi.set(i10, i4Var);
    }

    public static /* synthetic */ void K0(s4 s4Var, long j10) {
        s4Var.zzf |= 4;
        s4Var.zzl = j10;
    }

    public static /* synthetic */ void L(s4 s4Var, String str) {
        str.getClass();
        s4Var.zzg |= 4;
        s4Var.zzS = str;
    }

    public static /* synthetic */ void L0(s4 s4Var, long j10) {
        s4Var.zzf |= 8;
        s4Var.zzm = j10;
    }

    public static /* synthetic */ void M(s4 s4Var, w4 w4Var) {
        w4Var.getClass();
        s4Var.zzT = w4Var;
        s4Var.zzg |= 8;
    }

    public static /* synthetic */ void M0(s4 s4Var, long j10) {
        s4Var.zzf |= 16;
        s4Var.zzn = j10;
    }

    public static /* synthetic */ void N(s4 s4Var, Iterable iterable) {
        y8 y8Var = s4Var.zzU;
        if (!y8Var.b()) {
            int size = y8Var.size();
            s4Var.zzU = y8Var.Y(size == 0 ? 10 : size + size);
        }
        e7.c(iterable, s4Var.zzU);
    }

    public static /* synthetic */ void N0(s4 s4Var) {
        s4Var.zzf &= -17;
        s4Var.zzn = 0L;
    }

    public static /* synthetic */ void O(s4 s4Var, i4 i4Var) {
        i4Var.getClass();
        s4Var.c1();
        s4Var.zzi.add(i4Var);
    }

    public static /* synthetic */ void O0(s4 s4Var, long j10) {
        s4Var.zzf |= 32;
        s4Var.zzo = j10;
    }

    public static /* synthetic */ void P(s4 s4Var, long j10) {
        s4Var.zzg |= 16;
        s4Var.zzV = j10;
    }

    public static /* synthetic */ void P0(s4 s4Var) {
        s4Var.zzf &= -33;
        s4Var.zzo = 0L;
    }

    public static /* synthetic */ void Q(s4 s4Var, long j10) {
        s4Var.zzg |= 32;
        s4Var.zzW = j10;
    }

    public static /* synthetic */ void Q0(s4 s4Var, String str) {
        s4Var.zzf |= 64;
        s4Var.zzp = "android";
    }

    public static /* synthetic */ void R0(s4 s4Var, String str) {
        str.getClass();
        s4Var.zzf |= 128;
        s4Var.zzq = str;
    }

    public static /* synthetic */ void S0(s4 s4Var, String str) {
        str.getClass();
        s4Var.zzf |= 256;
        s4Var.zzr = str;
    }

    public static /* synthetic */ void T(s4 s4Var, String str) {
        str.getClass();
        s4Var.zzf |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
        s4Var.zzz = str;
    }

    public static /* synthetic */ void T0(s4 s4Var, String str) {
        str.getClass();
        s4Var.zzf |= 512;
        s4Var.zzs = str;
    }

    public static /* synthetic */ void U(s4 s4Var) {
        s4Var.zzf &= -65537;
        s4Var.zzz = zze.zzz;
    }

    public static /* synthetic */ void U0(s4 s4Var, int i10) {
        s4Var.zzf |= 1024;
        s4Var.zzt = i10;
    }

    public static /* synthetic */ void V(s4 s4Var, boolean z10) {
        s4Var.zzf |= 131072;
        s4Var.zzA = z10;
    }

    public static /* synthetic */ void W(s4 s4Var) {
        s4Var.zzf &= -131073;
        s4Var.zzA = false;
    }

    public static /* synthetic */ void W0(s4 s4Var, String str) {
        str.getClass();
        s4Var.zzf |= 2048;
        s4Var.zzu = str;
    }

    public static /* synthetic */ void X(s4 s4Var, String str) {
        str.getClass();
        s4Var.zzf |= 262144;
        s4Var.zzB = str;
    }

    public static /* synthetic */ void X0(s4 s4Var, String str) {
        str.getClass();
        s4Var.zzf |= 4096;
        s4Var.zzv = str;
    }

    public static /* synthetic */ void Y(s4 s4Var) {
        s4Var.zzf &= -262145;
        s4Var.zzB = zze.zzB;
    }

    public static /* synthetic */ void Y0(s4 s4Var, String str) {
        str.getClass();
        s4Var.zzf |= 8192;
        s4Var.zzw = str;
    }

    public static /* synthetic */ void Z(s4 s4Var, long j10) {
        s4Var.zzf |= 524288;
        s4Var.zzC = j10;
    }

    public static /* synthetic */ void Z0(s4 s4Var, long j10) {
        s4Var.zzf |= 16384;
        s4Var.zzx = j10;
    }

    public static /* synthetic */ void a0(s4 s4Var, int i10) {
        s4Var.zzf |= 1048576;
        s4Var.zzD = i10;
    }

    public static /* synthetic */ void a1(s4 s4Var, long j10) {
        s4Var.zzf |= 32768;
        s4Var.zzy = 46000L;
    }

    public static /* synthetic */ void b0(s4 s4Var, String str) {
        s4Var.zzf |= 2097152;
        s4Var.zzE = str;
    }

    public static /* synthetic */ void c0(s4 s4Var) {
        s4Var.zzf &= -2097153;
        s4Var.zzE = zze.zzE;
    }

    public static /* synthetic */ void d0(s4 s4Var, String str) {
        str.getClass();
        s4Var.zzf |= 4194304;
        s4Var.zzF = str;
    }

    public static /* synthetic */ void e0(s4 s4Var, boolean z10) {
        s4Var.zzf |= 8388608;
        s4Var.zzG = z10;
    }

    public static /* synthetic */ void f0(s4 s4Var, Iterable iterable) {
        a9<e4> a9Var = s4Var.zzH;
        if (!a9Var.b()) {
            s4Var.zzH = t8.g(a9Var);
        }
        e7.c(iterable, s4Var.zzH);
    }

    public static /* synthetic */ void h0(s4 s4Var, String str) {
        str.getClass();
        s4Var.zzf |= 16777216;
        s4Var.zzI = str;
    }

    public static /* synthetic */ void i0(s4 s4Var, int i10) {
        s4Var.zzf |= 33554432;
        s4Var.zzJ = i10;
    }

    public static /* synthetic */ void j0(s4 s4Var, int i10) {
        s4Var.zzf |= 1;
        s4Var.zzh = 1;
    }

    public static /* synthetic */ void k0(s4 s4Var) {
        s4Var.zzf &= -268435457;
        s4Var.zzM = zze.zzM;
    }

    public static /* synthetic */ void l0(s4 s4Var, long j10) {
        s4Var.zzf |= 536870912;
        s4Var.zzN = j10;
    }

    public static /* synthetic */ void y0(s4 s4Var, String str) {
        str.getClass();
        s4Var.zzg |= 64;
        s4Var.zzX = str;
    }

    public final String A() {
        return this.zzq;
    }

    public final long A1() {
        return this.zzV;
    }

    public final String B() {
        return this.zzp;
    }

    public final long B1() {
        return this.zzm;
    }

    public final String C() {
        return this.zzz;
    }

    public final long C1() {
        return this.zzx;
    }

    public final String D() {
        return this.zzs;
    }

    public final long D1() {
        return this.zzo;
    }

    public final List<e4> E() {
        return this.zzH;
    }

    public final long E1() {
        return this.zzn;
    }

    public final List<i4> F() {
        return this.zzi;
    }

    public final long F1() {
        return this.zzl;
    }

    public final List<c5> G() {
        return this.zzj;
    }

    public final long G1() {
        return this.zzk;
    }

    public final long H1() {
        return this.zzy;
    }

    public final i4 I1(int i10) {
        return this.zzi.get(i10);
    }

    public final c5 L1(int i10) {
        return this.zzj.get(i10);
    }

    public final String M1() {
        return this.zzS;
    }

    public final String N1() {
        return this.zzv;
    }

    public final String O1() {
        return this.zzB;
    }

    public final int R() {
        return this.zzJ;
    }

    public final int b1() {
        return this.zzD;
    }

    public final void c1() {
        a9<i4> a9Var = this.zzi;
        if (a9Var.b()) {
            return;
        }
        this.zzi = t8.g(a9Var);
    }

    public final void d1() {
        a9<c5> a9Var = this.zzj;
        if (a9Var.b()) {
            return;
        }
        this.zzj = t8.g(a9Var);
    }

    public final boolean e1() {
        return (this.zzf & 524288) != 0;
    }

    public final boolean f1() {
        return (this.zzg & 16) != 0;
    }

    public final boolean g1() {
        return (this.zzf & 8) != 0;
    }

    public final boolean h1() {
        return (this.zzf & 16384) != 0;
    }

    public final boolean i1() {
        return (this.zzf & 131072) != 0;
    }

    public final boolean j1() {
        return (this.zzf & 32) != 0;
    }

    public final boolean k1() {
        return (this.zzf & 16) != 0;
    }

    public final boolean l1() {
        return (this.zzf & 1) != 0;
    }

    public final boolean m0() {
        return this.zzA;
    }

    public final boolean m1() {
        return (this.zzg & 2) != 0;
    }

    public final boolean n0() {
        return this.zzG;
    }

    public final boolean n1() {
        return (this.zzf & 8388608) != 0;
    }

    public final boolean o0() {
        return (this.zzf & 1073741824) != 0;
    }

    public final boolean o1() {
        return (this.zzf & 4) != 0;
    }

    public final boolean p0() {
        return (this.zzf & 33554432) != 0;
    }

    public final boolean p1() {
        return (this.zzf & 1024) != 0;
    }

    @Override // hi.t8
    public final Object q(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zze;
                    }
                    return new r4(null);
                }
                return new s4();
            }
            return t8.i(zze, "\u00011\u0000\u0002\u0001;1\u0000\u0004\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,", new Object[]{"zzf", "zzg", "zzh", "zzi", i4.class, "zzj", c5.class, "zzk", "zzl", "zzm", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzn", "zzG", "zzH", e4.class, "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", "zzZ", a4.f35632a, "zzaa", "zzab", "zzac", "zzad"});
        }
        return (byte) 1;
    }

    public final boolean q0() {
        return (this.zzf & 1048576) != 0;
    }

    public final boolean q1() {
        return (this.zzf & 2) != 0;
    }

    public final String r() {
        return this.zzu;
    }

    public final boolean r0() {
        return (this.zzf & 536870912) != 0;
    }

    public final boolean r1() {
        return (this.zzf & 32768) != 0;
    }

    public final String s() {
        return this.zzw;
    }

    public final int s1() {
        return this.zzi.size();
    }

    public final String t() {
        return this.zzY;
    }

    public final int t1() {
        return this.zzh;
    }

    public final String u() {
        return this.zzr;
    }

    public final int u1() {
        return this.zzR;
    }

    public final String v() {
        return this.zzP;
    }

    public final int v1() {
        return this.zzt;
    }

    public final String w() {
        return this.zzI;
    }

    public final boolean w0() {
        return (this.zzg & 128) != 0;
    }

    public final int w1() {
        return this.zzj.size();
    }

    public final String x() {
        return this.zzX;
    }

    public final long x1() {
        return this.zzO;
    }

    public final String y() {
        return this.zzF;
    }

    public final long y1() {
        return this.zzN;
    }

    public final String z() {
        return this.zzE;
    }

    public final long z1() {
        return this.zzC;
    }
}
