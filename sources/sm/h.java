package sm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* renamed from: w  reason: collision with root package name */
    public long f52757w;

    /* renamed from: x  reason: collision with root package name */
    public long f52758x;

    /* loaded from: classes4.dex */
    public class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public h createFromParcel(Parcel parcel) {
            return new h(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public h[] newArray(int i10) {
            return new h[i10];
        }
    }

    public /* synthetic */ h(Parcel parcel, a aVar) {
        this(parcel);
    }

    public long a() {
        return this.f52757w + b();
    }

    public long b() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime() - this.f52758x);
    }

    public long c(h hVar) {
        return TimeUnit.NANOSECONDS.toMicros(hVar.f52758x - this.f52758x);
    }

    public long d() {
        return this.f52757w;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e() {
        this.f52757w = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.f52758x = System.nanoTime();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f52757w);
        parcel.writeLong(this.f52758x);
    }

    public h() {
        this.f52757w = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.f52758x = System.nanoTime();
    }

    public h(long j10) {
        this.f52757w = j10;
        this.f52758x = TimeUnit.MICROSECONDS.toNanos(j10);
    }

    public h(Parcel parcel) {
        this.f52757w = parcel.readLong();
        this.f52758x = parcel.readLong();
    }
}
