package ai;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class zg extends xg {
    public static final Parcelable.Creator<zg> CREATOR = new yg();

    /* renamed from: x  reason: collision with root package name */
    public final String f12974x;

    /* renamed from: y  reason: collision with root package name */
    public final String f12975y;

    public zg(Parcel parcel) {
        super(parcel.readString());
        this.f12974x = parcel.readString();
        this.f12975y = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zg.class == obj.getClass()) {
            zg zgVar = (zg) obj;
            if (this.f11921w.equals(zgVar.f11921w) && vj.a(this.f12974x, zgVar.f12974x) && vj.a(this.f12975y, zgVar.f12975y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f11921w.hashCode() + 527) * 31;
        String str = this.f12974x;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12975y;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f11921w);
        parcel.writeString(this.f12974x);
        parcel.writeString(this.f12975y);
    }

    public zg(String str, String str2, String str3) {
        super(str);
        this.f12974x = null;
        this.f12975y = str3;
    }
}
