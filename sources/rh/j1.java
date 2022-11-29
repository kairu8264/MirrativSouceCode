package rh;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class j1 implements Parcelable.Creator<f> {
    public static void a(f fVar, Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.k(parcel, 1, fVar.f51439w);
        sh.b.k(parcel, 2, fVar.f51440x);
        sh.b.k(parcel, 3, fVar.f51441y);
        sh.b.q(parcel, 4, fVar.f51442z, false);
        sh.b.j(parcel, 5, fVar.A, false);
        sh.b.t(parcel, 6, fVar.B, i10, false);
        sh.b.e(parcel, 7, fVar.C, false);
        sh.b.p(parcel, 8, fVar.D, i10, false);
        sh.b.t(parcel, 10, fVar.E, i10, false);
        sh.b.t(parcel, 11, fVar.F, i10, false);
        sh.b.c(parcel, 12, fVar.G);
        sh.b.k(parcel, 13, fVar.H);
        sh.b.c(parcel, 14, fVar.I);
        sh.b.q(parcel, 15, fVar.p(), false);
        sh.b.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ f createFromParcel(Parcel parcel) {
        int y10 = SafeParcelReader.y(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        boolean z11 = false;
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        nh.c[] cVarArr = null;
        nh.c[] cVarArr2 = null;
        String str2 = null;
        while (parcel.dataPosition() < y10) {
            int r10 = SafeParcelReader.r(parcel);
            switch (SafeParcelReader.l(r10)) {
                case 1:
                    i10 = SafeParcelReader.t(parcel, r10);
                    break;
                case 2:
                    i11 = SafeParcelReader.t(parcel, r10);
                    break;
                case 3:
                    i12 = SafeParcelReader.t(parcel, r10);
                    break;
                case 4:
                    str = SafeParcelReader.f(parcel, r10);
                    break;
                case 5:
                    iBinder = SafeParcelReader.s(parcel, r10);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.i(parcel, r10, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.a(parcel, r10);
                    break;
                case 8:
                    account = (Account) SafeParcelReader.e(parcel, r10, Account.CREATOR);
                    break;
                case 9:
                default:
                    SafeParcelReader.x(parcel, r10);
                    break;
                case 10:
                    cVarArr = (nh.c[]) SafeParcelReader.i(parcel, r10, nh.c.CREATOR);
                    break;
                case 11:
                    cVarArr2 = (nh.c[]) SafeParcelReader.i(parcel, r10, nh.c.CREATOR);
                    break;
                case 12:
                    z10 = SafeParcelReader.m(parcel, r10);
                    break;
                case 13:
                    i13 = SafeParcelReader.t(parcel, r10);
                    break;
                case 14:
                    z11 = SafeParcelReader.m(parcel, r10);
                    break;
                case 15:
                    str2 = SafeParcelReader.f(parcel, r10);
                    break;
            }
        }
        SafeParcelReader.k(parcel, y10);
        return new f(i10, i11, i12, str, iBinder, scopeArr, bundle, account, cVarArr, cVarArr2, z10, i13, z11, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f[] newArray(int i10) {
        return new f[i10];
    }
}
