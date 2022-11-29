package pi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class s extends sh.a implements Iterable<String> {
    public static final Parcelable.Creator<s> CREATOR = new t();

    /* renamed from: w  reason: collision with root package name */
    public final Bundle f48209w;

    public s(Bundle bundle) {
        this.f48209w = bundle;
    }

    public final Bundle S() {
        return new Bundle(this.f48209w);
    }

    public final Double U(String str) {
        return Double.valueOf(this.f48209w.getDouble("value"));
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new r(this);
    }

    public final Long k0(String str) {
        return Long.valueOf(this.f48209w.getLong("value"));
    }

    public final int p() {
        return this.f48209w.size();
    }

    public final Object r0(String str) {
        return this.f48209w.get(str);
    }

    public final String toString() {
        return this.f48209w.toString();
    }

    public final String w0(String str) {
        return this.f48209w.getString(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.e(parcel, 2, S(), false);
        sh.b.b(parcel, a10);
    }
}
