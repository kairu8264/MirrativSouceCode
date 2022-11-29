package hi;

import java.util.List;

/* loaded from: classes3.dex */
public final class m4 extends t8<m4, l4> implements x9 {
    private static final m4 zza;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = "";
    private String zzg = "";
    private a9<m4> zzk = t8.f();

    static {
        m4 m4Var = new m4();
        zza = m4Var;
        t8.j(m4.class, m4Var);
    }

    public static /* synthetic */ void A(m4 m4Var, String str) {
        str.getClass();
        m4Var.zze |= 1;
        m4Var.zzf = str;
    }

    public static /* synthetic */ void B(m4 m4Var, String str) {
        str.getClass();
        m4Var.zze |= 2;
        m4Var.zzg = str;
    }

    public static /* synthetic */ void C(m4 m4Var) {
        m4Var.zze &= -3;
        m4Var.zzg = zza.zzg;
    }

    public static /* synthetic */ void D(m4 m4Var, long j10) {
        m4Var.zze |= 4;
        m4Var.zzh = j10;
    }

    public static /* synthetic */ void E(m4 m4Var) {
        m4Var.zze &= -5;
        m4Var.zzh = 0L;
    }

    public static /* synthetic */ void F(m4 m4Var, double d10) {
        m4Var.zze |= 16;
        m4Var.zzj = d10;
    }

    public static /* synthetic */ void G(m4 m4Var) {
        m4Var.zze &= -17;
        m4Var.zzj = 0.0d;
    }

    public static /* synthetic */ void H(m4 m4Var, m4 m4Var2) {
        m4Var2.getClass();
        m4Var.P();
        m4Var.zzk.add(m4Var2);
    }

    public static /* synthetic */ void I(m4 m4Var, Iterable iterable) {
        m4Var.P();
        e7.c(iterable, m4Var.zzk);
    }

    public static l4 v() {
        return zza.k();
    }

    public final boolean K() {
        return (this.zze & 16) != 0;
    }

    public final boolean L() {
        return (this.zze & 8) != 0;
    }

    public final boolean M() {
        return (this.zze & 4) != 0;
    }

    public final boolean N() {
        return (this.zze & 1) != 0;
    }

    public final boolean O() {
        return (this.zze & 2) != 0;
    }

    public final void P() {
        a9<m4> a9Var = this.zzk;
        if (a9Var.b()) {
            return;
        }
        this.zzk = t8.g(a9Var);
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
                        return zza;
                    }
                    return new l4(null);
                }
                return new m4();
            }
            return t8.i(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", m4.class});
        }
        return (byte) 1;
    }

    public final double r() {
        return this.zzj;
    }

    public final float s() {
        return this.zzi;
    }

    public final int t() {
        return this.zzk.size();
    }

    public final long u() {
        return this.zzh;
    }

    public final String x() {
        return this.zzf;
    }

    public final String y() {
        return this.zzg;
    }

    public final List<m4> z() {
        return this.zzk;
    }
}
