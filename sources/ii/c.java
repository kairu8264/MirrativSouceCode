package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class c implements Parcelable, Comparable<c> {
    public static final Parcelable.Creator<c> CREATOR = new d();

    /* renamed from: w  reason: collision with root package name */
    public final String f36828w;

    /* renamed from: x  reason: collision with root package name */
    public final long f36829x;

    /* renamed from: y  reason: collision with root package name */
    public final int f36830y;

    /* renamed from: z  reason: collision with root package name */
    public final String f36831z;

    public c(String str, long j10, int i10, String str2) {
        this.f36828w = str;
        this.f36829x = j10;
        this.f36830y = i10;
        this.f36831z = str2;
    }

    public static c c(String str, long j10, int i10, String str2) {
        return new c(str, j10, i10, str2);
    }

    public final String a() {
        return this.f36831z;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(c cVar) {
        return this.f36828w.compareToIgnoreCase(cVar.f36828w);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.f36829x;
    }

    public final int h() {
        return this.f36830y;
    }

    public final String toString() {
        return this.f36828w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f36828w);
        parcel.writeLong(this.f36829x);
        parcel.writeInt(this.f36830y);
        parcel.writeString(this.f36831z);
    }

    public c(Parcel parcel) {
        this.f36828w = parcel.readString();
        this.f36829x = parcel.readLong();
        this.f36830y = parcel.readInt();
        this.f36831z = parcel.readString();
    }

    public /* synthetic */ c(Parcel parcel, d dVar) {
        this(parcel);
    }
}
