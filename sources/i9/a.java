package i9;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrativ.mirrativapi.user.UserProfileSeasonYell;
import com.dena.mirrativ.mirrativapi.user.UserProfileSeasonYellPreviewViewer;
import java.util.ArrayList;
import java.util.List;
import jo.h;
import jo.p;
import xn.a0;
import xn.s;
import xn.t;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public final List<c> A;

    /* renamed from: w  reason: collision with root package name */
    public final String f36436w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f36437x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f36438y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f36439z;
    public static final C0465a B = new C0465a(null);
    public static final Parcelable.Creator<a> CREATOR = new b();
    public static final int C = 8;

    /* renamed from: i9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0465a {
        public C0465a() {
        }

        public /* synthetic */ C0465a(h hVar) {
            this();
        }

        public final a a(UserProfileSeasonYell userProfileSeasonYell) {
            p.h(userProfileSeasonYell, "response");
            int totalViewerCount = userProfileSeasonYell.getTotalViewerCount() - 1;
            boolean isDisplayTarget = userProfileSeasonYell.isDisplayTarget();
            boolean z10 = userProfileSeasonYell.isDisplayTarget() && userProfileSeasonYell.getTotalViewerCount() == 0;
            boolean z11 = userProfileSeasonYell.isDisplayTarget() && userProfileSeasonYell.getTotalViewerCount() > 5;
            String valueOf = String.valueOf(userProfileSeasonYell.getTotalViewerCount());
            List w02 = a0.w0(userProfileSeasonYell.getPreviewViewers(), 5);
            ArrayList arrayList = new ArrayList(t.u(w02, 10));
            int i10 = 0;
            for (Object obj : w02) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    s.t();
                }
                UserProfileSeasonYellPreviewViewer userProfileSeasonYellPreviewViewer = (UserProfileSeasonYellPreviewViewer) obj;
                arrayList.add(new c(userProfileSeasonYellPreviewViewer.getProfileImageUrl(), userProfileSeasonYellPreviewViewer.getBadgeImageUrl(), userProfileSeasonYellPreviewViewer.getBadgeImageUrl().length() > 0, i10 != totalViewerCount));
                i10 = i11;
            }
            return new a(valueOf, z10, z11, isDisplayTarget, arrayList);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final a createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            String readString = parcel.readString();
            boolean z10 = parcel.readInt() != 0;
            boolean z11 = parcel.readInt() != 0;
            boolean z12 = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                arrayList.add(c.CREATOR.createFromParcel(parcel));
            }
            return new a(readString, z10, z11, z12, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements Parcelable {

        /* renamed from: w  reason: collision with root package name */
        public final String f36440w;

        /* renamed from: x  reason: collision with root package name */
        public final String f36441x;

        /* renamed from: y  reason: collision with root package name */
        public final boolean f36442y;

        /* renamed from: z  reason: collision with root package name */
        public final boolean f36443z;
        public static final Parcelable.Creator<c> CREATOR = new C0466a();
        public static final int A = 8;

        /* renamed from: i9.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0466a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final c createFromParcel(Parcel parcel) {
                p.h(parcel, "parcel");
                return new c(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final c[] newArray(int i10) {
                return new c[i10];
            }
        }

        public c(String str, String str2, boolean z10, boolean z11) {
            p.h(str, "iconImageUrl");
            p.h(str2, "badgeImageUrl");
            this.f36440w = str;
            this.f36441x = str2;
            this.f36442y = z10;
            this.f36443z = z11;
        }

        public final String a() {
            return this.f36441x;
        }

        public final String b() {
            return this.f36440w;
        }

        public final boolean c() {
            return this.f36442y;
        }

        public final boolean d() {
            return this.f36443z;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return p.c(this.f36440w, cVar.f36440w) && p.c(this.f36441x, cVar.f36441x) && this.f36442y == cVar.f36442y && this.f36443z == cVar.f36443z;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((this.f36440w.hashCode() * 31) + this.f36441x.hashCode()) * 31;
            boolean z10 = this.f36442y;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            int i11 = (hashCode + i10) * 31;
            boolean z11 = this.f36443z;
            return i11 + (z11 ? 1 : z11 ? 1 : 0);
        }

        public String toString() {
            return "ProfileCheersIconBindModel(iconImageUrl=" + this.f36440w + ", badgeImageUrl=" + this.f36441x + ", isVisibleBadge=" + this.f36442y + ", isVisibleSpace=" + this.f36443z + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            p.h(parcel, "out");
            parcel.writeString(this.f36440w);
            parcel.writeString(this.f36441x);
            parcel.writeInt(this.f36442y ? 1 : 0);
            parcel.writeInt(this.f36443z ? 1 : 0);
        }
    }

    public a(String str, boolean z10, boolean z11, boolean z12, List<c> list) {
        p.h(str, "cheersCount");
        p.h(list, "icons");
        this.f36436w = str;
        this.f36437x = z10;
        this.f36438y = z11;
        this.f36439z = z12;
        this.A = list;
    }

    public final String a() {
        return this.f36436w;
    }

    public final List<c> b() {
        return this.A;
    }

    public final boolean c() {
        return this.f36439z;
    }

    public final boolean d() {
        return this.f36437x;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.f36438y;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return p.c(this.f36436w, aVar.f36436w) && this.f36437x == aVar.f36437x && this.f36438y == aVar.f36438y && this.f36439z == aVar.f36439z && p.c(this.A, aVar.A);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f36436w.hashCode() * 31;
        boolean z10 = this.f36437x;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.f36438y;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.f36439z;
        return ((i13 + (z12 ? 1 : z12 ? 1 : 0)) * 31) + this.A.hashCode();
    }

    public String toString() {
        return "ProfileCheersBindModel(cheersCount=" + this.f36436w + ", isVisibleEmptyCheersText=" + this.f36437x + ", isVisibleMoreCheersIcon=" + this.f36438y + ", isVisible=" + this.f36439z + ", icons=" + this.A + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeString(this.f36436w);
        parcel.writeInt(this.f36437x ? 1 : 0);
        parcel.writeInt(this.f36438y ? 1 : 0);
        parcel.writeInt(this.f36439z ? 1 : 0);
        List<c> list = this.A;
        parcel.writeInt(list.size());
        for (c cVar : list) {
            cVar.writeToParcel(parcel, i10);
        }
    }
}
