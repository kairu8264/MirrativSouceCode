package ai;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class f8 implements u7 {
    public static final Parcelable.Creator<f8> CREATOR = new e8();

    /* renamed from: w  reason: collision with root package name */
    public final String f3961w;

    /* renamed from: x  reason: collision with root package name */
    public final String f3962x;

    public f8(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = sb.f9778a;
        this.f3961w = readString;
        this.f3962x = parcel.readString();
    }

    public f8(String str, String str2) {
        this.f3961w = str;
        this.f3962x = str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // ai.u7
    public final void E0(m5 m5Var) {
        char c10;
        String str = this.f3961w;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0) {
            m5Var.B(this.f3962x);
        } else if (c10 == 1) {
            m5Var.C(this.f3962x);
        } else if (c10 == 2) {
            m5Var.D(this.f3962x);
        } else if (c10 == 3) {
            m5Var.E(this.f3962x);
        } else if (c10 != 4) {
        } else {
            m5Var.F(this.f3962x);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f8.class == obj.getClass()) {
            f8 f8Var = (f8) obj;
            if (this.f3961w.equals(f8Var.f3961w) && this.f3962x.equals(f8Var.f3962x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f3961w.hashCode() + 527) * 31) + this.f3962x.hashCode();
    }

    public final String toString() {
        String str = this.f3961w;
        String str2 = this.f3962x;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb2.append("VC: ");
        sb2.append(str);
        sb2.append("=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f3961w);
        parcel.writeString(this.f3962x);
    }
}
