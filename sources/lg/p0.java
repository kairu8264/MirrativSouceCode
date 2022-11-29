package lg;

import android.database.sqlite.SQLiteDatabase;
import lg.t0;

/* loaded from: classes4.dex */
public final /* synthetic */ class p0 implements t0.a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ p0 f40194a = new p0();

    @Override // lg.t0.a
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
