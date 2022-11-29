package in;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public class r extends in.a implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new a();
    @ym.c("token")

    /* renamed from: x  reason: collision with root package name */
    public final String f36933x;
    @ym.c("secret")

    /* renamed from: y  reason: collision with root package name */
    public final String f36934y;

    /* loaded from: classes4.dex */
    public class a implements Parcelable.Creator<r> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public r createFromParcel(Parcel parcel) {
            return new r(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public r[] newArray(int i10) {
            return new r[i10];
        }
    }

    public /* synthetic */ r(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            String str = this.f36934y;
            if (str == null ? rVar.f36934y == null : str.equals(rVar.f36934y)) {
                String str2 = this.f36933x;
                String str3 = rVar.f36933x;
                return str2 != null ? str2.equals(str3) : str3 == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f36933x;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f36934y;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "token=" + this.f36933x + ",secret=" + this.f36934y;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f36933x);
        parcel.writeString(this.f36934y);
    }

    public r(String str, String str2) {
        this.f36933x = str;
        this.f36934y = str2;
    }

    public r(Parcel parcel) {
        this.f36933x = parcel.readString();
        this.f36934y = parcel.readString();
    }
}
