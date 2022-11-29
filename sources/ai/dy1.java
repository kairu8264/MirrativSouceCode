package ai;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes3.dex */
public final class dy1 implements e43<SQLiteDatabase> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ fp2 f3452a;

    public dy1(ey1 ey1Var, fp2 fp2Var) {
        this.f3452a = fp2Var;
    }

    @Override // ai.e43
    public final void a(Throwable th2) {
        String valueOf = String.valueOf(th2.getMessage());
        uj0.c(valueOf.length() != 0 ? "Failed to get offline buffered ping database: ".concat(valueOf) : new String("Failed to get offline buffered ping database: "));
    }

    @Override // ai.e43
    public final /* bridge */ /* synthetic */ void b(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f3452a.a(sQLiteDatabase);
        } catch (Exception e10) {
            String valueOf = String.valueOf(e10.getMessage());
            uj0.c(valueOf.length() != 0 ? "Error executing function on offline buffered ping database: ".concat(valueOf) : new String("Error executing function on offline buffered ping database: "));
        }
    }
}
