package z4;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public interface h extends Closeable {

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f62505a;

        public a(int i10) {
            this.f62505a = i10;
        }

        public final void a(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                if (Build.VERSION.SDK_INT >= 16) {
                    z4.b.a(new File(str));
                } else {
                    try {
                        if (!new File(str).delete()) {
                            Log.e("SupportSQLite", "Could not delete the database file " + str);
                        }
                    } catch (Exception e10) {
                        Log.e("SupportSQLite", "error while deleting corrupted database file", e10);
                    }
                }
            } catch (Exception e11) {
                Log.w("SupportSQLite", "delete failed: ", e11);
            }
        }

        public void b(g gVar) {
        }

        public void c(g gVar) {
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + gVar.getPath());
            if (!gVar.isOpen()) {
                a(gVar.getPath());
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = gVar.y();
                } finally {
                    if (list != null) {
                        for (Pair<String, String> next : list) {
                            a((String) next.second);
                        }
                    } else {
                        a(gVar.getPath());
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                gVar.close();
            } catch (IOException unused2) {
            }
        }

        public abstract void d(g gVar);

        public void e(g gVar, int i10, int i11) {
            throw new SQLiteException("Can't downgrade database from version " + i10 + " to " + i11);
        }

        public void f(g gVar) {
        }

        public abstract void g(g gVar, int i10, int i11);
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f62506a;

        /* renamed from: b  reason: collision with root package name */
        public final String f62507b;

        /* renamed from: c  reason: collision with root package name */
        public final a f62508c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f62509d;

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public Context f62510a;

            /* renamed from: b  reason: collision with root package name */
            public String f62511b;

            /* renamed from: c  reason: collision with root package name */
            public a f62512c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f62513d;

            public a(Context context) {
                this.f62510a = context;
            }

            public b a() {
                if (this.f62512c != null) {
                    if (this.f62510a != null) {
                        if (this.f62513d && TextUtils.isEmpty(this.f62511b)) {
                            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                        }
                        return new b(this.f62510a, this.f62511b, this.f62512c, this.f62513d);
                    }
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                throw new IllegalArgumentException("Must set a callback to create the configuration.");
            }

            public a b(a aVar) {
                this.f62512c = aVar;
                return this;
            }

            public a c(String str) {
                this.f62511b = str;
                return this;
            }

            public a d(boolean z10) {
                this.f62513d = z10;
                return this;
            }
        }

        public b(Context context, String str, a aVar, boolean z10) {
            this.f62506a = context;
            this.f62507b = str;
            this.f62508c = aVar;
            this.f62509d = z10;
        }

        public static a a(Context context) {
            return new a(context);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        h a(b bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    g getReadableDatabase();

    g getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z10);
}
