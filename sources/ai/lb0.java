package ai;

import android.os.Parcel;
import android.os.Parcelable;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class lb0 extends sh.a {
    public static final Parcelable.Creator<lb0> CREATOR = new mb0();

    /* renamed from: w  reason: collision with root package name */
    public final int f6507w;

    /* renamed from: x  reason: collision with root package name */
    public final int f6508x;

    /* renamed from: y  reason: collision with root package name */
    public final int f6509y;

    public lb0(int i10, int i11, int i12) {
        this.f6507w = i10;
        this.f6508x = i11;
        this.f6509y = i12;
    }

    public static lb0 p(ah.w wVar) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof lb0)) {
            lb0 lb0Var = (lb0) obj;
            if (lb0Var.f6509y == this.f6509y && lb0Var.f6508x == this.f6508x && lb0Var.f6507w == this.f6507w) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f6507w, this.f6508x, this.f6509y});
    }

    public final String toString() {
        int i10 = this.f6507w;
        int i11 = this.f6508x;
        int i12 = this.f6509y;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append(i10);
        sb2.append(TopicConstant.SEPARATOR);
        sb2.append(i11);
        sb2.append(TopicConstant.SEPARATOR);
        sb2.append(i12);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.k(parcel, 1, this.f6507w);
        sh.b.k(parcel, 2, this.f6508x);
        sh.b.k(parcel, 3, this.f6509y);
        sh.b.b(parcel, a10);
    }
}
