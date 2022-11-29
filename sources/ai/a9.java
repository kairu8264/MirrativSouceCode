package ai;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;

/* loaded from: classes3.dex */
public final class a9 extends y8 {
    public static final Parcelable.Creator<a9> CREATOR = new z8();

    /* renamed from: x  reason: collision with root package name */
    public final String f1786x;

    /* renamed from: y  reason: collision with root package name */
    public final String f1787y;

    /* renamed from: z  reason: collision with root package name */
    public final String f1788z;

    public a9(Parcel parcel) {
        super(InternalFrame.ID);
        String readString = parcel.readString();
        int i10 = sb.f9778a;
        this.f1786x = readString;
        this.f1787y = parcel.readString();
        this.f1788z = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a9.class == obj.getClass()) {
            a9 a9Var = (a9) obj;
            if (sb.H(this.f1787y, a9Var.f1787y) && sb.H(this.f1786x, a9Var.f1786x) && sb.H(this.f1788z, a9Var.f1788z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f1786x;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f1787y;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f1788z;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // ai.y8
    public final String toString() {
        String str = this.f12479w;
        String str2 = this.f1786x;
        String str3 = this.f1787y;
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 23 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(": domain=");
        sb2.append(str2);
        sb2.append(", description=");
        sb2.append(str3);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12479w);
        parcel.writeString(this.f1786x);
        parcel.writeString(this.f1788z);
    }

    public a9(String str, String str2, String str3) {
        super(InternalFrame.ID);
        this.f1786x = str;
        this.f1787y = str2;
        this.f1788z = str3;
    }
}
