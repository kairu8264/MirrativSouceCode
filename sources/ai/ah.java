package ai;

/* loaded from: classes3.dex */
public final class ah implements zh {

    /* renamed from: w  reason: collision with root package name */
    public final zh[] f1848w;

    public ah(zh[] zhVarArr) {
        this.f1848w = zhVarArr;
    }

    @Override // ai.zh
    public final boolean d(long j10) {
        zh[] zhVarArr;
        boolean z10;
        boolean z11 = false;
        do {
            long zza = zza();
            if (zza == Long.MIN_VALUE) {
                break;
            }
            z10 = false;
            for (zh zhVar : this.f1848w) {
                if (zhVar.zza() == zza) {
                    z10 |= zhVar.d(j10);
                }
            }
            z11 |= z10;
        } while (z10);
        return z11;
    }

    @Override // ai.zh
    public final long zza() {
        long j10 = Long.MAX_VALUE;
        for (zh zhVar : this.f1848w) {
            long zza = zhVar.zza();
            if (zza != Long.MIN_VALUE) {
                j10 = Math.min(j10, zza);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }
}
