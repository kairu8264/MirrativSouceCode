package ai;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* loaded from: classes3.dex */
public final class m72 implements xc2<n72> {

    /* renamed from: a  reason: collision with root package name */
    public final xc2<dd2> f6824a;

    /* renamed from: b  reason: collision with root package name */
    public final yl2 f6825b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f6826c;

    /* renamed from: d  reason: collision with root package name */
    public final fj0 f6827d;

    public m72(d92<dd2> d92Var, yl2 yl2Var, Context context, fj0 fj0Var) {
        this.f6824a = d92Var;
        this.f6825b = yl2Var;
        this.f6826c = context;
        this.f6827d = fj0Var;
    }

    public final /* synthetic */ n72 a(dd2 dd2Var) {
        String str;
        boolean z10;
        String str2;
        float f10;
        int i10;
        int i11;
        int i12;
        DisplayMetrics displayMetrics;
        fs fsVar = this.f6825b.f12651e;
        fs[] fsVarArr = fsVar.C;
        if (fsVarArr == null) {
            str = fsVar.f4173w;
            z10 = fsVar.E;
        } else {
            str = null;
            boolean z11 = false;
            boolean z12 = false;
            z10 = false;
            for (fs fsVar2 : fsVarArr) {
                boolean z13 = fsVar2.E;
                if (!z13 && !z11) {
                    str = fsVar2.f4173w;
                    z11 = true;
                }
                if (z13) {
                    if (z12) {
                        z12 = true;
                    } else {
                        z12 = true;
                        z10 = true;
                    }
                }
                if (z11 && z12) {
                    break;
                }
            }
        }
        Resources resources = this.f6826c.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            f10 = 0.0f;
            i10 = 0;
            i11 = 0;
        } else {
            float f11 = displayMetrics.density;
            int i13 = displayMetrics.widthPixels;
            i11 = displayMetrics.heightPixels;
            str2 = this.f6827d.p().u();
            i10 = i13;
            f10 = f11;
        }
        StringBuilder sb2 = new StringBuilder();
        fs[] fsVarArr2 = fsVar.C;
        if (fsVarArr2 != null) {
            boolean z14 = false;
            for (fs fsVar3 : fsVarArr2) {
                if (fsVar3.E) {
                    z14 = true;
                } else {
                    if (sb2.length() != 0) {
                        sb2.append("|");
                    }
                    int i14 = fsVar3.A;
                    if (i14 == -1) {
                        i14 = f10 != 0.0f ? (int) (fsVar3.B / f10) : -1;
                    }
                    sb2.append(i14);
                    sb2.append("x");
                    int i15 = fsVar3.f4174x;
                    if (i15 == -2) {
                        i15 = f10 != 0.0f ? (int) (fsVar3.f4175y / f10) : -2;
                    }
                    sb2.append(i15);
                }
            }
            if (z14) {
                if (sb2.length() != 0) {
                    i12 = 0;
                    sb2.insert(0, "|");
                } else {
                    i12 = 0;
                }
                sb2.insert(i12, "320x50");
            }
        }
        return new n72(fsVar, str, z10, sb2.toString(), f10, i10, i11, str2, this.f6825b.f12662p);
    }

    @Override // ai.xc2
    public final s43<n72> zza() {
        return j43.j(this.f6824a.zza(), new bx2(this) { // from class: ai.l72

            /* renamed from: a  reason: collision with root package name */
            public final m72 f6493a;

            {
                this.f6493a = this;
            }

            @Override // ai.bx2
            public final Object apply(Object obj) {
                return this.f6493a.a((dd2) obj);
            }
        }, hk0.f4883f);
    }
}
