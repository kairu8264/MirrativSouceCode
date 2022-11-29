package l3;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import l3.f;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Comparator<byte[]> f39511a = new a();

    /* loaded from: classes.dex */
    public class a implements Comparator<byte[]> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            int i10;
            int i11;
            if (bArr.length != bArr2.length) {
                i10 = bArr.length;
                i11 = bArr2.length;
            } else {
                for (int i12 = 0; i12 < bArr.length; i12++) {
                    if (bArr[i12] != bArr2[i12]) {
                        i10 = bArr[i12];
                        i11 = bArr2[i12];
                    }
                }
                return 0;
            }
            return i10 - i11;
        }
    }

    public static List<byte[]> a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    public static boolean b(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static List<List<byte[]>> c(d dVar, Resources resources) {
        if (dVar.b() != null) {
            return dVar.b();
        }
        return e3.e.c(resources, dVar.c());
    }

    public static f.a d(Context context, d dVar, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo e10 = e(context.getPackageManager(), dVar, context.getResources());
        if (e10 == null) {
            return f.a.a(1, null);
        }
        return f.a.a(0, f(context, dVar, e10.authority, cancellationSignal));
    }

    public static ProviderInfo e(PackageManager packageManager, d dVar, Resources resources) throws PackageManager.NameNotFoundException {
        String e10 = dVar.e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e10, 0);
        if (resolveContentProvider != null) {
            if (resolveContentProvider.packageName.equals(dVar.f())) {
                List<byte[]> a10 = a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
                Collections.sort(a10, f39511a);
                List<List<byte[]>> c10 = c(dVar, resources);
                for (int i10 = 0; i10 < c10.size(); i10++) {
                    ArrayList arrayList = new ArrayList(c10.get(i10));
                    Collections.sort(arrayList, f39511a);
                    if (b(a10, arrayList)) {
                        return resolveContentProvider;
                    }
                }
                return null;
            }
            throw new PackageManager.NameNotFoundException("Found content provider " + e10 + ", but package was not " + dVar.f());
        }
        throw new PackageManager.NameNotFoundException("No package found for authority: " + e10);
    }

    public static f.b[] f(Context context, d dVar, String str, CancellationSignal cancellationSignal) {
        int i10;
        Uri withAppendedId;
        boolean z10;
        int i11;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            int i12 = 0;
            if (Build.VERSION.SDK_INT > 16) {
                cursor = context.getContentResolver().query(build, strArr, "query = ?", new String[]{dVar.g()}, null, cancellationSignal);
            } else {
                cursor = context.getContentResolver().query(build, strArr, "query = ?", new String[]{dVar.g()}, null);
            }
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i13 = columnIndex != -1 ? cursor.getInt(columnIndex) : i12;
                    int i14 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : i12;
                    if (columnIndex3 == -1) {
                        i10 = i13;
                        withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        i10 = i13;
                        withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    int i15 = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400;
                    if (columnIndex6 == -1 || cursor.getInt(columnIndex6) != 1) {
                        z10 = false;
                        i11 = i10;
                    } else {
                        i11 = i10;
                        z10 = true;
                    }
                    arrayList2.add(f.b.a(withAppendedId, i14, i15, z10, i11));
                    i12 = 0;
                }
                arrayList = arrayList2;
            }
            return (f.b[]) arrayList.toArray(new f.b[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
