package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: w  reason: collision with root package name */
    public final IntentSender f14092w;

    /* renamed from: x  reason: collision with root package name */
    public final Intent f14093x;

    /* renamed from: y  reason: collision with root package name */
    public final int f14094y;

    /* renamed from: z  reason: collision with root package name */
    public final int f14095z;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public IntentSender f14096a;

        /* renamed from: b  reason: collision with root package name */
        public Intent f14097b;

        /* renamed from: c  reason: collision with root package name */
        public int f14098c;

        /* renamed from: d  reason: collision with root package name */
        public int f14099d;

        public b(IntentSender intentSender) {
            this.f14096a = intentSender;
        }

        public e a() {
            return new e(this.f14096a, this.f14097b, this.f14098c, this.f14099d);
        }

        public b b(Intent intent) {
            this.f14097b = intent;
            return this;
        }

        public b c(int i10, int i11) {
            this.f14099d = i10;
            this.f14098c = i11;
            return this;
        }
    }

    public e(IntentSender intentSender, Intent intent, int i10, int i11) {
        this.f14092w = intentSender;
        this.f14093x = intent;
        this.f14094y = i10;
        this.f14095z = i11;
    }

    public Intent a() {
        return this.f14093x;
    }

    public int b() {
        return this.f14094y;
    }

    public int c() {
        return this.f14095z;
    }

    public IntentSender d() {
        return this.f14092w;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f14092w, i10);
        parcel.writeParcelable(this.f14093x, i10);
        parcel.writeInt(this.f14094y);
        parcel.writeInt(this.f14095z);
    }

    public e(Parcel parcel) {
        this.f14092w = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f14093x = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f14094y = parcel.readInt();
        this.f14095z = parcel.readInt();
    }
}
