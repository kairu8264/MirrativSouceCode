package pm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import sm.h;
import tm.k;
import tm.l;

/* loaded from: classes4.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0727a();

    /* renamed from: w  reason: collision with root package name */
    public final String f48448w;

    /* renamed from: x  reason: collision with root package name */
    public final h f48449x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f48450y;

    /* renamed from: pm.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0727a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, (C0727a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public /* synthetic */ a(Parcel parcel, C0727a c0727a) {
        this(parcel);
    }

    public static k[] b(List<a> list) {
        if (list.isEmpty()) {
            return null;
        }
        k[] kVarArr = new k[list.size()];
        k a10 = list.get(0).a();
        boolean z10 = false;
        for (int i10 = 1; i10 < list.size(); i10++) {
            k a11 = list.get(i10).a();
            if (!z10 && list.get(i10).g()) {
                kVarArr[0] = a11;
                kVarArr[i10] = a10;
                z10 = true;
            } else {
                kVarArr[i10] = a11;
            }
        }
        if (!z10) {
            kVarArr[0] = a10;
        }
        return kVarArr;
    }

    public static a c() {
        a aVar = new a(UUID.randomUUID().toString().replace("-", ""), new sm.a());
        aVar.i(j());
        return aVar;
    }

    public static boolean j() {
        im.a f10 = im.a.f();
        return f10.I() && Math.random() < ((double) f10.B());
    }

    public k a() {
        k.c H = k.W().H(this.f48448w);
        if (this.f48450y) {
            H.G(l.GAUGES_AND_SYSTEM_EVENTS);
        }
        return H.a();
    }

    public h d() {
        return this.f48449x;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return TimeUnit.MICROSECONDS.toMinutes(this.f48449x.b()) > im.a.f().y();
    }

    public boolean f() {
        return this.f48450y;
    }

    public boolean g() {
        return this.f48450y;
    }

    public String h() {
        return this.f48448w;
    }

    public void i(boolean z10) {
        this.f48450y = z10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f48448w);
        parcel.writeByte(this.f48450y ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f48449x, 0);
    }

    public a(String str, sm.a aVar) {
        this.f48450y = false;
        this.f48448w = str;
        this.f48449x = aVar.a();
    }

    public a(Parcel parcel) {
        this.f48450y = false;
        this.f48448w = parcel.readString();
        this.f48450y = parcel.readByte() != 0;
        this.f48449x = (h) parcel.readParcelable(h.class.getClassLoader());
    }
}
