package jf;

/* loaded from: classes2.dex */
public abstract class t0 {

    /* loaded from: classes2.dex */
    public static abstract class a extends t0 {

        /* renamed from: jf.t0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0528a extends a {

            /* renamed from: a  reason: collision with root package name */
            public final String f37993a;

            /* renamed from: b  reason: collision with root package name */
            public final String f37994b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0528a(String str, String str2) {
                super(null);
                jo.p.h(str, "referer");
                jo.p.h(str2, "twitterUserName");
                this.f37993a = str;
                this.f37994b = str2;
            }

            public final String a() {
                return this.f37993a;
            }

            public final String b() {
                return this.f37994b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C0528a) {
                    C0528a c0528a = (C0528a) obj;
                    return jo.p.c(this.f37993a, c0528a.f37993a) && jo.p.c(this.f37994b, c0528a.f37994b);
                }
                return false;
            }

            public int hashCode() {
                return (this.f37993a.hashCode() * 31) + this.f37994b.hashCode();
            }

            public String toString() {
                return "EncourageFollowingMirrativTwitter(referer=" + this.f37993a + ", twitterUserName=" + this.f37994b + ')';
            }
        }

        /* loaded from: classes2.dex */
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f37995a = new b();

            public b() {
                super(null);
            }
        }

        /* loaded from: classes2.dex */
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            public final String f37996a;

            /* renamed from: b  reason: collision with root package name */
            public final String f37997b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, String str2) {
                super(null);
                jo.p.h(str, "authToken");
                jo.p.h(str2, "secret");
                this.f37996a = str;
                this.f37997b = str2;
            }

            public final String a() {
                return this.f37996a;
            }

            public final String b() {
                return this.f37997b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    return jo.p.c(this.f37996a, cVar.f37996a) && jo.p.c(this.f37997b, cVar.f37997b);
                }
                return false;
            }

            public int hashCode() {
                return (this.f37996a.hashCode() * 31) + this.f37997b.hashCode();
            }

            public String toString() {
                return "HandoverCodeRequired(authToken=" + this.f37996a + ", secret=" + this.f37997b + ')';
            }
        }

        public a() {
            super(null);
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends t0 {

        /* renamed from: a  reason: collision with root package name */
        public static final b f37998a = new b();

        public b() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class c extends t0 {

        /* loaded from: classes2.dex */
        public static final class a extends c {

            /* renamed from: a  reason: collision with root package name */
            public final String f37999a;

            public final String a() {
                return this.f37999a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && jo.p.c(this.f37999a, ((a) obj).f37999a);
            }

            public int hashCode() {
                return this.f37999a.hashCode();
            }

            public String toString() {
                return "CustomMessage(message=" + this.f37999a + ')';
            }
        }
    }

    public t0() {
    }

    public /* synthetic */ t0(jo.h hVar) {
        this();
    }
}
