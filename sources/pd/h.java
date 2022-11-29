package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.user.CollabInvitableUser;
import com.dena.mirrorman.net.api.response.user.LiveViewingUser;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class h {

    /* loaded from: classes2.dex */
    public static final class a extends h {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46895a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46895a = mRError;
        }

        public final MRError a() {
            return this.f46895a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f46895a, ((a) obj).f46895a);
        }

        public int hashCode() {
            return this.f46895a.hashCode();
        }

        public String toString() {
            return "FailedInviteCollabEvent(error=" + this.f46895a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends h {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46896a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46896a = mRError;
        }

        public final MRError a() {
            return this.f46896a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jo.p.c(this.f46896a, ((b) obj).f46896a);
        }

        public int hashCode() {
            return this.f46896a.hashCode();
        }

        public String toString() {
            return "FailedLoadViewersEvent(error=" + this.f46896a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends h {

        /* renamed from: a  reason: collision with root package name */
        public final CollabInvitableUser f46897a;

        /* renamed from: b  reason: collision with root package name */
        public final List<LiveViewingUser> f46898b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(CollabInvitableUser collabInvitableUser, List<? extends LiveViewingUser> list) {
            super(null);
            jo.p.h(collabInvitableUser, "invitedUser");
            jo.p.h(list, "collaboratingUsers");
            this.f46897a = collabInvitableUser;
            this.f46898b = list;
        }

        public final List<LiveViewingUser> a() {
            return this.f46898b;
        }

        public final CollabInvitableUser b() {
            return this.f46897a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return jo.p.c(this.f46897a, cVar.f46897a) && jo.p.c(this.f46898b, cVar.f46898b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f46897a.hashCode() * 31) + this.f46898b.hashCode();
        }

        public String toString() {
            return "InvitedCollabEvent(invitedUser=" + this.f46897a + ", collaboratingUsers=" + this.f46898b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends h {

        /* renamed from: a  reason: collision with root package name */
        public final List<CollabInvitableUser> f46899a;

        /* renamed from: b  reason: collision with root package name */
        public final int f46900b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<CollabInvitableUser> list, int i10) {
            super(null);
            jo.p.h(list, "viewers");
            this.f46899a = list;
            this.f46900b = i10;
        }

        public final int a() {
            return this.f46900b;
        }

        public final List<CollabInvitableUser> b() {
            return this.f46899a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return jo.p.c(this.f46899a, dVar.f46899a) && this.f46900b == dVar.f46900b;
            }
            return false;
        }

        public int hashCode() {
            return (this.f46899a.hashCode() * 31) + Integer.hashCode(this.f46900b);
        }

        public String toString() {
            return "LoadFinishViewersEvent(viewers=" + this.f46899a + ", nextPage=" + this.f46900b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends h {

        /* renamed from: a  reason: collision with root package name */
        public static final e f46901a = new e();

        public e() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends h {

        /* renamed from: a  reason: collision with root package name */
        public final List<CollabInvitableUser> f46902a;

        /* renamed from: b  reason: collision with root package name */
        public final int f46903b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List<CollabInvitableUser> list, int i10) {
            super(null);
            jo.p.h(list, "viewers");
            this.f46902a = list;
            this.f46903b = i10;
        }

        public final int a() {
            return this.f46903b;
        }

        public final List<CollabInvitableUser> b() {
            return this.f46902a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return jo.p.c(this.f46902a, fVar.f46902a) && this.f46903b == fVar.f46903b;
            }
            return false;
        }

        public int hashCode() {
            return (this.f46902a.hashCode() * 31) + Integer.hashCode(this.f46903b);
        }

        public String toString() {
            return "ReloadFinishViewersEvent(viewers=" + this.f46902a + ", nextPage=" + this.f46903b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends h {

        /* renamed from: a  reason: collision with root package name */
        public static final g f46904a = new g();

        public g() {
            super(null);
        }
    }

    /* renamed from: pd.h$h  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0716h extends h {

        /* renamed from: a  reason: collision with root package name */
        public static final C0716h f46905a = new C0716h();

        public C0716h() {
            super(null);
        }
    }

    public h() {
    }

    public /* synthetic */ h(jo.h hVar) {
        this();
    }
}
