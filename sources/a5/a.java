package a5;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.util.List;
import z4.g;
import z4.j;
import z4.k;

/* loaded from: classes.dex */
public class a implements g {

    /* renamed from: x  reason: collision with root package name */
    public static final String[] f451x = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: y  reason: collision with root package name */
    public static final String[] f452y = new String[0];

    /* renamed from: w  reason: collision with root package name */
    public final SQLiteDatabase f453w;

    /* renamed from: a5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0005a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j f454a;

        public C0005a(j jVar) {
            this.f454a = jVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f454a.c(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* loaded from: classes.dex */
    public class b implements SQLiteDatabase.CursorFactory {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j f456a;

        public b(j jVar) {
            this.f456a = jVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f456a.c(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public a(SQLiteDatabase sQLiteDatabase) {
        this.f453w = sQLiteDatabase;
    }

    @Override // z4.g
    public void B(String str) throws SQLException {
        this.f453w.execSQL(str);
    }

    @Override // z4.g
    public boolean C1() {
        return this.f453w.inTransaction();
    }

    @Override // z4.g
    public boolean J1() {
        return z4.b.b(this.f453w);
    }

    @Override // z4.g
    public Cursor Q0(String str, Object[] objArr) {
        return j0(new z4.a(str, objArr));
    }

    @Override // z4.g
    public void T() {
        this.f453w.setTransactionSuccessful();
    }

    @Override // z4.g
    public void V(String str, Object[] objArr) throws SQLException {
        this.f453w.execSQL(str, objArr);
    }

    @Override // z4.g
    public void W() {
        this.f453w.beginTransactionNonExclusive();
    }

    @Override // z4.g
    public k X0(String str) {
        return new e(this.f453w.compileStatement(str));
    }

    public boolean a(SQLiteDatabase sQLiteDatabase) {
        return this.f453w == sQLiteDatabase;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f453w.close();
    }

    @Override // z4.g
    public void e0() {
        this.f453w.endTransaction();
    }

    @Override // z4.g
    public String getPath() {
        return this.f453w.getPath();
    }

    @Override // z4.g
    public int h1(String str, int i10, ContentValues contentValues, String str2, Object[] objArr) {
        if (contentValues != null && contentValues.size() != 0) {
            StringBuilder sb2 = new StringBuilder(120);
            sb2.append("UPDATE ");
            sb2.append(f451x[i10]);
            sb2.append(str);
            sb2.append(" SET ");
            int size = contentValues.size();
            int length = objArr == null ? size : objArr.length + size;
            Object[] objArr2 = new Object[length];
            int i11 = 0;
            for (String str3 : contentValues.keySet()) {
                sb2.append(i11 > 0 ? "," : "");
                sb2.append(str3);
                objArr2[i11] = contentValues.get(str3);
                sb2.append("=?");
                i11++;
            }
            if (objArr != null) {
                for (int i12 = size; i12 < length; i12++) {
                    objArr2[i12] = objArr[i12 - size];
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                sb2.append(" WHERE ");
                sb2.append(str2);
            }
            k X0 = X0(sb2.toString());
            z4.a.d(X0, objArr2);
            return X0.D();
        }
        throw new IllegalArgumentException("Empty values");
    }

    @Override // z4.g
    public boolean isOpen() {
        return this.f453w.isOpen();
    }

    @Override // z4.g
    public Cursor j0(j jVar) {
        return this.f453w.rawQueryWithFactory(new C0005a(jVar), jVar.a(), f452y, null);
    }

    @Override // z4.g
    public Cursor m0(j jVar, CancellationSignal cancellationSignal) {
        return z4.b.c(this.f453w, jVar.a(), f452y, null, cancellationSignal, new b(jVar));
    }

    @Override // z4.g
    public Cursor p1(String str) {
        return j0(new z4.a(str));
    }

    @Override // z4.g
    public int r(String str, String str2, Object[] objArr) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DELETE FROM ");
        sb2.append(str);
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = " WHERE " + str2;
        }
        sb2.append(str3);
        k X0 = X0(sb2.toString());
        z4.a.d(X0, objArr);
        return X0.D();
    }

    @Override // z4.g
    public long r1(String str, int i10, ContentValues contentValues) throws SQLException {
        return this.f453w.insertWithOnConflict(str, null, contentValues, i10);
    }

    @Override // z4.g
    public void s() {
        this.f453w.beginTransaction();
    }

    @Override // z4.g
    public List<Pair<String, String>> y() {
        return this.f453w.getAttachedDbs();
    }
}
