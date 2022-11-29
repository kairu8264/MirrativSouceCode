package ai;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;

/* loaded from: classes3.dex */
public final class rw2 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f9611a;

    /* renamed from: b  reason: collision with root package name */
    public static final ClipData f9612b;

    static {
        f9611a = Build.VERSION.SDK_INT > 22 ? 67108864 : 0;
        f9612b = ClipData.newIntent("", new Intent());
    }

    public static PendingIntent a(Context context, int i10, Intent intent, int i11, int i12) {
        boolean z10 = true;
        lx2.a((i11 & 95) == 0, "Cannot set any dangerous parts of intent to be mutable.");
        lx2.a(intent.getComponent() != null, "Must set component on Intent.");
        if (b(0, 1)) {
            lx2.a(!b(i11, 67108864), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            if (Build.VERSION.SDK_INT >= 23 && !b(i11, 67108864)) {
                z10 = false;
            }
            lx2.a(z10, "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (Build.VERSION.SDK_INT < 23 || !b(i11, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!b(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!b(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!b(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!b(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(f9612b);
            }
        }
        return PendingIntent.getService(context, 0, intent2, i11);
    }

    public static boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
