package pd;

import android.graphics.Bitmap;
import android.net.Uri;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.customview.GroupShotMemberSettingView;
import com.dena.mirrorman.net.api.response.EventNoticeResponse;
import com.dena.mirrorman.net.api.response.GroupShotBackground;
import com.dena.mirrorman.net.api.response.GroupShotBackgroundsResponse;
import com.dena.mirrorman.net.api.response.GroupShotViewer;
import com.dena.mirrorman.net.api.response.live.LiveGiftRankingUser;
import java.io.File;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class b1 {

    /* loaded from: classes2.dex */
    public static final class a extends b1 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f46607a = new a();

        public a() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends b1 {

        /* renamed from: a  reason: collision with root package name */
        public final EventNoticeResponse f46608a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EventNoticeResponse eventNoticeResponse) {
            super(null);
            jo.p.h(eventNoticeResponse, "response");
            this.f46608a = eventNoticeResponse;
        }

        public final EventNoticeResponse a() {
            return this.f46608a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jo.p.c(this.f46608a, ((b) obj).f46608a);
        }

        public int hashCode() {
            return this.f46608a.hashCode();
        }

        public String toString() {
            return "GetEventNoticeSucceededEvent(response=" + this.f46608a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends b1 {

        /* renamed from: a  reason: collision with root package name */
        public final int f46609a;

        public c(int i10) {
            super(null);
            this.f46609a = i10;
        }

        public final int a() {
            return this.f46609a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f46609a == ((c) obj).f46609a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f46609a);
        }

        public String toString() {
            return "GiftRankingPositionChanged(position=" + this.f46609a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends b1 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46610a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46610a = mRError;
        }

        public final MRError a() {
            return this.f46610a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && jo.p.c(this.f46610a, ((d) obj).f46610a);
        }

        public int hashCode() {
            return this.f46610a.hashCode();
        }

        public String toString() {
            return "LoadFailGroupShotAssets(error=" + this.f46610a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends b1 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46611a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46611a = mRError;
        }

        public final MRError a() {
            return this.f46611a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && jo.p.c(this.f46611a, ((e) obj).f46611a);
        }

        public int hashCode() {
            return this.f46611a.hashCode();
        }

        public String toString() {
            return "LoadFailGroupShotBackgrounds(error=" + this.f46611a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends b1 {

        /* renamed from: a  reason: collision with root package name */
        public final List<GroupShotViewer> f46612a;

        /* renamed from: b  reason: collision with root package name */
        public final File f46613b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List<GroupShotViewer> list, File file) {
            super(null);
            jo.p.h(list, "groupShotViewers");
            jo.p.h(file, "backgroundImageFile");
            this.f46612a = list;
            this.f46613b = file;
        }

        public final File a() {
            return this.f46613b;
        }

        public final List<GroupShotViewer> b() {
            return this.f46612a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return jo.p.c(this.f46612a, fVar.f46612a) && jo.p.c(this.f46613b, fVar.f46613b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f46612a.hashCode() * 31) + this.f46613b.hashCode();
        }

        public String toString() {
            return "LoadFinishGroupShotAssets(groupShotViewers=" + this.f46612a + ", backgroundImageFile=" + this.f46613b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends b1 {

        /* renamed from: a  reason: collision with root package name */
        public final GroupShotBackgroundsResponse f46614a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(GroupShotBackgroundsResponse groupShotBackgroundsResponse) {
            super(null);
            jo.p.h(groupShotBackgroundsResponse, "response");
            this.f46614a = groupShotBackgroundsResponse;
        }

        public final GroupShotBackgroundsResponse a() {
            return this.f46614a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && jo.p.c(this.f46614a, ((g) obj).f46614a);
        }

        public int hashCode() {
            return this.f46614a.hashCode();
        }

        public String toString() {
            return "LoadFinishGroupShotBackgrounds(response=" + this.f46614a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends b1 {

        /* renamed from: a  reason: collision with root package name */
        public final List<GroupShotBackground> f46615a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List<GroupShotBackground> list) {
            super(null);
            jo.p.h(list, "backgrounds");
            this.f46615a = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && jo.p.c(this.f46615a, ((h) obj).f46615a);
        }

        public int hashCode() {
            return this.f46615a.hashCode();
        }

        public String toString() {
            return "LoadFinishGroupShotBackgroundsFromCache(backgrounds=" + this.f46615a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends b1 {

        /* renamed from: a  reason: collision with root package name */
        public static final i f46616a = new i();

        public i() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends b1 {

        /* renamed from: a  reason: collision with root package name */
        public static final j f46617a = new j();

        public j() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends b1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46618a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str) {
            super(null);
            jo.p.h(str, "backgroundImageUrl");
            this.f46618a = str;
        }

        public final String a() {
            return this.f46618a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && jo.p.c(this.f46618a, ((k) obj).f46618a);
        }

        public int hashCode() {
            return this.f46618a.hashCode();
        }

        public String toString() {
            return "SelectGroupShotBackgroundImage(backgroundImageUrl=" + this.f46618a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends b1 {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f46619a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Bitmap bitmap) {
            super(null);
            jo.p.h(bitmap, "image");
            this.f46619a = bitmap;
        }

        public final Bitmap a() {
            return this.f46619a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && jo.p.c(this.f46619a, ((l) obj).f46619a);
        }

        public int hashCode() {
            return this.f46619a.hashCode();
        }

        public String toString() {
            return "SelectGroupShotBackgroundImageFromGallery(image=" + this.f46619a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends b1 {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f46620a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Uri uri) {
            super(null);
            jo.p.h(uri, "fileUri");
            this.f46620a = uri;
        }

        public final Uri a() {
            return this.f46620a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && jo.p.c(this.f46620a, ((m) obj).f46620a);
        }

        public int hashCode() {
            return this.f46620a.hashCode();
        }

        public String toString() {
            return "ShareGroupPhoto(fileUri=" + this.f46620a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends b1 {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f46621a;

        public n(boolean z10) {
            super(null);
            this.f46621a = z10;
        }

        public final boolean a() {
            return this.f46621a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f46621a == ((n) obj).f46621a;
        }

        public int hashCode() {
            boolean z10 = this.f46621a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "ShooterMatchingStateUpdated(isMatching=" + this.f46621a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends b1 {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f46622a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Bitmap bitmap) {
            super(null);
            jo.p.h(bitmap, "groupShotImage");
            this.f46622a = bitmap;
        }

        public final Bitmap a() {
            return this.f46622a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && jo.p.c(this.f46622a, ((o) obj).f46622a);
        }

        public int hashCode() {
            return this.f46622a.hashCode();
        }

        public String toString() {
            return "SnapGroupShot(groupShotImage=" + this.f46622a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends b1 {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f46623a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Uri uri) {
            super(null);
            jo.p.h(uri, "fileUri");
            this.f46623a = uri;
        }

        public final Uri a() {
            return this.f46623a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && jo.p.c(this.f46623a, ((p) obj).f46623a);
        }

        public int hashCode() {
            return this.f46623a.hashCode();
        }

        public String toString() {
            return "ThumbnailGroupPhoto(fileUri=" + this.f46623a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends b1 {

        /* renamed from: a  reason: collision with root package name */
        public final GroupShotMemberSettingView.b f46624a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(GroupShotMemberSettingView.b bVar) {
            super(null);
            jo.p.h(bVar, "selectedMemberType");
            this.f46624a = bVar;
        }

        public final GroupShotMemberSettingView.b a() {
            return this.f46624a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && this.f46624a == ((q) obj).f46624a;
        }

        public int hashCode() {
            return this.f46624a.hashCode();
        }

        public String toString() {
            return "UpdateGroupShotMemberSetting(selectedMemberType=" + this.f46624a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends b1 {

        /* renamed from: a  reason: collision with root package name */
        public final int f46625a;

        public r(int i10) {
            super(null);
            this.f46625a = i10;
        }

        public final int a() {
            return this.f46625a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.f46625a == ((r) obj).f46625a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f46625a);
        }

        public String toString() {
            return "UpdateGroupShotNumberOfMembersSetting(numberOfMembers=" + this.f46625a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends b1 {

        /* renamed from: a  reason: collision with root package name */
        public final List<LiveGiftRankingUser> f46626a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(List<LiveGiftRankingUser> list) {
            super(null);
            jo.p.h(list, "users");
            this.f46626a = list;
        }

        public final List<LiveGiftRankingUser> a() {
            return this.f46626a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && jo.p.c(this.f46626a, ((s) obj).f46626a);
        }

        public int hashCode() {
            return this.f46626a.hashCode();
        }

        public String toString() {
            return "UpdateGroupShotUsers(users=" + this.f46626a + ')';
        }
    }

    public b1() {
    }

    public /* synthetic */ b1(jo.h hVar) {
        this();
    }
}
