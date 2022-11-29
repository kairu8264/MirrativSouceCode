package ya;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrorman.net.api.response.ShareTwitter;

/* loaded from: classes2.dex */
public final class h0 implements Parcelable {
    public final String A;
    public final String B;
    public final String C;
    public final String D;

    /* renamed from: w  reason: collision with root package name */
    public final int f61442w;

    /* renamed from: x  reason: collision with root package name */
    public final String f61443x;

    /* renamed from: y  reason: collision with root package name */
    public final String f61444y;

    /* renamed from: z  reason: collision with root package name */
    public final String f61445z;
    public static final a E = new a(null);
    public static final Parcelable.Creator<h0> CREATOR = new b();
    public static final int F = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final h0 a(ShareTwitter shareTwitter) {
            jo.p.h(shareTwitter, "shareTwitter");
            return new h0(shareTwitter.getMaxlength(), String.valueOf(shareTwitter.getMaxlength() - Math.max(0, de.l.a(shareTwitter.getText()))), shareTwitter.getText(), shareTwitter.getPlaceholder(), shareTwitter.getCard().getTitle(), shareTwitter.getCard().getDescription(), shareTwitter.getCard().getImageUrl(), shareTwitter.getCard().getSite());
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<h0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final h0 createFromParcel(Parcel parcel) {
            jo.p.h(parcel, "parcel");
            return new h0(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final h0[] newArray(int i10) {
            return new h0[i10];
        }
    }

    public h0(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        jo.p.h(str, "inputSizeText");
        jo.p.h(str2, "messageText");
        jo.p.h(str3, "hintText");
        jo.p.h(str4, "cardTitle");
        jo.p.h(str5, "cardDescription");
        jo.p.h(str6, "cardImageUrl");
        jo.p.h(str7, "cardUrlText");
        this.f61442w = i10;
        this.f61443x = str;
        this.f61444y = str2;
        this.f61445z = str3;
        this.A = str4;
        this.B = str5;
        this.C = str6;
        this.D = str7;
    }

    public final String a() {
        return this.C;
    }

    public final String b() {
        return this.A;
    }

    public final String c() {
        return this.D;
    }

    public final String d() {
        return this.f61445z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f61443x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h0) {
            h0 h0Var = (h0) obj;
            return this.f61442w == h0Var.f61442w && jo.p.c(this.f61443x, h0Var.f61443x) && jo.p.c(this.f61444y, h0Var.f61444y) && jo.p.c(this.f61445z, h0Var.f61445z) && jo.p.c(this.A, h0Var.A) && jo.p.c(this.B, h0Var.B) && jo.p.c(this.C, h0Var.C) && jo.p.c(this.D, h0Var.D);
        }
        return false;
    }

    public final int f() {
        return this.f61442w;
    }

    public final String g() {
        return this.f61444y;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.f61442w) * 31) + this.f61443x.hashCode()) * 31) + this.f61444y.hashCode()) * 31) + this.f61445z.hashCode()) * 31) + this.A.hashCode()) * 31) + this.B.hashCode()) * 31) + this.C.hashCode()) * 31) + this.D.hashCode();
    }

    public String toString() {
        return "CampaignTwitterShareBindModel(maxTextLength=" + this.f61442w + ", inputSizeText=" + this.f61443x + ", messageText=" + this.f61444y + ", hintText=" + this.f61445z + ", cardTitle=" + this.A + ", cardDescription=" + this.B + ", cardImageUrl=" + this.C + ", cardUrlText=" + this.D + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        jo.p.h(parcel, "out");
        parcel.writeInt(this.f61442w);
        parcel.writeString(this.f61443x);
        parcel.writeString(this.f61444y);
        parcel.writeString(this.f61445z);
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeString(this.D);
    }
}
