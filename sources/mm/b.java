package mm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: w  reason: collision with root package name */
    public final String f41207w;

    /* renamed from: x  reason: collision with root package name */
    public final AtomicLong f41208x;

    /* loaded from: classes4.dex */
    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public /* synthetic */ b(Parcel parcel, a aVar) {
        this(parcel);
    }

    public long a() {
        return this.f41208x.get();
    }

    public String b() {
        return this.f41207w;
    }

    public void c(long j10) {
        this.f41208x.addAndGet(j10);
    }

    public void d(long j10) {
        this.f41208x.set(j10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f41207w);
        parcel.writeLong(this.f41208x.get());
    }

    public b(String str) {
        this.f41207w = str;
        this.f41208x = new AtomicLong(0L);
    }

    public b(Parcel parcel) {
        this.f41207w = parcel.readString();
        this.f41208x = new AtomicLong(parcel.readLong());
    }
}
