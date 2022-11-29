package ai;

import android.os.Parcel;
import android.os.Parcelable;
import dh.d;

/* loaded from: classes3.dex */
public final class a00 extends sh.a {
    public static final Parcelable.Creator<a00> CREATOR = new b00();
    public final int A;
    public final uw B;
    public final boolean C;
    public final int D;

    /* renamed from: w  reason: collision with root package name */
    public final int f1654w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f1655x;

    /* renamed from: y  reason: collision with root package name */
    public final int f1656y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f1657z;

    public a00(int i10, boolean z10, int i11, boolean z11, int i12, uw uwVar, boolean z12, int i13) {
        this.f1654w = i10;
        this.f1655x = z10;
        this.f1656y = i11;
        this.f1657z = z11;
        this.A = i12;
        this.B = uwVar;
        this.C = z12;
        this.D = i13;
    }

    public static dh.d p(a00 a00Var) {
        d.a aVar = new d.a();
        if (a00Var == null) {
            return aVar.a();
        }
        int i10 = a00Var.f1654w;
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 == 4) {
                    aVar.d(a00Var.C);
                    aVar.c(a00Var.D);
                }
                aVar.f(a00Var.f1655x);
                aVar.e(a00Var.f1657z);
                return aVar.a();
            }
            uw uwVar = a00Var.B;
            if (uwVar != null) {
                aVar.g(new rg.v(uwVar));
            }
        }
        aVar.b(a00Var.A);
        aVar.f(a00Var.f1655x);
        aVar.e(a00Var.f1657z);
        return aVar.a();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.k(parcel, 1, this.f1654w);
        sh.b.c(parcel, 2, this.f1655x);
        sh.b.k(parcel, 3, this.f1656y);
        sh.b.c(parcel, 4, this.f1657z);
        sh.b.k(parcel, 5, this.A);
        sh.b.p(parcel, 6, this.B, i10, false);
        sh.b.c(parcel, 7, this.C);
        sh.b.k(parcel, 8, this.D);
        sh.b.b(parcel, a10);
    }

    public a00(tg.e eVar) {
        this(4, eVar.f(), eVar.b(), eVar.e(), eVar.a(), eVar.d() != null ? new uw(eVar.d()) : null, eVar.g(), eVar.c());
    }
}
