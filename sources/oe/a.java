package oe;

import android.os.Parcel;
import android.os.Parcelable;
import jo.p;

/* loaded from: classes2.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0682a();
    public static final int D = 8;
    public final long A;
    public final String B;
    public final b C;

    /* renamed from: w  reason: collision with root package name */
    public final String f45377w;

    /* renamed from: x  reason: collision with root package name */
    public final String f45378x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f45379y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f45380z;

    /* renamed from: oe.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0682a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final a createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new a(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(String str, String str2, boolean z10, boolean z11, long j10, String str3, b bVar) {
        p.h(str, "liveId");
        p.h(str2, "userId");
        this.f45377w = str;
        this.f45378x = str2;
        this.f45379y = z10;
        this.f45380z = z11;
        this.A = j10;
        this.B = str3;
        this.C = bVar;
    }

    public final boolean a() {
        return this.f45380z;
    }

    public final String b() {
        return this.B;
    }

    public final String c() {
        return this.f45377w;
    }

    public final long d() {
        return this.A;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.f45379y;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return p.c(this.f45377w, aVar.f45377w) && p.c(this.f45378x, aVar.f45378x) && this.f45379y == aVar.f45379y && this.f45380z == aVar.f45380z && this.A == aVar.A && p.c(this.B, aVar.B) && p.c(this.C, aVar.C);
        }
        return false;
    }

    public final String f() {
        return this.f45378x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f45377w.hashCode() * 31) + this.f45378x.hashCode()) * 31;
        boolean z10 = this.f45379y;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.f45380z;
        int hashCode2 = (((i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + Long.hashCode(this.A)) * 31;
        String str = this.B;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.C;
        return hashCode3 + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "LiveRequest(liveId=" + this.f45377w + ", userId=" + this.f45378x + ", showRecommendLives=" + this.f45379y + ", hasNoArchive=" + this.f45380z + ", requestRecommendLivesDelayTimeMillis=" + this.A + ", linkedLiveId=" + this.B + ", streamer=" + this.C + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeString(this.f45377w);
        parcel.writeString(this.f45378x);
        parcel.writeInt(this.f45379y ? 1 : 0);
        parcel.writeInt(this.f45380z ? 1 : 0);
        parcel.writeLong(this.A);
        parcel.writeString(this.B);
        b bVar = this.C;
        if (bVar == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        bVar.writeToParcel(parcel, i10);
    }
}
