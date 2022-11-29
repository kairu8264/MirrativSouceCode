package pd;

import com.dena.mirrorman.net.api.response.App;
import java.util.List;
import ud.h2;

/* loaded from: classes2.dex */
public abstract class v {

    /* loaded from: classes2.dex */
    public static final class a extends v {

        /* renamed from: a  reason: collision with root package name */
        public static final a f47291a = new a();

        public a() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends v {

        /* renamed from: a  reason: collision with root package name */
        public final List<App.AppParams> f47292a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<App.AppParams> list) {
            super(null);
            jo.p.h(list, "apps");
            this.f47292a = list;
        }

        public final List<App.AppParams> a() {
            return this.f47292a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jo.p.c(this.f47292a, ((b) obj).f47292a);
        }

        public int hashCode() {
            return this.f47292a.hashCode();
        }

        public String toString() {
            return "LoadApps(apps=" + this.f47292a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends v {

        /* renamed from: a  reason: collision with root package name */
        public final h2 f47293a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h2 h2Var) {
            super(null);
            jo.p.h(h2Var, "missionStatusBindModel");
            this.f47293a = h2Var;
        }

        public final h2 a() {
            return this.f47293a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f47293a, ((c) obj).f47293a);
        }

        public int hashCode() {
            return this.f47293a.hashCode();
        }

        public String toString() {
            return "LoadMissionStatus(missionStatusBindModel=" + this.f47293a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends v {

        /* renamed from: a  reason: collision with root package name */
        public final App.AppParams f47294a;

        public d(App.AppParams appParams) {
            super(null);
            this.f47294a = appParams;
        }

        public final App.AppParams a() {
            return this.f47294a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && jo.p.c(this.f47294a, ((d) obj).f47294a);
        }

        public int hashCode() {
            App.AppParams appParams = this.f47294a;
            if (appParams == null) {
                return 0;
            }
            return appParams.hashCode();
        }

        public String toString() {
            return "SelectApp(app=" + this.f47294a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends v {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f47295a;

        public e(boolean z10) {
            super(null);
            this.f47295a = z10;
        }

        public final boolean a() {
            return this.f47295a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f47295a == ((e) obj).f47295a;
        }

        public int hashCode() {
            boolean z10 = this.f47295a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "UpdateFirstItemCompletelyVisible(isVisible=" + this.f47295a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends v {

        /* renamed from: a  reason: collision with root package name */
        public static final f f47296a = new f();

        public f() {
            super(null);
        }
    }

    public v() {
    }

    public /* synthetic */ v(jo.h hVar) {
        this();
    }
}
