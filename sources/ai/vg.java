package ai;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;

/* loaded from: classes3.dex */
public final class vg extends xg {
    public static final Parcelable.Creator<vg> CREATOR = new ug();

    /* renamed from: x  reason: collision with root package name */
    public final String f11076x;

    /* renamed from: y  reason: collision with root package name */
    public final String f11077y;

    /* renamed from: z  reason: collision with root package name */
    public final String f11078z;

    public vg(Parcel parcel) {
        super(CommentFrame.ID);
        this.f11076x = parcel.readString();
        this.f11077y = parcel.readString();
        this.f11078z = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vg.class == obj.getClass()) {
            vg vgVar = (vg) obj;
            if (vj.a(this.f11077y, vgVar.f11077y) && vj.a(this.f11076x, vgVar.f11076x) && vj.a(this.f11078z, vgVar.f11078z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f11076x;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f11077y;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11078z;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f11921w);
        parcel.writeString(this.f11076x);
        parcel.writeString(this.f11078z);
    }

    public vg(String str, String str2, String str3) {
        super(CommentFrame.ID);
        this.f11076x = C.LANGUAGE_UNDETERMINED;
        this.f11077y = str2;
        this.f11078z = str3;
    }
}
