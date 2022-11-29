package ai;

/* loaded from: classes3.dex */
public final class jo extends ri3<jo, Cdo> implements yj3 {
    private static final jo zze;
    private aj3<co> zzb = ri3.n();

    static {
        jo joVar = new jo();
        zze = joVar;
        ri3.y(jo.class, joVar);
    }

    public static Cdo B() {
        return zze.u();
    }

    public static /* synthetic */ void D(jo joVar, co coVar) {
        coVar.getClass();
        aj3<co> aj3Var = joVar.zzb;
        if (!aj3Var.zza()) {
            joVar.zzb = ri3.o(aj3Var);
        }
        joVar.zzb.add(coVar);
    }

    @Override // ai.ri3
    public final Object A(int i10, Object obj, Object obj2) {
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
                    return new Cdo(null);
                }
                return new jo();
            }
            return ri3.z(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", co.class});
        }
        return (byte) 1;
    }
}
