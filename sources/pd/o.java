package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.Graph;

/* loaded from: classes2.dex */
public abstract class o {

    /* loaded from: classes2.dex */
    public static final class a extends o {

        /* renamed from: a  reason: collision with root package name */
        public final String f47086a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f47087b;

        /* renamed from: c  reason: collision with root package name */
        public final MRError f47088c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, boolean z10, MRError mRError) {
            super(null);
            jo.p.h(str, "followUserId");
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47086a = str;
            this.f47087b = z10;
            this.f47088c = mRError;
        }

        public final MRError a() {
            return this.f47088c;
        }

        public final String b() {
            return this.f47086a;
        }

        public final boolean c() {
            return this.f47087b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return jo.p.c(this.f47086a, aVar.f47086a) && this.f47087b == aVar.f47087b && jo.p.c(this.f47088c, aVar.f47088c);
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f47086a.hashCode() * 31;
            boolean z10 = this.f47087b;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return ((hashCode + i10) * 31) + this.f47088c.hashCode();
        }

        public String toString() {
            return "FailedToUpdateFollowNotificationSetting(followUserId=" + this.f47086a + ", oldEnableNotification=" + this.f47087b + ", error=" + this.f47088c + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends o {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47089a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47089a = mRError;
        }

        public final MRError a() {
            return this.f47089a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jo.p.c(this.f47089a, ((b) obj).f47089a);
        }

        public int hashCode() {
            return this.f47089a.hashCode();
        }

        public String toString() {
            return "LoadFail(error=" + this.f47089a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends o {

        /* renamed from: a  reason: collision with root package name */
        public final Graph.FollowingList f47090a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Graph.FollowingList followingList) {
            super(null);
            jo.p.h(followingList, "response");
            this.f47090a = followingList;
        }

        public final Graph.FollowingList a() {
            return this.f47090a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f47090a, ((c) obj).f47090a);
        }

        public int hashCode() {
            return this.f47090a.hashCode();
        }

        public String toString() {
            return "LoadFinish(response=" + this.f47090a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends o {

        /* renamed from: a  reason: collision with root package name */
        public static final d f47091a = new d();

        public d() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends o {

        /* renamed from: a  reason: collision with root package name */
        public static final e f47092a = new e();

        public e() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends o {

        /* renamed from: a  reason: collision with root package name */
        public final String f47093a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f47094b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, boolean z10) {
            super(null);
            jo.p.h(str, "followUserId");
            this.f47093a = str;
            this.f47094b = z10;
        }

        public final String a() {
            return this.f47093a;
        }

        public final boolean b() {
            return this.f47094b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return jo.p.c(this.f47093a, fVar.f47093a) && this.f47094b == fVar.f47094b;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f47093a.hashCode() * 31;
            boolean z10 = this.f47094b;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return hashCode + i10;
        }

        public String toString() {
            return "UpdateFollowNotificationSetting(followUserId=" + this.f47093a + ", newEnableNotification=" + this.f47094b + ')';
        }
    }

    public o() {
    }

    public /* synthetic */ o(jo.h hVar) {
        this();
    }
}
