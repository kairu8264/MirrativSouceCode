package jf;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrorman.net.api.response.CollabType;
import com.dena.mirrorman.webrtc.entity.StunServer;
import com.dena.mirrorman.webrtc.entity.TurnServer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();
    public static final int H = 8;
    public final int A;
    public final String B;
    public final List<StunServer> C;
    public final List<TurnServer> D;
    public final String E;
    public final CollabType F;
    public final String G;

    /* renamed from: w  reason: collision with root package name */
    public final String f37930w;

    /* renamed from: x  reason: collision with root package name */
    public final String f37931x;

    /* renamed from: y  reason: collision with root package name */
    public final String f37932y;

    /* renamed from: z  reason: collision with root package name */
    public final String f37933z;

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final h createFromParcel(Parcel parcel) {
            jo.p.h(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt = parcel.readInt();
            String readString5 = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i10 = 0; i10 != readInt2; i10++) {
                arrayList.add(parcel.readParcelable(h.class.getClassLoader()));
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt3);
            for (int i11 = 0; i11 != readInt3; i11++) {
                arrayList2.add(parcel.readParcelable(h.class.getClassLoader()));
            }
            return new h(readString, readString2, readString3, readString4, readInt, readString5, arrayList, arrayList2, parcel.readString(), CollabType.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final h[] newArray(int i10) {
            return new h[i10];
        }
    }

    public h(String str, String str2, String str3, String str4, int i10, String str5, List<StunServer> list, List<TurnServer> list2, String str6, CollabType collabType, String str7) {
        jo.p.h(str, "hostLiveId");
        jo.p.h(str2, "ownerUserId");
        jo.p.h(str3, "ownerName");
        jo.p.h(str4, "collabUnicastHost");
        jo.p.h(str5, "collabUnicastKey");
        jo.p.h(list, "stunServers");
        jo.p.h(list2, "turnServers");
        jo.p.h(str6, "collabLiveId");
        jo.p.h(collabType, "collabType");
        jo.p.h(str7, "collabServiceIntentAction");
        this.f37930w = str;
        this.f37931x = str2;
        this.f37932y = str3;
        this.f37933z = str4;
        this.A = i10;
        this.B = str5;
        this.C = list;
        this.D = list2;
        this.E = str6;
        this.F = collabType;
        this.G = str7;
    }

    public final String a() {
        return this.E;
    }

    public final String b() {
        return this.G;
    }

    public final CollabType c() {
        return this.F;
    }

    public final String d() {
        return this.f37933z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.B;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return jo.p.c(this.f37930w, hVar.f37930w) && jo.p.c(this.f37931x, hVar.f37931x) && jo.p.c(this.f37932y, hVar.f37932y) && jo.p.c(this.f37933z, hVar.f37933z) && this.A == hVar.A && jo.p.c(this.B, hVar.B) && jo.p.c(this.C, hVar.C) && jo.p.c(this.D, hVar.D) && jo.p.c(this.E, hVar.E) && this.F == hVar.F && jo.p.c(this.G, hVar.G);
        }
        return false;
    }

    public final int f() {
        return this.A;
    }

    public final String g() {
        return this.f37930w;
    }

    public final String h() {
        return this.f37932y;
    }

    public int hashCode() {
        return (((((((((((((((((((this.f37930w.hashCode() * 31) + this.f37931x.hashCode()) * 31) + this.f37932y.hashCode()) * 31) + this.f37933z.hashCode()) * 31) + Integer.hashCode(this.A)) * 31) + this.B.hashCode()) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31) + this.E.hashCode()) * 31) + this.F.hashCode()) * 31) + this.G.hashCode();
    }

    public final String i() {
        return this.f37931x;
    }

    public final List<StunServer> j() {
        return this.C;
    }

    public final List<TurnServer> k() {
        return this.D;
    }

    public String toString() {
        return "CollabInfo(hostLiveId=" + this.f37930w + ", ownerUserId=" + this.f37931x + ", ownerName=" + this.f37932y + ", collabUnicastHost=" + this.f37933z + ", collabUnicastPort=" + this.A + ", collabUnicastKey=" + this.B + ", stunServers=" + this.C + ", turnServers=" + this.D + ", collabLiveId=" + this.E + ", collabType=" + this.F + ", collabServiceIntentAction=" + this.G + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        jo.p.h(parcel, "out");
        parcel.writeString(this.f37930w);
        parcel.writeString(this.f37931x);
        parcel.writeString(this.f37932y);
        parcel.writeString(this.f37933z);
        parcel.writeInt(this.A);
        parcel.writeString(this.B);
        List<StunServer> list = this.C;
        parcel.writeInt(list.size());
        for (StunServer stunServer : list) {
            parcel.writeParcelable(stunServer, i10);
        }
        List<TurnServer> list2 = this.D;
        parcel.writeInt(list2.size());
        for (TurnServer turnServer : list2) {
            parcel.writeParcelable(turnServer, i10);
        }
        parcel.writeString(this.E);
        parcel.writeString(this.F.name());
        parcel.writeString(this.G);
    }
}
