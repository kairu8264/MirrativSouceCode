package ai;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.zzggm;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class rx1 {
    public static ArrayList<aq> a(SQLiteDatabase sQLiteDatabase) {
        ArrayList<aq> arrayList = new ArrayList<>();
        Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(aq.K(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (zzggm e10) {
                uj0.c("Unable to deserialize proto from offline signals database:");
                uj0.c(e10.getMessage());
            }
        }
        query.close();
        return arrayList;
    }

    public static int b(SQLiteDatabase sQLiteDatabase, int i10) {
        int i11;
        Cursor d10 = d(sQLiteDatabase, i10);
        if (d10.getCount() > 0) {
            d10.moveToNext();
            i11 = d10.getInt(d10.getColumnIndexOrThrow("value"));
        } else {
            i11 = 0;
        }
        d10.close();
        return i11;
    }

    public static long c(SQLiteDatabase sQLiteDatabase, int i10) {
        long j10;
        Cursor d10 = d(sQLiteDatabase, 2);
        if (d10.getCount() > 0) {
            d10.moveToNext();
            j10 = d10.getLong(d10.getColumnIndexOrThrow("value"));
        } else {
            j10 = 0;
        }
        d10.close();
        return j10;
    }

    public static Cursor d(SQLiteDatabase sQLiteDatabase, int i10) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i10 == 0) {
            strArr2[0] = "failed_requests";
        } else if (i10 != 1) {
            strArr2[0] = "last_successful_request_time";
        } else {
            strArr2[0] = "total_requests";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }
}
