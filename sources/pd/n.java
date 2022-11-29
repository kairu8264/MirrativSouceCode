package pd;

import com.dena.mirrorman.net.api.response.Graph;
import ud.h2;

/* loaded from: classes2.dex */
public abstract class n {

    /* loaded from: classes2.dex */
    public static final class a extends n {

        /* renamed from: a  reason: collision with root package name */
        public static final a f47075a = new a();

        public a() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends n {

        /* renamed from: a  reason: collision with root package name */
        public static final b f47076a = new b();

        public b() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends n {

        /* renamed from: a  reason: collision with root package name */
        public final h2 f47077a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h2 h2Var) {
            super(null);
            jo.p.h(h2Var, "missionStatusBindModel");
            this.f47077a = h2Var;
        }

        public final h2 a() {
            return this.f47077a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f47077a, ((c) obj).f47077a);
        }

        public int hashCode() {
            return this.f47077a.hashCode();
        }

        public String toString() {
            return "LoadMissionStatus(missionStatusBindModel=" + this.f47077a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends n {

        /* renamed from: a  reason: collision with root package name */
        public final Graph.UrgeUserList f47078a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Graph.UrgeUserList urgeUserList) {
            super(null);
            jo.p.h(urgeUserList, "urgeUserList");
            this.f47078a = urgeUserList;
        }

        public final Graph.UrgeUserList a() {
            return this.f47078a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && jo.p.c(this.f47078a, ((d) obj).f47078a);
        }

        public int hashCode() {
            return this.f47078a.hashCode();
        }

        public String toString() {
            return "LoadRecommendUserLoad(urgeUserList=" + this.f47078a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends n {

        /* renamed from: a  reason: collision with root package name */
        public static final e f47079a = new e();

        public e() {
            super(null);
        }
    }

    public n() {
    }

    public /* synthetic */ n(jo.h hVar) {
        this();
    }
}
