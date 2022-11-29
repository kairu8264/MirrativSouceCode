package ai;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class i9 extends y8 {
    public static final Parcelable.Creator<i9> CREATOR = new h9();

    /* renamed from: x  reason: collision with root package name */
    public final String f5138x;

    /* renamed from: y  reason: collision with root package name */
    public final String f5139y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i9(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = ai.sb.f9778a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f5138x = r0
            java.lang.String r3 = r3.readString()
            r2.f5139y = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.i9.<init>(android.os.Parcel):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i9.class == obj.getClass()) {
            i9 i9Var = (i9) obj;
            if (this.f12479w.equals(i9Var.f12479w) && sb.H(this.f5138x, i9Var.f5138x) && sb.H(this.f5139y, i9Var.f5139y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f12479w.hashCode() + 527) * 31;
        String str = this.f5138x;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5139y;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // ai.y8
    public final String toString() {
        String str = this.f12479w;
        String str2 = this.f5139y;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 6 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(": url=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12479w);
        parcel.writeString(this.f5138x);
        parcel.writeString(this.f5139y);
    }

    public i9(String str, String str2, String str3) {
        super(str);
        this.f5138x = str2;
        this.f5139y = str3;
    }
}
