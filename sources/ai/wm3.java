package ai;

import java.util.List;

/* loaded from: classes3.dex */
public final class wm3 extends ri3<wm3, xl3> implements yj3 {
    private static final wm3 zzx;
    private int zzb;
    private int zze;
    private int zzf;
    private zl3 zzj;
    private mm3 zzm;
    private boolean zzn;
    private boolean zzq;
    private boolean zzr;
    private vm3 zzt;
    private byte zzw = 2;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private aj3<tm3> zzk = ri3.n();
    private String zzl = "";
    private aj3<String> zzo = ri3.n();
    private String zzp = "";
    private oh3 zzs = oh3.f7807x;
    private aj3<String> zzu = ri3.n();
    private aj3<String> zzv = ri3.n();

    static {
        wm3 wm3Var = new wm3();
        zzx = wm3Var;
        ri3.y(wm3.class, wm3Var);
    }

    public static xl3 E() {
        return zzx.u();
    }

    public static /* synthetic */ void G(wm3 wm3Var, String str) {
        str.getClass();
        wm3Var.zzb |= 4;
        wm3Var.zzg = str;
    }

    public static /* synthetic */ void H(wm3 wm3Var, String str) {
        str.getClass();
        wm3Var.zzb |= 8;
        wm3Var.zzh = str;
    }

    public static /* synthetic */ void I(wm3 wm3Var, zl3 zl3Var) {
        zl3Var.getClass();
        wm3Var.zzj = zl3Var;
        wm3Var.zzb |= 32;
    }

    public static /* synthetic */ void J(wm3 wm3Var, tm3 tm3Var) {
        tm3Var.getClass();
        aj3<tm3> aj3Var = wm3Var.zzk;
        if (!aj3Var.zza()) {
            wm3Var.zzk = ri3.o(aj3Var);
        }
        wm3Var.zzk.add(tm3Var);
    }

    public static /* synthetic */ void K(wm3 wm3Var, String str) {
        wm3Var.zzb |= 64;
        wm3Var.zzl = str;
    }

    public static /* synthetic */ void M(wm3 wm3Var) {
        wm3Var.zzb &= -65;
        wm3Var.zzl = zzx.zzl;
    }

    public static /* synthetic */ void N(wm3 wm3Var, mm3 mm3Var) {
        mm3Var.getClass();
        wm3Var.zzm = mm3Var;
        wm3Var.zzb |= 128;
    }

    public static /* synthetic */ void O(wm3 wm3Var, vm3 vm3Var) {
        vm3Var.getClass();
        wm3Var.zzt = vm3Var;
        wm3Var.zzb |= 8192;
    }

    public static /* synthetic */ void Q(wm3 wm3Var, Iterable iterable) {
        aj3<String> aj3Var = wm3Var.zzu;
        if (!aj3Var.zza()) {
            wm3Var.zzu = ri3.o(aj3Var);
        }
        xg3.h(iterable, wm3Var.zzu);
    }

    public static /* synthetic */ void R(wm3 wm3Var, Iterable iterable) {
        aj3<String> aj3Var = wm3Var.zzv;
        if (!aj3Var.zza()) {
            wm3Var.zzv = ri3.o(aj3Var);
        }
        xg3.h(iterable, wm3Var.zzv);
    }

    public static /* synthetic */ void S(wm3 wm3Var, int i10) {
        wm3Var.zze = i10 - 1;
        wm3Var.zzb |= 1;
    }

    @Override // ai.ri3
    public final Object A(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            this.zzw = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzx;
                    }
                    return new xl3(null);
                }
                return new wm3();
            }
            return ri3.z(zzx, "\u0001\u0012\u0000\u0001\u0001\u0015\u0012\u0000\u0004\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\nဌ\u0000\u000bဌ\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0011ဉ\r\u0014\u001a\u0015\u001a", new Object[]{"zzb", "zzg", "zzh", "zzi", "zzk", tm3.class, "zzn", "zzo", "zzp", "zzq", "zzr", "zze", nm3.f7407a, "zzf", wl3.f11687a, "zzj", "zzl", "zzm", "zzs", "zzt", "zzu", "zzv"});
        }
        return Byte.valueOf(this.zzw);
    }

    public final String B() {
        return this.zzg;
    }

    public final List<tm3> C() {
        return this.zzk;
    }

    public final String D() {
        return this.zzl;
    }
}
