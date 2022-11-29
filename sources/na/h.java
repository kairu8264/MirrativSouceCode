package na;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameMissionStatus;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameMissionStatusType;
import jo.p;

/* loaded from: classes.dex */
public final class h implements Parcelable {
    public final boolean A;

    /* renamed from: w  reason: collision with root package name */
    public final int f41714w;

    /* renamed from: x  reason: collision with root package name */
    public final String f41715x;

    /* renamed from: y  reason: collision with root package name */
    public final int f41716y;

    /* renamed from: z  reason: collision with root package name */
    public final float f41717z;
    public static final a B = new a(null);
    public static final Parcelable.Creator<h> CREATOR = new b();
    public static final int C = 8;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final h a(LiveGameMissionStatus liveGameMissionStatus, boolean z10) {
            int i10;
            p.h(liveGameMissionStatus, "liveGameMissionStatus");
            int i11 = ja.k.ic_game;
            String str = "x " + liveGameMissionStatus.getCoin();
            if (z10) {
                i10 = ja.j.f37418p;
            } else {
                i10 = ja.j.f37414h;
            }
            return new h(i11, str, i10, liveGameMissionStatus.getStatus() == LiveGameMissionStatusType.NOT_COMPLETED ? 1.0f : 0.2f, liveGameMissionStatus.getStatus() == LiveGameMissionStatusType.COMPLETED);
        }

        public final h b(LiveGameMissionStatus liveGameMissionStatus, boolean z10) {
            int i10;
            p.h(liveGameMissionStatus, "liveGameMissionStatus");
            int i11 = ja.k.ic_listener;
            String str = "x " + liveGameMissionStatus.getCoin();
            if (z10) {
                i10 = ja.j.f37418p;
            } else {
                i10 = ja.j.f37414h;
            }
            return new h(i11, str, i10, liveGameMissionStatus.getStatus() == LiveGameMissionStatusType.NOT_COMPLETED ? 1.0f : 0.2f, liveGameMissionStatus.getStatus() == LiveGameMissionStatusType.COMPLETED);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final h createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new h(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readFloat(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final h[] newArray(int i10) {
            return new h[i10];
        }
    }

    public h(int i10, String str, int i11, float f10, boolean z10) {
        p.h(str, "coinText");
        this.f41714w = i10;
        this.f41715x = str;
        this.f41716y = i11;
        this.f41717z = f10;
        this.A = z10;
    }

    public final float a() {
        return this.f41717z;
    }

    public final String b() {
        return this.f41715x;
    }

    public final int c() {
        return this.f41716y;
    }

    public final int d() {
        return this.f41714w;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.A;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return this.f41714w == hVar.f41714w && p.c(this.f41715x, hVar.f41715x) && this.f41716y == hVar.f41716y && p.c(Float.valueOf(this.f41717z), Float.valueOf(hVar.f41717z)) && this.A == hVar.A;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.f41714w) * 31) + this.f41715x.hashCode()) * 31) + Integer.hashCode(this.f41716y)) * 31) + Float.hashCode(this.f41717z)) * 31;
        boolean z10 = this.A;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "LiveGameMissionBindModel(iconResourceId=" + this.f41714w + ", coinText=" + this.f41715x + ", coinTextBackground=" + this.f41716y + ", alpha=" + this.f41717z + ", isVisibleGet=" + this.A + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeInt(this.f41714w);
        parcel.writeString(this.f41715x);
        parcel.writeInt(this.f41716y);
        parcel.writeFloat(this.f41717z);
        parcel.writeInt(this.A ? 1 : 0);
    }
}
