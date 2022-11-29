package ai;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class rg implements Parcelable {
    public static final Parcelable.Creator<rg> CREATOR = new pg();

    /* renamed from: w  reason: collision with root package name */
    public final qg[] f9431w;

    public rg(Parcel parcel) {
        this.f9431w = new qg[parcel.readInt()];
        int i10 = 0;
        while (true) {
            qg[] qgVarArr = this.f9431w;
            if (i10 >= qgVarArr.length) {
                return;
            }
            qgVarArr[i10] = (qg) parcel.readParcelable(qg.class.getClassLoader());
            i10++;
        }
    }

    public final int a() {
        return this.f9431w.length;
    }

    public final qg b(int i10) {
        return this.f9431w[i10];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rg.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f9431w, ((rg) obj).f9431w);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9431w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f9431w.length);
        for (qg qgVar : this.f9431w) {
            parcel.writeParcelable(qgVar, 0);
        }
    }

    public rg(List<? extends qg> list) {
        qg[] qgVarArr = new qg[list.size()];
        this.f9431w = qgVarArr;
        list.toArray(qgVarArr);
    }
}
