package in;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new a();

    /* renamed from: w  reason: collision with root package name */
    public final String f36931w;

    /* renamed from: x  reason: collision with root package name */
    public final String f36932x;

    /* loaded from: classes4.dex */
    public class a implements Parcelable.Creator<q> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public q createFromParcel(Parcel parcel) {
            return new q(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public q[] newArray(int i10) {
            return new q[i10];
        }
    }

    public /* synthetic */ q(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static String d(String str) {
        if (str != null) {
            return str.trim();
        }
        return null;
    }

    public String a() {
        return this.f36931w;
    }

    public String b() {
        return this.f36932x;
    }

    public int c() {
        return 140;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f36931w);
        parcel.writeString(this.f36932x);
    }

    public q(String str, String str2) {
        if (str != null && str2 != null) {
            this.f36931w = d(str);
            this.f36932x = d(str2);
            return;
        }
        throw new IllegalArgumentException("TwitterAuthConfig must not be created with null consumer key or secret.");
    }

    public q(Parcel parcel) {
        this.f36931w = parcel.readString();
        this.f36932x = parcel.readString();
    }
}
