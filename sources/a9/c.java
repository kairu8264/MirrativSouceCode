package a9;

import android.os.Parcel;
import android.os.Parcelable;
import jo.h;
import jo.p;

/* loaded from: classes.dex */
public final class c implements Parcelable {
    public final boolean A;

    /* renamed from: w  reason: collision with root package name */
    public final String f652w;

    /* renamed from: x  reason: collision with root package name */
    public final String f653x;

    /* renamed from: y  reason: collision with root package name */
    public final String f654y;

    /* renamed from: z  reason: collision with root package name */
    public final String f655z;
    public static final a B = new a(null);
    public static final Parcelable.Creator<c> CREATOR = new b();
    public static final int C = 8;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final c a(String str, String str2, String str3, String str4) {
            p.h(str, "rewardImageUrl");
            p.h(str2, "categoryImageUrl");
            p.h(str3, "nameText");
            p.h(str4, "descriptionText");
            return new c(str, str2, str3, str4, str2.length() > 0);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final c createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new c(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(String str, String str2, String str3, String str4, boolean z10) {
        p.h(str, "rewardImageUrl");
        p.h(str2, "categoryImageUrl");
        p.h(str3, "nameText");
        p.h(str4, "descriptionText");
        this.f652w = str;
        this.f653x = str2;
        this.f654y = str3;
        this.f655z = str4;
        this.A = z10;
    }

    public final String a() {
        return this.f653x;
    }

    public final String b() {
        return this.f655z;
    }

    public final String c() {
        return this.f654y;
    }

    public final String d() {
        return this.f652w;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.A;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return p.c(this.f652w, cVar.f652w) && p.c(this.f653x, cVar.f653x) && p.c(this.f654y, cVar.f654y) && p.c(this.f655z, cVar.f655z) && this.A == cVar.A;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f652w.hashCode() * 31) + this.f653x.hashCode()) * 31) + this.f654y.hashCode()) * 31) + this.f655z.hashCode()) * 31;
        boolean z10 = this.A;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "MissionRewardDetailViewBindModel(rewardImageUrl=" + this.f652w + ", categoryImageUrl=" + this.f653x + ", nameText=" + this.f654y + ", descriptionText=" + this.f655z + ", isVisibleCategoryImageView=" + this.A + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeString(this.f652w);
        parcel.writeString(this.f653x);
        parcel.writeString(this.f654y);
        parcel.writeString(this.f655z);
        parcel.writeInt(this.A ? 1 : 0);
    }
}
