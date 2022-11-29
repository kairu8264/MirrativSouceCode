package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.z;
import androidx.lifecycle.o;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final int A;
    public final String B;
    public final int C;
    public final int D;
    public final CharSequence E;
    public final int F;
    public final CharSequence G;
    public final ArrayList<String> H;
    public final ArrayList<String> I;
    public final boolean J;

    /* renamed from: w  reason: collision with root package name */
    public final int[] f15248w;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<String> f15249x;

    /* renamed from: y  reason: collision with root package name */
    public final int[] f15250y;

    /* renamed from: z  reason: collision with root package name */
    public final int[] f15251z;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.f15411c.size();
        this.f15248w = new int[size * 6];
        if (aVar.f15417i) {
            this.f15249x = new ArrayList<>(size);
            this.f15250y = new int[size];
            this.f15251z = new int[size];
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                z.a aVar2 = aVar.f15411c.get(i10);
                int i12 = i11 + 1;
                this.f15248w[i11] = aVar2.f15428a;
                ArrayList<String> arrayList = this.f15249x;
                Fragment fragment = aVar2.f15429b;
                arrayList.add(fragment != null ? fragment.B : null);
                int[] iArr = this.f15248w;
                int i13 = i12 + 1;
                iArr[i12] = aVar2.f15430c ? 1 : 0;
                int i14 = i13 + 1;
                iArr[i13] = aVar2.f15431d;
                int i15 = i14 + 1;
                iArr[i14] = aVar2.f15432e;
                int i16 = i15 + 1;
                iArr[i15] = aVar2.f15433f;
                iArr[i16] = aVar2.f15434g;
                this.f15250y[i10] = aVar2.f15435h.ordinal();
                this.f15251z[i10] = aVar2.f15436i.ordinal();
                i10++;
                i11 = i16 + 1;
            }
            this.A = aVar.f15416h;
            this.B = aVar.f15419k;
            this.C = aVar.f15244v;
            this.D = aVar.f15420l;
            this.E = aVar.f15421m;
            this.F = aVar.f15422n;
            this.G = aVar.f15423o;
            this.H = aVar.f15424p;
            this.I = aVar.f15425q;
            this.J = aVar.f15426r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public final void a(androidx.fragment.app.a aVar) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 < this.f15248w.length) {
                z.a aVar2 = new z.a();
                int i12 = i10 + 1;
                aVar2.f15428a = this.f15248w[i10];
                if (FragmentManager.D0(2)) {
                    Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i11 + " base fragment #" + this.f15248w[i12]);
                }
                aVar2.f15435h = o.c.values()[this.f15250y[i11]];
                aVar2.f15436i = o.c.values()[this.f15251z[i11]];
                int[] iArr = this.f15248w;
                int i13 = i12 + 1;
                if (iArr[i12] == 0) {
                    z10 = false;
                }
                aVar2.f15430c = z10;
                int i14 = i13 + 1;
                int i15 = iArr[i13];
                aVar2.f15431d = i15;
                int i16 = i14 + 1;
                int i17 = iArr[i14];
                aVar2.f15432e = i17;
                int i18 = i16 + 1;
                int i19 = iArr[i16];
                aVar2.f15433f = i19;
                int i20 = iArr[i18];
                aVar2.f15434g = i20;
                aVar.f15412d = i15;
                aVar.f15413e = i17;
                aVar.f15414f = i19;
                aVar.f15415g = i20;
                aVar.e(aVar2);
                i11++;
                i10 = i18 + 1;
            } else {
                aVar.f15416h = this.A;
                aVar.f15419k = this.B;
                aVar.f15417i = true;
                aVar.f15420l = this.D;
                aVar.f15421m = this.E;
                aVar.f15422n = this.F;
                aVar.f15423o = this.G;
                aVar.f15424p = this.H;
                aVar.f15425q = this.I;
                aVar.f15426r = this.J;
                return;
            }
        }
    }

    public androidx.fragment.app.a b(FragmentManager fragmentManager) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        a(aVar);
        aVar.f15244v = this.C;
        for (int i10 = 0; i10 < this.f15249x.size(); i10++) {
            String str = this.f15249x.get(i10);
            if (str != null) {
                aVar.f15411c.get(i10).f15429b = fragmentManager.b0(str);
            }
        }
        aVar.x(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f15248w);
        parcel.writeStringList(this.f15249x);
        parcel.writeIntArray(this.f15250y);
        parcel.writeIntArray(this.f15251z);
        parcel.writeInt(this.A);
        parcel.writeString(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
        TextUtils.writeToParcel(this.E, parcel, 0);
        parcel.writeInt(this.F);
        TextUtils.writeToParcel(this.G, parcel, 0);
        parcel.writeStringList(this.H);
        parcel.writeStringList(this.I);
        parcel.writeInt(this.J ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.f15248w = parcel.createIntArray();
        this.f15249x = parcel.createStringArrayList();
        this.f15250y = parcel.createIntArray();
        this.f15251z = parcel.createIntArray();
        this.A = parcel.readInt();
        this.B = parcel.readString();
        this.C = parcel.readInt();
        this.D = parcel.readInt();
        this.E = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.F = parcel.readInt();
        this.G = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.H = parcel.createStringArrayList();
        this.I = parcel.createStringArrayList();
        this.J = parcel.readInt() != 0;
    }
}
