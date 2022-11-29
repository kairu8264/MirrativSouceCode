package a5;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.io.File;
import z4.g;
import z4.h;

/* loaded from: classes.dex */
public class b implements h {
    public final Object A = new Object();
    public a B;
    public boolean C;

    /* renamed from: w  reason: collision with root package name */
    public final Context f458w;

    /* renamed from: x  reason: collision with root package name */
    public final String f459x;

    /* renamed from: y  reason: collision with root package name */
    public final h.a f460y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f461z;

    /* loaded from: classes.dex */
    public static class a extends SQLiteOpenHelper {

        /* renamed from: w  reason: collision with root package name */
        public final a5.a[] f462w;

        /* renamed from: x  reason: collision with root package name */
        public final h.a f463x;

        /* renamed from: y  reason: collision with root package name */
        public boolean f464y;

        /* renamed from: a5.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0006a implements DatabaseErrorHandler {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ h.a f465a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ a5.a[] f466b;

            public C0006a(h.a aVar, a5.a[] aVarArr) {
                this.f465a = aVar;
                this.f466b = aVarArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f465a.c(a.d(this.f466b, sQLiteDatabase));
            }
        }

        public a(Context context, String str, a5.a[] aVarArr, h.a aVar) {
            super(context, str, null, aVar.f62505a, new C0006a(aVar, aVarArr));
            this.f463x = aVar;
            this.f462w = aVarArr;
        }

        public static a5.a d(a5.a[] aVarArr, SQLiteDatabase sQLiteDatabase) {
            a5.a aVar = aVarArr[0];
            if (aVar == null || !aVar.a(sQLiteDatabase)) {
                aVarArr[0] = new a5.a(sQLiteDatabase);
            }
            return aVarArr[0];
        }

        public synchronized g a() {
            this.f464y = false;
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            if (this.f464y) {
                close();
                return a();
            }
            return c(readableDatabase);
        }

        public a5.a c(SQLiteDatabase sQLiteDatabase) {
            return d(this.f462w, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.f462w[0] = null;
        }

        public synchronized g e() {
            this.f464y = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.f464y) {
                close();
                return e();
            }
            return c(writableDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f463x.b(c(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f463x.d(c(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f464y = true;
            this.f463x.e(c(sQLiteDatabase), i10, i11);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.f464y) {
                return;
            }
            this.f463x.f(c(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f464y = true;
            this.f463x.g(c(sQLiteDatabase), i10, i11);
        }
    }

    public b(Context context, String str, h.a aVar, boolean z10) {
        this.f458w = context;
        this.f459x = str;
        this.f460y = aVar;
        this.f461z = z10;
    }

    public final a a() {
        a aVar;
        synchronized (this.A) {
            if (this.B == null) {
                a5.a[] aVarArr = new a5.a[1];
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 23 && this.f459x != null && this.f461z) {
                    this.B = new a(this.f458w, new File(z4.d.a(this.f458w), this.f459x).getAbsolutePath(), aVarArr, this.f460y);
                } else {
                    this.B = new a(this.f458w, this.f459x, aVarArr, this.f460y);
                }
                if (i10 >= 16) {
                    z4.b.d(this.B, this.C);
                }
            }
            aVar = this.B;
        }
        return aVar;
    }

    @Override // z4.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a().close();
    }

    @Override // z4.h
    public String getDatabaseName() {
        return this.f459x;
    }

    @Override // z4.h
    public g getReadableDatabase() {
        return a().a();
    }

    @Override // z4.h
    public g getWritableDatabase() {
        return a().e();
    }

    @Override // z4.h
    public void setWriteAheadLoggingEnabled(boolean z10) {
        synchronized (this.A) {
            a aVar = this.B;
            if (aVar != null) {
                z4.b.d(aVar, z10);
            }
            this.C = z10;
        }
    }
}
