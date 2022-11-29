package rh;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes3.dex */
public final class n0 extends sh.a {
    public static final Parcelable.Creator<n0> CREATOR = new o0();

    /* renamed from: w  reason: collision with root package name */
    public final int f51481w;

    /* renamed from: x  reason: collision with root package name */
    public final Account f51482x;

    /* renamed from: y  reason: collision with root package name */
    public final int f51483y;

    /* renamed from: z  reason: collision with root package name */
    public final GoogleSignInAccount f51484z;

    public n0(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f51481w = i10;
        this.f51482x = account;
        this.f51483y = i11;
        this.f51484z = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.k(parcel, 1, this.f51481w);
        sh.b.p(parcel, 2, this.f51482x, i10, false);
        sh.b.k(parcel, 3, this.f51483y);
        sh.b.p(parcel, 4, this.f51484z, i10, false);
        sh.b.b(parcel, a10);
    }

    public n0(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }
}
