package oe;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrorman.net.api.response.RibbonResponse;
import com.dena.mirrorman.net.api.response.user.UserBadgeImageUrl;
import com.dena.mirrorman.net.api.response.user.UserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jo.h;
import jo.p;
import xn.a0;

/* loaded from: classes2.dex */
public final class b implements Parcelable {
    public final String A;
    public final boolean B;
    public final boolean C;
    public final int D;
    public final int E;
    public final String F;
    public final String G;
    public final List<RibbonResponse> H;
    public final long I;

    /* renamed from: w  reason: collision with root package name */
    public final String f45381w;

    /* renamed from: x  reason: collision with root package name */
    public final String f45382x;

    /* renamed from: y  reason: collision with root package name */
    public final String f45383y;

    /* renamed from: z  reason: collision with root package name */
    public final String f45384z;
    public static final a J = new a(null);
    public static final Parcelable.Creator<b> CREATOR = new C0683b();
    public static final int K = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final b a(UserProfile userProfile, boolean z10) {
            Object obj;
            p.h(userProfile, "userProfile");
            String name = userProfile.getName();
            String avatarBodyImageUrl = userProfile.getAvatarBodyImageUrl();
            String avatarBackgroundImageUrl = userProfile.getAvatarBackgroundImageUrl();
            String profileImageUrl = userProfile.getProfileImageUrl();
            String twitterScreenName = userProfile.getTwitterScreenName();
            boolean isFollower = userProfile.isFollower();
            int followingNum = userProfile.getFollowingNum();
            int followerNum = userProfile.getFollowerNum();
            UserBadgeImageUrl userBadgeImageUrl = (UserBadgeImageUrl) a0.Z(userProfile.getBadges());
            String imageUrl = userBadgeImageUrl != null ? userBadgeImageUrl.getImageUrl() : null;
            Iterator<T> it = userProfile.getRibbons().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((RibbonResponse) obj).isLabel()) {
                    break;
                }
            }
            RibbonResponse ribbonResponse = (RibbonResponse) obj;
            return new b(name, avatarBodyImageUrl, avatarBackgroundImageUrl, profileImageUrl, twitterScreenName, isFollower, z10, followingNum, followerNum, imageUrl, ribbonResponse != null ? ribbonResponse.getImageUrl() : null, userProfile.getRibbons(), userProfile.getLiveRequestNum());
        }
    }

    /* renamed from: oe.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0683b implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final b createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            boolean z10 = parcel.readInt() != 0;
            boolean z11 = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            for (int i10 = 0; i10 != readInt3; i10++) {
                arrayList.add(parcel.readSerializable());
            }
            return new b(readString, readString2, readString3, readString4, readString5, z10, z11, readInt, readInt2, readString6, readString7, arrayList, parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11, int i10, int i11, String str6, String str7, List<RibbonResponse> list, long j10) {
        p.h(str, "name");
        p.h(str2, "avatarBodyImageUrl");
        p.h(str3, "avatarBackgroundImageUrl");
        p.h(str4, "profileImageUrl");
        p.h(list, "ribbons");
        this.f45381w = str;
        this.f45382x = str2;
        this.f45383y = str3;
        this.f45384z = str4;
        this.A = str5;
        this.B = z10;
        this.C = z11;
        this.D = i10;
        this.E = i11;
        this.F = str6;
        this.G = str7;
        this.H = list;
        this.I = j10;
    }

    public final String a() {
        return this.f45383y;
    }

    public final String b() {
        return this.f45382x;
    }

    public final String c() {
        return this.F;
    }

    public final int d() {
        return this.E;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int e() {
        return this.D;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return p.c(this.f45381w, bVar.f45381w) && p.c(this.f45382x, bVar.f45382x) && p.c(this.f45383y, bVar.f45383y) && p.c(this.f45384z, bVar.f45384z) && p.c(this.A, bVar.A) && this.B == bVar.B && this.C == bVar.C && this.D == bVar.D && this.E == bVar.E && p.c(this.F, bVar.F) && p.c(this.G, bVar.G) && p.c(this.H, bVar.H) && this.I == bVar.I;
        }
        return false;
    }

    public final long f() {
        return this.I;
    }

    public final String g() {
        return this.f45381w;
    }

    public final String h() {
        return this.f45384z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f45381w.hashCode() * 31) + this.f45382x.hashCode()) * 31) + this.f45383y.hashCode()) * 31) + this.f45384z.hashCode()) * 31;
        String str = this.A;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z10 = this.B;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode2 + i10) * 31;
        boolean z11 = this.C;
        int hashCode3 = (((((i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + Integer.hashCode(this.D)) * 31) + Integer.hashCode(this.E)) * 31;
        String str2 = this.F;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.G;
        return ((((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.H.hashCode()) * 31) + Long.hashCode(this.I);
    }

    public final String i() {
        return this.G;
    }

    public final List<RibbonResponse> j() {
        return this.H;
    }

    public final String k() {
        return this.A;
    }

    public final boolean l() {
        return this.B;
    }

    public final boolean m() {
        return this.C;
    }

    public String toString() {
        return "LiveRequestStreamerInfo(name=" + this.f45381w + ", avatarBodyImageUrl=" + this.f45382x + ", avatarBackgroundImageUrl=" + this.f45383y + ", profileImageUrl=" + this.f45384z + ", twitterScreenName=" + this.A + ", isFollower=" + this.B + ", isFollowing=" + this.C + ", followingNum=" + this.D + ", followerNum=" + this.E + ", badgeImageUrl=" + this.F + ", ribbonImageUrl=" + this.G + ", ribbons=" + this.H + ", liveRequestNum=" + this.I + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeString(this.f45381w);
        parcel.writeString(this.f45382x);
        parcel.writeString(this.f45383y);
        parcel.writeString(this.f45384z);
        parcel.writeString(this.A);
        parcel.writeInt(this.B ? 1 : 0);
        parcel.writeInt(this.C ? 1 : 0);
        parcel.writeInt(this.D);
        parcel.writeInt(this.E);
        parcel.writeString(this.F);
        parcel.writeString(this.G);
        List<RibbonResponse> list = this.H;
        parcel.writeInt(list.size());
        for (RibbonResponse ribbonResponse : list) {
            parcel.writeSerializable(ribbonResponse);
        }
        parcel.writeLong(this.I);
    }
}
