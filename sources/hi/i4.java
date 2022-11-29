package hi;

import java.util.List;

/* loaded from: classes3.dex */
public final class i4 extends t8<i4, h4> implements x9 {
    private static final i4 zza;
    private int zze;
    private a9<m4> zzf = t8.f();
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        i4 i4Var = new i4();
        zza = i4Var;
        t8.j(i4.class, i4Var);
    }

    public static /* synthetic */ void A(i4 i4Var, int i10, m4 m4Var) {
        m4Var.getClass();
        i4Var.L();
        i4Var.zzf.set(i10, m4Var);
    }

    public static /* synthetic */ void B(i4 i4Var, m4 m4Var) {
        m4Var.getClass();
        i4Var.L();
        i4Var.zzf.add(m4Var);
    }

    public static /* synthetic */ void C(i4 i4Var, Iterable iterable) {
        i4Var.L();
        e7.c(iterable, i4Var.zzf);
    }

    public static /* synthetic */ void E(i4 i4Var, int i10) {
        i4Var.L();
        i4Var.zzf.remove(i10);
    }

    public static /* synthetic */ void F(i4 i4Var, String str) {
        str.getClass();
        i4Var.zze |= 1;
        i4Var.zzg = str;
    }

    public static /* synthetic */ void G(i4 i4Var, long j10) {
        i4Var.zze |= 2;
        i4Var.zzh = j10;
    }

    public static /* synthetic */ void H(i4 i4Var, long j10) {
        i4Var.zze |= 4;
        i4Var.zzi = j10;
    }

    public static h4 v() {
        return zza.k();
    }

    public final boolean I() {
        return (this.zze & 8) != 0;
    }

    public final boolean J() {
        return (this.zze & 4) != 0;
    }

    public final boolean K() {
        return (this.zze & 2) != 0;
    }

    public final void L() {
        a9<m4> a9Var = this.zzf;
        if (a9Var.b()) {
            return;
        }
        this.zzf = t8.g(a9Var);
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
                    return new h4(null);
                }
                return new i4();
            }
            return t8.i(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", m4.class, "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public final int r() {
        return this.zzj;
    }

    public final int s() {
        return this.zzf.size();
    }

    public final long t() {
        return this.zzi;
    }

    public final long u() {
        return this.zzh;
    }

    public final m4 x(int i10) {
        return this.zzf.get(i10);
    }

    public final String y() {
        return this.zzg;
    }

    public final List<m4> z() {
        return this.zzf;
    }
}
