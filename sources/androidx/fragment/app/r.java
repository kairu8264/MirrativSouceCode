package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new a();
    public int A;
    public String B;
    public ArrayList<String> C;
    public ArrayList<c> D;
    public ArrayList<String> E;
    public ArrayList<Bundle> F;
    public ArrayList<FragmentManager.k> G;

    /* renamed from: w  reason: collision with root package name */
    public ArrayList<w> f15377w;

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<String> f15378x;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<String> f15379y;

    /* renamed from: z  reason: collision with root package name */
    public b[] f15380z;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<r> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public r createFromParcel(Parcel parcel) {
            return new r(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public r[] newArray(int i10) {
            return new r[i10];
        }
    }

    public r() {
        this.B = null;
        this.C = new ArrayList<>();
        this.D = new ArrayList<>();
        this.E = new ArrayList<>();
        this.F = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedList(this.f15377w);
        parcel.writeStringList(this.f15378x);
        parcel.writeStringList(this.f15379y);
        parcel.writeTypedArray(this.f15380z, i10);
        parcel.writeInt(this.A);
        parcel.writeString(this.B);
        parcel.writeStringList(this.C);
        parcel.writeTypedList(this.D);
        parcel.writeStringList(this.E);
        parcel.writeTypedList(this.F);
        parcel.writeTypedList(this.G);
    }

    public r(Parcel parcel) {
        this.B = null;
        this.C = new ArrayList<>();
        this.D = new ArrayList<>();
        this.E = new ArrayList<>();
        this.F = new ArrayList<>();
        this.f15377w = parcel.createTypedArrayList(w.CREATOR);
        this.f15378x = parcel.createStringArrayList();
        this.f15379y = parcel.createStringArrayList();
        this.f15380z = (b[]) parcel.createTypedArray(b.CREATOR);
        this.A = parcel.readInt();
        this.B = parcel.readString();
        this.C = parcel.createStringArrayList();
        this.D = parcel.createTypedArrayList(c.CREATOR);
        this.E = parcel.createStringArrayList();
        this.F = parcel.createTypedArrayList(Bundle.CREATOR);
        this.G = parcel.createTypedArrayList(FragmentManager.k.CREATOR);
    }
}
