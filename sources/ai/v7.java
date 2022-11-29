package ai;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class v7 implements Parcelable {
    public static final Parcelable.Creator<v7> CREATOR = new t7();

    /* renamed from: w  reason: collision with root package name */
    public final u7[] f10992w;

    public v7(Parcel parcel) {
        this.f10992w = new u7[parcel.readInt()];
        int i10 = 0;
        while (true) {
            u7[] u7VarArr = this.f10992w;
            if (i10 >= u7VarArr.length) {
                return;
            }
            u7VarArr[i10] = (u7) parcel.readParcelable(u7.class.getClassLoader());
            i10++;
        }
    }

    public v7(u7... u7VarArr) {
        this.f10992w = u7VarArr;
    }

    public final int a() {
        return this.f10992w.length;
    }

    public final u7 b(int i10) {
        return this.f10992w[i10];
    }

    public final v7 c(v7 v7Var) {
        return v7Var == null ? this : d(v7Var.f10992w);
    }

    public final v7 d(u7... u7VarArr) {
        return u7VarArr.length == 0 ? this : new v7((u7[]) sb.L(this.f10992w, u7VarArr));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v7.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f10992w, ((v7) obj).f10992w);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10992w);
    }

    public final String toString() {
        String valueOf = String.valueOf(Arrays.toString(this.f10992w));
        return valueOf.length() != 0 ? "entries=".concat(valueOf) : new String("entries=");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f10992w.length);
        for (u7 u7Var : this.f10992w) {
            parcel.writeParcelable(u7Var, 0);
        }
    }

    public v7(List<? extends u7> list) {
        this.f10992w = (u7[]) list.toArray(new u7[0]);
    }
}
