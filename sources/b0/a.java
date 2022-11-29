package b0;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class a implements Parcelable {

    /* renamed from: w  reason: collision with root package name */
    public final int f16663w;

    /* renamed from: x  reason: collision with root package name */
    public static final b f16662x = new b(null);
    public static final Parcelable.Creator<a> CREATOR = new C0089a();

    /* renamed from: b0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0089a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            jo.p.h(parcel, "parcel");
            return new a(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }
    }

    public a(int i10) {
        this.f16663w = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f16663w == ((a) obj).f16663w;
    }

    public int hashCode() {
        return Integer.hashCode(this.f16663w);
    }

    public String toString() {
        return "DefaultLazyKey(index=" + this.f16663w + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        jo.p.h(parcel, "parcel");
        parcel.writeInt(this.f16663w);
    }
}
