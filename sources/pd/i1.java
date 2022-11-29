package pd;

import android.graphics.Bitmap;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.user.SeasonRatingStatusResponse;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.Graph;
import com.dena.mirrorman.net.api.response.Moderator;
import com.dena.mirrorman.net.api.response.live.LiveHistoriesResponse;
import com.dena.mirrorman.net.api.response.live.SeasonYellStatusResponse;
import com.dena.mirrorman.net.api.response.user.UserProfile;

/* loaded from: classes2.dex */
public abstract class i1 {

    /* loaded from: classes2.dex */
    public static final class a extends i1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46929a;

        /* renamed from: b  reason: collision with root package name */
        public final Bitmap f46930b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Bitmap bitmap) {
            super(null);
            jo.p.h(str, "userId");
            this.f46929a = str;
            this.f46930b = bitmap;
        }

        public final Bitmap a() {
            return this.f46930b;
        }

        public String b() {
            return this.f46929a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return jo.p.c(b(), aVar.b()) && jo.p.c(this.f46930b, aVar.f46930b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = b().hashCode() * 31;
            Bitmap bitmap = this.f46930b;
            return hashCode + (bitmap == null ? 0 : bitmap.hashCode());
        }

        public String toString() {
            return "ActionBarBackgroundImageChangeEvent(userId=" + b() + ", actionBarBackgroundImage=" + this.f46930b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class a0 extends i1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46931a;

        /* renamed from: b  reason: collision with root package name */
        public final MRError f46932b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(String str, MRError mRError) {
            super(null);
            jo.p.h(str, "userId");
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46931a = str;
            this.f46932b = mRError;
        }

        public final MRError a() {
            return this.f46932b;
        }

        public String b() {
            return this.f46931a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a0) {
                a0 a0Var = (a0) obj;
                return jo.p.c(b(), a0Var.b()) && jo.p.c(this.f46932b, a0Var.f46932b);
            }
            return false;
        }

        public int hashCode() {
            return (b().hashCode() * 31) + this.f46932b.hashCode();
        }

        public String toString() {
            return "SetDeleteModeratorOccurErrorEvent(userId=" + b() + ", error=" + this.f46932b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends i1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46933a;

        /* renamed from: b  reason: collision with root package name */
        public final long f46934b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, long j10) {
            super(null);
            jo.p.h(str, "userId");
            this.f46933a = str;
            this.f46934b = j10;
        }

        public final long a() {
            return this.f46934b;
        }

        public String b() {
            return this.f46933a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return jo.p.c(b(), bVar.b()) && this.f46934b == bVar.f46934b;
            }
            return false;
        }

        public int hashCode() {
            return (b().hashCode() * 31) + Long.hashCode(this.f46934b);
        }

        public String toString() {
            return "AddPoolLiveRequestCount(userId=" + b() + ", count=" + this.f46934b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b0 extends i1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46935a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(String str) {
            super(null);
            jo.p.h(str, "userId");
            this.f46935a = str;
        }

        public String a() {
            return this.f46935a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b0) && jo.p.c(a(), ((b0) obj).a());
        }

        public int hashCode() {
            return a().hashCode();
        }

        public String toString() {
            return "SetDeleteModeratorSucceededEvent(userId=" + a() + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends i1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46936a;

        /* renamed from: b  reason: collision with root package name */
        public final MRError f46937b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, MRError mRError) {
            super(null);
            jo.p.h(str, "userId");
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46936a = str;
            this.f46937b = mRError;
        }

        public String a() {
            return this.f46936a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return jo.p.c(a(), cVar.a()) && jo.p.c(this.f46937b, cVar.f46937b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f46937b.hashCode();
        }

        public String toString() {
            return "AppsErrorOccurEvent(userId=" + a() + ", error=" + this.f46937b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c0 extends i1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46938a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f46939b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(String str, boolean z10) {
            super(null);
            jo.p.h(str, "userId");
            this.f46938a = str;
            this.f46939b = z10;
        }

        public String a() {
            return this.f46938a;
        }

        public final boolean b() {
            return this.f46939b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c0) {
                c0 c0Var = (c0) obj;
                return jo.p.c(a(), c0Var.a()) && this.f46939b == c0Var.f46939b;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = a().hashCode() * 31;
            boolean z10 = this.f46939b;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return hashCode + i10;
        }

        public String toString() {
            return "SetIsBlocking(userId=" + a() + ", isBlocking=" + this.f46939b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends i1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46940a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(null);
            jo.p.h(str, "userId");
            this.f46940a = str;
        }

        public String a() {
            return this.f46940a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && jo.p.c(a(), ((d) obj).a());
        }

        public int hashCode() {
            return a().hashCode();
        }

        public String toString() {
            return "AppsLoadNextEvent(userId=" + a() + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d0 extends i1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46941a;

        /* renamed from: b  reason: collision with root package name */
        public final long f46942b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(String str, long j10) {
            super(null);
            jo.p.h(str, "userId");
            this.f46941a = str;
            this.f46942b = j10;
        }

        public final long a() {
            return this.f46942b;
        }

        public String b() {
            return this.f46941a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d0) {
                d0 d0Var = (d0) obj;
                return jo.p.c(b(), d0Var.b()) && this.f46942b == d0Var.f46942b;
            }
            return false;
        }

        public int hashCode() {
            return (b().hashCode() * 31) + Long.hashCode(this.f46942b);
        }

        public String toString() {
            return "SetLiveRequestCount(userId=" + b() + ", count=" + this.f46942b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends i1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46943a;

        /* renamed from: b  reason: collision with root package name */
        public final App.Apps f46944b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, App.Apps apps) {
            super(null);
            jo.p.h(str, "userId");
            jo.p.h(apps, "apps");
            this.f46943a = str;
            this.f46944b = apps;
        }

        public final App.Apps a() {
            return this.f46944b;
        }

        public String b() {
            return this.f46943a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return jo.p.c(b(), eVar.b()) && jo.p.c(this.f46944b, eVar.f46944b);
            }
            return false;
        }

        public int hashCode() {
            return (b().hashCode() * 31) + this.f46944b.hashCode();
        }

        public String toString() {
            return "AppsLoadNextFinishEvent(userId=" + b() + ", apps=" + this.f46944b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e0 extends i1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46945a;

        /* renamed from: b  reason: collision with root package name */
        public final Moderator f46946b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(String str, Moderator moderator) {
            super(null);
            jo.p.h(str, "userId");
            jo.p.h(moderator, "moderator");
            this.f46945a = str;
            this.f46946b = moderator;
        }

        public final Moderator a() {
            return this.f46946b;
        }

        public String b() {
            return this.f46945a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e0) {
                e0 e0Var = (e0) obj;
                return jo.p.c(b(), e0Var.b()) && jo.p.c(this.f46946b, e0Var.f46946b);
            }
            return false;
        }

        public int hashCode() {
            return (b().hashCode() * 31) + this.f46946b.hashCode();
        }

        public String toString() {
            return "SetModeratorIdEvent(userId=" + b() + ", moderator=" + this.f46946b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends i1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46947a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(null);
            jo.p.h(str, "userId");
            this.f46947a = str;
        }

        public String a() {
            return this.f46947a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && jo.p.c(a(), ((f) obj).a());
        }

        public int hashCode() {
            return a().hashCode();
        }

        public String toString() {
            return "AppsReloadEvent(userId=" + a() + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f0 extends i1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46948a;

        /* renamed from: b  reason: collision with root package name */
        public final long f46949b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(String str, long j10) {
            super(null);
            jo.p.h(str, "userId");
            this.f46948a = str;
            this.f46949b = j10;
        }

        public final long a() {
            return this.f46949b;
        }

        public String b() {
            return this.f46948a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f0) {
                f0 f0Var = (f0) obj;
                return jo.p.c(b(), f0Var.b()) && this.f46949b == f0Var.f46949b;
            }
            return false;
        }

        public int hashCode() {
            return (b().hashCode() * 31) + Long.hashCode(this.f46949b);
        }

        public String toString() {
            return "SetPoolLiveRequestCount(userId=" + b() + ", count=" + this.f46949b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends i1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46950a;

        /* renamed from: b  reason: collision with root package name */
        public final App.Apps f46951b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, App.Apps apps) {
            super(null);
            jo.p.h(str, "userId");
            jo.p.h(apps, "apps");
            this.f46950a = str;
            this.f46951b = apps;
        }

        public final App.Apps a() {
            return this.f46951b;
        }

        public String b() {
            return this.f46950a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return jo.p.c(b(), gVar.b()) && jo.p.c(this.f46951b, gVar.f46951b);
            }
            return false;
        }

        public int hashCode() {
            return (b().hashCode() * 31) + this.f46951b.hashCode();
        }

        public String toString() {
            return "AppsReloadFinishEvent(userId=" + b() + ", apps=" + this.f46951b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g0 extends i1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46952a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(String str) {
            super(null);
            jo.p.h(str, "userId");
            this.f46952a = str;
        }

        public String a() {
            return this.f46952a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g0) && jo.p.c(a(), ((g0) obj).a());
        }

        public int hashCode() {
            return a().hashCode();
        }

        public String toString() {
            return "UnfollowEvent(userId=" + a() + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends i1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46953a;

        /* renamed from: b  reason: collision with root package name */
        public final Bitmap f46954b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, Bitmap bitmap) {
            super(null);
            jo.p.h(str, "userId");
            this.f46953a = str;
            this.f46954b = bitmap;
        }

        public final Bitmap a() {
            return this.f46954b;
        }

        public String b() {
            return this.f46953a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return jo.p.c(b(), hVar.b()) && jo.p.c(this.f46954b, hVar.f46954b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = b().hashCode() * 31;
            Bitmap bitmap = this.f46954b;
            return hashCode + (bitmap == null ? 0 : bitmap.hashCode());
        }

        public String toString() {
            return "AvatarImageChangeEvent(userId=" + b() + ", avatarImage=" + this.f46954b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends i1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46955a;

        /* renamed from: b  reason: collision with root package name */
        public final Bitmap f46956b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, Bitmap bitmap) {
            super(null);
            jo.p.h(str, "userId");
            this.f46955a = str;
            this.f46956b = bitmap;
        }

        public final Bitmap a() {
            return this.f46956b;
        }

        public String b() {
            return this.f46955a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return jo.p.c(b(), iVar.b()) && jo.p.c(this.f46956b, iVar.f46956b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = b().hashCode() * 31;
            Bitmap bitmap = this.f46956b;
            return hashCode + (bitmap == null ? 0 : bitmap.hashCode());
        }

        public String toString() {
            return "BackgroundImageChangeEvent(userId=" + b() + ", backgroundImage=" + this.f46956b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends i1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46957a;

        /* renamed from: b  reason: collision with root package name */
        public final MRError f46958b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, MRError mRError) {
            super(null);
            jo.p.h(str, "userId");
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46957a = str;
            this.f46958b = mRError;
        }

        public final MRError a() {
            return this.f46958b;
        }

        public String b() {
            return this.f46957a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return jo.p.c(b(), jVar.b()) && jo.p.c(this.f46958b, jVar.f46958b);
            }
            return false;
        }

        public int hashCode() {
            return (b().hashCode() * 31) + this.f46958b.hashCode();
        }

        public String toString() {
            return "BlockErrorOccurEvent(userId=" + b() + ", error=" + this.f46958b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends i1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46959a;

        /* renamed from: b  reason: collision with root package name */
        public final UserProfile f46960b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, UserProfile userProfile) {
            super(null);
            jo.p.h(str, "userId");
            jo.p.h(userProfile, "userProfile");
            this.f46959a = str;
            this.f46960b = userProfile;
        }

        public String a() {
            return this.f46959a;
        }

        public final UserProfile b() {
            return this.f46960b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof k) {
                k kVar = (k) obj;
                return jo.p.c(a(), kVar.a()) && jo.p.c(this.f46960b, kVar.f46960b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f46960b.hashCode();
        }

        public String toString() {
            return "DataChangeEvent(userId=" + a() + ", userProfile=" + this.f46960b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends i1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46961a;

        /* renamed from: b  reason: collision with root package name */
        public final SeasonRatingStatusResponse f46962b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, SeasonRatingStatusResponse seasonRatingStatusResponse) {
            super(null);
            jo.p.h(str, "userId");
            jo.p.h(seasonRatingStatusResponse, "status");
            this.f46961a = str;
            this.f46962b = seasonRatingStatusResponse;
        }

        public final SeasonRatingStatusResponse a() {
            return this.f46962b;
        }

        public String b() {
            return this.f46961a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof l) {
                l lVar = (l) obj;
                return jo.p.c(b(), lVar.b()) && jo.p.c(this.f46962b, lVar.f46962b);
            }
            return false;
        }

        public int hashCode() {
            return (b().hashCode() * 31) + this.f46962b.hashCode();
        }

        public String toString() {
            return "FetchSeasonRatingStatusSucceeded(userId=" + b() + ", status=" + this.f46962b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends i1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46963a;

        /* renamed from: b  reason: collision with root package name */
        public final SeasonYellStatusResponse f46964b;

        /* renamed from: c  reason: collision with root package name */
        public final String f46965c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f46966d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, SeasonYellStatusResponse seasonYellStatusResponse, String str2, boolean z10) {
            super(null);
            jo.p.h(str, "userId");
            jo.p.h(seasonYellStatusResponse, "response");
            jo.p.h(str2, "liveOwnerName");
            this.f46963a = str;
            this.f46964b = seasonYellStatusResponse;
            this.f46965c = str2;
            this.f46966d = z10;
        }

        public final String a() {
            return this.f46965c;
        }

        public final SeasonYellStatusResponse b() {
            return this.f46964b;
        }

        public String c() {
            return this.f46963a;
        }

        public final boolean d() {
            return this.f46966d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof m) {
                m mVar = (m) obj;
                return jo.p.c(c(), mVar.c()) && jo.p.c(this.f46964b, mVar.f46964b) && jo.p.c(this.f46965c, mVar.f46965c) && this.f46966d == mVar.f46966d;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((c().hashCode() * 31) + this.f46964b.hashCode()) * 31) + this.f46965c.hashCode()) * 31;
            boolean z10 = this.f46966d;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return hashCode + i10;
        }

        public String toString() {
            return "FetchSeasonYellStatusSucceeded(userId=" + c() + ", response=" + this.f46964b + ", liveOwnerName=" + this.f46965c + ", isMyPage=" + this.f46966d + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends i1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46967a;

        /* renamed from: b  reason: collision with root package name */
        public final MRError f46968b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, MRError mRError) {
            super(null);
            jo.p.h(str, "userId");
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46967a = str;
            this.f46968b = mRError;
        }

        public final MRError a() {
            return this.f46968b;
        }

        public String b() {
            return this.f46967a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof n) {
                n nVar = (n) obj;
                return jo.p.c(b(), nVar.b()) && jo.p.c(this.f46968b, nVar.f46968b);
            }
            return false;
        }

        public int hashCode() {
            return (b().hashCode() * 31) + this.f46968b.hashCode();
        }

        public String toString() {
            return "FollowErrorOccurEvent(userId=" + b() + ", error=" + this.f46968b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends i1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46969a;

        /* renamed from: b  reason: collision with root package name */
        public final Graph.Follow f46970b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, Graph.Follow follow) {
            super(null);
            jo.p.h(str, "userId");
            jo.p.h(follow, "followResponse");
            this.f46969a = str;
            this.f46970b = follow;
        }

        public final Graph.Follow a() {
            return this.f46970b;
        }

        public String b() {
            return this.f46969a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof o) {
                o oVar = (o) obj;
                return jo.p.c(b(), oVar.b()) && jo.p.c(this.f46970b, oVar.f46970b);
            }
            return false;
        }

        public int hashCode() {
            return (b().hashCode() * 31) + this.f46970b.hashCode();
        }

        public String toString() {
            return "FollowEvent(userId=" + b() + ", followResponse=" + this.f46970b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends i1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46971a;

        /* renamed from: b  reason: collision with root package name */
        public final MRError f46972b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str, MRError mRError) {
            super(null);
            jo.p.h(str, "userId");
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46971a = str;
            this.f46972b = mRError;
        }

        public final MRError a() {
            return this.f46972b;
        }

        public String b() {
            return this.f46971a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof p) {
                p pVar = (p) obj;
                return jo.p.c(b(), pVar.b()) && jo.p.c(this.f46972b, pVar.f46972b);
            }
            return false;
        }

        public int hashCode() {
            return (b().hashCode() * 31) + this.f46972b.hashCode();
        }

        public String toString() {
            return "GetUserProfileFailed(userId=" + b() + ", error=" + this.f46972b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends i1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46973a;

        /* renamed from: b  reason: collision with root package name */
        public final MRError f46974b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str, MRError mRError) {
            super(null);
            jo.p.h(str, "userId");
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46973a = str;
            this.f46974b = mRError;
        }

        public final MRError a() {
            return this.f46974b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends i1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46975a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str) {
            super(null);
            jo.p.h(str, "userId");
            this.f46975a = str;
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends i1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46976a;

        /* renamed from: b  reason: collision with root package name */
        public final LiveHistoriesResponse f46977b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String str, LiveHistoriesResponse liveHistoriesResponse) {
            super(null);
            jo.p.h(str, "userId");
            jo.p.h(liveHistoriesResponse, "response");
            this.f46976a = str;
            this.f46977b = liveHistoriesResponse;
        }

        public final LiveHistoriesResponse a() {
            return this.f46977b;
        }

        public String b() {
            return this.f46976a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof s) {
                s sVar = (s) obj;
                return jo.p.c(b(), sVar.b()) && jo.p.c(this.f46977b, sVar.f46977b);
            }
            return false;
        }

        public int hashCode() {
            return (b().hashCode() * 31) + this.f46977b.hashCode();
        }

        public String toString() {
            return "LiveHistoriesLoadFinishEvent(userId=" + b() + ", response=" + this.f46977b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends i1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46978a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(String str) {
            super(null);
            jo.p.h(str, "userId");
            this.f46978a = str;
        }

        public String a() {
            return this.f46978a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && jo.p.c(a(), ((t) obj).a());
        }

        public int hashCode() {
            return a().hashCode();
        }

        public String toString() {
            return "LiveHistoriesLoadNextEvent(userId=" + a() + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends i1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46979a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(String str) {
            super(null);
            jo.p.h(str, "userId");
            this.f46979a = str;
        }

        public String a() {
            return this.f46979a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && jo.p.c(a(), ((u) obj).a());
        }

        public int hashCode() {
            return a().hashCode();
        }

        public String toString() {
            return "LiveHistoriesReloadEvent(userId=" + a() + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class v extends i1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46980a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(String str) {
            super(null);
            jo.p.h(str, "userId");
            this.f46980a = str;
        }

        public String a() {
            return this.f46980a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && jo.p.c(a(), ((v) obj).a());
        }

        public int hashCode() {
            return a().hashCode();
        }

        public String toString() {
            return "NeedsRegistrationEvent(userId=" + a() + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class w extends i1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46981a;

        /* renamed from: b  reason: collision with root package name */
        public final int f46982b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(String str, int i10) {
            super(null);
            jo.p.h(str, "userId");
            this.f46981a = str;
            this.f46982b = i10;
        }

        public final int a() {
            return this.f46982b;
        }

        public String b() {
            return this.f46981a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof w) {
                w wVar = (w) obj;
                return jo.p.c(b(), wVar.b()) && this.f46982b == wVar.f46982b;
            }
            return false;
        }

        public int hashCode() {
            return (b().hashCode() * 31) + Integer.hashCode(this.f46982b);
        }

        public String toString() {
            return "NumberOfLivesChangeEvent(userId=" + b() + ", numberOfLives=" + this.f46982b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class x extends i1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46983a;

        /* renamed from: b  reason: collision with root package name */
        public final String f46984b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(String str, String str2) {
            super(null);
            jo.p.h(str, "userId");
            jo.p.h(str2, "ownUserId");
            this.f46983a = str;
            this.f46984b = str2;
        }

        public final String a() {
            return this.f46984b;
        }

        public String b() {
            return this.f46983a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof x) {
                x xVar = (x) obj;
                return jo.p.c(b(), xVar.b()) && jo.p.c(this.f46984b, xVar.f46984b);
            }
            return false;
        }

        public int hashCode() {
            return (b().hashCode() * 31) + this.f46984b.hashCode();
        }

        public String toString() {
            return "OwnUserIdGetEvent(userId=" + b() + ", ownUserId=" + this.f46984b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class y extends i1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46985a;

        /* renamed from: b  reason: collision with root package name */
        public final Bitmap f46986b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(String str, Bitmap bitmap) {
            super(null);
            jo.p.h(str, "userId");
            this.f46985a = str;
            this.f46986b = bitmap;
        }

        public final Bitmap a() {
            return this.f46986b;
        }

        public String b() {
            return this.f46985a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof y) {
                y yVar = (y) obj;
                return jo.p.c(b(), yVar.b()) && jo.p.c(this.f46986b, yVar.f46986b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = b().hashCode() * 31;
            Bitmap bitmap = this.f46986b;
            return hashCode + (bitmap == null ? 0 : bitmap.hashCode());
        }

        public String toString() {
            return "ProfileImageChangeEvent(userId=" + b() + ", profileImage=" + this.f46986b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class z extends i1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46987a;

        /* renamed from: b  reason: collision with root package name */
        public final MRError f46988b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(String str, MRError mRError) {
            super(null);
            jo.p.h(str, "userId");
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46987a = str;
            this.f46988b = mRError;
        }

        public final MRError a() {
            return this.f46988b;
        }

        public String b() {
            return this.f46987a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof z) {
                z zVar = (z) obj;
                return jo.p.c(b(), zVar.b()) && jo.p.c(this.f46988b, zVar.f46988b);
            }
            return false;
        }

        public int hashCode() {
            return (b().hashCode() * 31) + this.f46988b.hashCode();
        }

        public String toString() {
            return "SetAddModeratorOccurErrorEvent(userId=" + b() + ", error=" + this.f46988b + ')';
        }
    }

    public i1() {
    }

    public /* synthetic */ i1(jo.h hVar) {
        this();
    }
}
