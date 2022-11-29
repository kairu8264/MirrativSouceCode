package ai;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class ru3 implements Comparator<qt3>, Parcelable {
    public static final Parcelable.Creator<ru3> CREATOR = new vr3();

    /* renamed from: w  reason: collision with root package name */
    public final qt3[] f9598w;

    /* renamed from: x  reason: collision with root package name */
    public int f9599x;

    /* renamed from: y  reason: collision with root package name */
    public final String f9600y;

    public ru3(Parcel parcel) {
        this.f9600y = parcel.readString();
        qt3[] qt3VarArr = (qt3[]) sb.I((qt3[]) parcel.createTypedArray(qt3.CREATOR));
        this.f9598w = qt3VarArr;
        int length = qt3VarArr.length;
    }

    public final ru3 a(String str) {
        return sb.H(this.f9600y, str) ? this : new ru3(str, false, this.f9598w);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(qt3 qt3Var, qt3 qt3Var2) {
        qt3 qt3Var3 = qt3Var;
        qt3 qt3Var4 = qt3Var2;
        UUID uuid = y2.f12418a;
        if (uuid.equals(qt3Var3.f9196x)) {
            return !uuid.equals(qt3Var4.f9196x) ? 1 : 0;
        }
        return qt3Var3.f9196x.compareTo(qt3Var4.f9196x);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ru3.class == obj.getClass()) {
            ru3 ru3Var = (ru3) obj;
            if (sb.H(this.f9600y, ru3Var.f9600y) && Arrays.equals(this.f9598w, ru3Var.f9598w)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f9599x;
        if (i10 == 0) {
            String str = this.f9600y;
            int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f9598w);
            this.f9599x = hashCode;
            return hashCode;
        }
        return i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9600y);
        parcel.writeTypedArray(this.f9598w, 0);
    }

    public ru3(String str, boolean z10, qt3... qt3VarArr) {
        this.f9600y = str;
        qt3VarArr = z10 ? (qt3[]) qt3VarArr.clone() : qt3VarArr;
        this.f9598w = qt3VarArr;
        int length = qt3VarArr.length;
        Arrays.sort(qt3VarArr, this);
    }

    public ru3(String str, qt3... qt3VarArr) {
        this(null, true, qt3VarArr);
    }

    public ru3(List<qt3> list) {
        this(null, false, (qt3[]) list.toArray(new qt3[0]));
    }
}
