package o7;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f44185a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final j f44186b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final j f44187c = new c();

    /* renamed from: d  reason: collision with root package name */
    public static final j f44188d = new d();

    /* renamed from: e  reason: collision with root package name */
    public static final j f44189e = new e();

    /* loaded from: classes.dex */
    public class a extends j {
        @Override // o7.j
        public boolean a() {
            return true;
        }

        @Override // o7.j
        public boolean b() {
            return true;
        }

        @Override // o7.j
        public boolean c(m7.a aVar) {
            return aVar == m7.a.REMOTE;
        }

        @Override // o7.j
        public boolean d(boolean z10, m7.a aVar, m7.c cVar) {
            return (aVar == m7.a.RESOURCE_DISK_CACHE || aVar == m7.a.MEMORY_CACHE) ? false : true;
        }
    }

    /* loaded from: classes.dex */
    public class b extends j {
        @Override // o7.j
        public boolean a() {
            return false;
        }

        @Override // o7.j
        public boolean b() {
            return false;
        }

        @Override // o7.j
        public boolean c(m7.a aVar) {
            return false;
        }

        @Override // o7.j
        public boolean d(boolean z10, m7.a aVar, m7.c cVar) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class c extends j {
        @Override // o7.j
        public boolean a() {
            return true;
        }

        @Override // o7.j
        public boolean b() {
            return false;
        }

        @Override // o7.j
        public boolean c(m7.a aVar) {
            return (aVar == m7.a.DATA_DISK_CACHE || aVar == m7.a.MEMORY_CACHE) ? false : true;
        }

        @Override // o7.j
        public boolean d(boolean z10, m7.a aVar, m7.c cVar) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class d extends j {
        @Override // o7.j
        public boolean a() {
            return false;
        }

        @Override // o7.j
        public boolean b() {
            return true;
        }

        @Override // o7.j
        public boolean c(m7.a aVar) {
            return false;
        }

        @Override // o7.j
        public boolean d(boolean z10, m7.a aVar, m7.c cVar) {
            return (aVar == m7.a.RESOURCE_DISK_CACHE || aVar == m7.a.MEMORY_CACHE) ? false : true;
        }
    }

    /* loaded from: classes.dex */
    public class e extends j {
        @Override // o7.j
        public boolean a() {
            return true;
        }

        @Override // o7.j
        public boolean b() {
            return true;
        }

        @Override // o7.j
        public boolean c(m7.a aVar) {
            return aVar == m7.a.REMOTE;
        }

        @Override // o7.j
        public boolean d(boolean z10, m7.a aVar, m7.c cVar) {
            return ((z10 && aVar == m7.a.DATA_DISK_CACHE) || aVar == m7.a.LOCAL) && cVar == m7.c.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(m7.a aVar);

    public abstract boolean d(boolean z10, m7.a aVar, m7.c cVar);
}
