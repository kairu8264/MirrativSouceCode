package rh;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes3.dex */
public final class x0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f51522a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f51523b;

    /* renamed from: c  reason: collision with root package name */
    public static String f51524c;

    /* renamed from: d  reason: collision with root package name */
    public static int f51525d;

    public static int a(Context context) {
        b(context);
        return f51525d;
    }

    public static void b(Context context) {
        Bundle bundle;
        synchronized (f51522a) {
            if (f51523b) {
                return;
            }
            f51523b = true;
            try {
                bundle = xh.c.a(context).c(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf("MetadataValueReader", "This should never happen.", e10);
            }
            if (bundle == null) {
                return;
            }
            f51524c = bundle.getString("com.google.app.id");
            f51525d = bundle.getInt("com.google.android.gms.version");
        }
    }
}
