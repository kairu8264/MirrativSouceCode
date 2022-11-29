package lc;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.FavoriteLiveSetting;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class f {

    /* loaded from: classes2.dex */
    public static final class a extends f {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f39858a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f39858a = mRError;
        }

        public final MRError a() {
            return this.f39858a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f39858a, ((a) obj).f39858a);
        }

        public int hashCode() {
            return this.f39858a.hashCode();
        }

        public String toString() {
            return "LoadFail(error=" + this.f39858a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends f {

        /* renamed from: a  reason: collision with root package name */
        public final List<FavoriteLiveSetting> f39859a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<FavoriteLiveSetting> list) {
            super(null);
            jo.p.h(list, "items");
            this.f39859a = list;
        }

        public final List<FavoriteLiveSetting> a() {
            return this.f39859a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jo.p.c(this.f39859a, ((b) obj).f39859a);
        }

        public int hashCode() {
            return this.f39859a.hashCode();
        }

        public String toString() {
            return "LoadFinish(items=" + this.f39859a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f39860a = new c();

        public c() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends f {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f39861a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f39861a = mRError;
        }

        public final MRError a() {
            return this.f39861a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && jo.p.c(this.f39861a, ((d) obj).f39861a);
        }

        public int hashCode() {
            return this.f39861a.hashCode();
        }

        public String toString() {
            return "UpdateFail(error=" + this.f39861a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends f {

        /* renamed from: b  reason: collision with root package name */
        public static final int f39862b = FavoriteLiveSetting.$stable;

        /* renamed from: a  reason: collision with root package name */
        public final FavoriteLiveSetting f39863a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(FavoriteLiveSetting favoriteLiveSetting) {
            super(null);
            jo.p.h(favoriteLiveSetting, "item");
            this.f39863a = favoriteLiveSetting;
        }

        public final FavoriteLiveSetting a() {
            return this.f39863a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && jo.p.c(this.f39863a, ((e) obj).f39863a);
        }

        public int hashCode() {
            return this.f39863a.hashCode();
        }

        public String toString() {
            return "UpdateFinish(item=" + this.f39863a + ')';
        }
    }

    /* renamed from: lc.f$f  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0574f extends f {

        /* renamed from: a  reason: collision with root package name */
        public static final C0574f f39864a = new C0574f();

        public C0574f() {
            super(null);
        }
    }

    public f() {
    }

    public /* synthetic */ f(jo.h hVar) {
        this();
    }
}
