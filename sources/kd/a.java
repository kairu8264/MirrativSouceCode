package kd;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrativ.mirrativapi.user.SeasonRatingStatusResponse;
import com.dena.mirrativ.mirrativapi.user.SeasonRatingStatusSeason;
import df.c;
import java.util.Arrays;
import jo.h;
import jo.p;
import nc.i;

/* loaded from: classes2.dex */
public final class a implements Parcelable {
    public final String A;
    public final int B;
    public final String C;
    public final String D;
    public final String E;
    public final String F;

    /* renamed from: w  reason: collision with root package name */
    public final int f38645w;

    /* renamed from: x  reason: collision with root package name */
    public final df.c f38646x;

    /* renamed from: y  reason: collision with root package name */
    public final df.c f38647y;

    /* renamed from: z  reason: collision with root package name */
    public final String f38648z;
    public static final C0542a G = new C0542a(null);
    public static final Parcelable.Creator<a> CREATOR = new b();
    public static final int H = 8;

    /* renamed from: kd.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0542a {
        public C0542a() {
        }

        public /* synthetic */ C0542a(h hVar) {
            this();
        }

        public final a a(SeasonRatingStatusResponse seasonRatingStatusResponse, Context context) {
            p.h(seasonRatingStatusResponse, "response");
            p.h(context, "context");
            c.a aVar = df.c.Companion;
            df.c a10 = aVar.a(seasonRatingStatusResponse.getSeason().getClassId());
            SeasonRatingStatusSeason lastSeason = seasonRatingStatusResponse.getLastSeason();
            df.c a11 = aVar.a(lastSeason != null ? lastSeason.getClassId() : 0);
            int month = seasonRatingStatusResponse.getSeason().getMonth();
            int i10 = i.text_classup_title_highlight;
            String string = context.getString(i10, a10.name());
            String string2 = context.getString(i10, a11.name());
            int current = (int) (((seasonRatingStatusResponse.getSeason().getCurrent() - seasonRatingStatusResponse.getSeason().getClassStart()) / (seasonRatingStatusResponse.getSeason().getClassEnd() - seasonRatingStatusResponse.getSeason().getClassStart())) * 100);
            String format = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(seasonRatingStatusResponse.getSeason().getCurrent() - seasonRatingStatusResponse.getSeason().getClassStart())}, 1));
            p.g(format, "format(this, *args)");
            String format2 = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(seasonRatingStatusResponse.getSeason().getClassEnd() - seasonRatingStatusResponse.getSeason().getClassStart())}, 1));
            p.g(format2, "format(this, *args)");
            int i11 = i.f41895w5;
            String format3 = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(seasonRatingStatusResponse.getSeason().getCurrent())}, 1));
            p.g(format3, "format(this, *args)");
            String string3 = context.getString(i11, format3);
            String seasonDuration = seasonRatingStatusResponse.getSeason().getSeasonDuration();
            p.g(string2, "getString(R.string.text_…_highlight, endRank.name)");
            p.g(string, "getString(R.string.text_…tle_highlight, rank.name)");
            p.g(string3, "getString(R.string.text_…response.season.current))");
            return new a(month, a10, a11, string2, string, current, format, format2, string3, seasonDuration);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final a createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new a(parcel.readInt(), df.c.valueOf(parcel.readString()), df.c.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(int i10, df.c cVar, df.c cVar2, String str, String str2, int i11, String str3, String str4, String str5, String str6) {
        p.h(cVar, "seasonStartRank");
        p.h(cVar2, "seasonEndRank");
        p.h(str, "resultRankTitle");
        p.h(str2, "startRankTitle");
        p.h(str3, "seasonStartCurrentExpText");
        p.h(str4, "seasonStartLimitExpText");
        p.h(str5, "currentTotalExpText");
        p.h(str6, "seasonDurationText");
        this.f38645w = i10;
        this.f38646x = cVar;
        this.f38647y = cVar2;
        this.f38648z = str;
        this.A = str2;
        this.B = i11;
        this.C = str3;
        this.D = str4;
        this.E = str5;
        this.F = str6;
    }

    public final String a() {
        return this.E;
    }

    public final String b() {
        return this.f38648z;
    }

    public final String c() {
        return this.F;
    }

    public final df.c d() {
        return this.f38647y;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int e() {
        return this.f38645w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f38645w == aVar.f38645w && this.f38646x == aVar.f38646x && this.f38647y == aVar.f38647y && p.c(this.f38648z, aVar.f38648z) && p.c(this.A, aVar.A) && this.B == aVar.B && p.c(this.C, aVar.C) && p.c(this.D, aVar.D) && p.c(this.E, aVar.E) && p.c(this.F, aVar.F);
        }
        return false;
    }

    public final String f() {
        return this.C;
    }

    public final String g() {
        return this.D;
    }

    public final int h() {
        return this.B;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.f38645w) * 31) + this.f38646x.hashCode()) * 31) + this.f38647y.hashCode()) * 31) + this.f38648z.hashCode()) * 31) + this.A.hashCode()) * 31) + Integer.hashCode(this.B)) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31) + this.E.hashCode()) * 31) + this.F.hashCode();
    }

    public final df.c i() {
        return this.f38646x;
    }

    public final String j() {
        return this.A;
    }

    public String toString() {
        return "SeasonRatingResultBindModel(seasonMonth=" + this.f38645w + ", seasonStartRank=" + this.f38646x + ", seasonEndRank=" + this.f38647y + ", resultRankTitle=" + this.f38648z + ", startRankTitle=" + this.A + ", seasonStartProgress=" + this.B + ", seasonStartCurrentExpText=" + this.C + ", seasonStartLimitExpText=" + this.D + ", currentTotalExpText=" + this.E + ", seasonDurationText=" + this.F + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeInt(this.f38645w);
        parcel.writeString(this.f38646x.name());
        parcel.writeString(this.f38647y.name());
        parcel.writeString(this.f38648z);
        parcel.writeString(this.A);
        parcel.writeInt(this.B);
        parcel.writeString(this.C);
        parcel.writeString(this.D);
        parcel.writeString(this.E);
        parcel.writeString(this.F);
    }
}
