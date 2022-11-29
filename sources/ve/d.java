package ve;

import android.os.Parcel;
import android.os.Parcelable;
import jo.h;
import jo.p;
import xn.s;

/* loaded from: classes2.dex */
public enum d implements Parcelable {
    NORMAL(0),
    EMOMO_ANIMATION(5),
    BIRTHDAY(6),
    COMPANION(7),
    ANNIVERSARY(8),
    EMOMO_RUN(9),
    EMOMO_RUN_SCORE(10),
    USER_LEVEL(11),
    MULTI_EMOMO_GIFT(12),
    GIFT_TYPE_EMOMO_TREASURE_BOX(14),
    UNIQUE_EMOMO_GIFT_RICH(16),
    UNIQUE_EMOMO_GIFT_SIMPLE(17),
    MISSION_GIFT(18),
    BOOST_CATALOG_GIFT(19),
    EMOMO_QUEST_TREASURE_BOX(20),
    EMOMO_QUEST_GIFT_GACHA_COIN(21),
    EMOMO_QUEST_GIFT_GACHA_TICKET(22);
    
    private final int rawValue;
    public static final a Companion = new a(null);
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator<d>() { // from class: ve.d.b
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final d createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return d.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final d[] newArray(int i10) {
            return new d[i10];
        }
    };

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final d a(int i10) {
            d dVar;
            d[] values = d.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    dVar = null;
                    break;
                }
                dVar = values[i11];
                if (dVar.c() == i10) {
                    break;
                }
                i11++;
            }
            return dVar == null ? d.NORMAL : dVar;
        }
    }

    d(int i10) {
        this.rawValue = i10;
    }

    public final int c() {
        return this.rawValue;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean e() {
        return l() | h();
    }

    public final boolean h() {
        return this == EMOMO_QUEST_TREASURE_BOX;
    }

    public final boolean i() {
        return s.m(EMOMO_QUEST_GIFT_GACHA_COIN, EMOMO_QUEST_GIFT_GACHA_TICKET).contains(this);
    }

    public final boolean l() {
        return s.m(EMOMO_RUN, EMOMO_RUN_SCORE, GIFT_TYPE_EMOMO_TREASURE_BOX).contains(this);
    }

    public final boolean m() {
        return this == BIRTHDAY || this == ANNIVERSARY;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeString(name());
    }
}
