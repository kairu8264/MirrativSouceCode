package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.RibbonResponse;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class r0 {

    /* loaded from: classes2.dex */
    public static final class a extends r0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f47214a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(null);
            jo.p.h(str, "birthday");
            this.f47214a = str;
        }

        public final String a() {
            return this.f47214a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f47214a, ((a) obj).f47214a);
        }

        public int hashCode() {
            return this.f47214a.hashCode();
        }

        public String toString() {
            return "BirthdayChanged(birthday=" + this.f47214a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends r0 {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f47215a;

        public b(boolean z10) {
            super(null);
            this.f47215a = z10;
        }

        public final boolean a() {
            return this.f47215a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f47215a == ((b) obj).f47215a;
        }

        public int hashCode() {
            boolean z10 = this.f47215a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "BirthdayVisibleChanged(isVisible=" + this.f47215a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends r0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f47216a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(null);
            jo.p.h(str, MRLog.PAYLOAD_KEY_DESCRIPTION);
            this.f47216a = str;
        }

        public final String a() {
            return this.f47216a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f47216a, ((c) obj).f47216a);
        }

        public int hashCode() {
            return this.f47216a.hashCode();
        }

        public String toString() {
            return "DescriptionChanged(description=" + this.f47216a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends r0 {

        /* renamed from: a  reason: collision with root package name */
        public final List<RibbonResponse> f47217a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<RibbonResponse> list) {
            super(null);
            jo.p.h(list, "ribbons");
            this.f47217a = list;
        }

        public final List<RibbonResponse> a() {
            return this.f47217a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && jo.p.c(this.f47217a, ((d) obj).f47217a);
        }

        public int hashCode() {
            return this.f47217a.hashCode();
        }

        public String toString() {
            return "Initialized(ribbons=" + this.f47217a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends r0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f47218a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(null);
            jo.p.h(str, "name");
            this.f47218a = str;
        }

        public final String a() {
            return this.f47218a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && jo.p.c(this.f47218a, ((e) obj).f47218a);
        }

        public int hashCode() {
            return this.f47218a.hashCode();
        }

        public String toString() {
            return "NameChanged(name=" + this.f47218a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends r0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47219a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47219a = mRError;
        }

        public final MRError a() {
            return this.f47219a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && jo.p.c(this.f47219a, ((f) obj).f47219a);
        }

        public int hashCode() {
            return this.f47219a.hashCode();
        }

        public String toString() {
            return "PostUserProfileFailed(error=" + this.f47219a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends r0 {

        /* renamed from: a  reason: collision with root package name */
        public static final g f47220a = new g();

        public g() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends r0 {

        /* renamed from: a  reason: collision with root package name */
        public static final h f47221a = new h();

        public h() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends r0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f47222a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(null);
            jo.p.h(str, "profileImageUrl");
            this.f47222a = str;
        }

        public final String a() {
            return this.f47222a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && jo.p.c(this.f47222a, ((i) obj).f47222a);
        }

        public int hashCode() {
            return this.f47222a.hashCode();
        }

        public String toString() {
            return "ProfileImageUrlChanged(profileImageUrl=" + this.f47222a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends r0 {

        /* renamed from: a  reason: collision with root package name */
        public final int f47223a;

        public j(int i10) {
            super(null);
            this.f47223a = i10;
        }

        public final int a() {
            return this.f47223a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f47223a == ((j) obj).f47223a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f47223a);
        }

        public String toString() {
            return "SelectedRibbonChanged(selectedRibbonId=" + this.f47223a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends r0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f47224a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str) {
            super(null);
            jo.p.h(str, "url");
            this.f47224a = str;
        }

        public final String a() {
            return this.f47224a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && jo.p.c(this.f47224a, ((k) obj).f47224a);
        }

        public int hashCode() {
            return this.f47224a.hashCode();
        }

        public String toString() {
            return "UrlChanged(url=" + this.f47224a + ')';
        }
    }

    public r0() {
    }

    public /* synthetic */ r0(jo.h hVar) {
        this();
    }
}
