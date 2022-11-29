package v4;

import android.database.Cursor;
import java.util.List;
import z4.h;

/* loaded from: classes.dex */
public class s0 extends h.a {

    /* renamed from: b  reason: collision with root package name */
    public q f56710b;

    /* renamed from: c  reason: collision with root package name */
    public final a f56711c;

    /* renamed from: d  reason: collision with root package name */
    public final String f56712d;

    /* renamed from: e  reason: collision with root package name */
    public final String f56713e;

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f56714a;

        public a(int i10) {
            this.f56714a = i10;
        }

        public abstract void a(z4.g gVar);

        public abstract void b(z4.g gVar);

        public abstract void c(z4.g gVar);

        public abstract void d(z4.g gVar);

        public abstract void e(z4.g gVar);

        public abstract void f(z4.g gVar);

        public abstract b g(z4.g gVar);
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f56715a;

        /* renamed from: b  reason: collision with root package name */
        public final String f56716b;

        public b(boolean z10, String str) {
            this.f56715a = z10;
            this.f56716b = str;
        }
    }

    public s0(q qVar, a aVar, String str, String str2) {
        super(aVar.f56714a);
        this.f56710b = qVar;
        this.f56711c = aVar;
        this.f56712d = str;
        this.f56713e = str2;
    }

    public static boolean j(z4.g gVar) {
        Cursor p12 = gVar.p1("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z10 = false;
            if (p12.moveToFirst()) {
                if (p12.getInt(0) == 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            p12.close();
        }
    }

    public static boolean k(z4.g gVar) {
        Cursor p12 = gVar.p1("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z10 = false;
            if (p12.moveToFirst()) {
                if (p12.getInt(0) != 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            p12.close();
        }
    }

    @Override // z4.h.a
    public void b(z4.g gVar) {
        super.b(gVar);
    }

    @Override // z4.h.a
    public void d(z4.g gVar) {
        boolean j10 = j(gVar);
        this.f56711c.a(gVar);
        if (!j10) {
            b g10 = this.f56711c.g(gVar);
            if (!g10.f56715a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g10.f56716b);
            }
        }
        l(gVar);
        this.f56711c.c(gVar);
    }

    @Override // z4.h.a
    public void e(z4.g gVar, int i10, int i11) {
        g(gVar, i10, i11);
    }

    @Override // z4.h.a
    public void f(z4.g gVar) {
        super.f(gVar);
        h(gVar);
        this.f56711c.d(gVar);
        this.f56710b = null;
    }

    @Override // z4.h.a
    public void g(z4.g gVar, int i10, int i11) {
        boolean z10;
        List<w4.b> c10;
        q qVar = this.f56710b;
        if (qVar == null || (c10 = qVar.f56653d.c(i10, i11)) == null) {
            z10 = false;
        } else {
            this.f56711c.f(gVar);
            for (w4.b bVar : c10) {
                bVar.a(gVar);
            }
            b g10 = this.f56711c.g(gVar);
            if (g10.f56715a) {
                this.f56711c.e(gVar);
                l(gVar);
                z10 = true;
            } else {
                throw new IllegalStateException("Migration didn't properly handle: " + g10.f56716b);
            }
        }
        if (z10) {
            return;
        }
        q qVar2 = this.f56710b;
        if (qVar2 != null && !qVar2.a(i10, i11)) {
            this.f56711c.b(gVar);
            this.f56711c.a(gVar);
            return;
        }
        throw new IllegalStateException("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    public final void h(z4.g gVar) {
        if (k(gVar)) {
            Cursor j02 = gVar.j0(new z4.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                String string = j02.moveToFirst() ? j02.getString(0) : null;
                j02.close();
                if (!this.f56712d.equals(string) && !this.f56713e.equals(string)) {
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                }
                return;
            } catch (Throwable th2) {
                j02.close();
                throw th2;
            }
        }
        b g10 = this.f56711c.g(gVar);
        if (g10.f56715a) {
            this.f56711c.e(gVar);
            l(gVar);
            return;
        }
        throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g10.f56716b);
    }

    public final void i(z4.g gVar) {
        gVar.B("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    public final void l(z4.g gVar) {
        i(gVar);
        gVar.B(r0.a(this.f56712d));
    }
}
