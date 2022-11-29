package w6;

import jo.p;

/* loaded from: classes.dex */
public interface k {

    /* loaded from: classes.dex */
    public static final class a implements k {

        /* renamed from: a  reason: collision with root package name */
        public final String f58177a;

        public /* synthetic */ a(String str) {
            this.f58177a = str;
        }

        public static final /* synthetic */ a a(String str) {
            return new a(str);
        }

        public static String b(String str) {
            p.h(str, "assetName");
            return str;
        }

        public static boolean c(String str, Object obj) {
            return (obj instanceof a) && p.c(str, ((a) obj).f());
        }

        public static int d(String str) {
            return str.hashCode();
        }

        public static String e(String str) {
            return "Asset(assetName=" + str + ')';
        }

        public boolean equals(Object obj) {
            return c(this.f58177a, obj);
        }

        public final /* synthetic */ String f() {
            return this.f58177a;
        }

        public int hashCode() {
            return d(this.f58177a);
        }

        public String toString() {
            return e(this.f58177a);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements k {

        /* renamed from: a  reason: collision with root package name */
        public final String f58178a;

        public static boolean a(String str, Object obj) {
            return (obj instanceof b) && p.c(str, ((b) obj).d());
        }

        public static int b(String str) {
            return str.hashCode();
        }

        public static String c(String str) {
            return "File(fileName=" + str + ')';
        }

        public final /* synthetic */ String d() {
            return this.f58178a;
        }

        public boolean equals(Object obj) {
            return a(this.f58178a, obj);
        }

        public int hashCode() {
            return b(this.f58178a);
        }

        public String toString() {
            return c(this.f58178a);
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements k {

        /* renamed from: a  reason: collision with root package name */
        public final String f58179a;

        public static boolean a(String str, Object obj) {
            return (obj instanceof c) && p.c(str, ((c) obj).d());
        }

        public static int b(String str) {
            return str.hashCode();
        }

        public static String c(String str) {
            return "JsonString(jsonString=" + str + ')';
        }

        public final /* synthetic */ String d() {
            return this.f58179a;
        }

        public boolean equals(Object obj) {
            return a(this.f58179a, obj);
        }

        public int hashCode() {
            return b(this.f58179a);
        }

        public String toString() {
            return c(this.f58179a);
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements k {

        /* renamed from: a  reason: collision with root package name */
        public final int f58180a;

        public static boolean a(int i10, Object obj) {
            return (obj instanceof d) && i10 == ((d) obj).d();
        }

        public static int b(int i10) {
            return Integer.hashCode(i10);
        }

        public static String c(int i10) {
            return "RawRes(resId=" + i10 + ')';
        }

        public final /* synthetic */ int d() {
            return this.f58180a;
        }

        public boolean equals(Object obj) {
            return a(this.f58180a, obj);
        }

        public int hashCode() {
            return b(this.f58180a);
        }

        public String toString() {
            return c(this.f58180a);
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements k {

        /* renamed from: a  reason: collision with root package name */
        public final String f58181a;

        public static boolean a(String str, Object obj) {
            return (obj instanceof e) && p.c(str, ((e) obj).d());
        }

        public static int b(String str) {
            return str.hashCode();
        }

        public static String c(String str) {
            return "Url(url=" + str + ')';
        }

        public final /* synthetic */ String d() {
            return this.f58181a;
        }

        public boolean equals(Object obj) {
            return a(this.f58181a, obj);
        }

        public int hashCode() {
            return b(this.f58181a);
        }

        public String toString() {
            return c(this.f58181a);
        }
    }
}
