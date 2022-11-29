package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class aq extends ri3<aq, zp> implements yj3 {
    private static final xi3<Integer, mo> zzj = new yp();
    private static final aq zzr;
    private int zzb;
    private long zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private wi3 zzi = ri3.k();
    private vp zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;

    static {
        aq aqVar = new aq();
        zzr = aqVar;
        ri3.y(aq.class, aqVar);
    }

    public static /* synthetic */ void B(aq aqVar, int i10) {
        aqVar.zzn = i10 - 1;
        aqVar.zzb |= 128;
    }

    public static /* synthetic */ void C(aq aqVar, int i10) {
        aqVar.zzp = i10 - 1;
        aqVar.zzb |= 512;
    }

    public static aq K(byte[] bArr) throws zzggm {
        return (aq) ri3.s(zzr, bArr);
    }

    public static zp M() {
        return zzr.u();
    }

    public static /* synthetic */ void O(aq aqVar, long j10) {
        aqVar.zzb |= 1;
        aqVar.zze = j10;
    }

    public static /* synthetic */ void Q(aq aqVar, long j10) {
        aqVar.zzb |= 4;
        aqVar.zzg = j10;
    }

    public static /* synthetic */ void R(aq aqVar, long j10) {
        aqVar.zzb |= 8;
        aqVar.zzh = j10;
    }

    public static /* synthetic */ void S(aq aqVar, Iterable iterable) {
        wi3 wi3Var = aqVar.zzi;
        if (!wi3Var.zza()) {
            aqVar.zzi = ri3.l(wi3Var);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            aqVar.zzi.c0(((mo) it.next()).zza());
        }
    }

    public static /* synthetic */ void U(aq aqVar, vp vpVar) {
        vpVar.getClass();
        aqVar.zzk = vpVar;
        aqVar.zzb |= 16;
    }

    public static /* synthetic */ void V(aq aqVar, int i10) {
        aqVar.zzb |= 256;
        aqVar.zzo = i10;
    }

    public static /* synthetic */ void W(aq aqVar, eq eqVar) {
        aqVar.zzq = eqVar.zza();
        aqVar.zzb |= 1024;
    }

    public static /* synthetic */ void c0(aq aqVar, int i10) {
        aqVar.zzf = i10 - 1;
        aqVar.zzb |= 2;
    }

    public static /* synthetic */ void d0(aq aqVar, int i10) {
        aqVar.zzl = i10 - 1;
        aqVar.zzb |= 32;
    }

    public static /* synthetic */ void e0(aq aqVar, int i10) {
        aqVar.zzm = i10 - 1;
        aqVar.zzb |= 64;
    }

    @Override // ai.ri3
    public final Object A(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                vi3 vi3Var = dp.f3366a;
                return ri3.z(zzr, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001e\u0006ဉ\u0004\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nင\b\u000bဌ\t\fဌ\n", new Object[]{"zzb", "zze", "zzf", vi3Var, "zzg", "zzh", "zzi", mo.c(), "zzk", "zzl", vi3Var, "zzm", vi3Var, "zzn", vi3Var, "zzo", "zzp", vi3Var, "zzq", eq.c()});
            } else if (i11 != 3) {
                if (i11 != 4) {
                    if (i11 != 5) {
                        return null;
                    }
                    return zzr;
                }
                return new zp(null);
            } else {
                return new aq();
            }
        }
        return (byte) 1;
    }

    public final long D() {
        return this.zze;
    }

    public final long E() {
        return this.zzg;
    }

    public final long F() {
        return this.zzh;
    }

    public final List<mo> G() {
        return new yi3(this.zzi, zzj);
    }

    public final vp H() {
        vp vpVar = this.zzk;
        return vpVar == null ? vp.E() : vpVar;
    }

    public final int I() {
        return this.zzo;
    }

    public final eq J() {
        eq a10 = eq.a(this.zzq);
        return a10 == null ? eq.UNSPECIFIED : a10;
    }

    public final int X() {
        int a10 = ep.a(this.zzf);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }

    public final int Y() {
        int a10 = ep.a(this.zzl);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }

    public final int Z() {
        int a10 = ep.a(this.zzm);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }

    public final int a0() {
        int a10 = ep.a(this.zzn);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }

    public final int b0() {
        int a10 = ep.a(this.zzp);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }
}
