package mh;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class a extends sh.a {
    public static final Parcelable.Creator<a> CREATOR = new e();

    /* renamed from: w  reason: collision with root package name */
    public Intent f41129w;

    public a(Intent intent) {
        this.f41129w = intent;
    }

    public Intent p() {
        return this.f41129w;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.p(parcel, 1, this.f41129w, i10, false);
        sh.b.b(parcel, a10);
    }
}
