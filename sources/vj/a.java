package vj;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import s.g;

/* loaded from: classes3.dex */
public class a extends v3.a {
    public static final Parcelable.Creator<a> CREATOR = new C0933a();

    /* renamed from: w  reason: collision with root package name */
    public final g<String, Bundle> f57409w;

    /* renamed from: vj.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0933a implements Parcelable.ClassLoaderCreator<a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public /* synthetic */ a(Parcel parcel, ClassLoader classLoader, C0933a c0933a) {
        this(parcel, classLoader);
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f57409w + "}";
    }

    @Override // v3.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        int size = this.f57409w.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i11 = 0; i11 < size; i11++) {
            strArr[i11] = this.f57409w.m(i11);
            bundleArr[i11] = this.f57409w.r(i11);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f57409w = new g<>();
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f57409w = new g<>(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f57409w.put(strArr[i10], bundleArr[i10]);
        }
    }
}
