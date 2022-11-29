package ai;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;

/* loaded from: classes3.dex */
public final class r8 extends y8 {
    public static final Parcelable.Creator<r8> CREATOR = new q8();

    /* renamed from: x  reason: collision with root package name */
    public final String f9367x;

    /* renamed from: y  reason: collision with root package name */
    public final String f9368y;

    /* renamed from: z  reason: collision with root package name */
    public final String f9369z;

    public r8(Parcel parcel) {
        super(CommentFrame.ID);
        String readString = parcel.readString();
        int i10 = sb.f9778a;
        this.f9367x = readString;
        this.f9368y = parcel.readString();
        this.f9369z = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r8.class == obj.getClass()) {
            r8 r8Var = (r8) obj;
            if (sb.H(this.f9368y, r8Var.f9368y) && sb.H(this.f9367x, r8Var.f9367x) && sb.H(this.f9369z, r8Var.f9369z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f9367x;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f9368y;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9369z;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // ai.y8
    public final String toString() {
        String str = this.f12479w;
        String str2 = this.f9367x;
        String str3 = this.f9368y;
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(": language=");
        sb2.append(str2);
        sb2.append(", description=");
        sb2.append(str3);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12479w);
        parcel.writeString(this.f9367x);
        parcel.writeString(this.f9369z);
    }

    public r8(String str, String str2, String str3) {
        super(CommentFrame.ID);
        this.f9367x = str;
        this.f9368y = str2;
        this.f9369z = str3;
    }
}
