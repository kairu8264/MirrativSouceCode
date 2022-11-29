package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.o;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class w implements Parcelable {
    public static final Parcelable.Creator<w> CREATOR = new a();
    public final int A;
    public final String B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final Bundle F;
    public final boolean G;
    public final int H;
    public Bundle I;

    /* renamed from: w  reason: collision with root package name */
    public final String f15393w;

    /* renamed from: x  reason: collision with root package name */
    public final String f15394x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f15395y;

    /* renamed from: z  reason: collision with root package name */
    public final int f15396z;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<w> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public w createFromParcel(Parcel parcel) {
            return new w(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public w[] newArray(int i10) {
            return new w[i10];
        }
    }

    public w(Fragment fragment) {
        this.f15393w = fragment.getClass().getName();
        this.f15394x = fragment.B;
        this.f15395y = fragment.K;
        this.f15396z = fragment.T;
        this.A = fragment.U;
        this.B = fragment.V;
        this.C = fragment.Y;
        this.D = fragment.I;
        this.E = fragment.X;
        this.F = fragment.C;
        this.G = fragment.W;
        this.H = fragment.f15139n0.ordinal();
    }

    public Fragment a(l lVar, ClassLoader classLoader) {
        Fragment a10 = lVar.a(classLoader, this.f15393w);
        Bundle bundle = this.F;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a10.V2(this.F);
        a10.B = this.f15394x;
        a10.K = this.f15395y;
        a10.M = true;
        a10.T = this.f15396z;
        a10.U = this.A;
        a10.V = this.B;
        a10.Y = this.C;
        a10.I = this.D;
        a10.X = this.E;
        a10.W = this.G;
        a10.f15139n0 = o.c.values()[this.H];
        Bundle bundle2 = this.I;
        if (bundle2 != null) {
            a10.f15149x = bundle2;
        } else {
            a10.f15149x = new Bundle();
        }
        return a10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f15393w);
        sb2.append(" (");
        sb2.append(this.f15394x);
        sb2.append(")}:");
        if (this.f15395y) {
            sb2.append(" fromLayout");
        }
        if (this.A != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.A));
        }
        String str = this.B;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.B);
        }
        if (this.C) {
            sb2.append(" retainInstance");
        }
        if (this.D) {
            sb2.append(" removing");
        }
        if (this.E) {
            sb2.append(" detached");
        }
        if (this.G) {
            sb2.append(" hidden");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15393w);
        parcel.writeString(this.f15394x);
        parcel.writeInt(this.f15395y ? 1 : 0);
        parcel.writeInt(this.f15396z);
        parcel.writeInt(this.A);
        parcel.writeString(this.B);
        parcel.writeInt(this.C ? 1 : 0);
        parcel.writeInt(this.D ? 1 : 0);
        parcel.writeInt(this.E ? 1 : 0);
        parcel.writeBundle(this.F);
        parcel.writeInt(this.G ? 1 : 0);
        parcel.writeBundle(this.I);
        parcel.writeInt(this.H);
    }

    public w(Parcel parcel) {
        this.f15393w = parcel.readString();
        this.f15394x = parcel.readString();
        this.f15395y = parcel.readInt() != 0;
        this.f15396z = parcel.readInt();
        this.A = parcel.readInt();
        this.B = parcel.readString();
        this.C = parcel.readInt() != 0;
        this.D = parcel.readInt() != 0;
        this.E = parcel.readInt() != 0;
        this.F = parcel.readBundle();
        this.G = parcel.readInt() != 0;
        this.I = parcel.readBundle();
        this.H = parcel.readInt();
    }
}
