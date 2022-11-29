package z4;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* loaded from: classes.dex */
public interface g extends Closeable {
    void B(String str) throws SQLException;

    boolean C1();

    boolean J1();

    Cursor Q0(String str, Object[] objArr);

    void T();

    void V(String str, Object[] objArr) throws SQLException;

    void W();

    k X0(String str);

    void e0();

    String getPath();

    int h1(String str, int i10, ContentValues contentValues, String str2, Object[] objArr);

    boolean isOpen();

    Cursor j0(j jVar);

    Cursor m0(j jVar, CancellationSignal cancellationSignal);

    Cursor p1(String str);

    int r(String str, String str2, Object[] objArr);

    long r1(String str, int i10, ContentValues contentValues) throws SQLException;

    void s();

    List<Pair<String, String>> y();
}
