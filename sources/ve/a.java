package ve;

import android.os.Parcel;
import android.os.Parcelable;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public enum a implements Parcelable {
    HISTORY(1),
    BIRTHDAY(2),
    ANNIVERSARY(3),
    GIFT_GACHA(4),
    ROULETTE(5),
    PLAIN(6),
    MISSION_GIFT(13),
    EMOMO_QUEST(17);
    
    private final int rawValue;
    public static final C0932a Companion = new C0932a(null);
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: ve.a.b
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final a createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return a.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    };

    /* renamed from: ve.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0932a {
        public C0932a() {
        }

        public /* synthetic */ C0932a(h hVar) {
            this();
        }

        public final a a(int i10) {
            a aVar;
            a[] values = a.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    aVar = null;
                    break;
                }
                aVar = values[i11];
                if (aVar.c() == i10) {
                    break;
                }
                i11++;
            }
            return aVar == null ? a.PLAIN : aVar;
        }
    }

    a(int i10) {
        this.rawValue = i10;
    }

    public final int c() {
        return this.rawValue;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeString(name());
    }
}
