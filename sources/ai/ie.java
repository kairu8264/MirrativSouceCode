package ai;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class ie implements Comparator<he>, Parcelable {
    public static final Parcelable.Creator<ie> CREATOR = new fe();

    /* renamed from: w  reason: collision with root package name */
    public final he[] f5198w;

    /* renamed from: x  reason: collision with root package name */
    public int f5199x;

    /* renamed from: y  reason: collision with root package name */
    public final int f5200y;

    public ie(Parcel parcel) {
        he[] heVarArr = (he[]) parcel.createTypedArray(he.CREATOR);
        this.f5198w = heVarArr;
        this.f5200y = heVarArr.length;
    }

    public final he a(int i10) {
        return this.f5198w[i10];
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(he heVar, he heVar2) {
        UUID uuid;
        UUID uuid2;
        UUID uuid3;
        UUID uuid4;
        he heVar3 = heVar;
        he heVar4 = heVar2;
        UUID uuid5 = zb.f12922b;
        uuid = heVar3.f4831x;
        if (uuid5.equals(uuid)) {
            uuid4 = heVar4.f4831x;
            return !uuid5.equals(uuid4) ? 1 : 0;
        }
        uuid2 = heVar3.f4831x;
        uuid3 = heVar4.f4831x;
        return uuid2.compareTo(uuid3);
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
        if (obj == null || ie.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f5198w, ((ie) obj).f5198w);
    }

    public final int hashCode() {
        int i10 = this.f5199x;
        if (i10 == 0) {
            int hashCode = Arrays.hashCode(this.f5198w);
            this.f5199x = hashCode;
            return hashCode;
        }
        return i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedArray(this.f5198w, 0);
    }

    public ie(List<he> list) {
        this(false, (he[]) list.toArray(new he[list.size()]));
    }

    public ie(boolean z10, he... heVarArr) {
        UUID uuid;
        UUID uuid2;
        UUID uuid3;
        heVarArr = z10 ? (he[]) heVarArr.clone() : heVarArr;
        Arrays.sort(heVarArr, this);
        int i10 = 1;
        while (true) {
            int length = heVarArr.length;
            if (i10 >= length) {
                this.f5198w = heVarArr;
                this.f5200y = length;
                return;
            }
            uuid = heVarArr[i10 - 1].f4831x;
            uuid2 = heVarArr[i10].f4831x;
            if (uuid.equals(uuid2)) {
                uuid3 = heVarArr[i10].f4831x;
                throw new IllegalArgumentException("Duplicate data for uuid: ".concat(String.valueOf(uuid3)));
            }
            i10++;
        }
    }

    public ie(he... heVarArr) {
        this(true, heVarArr);
    }
}
