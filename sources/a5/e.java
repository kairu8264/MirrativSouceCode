package a5;

import android.database.sqlite.SQLiteStatement;
import z4.k;

/* loaded from: classes.dex */
public class e extends d implements k {

    /* renamed from: x  reason: collision with root package name */
    public final SQLiteStatement f468x;

    public e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f468x = sQLiteStatement;
    }

    @Override // z4.k
    public int D() {
        return this.f468x.executeUpdateDelete();
    }

    @Override // z4.k
    public long K0() {
        return this.f468x.executeInsert();
    }
}
