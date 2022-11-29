package ai;

import com.google.android.gms.internal.ads.zzasu;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class rh implements oh {
    public xc A;
    public zzasu C;

    /* renamed from: w  reason: collision with root package name */
    public final oh[] f9435w;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<oh> f9436x;

    /* renamed from: z  reason: collision with root package name */
    public nh f9438z;

    /* renamed from: y  reason: collision with root package name */
    public final wc f9437y = new wc();
    public int B = -1;

    public rh(oh... ohVarArr) {
        this.f9435w = ohVarArr;
        this.f9436x = new ArrayList<>(Arrays.asList(ohVarArr));
    }

    public static /* synthetic */ void a(rh rhVar, int i10, xc xcVar, Object obj) {
        zzasu zzasuVar;
        if (rhVar.C == null) {
            for (int i11 = 0; i11 <= 0; i11++) {
                xcVar.g(i11, rhVar.f9437y, false);
            }
            int i12 = rhVar.B;
            if (i12 == -1) {
                rhVar.B = 1;
            } else if (i12 != 1) {
                zzasuVar = new zzasu(1);
                rhVar.C = zzasuVar;
            }
            zzasuVar = null;
            rhVar.C = zzasuVar;
        }
        if (rhVar.C != null) {
            return;
        }
        rhVar.f9436x.remove(rhVar.f9435w[i10]);
        if (i10 == 0) {
            rhVar.A = xcVar;
        }
        if (rhVar.f9436x.isEmpty()) {
            rhVar.f9438z.a(rhVar.A, null);
        }
    }

    @Override // ai.oh
    public final void b(mh mhVar) {
        ph phVar = (ph) mhVar;
        int i10 = 0;
        while (true) {
            oh[] ohVarArr = this.f9435w;
            if (i10 >= ohVarArr.length) {
                return;
            }
            ohVarArr[i10].b(phVar.f8411w[i10]);
            i10++;
        }
    }

    @Override // ai.oh
    public final mh c(int i10, wi wiVar) {
        int length = this.f9435w.length;
        mh[] mhVarArr = new mh[length];
        for (int i11 = 0; i11 < length; i11++) {
            mhVarArr[i11] = this.f9435w[i11].c(i10, wiVar);
        }
        return new ph(mhVarArr);
    }

    @Override // ai.oh
    public final void d() {
        for (oh ohVar : this.f9435w) {
            ohVar.d();
        }
    }

    @Override // ai.oh
    public final void e(ec ecVar, boolean z10, nh nhVar) {
        this.f9438z = nhVar;
        int i10 = 0;
        while (true) {
            oh[] ohVarArr = this.f9435w;
            if (i10 >= ohVarArr.length) {
                return;
            }
            ohVarArr[i10].e(ecVar, false, new qh(this, i10));
            i10++;
        }
    }

    @Override // ai.oh
    public final void zzb() throws IOException {
        zzasu zzasuVar = this.C;
        if (zzasuVar != null) {
            throw zzasuVar;
        }
        for (oh ohVar : this.f9435w) {
            ohVar.zzb();
        }
    }
}
