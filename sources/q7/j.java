package q7;

import i8.k;
import j8.a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public final i8.g<m7.e, String> f48780a = new i8.g<>(1000);

    /* renamed from: b  reason: collision with root package name */
    public final n3.e<b> f48781b = j8.a.d(10, new a());

    /* loaded from: classes.dex */
    public class a implements a.d<b> {
        public a() {
        }

        @Override // j8.a.d
        /* renamed from: a */
        public b create() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements a.f {

        /* renamed from: w  reason: collision with root package name */
        public final MessageDigest f48783w;

        /* renamed from: x  reason: collision with root package name */
        public final j8.c f48784x = j8.c.a();

        public b(MessageDigest messageDigest) {
            this.f48783w = messageDigest;
        }

        @Override // j8.a.f
        public j8.c e() {
            return this.f48784x;
        }
    }

    public final String a(m7.e eVar) {
        b bVar = (b) i8.j.d(this.f48781b.acquire());
        try {
            eVar.a(bVar.f48783w);
            return k.x(bVar.f48783w.digest());
        } finally {
            this.f48781b.a(bVar);
        }
    }

    public String b(m7.e eVar) {
        String g10;
        synchronized (this.f48780a) {
            g10 = this.f48780a.g(eVar);
        }
        if (g10 == null) {
            g10 = a(eVar);
        }
        synchronized (this.f48780a) {
            this.f48780a.k(eVar, g10);
        }
        return g10;
    }
}
