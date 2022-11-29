package androidx.navigation;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: w  reason: collision with root package name */
    public final UUID f15751w;

    /* renamed from: x  reason: collision with root package name */
    public final int f15752x;

    /* renamed from: y  reason: collision with root package name */
    public final Bundle f15753y;

    /* renamed from: z  reason: collision with root package name */
    public final Bundle f15754z;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public k[] newArray(int i10) {
            return new k[i10];
        }
    }

    public k(j jVar) {
        this.f15751w = jVar.B;
        this.f15752x = jVar.b().r();
        this.f15753y = jVar.a();
        Bundle bundle = new Bundle();
        this.f15754z = bundle;
        jVar.h(bundle);
    }

    public Bundle a() {
        return this.f15753y;
    }

    public int b() {
        return this.f15752x;
    }

    public Bundle c() {
        return this.f15754z;
    }

    public UUID d() {
        return this.f15751w;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15751w.toString());
        parcel.writeInt(this.f15752x);
        parcel.writeBundle(this.f15753y);
        parcel.writeBundle(this.f15754z);
    }

    public k(Parcel parcel) {
        this.f15751w = UUID.fromString(parcel.readString());
        this.f15752x = parcel.readInt();
        this.f15753y = parcel.readBundle(k.class.getClassLoader());
        this.f15754z = parcel.readBundle(k.class.getClassLoader());
    }
}
