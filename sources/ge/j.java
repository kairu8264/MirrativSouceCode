package ge;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrorman.net.api.response.Chat;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.util.List;
import jo.p;
import xn.r;
import xn.s;

/* loaded from: classes2.dex */
public final class j implements Parcelable {
    public final boolean A;
    public final List<String> B;
    public final int C;
    public final boolean D;
    public final boolean E;
    public final int F;

    /* renamed from: w  reason: collision with root package name */
    public final String f33267w;

    /* renamed from: x  reason: collision with root package name */
    public final String f33268x;

    /* renamed from: y  reason: collision with root package name */
    public final String f33269y;

    /* renamed from: z  reason: collision with root package name */
    public final List<String> f33270z;
    public static final a G = new a(null);
    public static final Parcelable.Creator<j> CREATOR = new b();
    public static final int H = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final j a(Chat.Thread thread, boolean z10, List<String> list) {
            p.h(thread, "thread");
            return new j(thread.getUserId(), thread.getGroupId(), thread.getTitle(), thread.getImageUrls(), thread.getGroupNameEdited() == 1, list, thread.getGroupUserNum(), thread.getPushEnabled() == 1, z10, thread.isVisible());
        }

        public final j b(String str, String str2, String str3) {
            p.h(str2, "title");
            p.h(str3, "imageUrl");
            return new j(str, null, str2, r.d(str3), false, null, 0, false, false, 0, AnalyticsListener.EVENT_AUDIO_INPUT_FORMAT_CHANGED, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final j createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new j(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0, parcel.createStringArrayList(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final j[] newArray(int i10) {
            return new j[i10];
        }
    }

    public j() {
        this(null, null, null, null, false, null, 0, false, false, 0, AnalyticsListener.EVENT_DROPPED_VIDEO_FRAMES, null);
    }

    public j(String str, String str2, String str3, List<String> list, boolean z10, List<String> list2, int i10, boolean z11, boolean z12, int i11) {
        this.f33267w = str;
        this.f33268x = str2;
        this.f33269y = str3;
        this.f33270z = list;
        this.A = z10;
        this.B = list2;
        this.C = i10;
        this.D = z11;
        this.E = z12;
        this.F = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ j d(j jVar, String str, String str2, String str3, List list, boolean z10, List list2, int i10, boolean z11, boolean z12, int i11, int i12, Object obj) {
        return jVar.c((i12 & 1) != 0 ? jVar.f33267w : str, (i12 & 2) != 0 ? jVar.f33268x : str2, (i12 & 4) != 0 ? jVar.f33269y : str3, (i12 & 8) != 0 ? jVar.f33270z : list, (i12 & 16) != 0 ? jVar.A : z10, (i12 & 32) != 0 ? jVar.B : list2, (i12 & 64) != 0 ? jVar.C : i10, (i12 & 128) != 0 ? jVar.D : z11, (i12 & 256) != 0 ? jVar.E : z12, (i12 & 512) != 0 ? jVar.F : i11);
    }

    public final String a() {
        return this.f33267w;
    }

    public final String b() {
        return this.f33268x;
    }

    public final j c(String str, String str2, String str3, List<String> list, boolean z10, List<String> list2, int i10, boolean z11, boolean z12, int i11) {
        return new j(str, str2, str3, list, z10, list2, i10, z11, z12, i11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.E;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return p.c(this.f33267w, jVar.f33267w) && p.c(this.f33268x, jVar.f33268x) && p.c(this.f33269y, jVar.f33269y) && p.c(this.f33270z, jVar.f33270z) && this.A == jVar.A && p.c(this.B, jVar.B) && this.C == jVar.C && this.D == jVar.D && this.E == jVar.E && this.F == jVar.F;
        }
        return false;
    }

    public final String f() {
        return this.f33268x;
    }

    public final boolean g() {
        return this.A;
    }

    public final List<String> h() {
        return this.B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.f33267w;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f33268x;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f33269y;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.f33270z;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        boolean z10 = this.A;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode4 + i10) * 31;
        List<String> list2 = this.B;
        int hashCode5 = (((i11 + (list2 != null ? list2.hashCode() : 0)) * 31) + Integer.hashCode(this.C)) * 31;
        boolean z11 = this.D;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (hashCode5 + i12) * 31;
        boolean z12 = this.E;
        return ((i13 + (z12 ? 1 : z12 ? 1 : 0)) * 31) + Integer.hashCode(this.F);
    }

    public final int i() {
        return this.C;
    }

    public final List<String> j() {
        return this.f33270z;
    }

    public final boolean k() {
        return this.D;
    }

    public final String l() {
        return this.f33269y;
    }

    public final String m() {
        return this.f33267w;
    }

    public final boolean n() {
        String str = this.f33268x;
        return !(str == null || str.length() == 0);
    }

    public final boolean o(j jVar) {
        p.h(jVar, "thread");
        if (n() || jVar.n() || !p.c(this.f33267w, jVar.f33267w)) {
            return n() && jVar.n() && p.c(this.f33268x, jVar.f33268x);
        }
        return true;
    }

    public final int p() {
        return this.F;
    }

    public final j q(List<String> list) {
        p.h(list, "groupUserIds");
        return d(this, null, null, null, null, false, list, list.size(), false, false, 0, 927, null);
    }

    public final j r(boolean z10) {
        return d(this, null, null, null, null, false, null, 0, z10, false, 0, 895, null);
    }

    public final j s(int i10) {
        return d(this, null, null, null, null, false, null, 0, false, false, i10, 511, null);
    }

    public String toString() {
        return "ChatThread(userId=" + this.f33267w + ", groupId=" + this.f33268x + ", title=" + this.f33269y + ", imageUrls=" + this.f33270z + ", groupNameEdited=" + this.A + ", groupUserIds=" + this.B + ", groupUserNum=" + this.C + ", pushEnabled=" + this.D + ", entirePushEnabled=" + this.E + ", isVisible=" + this.F + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeString(this.f33267w);
        parcel.writeString(this.f33268x);
        parcel.writeString(this.f33269y);
        parcel.writeStringList(this.f33270z);
        parcel.writeInt(this.A ? 1 : 0);
        parcel.writeStringList(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D ? 1 : 0);
        parcel.writeInt(this.E ? 1 : 0);
        parcel.writeInt(this.F);
    }

    public /* synthetic */ j(String str, String str2, String str3, List list, boolean z10, List list2, int i10, boolean z11, boolean z12, int i11, int i12, jo.h hVar) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? s.k() : list, (i12 & 16) != 0 ? false : z10, (i12 & 32) == 0 ? list2 : null, (i12 & 64) == 0 ? i10 : 0, (i12 & 128) != 0 ? true : z11, (i12 & 256) != 0 ? true : z12, (i12 & 512) == 0 ? i11 : 1);
    }
}
