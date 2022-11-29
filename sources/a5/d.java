package a5;

import android.database.sqlite.SQLiteProgram;
import z4.i;

/* loaded from: classes.dex */
public class d implements i {

    /* renamed from: w  reason: collision with root package name */
    public final SQLiteProgram f467w;

    public d(SQLiteProgram sQLiteProgram) {
        this.f467w = sQLiteProgram;
    }

    @Override // z4.i
    public void J(int i10, double d10) {
        this.f467w.bindDouble(i10, d10);
    }

    @Override // z4.i
    public void S0(int i10, String str) {
        this.f467w.bindString(i10, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f467w.close();
    }

    @Override // z4.i
    public void g1(int i10, long j10) {
        this.f467w.bindLong(i10, j10);
    }

    @Override // z4.i
    public void l1(int i10, byte[] bArr) {
        this.f467w.bindBlob(i10, bArr);
    }

    @Override // z4.i
    public void y1(int i10) {
        this.f467w.bindNull(i10);
    }
}
